import java.util.Scanner;

public class NumberConverter {

    // Task 1: Convert decimal to binary, octal, and hexadecimal
    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal); // Utilize built-in method for conversion
    }

    public static String decimalToOctal(int decimal) {
        return Integer.toOctalString(decimal); // Utilize built-in method for conversion
    }

    public static String decimalToHexadecimal(int decimal) {
        return Integer.toHexString(decimal); // Utilize built-in method for conversion
    }

    // Task 2: Convert binary to decimal, octal, and hexadecimal
    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2); // Utilize built-in method for conversion
    }

    public static String binaryToOctal(String binary) {
        return decimalToOctal(binaryToDecimal(binary)); // Convert binary to decimal then to octal
    }

    public static String binaryToHexadecimal(String binary) {
        return decimalToHexadecimal(binaryToDecimal(binary)); // Convert binary to decimal then to hexadecimal
    }

    // Task 3: Convert octal to decimal, binary, and hexadecimal
    public static int octalToDecimal(String octal) {
        return Integer.parseInt(octal, 8); // Utilize built-in method for conversion
    }

    public static String octalToBinary(String octal) {
        return decimalToBinary(octalToDecimal(octal)); // Convert octal to decimal then to binary
    }

    public static String octalToHexadecimal(String octal) {
        return decimalToHexadecimal(octalToDecimal(octal)); // Convert octal to decimal then to hexadecimal
    }

    // Task 4: Convert hexadecimal to decimal, binary, and octal
    public static int hexadecimalToDecimal(String hexadecimal) {
        return Integer.parseInt(hexadecimal, 16); // Utilize built-in method for conversion
    }

    public static String hexadecimalToBinary(String hexadecimal) {
        return decimalToBinary(hexadecimalToDecimal(hexadecimal)); // Convert hexadecimal to decimal then to binary
    }

    public static String hexadecimalToOctal(String hexadecimal) {
        return decimalToOctal(hexadecimalToDecimal(hexadecimal)); // Convert hexadecimal to decimal then to octal
    }

    // Task 5: Convert decimal to 1's complement binary representation
    public static String decimalToOnesComplement(int decimal) {
        String binary = decimalToBinary(decimal);
        StringBuilder complement = new StringBuilder();
        for (char bit : binary.toCharArray()) {
            complement.append(bit == '1' ? '0' : '1'); // Invert each bit
        }
        return complement.toString();
    }

    // Task 6: Convert decimal to 2's complement binary representation
    public static String decimalToTwosComplement(int decimal) {
        String binary = decimalToBinary(decimal);
        StringBuilder twosComplement = new StringBuilder();
        boolean carry = true;
        for (int i = binary.length() - 1; i >= 0; i--) {
            char bit = binary.charAt(i);
            if (carry) {
                if (bit == '1') {
                    twosComplement.insert(0, '0');
                } else {
                    twosComplement.insert(0, '1');
                    carry = false;
                }
            } else {
                twosComplement.insert(0, bit);
            }
        }
        return twosComplement.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage:
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        // Task 1
        System.out.println("Binary: " + decimalToBinary(decimal));
        System.out.println("Octal: " + decimalToOctal(decimal));
        System.out.println("Hexadecimal: " + decimalToHexadecimal(decimal));

        // Task 2
        System.out.print("Enter a binary number: ");
        String binary = scanner.next();
        System.out.println("Decimal: " + binaryToDecimal(binary));
        System.out.println("Octal: " + binaryToOctal(binary));
        System.out.println("Hexadecimal: " + binaryToHexadecimal(binary));

        // Task 3
        System.out.print("Enter an octal number: ");
        String octal = scanner.next();
        System.out.println("Decimal: " + octalToDecimal(octal));
        System.out.println("Binary: " + octalToBinary(octal));
        System.out.println("Hexadecimal: " + octalToHexadecimal(octal));

        // Task 4
        System.out.print("Enter a hexadecimal number: ");
        String hexadecimal = scanner.next();
        System.out.println("Decimal: " + hexadecimalToDecimal(hexadecimal));
        System.out.println("Binary: " + hexadecimalToBinary(hexadecimal));
        System.out.println("Octal: " + hexadecimalToOctal(hexadecimal));

        // Task 5
        System.out.print("Enter a decimal number for 1's complement: ");
        int decimalForOnesComplement = scanner.nextInt();
        System.out.println("1's Complement: " + decimalToOnesComplement(decimalForOnesComplement));

        // Task 6
        System.out.print("Enter a decimal number for 2's complement: ");
        int decimalForTwosComplement = scanner.nextInt();
        System.out.println("2's Complement: " + decimalToTwosComplement(decimalForTwosComplement));
        
        scanner.close();
    }
}
