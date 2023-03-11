import java.util.*;




class TestBankAccount{
    int balance=0;
    void deposit(int amt){
        balance = balance+amt;
    }
    void withdraw(){
        System.out.println("Enter the amount to withdraw");
        Scanner sc = new Scanner(System.in);
        int with;
        with = sc.nextInt();
        if(with<= balance){
            balance = balance-with;

            System.out.println("Your left amount"+balance);
        }
        else{
            System.out.println("Invalid amount");
        }
    }
       public static void main(String[] args) {
        
        TestBankAccount t1 = new TestBankAccount();
        System.out.println("Enter amont to deposit");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        t1.deposit(amount);
        t1.withdraw();
       
    }
}
