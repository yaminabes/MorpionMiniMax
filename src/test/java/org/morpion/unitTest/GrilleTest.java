package org.morpion.unitTest;

import org.junit.Assert;
import org.junit.Test;
import org.morpion.Grille;

public class GrilleTest {
    //TODO
    @Test
    public void testPrintGrille(){
        Grille grille = new Grille();
        grille.printGrille();
    }

    @Test
    public void testIsSpaceFree(){
        Grille grille = new Grille();
        grille.insertLetter('x',1);
        Assert.assertFalse(grille.isSpaceFree(1));
    }

    @Test
    public void testIsSpaceFree2(){
        Grille grille = new Grille();
        grille.insertLetter('x',1);
        Assert.assertTrue(grille.isSpaceFree(3));
    }
    //TODO
    @Test
    public void testInsertLetter(){
        Grille grille = new Grille();
        grille.insertLetter('x',1);
    }

}
