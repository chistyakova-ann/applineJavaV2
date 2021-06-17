package Sweet;

public class Jellybean extends Box {
    private boolean withSurprise;

    public Jellybean(String name, double weight, double price, boolean withSurprise) {
        super(name, weight, price);
        this.withSurprise = withSurprise;
    }

    public boolean isWithSurprise() {
        return withSurprise;
    }

    public void setWithSurprise(boolean withSurprise) {
        this.withSurprise = withSurprise;
    }

    @Override
    public String toString() {
        return "Jellybean: [" + super.toString() + ", With Surprise: " + withSurprise + "]";
    }
}
