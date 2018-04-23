package util;

public class Validator {

    private Validator() throws IllegalStateException {
        throw new IllegalStateException("Can't create instance of util.ScannerUtil");
    }

    public static int getNumber(String s, int min, int max) {
        String input;
        System.out.print(s);
        while (true) {
            input = Reader.getString();
            if (input.matches("\\d+")) {
                if (Integer.parseInt(input) >= min && Integer.parseInt(input) <= max) {
                    return Integer.parseInt(input);
                }
            }
            System.out.println("invalid input , try again. Only numbers: " + min + "-" + max);
        }
    }
}
