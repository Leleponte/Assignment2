////////////////////////////////////////////////////////////////////
// Gabriele Checchinato 2073957
// Matteo Gerardin 2075536
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    private static final String[] romanSymbols = {"I", "IV", "V", "IX", "X",
            "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
    private static final int[] integerValues = {1, 4, 5, 9, 10, 40, 50, 90,
            100, 400, 500, 900, 1000};
    /**
     * This method converts an integer number into a Roman numeral.
     * @param number the integer number to convert
     * @return the Roman numeral corresponding to the input number
     * @throws IllegalArgumentException if the input number is not in the range
     */
    public static String convert(int number) {
        if (number < 1 || number > 1000) {throw new IllegalArgumentException();}
        StringBuilder romanNumber = new StringBuilder();
        for (int i = integerValues.length - 1; i >= 0; i--) {
            while (number >= integerValues[i]) {
                romanNumber.append(romanSymbols[i]);
                number -= integerValues[i];
            }
        }
        return romanNumber.toString();
    }
}

