public class Cat extends Animal{
    String color;

    public Cat(){
    }

    public Cat (String name, String color){
        this.name = name;
        this.color = color;
    }

    public void catInfo(){
        System.out.println("Кот имя: " + name + " Цвет: " + color);
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
            System.out.println(name + " не умеет плавать");
        }
    }

    public boolean checkDistanceRun(int distance){
        return distance <= 200 && distance >= 0;
    }
    public boolean checkDistanceSwim(int distance){
        return distance == 0;
    }
}
