package stringconcept.stringcompare;

public class StringCompare {
    boolean compareStrings(String str1, String str2) {
        int i;
        if(str1.length()!=str2.length()) {
            return false;
        }
        for(i=0; i<str1.length(); i++) {
            if(str1.charAt(i)!=str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    boolean beginsWith(String str1, String str2) {
        int i;
        if(str1.length()<str2.length()) {
            return false;
        }
        for(i=0; i<str2.length(); i++) {
            if(str1.charAt(i)!=str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    boolean endsWith(String str1, String str2) {
        int i;
        if(str1.length()<str2.length()) {
            return false;
        }
        for(i=0; i<str2.length(); i++) {
            if(str1.charAt(str1.length()-i-1)!=str2.charAt(str2.length()-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        StringCompare sc = new StringCompare();
        String str1 = "Hello";
        String str2 = "Hello World";
        String str3 = "World";

        System.out.println("Strings are equal: " + sc.compareStrings(str1, str2));
        System.out.println("String begins with 'Hello': " + sc.beginsWith(str1, "Hello"));
        System.out.println("String ends with 'World': " + sc.endsWith(str2, str3));
    }
}
