public class Raff extends BaseCoffee{
    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    private String taste;
    public Raff(String size, int temperature, int price, String type, String taste) {
        super(size, temperature, price, type);
        this.taste = taste;
    }

    @Override
    public String toString() {
        return super.toString() + ", taste=" + taste;
    }
}
