public class OopsBannerUC6 {

    public static void main(String[] args) {

        String[] letterO = buildO();
        String[] letterP = buildP();
        String[] letterS = buildS();

        int height = letterO.length;

        // Combine letters row by row
        for (int i = 0; i < height; i++) {
            String line = String.join("   ",
                    letterO[i],
                    letterO[i],
                    letterP[i],
                    letterS[i]
            );
            System.out.println(line);
        }
    }

    // Static method for letter O
    public static String[] buildO() {
        return new String[]{
                "OOOO",
                "O  O",
                "O  O",
                "O  O",
                "O  O",
                "O  O",
                "OOOO"
        };
    }

    // Static method for letter P
    public static String[] buildP() {
        return new String[]{
                "PPPP",
                "P  P",
                "P  P",
                "PPPP",
                "P",
                "P",
                "P"
        };
    }

    // Static method for letter S
    public static String[] buildS() {
        return new String[]{
                "SSSS",
                "S",
                "S",
                "SSSS",
                "   S",
                "   S",
                "SSSS"
        };
    }
}