package util;

import model.hero.Races;

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
                if (index > PARAGRAPH_LENGTH) {
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

    public static void printRandomLine(String line,int n,String color,boolean isEndLine) {
        Console.printRandomLine(1, color, false);
    }

    public static void fillSpace(int n,String s){
        for(int i=0;i<n;i++){
            System.out.print(s);
        }
    }

    void printTable(){
        printTopLine(NUMBER_OF_HEROES);
    }

    //////////////////  print table /////////////////////////////////////////////////////////////////////////////
    private void printTeam() {
//        printLine(TABLE_COLOR + "\u250F", "\u2533", "\u2513" + RESET);//┏ ┳ ┓
//        printLine(TABLE_COLOR + "\u2523", "\u254B", "\u252B" + RESET);//┣ ╋ ┫
//        printLine(TABLE_COLOR + "\u2517", "\u253B", "\u251B" + RESET);//┗ ┻ ┛
    }

    private void printTopLine(int number) {
        System.out.print(TABLE_COLOR + "\u250F");//┏
        int k=(PARAGRAPH_LENGTH - number - 1) / number;
            fillSpace(number, "\u2501");// ━
            System.out.print("\u2533");//┳
        fillSpace(PARAGRAPH_LENGTH -number-3, "\u2501");
        System.out.println("\u2513"+RESET);
       // System.out.print("\u2503" + RESET);//┃
    }

    /////////////////////////////////end print table/////////////////////////////////////////////////////////////


}
