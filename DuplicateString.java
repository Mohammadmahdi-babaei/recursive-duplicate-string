public class DuplicateString {

    public static boolean isDuplicate(String s) {
        // Base case: empty string is duplicate
        if (s.length() == 0) {
            return true;
        }

        // Odd length strings cannot be split into two equal halves
        if (s.length() % 2 != 0) {
            return false;
        }

        int mid = s.length() / 2;
        String firstHalf = s.substring(0, mid);
        String secondHalf = s.substring(mid);

        // Both halves must be equal
        if (!firstHalf.equals(secondHalf)) {
            return false;
        }

        // Remove the first character of the first half and check recursively
        return isDuplicate(firstHalf.substring(1));
    }

    public static void main(String[] args) {
        String[] words = {
            "ALLALL",
            "HTMMTMMHTMMTMM",
            "ALILIALILI",
            "HPOPOHPOPO",
            "POP"
        };

        for (String word : words) {
            System.out.println(word + " : " + isDuplicate(word));
        }
    }
}
