package view;

public class ErrorMessage implements MagicColors {
    /**
     * error info if user choose item not from list
     */
    public static void errorInfo() {
        System.out.print(RED + "\tSorry, you need to choose from list above: " + RESET);
    }


    /**
     * error info if input field is empty
     */
    public static void errorEmptyInput() {
        System.out.print(RED + "\tSorry, your field empty :( " + RESET);
    }


    /**
     * error that user input is out of bound
     *
     * @param points maximum option can be chosen
     */
    public static void errorOutOfBound(int points) {
        System.out.format("\t%sSorry, you need to choose from range [1:%d]:%s ", RED, points, RESET);
    }
}
