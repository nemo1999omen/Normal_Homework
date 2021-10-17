import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String[] players = new String[4];
        String[] objects = new String[4];
        boolean[] ifSuc = new boolean[4];
        System.out.println("Введите имена игроков");
        for(int i=0; i<4; i++){ players[i] = sc.next(); }
        System.out.println("Введите названия препятствий");
        for(int i=0; i<4; i++){ objects[i] = sc.next(); }
        for(int i=0; i<4; i++){ ifSuc[i] = false; }
        Team team = new Team("T1", players, ifSuc);
        Course course = new Course(objects);
        team.allInfo();
        course.doIt(team.ifSuc);
        team.showResulst();
    }
}