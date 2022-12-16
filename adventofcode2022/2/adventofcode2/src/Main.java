// --- Day 2: Rock Paper Scissors ---
// The Elves begin to set up camp on the beach. To decide whose tent gets to be closest to the snack storage, a giant Rock Paper Scissors tournament is already in progress.

// Rock Paper Scissors is a game between two players. Each game contains many rounds; in each round, the players each simultaneously choose one of Rock, Paper, or Scissors using a hand shape. Then, a winner for that round is selected: Rock defeats Scissors, Scissors defeats Paper, and Paper defeats Rock. If both players choose the same shape, the round instead ends in a draw.

// Appreciative of your help yesterday, one Elf gives you an encrypted strategy guide (your puzzle input) that they say will be sure to help you win. "The first column is what your opponent is going to play: A for Rock, B for Paper, and C for Scissors. The second column--" Suddenly, the Elf is called away to help with someone's tent.

// The second column, you reason, must be what you should play in response: X for Rock, Y for Paper, and Z for Scissors. Winning every time would be suspicious, so the responses must have been carefully chosen.

// The winner of the whole tournament is the player with the highest score. Your total score is the sum of your scores for each round. The score for a single round is the score for the shape you selected (1 for Rock, 2 for Paper, and 3 for Scissors) plus the score for the outcome of the round (0 if you lost, 3 if the round was a draw, and 6 if you won).

// Since you can't be sure if the Elf is trying to help you or trick you, you should calculate the score you would get if you were to follow the strategy guide.

// For example, suppose you were given the following strategy guide:

// A Y
// B X
// C Z
// This strategy guide predicts and recommends the following:

// In the first round, your opponent will choose Rock (A), and you should choose Paper (Y). This ends in a win for you with a score of 8 (2 because you chose Paper + 6 because you won).
// In the second round, your opponent will choose Paper (B), and you should choose Rock (X). This ends in a loss for you with a score of 1 (1 + 0).
// The third round is a draw with both players choosing Scissors, giving you a score of 3 + 3 = 6.
// In this example, if you were to follow the strategy guide, you would get a total score of 15 (8 + 1 + 6).

// What would your total score be if everything goes exactly according to your strategy guide?

// Your puzzle answer was 15572.

// --- Part Two ---
// The Elf finishes helping with the tent and sneaks back over to you. "Anyway, the second column says how the round needs to end: X means you need to lose, Y means you need to end the round in a draw, and Z means you need to win. Good luck!"

// The total score is still calculated in the same way, but now you need to figure out what shape to choose so the round ends as indicated. The example above now goes like this:

// In the first round, your opponent will choose Rock (A), and you need the round to end in a draw (Y), so you also choose Rock. This gives you a score of 1 + 3 = 4.
// In the second round, your opponent will choose Paper (B), and you choose Rock so you lose (X) with a score of 1 + 0 = 1.
// In the third round, you will defeat your opponent's Scissors with Rock for a score of 1 + 6 = 7.
// Now that you're correctly decrypting the ultra top secret strategy guide, you would get a total score of 12.

// Following the Elf's instructions for the second column, what would your total score be if everything goes exactly according to your strategy guide?

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