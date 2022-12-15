//Program to perform operation using while loop
//finding even and odd number and also the sum of both

import java.util.Scanner;

public class WhilwLoop {
    public static void main(String[] args){

        int firstNum,secondNum,sum=0,odd=0;

       Scanner sc=new Scanner(System.in);
       System.out.println("Enter firstNum :" );
       firstNum=sc.nextInt();
       System.out.println("Enter secondNum :" );
       secondNum=sc.nextInt();

       for(int i =firstNum;i<=secondNum;i++)
       {
           if(i%2==0)
           {
            sum=sum+i;    //Sum of even numbers
           System.out.println("This is even number "+i);
            }
           
        }
            //Sum of all even numbers
           System.out.println("Sum of even number is : "+sum);

        for(int i=firstNum;i<=secondNum;i++)
        {
            if(i%2!=0)
            {
                odd=odd+i;    //Sum of odd numbers
                System.out.println("Odd numbers is : "+i);
            }
        }
           //Sum of all odd numbers
           System.out.println("Sum of odd number is : "+odd);
             sc.close();

    }
}
