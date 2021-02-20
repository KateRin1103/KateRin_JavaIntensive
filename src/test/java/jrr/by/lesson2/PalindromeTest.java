package jrr.by.lesson2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void isPalindrome1() {
        Palindrome palindrome = new Palindrome();
        boolean actual = palindrome.isPalindrome("1 23 32 1");
        assertTrue(actual);
    }

    @Test
    void isPalindrome2() {
        Palindrome palindrome = new Palindrome();
        boolean actual = palindrome.isPalindrome("1 23 321");
        assertFalse(actual);
    }

    @Test
    void isPalindrome3() {
        Palindrome palindrome = new Palindrome();
        boolean actual = palindrome.isPalindrome("AbcD dCBa");
        assertTrue(actual);
    }

}