package Sweet;

public class ChokolateBar extends Box {

    private String flavor;

    public ChokolateBar(String name, double weight, double price, String flavor) {
        super(name, weight, price);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return "Chocolate Bar: [" + super.toString() + ", Flavor: " + flavor + "]";
    }
}
