package exceptionHandling;

public class ThrowKeyword4 {
    public static void validateVoterAge(int age) throws VoterNotEligibleException {
        if(age < 18) {
            throw new VoterNotEligibleException("Person is not eligible to vote");
        } else {
            System.out.println("Person is eligible to vote");
        }
    }

    public static void main(String[] args) throws VoterNotEligibleException {
        validateVoterAge(17);
        System.out.println();
        System.out.println("Rest of the code");
    }
}
