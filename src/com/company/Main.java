
// Team Member Name: Elnaz ramezani
// Team Member Name: N'dour, M'benda
//  Class: COMP282
// Assignment: Project 1

package com.company;

        import java.lang.reflect.Array;
        import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> players = new ArrayList<String>();
        ArrayList<Integer> status = new ArrayList<Integer>();


        player.object player1_hand_org;
        player.object player2_hand_org;
        player.object player3_hand_org;
        player.object player4_hand_org;
        player.object player5_hand_org;
        houseCard.object house_card_org ;

        Scanner input;
        String input_player;

        for(int i=1; i<6;i++) {
            System.out.println("insert player"+i+" hands card");
            input= new Scanner(System.in);
            input_player = input.nextLine();
            players.add(input_player);

        }
        player firstPlayer = new player(players.get(0));
        player1_hand_org = firstPlayer.hand_org();
        //firstPlayer.display_hand();

        player secondPlayer = new player(players.get(1));
        player2_hand_org = secondPlayer.hand_org();
        //secondPlayer.display_hand();

        player thirdPlayer = new player(players.get(2));
        player3_hand_org = thirdPlayer.hand_org();
        //thirdPlayer.display_hand();

        player fourthPlayer = new player(players.get(3));
        player4_hand_org = fourthPlayer.hand_org();
        //fourthPlayer.display_hand();

        player fifthPlayer = new player(players.get(4));
        player5_hand_org = fifthPlayer.hand_org();
        //fifthPlayer.display_hand();

        System.out.println("insert house cards");
        Scanner houseCard = new Scanner(System.in);
        String input_house_card = houseCard.nextLine();

        houseCard C = new houseCard(input_house_card);
        house_card_org = C.house_org();
        //C.display();

        cardRanking G = new cardRanking();
        G.cardRanking(player1_hand_org, house_card_org);
        status.add(G.evalute());
        G.cardRanking(player2_hand_org, house_card_org);
        status.add(G.evalute());
        G.cardRanking(player3_hand_org, house_card_org);
        status.add(G.evalute());
        G.cardRanking(player4_hand_org, house_card_org);
        status.add(G.evalute());
        G.cardRanking(player5_hand_org, house_card_org);
        status.add(G.evalute());
        //System.out.print(status.get(0) + status.get(1)+ status.get(2) +status.get(3)+status.get(4));

        ArrayList<Integer> sorted_status = new ArrayList<Integer>(status);
        Collections.sort(sorted_status);

        int[] indexes = new int[sorted_status.size()];
        for (int n = 0; n < sorted_status.size(); n++){
            indexes[n] = sorted_status.indexOf(status.get(n));
        }
        //System.out.println(Arrays.toString(indexes));

        int ranking = 1;
        int f = 0;

        for (int m = 0; m < indexes.length; m++) {   // we sord the result of evaluation  for all players
            for (int n = 1; n < indexes.length +1; n++) { //find the index of those value
                if (indexes[n -1] == 4-m) {  // and we print the players ranking from the high to low
                    System.out.println(ranking + ": Player " + n );
                    f++;
                }
            }
            ranking = ranking + f;
            f = 0;
        }


    }
}
