package Exercise_1;

public class TestAccount {

    public static void main(String[] args) {

        // Laver et Account objekt ved at kalde på dens constructor.
        Account account_Med_ID_Name = new Account("1", "Erik");

        // Laver et Account objekt ved at kalde på dens constructor.
        Account account_Med_ID_Name_Balance = new Account("2", "Mads", 1000);

        // Henter dens ID
        System.out.println(account_Med_ID_Name.getId());

        // Henter dens name
        System.out.println(account_Med_ID_Name_Balance.getName());

        // Henter dens balance
        System.out.println(account_Med_ID_Name_Balance.getBalance());

        // Tilføjer et beløb til balance og henter dens balance
        System.out.println(account_Med_ID_Name.credit(2000));

        // Tager et beløb fra balance og henter dens balance
        System.out.println(account_Med_ID_Name.debit(50));

        // Tager et beløb fra balance og overfører det til den anden konto's balance
        System.out.println(account_Med_ID_Name.transferTo(account_Med_ID_Name_Balance, 100));

        // Udskriver Accounts toString
        System.out.println(account_Med_ID_Name_Balance.toString());

    }

}
