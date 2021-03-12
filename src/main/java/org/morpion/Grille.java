package org.morpion;

import java.util.List;

public class Grille {
    int[] grille;


    public Grille(){
        grille = new int[9];
    }



    public void displayGrille(){
        for (int i : grille){
            if (i%3 == 0){
                System.out.println("|  |  |  |");
                
            }
        }
    }
}
