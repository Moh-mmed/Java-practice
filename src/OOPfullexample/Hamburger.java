package OOPfullexample;

public class Hamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private Boolean lettuce;
    private Boolean tomato;
    private Boolean carrot;
    private Boolean pepper;
    private double price;
    private double finalPrice;

    public Hamburger() {
        this("Base Burger", "Brioche", "Lamp", 12.0 );
    }

    public Hamburger(String name, String breadRollType, String meat, Double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.lettuce = false;
        this.tomato = false;
        this.carrot = false;
        this.pepper = false;
        this.price = price;
        this.finalPrice = price;
    }

    public void setLettuce() {
        this.lettuce = true;
        this.finalPrice += 1;
    }

    public void setTomato() {
        this.tomato = true;
        this.finalPrice += 1;
    }

    public void setCarrot() {
        this.carrot = true;
        this.finalPrice += 1;
    }

    public void setPepper() {
        this.pepper = true;
        this.finalPrice += 1;
    }

    public void setFinalPrice(double price) {
        this.finalPrice = price;
    }

    public String getName(){
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }

    public double getFinalPrice(){
        return this.finalPrice;
    }
    public void getBill(){
        if(tomato)System.out.println("+Tomato:  $1");
        if(carrot)System.out.println("+Carrot:  $1");
        if(pepper)System.out.println("+Pepper:  $1");
        if(lettuce)System.out.println("+Lettuce:  $1");
        System.out.println(this.name + " cost: $"+ this.price +
                " Using "+this.breadRollType+" Bread, and "+this.meat+" meat"+"\nFinal price: $" + this.finalPrice + "\n");
    }
}
