package Composition;

public class PC  {
    private Monitor monitor;
    private Case theCase;
    private Motherboard motherboard;

    public PC(Monitor monitor, Case theCase, Motherboard motherboard) {
        this.monitor = monitor;
        this.theCase = theCase;
        this.motherboard = motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
