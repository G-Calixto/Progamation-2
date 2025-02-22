package entities;

public abstract class TaxPayer {
    private String name;
    private double annualIncome;  

    public TaxPayer(String name, double annualIncome){
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public abstract double calculateTax();

    public String getName() {
        return name;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public String toString() {
        return "Name: "
                + this.getName()
                + " $ "
                + String.format("%.2f", calculateTax());
    }

    

}

