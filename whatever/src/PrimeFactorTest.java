import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeFactorTest {

    @Test
    public void test2() {
        PrimeFactor p = new PrimeFactor();
        assertEquals("2",p.of(2));
        assertEquals("22",p.of(4));
        assertEquals("222",p.of(8));
    }
    
    @Test
    public void test3() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(3);
        assertEquals("3",result);
    }
    
    @Test
    public void test5() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(5);
        assertEquals("5",result);
    }

    
    @Test
    public void test6_23() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(6);
        assertEquals("23",result);
    }
    
    @Test
    public void test10_25() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(10);
        assertEquals("25",result);
    }
    
    @Test
    public void test12_223() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(12);
        assertEquals("223",result);
    }
 

}
