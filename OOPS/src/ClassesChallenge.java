public class ClassesChallenge {
    public static void main(String[] args) {
        bankAccount acc = new bankAccount();

        acc.setAccNo(5882);
        acc.setAccBalance(10000);
        acc.setName("Ishan Kapoor");
        acc.setEmail("kapoorishan05@gmail.com");
        acc.setPhoneNumber("9318437947");

        acc.depositFunds(500);
        acc.withdrawFunds(100);
        acc.withdrawFunds(600);
    }
}
