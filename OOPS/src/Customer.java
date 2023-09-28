public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;

        System.out.println("1st Constructor created.");
    }

    public Customer(){
        this("Ishan", 50000.0, "kapoorishan05@gmail.com");
        System.out.println("2nd Constructor created.");
    }

    public Customer(String name, String email){
        this(name, 20000.0, email);
        System.out.println("3rd Constructor created.");
    }
}
