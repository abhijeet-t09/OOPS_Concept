package com.bridgelabz.DeckOfCards;

public class DeckOfCards {
    public static void main(String[] args) {

        String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[][] cardArr = new String[4][13];

        for(int i = 0; i < 4; i++){

            for (int j = 0; j < 13; j++){

                cardArr[i][j] =suit[i]+' '+ rank[j];
            }
        }

        Shuffle shuffle = new Shuffle();

        shuffle.shuffleCards(cardArr);
        for (int i = 0; i < 4; i++){

            System.out.println("\n");
            System.out.println("Player " + (i+1) + " Cards....");

            for (int j = 0; j < 9; j++)
                System.out.println(cardArr[i][j]);

        }
    }
}
