import java.util.Scanner;

public class Q03_CheckingPrime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number");
        int num= sc.nextInt();
        int counter1=0;
        int counter2=0;
        int rev=0;

        for(int i=2; i<=num/2; i++){
            if(num%i==0){
                counter1= 1;
                break;
            }
        }

        if(counter1==1){
            System.out.println("It is not a prime number");
        }

        else if(counter1==0){
            int d= num%10;
            rev= rev*10+ d;
            num= num/10;

            for(int i=2; i<=rev/2; i++){
                if(rev%i==0){
                    counter2= 1;
                    break;
                }
            }

            if(counter2==0){
                System.out.println("The number is a twisted prime");
            }

            else if(counter2==1){
                System.out.println("The number is not a twisted prime");
            }
        }

        }
    }
