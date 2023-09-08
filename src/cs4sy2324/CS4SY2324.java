/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cs4sy2324;

/**
 *
 * @author USER
 */
public class CS4SY2324 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String anime1 = "Sword Art Online";
        double rating1 = 4.0;
        int noOfSeasons1 = 4;
        
        String anime2 = "Attack On Titan";
        double rating2 = 4.3;
        int noOfSeasons2 = 4;
        
        String anime3 = "Boku No Hero Academia";
        double rating3 = 4.1;
        int noOfSeasons3 = 5;

        double totalRating = rating1 + rating2 + rating3;
        double averageRating = totalRating/3;

        boolean ratingComparison = (rating2 > rating1) && (rating2 > rating3);
        
        boolean seasonComparison = (noOfSeasons1 == noOfSeasons2) || (noOfSeasons1 == noOfSeasons3) || (noOfSeasons2 == noOfSeasons3);
        
        System.out.println("Anime name: " + anime1);
        System.out.println("Rating: " + rating1);
        System.out.println("Number of Seasons: " + noOfSeasons1);
        
        System.out.println("");
        
        System.out.println("Anime name: " + anime2);
        System.out.println("Rating: " + rating2);
        System.out.println("Number of Seasons: " + noOfSeasons2);
        
        System.out.println("");
        
        System.out.println("Anime name: " + anime3);
        System.out.println("Rating: " + rating3);
        System.out.println("Number of Seasons: " + noOfSeasons3);
        
        System.out.println("");
        
        System.out.println("Average Rating of All Animes: " + averageRating);
        
        System.out.println("Attack on Titan is the anime with the highest rating: " + ratingComparison);
        System.out.println("There are at least two animes with the same number of seasons: " + seasonComparison);
    }
    
}
