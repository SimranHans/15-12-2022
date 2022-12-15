//program to calculate the number of digits entered by the user..

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args){

        int number;
        int count=0;    

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the number : ");
        number=scan.nextInt();
        if(number>0)
        {
        while(number>0)
        {
            number=number/10;
            count++;     //This count whill increment for number of digits in the number
            
        }
        System.out.println("The total number of digits in a number is  : "+count);
        }
        else{        //This is because if user entered any number other than zero
            System.out.println("Please enter positive number..");
        }
        scan.close();
    }
    }

