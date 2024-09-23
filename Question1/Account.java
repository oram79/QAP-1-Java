package Question1;

public class Account {
    //Private Variables
    private String id;
    private String name;
    private int balance = 0;

    //Fist Constructor
    public Account(String id, String name)
    {
        this .id = id;
        this.name = name;
    }
    //Second Constructor
    public Account(String id, String name, int balance)
    {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }

    //Credit The Account
    public int credit(int amount)
    {
        balance += amount;
        return balance;
    }

    //Debit The Account
    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.err.println("Amount Exceeded Balance");
        }
        return balance;
    }

    // Transferring Balance Between Accounts
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.debit(amount);
            another.credit(amount);
        } else {
            System.err.println("Amount Exceeded Balance");
        }
        return balance;
    }

    //Displaying Account info
    public String toString()
    {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}
