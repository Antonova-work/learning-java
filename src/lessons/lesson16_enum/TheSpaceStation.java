package lessons.lesson16_enum;

enum MissionStatus {
    READY, FLYING, LANDED, CANCELED
}

public class TheSpaceStation {
    public static void main(String[] args) {
        SpaceRocket newSpaceUnit = new SpaceRocket("Ракета");
        newSpaceUnit.report();

        try {
            newSpaceUnit.launch();
        } catch (RuntimeException e) {
            System.out.println("Внимание! Полет отменен: " + e.getMessage());
        }
    }
}


abstract class SpaceUnit {
    String name;
    MissionStatus status;

    public SpaceUnit(String newName) {
        this.name = newName;
        this.status = MissionStatus.READY;
    }

    abstract void report();
}

interface Movable {
    void launch();
}

class SpaceRocket extends SpaceUnit implements Movable {
    int fuel = 0;

    public SpaceRocket(String name) {
        super(name);
    }

    public void launch() {

        if (fuel == 0 ) {
            status = MissionStatus.CANCELED;
            System.out.println("Новый статус: "  + status);
            throw new RuntimeException("Ошибка! Нет топлива для взлета.");
        } else {
            status = MissionStatus.FLYING;
            System.out.println("Ракета запущена!");
        }
    }

    @Override
    void report() {
        System.out.println(name);
        System.out.println(status);
    }
}