package ExceptionHandling;

public class AgeInvalidException extends Exception{

    public AgeInvalidException(String s) {
        System.out.println(s);
    }
}
