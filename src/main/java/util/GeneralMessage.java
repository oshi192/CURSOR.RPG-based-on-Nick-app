package util;

public class GeneralMessage implements GameMessages {
    /**
     * welcome message
     */
    public static void welcomeInfo() {
        System.out.print("-------------------------------- ");
        System.out.print(GAME_NAME);
        System.out.println(" ------------------------------");
        Console.printParagraph(GAME_DESCRIPTION);
        System.out.println("Lets starting with creating the Team: ");
    }


    /**
     * print info about different hero's characteristics
     */
    public static void characteristicsInfo() {
        System.out.print(CYAN + "\n\tEach hero has basic characteristics as: \n" +
                "\t1) CHARISMA\n" +
                "\t\t| per additional 2 charisma points hero gain 1 initiative point\n" +
                "\t\t| > 40 allows hero to fear enemies (75% chance per 2 points)\n" +
                "\t\t| 2% XP gain per 2 points\n" +

                "\t2) STAMINA\n" +
                "\t\t| per additional 1 stamina point hero gain 2 health points (hp)\n" +
                "\t\t| 0.25hp regen per 1 point\n" +

                "\t3) INTELLECT\n" +
                "\t\t| per additional 1 intellect point hero gain 2 manna points (mp)\n" +
                "\t\t| 0.25mp regen per 1 point\n" +

                "\t4) AGILITY\n" +
                "\t\t| per additional 1 agility point hero gain 4 rage points (rp)\n" +
                "\t\t| chance to avoid hit 1% per 2 points\n" +

                "\t5) CONCENTRATION\n" +
                "\t\t| per additional 1 concentration point hero gain 2hp and 1.5mp\n" +
                "\t\t| 1rp regen per turn per 1 point\n" +
                "\t\t| 1 turn cd decrease per 25 points" + RESET + "\n\n");
    }
}
