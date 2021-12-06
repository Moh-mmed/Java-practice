package OOPfullexample;

public class HealthyBurger extends Hamburger{
    private Boolean hotPepper;
    private Boolean cheese;
    public HealthyBurger() {
        super("Healthy Burger", "Italian", "Gazelle",22.5);
        this.hotPepper = false;
        this.cheese = false;
    }

    public void setHotPepper() {
        this.hotPepper = true;
        double price = this.getFinalPrice() + 5;
        this.setFinalPrice(price);
    }

    public void setCheese() {
        this.cheese = true;
        double price = this.getFinalPrice() + 10;
        this.setFinalPrice(price);
    }

    @Override
    public void getBill() {
        if(cheese)System.out.println("+Cheese:  $10");
        if(hotPepper)System.out.println("+Hot pepper:  $5");
        super.getBill();
    }
}
