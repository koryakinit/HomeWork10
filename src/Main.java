public class Main {
    public static void main(String[] args) {
        Animal[]    animals = {new Dog("Бобик"), new DomesticCat("Мурка"), new Tiger("Тигрёнок"), new DomesticCat("Мурзя")
        , new Dog("Шарик"), new Tiger("Всеволод")};
        for (Animal a : animals) {
            a.run(22);
            a.swim(12);
        }
        System.out.println();
        System.out.println("Всего животных: " + Animal.counterAnimal + " из них кошек: " + DomesticCat.counterDomesticCat + " собак: " + Dog.counterDog + " тигров: " +
                Tiger.counterTiger);
    }
}
