package exceptionHandling;

public class VoterNotEligibleException extends Throwable {
    public VoterNotEligibleException(String message) {
        super(message);
    }
}
