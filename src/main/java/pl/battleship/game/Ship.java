package pl.battleship.game;

import java.util.List;

public class Ship {

    private List<Field> newShip;
    private ShipType shipType;

    public Ship(List<Field> newShip, ShipType shipType) {
        this.newShip = newShip;
        this.shipType = shipType;
    }

    public List<Field> getNewShip() {
        return newShip;
    }

    public ShipType getShipType() {
        return shipType;
    }

    public void addFieldToShip(Field field) {
        newShip.add(field);
    }

    public boolean placementValid(Ship ship, List<Ship> fleet, Board board) {
        int count = 0;

        for (int i = 0; i < ship.getNewShip().size(); i++) {
            if (ship.getNewShip().get(i).getY() > board.getLength() ||
                    ship.getNewShip().get(i).getX() > board.getLength()) {
                count++;
            }
            for (int j = 0; j < fleet.size(); j++) {
                for (int z = 0; z < fleet.get(j).getNewShip().size(); z++) {
                    if (ship.getNewShip().get(i).getX() == fleet.get(j).getNewShip().get(z).getX() &&
                            ship.getNewShip().get(i).getY() == fleet.get(j).getNewShip().get(z).getY()) {
                        count++;
                    }
                }
            }
        }
        if (count == 0) {
            return true;
        }
        return false;
    }
}
