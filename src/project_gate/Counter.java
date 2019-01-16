package project_gate;

import java.util.Random;

public class Counter  {

    public void counter() throws  Exception{
        FestivalGate gate = new FestivalGate();
        Festival festival = new Festival(gate);
        int random =  (int)(Math.random() * 200 + 100);

        festival.start();
        System.out.println("Sau vandut " + random);
        for (int i = 1; i <=random; i++) {
            TicketsEnum ticketsEnum= TicketsEnum.values()[new Random().nextInt(TicketsEnum.values().length)];
            Thread counter = new FestivalAttendeeThread(ticketsEnum, gate);
            counter.start();
            Thread.sleep(500);
            counter.join();
        }

    }


}
