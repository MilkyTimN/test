package RegexPractice;

public class WrongLoginException extends Exception{

    private String s;

    public WrongLoginException() {
    }

    public WrongLoginException(String s) {
        super(s);
        this.s = s;
    }
}
