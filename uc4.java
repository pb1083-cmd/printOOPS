public class OopsBannerUC4 {

    public static void main(String[] args) {

        // Store banner lines in String array
        String[] banner = {

                String.join("   ", "OOOO", "OOOO", "OOOO", "OOOO"),

                String.join("   ", "O  O", "O  O", "O  O", "O"),

                String.join("   ", "O  O", "O  O", "O  O", "OOO"),

                String.join("   ", "O  O", "O  O", "O  O", "  O"),

                String.join("   ", "OOOO", "OOOO", "OOOO", "OOOO")
        };

        // Print using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}