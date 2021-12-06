package OOPfullexample;

public class DeluxeBurger extends Hamburger{
    private Boolean chips;
    private Boolean drinks;
    public DeluxeBurger() {
        super("Deluxe Burger", "Algerian", "Beef",(double)28);
        this.chips = true;
        this.drinks = true;
    }

    @Override
    public void setLettuce() {
        System.out.println("Lettuce cannot be added");
    }

    @Override
    public void setTomato() {
        System.out.println("Tomato cannot be added");
    }

    @Override
    public void setCarrot() {
        System.out.println("Carrot cannot be added");
    }

    @Override
    public void setPepper() {
        System.out.println("Pepper cannot be added");
    }

    @Override
    public void getBill() {
        System.out.println("+Chips:  included");
        System.out.println("+Drinks:  included");
        super.getBill();
    }
}
