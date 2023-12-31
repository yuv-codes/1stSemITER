import java.util.Scanner;
public class HomeA_Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Scissor(0), Rock(1), Paper(2): ");
        int num = sc.nextInt();
        int computer = (int)(Math.random()*3);
        String userchoice = "";
        String computerChoice = "";
        switch(num){
            case 0 -> userchoice = "Scissors";
            case 1 -> userchoice = "Rock";
            case 2 -> userchoice = "Paper";
        }

        switch (computer){
            case 0 -> computerChoice = "Scissors";
            case 1 -> computerChoice = "Rock";
            case 2 -> computerChoice = "Paper";
        }

        if (num == computer){
            System.out.println("Computer picked " + computerChoice + ", You picked " + userchoice + ", its a draw.");
        }
        else if ((num == 0 && computer == 1) || (num == 1 && computer == 2) || (num == 2 && computer == 0)) {
            System.out.println("Computer picked " + computerChoice + ". You picked " + userchoice + ", You won!!");
        } else {
            System.out.println("Computer picked " + computerChoice + ". You picked " + userchoice + ", You lost!");
        }

    }
}
