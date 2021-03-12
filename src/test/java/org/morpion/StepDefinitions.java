package org.morpion;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class StepDefinitions {
    @Given("la grille est vide")
    public void laGrilleEstVide() {
    }

    @When("tour du joueur")
    public void tourDuJoueur() {
    }

    @Then("l'ordinateur ne joue pas")
    public void lOrdinateurNeJouePas() {

    }

    @When("tour de ordinateur")
    public void tourDeOrdinateur() {

    }

    @Then("ordianteur joue")
    public void ordianteurJoue() {
    }

    @Given("La grille est pleine")
    public void laGrilleEstPleine() {

    }

    @Then("L'ordinateur joue sur la case du milieu")
    public void lOrdinateurJoueSurLaCaseDuMilieu() {

    }

    @Then("L'ordinateur joue en case {int}")
    public void lOrdinateurJoueEnCase(int arg0) {

    }

    @Given("La case du milieu est pleine")
    public void laCaseDuMilieuEstPleine() {
    }

    @And("les autres cases sont vides")
    public void lesAutresCasesSontVides() {
    }

    @Then("L'ordinateur joue dans un coin")
    public void lOrdinateurJoueDansUnCoin() {

    }

    @Given("deux cases sur la même ligne ou cologne ou diagonales sont occupées par le joueur")
    public void deuxCasesSurLaMêmeLigneOuCologneOuDiagonalesSontOccupéesParLeJoueur() {
    }

    @Then("l'ordinateur joue sur la troisieme case")
    public void lOrdinateurJoueSurLaTroisiemeCase() {
    }

    @Given("la case {int} est a l'ordinateur")
    public void laCaseEstALOrdinateur(int arg0) {
    }

    @And("case {int} libre")
    public void caseLibre(int arg0) {
    }

    @Then("l'ordinateur joue sur la case {int}")
    public void lOrdinateurJoueSurLaCase(int arg0) {
    }
}
