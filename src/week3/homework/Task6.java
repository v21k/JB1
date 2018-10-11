package week3.homework;

public class Task6 {
    public static void main(String[] args) {
        String number = "100111101";
        char[] chars = number.toCharArray();
        findSymbolStartEnd(chars, '0');
        findSymbolStartEnd(chars, '1');
    }

    private static void findSymbolStartEnd(char[] chars, char charToFind) {
        int symbolStart = 0;
        int symbolEnd = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == charToFind) {
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] != chars[j]) {
                        int diff = j - i;

                        if (diff > (symbolEnd - symbolStart)) {
                            symbolStart = i + 1;
                            symbolEnd = j;
                            i = j + 1;
                        }
                        break;
                    }
                }
            }
        }

        System.out.printf("'%s': start %d, end %d.%n", charToFind, symbolStart, symbolEnd);
    }
}
