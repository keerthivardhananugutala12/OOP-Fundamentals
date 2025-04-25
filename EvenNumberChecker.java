
class EvenNumberException extends Exception {
    public EvenNumberException(String message) {
        super(message);
    }
}

public class EvenNumberChecker {

    
    public static void checkEvenNumber(int number) throws EvenNumberException {
        if (number % 2 == 0) {
            throw new EvenNumberException("The number " + number + " is even, which is not allowed.");
        } else {
            System.out.println("The number " + number + " is odd, which is allowed.");
        }
    }

    public static void main(String[] args) {
       
        
        try {
            checkEvenNumber(7); 
        } catch (EvenNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
