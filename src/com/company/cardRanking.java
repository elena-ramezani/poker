// Team Member Name: Elnaz ramezani
// Team Member Name:
//  Class: COMP282
// Assignment: Project 1


package com.company;

import java.util.*;

public class cardRanking {

    int[] rank_hand;
    char[] suit_hand;
    int[] rank_house;
    char[] suit_house;
    int[] all_rank = new int[8];
    char[] all_suit = new char[8];
    int [] all_rank_sorted;

    public void cardRanking(player.object a, houseCard.object b){
        this.rank_hand = a.rank;
        this.suit_hand = a.suit;
        this.rank_house = b.rank;
        this.suit_house = b.suit;

        System.arraycopy(this.rank_hand, 0, this.all_rank, 0, this.rank_hand.length);
        System.arraycopy(this.rank_house, 0, this.all_rank, this.rank_hand.length, this.rank_house.length);

        System.arraycopy(this.suit_hand, 0, this.all_suit, 0, this.suit_hand.length);
        System.arraycopy(this.suit_house, 0, this.all_suit, this.suit_hand.length, this.suit_house.length);
        all_rank_sorted = all_rank.clone();
        Arrays.sort(all_rank_sorted);
    }
    public void display(){
        for(int i=0;i<rank_hand.length;i++) {
            System.out.print(rank_hand);
        }
    }

    public boolean onePair() {   // two cards of the same rank
        int counter = 0;
        for (int i = 0; i < (all_rank_sorted.length - 1); i++) {  // we sort the number
            if (all_rank_sorted[i] == all_rank_sorted[i + 1]) {   // compare if an number is equal the next number
                if(i == 0 && all_rank_sorted[i + 1] != all_rank_sorted[i + 2]){ // and they are not equal the others
                    counter = counter + 1;
                }else if((i+2)< all_rank_sorted.length){
                    if (all_rank_sorted[i + 1] != all_rank_sorted[i + 2] && all_rank_sorted[i] != all_rank_sorted[i -1]) {
                        counter = counter + 1;
                    }
                }else if((i+2) == all_rank_sorted.length){
                    if (all_rank_sorted[i] != all_rank_sorted[i -1]) {
                        counter = counter + 1;
                    }
                }
            }
        }
        if(counter==1) {
            return true;
        }else {
            return false;
        }
    }

    public boolean twoPair(){
        int counter = 0;
        int i;
        for ( i = 0; i < (all_rank_sorted.length -1); i++) { // sort the numbers
            if (all_rank_sorted[i] == all_rank_sorted[i + 1] ) { // if one number equal to other number
                if ((i + 2) < all_rank_sorted.length && i >= 1) { // if it is not equal the others then increase the counter
                    if (all_rank_sorted[i + 1] != all_rank_sorted[i + 2] && all_rank_sorted[i] != all_rank_sorted[i -1]) {
                        counter = counter + 1;
                    }
                }else counter = counter + 1;
            }
        }
        if(counter == 2) {
            return true;
        }else {
            return false;
        }
    }

    public boolean threePair(){  //three cards of the same rank
        int counter = 0;
        int i;
        for ( i = 0; i < (all_rank_sorted.length -1); i++) {
            if (all_rank_sorted[i] == all_rank_sorted[i + 1] ) {
                if ((i + 2) < all_rank_sorted.length && i >= 1) {
                    if (all_rank_sorted[i + 1] != all_rank_sorted[i + 2] && all_rank_sorted[i] != all_rank_sorted[i -1]) {
                        counter = counter + 1;
                    }
                }else counter = counter + 1;
            }
        }
        if(counter >=3) {
            return true;
        }else {
            return false;
        }
    }

    public boolean rainBow(){   //one of each suit
        Set<Character>set = new HashSet<Character>();
        for(int i = 0; i<all_suit.length;i++) {
            set.add(all_suit[i]);
        }

        int x = set.size();
        if(x==4) {
            return true;
        }else {
            return false;
        }
    }

    public boolean threeOfKind(){
        int counter = 0;
        for (int i = 0; i < (all_rank_sorted.length -2); i++) {
            if (all_rank_sorted[i]== all_rank_sorted[i+1]&& all_rank_sorted[i+1]== all_rank_sorted[i+2]) {
                if((i+3)<all_rank_sorted.length && i >= 1){
                    if(all_rank_sorted[i+2]!= all_rank_sorted[i+3] && all_rank_sorted[i]!= all_rank_sorted[i-1]){
                        counter = counter +1;
                    }
                }else counter = counter +1;
            }
        }
        if(counter==1) {
            return true;
        }else {
            return false;
        }
    }

    public boolean swing(){
        int counter = 0;
        ArrayList<Character> suitKing = new ArrayList<Character>();
        ArrayList<Character> suitQueen = new ArrayList<Character>();
        for(int i = 0; i < (all_rank.length );i++){
            if(all_rank[i]== 13){
                suitKing.add(all_suit[i]);
            }
            if(all_rank[i]==12){
                suitQueen.add(all_suit[i]);
            }
        }
        for(int i =0; i<suitKing.size();i++){
            for(int j = 0;j<suitQueen.size();j++){
                if(suitKing.get(i)==suitQueen.get(j)){
                    counter = counter + 1;
                }
            }
        }
        if(counter==2) {
            return true;
        }
        return false;
    }

