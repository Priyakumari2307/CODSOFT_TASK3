import java.util.*;
public class atm {
    private String name;
    private String holdername ;
    private int pin;
    private int accnum ;
    private float balance = 50000f ;
    private int transa = 0;
     private Scanner scanner = new Scanner(System.in);
     public void register(){
        System.out.println(" Enter Name :-");
        this.name = scanner.nextLine();
        System.out.println(" Enter Holder Name :-");
        this.holdername = scanner.nextLine();
        System.out.println("Enter PIN :-");
        this.pin = scanner.nextInt();
        System.out.println("Enter Account Number :-");
        this.accnum = scanner.nextInt();
        System.out.println(" Your registration will be finish , the next to go for login ");
     }
        public void withdraw() {
            System.out.println("enter amount :-");
            float amount = scanner.nextFloat();
            if (balance >= amount) {
                transa++;
                balance -= amount;
                System.out.println("your transaction will be Successfully withdraw");
            }else{
                System.out.println("sorry , insufficient amount present");
            }
        }
        public void deposit(){
            System.out.println("enter your amount deposit");
            float amount = scanner.nextFloat();
            if(amount <= 50000f){
                transa++;
                balance += amount;
                System.out.println("your transaction will be successfully deposit");
            }else {
                System.out.println("sorry , if you deposit then amount will be above the limit");
            }
        }
        public void balance (){
            System.out.println("Balance : "+balance);  
            System.out.println("");  
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            atm atm = new atm();
            int choice ;
            do {
                System.out.println("Description of ATM for user's ");
                System.out.println("press 1 , for Registration");
                System.out.println("press 2 , for Withdraw");
                System.out.println("press 3 , for Deposit");
                System.out.println("press 4 , for balance");                
                System.out.println("press 5, for QUIT");
                System.out.println("please , enter your choice !");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        atm.register();
                        break;
                    case 2 :
                         atm.withdraw();
                        break;
                    case 3 :
                        atm.deposit();
                       break;
                    case 4 :
                      atm.balance();
                       break;
                    case 5 :
                       System.out.println("Thankyou for using aur service !");
                       break;
                    default:
                       System.out.println("invalid input , please try again");
                }
            }while(choice != 5);
        }
     }
