package exception;

public class MyException extends RuntimeException {
    MyException() {

    }

    MyException(Throwable ex) {
        super(ex);
    }
}
