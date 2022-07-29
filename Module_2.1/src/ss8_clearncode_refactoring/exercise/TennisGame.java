package ss8_clearncode_refactoring.exercise;

public class TennisGame {

    public static final int LOVE_ALL = 0;
    public static final int Fifteen_All = 1;
    public static final int Thirty_All = 2;
    public static final int Forty_All = 3;

    public static String getScore(String playerOne, String playerTwo, int scoreOne, int scoreTwo) {
        String score = "";
        int tempScore = 0;
        if (scoreOne == scoreTwo) {
            switch (scoreOne) {
                case LOVE_ALL:
                    score = "Love-All";
                    break;
                case Fifteen_All:
                    score = "Fifteen-All";
                    break;
                case Thirty_All:
                    score = "Thirty-All";
                    break;
                case Forty_All:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else if (scoreOne >= 4 || scoreTwo >= 4) {
            int minusResult = scoreOne - scoreTwo;
            if (minusResult == 1) score = "Advantage player1";
            else if (minusResult == -1) score = "Advantage player2";
            else if (minusResult >= 2) score = "Win for player1";
            else score = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = scoreOne;
                else {
                    score += "-";
                    tempScore = scoreTwo;
                }
                switch (tempScore) {
                    case LOVE_ALL:
                        score += "Love";
                        break;
                    case Fifteen_All:
                        score += "Fifteen";
                        break;
                    case Thirty_All:
                        score += "Thirty";
                        break;
                    case Forty_All:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }
}