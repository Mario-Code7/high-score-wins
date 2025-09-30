package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        //Home:Vistor|21:9
        System.out.print("Please enter a game score: ");
        String input = myScanner.nextLine().trim();
        System.out.println();

        String[] parts = input.split(Pattern.quote("|"));
        String[] teams = parts[0].split(":");
        String[] scores = parts[1].split(":");

        int homeScore = Integer.parseInt(scores[0]);
        int visitorsScore = Integer.parseInt(scores[1]);

        String winner;
        if (homeScore > visitorsScore) {
            winner = teams[0];
        } else if (visitorsScore > homeScore) {
            winner = teams[1];
        } else {
            winner = "It's a tie!";
        }
        System.out.println("Winner: " + winner);

        myScanner.close();
    }
}
