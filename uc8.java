public class OOPSBannerApp {

    // Class to store character and its ASCII pattern
    static class CharacterPatternMap {
        char character;
        String[] pattern;

        CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
    }

    // Create patterns for characters
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] O = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        String[] P = {
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        };

        String[] S = {
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        };

        CharacterPatternMap[] maps = {
                new CharacterPatternMap('O', O),
                new CharacterPatternMap('P', P),
                new CharacterPatternMap('S', S)
        };

        return maps;
    }

    // Get pattern for a specific character
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.character == ch) {
                return map.pattern;
            }
        }
        return new String[]{" ", " ", " ", " ", " "};
    }

    // Print the full banner message
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        int height = 5;

        for (int row = 0; row < height; row++) {

            for (int i = 0; i < message.length(); i++) {
                char ch = message.charAt(i);
                String[] pattern = getCharacterPattern(ch, charMaps);
                System.out.print(pattern[row] + "  ");
            }

            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {

        // Create pattern maps
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        // Message to display
        String message = "OOPS";

        // Print banner
        printMessage(message, charMaps);
    }
}