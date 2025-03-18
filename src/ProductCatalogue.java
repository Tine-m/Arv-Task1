import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProductCatalogue {

    //ArrayList af typen Product
    List<Product> productList = new ArrayList<>();

    List<Product> productList2 = new LinkedList<>();

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
            System.out.print(n.toString()) ;
            if (n instanceof Perishable) {
                System.out.print(" " +((Perishable) n).isExpired());
                ((Perishable) n).isEdible();
            }
            System.out.println() ;
        }
    }

    public void printCatalogue() {
    }
}

