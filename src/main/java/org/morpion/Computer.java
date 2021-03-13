package org.morpion;

public class Computer {
    Grille grille;
    Player player;
    char mark;
    public Computer(Grille grille, Player player){
        this.grille = grille;
        this.mark = 'X';
        this.player = player;
    }

    public int minimax(Grille grille, int depth, boolean isMaximizing){
        int score = -1;
        int bestScore;
        if(grille.checkWichMarkWon(mark)){
            return 1;
        }
        else if( grille.checkWichMarkWon(player.mark)){
            return -1;
        }
        else if(grille.checkForDraw()){
            return 0;
        }
        if (isMaximizing){
            bestScore = -800;
            for (int key : grille.grille.keySet()){
                if(grille.grille.get(key) == ' '){
                    grille.grille.replace(key, mark);
                    score = minimax(grille, depth + 1, false);
                    grille.grille.replace(key, ' ');
                    if(score > bestScore){
                        bestScore = score;
                    }
                }
            }

        }
        else {
            bestScore = 800;
            for (int key : grille.grille.keySet()){
                if(grille.grille.get(key) == ' '){
                    grille.grille.replace(key, player.mark);
                    score = minimax(grille, depth + 1, true);
                    grille.grille.replace(key, ' ');
                    if(score < bestScore){
                        bestScore = score;
                    }
                }
            }

        }
        return bestScore;
    }

    public void move(){
        int bestScore = -800;
        int bestMove = 5;
        int score ;
        for (int key : grille.grille.keySet()){

            if(grille.grille.get(key) == ' '){
                grille.grille.replace(key, mark);
                score = minimax(grille, 0, false);
                grille.grille.replace(key, ' ');
                if(score > bestScore){
                    bestScore = score;
                    bestMove = key;
                }
            }
        }
        System.out.println(bestMove);
        grille.insertLetter(mark, bestMove);
    }

    public void firstMove(){
        grille.insertLetter(mark, 5);

    }
}
