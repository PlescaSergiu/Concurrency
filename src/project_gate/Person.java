package project_gate;

import java.util.List;

public class Person implements Runnable{

    public Person(List<Integer> numbers) {
        numbers.add((int)(Math.random() * 5 + 1));
    }

    public void run() {
    }

}
