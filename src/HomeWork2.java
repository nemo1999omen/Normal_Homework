import java.util.Scanner;
public class HomeWork2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("______________");
        System.out.println("Проверка от 10 до 20 - введите 1");
        System.out.println("Положительное/отрицательное число - введите 2");
        System.out.println("True/False - введите 3");
        System.out.println("Печатаем строки нужное число раз - введите 4");
        System.out.println("Проверка года на високосность (true/false) - введите 5");
        System.out.println("Выход - любое другое число");
        System.out.println("______________");
        int value = sc.nextInt();
        switch (value){
            case 1:
                System.out.println("Введите первое целое число");
                int a = sc.nextInt();
                System.out.println("Введите второе целое число");
                int b = sc.nextInt();
                System.out.println(limitMethod(a,b));
                break;
            case 2:
                System.out.println("Введите целое число");
                int c1 = sc.nextInt();
                signMethod1(c1);
                break;
            case 3:
                System.out.println("Введите целое число");
                int c2 = sc.nextInt();
                System.out.println(signMethod2(c2));
                break;
            case 4:
                System.out.println("Введите строку");
                String d = sc.next();
                System.out.println("Введите целое число строк");
                int e = sc.nextInt();
                stringMethod(d,e);
                break;
            case 5:
                System.out.println("Введите номер года");
                int f = sc.nextInt();
                StrangeYearMethod(f);
                break;
            default:
                System.out.println("Shutting down...");
                sc.close();
                return;
        }
    }
    public static boolean limitMethod(int a, int b){
        boolean c;
        if (a+b>=10 && a+b<=20){c=true;}
        else {c=false;}
        return c;
    }
    public static void signMethod1(int a){
        if (a>=0){System.out.println("Положительное");}
        else {System.out.println("Отрицательное");}
    }
    public static boolean signMethod2(int a){
        boolean c;
        if (a>=0){c=true;}
        else {c=false;}
        return c;
    }
    public static void stringMethod(String a, int b){
        for(int i=0; i<b; i++){System.out.println(a);}
    }
    public static void StrangeYearMethod(int a){
        boolean c;
        if(a<400){
            if(a%100 != 0){
                if(a%4 == 0){ c=true; }
                else{ c=false; }
            }
            else{ c=false; }
        }
        else{
            if(a%400 != 0){
                if(a%100 != 0){
                    if(a%4 == 0 ){ c=true;}
                    else { c=false; }
                }
                else{ c=false; }
            }
            else{ c=true; }
        }
        System.out.println(c);
    }
}
