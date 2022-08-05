package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void evenOrderedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void missingClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[][]["));
    }

    @Test
    public void unorderedEvenBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][][]["));
    }

    @Test
    public void lettersWithinEvenBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[fnre], [ghiero], [rei]"));
    }

    @Test
    public void lettersSurroundingBalancedBracketsStillReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("fnekl[dsnkl], efwe[fds]"));
    }

    @Test
    public void balancedBracketsEqualsTrue() {
        assertEquals(true, (BalancedBrackets.hasBalancedBrackets("[]")));
    }

    @Test
    public void unbalancedBracketsReturnsFalse() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("[[["));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void unclosedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[nidsofnid"));
    }

    @Test
    public void singleBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(("[")));
    }

    @Test
    public void unorderedBracketsWithLettersReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("nffke]fef["));
    }

}
