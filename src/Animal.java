public class Animal {
    static int count;
    String name;
    public Animal(){
    }

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public void animalInfo(){
        System.out.println("Животное: " + name);
    }
    public void run(int a){
        System.out.println(name + " пробежал(а) " + a);
    }

    public void swim(int a){
        System.out.println(name + " проплыл(а) " + a);
    }
}
