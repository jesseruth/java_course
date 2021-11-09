package uw.cp510.assignments.assignment3;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


public class Assignment3Test {
    private BankAccount checking;
    private BankAccount savings;

    @BeforeAll
    public static void setupBeforeAll() {
        System.out.println("startup - creating DB connection");
    }

    @Before
    public void init() {
        System.out.println("startup Before");
        checking = new BankAccount("Sabahat", "Checking");
        savings = new BankAccount("Sabahat", "Saving");
    }

    @BeforeEach
    void setup() {
        System.out.println("startup Before Each");
    }

    @Test
    public void canDeposit()
    {
        checking.deposit(80.00);
        assertTrue( checking.getBalance() == 80.00 );
    }


    @Test
    public void canWithdrawl()
    {
        double withdrawl = 40.00;
        double initialBalance = 80.00;
        checking.deposit(initialBalance);
        checking.withDrawl(withdrawl);
        double expected = initialBalance - withdrawl - checking.getTransactionFee();
        assertTrue( checking.getBalance() == expected );
    }

    @Test
    public void shouldBeExpectedAccountType()
    {
        assertTrue( checking.getType().equals("Checking") );
        assertTrue( savings.getType().equals("Saving") );
    }

    @Test
    public void deposit100()
    {
        checking.deposit(100.00);
        assertTrue( checking.getBalance() == 100.00 );
    }
}
