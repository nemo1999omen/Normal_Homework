public class Team {
    protected String teamName;
    protected String[] players;
    public boolean[] ifSuc;
    public Team(String teamName, String players[], boolean ifSuc[]){
        this.teamName = teamName;
        this.players = players;
        this.ifSuc = ifSuc;

    }
    public void allInfo(){
        System.out.println("");
        System.out.println(teamName);
        for(int i=0; i<4;i++){
            System.out.println("Игрок "+(i+1)+": " +players[i]);
        }
    }
    public void showResulst(){
        System.out.println("");
        for(int i=0; i<4; i++){
            if(ifSuc[i] == true){ System.out.println(players[i] + " прошел дистанцию"); }
        }
    }
}