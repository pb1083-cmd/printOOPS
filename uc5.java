public class OopsBannerUC5 {

    public static void main(String[] args) {

        // Declare and initialize banner in single statement
        String[] banner = {
                String.join("   ", "OOOO", "OOOO", "OOOO", "OOOO"),
                String.join("   ", "O  O", "O  O", "O  O", "O"),
                String.join("   ", "O  O", "O  O", "O  O", "OOO"),
                String.join("   ", "O  O", "O  O", "O  O", "  O"),
                String.join("   ", "OOOO", "OOOO", "OOOO", "OOOO"),
                String.join("   ", "O",    "O",    "O",    "O"),
                String.join("   ", "OOOO", "OOOO", "OOOO", "OOOO")
        };

        // Enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}