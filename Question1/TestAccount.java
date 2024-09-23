package Question1;

public class TestAccount {
    public static void main(String[] args)
    {
        //Creating Both Accounts
        Account ac1 = new Account("A101", "Logan", 5000);
        Account ac2 = new Account("A102", "Sidney", 4000);
        
        //Displaying Balance using getBalance()
        System.err.println("Balance Of AC1: " + ac1.getBalance());
        System.err.println("Balance Of AC2: " + ac2.getBalance());

        //Transferring 1000$ From One Account
        ac1.transferTo(ac2, 1000);

        //Displaying Balance
        System.out.println("After transfer...");
        
        System.out.println("Balance of Acc1: " + ac1.getBalance());
        System.out.println("Balance of Acc2: " + ac2.getBalance());
    }

}
