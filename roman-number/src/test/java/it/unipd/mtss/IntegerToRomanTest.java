////////////////////////////////////////////////////////////////////
// Gabriele Checchinato 2073957
// Matteo Gerardin 2075536
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class IntegerToRomanTest {
    @Test
    public void testRomanPrinterInstantiation() {
        IntegerToRoman romanPrinter = new IntegerToRoman();
        assertNotNull(romanPrinter);
    }
    @Test
    public void testConvert() {
        assertEquals("I", IntegerToRoman.convert(1));
        assertEquals("V", IntegerToRoman.convert(5));
        assertEquals("X", IntegerToRoman.convert(10));
        assertEquals("L", IntegerToRoman.convert(50));
        assertEquals("C", IntegerToRoman.convert(100));
        assertEquals("D", IntegerToRoman.convert(500));
        assertEquals("M", IntegerToRoman.convert(1000));
    }

    @Test
    public void testConvertComplex() {
        assertEquals("IV", IntegerToRoman.convert(4));
        assertEquals("IX", IntegerToRoman.convert(9));
        assertEquals("XIV", IntegerToRoman.convert(14));
        assertEquals("XLVIII", IntegerToRoman.convert(48));
        assertEquals("XCIX", IntegerToRoman.convert(99));
        assertEquals("CDXC", IntegerToRoman.convert(490));
        assertEquals("DCCCXC", IntegerToRoman.convert(890));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOutOfRangeLow() {
        IntegerToRoman.convert(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOutOfRangeHigh() {
        IntegerToRoman.convert(1001);
    }
}

