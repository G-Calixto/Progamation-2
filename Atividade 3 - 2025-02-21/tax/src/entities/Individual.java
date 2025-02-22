package entities;

public class Individual extends TaxPayer{
    private double healthExpenditures;

    public Individual(String name, double annualIncome, double healthExpenditures){
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }
    
    @Override
    public double calculateTax(){
        if(getAnnualIncome()< 20000){
            return (getAnnualIncome()*0.15) - (healthExpenditures*0.5);
        }
        else{
            return (getAnnualIncome()*0.25) - (healthExpenditures*0.5);

        }
    }

}
