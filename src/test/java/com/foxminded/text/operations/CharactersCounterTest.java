package com.foxminded.text.operations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CharactersCounterTest {
    private final CharactersCounter counter = new CharactersCounter();

    @Test
    void charCounterShouldThrowExceptionForZeroLengthString() {
        Throwable exception = assertThrows(IllegalArgumentException.class,
                () -> counter.displayCharsCount(""));
        assertEquals("Input argument is empty", exception.getMessage());
    }

    @Test
    void charCounterShouldThrowExceptionForNullString() {
        Throwable exception = assertThrows(IllegalArgumentException.class,
                () -> counter.displayCharsCount(null));
        assertEquals("Input argument is null", exception.getMessage());
    }

    @Test
    void charCounterShouldReturnCharsCountForDigitString() {
        final String actual = counter.displayCharsCount("55555559999888888444444111112222222");
        final String expected = "55555559999888888444444111112222222\n" +
                "\"5\" - 7\n" +
                "\"9\" - 4\n" +
                "\"8\" - 6\n" +
                "\"4\" - 6\n" +
                "\"1\" - 5\n" +
                "\"2\" - 7";
        assertEquals(expected, actual);
    }

    @Test
    void charCounterShouldReturnCharsCountForLettersStringWithSpaces() {
        final String actual = counter.displayCharsCount("aaaffff tyy eeewwww");
        final String expected = "aaaffff tyy eeewwww\n" +
                "\"a\" - 3\n" +
                "\"f\" - 4\n" +
                "\" \" - 2\n" +
                "\"t\" - 1\n" +
                "\"y\" - 2\n" +
                "\"e\" - 3\n" +
                "\"w\" - 4";
        assertEquals(expected, actual);
    }

    @Test
    void charCounterShouldReturnCharsCountForTextString() {
        final String actual = counter.displayCharsCount("Dante passes through the gate of Hell, " +
                "which bears an inscription ending with the famous phrase \"Lasciate ogne speranza, " +
                "voi ch'intrate\",[17] most frequently translated as \"Abandon all hope, ye who enter " +
                "here.\"[nb 1] Dante and his guide hear the anguished screams of the Uncommitted. These are " +
                "the souls of people who in life took no sides; the opportunists who were for neither good nor " +
                "evil, but instead were merely concerned with themselves. Among these Dante recognizes a figure " +
                "implied to be Pope Celestine V, whose \"cowardice (in selfish terror for his own welfare) served " +
                "as the door through which so much evil entered the Church\".[18] Mixed with them are outcasts who " +
                "took no side in the Rebellion of Angels. These souls are forever unclassified; they are neither " +
                "in Hell nor out of it, but reside on the shores of the Acheron. Naked and futile, they race around " +
                "through the mist in eternal pursuit of an elusive, wavering banner (symbolic of their pursuit of " +
                "ever-shifting self-interest) while relentlessly chased by swarms of wasps and hornets, who " +
                "continually sting them.[19] Loathsome maggots and worms at the sinners' feet drink the putrid " +
                "mixture of blood, pus, and tears that flows down their bodies. This symbolizes the sting of their " +
                "guilty conscience and the repugnance of sin.[citation needed] This may also be seen as a " +
                "reflection of the spiritual stagnation in which they lived.");
        final String expected = "Dante passes through the gate of Hell, " +
                "which bears an inscription ending with the famous phrase \"Lasciate ogne speranza, " +
                "voi ch'intrate\",[17] most frequently translated as \"Abandon all hope, ye who enter " +
                "here.\"[nb 1] Dante and his guide hear the anguished screams of the Uncommitted. These are " +
                "the souls of people who in life took no sides; the opportunists who were for neither good nor " +
                "evil, but instead were merely concerned with themselves. Among these Dante recognizes a figure " +
                "implied to be Pope Celestine V, whose \"cowardice (in selfish terror for his own welfare) served " +
                "as the door through which so much evil entered the Church\".[18] Mixed with them are outcasts who " +
                "took no side in the Rebellion of Angels. These souls are forever unclassified; they are neither " +
                "in Hell nor out of it, but reside on the shores of the Acheron. Naked and futile, they race around " +
                "through the mist in eternal pursuit of an elusive, wavering banner (symbolic of their pursuit of " +
                "ever-shifting self-interest) while relentlessly chased by swarms of wasps and hornets, who " +
                "continually sting them.[19] Loathsome maggots and worms at the sinners' feet drink the putrid " +
                "mixture of blood, pus, and tears that flows down their bodies. This symbolizes the sting of their " +
                "guilty conscience and the repugnance of sin.[citation needed] This may also be seen as a " +
                "reflection of the spiritual stagnation in which they lived.\n" +
                "\"D\" - 3\n" +
                "\"a\" - 64\n" +
                "\"n\" - 80\n" +
                "\"t\" - 94\n" +
                "\"e\" - 158\n" +
                "\" \" - 229\n" +
                "\"p\" - 18\n" +
                "\"s\" - 86\n" +
                "\"h\" - 74\n" +
                "\"r\" - 69\n" +
                "\"o\" - 85\n" +
                "\"u\" - 32\n" +
                "\"g\" - 22\n" +
                "\"f\" - 30\n" +
                "\"H\" - 2\n" +
                "\"l\" - 43\n" +
                "\",\" - 12\n" +
                "\"w\" - 24\n" +
                "\"i\" - 81\n" +
                "\"c\" - 28\n" +
                "\"b\" - 14\n" +
                "\"d\" - 36\n" +
                "\"m\" - 21\n" +
                "\"\"\" - 6\n" +
                "\"L\" - 2\n" +
                "\"z\" - 3\n" +
                "\"v\" - 10\n" +
                "\"'\" - 2\n" +
                "\"[\" - 5\n" +
                "\"1\" - 4\n" +
                "\"7\" - 1\n" +
                "\"]\" - 5\n" +
                "\"q\" - 1\n" +
                "\"y\" - 13\n" +
                "\"A\" - 4\n" +
                "\".\" - 10\n" +
                "\"U\" - 1\n" +
                "\"T\" - 4\n" +
                "\"k\" - 4\n" +
                "\";\" - 2\n" +
                "\"P\" - 1\n" +
                "\"C\" - 2\n" +
                "\"V\" - 1\n" +
                "\"(\" - 2\n" +
                "\")\" - 2\n" +
                "\"8\" - 1\n" +
                "\"M\" - 1\n" +
                "\"x\" - 2\n" +
                "\"R\" - 1\n" +
                "\"N\" - 1\n" +
                "\"-\" - 2\n" +
                "\"9\" - 1";
        assertEquals(expected, actual);
    }
}
