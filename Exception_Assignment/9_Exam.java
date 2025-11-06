package Exception_Assignment;
class LateException extends Exception {}
class InvalidFileException extends Exception {}
public class 9_Exam {
    public static void main(String[] args) {
        String file = "test.doc";
        try {
            if(!file.endsWith(".pdf")) throw new InvalidFileException();
            System.out.println("Submitted");
        } catch(Exception e){ System.out.println("Submission Failed"); }
    }
}
