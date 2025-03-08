package Strings;
public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        System.out.println("equalsIgnoreCase: " + str1.equalsIgnoreCase(str2));
        System.out.println("startsWith 'He': " + str1.startsWith("He"));
        System.out.println("endsWith 'lo': " + str1.endsWith("lo"));
        System.out.println("compareTo: " + str1.compareTo(str2));
    }
}

