package entities;

public class Company extends TaxPayer {
    private int numberOfEmployees;

    public Company(String name, double annualIncome, int numberOfEmployees){
        super(name, annualIncome);
        this. numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double calculateTax(){
        if(numberOfEmployees >= 10){
            return getAnnualIncome() * 0.16;
        }
        else{
            return getAnnualIncome() * 0.14;
        }
    }

}
