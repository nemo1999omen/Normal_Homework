import java.util.Random;

public class Course {
    protected String[] objects;
    public Course(String objects[]){
        this.objects = objects;
    }
    public static int genRandom(){
        Random random = new Random();
        return random.nextInt(3);
    }
    public boolean[] doIt(boolean ifSuc[]){
        for(int i=0; i<4; i++){
            if(genRandom()%2 == 1){ ifSuc[i] = true; }
            else {ifSuc[i] = false;}
        }
        return ifSuc;
    }
    /*public void info(){
        System.out.println("");
        for(int i=0; i<4; i++){
            System.out.println(objects[i]);
        }
    }*/
}