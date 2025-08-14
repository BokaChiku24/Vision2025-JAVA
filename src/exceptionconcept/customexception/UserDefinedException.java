package exceptionconcept.customexception;

class InvalidParameterException extends Exception {
    public InvalidParameterException(String message) {
        super(message);
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        int i = args.length;
        try {
            if (i == 0) throw new InvalidParameterException("No arguments provided.");
            System.out.println("Number of arguments: " + i);
        } catch (InvalidParameterException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
