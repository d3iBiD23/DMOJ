package Ec7ccsongclassl0;

import java.util.Scanner;

class Song {
    String name;
    String artist;
    float rating;
    boolean favorite;
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Song song = new Song();
        song.name = sc.nextLine();
        song.artist = sc.nextLine();
        song.rating = sc.nextFloat();
        song.favorite = sc.nextBoolean();

        System.out.print(song.favorite ? "<3 " : "   ");
        System.out.println(song.artist + " - " + song.name);
        for (int i = 0; i < (int) song.rating; i++) {
            System.out.print("*");
        }
    }
}