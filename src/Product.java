public class Product extends Object {

    // Attributes
    private double price;
    private String name;

    //Constructor
    public Product(String name, double price) {
        this.price = price;
        this.name = name;
    }

    // Methods
    @Override
    public String toString() {
        String s = this.name + ": " + this.price;
        return s;
    }

    // Accessors
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    // Mutators
    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
}
