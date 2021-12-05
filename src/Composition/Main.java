package Composition;

public class Main {
    public static void main(String[] args){
        Dimentions dimentions = new Dimentions(60,40,20);
        //Resolution nativeResolution = new Resolution(50,25);


        Case theCase = new Case("220B", "Dell", "240", dimentions);
        Monitor monitor = new Monitor("27inch Beast","Acer",27, new Resolution(2540,1440) );
        Motherboard motherboard = new Motherboard("BJ-200","Asus", 4, 6, "v2.44" );

        PC pc = new PC(monitor, theCase, motherboard);

        pc.getMonitor().drawPixelAt(20, 15, "Red");
        pc.getMotherboard().loadProgram("Linux");
        pc.getTheCase().pressPowerButton();
    }
}
