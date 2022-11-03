package RegexPractice;

public class WrongPasswordException extends Exception{

    private String s;

    public WrongPasswordException() {
    }

    public WrongPasswordException(String s) {
        super(s);
        this.s = s;
    }
}
