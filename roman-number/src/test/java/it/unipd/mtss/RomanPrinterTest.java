////////////////////////////////////////////////////////////////////
// Gabriele Checchinato 2073957
// Matteo Gerardin 2075536
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
public class RomanPrinterTest {
    @Test
    public void testRomanPrinterInstantiation() {
        RomanPrinter romanPrinter = new RomanPrinter();
        assertNotNull(romanPrinter);
    }
    @Test
    public void testPrint(){
        testPrint1_5_10_50();
        testPrint100_500_1000();
    }
    private static void testPrint1_5_10_50() {
        assertEquals("  _____  \n |_   _| \n   | |   \n" +
                "   | |   \n  _| |_  \n |_____| \n", RomanPrinter.print(1));
        assertEquals(" __      __ \n \\ \\    / / \n  \\ \\  / /  \n" +
                "   \\ \\/ /   \n    \\  /    \n     \\/     \n",
                RomanPrinter.print(5));
        assertEquals(" __   __ \n \\ \\ / / \n  \\ V /  \n" +
                "   > <   \n  / . \\  \n /_/ \\_\\ \n", RomanPrinter.print(10));
        assertEquals("  _       \n | |      \n | |      \n" +
                " | |      \n | |____  \n |______| \n", RomanPrinter.print(50));
    }
    private static void testPrint100_500_1000() {
        assertEquals("   _____  \n  / ____| \n | |      \n" +
                        " | |      \n | |____  \n  \\_____| \n",
                RomanPrinter.print(100));
        assertEquals("  _____   \n |  __ \\  \n | |  | | \n" +
                        " | |  | | \n | |__| | \n |_____/  \n",
                RomanPrinter.print(500));
        assertEquals("  __  __  \n |  \\/  | \n | \\  / | \n" +
                        " | |\\/| | \n | |  | | \n |_|  |_| \n",
                RomanPrinter.print(1000));
    }
    @Test
    public void testPrintComplex() {
        testPrint14();
        testPrint99();
        testPrint48();
        testPrint490();
        testPrint890();
    }
    private static void testPrint14() {
        assertEquals(
                " __   __   _____   __      __ \n" +
                        " \\ \\ / /  |_   _|  \\ \\    / / \n" +
                        "  \\ V /     | |     \\ \\  / /  \n" +
                        "   > <      | |      \\ \\/ /   \n" +
                        "  / . \\    _| |_      \\  /    \n" +
                        " /_/ \\_\\  |_____|      \\/     \n",
                RomanPrinter.print(14));
    }
    private static void testPrint48() {
        assertEquals(
                " __   __   _        __      __   _____    _____    _____  \n" +
                        " \\ \\ / /  | |       \\ \\    / /" +
                        "  |_   _|  |_   _|  |_   _| \n" +
                        "  \\ V /   | |        \\ \\  / /" +
                        "     | |      | |      | |   \n" +
                        "   > <    | |         \\ \\/ /" +
                        "      | |      | |      | |   \n" +
                        "  / . \\   | |____      \\  /" +
                        "      _| |_    _| |_    _| |_  \n" +
                        " /_/ \\_\\  |______|      \\/ " +
                        "     |_____|  |_____|  |_____| \n",
                RomanPrinter.print(48));
    }
    private static void testPrint99() {
        assertEquals(
                " __   __    _____    _____   __   __ \n" +
                        " \\ \\ / /   / ____|  |_   _|  \\ \\ / / \n" +
                        "  \\ V /   | |         | |     \\ V /  \n" +
                        "   > <    | |         | |      > <   \n" +
                        "  / . \\   | |____    _| |_    / . \\  \n" +
                        " /_/ \\_\\   \\_____|  |_____|  /_/ \\_\\ \n",
                RomanPrinter.print(99));
    }
    private static void testPrint490() {
        assertEquals(
                "   _____    _____    __   __    _____  \n" +
                        "  / ____|  |  __ \\   \\ \\ / /   / ____| \n" +
                        " | |       | |  | |   \\ V /   | |      \n" +
                        " | |       | |  | |    > <    | |      \n" +
                        " | |____   | |__| |   / . \\   | |____  \n" +
                        "  \\_____|  |_____/   /_/ \\_\\   \\_____| \n",
                RomanPrinter.print(490));
    }
    private static void testPrint890() {
        assertEquals("  _____      _____     _____   " +
                        "  _____   __   __    _____  \n" +
                        " |  __ \\    / ____|   / ____|  " +
                        " / ____|  \\ \\ / /   / ____| \n" +
                        " | |  | |  | |       | |       | " +
                        "|        \\ V /   | |      \n" +
                        " | |  | |  | |       | |       | " +
                        "|         > <    | |      \n" +
                        " | |__| |  | |____   | |____   | " +
                        "|____    / . \\   | |____  \n" +
                        " |_____/    \\_____|   \\_____|  " +
                        " \\_____|  /_/ \\_\\   \\_____| \n",
                RomanPrinter.print(890));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testPrintOutOfRangeLow() {
        RomanPrinter.print(0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testPrintOutOfRangeHigh() {
        RomanPrinter.print(1001);
    }
}
