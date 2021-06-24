public class AnimalApp {
    public static void main(String[] args){
        Animal animal = new Animal("Дружок");
        Cat Barsik = new Cat("Барсик", "Белый");
        Dog Muhtar = new Dog("Мухтар", "Черный");

        animal.animalInfo();
        //Barsik.animalInfo();
        //Muhtar.animalInfo();
        Barsik.catInfo();
        Muhtar.dogInfo();

        animal.run(500);
        animal.swim(500);

        Barsik.run(150);
        Barsik.swim(100);

        Muhtar.run(600);
        Muhtar.swim(500);

        System.out.println("Котов: " + Cat.count);
        System.out.println("Собак: " + Dog.count);
        System.out.println("Других животных: " + Animal.count);
        System.out.println("Всего животных: " + (Cat.count + Dog.count+ Animal.count));
    }
}
