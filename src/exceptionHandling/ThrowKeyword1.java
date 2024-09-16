package exceptionHandling;

public class ThrowKeyword1 {

    //this is not the customized exception, but the ArithmeticException is thrown
    public static void validateVoter(int voterAge) {
        if(voterAge < 18) {
            throw new ArithmeticException("Voter age is less than 18 and can't be vote this time");
        } else {
            System.out.println("Voter is eligible to vote");
        }
    }
    public static void main(String[] args) {
        validateVoter(17);
        System.out.println("rest of the code");
    }
}
