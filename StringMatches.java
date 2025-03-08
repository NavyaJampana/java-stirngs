package Strings;
public class StringMatches {
    public static void main(String[] args) {
        String str = "Hello123";
        boolean isMatch = str.matches("[A-Za-z0-9]+");
        System.out.println("Matches regex: " + isMatch);
    }
}

