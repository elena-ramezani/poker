package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class playerCard {

    public void main(String args[]) {
        String a,b,c,d,e,f;
        ArrayList<player>p ;
        ArrayList<houseCard> houseCardArrayList;
        //ArrayList<checkList> checkListArrayList;
        p = new ArrayList<player>();
        houseCardArrayList = new ArrayList<houseCard>();
        System.out.print("insert first player numbers");
        Scanner num1 = new Scanner(System.in);
        a = num1.nextLine();
        String[] p1=a.split(" ");
        player object = new player(p1);
        System.out.print("insert second player numbers");
        Scanner num2 = new Scanner(System.in);
        b = num2.nextLine();
        String[] p2=a.split(" ");
        player object2 = new player(p2);
        System.out.print("insert third player numbers");
        Scanner num3 = new Scanner(System.in);
        c = num3.nextLine();
        String[] p3=c.split(" ");
        player object3 = new player(p3);
        System.out.print("insert fourth player numbers");
        Scanner num4 = new Scanner(System.in);
        d = num4.nextLine();
        String[] p4=d.split(" ");
        player object4 = new player(p4);
        System.out.print("insert fifth player numbers");
        Scanner num5 = new Scanner(System.in);
        e = num5.nextLine();
        String[] p5=e.split(" ");
        player object5 = new player(p5);
        System.out.print("insert house cards");
        Scanner ls = new Scanner(System.in);
        f=ls.nextLine();
        String[] house=e.split(" ");
        houseCard  objecthouse = new houseCard (house);



    }
    public int DinnerParty(){
        return 0;
    }
    public int Politices(){
        return 0;
    }
    public int Orgy(){
        return 0;
    }
    public int SixCardStraightFlush(){
        return 0;
    }
    public int FiveCardStraightFlush(){
        return 0;
    }
    public int Kingdom(){
        return 0;
    }
    public int Homosapiens(){
        return 0;
    }
    public int OverfullHouse(){
        return 0;
    }
    public int Triplets(){
        return 0;
    }
    public int Flush(){
        return 0;
    }
    public int Odd(){
        return 0;
    }
    public int Fourofkind(){
        return 0;
    }
    public int Sixcardstraight(){
        return 0;
    }
    public int Even(){
        return 0;
    }
    public int Monarchy(){
        return 0;
    }
    public int Threepair(){
        return 0;
    }
    public int Fullhouse(){
        return 0;
    }
    public int Monochromatic(){
        return 0;
    }
    public int Fivecardstraight(){
        return 0;
    }
    public int Swingers(){
        return 0;
    }
    public int Threeofakind(){
        return 0;
    }
    public int twoPair(){
        return 0;
    }
    public int Rainbow(){
        return 0;
    }
    public int onepair(){
        return 0;
    }
    public int NonRainbow(){
        return 0;
    }


    public void evaluate() {
        if (this.DinnerParty() == 1) {
            System.out.println("You have a Dinner Party!");
        } else if (this.Politices() == 1) {
            System.out.println("You have a Politices!");
        } else if (this.Orgy() == 1) {
            System.out.println("You have a Orgy!");
        } else if (this.SixCardStraightFlush() == 1) {
            System.out.println("You have a 6 Card Straight Flush!");
        } else if (this.FiveCardStraightFlush() == 1) {
            System.out.println("You have a Five Card Straight Flush!");
        } else if (this.Kingdom() == 1) {
            System.out.println("You have a Kingdom!");
        } else if (this.Homosapiens() == 1) {
            System.out.println("You have a Homosapiens!");
        } else if (this.OverfullHouse() == 1) {
            System.out.println("You have a Overfull house!");
        } else if (this.Triplets() == 1) {
            System.out.println("You have a Triplets");
        } else if (this.Flush() == 1) {
            System.out.println("You have a Flush!");
        } else if (this.Odd() == 1) {
            System.out.println("You have a Odd!");
        } else if (this.Fourofkind() == 1) {
            System.out.println("You have a Four of kind!");
        } else if (this.Sixcardstraight() == 1) {
            System.out.println("You have a 6 card straight!");
        } else if (this.Even() == 1) {
            System.out.println("You have a Even!");
        } else if (this.Monarchy() == 1) {
            System.out.println("You have a Monarchy!");
        } else if (this.Threepair() == 1) {
            System.out.println("You have a 3 pair!");
        } else if (this.Fullhouse() == 1) {
            System.out.println("You have a Full house!");
        } else if (this.Monochromatic() == 1) {
            System.out.println("You have a Monochromatic!");
        } else if (this.Fivecardstraight() == 1) {
            System.out.println("You have a5 card straight!");
        } else if (this.Swingers() == 1) {
            System.out.println("You have a Swingers!");
        } else if (this.Threeofakind() == 1) {
            System.out.println("You have a Three of a kind!");
        } else if (this.twoPair() == 1) {
            System.out.println("You have a 2 pair!");
        } else if (this.Rainbow() == 1) {
            System.out.println("You have a Rainbow!");
        } else if (this.onepair() == 1) {
            System.out.println("You have a 1 pair!");
        } else if (this.NonRainbow() == 1) {
            System.out.println("You have a Non-Rainbow!");
        }
    }


    public class player {
        int firstRank;
        int firstSuit;
        int secondRank;
        int secondsuit;
        int thirdRank;
        int thirdsuit;

        public player(String[] data){
            for (int i = 0;i<data.length; i+=2) {
                if (data[i] == ("t") && data[i] == ("T")) {
                    data[i] = data[i].replace("t", "10");
                    data[i] = data[i].replace("T", "10");
                }
                else if (data[i] == ("j") && data[i] == ("J")) {
                    data[i] = data[i].replace("t", "11");
                    data[i] = data[i].replace("T", "11");
                }
                else if (data[i] == ("k") && data[i] == ("K")) {
                    data[i] = data[i].replace("t", "13");
                    data[i] = data[i].replace("T", "13");
                }
                else if (data[i] == ("a") && data[i] == ("A")) {
                    data[i] = data[i].replace("t", "1");
                    data[i] = data[i].replace("T", "1");
                }
            }


            this.firstRank= Integer.parseInt(data[0]);
            this.firstSuit = Integer.parseInt(data[1]);
            this.secondRank = Integer.parseInt(data[2]);
            this.secondsuit = Integer.parseInt(data[3]);
            this.thirdRank= Integer.parseInt(data[4]);
            this.thirdsuit=Integer.parseInt(data[5]);
            String String_Array[]=new String[data.length];
            for (int i=0;i<String_Array.length;i++) String_Array[i]=data[i].toString();

        }

    }




    class houseCard {
        int firstRank;
        int firstSuit;
        int secondRank;
        int secondsuit;
        int thirdRank;
        int thirdsuit;
        int fourthRank;
        int fourthsuit;
        int fifthRank;
        int fifthsuit;

        public houseCard(String[] data){
            for (int i = 0;i<data.length; i+=2) {
                if (data[i] == ("t") && data[i] == ("T")) {
                    data[i] = data[i].replace("t", "10");
                    data[i] = data[i].replace("T", "10");
                }
            }
            for (int i = 0;i<data.length; i+=2) {
                if (data[i] == ("j") && data[i] == ("J")) {
                    data[i] = data[i].replace("t", "11");
                    data[i] = data[i].replace("T", "11");
                }
            }
            for (int i = 0;i<data.length; i+=2) {
                if (data[i] == ("q") && data[i] == ("Q")) {
                    data[i] = data[i].replace("t", "12");
                    data[i] = data[i].replace("T", "12");
                }
            }
            for (int i = 0;i<data.length; i+=2) {
                if (data[i] == ("k") && data[i] == ("K")) {
                    data[i] = data[i].replace("t", "13");
                    data[i] = data[i].replace("T", "13");
                }
            }
            for (int i = 0;i<data.length; i+=2) {
                if (data[i] == ("a") && data[i] == ("A")) {
                    data[i] = data[i].replace("t", "1");
                    data[i] = data[i].replace("T", "1");
                }
            }

            this.firstRank= Integer.parseInt(data[0]);
            this.firstSuit = Integer.parseInt(data[1]);
            this.secondRank = Integer.parseInt(data[2]);
            this.secondsuit = Integer.parseInt(data[3]);
            this.thirdRank= Integer.parseInt(data[4]);
            this.thirdsuit=Integer.parseInt(data[5]);
            this.fourthRank= Integer.parseInt(data[6]);
            this.fourthsuit = Integer.parseInt(data[7]);
            this.fifthRank= Integer.parseInt(data[8]);
            this.fifthsuit = Integer.parseInt(data[9]);
            String String_Array[]=new String[data.length];
            for (int i=0;i<String_Array.length;i++) String_Array[i]=data[i].toString();
        }

    }
//public class checkList{

//}
}