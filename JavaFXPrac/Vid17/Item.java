public class Item {
    private String name;
    private double value;
    private int quantity;

    public Item() {
        this.name = "DefaultName";
        this.value = 0.0;
        this.quantity = 0;
    }

    public Item(String name, double value, int quantity) {
        this.name = name;
        this.value = value;
        this.quantity = quantity;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getValue() {
        return this.value;
    }
    public void setValue(double value) {
        this.value = value;
    }
    public int getQuantity() {
        return this.quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}