package pl.battleship.game;

public enum State {

    WATER {
        @Override
        public String toString() {
            return "~";
        }
    },
    SHIP {
        @Override
        public String toString() {
            return "s";
        }
    },
    MISS {
        @Override
        public String toString() {
            return "o";
        }
    },
    HIT {
        @Override
        public String toString() {
            return "x";
        }
    }


    //stany gry dla gracza WATER, SHIP, DESTROYED_SHIP, UNKNOWN, HIT, MISS

}
