import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class GraphUnitTests {
	private ArrayList<Dice> diceList;
	private GameLogic logic;

    @Test
    public void testSingleKind() {
    	diceList = new ArrayList<>();
    	for(int i = 0; i<5; i++) {
    		diceList.add(new Dice());
            diceList.get(i).setValue(i+1);
    	}
       
        int scoreOfOne = logic.calculateScoreForCategory("Ones", diceList);
        assertEquals(1, scoreOfOne);
        int scoreOfTwo = logic.calculateScoreForCategory("Twos", diceList);
        assertEquals(2, scoreOfTwo);
        int scoreOfThree = logic.calculateScoreForCategory("Threes", diceList);
        assertEquals(3, scoreOfThree);
        int scoreOfFours = logic.calculateScoreForCategory("Fours", diceList);
        assertEquals(4, scoreOfFours);
        int scoreOfFive = logic.calculateScoreForCategory("Fives", diceList);
        assertEquals(5, scoreOfFive);
        int scoreOfSixes = logic.calculateScoreForCategory("Sixes", diceList);
        assertEquals(0, scoreOfSixes);
    }

    @Test
    public void testSumOfAKind() {
    	diceList = new ArrayList<>();
    	for(int i = 0; i<5; i++) {
    		diceList.add(new Dice());
            diceList.get(i).setValue(2);
    	}
        int score = logic.calcSumOfAKind(diceList, 2);
        assertEquals(10, score);
    }

    // Similarly, write tests for other categories

    @Test
    public void testInvalidCategory() {
    	diceList = new ArrayList<>();
    	for(int i = 0; i<5; i++) {
    		diceList.add(new Dice());
            diceList.get(i).setValue(2);
    	}
        int score = GameLogic.calculateScoreForCategory("Invalid Category", diceList);
        assertEquals(0, score);
    }
    
    @Test
    public void testCalcNumScoreOnes() {
    	diceList = new ArrayList<>();
    	for(int i = 0; i<5; i++) {
    		diceList.add(new Dice());
            diceList.get(i).setValue(i+1);
    	}
        int sum = GameLogic.calcNumScore(diceList, 1);
        assertEquals(1, sum);
    }

    @Test
    public void testCalcNumScoreTwos() {
    	diceList = new ArrayList<>();
    	for(int i = 0; i<5; i++) {
    		diceList.add(new Dice());
            diceList.get(i).setValue(i+1);
    	}
        int sum = GameLogic.calcNumScore(diceList, 2);
        assertEquals(2, sum);
    }

    // You can add more test cases for other numbers if necessary

    @Test
    public void testCalcNumScoreInvalidNumber() {
    	diceList = new ArrayList<>();
    	for(int i = 0; i<5; i++) {
    		diceList.add(new Dice());
            diceList.get(i).setValue(i+1);
    	}
        int sum = GameLogic.calcNumScore(diceList, 7);
        assertEquals(0, sum);
    }
    
   
    
    @Test
    public void testCalcSumOfAllDice() {
    	diceList = new ArrayList<>();
    	for(int i = 0; i<5; i++) {
    		diceList.add(new Dice());
            diceList.get(i).setValue(i+1);
    	}
        
        // Edge-pair coverage test cases
        assertEquals(0, GameLogic.calcSumOfAllDice(new ArrayList<>())); // empty dice list
        assertEquals(15, GameLogic.calcSumOfAllDice(diceList)); // typical sum of all dice
        
        // All-DU-Path coverage test cases
        assertEquals(0, GameLogic.calcSumOfAllDice(new ArrayList<>())); // empty dice list
        assertEquals(15, GameLogic.calcSumOfAllDice(diceList)); // typical sum of all dice
    }
    


}