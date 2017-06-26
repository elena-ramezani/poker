// Team Member Name: Elnaz ramezani
// Team Member Name:
//  Class: COMP282
// Assignment: Project 1


package com.company;

public class houseCard {
    int[] rank = new int[5];
    char[] suit = new char[5];
    String house;
    String[] house_array;

    public houseCard(String data){
        this.house = data;
    }
    public class object{
        int[] rank;
        char[] suit;
        public object(int[] rank, char[] suit){
            this.rank = rank;
            this.suit = suit;
        }
    }

    public object house_org(){
        house_array = house.split(" ");
        for(int i = 0; i< house_array.length;i++){
            if(house_array[i].charAt(0)=='t' || house_array[i].charAt(0)=='T'){
                rank[i]=10;
            }else if (house_array[i].charAt(0)=='j' || house_array[i].charAt(0)=='J'){
                rank[i]=11;
            }else if(house_array[i].charAt(0)=='q' || house_array[i].charAt(0)=='Q'){
                rank[i]=12;
            }else if(house_array[i].charAt(0)=='k' || house_array[i].charAt(0)=='K'){
                rank[i]=13;
            }else if (house_array[i].charAt(0)=='a' || house_array[i].charAt(0)=='A'){
                rank[i]=14;
            }else{
                rank[i]  = Character.getNumericValue(house_array[i].charAt(0));
            }
            suit[i] = house_array[i].charAt(1);
        }
        return new object (rank,suit);
    }

    public void display(){
        System.out.println(house);
        for(int i = 0; i < house_array.length;i++) {
            System.out.println(rank[i]);
            System.out.println(suit[i]);

        }
    }
}
