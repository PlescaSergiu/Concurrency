package project_gate;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FestivalGate {

    private List<TicketsEnum> gate = new ArrayList<>();


    public void addTicket(TicketsEnum tickets) {
        gate.add(tickets);

    }

    public void getGateDetailes(List gate){
        System.out.println("Au intrat" + gate.size());
        System.out.println();
    }




}







