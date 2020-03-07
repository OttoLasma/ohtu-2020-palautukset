package ohtu;

public class TennisGame { //ok
    
    private int m_score1 = 0;
    private int m_score2 = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame(String player1Name, String player2Name) { //ok
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) { //ok
        if (playerName == "player1")
            m_score1 += 1;
        else
            m_score2 += 1;
    }

    public String getScore() {
        String player1Score = intToString(m_score1);
        String player2Score = intToString(m_score2);
        String score = "";
        if (m_score2 >= 4 || m_score1 >= 4 ) { //tapaukset joissa voitto tai advantage play mahdollinen
            int difference = m_score1 - m_score2;
            if (difference == 0) { // 4-4
                score = "Deuce";
            } else if (difference == 1) //etu ykkönen
                score = "Advantage " + player1Name;
            else if (difference == -1) //etu kakkonen
                score = "Advantage " + player2Name;
            else if (difference >= 2) //kahen ero voitto
                score = "Win for player1";
            else // kahen ero voitto
                score = "Win for player2";
        } else if (player2Score.equals(player1Score)) { //tied without having four points 
            score = player1Score + "-All";
        } else { // score without having having four and additionally not being tied
            score = player1Score + "-" + player2Score;
        }

        return score;
    
    }
    public static String intToString(int points) {
        String[] stringPoints = { "Love", "Fifteen", "Thirty", "Forty" };
        if (3 < points ) {
            return "";
        }
        return stringPoints[points];
    }
}