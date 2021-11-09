package uw.cp510.assignments.assignment3;

/**
 * Executes the assigment3 class BankAccount.
 * @author Jesse Ruth
 */
public class BankAccountDriver {
    public static void main(String[] args) {
        BankAccount checking = new BankAccount("Sabahat", "Checking");
        checking.deposit(80.00);


        BankAccount savings = new BankAccount("Sabahat", "Savings");
        savings.deposit(20.00);

        System.out.println("Initial balance:");
        System.out.println(checking.toString());
        System.out.println(savings.toString());

        System.out.println("Transfering $20 to savings.....");
        checking.transfer(savings, 20.00);  //checking $55, savings $40 (checking -$25, savings +$20)
        System.out.println(checking.toString());
        System.out.println(savings.toString());

        System.out.println("Transfering $10 to savings.....");
        checking.transfer(savings, 10.00);  //checking $40, savings $50 (checking -$15, savings +$10)
        System.out.println(checking.toString());
        System.out.println(savings.toString());

        System.out.println("Transfering $60 to checking.....");
        savings.transfer(checking, 60.00);  //checking $85, savings $0 (checking +$45, savings -$50)
        System.out.println(checking.toString());
        System.out.println(savings.toString());
    }
}
