import java.time.LocalDate;

public class Perishable extends Product implements FoodWaste{

    // Attributes
    private LocalDate bestBefore;

    // Constructor
    public Perishable(String name, double price, LocalDate bestBefore){
        super(name, price);
        this.bestBefore = bestBefore;
    }

    public boolean isExpired() {
        return bestBefore.isBefore(LocalDate.now());
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

   // @Override
    public boolean isEdible() {
        return isExpired();
    }
}
