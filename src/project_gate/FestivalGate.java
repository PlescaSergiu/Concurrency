package project_gate;


import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.frequency;
import static project_gate.TicketsEnum.*;

public class FestivalGate extends Thread {

    private List<TicketsEnum> enumList = new ArrayList<>();


    public void addTicket(TicketsEnum tickets) {
        enumList.add(tickets);

    }

    public void getGateDetailes() {
        System.out.println("Au intrat" + enumList.size());
        System.out.println("Full - " + frequency(enumList, Full) + " Full_Vip - " +
                frequency(enumList, Full_Vip) + " Full_Vip - " + frequency(enumList, One_Day) +
                " Full_Vip - " + frequency(enumList, One_Day_Vip) + " Free_Pass - " + frequency(enumList, Free_Pass));


    }


}







