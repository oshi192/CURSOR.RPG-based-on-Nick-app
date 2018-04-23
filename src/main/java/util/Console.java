package util;

public class Console implements GameConstants,Colors{

    public static void fillSpace(int maxLength, int length, String s) {
        for (int i = 0; i < maxLength - length; i++) {
            System.out.print(s);
        }
    }

    public static void printParagraph(String s) {
        StringBuilder sb = new StringBuilder("    ");
        int index = 0;
        int i = 0;
        while (i < s.length()) {
            sb.append(String.valueOf(s.charAt(i)));
            if (s.charAt(i) == ' ' || i == s.length() - 1) {
                index += sb.length();
                if (index > TAB * 9 + 4) {
                    System.out.println();
                    index=sb.length();
                }
                System.out.print(sb);
                sb = new StringBuilder();
            }
            i++;
        }
        System.out.println();
    }
    public static void printRandomLine(int n,String color,boolean isEndLine) {
        System.out.print(color);
        StringBuilder sb = new StringBuilder();
        while (sb.length() < n) {
            sb.append((Math.random() > CHANCE_50) ? S1 : S2);
        }
        System.out.print(sb);
        System.out.print(RESET+(isEndLine?"\n":""));
    }
    public static void fillSpace(int n,String s){
        for(int i=0;i<n;i++){
            System.out.print(s);
        }
    }

}
