public class Сappuccino extends BaseCoffee{
    public String getMilk() {
        return milk;
    }
    public void setMilk(String milk) {
        this.milk = milk;
    }

    private String milk;
    public Сappuccino(String size, int temperature, int price, String type, String milk) {
        super(size, temperature, price, type);
        this.milk = milk;
    }

    @Override
    public String toString() {
        return super.toString() + ", milk=" + milk;
    }
}
