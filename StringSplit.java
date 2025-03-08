package Strings;
public class StringSplit {
    public static void main(String[] args) {
        String str = "Java,Python,C++";
        String[] languages = str.split(",");

        for (String lang : languages) {
            System.out.println(lang);
        }
    }
}
