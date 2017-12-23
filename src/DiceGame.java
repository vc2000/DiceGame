import java.util.*;
/**
 *
 * @author vc2000
 */
public class DiceGame {
        
        
        static int money;
        static String userName;
        static Scanner in = new Scanner(System.in);
        static Random random = new Random();
        
        public static void main(String[] args) {
            System.out.println("Please enter your name.");
            userName = in.nextLine();
            System.out.println("Welcome " + userName + "!");
            money = 1000;
            System.out.println("You have : $" + money +" in your pocket !");
            rollDice();
    }
    public static void rollDice(){
        System.out.println("You have: $" + money + " left.");
        System.out.println("What number would you like to bet on? (1-6)");
        int betRoll = in.nextInt();
        System.out.println("How much do you like to bet?");
        int betMoney = in.nextInt();
        
        while (betMoney > money){
            System.out.println("You don't have that much money! You have: $" +money +". Please enter your bet.");
            betMoney = in.nextInt();
            
        }
        int dice;
        dice = random.nextInt(6)+1;
        if (betRoll==dice){
            System.out.println("You have won! You win: $" + betMoney*6 +"!" );
            money += betRoll*6;
        }else{
            System.out.println("You lost!");
            money -= betMoney;
        }
        if(money <= 0){
            System.out.println("You are broke!");
        }else{
            rollDice();
        }
        
    }
}
