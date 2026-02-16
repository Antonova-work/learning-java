package lessons.lesson15_abstracts;

public class AutomatedWarehouse {
    public static void main(String[] args) {
        RobotWorker newRobotWorker = new RobotWorker("Робот");
        HumanWorker newHumanWorker = new HumanWorker("Саша");

        newRobotWorker.charge();
        newRobotWorker.doWork();
        newHumanWorker.promote();
        newHumanWorker.doWork();
    }
}

abstract class Worker {
    String name;

    public Worker (String newName) {
        this.name = newName;
    }

    abstract void doWork();

}

interface Chargeable {
    void charge ();
}

interface Promotable {
    void promote();
}

class RobotWorker extends Worker implements Chargeable {

    public RobotWorker (String name) {
        super(name);
    }

    @Override
    public void charge() {
        System.out.println("Робот подключен к сети, уровень заряда 100%");
    }

    @Override
    void doWork() {
        System.out.println("Я работаю на складе!");
    }
}

class HumanWorker extends Worker implements Promotable {

    public HumanWorker (String name) {
        super(name);
    }

    public void promote () {
        System.out.println("Сотрудник повышен в должности за отличную работу!");
    }

    @Override
    void doWork() {
        System.out.println("Я работаю на складе!");
    }
}