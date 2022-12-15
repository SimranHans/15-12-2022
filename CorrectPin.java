// Program for checking the pin from user ....


import java.util.Scanner;

public class CorrectPin {
    public static void main(String[] args){

        int p=123,pin;
        int count=0; //This is the initial value defined for count varaible . 

        Scanner sc=new Scanner(System.in);

        for(int i=0;i<3;i++){
             /* 
              The count is incremented, because the loop should go for three times */      
            count++; 

            System.out.println("Enter your pin : ");
            pin=sc.nextInt();

            if(p==pin){

                System.out.println("Correct, welcome back");
                break;
            }
            else{
                System.out.println("Incorrect, try again..");
            }
        }

        /* 
        This is the count variable which checks if the user have cross the limit of entering pin .
        */

        if(count==3){
            System.out.println("Sorry but you have been locked out.");
        }

        sc.close();

    }

}
