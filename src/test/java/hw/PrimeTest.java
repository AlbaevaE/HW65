package hw;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeTest {

    @Test
    public void findNthPrimeNumber() {
        Prime prime = new Prime();
        Integer methodOutput = prime.findPrimeNumber(100);
        Assert.assertEquals((Integer) 541, methodOutput);
        Assert.assertEquals((Integer) 104743, prime.findPrimeNumber(10001));
    }

    @Test
    public void isPrime() {
    }
}