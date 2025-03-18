import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Instantiate Product objects
        Product stol = new Product("Dubai_Trone_lettere_brugt",420000);
        Product shirt = new Product("Dubai_T-Shirt",2099.95);

        // Instantiate Perishable objects
        Perishable chokolade = new Perishable("Dubai_Chokolade", 4299, LocalDate.of(2025,3,20));
        Perishable gifler = new Perishable("Dubai_kanel_Gifler_special edition 1987 version limited ©", 20, LocalDate.now().minusDays(2));

        // Add products to ArrayList
        ArrayList<Product> products = new ArrayList<>();
        products.add(stol);
        products.add(shirt);
        products.add(chokolade);
        products.add(gifler);
        
        // Print toString 
        for (Product p : products){
            System.out.println(p.toString()); //toString er polymorf metode
        }
    }
}

