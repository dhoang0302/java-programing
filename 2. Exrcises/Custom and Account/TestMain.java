public class TestMain {
    public static void main(String[] args) {
        Customer c1 = new Customer(101, "Dh", 'm');
        System.out.println("Customer Info:");
        System.out.println("ID: " + c1.getId());
        System.out.println("Name: " + c1.getName());
        System.out.println("Gender: " + c1.getGender());
        System.out.println("toString: " + c1);

        System.out.println();

        Account a1 = new Account(1001, c1, 500.0);
        System.out.println("Account Info:");
        System.out.println("ID: " + a1.getId());
        System.out.println("Customer: " + a1.getCustomer());
        System.out.println("Customer Name: " + a1.getCustomerName());
        System.out.println("Balance: $" + a1.getBalance());
        System.out.println("toString: " + a1);

        System.out.println();

        System.out.println("Deposit $200...");
        a1.deposit(200);
        System.out.println("New Balance: $" + a1.getBalance());

        System.out.println("Withdraw $100...");
        a1.withdraw(100);
        System.out.println("New Balance: $" + a1.getBalance());

        System.out.println("Withdraw $1000 (should show warning)...");
        a1.withdraw(1000);
        System.out.println("Final Account: " + a1);
    }
}
