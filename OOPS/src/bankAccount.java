public class bankAccount {
    private int accNo;
    private double accBalance;
    private String name;
    private String email;
    private String phoneNumber;

    public int getAccNo() {
        return accNo;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double money){
        accBalance += money;
        System.out.println("Deposit of Rs "+money+" made. New balance is Rs "+this.accBalance);
    }

    public void withdrawFunds(double money){
        if(accBalance<money){
            System.out.println("insufficient Funds! You only have Rs "+this.accBalance+" in your account.");
        }
        else{
            accBalance -= money;
            System.out.println("Withdrawal of Rs "+money+" processed, Remaining balance = Rs. "+this.accBalance);
        }
    }
}
