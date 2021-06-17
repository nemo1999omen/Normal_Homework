import java.util.Arrays;
import java.util.Scanner;
public class Homework3 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("______________");
        System.out.println("Задание 1 - введите 1");
        System.out.println("Задание 2 - введите 2");
        System.out.println("Задание 3 - введите 3");
        System.out.println("Задание 4 - введите 4");
        System.out.println("Задание 5 - введите 5");
        System.out.println("Задание 6 - введите 6");
        System.out.println("Задание 7 - введите 7");
        System.out.println("Задание 8 - введите 8");
        System.out.println("Выход - любое другое число");
        System.out.println("______________");
    System.out.println("Choose case");
    System.out.println("______________");
    int value = sc.nextInt();
    switch (value){
        case 1:
            no1();
            break;
        case 2:
            no2();
            break;
        case 3:
            no3();
            break;
        case 4:
            no4();
            break;
        case 5:
            System.out.println("Введите аргументы");
            System.out.println("Аргумент len:");
            int len = sc.nextInt();
            System.out.println("Аргумент initialValue:");
            int initialValue = sc.nextInt();
            System.out.println(Arrays.toString( no5(len, initialValue)) );
            break;
        case 6:
            no6();
            break;
        case 7:
            System.out.println(no7());
            break;
        case 8:
            System.out.println("Введите сдвиг (знаковая часть - направление ['-' - влево; '+' - вправо]; численная часть - модуль сдвига");
            int sdv = sc.nextInt();
            System.out.println(Arrays.toString( no8(sdv) ));
            break;
        default:
            System.out.println("Shutting down...");
            sc.close();
        }
    }
    public static void no1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int a = sc.nextInt();
        int[] mass = new int[a];
        System.out.println("Введите элементы массива (0 || 1)");
        for(int i=0; i<a; i++){
            mass[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(mass));
        for(int j=0; j<a; j++){
            if(mass[j]==0){
                mass[j]=1;
            }
            else{
                mass[j]=0;
            }
        }
        System.out.println(Arrays.toString(mass));
    }
    public static void no2(){
        int[] hundred = new int[100];
        for(int i=0; i<100; i++){
            hundred[i]=i+1;
        }
        System.out.println(Arrays.toString(hundred));
    }
    public static void no3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int a = sc.nextInt();
        int [] string = new int[a];
        System.out.println("Введите элементы массива");
        for(int i=0; i<a; i++){
            string[i] = sc.nextInt();
            if (string[i]<6){
                string[i]=string[i]*2;
            }
        }
        System.out.println(Arrays.toString(string));
    }
    public static void no4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int a = sc.nextInt();
        int[][] square = new int[a][a];
        for (int i=0; i<a; i++){
            for(int j=0; j<a; j++){
                if(i==j){
                    square[i][j]=1;
                }
                else{
                    square[i][j]=0;
                }
            }
            System.out.println(Arrays.toString(square[i]));
        }
        System.out.println("______________");
        for (int n=0; n<a; n++){
            for(int m=0; m<a; m++){
                if(square[n][m]==0){
                    if(n+m==a-1){
                        square[n][m]=1;
                    }
                    else{
                        square[n][m]=0;
                    }
                }
            }
            System.out.println(Arrays.toString(square[n]));
        }
    }
    public static int[] no5(int a, int b){
        int[] mass = new int[a];
        for(int i=0; i<a; i++){
            mass[i]=b;
        }
        return mass;
    }
    public static void no6(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int a = sc.nextInt();
        int max = 0;
        int[] mass = new int[a];
        System.out.println("Введите элементы массива");
        for (int i=0; i<a; i++){
            mass[i]= sc.nextInt();
            if (mass[i]>=max){
                max = mass[i];
            }
        }
        int min = max;
        for(int j=0; j<a; j++){
            if (mass[j]<=min){
                min = mass[j];
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
    public static boolean no7(){
        Scanner sc = new Scanner(System.in);
        int Sum=0;
        int halfSum=0;
        System.out.println("Введите размер массива");
        int a = sc.nextInt();
        int[] mass = new int[a];
        System.out.println("Введите элементы массива");
        for (int i=0; i<a; i++){
            mass[i]=sc.nextInt();
            Sum=Sum+mass[i];
        }
        boolean f=false;
        System.out.println(Arrays.toString(mass));
        if(Sum%2==0){
            for(int j=0; j<a; j++){
                halfSum=halfSum+mass[j];
                if(halfSum==Sum/2){
                    f = true;
                    break;
                }
            }

        }
        return f;
    }
    public static int[] no8(int sdv){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int ln = sc.nextInt();
        int[] massive = new int[ln];
        System.out.println("Введите аргументы");
        for(int i=0; i<ln; i++){
            massive[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(massive));
        if (sdv > 0){
            for(int i=0; i<Math.abs(sdv);i++){
                massive = SdvRight(massive,ln);
            }
        }
        else{
            for(int i=0; i<Math.abs(sdv);i++){
                massive = SdvLeft(massive,ln);
            }
        }
        return massive;
    }
    public static int[] SdvLeft(int[] mass, int ln){
        int k = mass[0];
        for(int i=0; i<ln-1; i++){
            mass[i]=mass[i+1];
        }
        mass[ln-1]=k;
        return mass;
    }
    public static int[] SdvRight(int [] mass, int ln){
        int k = mass[ln-1];
        for(int i=ln-1; i>0; i--){
            mass[i]=mass[i-1];
        }
        mass[0]=k;
        return mass;
    }
}
