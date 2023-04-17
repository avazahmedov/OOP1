public class Latte extends BaseCoffee {

    public String getSyrup() {
        return syrup;
    }
    public void setSyrup(String syrup) {
        this.syrup = syrup;
    }

    private String syrup;
    public Latte(String size, int temperature, int price, String type, String syrup) {
        super(size, temperature, price, type);
        this.syrup = syrup;
    }

    @Override
    public String toString() {
        return super.toString() + ", syrup=" + syrup;
    }
}
