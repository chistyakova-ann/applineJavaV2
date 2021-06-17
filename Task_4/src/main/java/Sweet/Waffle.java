package Sweet;

public class Waffle extends Box {

    private boolean glaze;

    public Waffle(String name, double weight, double price, boolean glase) {
        super(name, weight, price);
        this.glaze = glase;
    }

    public boolean isGlaze() {
        return glaze;
    }

    public void setGlaze(boolean glaze) {
        this.glaze = glaze;
    }

    @Override
    public String toString() {
        return "Waffle: [" + super.toString() + ", Glase: " + glaze + "]";
    }
}
