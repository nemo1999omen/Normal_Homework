public class Dog extends Animal{
    String color;

    public Dog(){
    }

    public Dog (String name, String color){
        this.name = name;
        this.color = color;
    }

    public void dogInfo(){
        System.out.println("Собака имя: " + name + " Цвет: " + color);
    }

    public void run(int distance){
        if(checkDistanceRun(distance)){
            System.out.println(name + " пробежал(а) " + distance + " м");
        }
        else{
            System.out.println(name + " так бегать не может");
        }
    }
    public void swim(int distance){
        if(checkDistanceSwim(distance)){
            System.out.println(name + " проплыл(а) " + distance + " м");
        }
        else{
            System.out.println(name + " так плыть не может");
        }
    }

    public boolean checkDistanceRun(int distance){
        return distance <= 500 && distance >= 0;
    }
    public boolean checkDistanceSwim(int distance){
        return distance <= 10;
    }
}
