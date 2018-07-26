import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBussTest {

    @Test
    public void oneReturnIsOne() {
            FizzBuzz fz = new FizzBuzz();
            String result = fz.sendAndReturn(1);
            assertEquals("1",result);
        
    }
    
    @Test
    public void twoReturnIsTwo() {
            FizzBuzz fz = new FizzBuzz();
            String result = fz.sendAndReturn(2);
            assertEquals("2",result);
        
    }
    
    @Test
    public void threeReturnIsFizz() {
            FizzBuzz fz = new FizzBuzz();
            String result = fz.sendAndReturn(3);
            assertEquals("Fizz",result);
        
    }
    
    @Test
    public void fourReturnIsFour() {
            FizzBuzz fz = new FizzBuzz();
            String result = fz.sendAndReturn(4);
            assertEquals("4",result);
        
    }
    
    @Test
    public void fiveReturnIsBuzz() {
            FizzBuzz fz = new FizzBuzz();
            String result = fz.sendAndReturn(5);
            assertEquals("Buzz",result);
        
    }
    
    @Test
    public void sixReturnIsFizz() {
            FizzBuzz fz = new FizzBuzz();
            String result = fz.sendAndReturn(6);
            assertEquals("Fizz",result);
        
    }
    
    @Test
    public void sevenReturnIsSeven() {
            FizzBuzz fz = new FizzBuzz();
            String result = fz.sendAndReturn(7);
            assertEquals("7",result);
        
    }
    
    @Test
    public void eightReturnIsEight() {
            FizzBuzz fz = new FizzBuzz();
            String result = fz.sendAndReturn(8);
            assertEquals("8",result);
        
    }
    
    @Test
    public void nineReturnIsFizz() {
            FizzBuzz fz = new FizzBuzz();
            String result = fz.sendAndReturn(9);
            assertEquals("Fizz",result);
        
    }
    
    @Test
    public void tenReturnIsBuzz() {
            FizzBuzz fz = new FizzBuzz();
            String result = fz.sendAndReturn(10);
            assertEquals("Buzz",result);
        
    }
    
    @Test
    public void elevenReturnIseleven() {
            FizzBuzz fz = new FizzBuzz();
            String result = fz.sendAndReturn(11);
            assertEquals("11",result);
        
    }
    
    @Test
    public void twelveReturnIsFizzTwelve() {
            FizzBuzz fz = new FizzBuzz();
            String result = fz.sendAndReturn(12);
            assertEquals("Fizz",result);
        
    }
    
    @Test
    public void thirteenReturnIsthirteen() {
            FizzBuzz fz = new FizzBuzz();
            String result = fz.sendAndReturn(13);
            assertEquals("13",result);
        
    }
    
    @Test
    public void fourteenReturnIsfourteen() {
            FizzBuzz fz = new FizzBuzz();
            String result = fz.sendAndReturn(14);
            assertEquals("14",result);
        
    }
    
    @Test
    public void fifteenReturnIsfifteen() {
            FizzBuzz fz = new FizzBuzz();
            String result = fz.sendAndReturn(15);
            assertEquals("FizzBuzz",result);
        
    }
    
    @Test
    public void sixteenReturnIszixteen() {
            FizzBuzz fz = new FizzBuzz();
            String result = fz.sendAndReturn(16);
            assertEquals("16",result);
        
    }

}
