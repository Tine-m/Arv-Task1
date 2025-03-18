import java.time.LocalDate;
import java.util.ArrayList;

public class ProductCatalogue {

    //ArrayList af typen Product
    ArrayList<Product> productList = new ArrayList<>();


    // addProduct method (name, price)
    public void addProduct(String name, double price) {
        // Product product = new Product(name, price);
        productList.add(new Product(name, price));

    }

    //
    public void addProduct(String name, double price, LocalDate bestBefore) {
        productList.add(new Perishable(name, price, bestBefore));

    }

    public void printCatalog(){
        for(Product n : productList){
            System.out.println(n.getName()) ;
            //System.out.println(n.) ;

        }
    }

    public void printCatalogue() {
    }
}

