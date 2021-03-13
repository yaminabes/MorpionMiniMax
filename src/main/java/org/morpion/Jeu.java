package org.morpion;

public class Jeu {
    public static void main(String[] args) {
        Grille grille = new Grille();
        Player player = new Player(grille);
        Computer computer = new Computer(grille, player);
        computer.firstMove();

        while (!(grille.checkForWin()||grille.checkForDraw())){
            player.move();
            computer.move();
        }
    }
}
