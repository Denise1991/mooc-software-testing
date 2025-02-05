package tudelft.caesarshift;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CaesarShiftCipherTest {


    CaesarShiftCipher cipher = new CaesarShiftCipher(); //initialize the caesercipher class with the method


    @Test
    void testRegularShift(){
        assertEquals("def", cipher.CaesarShiftCipher("abc",3));
        assertEquals("bcd", cipher.CaesarShiftCipher("yza",3));
    }

    @Test
    void testWrapAround(){
        assertEquals("abc",cipher.CaesarShiftCipher("xyz", 3));
        assertEquals("bcd", cipher.CaesarShiftCipher("yza", 3));
    }

    @Test
    void testNegativeShift(){
        assertEquals("xyz", cipher.CaesarShiftCipher("abc", -3));
        assertEquals("uvw",cipher.CaesarShiftCipher("xyz", -3));
    }
    @Test
    void testNoShift(){
        assertEquals("abc", cipher.CaesarShiftCipher("abc", 0));
    }

    @Test
    void testInvalidEntries(){
        assertEquals("invalid",cipher.CaesarShiftCipher("abc123", 3));
        assertEquals("invalid", cipher.CaesarShiftCipher("test!", 3));
    }
}
