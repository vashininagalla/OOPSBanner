import java.util.*;

public class OOPSBannerAppUC7 {

    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static Map<Character, String[]> initializePatterns() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*       ",
                "*       "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*       ",
                " ***** ",
                "      *",
                " ***** "
        });

        return patternMap;
    }

    public static void displayBanner(String word) {

        Map<Character, String[]> patterns = initializePatterns();
        int height = 5;

        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                String[] pattern = patterns.get(c);
                line.append(pattern[i]).append("  ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        displayBanner("OOPS");
    }
}
