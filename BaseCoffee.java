public class BaseCoffee {
    private String size;
    private int temperature;
    private int price;
    private String type;

    public BaseCoffee(String size, int temperature, int price, String type) {
        this.size = size;
        this.temperature = temperature;
        this.price = price;
        this.type = type;
    }

    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getSize() {
        return size;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }



    @Override
    public String toString() {
        return "Coffee:" +
                "size='" + size + '\'' +
                ", temperature=" + temperature +
                ", price=" + price +
                ", type=" + type;
    }
}
