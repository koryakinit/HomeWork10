public class Dog extends Animal {

    static int counterDog;
    private final int RUN_LIMIT = 500;
    private final int SWIM_LIMIT = 10;

    public Dog(String name) {
        super(name);
        counterDog++;
        counterAnimal++;
    }

    @Override
    void run(int distance) {
        if (distance < 0) {
            System.out.println("Собака " + this.name + " бежать с отрицательной скоротью: " + distance + " м, не может. ");
            return;
        }
        System.out.println((distance > this.RUN_LIMIT) ? "Собака " + this.name + " не может столько бегать" + distance + " м,ограничение: " + this.RUN_LIMIT
                    + " м" : "Собака " + this.name + " успешно пробежала: " + distance + " м");
    }


    @Override
    void swim(int distance) {
        if (distance < 0) {
            System.out.println("Собака " + this.name + " плыть с отрицательной скоротью: " + distance + " не может. ");
            return;
        }
        System.out.println((distance > this.SWIM_LIMIT) ? "Собака " + this.name + " не может столько плыть: " + distance + " м,ограничение: " + this.SWIM_LIMIT
                + " м" : "Собака " + this.name + " успешно проплыла: " + distance + " м");


    }
}
