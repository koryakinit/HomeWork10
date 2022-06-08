abstract class Animal {
    String name;
    static int counterAnimal;

    abstract void run (int distance);
    abstract void swim (int distance);

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCounterAnimal() {
        return counterAnimal;
    }

    public static void setCounterAnimal(int counterAnimal) {
        Animal.counterAnimal = counterAnimal;
    }
}
