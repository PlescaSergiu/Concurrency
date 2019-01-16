package project_gate;

public class FestivalAttendeeThread extends Thread {

    private TicketsEnum ticketsEnum;

    public FestivalAttendeeThread(TicketsEnum ticketsEnum, FestivalGate gate) {
        this.ticketsEnum = ticketsEnum;
        gate.addTicket(ticketsEnum);
    }

    @Override
    public void run() {
        System.out.println("entred person with " + ticketsEnum );

    }

}

