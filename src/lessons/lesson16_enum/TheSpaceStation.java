package lessons.lesson16_enum;

enum MissionStatus {
    READY, FLYING, LANDED
}

public class TheSpaceStation {
    public static void main(String[] args) {
        SpaceRocket newSpaceUnit = new SpaceRocket("Ракета");
        newSpaceUnit.report();
        newSpaceUnit.launch();
    }
}


abstract class SpaceUnit {
    String name;
    MissionStatus status;

    public SpaceUnit (String newName) {
        this.name = newName;
        this.status = MissionStatus.READY;
    }

    abstract void report();
}

interface Movable {
    void launch ();
}

class SpaceRocket extends SpaceUnit implements Movable {

     public SpaceRocket (String name) {
        super(name);
    }

    public void launch() {
        status = MissionStatus.FLYING;
        System.out.println("Ракета запущена!");
    }

    @Override
    void report() {
        System.out.println(name);
        System.out.println(status);
    }
}