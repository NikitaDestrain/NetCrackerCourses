package buildings.threads;

import buildings.interfaces.Floor;
import buildings.interfaces.Space;

public class Cleaner extends Thread {
    private Floor floor;

    public Cleaner(Floor floor) {
        this.floor = floor;
    }

    @Override
    public void run() {
        int i = 1;
        for (Space space : floor) {
            System.out.printf("Cleaning room number %d with total area %.2f square meters.\n", i++, space.getArea());
        }
    }
}
