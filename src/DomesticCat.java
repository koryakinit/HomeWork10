public class DomesticCat extends Animal {

    final static int RUN_LIMIT = 200;
    final static int SWIM_LIMIT = 0;
    static int counterDomesticCat;

    public DomesticCat(String name) {
        super(name);
        counterDomesticCat++;
        counterAnimal++;
    }

    @Override
    void run(int distance) {
        if (distance < 0) {
            System.out.println("Домашний кот " + this.name + " бежать с отрицательной скоротью: " + distance + " м, не может. ");
            return;
        }
        System.out.println((distance > this.RUN_LIMIT) ? "Домашний кот " + this.name + " не может столько бегать" + distance + " м,ограничение: " + this.RUN_LIMIT
                + " м" : "Домашний кот " + this.name + " успешно пробежал: " + distance + " м");
    }


    @Override
    void swim(int distance) {
        if (distance < 0) {
            System.out.println("Домашний кот " + this.name + " плыть с отрицательной скоротью: " + distance + " не может. ");
            return;
        }
        System.out.println((distance > this.SWIM_LIMIT) ? "Домашний кот " + this.name + " не может столько плыть: " + distance + " м,ограничение: " + this.SWIM_LIMIT
                + " м" : "Домашний кот " + this.name + " успешно проплыл: " + distance + " м");


    }
}
