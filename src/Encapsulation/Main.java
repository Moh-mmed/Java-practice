package Encapsulation;

public class Main {
    public static void main(String[] args){
//        Player player = new Player();
//        player.name = "Moha";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining Health = " + player.healthRemaining());



        // Enhanced Player

//        EnhancedPlayer player = new EnhancedPlayer("Moha", 90, "Sword");
//        System.out.println("Player health is: " + player.getHealth());


        // Printer

        Printer printer = new Printer(50, false);
        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
    }
}
