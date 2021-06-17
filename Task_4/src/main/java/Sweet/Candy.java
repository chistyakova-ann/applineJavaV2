package Sweet;

public class Candy extends Box {
    private String sort;

    public Candy(String name, double weight, double price, String sort) {
        super(name, weight, price);
        this.sort = sort;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Candy: [" + super.toString() + ", Sort: " + sort + "]";
    }
}
