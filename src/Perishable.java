import java.time.LocalDate;

public class Perishable extends Product{

    // Attributes
    private LocalDate bestBefore;

    // Constructor
    public Perishable(String name, double price, LocalDate bestBefore){
        super(name, price);
        this.bestBefore = bestBefore;
    }

    // Methods
    @Override
    public String toString(){
        String s = super.toString();
        return s + " and is best before "+bestBefore;
    }

    // Accessors
    public LocalDate getBestBefore() {
        return bestBefore;
    }

    // Mutators
    public void setBestBefore(LocalDate bestBefore) {
        this.bestBefore = bestBefore;
    }
}
