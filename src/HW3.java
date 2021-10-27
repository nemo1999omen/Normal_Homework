import java.lang.reflect.Array;
import java.util.Arrays;

public class HW3 {
    public static void main(String[] args){
        System.out.println("Перестановка массива");
        Integer mass1[] = {1, 2, 3, 4, 5, 6};
        String mass2[] = {"A", "B", "C", "D"};
        change(mass1, 1, 3);
        change(mass2, 0, 2);
        System.out.println("Задача");// Ниже идет проверка написанного функционала
        Box<Orange> bo1 = new Box<>();
        Box<Orange> bo2 = new Box<>();
        Box<Apple> ba1 = new Box<>();
        Box<Apple> ba2 = new Box<>();
        System.out.println(bo1.getWeight() + " " + ba1.getWeight() + " " + bo2.getWeight() + " " + ba2.getWeight());
        bo1.addFruit(new Orange(), 5);
        bo2.addFruit(new Orange(), 4);
        ba1.addFruit(new Apple(), 6);
        ba2.addFruit(new Apple(), 4);
        System.out.println(bo1.getWeight() + " " + ba1.getWeight() + " " + bo2.getWeight() + " " + ba2.getWeight());
        System.out.println("Коробки с апельсинами весят одинаково: " + bo1.compare(bo2));
        System.out.println("Первая коробка с яблоками весит столько же, сколько и вторая с апельсинами:" + ba1.compare(bo2) );
        bo1.addAll(bo2);
        System.out.println("Пересыпали все апельсины в одну коробку");
        System.out.println("Масса этой коробки:" + bo2.getWeight());

    }
    public static void change(Object[] mass, int n1, int n2){
        System.out.println("Начальный массив: " + Arrays.toString(mass));
        Object val = mass[n1];
        mass[n1] = mass[n2];
        mass[n2] = val;
        System.out.println("Конечный массив: " + Arrays.toString(mass));
        System.out.println(" ");
    }
}
