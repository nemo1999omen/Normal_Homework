import java.util.Random;
import java.util.Scanner;
public class Homework4 {
    public static int Size=3;
    public static int DotsWinCondition=3;
    public static final char EmptySpace='*';
    public static final char Dot_X='x';
    public static final char Dot_O='o';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static void main(String[] args){
        initMap();
        printMap();
        while (true){
            humanTurn();
            printMap();
            if(checkWin(Dot_X)){
                System.out.println("You win");
                break;
            }
            if(fullMap()){
                break;
            }
            aiTurn();
            printMap();
            if(checkWin(Dot_O)){
                System.out.println("You loose");
                break;
            }
            if(fullMap()){
                break;
            }
        }
    }
    public static void humanTurn(){
        int x,y;
        do {
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!checkCell(x,y));
        map[y][x] = Dot_X;
    }
    public static void aiTurn(){
        int x,y;
        do {
            x = rand.nextInt(Size);
            y = rand.nextInt(Size);
        } while (!checkCell(x,y));
        map[y][x] = Dot_O;
    }
    public static void initMap(){
        map = new char[Size][Size];
        for(int i=0; i<Size; i++){
            for(int j=0; j<Size; j++){
                map[i][j]=EmptySpace;
            }
        }
    }
    public static void printMap(){
        /*for (int i=0; i<Size; i++){
            System.out.println(i+" ");
        }*/
        System.out.println("______________");
        for (int i=0; i<Size; i++){
            //System.out.println((i+1)+" ");
            for (int j=0; j<Size; j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("______________");
    }
    public static boolean checkCell (int x, int y){
        if (x < 0 || x >= Size || y < 0 || y >= Size) return false;
        if (map[y][x] == EmptySpace) return true;
        return false;
    }
    public static boolean fullMap(){
        for (int i=0; i<Size; i++){
            for (int j=0; j<Size; j++){
                if(map[i][j] == EmptySpace) return false;
            }
        }
        return true;
    }
    public static boolean checkWin(char symb){
        int count=0;
        for(int i=0; i<Size; i++){
            for(int j=0; j<Size; j++){
                if(map[i][j]==symb) count++; //проверка по строкам
            }
            if(count == DotsWinCondition) return true;
            count = 0;
        }

        for(int i=0; i<Size; i++){
            for(int j=0; j<Size; j++){
                if(map[j][i]==symb) count++; //проверка по столбцам
            }
            if(count == DotsWinCondition) return true;
            count = 0;
        }

        for(int i=0; i<Size; i++){
            if(map[i][i]==symb) count++; //проверка главной диагонали
            if(count == DotsWinCondition) return true;
        }
        count = 0;

        for(int i=0; i<Size; i++){
            for(int j=0; j<Size; j++){
                if(i+j==Size-1) {
                    if(map[i][j] == symb) count++; //проверка побочной диагонали
                }
            }
        }
        if(count == DotsWinCondition) return true;
        count = 0;

        return false;
    }
}
