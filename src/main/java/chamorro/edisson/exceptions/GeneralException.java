package chamorro.edisson.exceptions;

public class GeneralException extends AssertionError{

    private static final long serialVersionUID = 1L;

    public GeneralException(String message, Throwable cause){
        super(message, cause);
    }
}
