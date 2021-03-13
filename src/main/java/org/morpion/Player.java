package org.morpion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {
    public char mark;
    Grille grille;
    Scanner input = new Scanner(System.in);
    public Player(Grille grille){
        this.grille = grille;
        this.mark = 'O';
    }

    public void move(){
        System.out.println("Veuillez entrer une position pour O: ");

        String in = input.next();
        try{
            int position = Integer.parseInt(in);
            if(grille.isSpaceFree(position)){
                grille.insertLetter(mark, position);
            }
            else{
                System.out.println("Case occupée !");
                move();
            }

        }catch (NumberFormatException | NullPointerException e){
            System.out.println("Vous devez entrer une valeur entière entre 1 et 9");
            move();
        }
    }
}
