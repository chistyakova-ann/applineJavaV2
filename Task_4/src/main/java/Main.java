import Sweet.*;

public class Main {
    public static void main(String[] args) {
        double priceBox = 0;
        double weightBox = 0;
        Candy candy = new Candy("Chupa-chups", 52.5, 45, "Леденец");
        ChokolateBar chokolateBar = new ChokolateBar("Alpen Gold", 200, 95, " Горький");
        Cookies cookies = new Cookies("Oreo", 150, 123, 20);
        Jellybean jellybean = new Jellybean("Jelly Belly", 50, 339, true);
        Waffle waffle = new Waffle("Яшкино", 300, 85, false);
        priceBox = candy.getPrice() + chokolateBar.getPrice() + cookies.getPrice() + jellybean.getPrice() + waffle.getPrice();
        weightBox = candy.getWeight() + chokolateBar.getWeight() + cookies.getWeight() + jellybean.getWeight() + waffle.getWeight();
        System.out.println("Общая цена подарка: " + priceBox);
        System.out.println("Общий вес подарка: " + weightBox);

        Box[] box = {candy, chokolateBar, cookies, jellybean, waffle};
        for (Box box1 : box) {
            System.out.println(box1.toString());
        }
    }
}