    public boolean fiveCardStreight(){
        Set<Integer>set = new HashSet<Integer>();
        for(int i=0;i<(all_rank_sorted.length);i++){
            set.add(all_rank_sorted[i]);
        }
        Iterator<Integer>iterator = set.iterator();
        while(iterator.hasNext()) {
            Integer setElement = iterator.next();
            if (set.contains(setElement+1) && set.contains(setElement+2)&&
                    set.contains(setElement+3)&& set.contains(setElement+4)) {
                return true;

            }

        }
        return false;
    }
    public boolean Monochromatic(){
        Set<Character>set = new HashSet<Character>();
        for(int i = 0; i<all_suit.length;i++) {
            set.add(all_suit[i]);
        }

        if ((set.contains('h') || set.contains('d')) && !((set.contains('d') || set.contains('s') )) ){
            return true;
        }
        if ( !(set.contains('h') || set.contains('d')) && ((set.contains('d') || set.contains('s') )) ){
            return true;
        }
        return false;

    }
    public boolean fullHouse(){
        if(threeOfKind()==true && onePair()==true) {
            return true;
        }return false;
    }


    public boolean monarchy(){
        Set<Character>set = new HashSet<Character>();
        int counterQueen = 0;
        int counterKing = 0;
        int counterJack = 0;
        for(int i=0; i<all_rank.length;i++){
            if(all_rank[i]== 11){
                if(counterJack==0){
                    set.add(all_suit[i]);
                    counterJack++;
                }else return false;
            }
            if(all_rank[i]==12){
                if(counterQueen==0){
                    set.add(all_suit[i]);
                    counterQueen++;
                }else return false;
            }
            if(all_rank[i]==13){
                if(counterKing==0){
                    set.add(all_suit[i]);
                    counterKing++;
                }else return false;
            }
        }
        if(set.size()==1 && counterJack==1 && counterQueen==1 && counterKing==1){
            return true;
        }
        return false;
    }

    public boolean even(){
        int counter = 0;
        for(int i = 0; i< all_rank.length; i++){
            if(all_rank[i] != 12 && all_rank[i]!=14 && all_rank[i]!=11 && all_rank[i] != 13){
                if(all_rank[i]%2 ==0){
                    counter++;
                }
            }
        }
        if(counter>=6) {
            return true;
        }else return false;
    }

    public boolean sixCardStreight(){
        Set<Integer>set = new HashSet<Integer>();
        for(int i=0;i<(all_rank_sorted.length);i++){
            set.add(all_rank_sorted[i]);
        }
        Iterator<Integer>iterator = set.iterator();
        while(iterator.hasNext()) {
            Integer setElement = iterator.next();
            if (set.contains(setElement + 1) && set.contains(setElement + 2) &&
                    set.contains(setElement + 3) && set.contains(setElement + 4)&& set.contains(setElement + 5)) {
                return true;

            }
        }
        return false;
    }


    public boolean fourOfKind(){
        int counter = 0;
        for (int i = 0; i < (all_rank_sorted.length -3); i++) {
            if (all_rank_sorted[i]== all_rank_sorted[i+1]&& all_rank_sorted[i+1]== all_rank_sorted[i+2]&& all_rank_sorted[i+2]== all_rank_sorted[i+3]) {
                if((i+4)<all_rank_sorted.length && i >= 1){
                    if(all_rank_sorted[i+3]!= all_rank_sorted[i+4] && all_rank_sorted[i]!= all_rank_sorted[i-1]){
                        counter = counter +1;
                    }
                }else counter = counter +1;
            }
        }
        if(counter==1 || counter ==2) {
            return true;
        }else {
            return false;
        }
    }



    public boolean odd(){
        int counter = 0;
        for(int i = 0; i< all_rank.length; i++){
            if(all_rank[i] != 12 && all_rank[i]!=14 && all_rank[i]!=11 && all_rank[i] != 13 && all_rank[i]!=10){
                if(all_rank[i]%2 ==1){
                    counter++;
                }
            }
        }
        if(counter>=6) {
            return true;
        }else return false;
    }

    public boolean flush(){
        int counterDimend = 0;
        int counterHeart = 0;
        int counterClub = 0;
        int counterSpade = 0;

        for(int i=0;i<all_rank.length;i++){
            if(all_suit[i]=='d') {
                counterDimend++;
            }
            if(all_suit[i]=='h'){
                counterHeart++;
            }
            if(all_suit[i]=='c'){
                counterHeart++;
            }
            if(all_suit[i]=='s') {
                counterSpade++;
            }

        }if(counterClub>=6 || counterDimend>=6 || counterHeart>=6 || counterSpade >=6)
        {
            return true;
        }else return false;

    }

