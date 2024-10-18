import java.util.Scanner ;
import java.util.Arrays ;
public class Main {
    public static void main(String[] args) {
        Game myGame = new Game(1, "CS2", "Shooter", 9.99);
        Game myGame1 = new Game(2, "GTA5", "Reality", 19);
        Game myGame2 = new Game(3, "Baldur's Gate", "RPG", 79);
        Game myGame3 = new Game(4, "Outrun", "Classic Racing", 2.99);

        System.out.println("Enter gamenumber");
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        if (id == 1) {
            myGame.displayDetails();
        } else if (id == 2) {
            myGame1.displayDetails();
        } else if (id == 3) {
            myGame2.displayDetails();
        } else if (id == 4) {
            myGame3.displayDetails();
        } else {
            System.out.println("Game doesn't exist");
        }

        Player myPlayer = new Player(1, "Henrik", 22,  0) ;
        Player myPlayer1 = new Player(2, "Kaj", 23, 0) ;
        Player myPlayer2 = new Player(3, "Andrea", 20, 0) ;

        myPlayer.displayDetails();

        System.out.println("\nUpdate score") ;

        myPlayer.updateScore(25);

        myPlayer.displayDetails() ;

        int l = 4;
        String[] game;
        game = new String[l];
        game[0] = ("CS2");
        game[1] = ("Baldur's Gate");
        game[2] = ("Outrun");
        game[3] = ("HellYes");

        int g = 4 ;
        String[] player;
        player = new String[g];
        player[0] = ("Aage");
        player[1] = ("Edith");
        player[2] = ("Mario");
        player[3] = ("Luigi");

        int s = 4;
        double[] score;
        score = new double[s];
        score[0] = 10;
        score[1] = 80;
        score[2] = 20;
        score[3] = 0;

        int p = 4;
        double[] price;
        price = new double[p];
        price[0] = 19.95;
        price[1] = 29.95;
        price[2] = 9.95;
        price [3] = 5;

        System.out.println("\nDisplay game array") ;

        GameSystem.displayAllGames(game) ;

        System.out.println("\nDisplay player array") ;

        GameSystem.displayAllPlayers(player) ;

        System.out.println("") ;

        System.out.println("\nEnter new game") ;
        String newGame = input.next() ;
        game = GameSystem.addGame(l, game, newGame) ;
        System.out.println(Arrays.toString(game)) ;

        System.out.println("\nEnter new player") ;
        String newPLayer = input.next() ;
        player = GameSystem.addPLayer(g, player, newPLayer) ;
        System.out.println(Arrays.toString(player)) ;

        System.out.println("\nPlayer score") ;

        for (int i = 0; i < score.length; i++) {
            System.out.println("Name: " + player[i] + ". Score: " + score[i]);
        }

        System.out.println("\nUpdateScore") ;
        GameSystem.updatePlayerScore(1, 25, score);
        for (int i = 0; i < score.length; i++) {
            System.out.println("Name: " + player[i] + ". Score: " + score[i]);
        }

        System.out.println("") ;

        System.out.println("Enter Game Id") ;
        int gameId = input.nextInt() ;

        GameSystem.findGameById(l, game, gameId);


        System.out.println("\nEnter PLayer Id") ;
        int playerId = input.nextInt();

        GameSystem.findPlayerById(g, player, playerId) ;

        System.out.println("\nScores") ;

        int topScorer = GameSystem.findTopScoringPlayer(score) ;
        for (int i = 0; i < score.length; i++){
            System.out.println(score[i]);
        }

        System.out.println("") ;

        System.out.println("Highest score: " + player[topScorer]) ;

        System.out.println("") ;

        double totalRevenue = GameSystem.calculateTotalRevenue(game, price) ;

        System.out.println("Total price is: " + totalRevenue + " Euro") ;

        System.out.println("\nTopscorerlist") ;

        String topScorerList[] = GameSystem.topScorerList(score, player) ;

        for (int i = 0; i < score.length; i ++) {
            System.out.println("Topscorer no. " + (i + 1) + ": " + topScorerList[i]);
        }
        
    }
}