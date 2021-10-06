public class MetroStation {

    private int entrance;
    private TicketCounter ticketCounter;
    private TicketControl ticketControl;
    private SecurityGate securityGate;
    private Metro metro;

    public MetroStation(int entrance,
                        TicketCounter ticketCounter,
                        TicketControl ticketControl,
                        SecurityGate securityGate,
                        Metro metro
    ) {
        this.entrance = entrance;
        this.ticketCounter = ticketCounter;
        this.ticketControl = ticketControl;
        this.securityGate = securityGate;
        this.metro = metro;
    }

    public int getEntrance() {
        return entrance;
    }

    public void setEntrance(int entrance) {
        this.entrance = entrance;
    }

    public TicketCounter getTicketCounter() {
        return ticketCounter;
    }

    public void setTicketCounter(TicketCounter ticketCounter) {
        this.ticketCounter = ticketCounter;
    }

    public TicketControl getTicketControl() {
        return ticketControl;
    }

    public void setTicketControl(TicketControl ticketControl) {
        this.ticketControl = ticketControl;
    }

    public SecurityGate getSecurityGate() {
        return securityGate;
    }

    public void setSecurityGate(SecurityGate securityGate) {
        this.securityGate = securityGate;
    }

    public Metro getMetro() {
        return metro;
    }

    public void setMetro(Metro metro) {
        this.metro = metro;
    }
}
