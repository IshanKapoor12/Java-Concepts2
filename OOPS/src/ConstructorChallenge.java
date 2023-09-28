public class ConstructorChallenge {
    public static void main(String[] args) {
        Customer c1 = new Customer("Ishita", 100000.0, "kapoorishita123@gmail");
        System.out.println("Name = "+c1.getName());

        Customer c2 = new Customer();
        System.out.println("Credit Limit = "+c2.getCreditLimit());

        Customer c3 = new Customer("Neetu", "kapoorneetu77@gmail.com");
        System.out.println("Email = "+c3.getEmail());
    }
}
