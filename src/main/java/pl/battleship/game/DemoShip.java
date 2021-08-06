package pl.battleship.game;

public class DemoShip extends Ship implements Cloneable{

    //docelowa klasa statków, każdy będzie miał swoją (Battleship, Cruiser itp),
    // teraz będzie tu statek demo do testów czy to działa
    // rozszerza klase Ship o implementuje intefejs cloneable,
    // żeby można było stworzyc więcej niż jeden taki statek
    // w locie, będzie miał stałą nazwę więc public String BATTLESHIP
}
