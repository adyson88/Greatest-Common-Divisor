public class GreatestCommonDivisor {

public static void main(String[] args) {

        int num1 = 4;

        int num2 = 7;

        int gcd = 1;

 

        for(int i = 1; i <= num1 && i <= num2; ++i)

        {

            if(num1 % i==0 && num2 % i==0)

                gcd = i;

        }

 

        if(gcd == 1) {

        System.out.println(" ERROR Message: GCD is 1");

       

        } 

        

        System.out.printf("GCD of %d and %d is %d", num1, num2, gcd);

           

    }

 

}