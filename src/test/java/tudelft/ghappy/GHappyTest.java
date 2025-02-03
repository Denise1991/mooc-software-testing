package tudelft.ghappy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class GHappyTest {

    GHappy happygs = new GHappy();

    @ParameterizedTest
    @ValueSource(strings = {"xxggxx", "gg","gggg", "abcggdefgg"})
    void testHappyGS(String input){
        assertTrue(happygs.gHappy(input),"Expected happy 'g' cases to return true");
    }

    @ParameterizedTest
    @ValueSource(strings = {"xxgxx", "g", "ggvgug","gxyyxg"})
    void testUnHappyGS(String input){
        assertFalse(happygs.gHappy(input),"Expected unhappy 'g' cases to return false");
    }

    @ParameterizedTest
    @ValueSource(strings = {"klpmhj", "q", "uywp"})
    void testNoGS(String input){
        assertTrue(happygs.gHappy(input),"Expected no 'g' cases to return true");
    }

    @ParameterizedTest
    @ValueSource(strings = {""})
    void testNullGS(String input){
        assertTrue(happygs.gHappy(null),"Expected null to return false");
    }

    @ParameterizedTest
    @CsvSource({"ago, false", "bga, false", "g, false"})
    void testEdgeGS(String input, boolean expected){
        assertEquals(expected,happygs.gHappy(input),"Expected fail due to input " + input);
    }
}
