public class Game {
    private int gameId ;

    private String title ;

    private String genre ;

    private double price ;

    public Game() {
    }

    public Game(int gameId, String title, String genre, double price) {
        this.gameId = gameId ;
        this.title = title ;
        this.genre = genre ;
        this.price = price ;
    }

    public void setGameId(int id){
        this.gameId = id ;
    }
    public int getGameId(){
        return gameId ;
    }

    public void setTitle(String ti){
        this.title = ti ;
    }
    public String getTitle(){
        return title ;
    }

    public void setGenre(String g){
        this.genre = g ;
    }
    public String getGenre(){
        return genre ;
    }

    public void setPrice(double p){
        this.price = p ;
    }
    public double getPrice(){
        return price ;
    }

    public void displayDetails(){

        System.out.println("GameId " + this.gameId + ", Title: " + this.title + ", Genre: " + this.genre +
                ", Price: " + this.price + " €") ;

    }

}
