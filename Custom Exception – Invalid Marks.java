
class InvalidMarksException extends Exception {
    InvalidMarksException(String message) {
        super(message);
    }
}

public class MarksValidation {

    static void validate(int marks)
            throws InvalidMarksException {

        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Invalid Marks");
        }

        System.out.println("Valid Marks: " + marks);
    }

    public static void main(String[] args) {

        try {
            validate(85);
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
    }
}
