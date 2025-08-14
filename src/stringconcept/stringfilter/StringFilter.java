package stringconcept.stringfilter;

public class StringFilter {
    public static void main(String[] args) {
        String data[] = {"apple", "banOBJ", "cherry", "dOBJ", "elderberBJ"};
        for (int i = 0; i < data.length; i++) {
            if (data[i].charAt(0) == 'a' || data[i].endsWith("OBJ")) {
                System.out.println(data[i]);
            }
        }
    }
}
