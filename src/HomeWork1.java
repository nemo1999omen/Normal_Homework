import java.util.Scanner;
public class HomeWork1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        printThreeWords();
        System.out.println("______________");
        System.out.println("Метод checkSumSign() - введите 1");
        System.out.println("Метод printColor() - введите 2");
        System.out.println("Метод compareNumbers() - введите 3");
        System.out.println("Выход - введите любое другое число");
        System.out.println();
        System.out.println("ВНИМАНИЕ!!! Работает только с числами");
        System.out.println("______________");
        System.out.println("Choose your destiny:");
        int number = sc.nextInt();
        if (number == 1) {checkSumSign(); return;}
        if (number == 2) {printColor(); return;}
        if (number == 3) {compareNumbers(); return;}
        else {System.out.println("Shutting down..."); }
        sc.close();
    }
    public static void printThreeWords(){
        System.out.println("______________");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign(){
        System.out.println("______________");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = sc.nextInt();
        System.out.println("Введите второе число");
        int b = sc.nextInt();
        int c= a+b;
        if (c<0){
            System.out.println("Сумма отрицательная");
        }
        else{
            System.out.println("Сумма положительная");
        }
        sc.close();
    }
    public static void printColor(){
        System.out.println("______________");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число для цвета");
        int value = sc.nextInt();
        if(value <= 0){System.out.println("Красный");}
        if(value <= 100 && value > 0){System.out.println("Желтый");}
        if(value > 100){System.out.println("Зеленый");}
        sc.close();
    }
    public static void compareNumbers(){
        System.out.println("______________");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число a");
        int a = sc.nextInt();
        System.out.println("Введите число b");
        int b = sc.nextInt();
        if (a>=b){System.out.println("a>=b");}
        else{System.out.println("a<b");}
        sc.close();
    }
}
