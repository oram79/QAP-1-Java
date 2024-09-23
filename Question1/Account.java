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
}
