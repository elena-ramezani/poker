
// Team Member Name: Elnaz ramezani
// Team Member Name:
//  Class: COMP282
// Assignment: Project 1

package com.company;

public class player {  // players card
    private String hand;
    private String[] hand_player;
    private char[] suit= new char[3];
    private int[] rank = new int[3];

    public player(String data){
        hand = data;
    }
    public class object{
        int[] rank;
        char[] suit;
        public object(int[] rank, char[] suit){
            this.rank = rank;
            this.suit = suit;

        }
    }

    public object hand_org(){
        hand_player = hand.split(" ");
        for(int i=0;i<hand_player.length;i++){
            if(hand_player[i].charAt(0)=='t' || hand_player[i].charAt(0)=='T'){
                rank[i] = 10;
            }else if (hand_player[i].charAt(0) == 'j' || hand_player[i].charAt(0) == 'J'){
                rank[i] = 11;
            }else if (hand_player[i].charAt(0) == 'Q' || hand_player[i].charAt(0) == 'q') {
                rank[i] = 12;
            }else if(hand_player[i].charAt(0) == 'k' || hand_player[i].charAt(0) == 'K') {
                rank[i] = 13;
            }else if (hand_player[i].charAt(0) == 'a' || hand_player[i].charAt(0) == 'A') {
                rank[i] = 14;
            }else{
                rank[i] = Character.getNumericValue(hand_player[i].charAt(0));
            }
            suit[i] = hand_player[i].charAt(1);
            System.out.println();

        }
        return new object(rank,suit);

    }

    public void display_hand(){

        System.out.println(hand);
        for(int i=0;i<rank.length;i++){
            System.out.println(rank[i]);
            System.out.println(suit[i]);
        }





    }
}
