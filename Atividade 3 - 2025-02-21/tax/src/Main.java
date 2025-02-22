import java.util.Scanner;
import entities.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of tax payers: ");
        int numberTaxPayers = sc.nextInt();
        sc.nextLine();
        TaxPayer[] taxpayers = new TaxPayer[numberTaxPayers];
        for(int i = 0; i<taxpayers.length; i++){
            System.out.printf("Tax payer #%d data:", i);
            System.out.print("Individual or company (i/c)? ");
            String type = sc.nextLine();
            String name;
            double annualIncome ;
            double healthExpenditures;
            int numberOfEmployees;
            do{
                if(type.equalsIgnoreCase("i")){
                    System.out.print("Name: ");
                    name = sc.nextLine();
                    annualIncome = sc.nextDouble();
                    healthExpenditures = sc.nextDouble();
                    sc.nextLine();
                    taxpayers[i] = new Individual(name, annualIncome, healthExpenditures);


                }
                else if(type.equalsIgnoreCase("c")){
                    System.out.print("Name: ");
                    name = sc.nextLine();
                    annualIncome = sc.nextDouble();
                    numberOfEmployees = sc.nextInt();
                    sc.nextLine();
                    taxpayers[i] = new Company(name, annualIncome, numberOfEmployees);
                }
                else{
                    System.out.println("Digite um valor válido!");
                }
    
            } while(!type.equalsIgnoreCase("i") || !type.equalsIgnoreCase("c"));
        }

        double totalTaxes = 0.0;
        System.out.println("TAXES PAID:");
        for (TaxPayer taxPayer : taxpayers) {
            System.out.println(taxPayer.toString());
            totalTaxes += taxPayer.calculateTax();
        }

        System.out.printf("TOTAL TAXES: $ %.2f", totalTaxes);

        sc.close();
    }
}
