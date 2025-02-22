import entities.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * Criando os produtos a serem utilizados no programa
         */
        Product p1 = new Product("Notebook", 30.00);
        Product p2 = new Product("Colored pencils", 15.00);
        Product p3 = new Product("Pen", 2.50);
        Product p4 = new Product("Case", 80.00);

        ShoppingCart carrinho = new ShoppingCart(1);
        System.out.println("*".repeat(80));
        System.out.println();
        carrinho.addProduct(p1);
        carrinho.addProduct(p2);
        carrinho.addProduct(p3);
        carrinho.addProduct(p4);
        System.out.println("*".repeat(80));
        System.out.println();

        System.out.println("Your shopping cart has " + carrinho.getProductCount() + " items.");
        System.out.println("The items in your cart are: " + carrinho.getContent());
        System.out.println("The total price of the items in your cart is: " + carrinho.getTotalPrice() + " $");
        System.out.println("*".repeat(80));
        System.out.println();

        carrinho.removeProduct(p1);
        System.out.println("The items in your shopping cart are: " + carrinho.getContent());
        System.out.println();

        /*
         * Testando TV, Refrigerator e Stove
         */
        System.out.println("*".repeat(80));
        System.out.println("Testing new products: TV, Refrigerator, and Stove");

        TV tv = new TV("Samsung 55\"", 2500.00, 55);
        Refrigerator fridge = new Refrigerator("LG Frost Free", 3500.00, 400);
        Stove stove = new Stove("Brastemp 5 burners", 1800.00, 5);

        carrinho.addProduct(tv);
        carrinho.addProduct(fridge);
        carrinho.addProduct(stove);

        System.out.println("*".repeat(80));
        System.out.println("Updated cart:");
        System.out.println("Your shopping cart has " + carrinho.getProductCount() + " items.");
        System.out.println("The items in your cart are: " + carrinho.getContent());
        System.out.println("The total price of the items in your cart is: " + carrinho.getTotalPrice() + " $");
        System.out.println("*".repeat(80));
        System.out.println();

        carrinho.removeProduct(tv);
        System.out.println("After removing TV:");
        System.out.println("The items in your cart are: " + carrinho.getContent());
        System.out.println("The total price after removal: " + carrinho.getTotalPrice() + " $");
        System.out.println();
    }
}
