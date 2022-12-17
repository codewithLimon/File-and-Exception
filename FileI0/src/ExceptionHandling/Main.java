package ExceptionHandling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        try{
            ageInvalid(in.nextInt());
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void ageInvalid(int a) throws AgeInvalidException{
        if(a<18){
            throw new AgeInvalidException("Ineligible for voting, age less than 18");
        }
        else{
            System.out.println("Eligible for voting");
        }
    }
}
