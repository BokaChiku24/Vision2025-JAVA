package fileconcept.readfile;

import java.io.FileReader;
import java.io.FileWriter;

public class ReadFile {
    public static void main(String[] args) {
        int ch;
        FileReader fileReader = null;
        FileWriter fileWriter = null, fdDigitWriter = null, fSpecialWriter = null;
        try {
            fileReader = new FileReader("input.txt");
            fileWriter = new FileWriter("output.txt");
            fdDigitWriter = new FileWriter("digits.txt");
            fSpecialWriter = new FileWriter("special.txt");

            while ((ch = fileReader.read()) != -1) {
                int asc = (char) ch;
                if ((asc >= 65 && asc <= 90) || (asc >= 97 && asc <= 122)) {
                    fileWriter.write((char) ch);
                } else if ((asc >= 48 && asc <= 57)) {
                    fdDigitWriter.write((char) ch);
                } else {
                    fSpecialWriter.write((char) ch);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            try {
                if (fileReader!= null) fileReader.close();
                if (fileWriter!= null) fileWriter.close();
                if (fdDigitWriter!= null) fdDigitWriter.close();
                if (fSpecialWriter!= null) fSpecialWriter.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
