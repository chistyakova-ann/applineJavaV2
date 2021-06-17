package Sweet;

public class Cookies extends Box {

    private int count;

    public Cookies(String name, double weight, double price, int count) {
        super(name, weight, price);
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Cookies: [" + super.toString() + ", Count: " + count + "]";
    }
}
