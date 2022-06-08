public class Tiger extends Animal {

    final static int RUN_LIMIT = 1000;
    final static int SWIM_LIMIT = 300;
    static int counterTiger;

    public Tiger(String name) {
        super(name);
        counterTiger++;
        counterAnimal++;
    }

    @Override
    void run(int distance) {
        if (distance < 0) {
            System.out.println("Тигр " + this.name + " бежать с отрицательной скоротью: " + distance + " м, не может. ");
            return;
        }
        System.out.println((distance > this.RUN_LIMIT) ? "Тигр " + this.name + " не может столько бегать" + distance + " м,ограничение: " + this.RUN_LIMIT
                + " м" : "Тигр " + this.name + " успешно пробежал: " + distance + " м");
    }


    @Override
    void swim(int distance) {
        if (distance < 0) {
            System.out.println("Тигр " + this.name + " плыть с отрицательной скоротью: " + distance + " не может. ");
            return;
        }
        System.out.println((distance > this.SWIM_LIMIT) ? "Тигр " + this.name + " не может столько плыть: " + distance + " м,ограничение: " + this.SWIM_LIMIT
                + " м" : "Тигр " + this.name + " успешно проплыл: " + distance + " м");


    }
}
