package Exercise_1;

public class Account {

    // Laver klassens attributes

    // Deklarer int og String datatyper
    private String id, name;
    private int balance = 0;

    // Laver klassens metoder

    // En constructor der tager imod id og name arguments
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // En constructor der tager imod id, name og balance arguments
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // En metode der returner id
    public String getId() {
        return id;
    }

    // En metode der returner name
    public String getName() {
        return name;
    }

    // En metode der returner balance
    public int getBalance() {
        return balance;
    }

    // En metode til at tilføje et beløb til balance og returner det
    public int credit(int amount) {
        balance = balance + amount;
        return balance;
    }

    // En metode til at trække et beløb fra balance så længe at amount ikke er større end balance og returner det
    public int debit(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // En metode til at overføre et beløb fra en konto til en anden konto, så længe at amount ikke er større end balance
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            balance = balance - amount;
            another.balance = another.balance + amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // Returnerer klassens datatyper som en String
    @Override
    public String toString() {
        return "Exercise_1.Account[" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ']';
    }
}
