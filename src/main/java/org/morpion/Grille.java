package org.morpion;


import java.util.HashMap;
import java.util.Map;

public class Grille {
    public Map<Integer,Character> grille;
    public Grille(){
        initGrille();
    }

    public void initGrille(){
        grille = new HashMap<Integer, Character>();

        grille.put(1,' ');
        grille.put(2,' ');
        grille.put(3,' ');
        grille.put(4,' ');
        grille.put(5,' ');
        grille.put(6,' ');
        grille.put(7,' ');
        grille.put(8,' ');
        grille.put(9,' ');
    }

    public void printGrille(){
        System.out.println("--+-+-+");
        System.out.println("|"+grille.get(1) + "|" +grille.get(2) + "|" + grille.get(3)+"|" );
        System.out.println("+-+-+-+");
        System.out.println("|"+grille.get(4) + "|" +grille.get(5) + "|" + grille.get(6)+"|" );
        System.out.println("+-+-+-+");
        System.out.println("|"+grille.get(7) + "|" +grille.get(8) + "|" + grille.get(9)+"|" );
        System.out.println("--+-+-+");

    }

    public boolean isSpaceFree(int position){
        return (grille.get(position) == ' ');
    }

    public void insertLetter(char letter, int position){
        if(isSpaceFree(position)){
           grille.replace(position, letter) ;
           printGrille();
           if(checkForDraw()){
               System.out.println(" La grille est PAT");
           }
           if(checkForWin()){
               if (letter == 'X'){
                   System.out.println("L'IA a gagné !");
               }
               else{
                   System.out.println("Le joueur a gagné !");
               }
           }
        }
    }


    public boolean checkForDraw() {
        for (int key : grille.keySet()){
            if(grille.get(key) == ' '){
                return false;
            }
        }
        return true;
    }

    public boolean checkForWin() {
        //horizontal
        if(grille.get(1) == grille.get(2) && grille.get(1) == grille.get(3) && grille.get(1) != ' '){
            return true;
        }
        else if (grille.get(4) == grille.get(5) && grille.get(4) == grille.get(6) && grille.get(4) != ' '){
            return true;
        }
        else if (grille.get(7) == grille.get(8) && grille.get(7) == grille.get(9) && grille.get(7) != ' '){
            return true;
        }
        // vertical
        else if (grille.get(1) == grille.get(4) && grille.get(1) == grille.get(7) && grille.get(1) != ' '){
            return true;
        }
        else if (grille.get(2) == grille.get(5) && grille.get(2) == grille.get(8) && grille.get(2) != ' '){
            return true;
        }
        else if (grille.get(3) == grille.get(6) && grille.get(3) == grille.get(9) && grille.get(3) != ' '){
            return true;
        }
        //diagonale
        else if (grille.get(1) == grille.get(5) && grille.get(1) == grille.get(9) && grille.get(1) != ' '){
            return true;
        }
        else return grille.get(7) == grille.get(5) && grille.get(7) == grille.get(3) && grille.get(7) != ' ';
    }

    public boolean checkWichMarkWon(char mark) {
        //horizontal
        if(grille.get(1) == grille.get(2) && grille.get(1) == grille.get(3) && grille.get(1) == mark){
            return true;
        }
        else if (grille.get(4) == grille.get(5) && grille.get(4) == grille.get(6) && grille.get(4) ==mark){
            return true;
        }
        else if (grille.get(7) == grille.get(8) && grille.get(7) == grille.get(9) && grille.get(7) == mark){
            return true;
        }
        // vertical
        else if (grille.get(1) == grille.get(4) && grille.get(1) == grille.get(7) && grille.get(1) == mark){
            return true;
        }
        else if (grille.get(2) == grille.get(5) && grille.get(2) == grille.get(8) && grille.get(2) == mark){
            return true;
        }
        else if (grille.get(3) == grille.get(6) && grille.get(3) == grille.get(9) && grille.get(3) == mark){
            return true;
        }
        //diagonale
        else if (grille.get(1) == grille.get(5) && grille.get(1) == grille.get(9) && grille.get(1) == mark){
            return true;
        }
        else if (grille.get(7) == grille.get(5) && grille.get(7) == grille.get(3) && grille.get(7) == mark){
            return true;
        }
        return false;
    }
}
