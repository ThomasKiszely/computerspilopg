public class Player {
    private int playerId ;
    private String name ;
    private int age ;
    private double score ;

    public Player() {
    }

    public Player(int playerId, String name, int age, double score) {
        this.playerId = playerId ;
        this.name = name ;
        this.age = age ;
        this.score = score ;
    }

    public void setPlayerId(int id){
        this.playerId = id ;
    }
    public int getPlayerId() {
        return playerId ;
    }

    public void setName(String name){
        this.name = name ;
    }
    public String getName(){
        return name ;
    }

    public void setAge(int age){
        this.age = age ;
    }
    public int getAge(){
        return age ;
    }

    public void setScore(double score){
        this.score = score ;
    }
    public double getScore(){
        return score ;
    }

    public void displayDetails(){
        System.out.println("\nDisplay player details") ;
        System.out.println("Player ID: " + this.playerId + ", Name: " + this.name + ", Age: " +
                this.age + ", Score: " + score) ;
    }

    public void updateScore(int points){
        this.score += points ;
    }
}
