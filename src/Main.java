public class Main {
    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Luke",highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Hannah", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Rocco", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Chevy", highScorePosition);

        highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Preston", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePositionPosition) {

        System.out.println(playerName + " managed to get into position " + highScorePositionPosition + " on" +
                " the high score list!");
    }

    public static int calculateHighScorePosition(int playersScore) {

        int position;

        if (playersScore >= 1000) {
            position = 1;
        } else if (playersScore >= 500) {
            position = 2;
        } else if (playersScore >= 100) {
            position = 3;
        } else {
            position = 4;
        }

        return position;

    }
}