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
        System.out.println("The items on your cart are: " + carrinho.getContent());
        System.out.println("The total price of your shopping cart is: " + carrinho.getTotalPrice() + " $");
        System.out.println("*".repeat(80));
        System.out.println();

        carrinho.removeProduct(p1);
        System.out.println("The items in your shopping cart are: " + carrinho.getContent());
        System.out.println();






    }
}

























