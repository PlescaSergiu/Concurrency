package project_gate;

public class FestivalAttendeeThread implements Runnable {

    private TicketsEnum ticketsEnum;

    public FestivalAttendeeThread(TicketsEnum ticketsEnum) {
        this.ticketsEnum = ticketsEnum;
        System.out.println(ticketsEnum);
    }

    @Override
    public void run() {

    }
}

