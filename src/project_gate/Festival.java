package project_gate;

public class Festival extends Thread {


    private double random =  Math.random() * 100 + 1;

    private FestivalGate gate;


    Festival(FestivalGate gate){
        this.gate = gate;
    }


    @Override
    public void run() {
        do {
            gate.getGateDetailes();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }while (random != 0 );

    }
}
