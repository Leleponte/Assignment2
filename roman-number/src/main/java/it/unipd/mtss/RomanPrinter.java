////////////////////////////////////////////////////////////////////
// Gabriele Checchinato 2073957
// Matteo Gerardin 2075536
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {
    private static final String[][] asciiMatrix = {
            {"  _____  ", " __      __ ", " __   __ "
                    , "  _       ", "   _____  ", "  _____   ", "  __  __  "},
            {" |_   _| ", " \\ \\    / / ", " \\ \\ / / ",
                    " | |      ", "  / ____| ", " |  __ \\  ", " |  \\/  | "},
            {"   | |   ", "  \\ \\  / /  ", "  \\ V /  "
                    , " | |      ", " | |      ", " | |  | | ", " | \\  / | "},
            {"   | |   ", "   \\ \\/ /   ", "   > <   "
                    , " | |      ", " | |      ", " | |  | | ", " | |\\/| | "},
            {"  _| |_  ", "    \\  /    ", "  / . \\  "
                    , " | |____  ", " | |____  ", " | |__| | ", " | |  | | "},
            {" |_____| ", "     \\/     ", " /_/ \\_\\ "
                    , " |______| ", "  \\_____| ", " |_____/  ", " |_|  |_| "}};

    /**
     * This method converts an integer number into his Roman numeral ASCII art.
     * @param num the integer number to convert
     * @return the ASCII art representation of his Roman numeral
     * @throws IllegalArgumentException if the input number is not in the range
     */
    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }
    /**
     * This method converts a Roman numeral into ASCII art.
     * @param romanNumber the Roman numeral to convert
     * @return the ASCII art representation of the input Roman numeral
     */
    private static String printAsciiArt(String romanNumber) {
        StringBuilder asciiArt = new StringBuilder();
        for (int row = 0; row < 6; row++) {
            for (char c : romanNumber.toCharArray()) {
                switch (c) {
                    case 'I':asciiArt.append(asciiMatrix[row][0]);break;
                    case 'V':asciiArt.append(asciiMatrix[row][1]);break;
                    case 'X':asciiArt.append(asciiMatrix[row][2]);break;
                    case 'L':asciiArt.append(asciiMatrix[row][3]);break;
                    case 'C':asciiArt.append(asciiMatrix[row][4]);break;
                    case 'D':asciiArt.append(asciiMatrix[row][5]);break;
                    default:asciiArt.append(asciiMatrix[row][6]);break;}}
            asciiArt.append("\n");}
        return asciiArt.toString();
    }
}

