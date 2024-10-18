import java.util.Scanner ;
public class GameSystem {
    public static void displayAllGames(String[] game) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < game.length; i++) {
            System.out.println("Game no " + (i + 1) + ": " + game[i]);
        }
    }

    public static void displayAllPlayers(String[] player) {
        for (int i = 0; i < player.length; i++) {
            System.out.println("Player " + (i + 1) + " " + player[i] + ", ");
        }
    }

    public static String[] addGame(int l, String game[], String newGame) {
        String newGameArray[] = new String[l + 1];
        for (int i = 0; i < l; i++) {
            newGameArray[i] = game[i];
        }
        newGameArray[l] = newGame;
        return newGameArray;
    }

    public static String[] addPLayer(int g, String player[], String newPlayer) {
        String newPlayerArray[] = new String[g + 1];
        for (int i = 0; i < g; i++) {
            newPlayerArray[i] = player[i];
        }
        newPlayerArray[g] = newPlayer;
        return newPlayerArray;
    }

    public static void updatePlayerScore(int playerId, double newScore, double[] score) {
        score[playerId] += newScore;
    }

    public static void findGameById(int l, String[] game, int gameId){

        if (gameId <= l) {
            System.out.println(game[gameId]);
        }
        else {
            System.out.println("Game doesn't exist");
        }
    }

    public static void findPlayerById(int g, String[] player, int playerId){
        if(playerId <= g) {
            System.out.println(player[playerId]);
        }
        else {
            System.out.println("Player doesn't exist") ;
        }
    }

    public static double calculateTotalRevenue(String[] game, double[] price) {
        Scanner input = new Scanner(System.in);
        double totalPrice = 0;
        boolean sale = false;
        while (sale = true) {
            System.out.println("Enter sale by gameIdNumber - enter letter for exit");

            if (input.hasNextInt()) {
                int soldGame = input.nextInt();
                if (0 <= soldGame && soldGame < game.length - 1) {
                    totalPrice += price[soldGame];
                    sale = true;
                } else {
                    sale = false;
                    return totalPrice;
                }
            } else if (input.hasNextLine()) {
                return totalPrice;
            }
        }

        return totalPrice;
    }

    public static int findTopScoringPlayer(double[] score) {
        int high = 0;
        for (int i = 1; i < score.length; i++) {
            if (score[i] > score[high]) high = i;
        }
        return high;
    }

    public static String[] topScorerList(double[] score, String[] player) {
        for (int i = 0; i < score.length; i++) {
            for (int j = 1; j < (score.length - i); j++) {
                if (score[j - 1] < score[j]) {
                    double temp = score[j - 1];
                    score[j - 1] = score[j];
                    score[j] = temp;
                    String temp1 = player[j - 1];
                    player[j - 1] = player[j];
                    player[j] = temp1;
                }
            }
        }
        return player;
    }
}
