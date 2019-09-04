package no.kristiania.roman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanConverterTest {

    @Test
    void shouldReturnIBVfor4() {
        assertEquals("IV", RomanConverter.toRoman(4));
    }
    @Test
    void shouldReturnIXfor9() {
        assertEquals("IX", RomanConverter.toRoman(9));
    }

    @Test
    void shouldCalculateSimpleDigits(){
        assertEquals("MMMDCCCLXXXVIII",RomanConverter.toRoman( 3888));
    }
    @Test
    void shouldCalculateFourlikeDigits(){
        assertEquals("CDXLIV", RomanConverter.toRoman(444));
    }
    @Test
    void shouldCalculateNinelikeDigits(){
        assertEquals("CMXCIX", RomanConverter.toRoman(999));
    }
}
