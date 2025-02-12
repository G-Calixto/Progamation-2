package entities;
import entities.Product;
import java.util.ArrayList;

public class ShoppingCart {
    private int customerID;
    private ArrayList<Product> productsList;

    public ShoppingCart(int customerID) {
        this.customerID = customerID;
        this.productsList = new ArrayList<>();
    }

    public void addProduct( Product product){
        this.productsList.add(product);
        System.out.println("The product " + product.getName() +" that custs " + product.getPrice()+ " $ was added to your shopping cart");
    }

    public void removeProduct( Product product){
        this.productsList.remove(product);
        System.out.println("The product " + product.getName() +" that custs " + product.getPrice()+ " $ was removed from your shopping cart");
    }
    public int getCustomerID() {
        return customerID;
    }

    public String getContent(){
        if(productsList.isEmpty()){
            return "No products added to shopping cart\n";
        }
        StringBuilder contentCart = new StringBuilder();
        for(Product product: productsList){
            contentCart.append(product.getName()).append(", ");
        }
        return contentCart.substring(0, contentCart.length() - 2);
    }

    public int getProductCount(){
        return productsList.size();
    }

    public double getTotalPrice(){
        double totalPrice = 0;
        for(Product product : productsList){
            totalPrice += product.getPrice();

        }
        return totalPrice;
    }

}
