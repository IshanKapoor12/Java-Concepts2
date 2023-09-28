public class SalariedEmployee extends Employee {
    double annualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {
        double paycheck = Math.round(annualSalary/26)/100.0;

        return (isRetired) ? 0.9*paycheck:paycheck;
    }

    public void retire(){
        terminate("12/12/2025");
        isRetired = true;
    }
}
