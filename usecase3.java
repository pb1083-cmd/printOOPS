public class OopsBannerUC3 {

    public static void main(String[] args) {

        // Row 1
        String row1 = String.join("   ",
                "OOOO",
                "OOOO",
                "OOOO",
                "OOOO"
        );

        // Row 2
        String row2 = String.join("   ",
                "O  O",
                "O  O",
                "O  O",
                "O"
        );

        // Row 3
        String row3 = String.join("   ",
                "O  O",
                "O  O",
                "O  O",
                "OOO"
        );

        // Row 4
        String row4 = String.join("   ",
                "O  O",
                "O  O",
                "O  O",
                "  O"
        );

        // Row 5
        String row5 = String.join("   ",
                "OOOO",
                "OOOO",
                "OOOO",
                "OOOO"
        );

        System.out.println(row1);
        System.out.println(row2);
        System.out.println(row3);
        System.out.println(row4);
        System.out.println(row5);
    }
}