    public boolean thriplts(){
        int counter = 0;
        for (int i = 0; i < (all_rank_sorted.length -2); i++) {
            if (all_rank_sorted[i]== all_rank_sorted[i+1]&& all_rank_sorted[i+1]== all_rank_sorted[i+2]) {
                if((i+3)<all_rank_sorted.length && i >= 1){
                    if(all_rank_sorted[i+2]!= all_rank_sorted[i+3] && all_rank_sorted[i]!= all_rank_sorted[i-1]){
                        counter = counter +1;
                    }
                }else counter = counter +1;
            }
        }
        if(counter==2) {
            return true;
        }else {
            return false;
        }
    }

    public boolean overFullHouse(){
        if(fourOfKind()==true && onePair()==true) {
            return true;
        }else return false;
    }

    public boolean homosapiens(){
        for(int i=0; i<all_rank.length;i++){
            if(all_rank[i]<11){
                return false;
            }
        }
        return true;
    }

    public boolean kingdom(){
        if(monarchy() == true && flush() == true){
            return true;
        }
        return false;
    }

    public boolean fiveCardStreightFlush(){
        if(flush() == true && fiveCardStreight() == true){
            return true;
        }
        return false;
    }

    public boolean sixCardStreightFlush(){
        if(flush() == true && sixCardStreight() == true){
            return true;
        }
        return false;
    }
    public boolean orgy(){
        int counterQueen = 0;
        int counterJack = 0;
        for(int i = 0; i<all_rank.length;i++) {
            if(all_rank[i] == 11){
                counterQueen ++;
            }
            if (all_rank[i] == 12){
                counterJack ++;
            }
        }

        if (counterJack + counterQueen >= 6){
            return true;
        }
        return false;
    }
    public boolean politics(){
        Set<Character>setJ = new HashSet<Character>();
        Set<Character>setQ = new HashSet<Character>();
        Set<Character>setK = new HashSet<Character>();
        char[] Queen;
        char[] King;
        char[] Jack;

        for(int i=0; i<all_rank.length;i++){
            if(all_rank[i]== 11){
                setJ.add(all_suit[i]);
            }
            if(all_rank[i]==12){
                setQ.add(all_suit[i]);
            }
            if(all_rank[i]==13){
                setK.add(all_suit[i]);
            }
        }
        if(setJ.size() ==2){
            if (setK.containsAll(setJ) && setQ.containsAll(setJ)){
                return true;
            }
        }
        if(setQ.size() ==2){
            if (setK.containsAll(setQ) && setJ.containsAll(setQ)){
                return true;
            }
        }
        if(setK.size() ==2){
            if (setJ.containsAll(setK) && setQ.containsAll(setK)){
                return true;
            }
        }
        return false;
    }
    public boolean dinnerParty(){
        int counter = 0;
        ArrayList<Character> suitKing = new ArrayList<Character>();
        ArrayList<Character> suitQueen = new ArrayList<Character>();
        for(int i = 0; i < (all_rank.length );i++){
            if(all_rank[i]== 13){
                suitKing.add(all_suit[i]);
            }
            if(all_rank[i]==12){
                suitQueen.add(all_suit[i]);
            }
        }
        for(int i =0; i<suitKing.size();i++){
            for(int j = 0;j<suitQueen.size();j++){
                if(suitKing.get(i)==suitQueen.get(j)){
                    counter = counter + 1;
                }
            }
        }
        if(counter==3) {
            return true;
        }
        return false;
    }
    public boolean nonRainbow(){
        if (!rainBow()){
            return true;
        }
        return false;
    }

    public int evalute(){       // evaluating the result ,to find which one has the highest ranking
        int y = -2;
        if (nonRainbow()){
            y = -1;
        }
        if (onePair()){
            y = 0;
        }
        if (twoPair()){
            y = 1;
        }
        if (threePair()){
            y = 2;
        }
        if (rainBow()){
            y = 3;
        }
        if (threeOfKind()){
            y = 4;
        }
        if (swing()){
            y = 5;
        }
        if (fiveCardStreight()){
            y = 6;
        }
        if (Monochromatic()){
            y = 7;
        }
        if (fullHouse()){
            y = 8;
        }
        if (monarchy()){
            y = 9;
        }
        if (even()){
            y = 10;
        }
        if (sixCardStreight()){
            y = 11;
        }
        if (fourOfKind()){
            y = 12;
        }
        if (odd()){
            y = 13;
        }
        if (flush()){
            y = 14;
        }
        if (thriplts()){
            y = 15;
        }
        if (overFullHouse()){
            y = 16;
        }
        if (homosapiens()){
            y = 17;
        }
        if (kingdom()){
            y = 18;
        }
        if (fiveCardStreightFlush()){
            y = 19;
        }
        if (sixCardStreightFlush()){
            y = 20;
        }
        if (orgy()){
            y = 21;
        }
        if (politics()){
            y = 22;
        }
        if (dinnerParty()){
            y = 23;
        }
        return y;
    }

}

