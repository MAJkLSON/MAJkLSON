import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static final int ROCK = 1;
    public static final int PAPER = 2;
    public static final int SCISSORS = 3;
    public static final int LOSS = 0;
    public static final int DRAW = 3;
    public static final int WON = 6;

    public static void main(String[] args) {
        try (BufferedReader buffer = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            int total_points = 0;
            while ((line = buffer.readLine()) != null) {
                // part two - X means you need to lose, Y means you need to end the round in a draw, and Z means you need to win
                switch (line) {
                    case "A X":
                        total_points += SCISSORS + LOSS;
                        break;
                    case "A Y":
                        total_points += ROCK + DRAW ;
                        break;
                    case "A Z":
                        total_points += PAPER + WON;
                        break;
                    case "B X":
                        total_points += ROCK + LOSS;
                        break;
                    case "B Y":
                        total_points += PAPER + DRAW;
                        break;
                    case "B Z":
                        total_points += SCISSORS + WON;
                        break;
                    case "C X":
                        total_points += PAPER + LOSS;
                        break;
                    case "C Y":
                        total_points += SCISSORS + DRAW;
                        break;
                    case "C Z":
                        total_points += ROCK + WON;
                        break;
                }
                // part one - X for Rock, Y for Paper, and Z for Scissors
//                switch (line) {
//                    case "A X":
//                        total_points += ROCK + DRAW;
//                        break;
//                    case "A Y":
//                        total_points += PAPER + WON;
//                        break;
//                    case "A Z":
//                        total_points += SCISSORS + LOSS;
//                        break;
//                    case "B X":
//                        total_points += ROCK + LOSS;
//                        break;
//                    case "B Y":
//                        total_points += PAPER + DRAW;
//                        break;
//                    case "B Z":
//                        total_points += SCISSORS + WON;
//                        break;
//                    case "C X":
//                        total_points += ROCK + WON;
//                        break;
//                    case "C Y":
//                        total_points += PAPER + LOSS;
//                        break;
//                    case "C Z":
//                        total_points += SCISSORS + DRAW;
//                        break;
//                }
                System.out.println(total_points);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}