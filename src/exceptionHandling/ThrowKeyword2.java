package exceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

//throwing the exception
public class ThrowKeyword2 {
    public static void method() throws FileNotFoundException {
        FileReader file = new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");
        BufferedReader fileInput = new BufferedReader(file);
        throw new FileNotFoundException();
    }

    public static void main(String args[]) throws VoterNotEligibleException {
        try {
            method();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File is not found in the path");
        }
        System.out.println("rest of the code...");
    }
}
