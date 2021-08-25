package pl.battleship.enums;

public enum ShipType {

    DEMOSHIP(1),
    DESTROYER(2),
    SUBMARINE(3),
    BATTLESHIP(4),
    CARRIER(5);

    public final Integer size;

    ShipType(Integer size) {
        this.size = size;
    }
}
