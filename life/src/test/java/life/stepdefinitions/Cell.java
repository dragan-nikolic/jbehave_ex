package life.stepdefinitions;

public class Cell {
    private boolean alive;
    private int numberOfNeighbours;

    public Cell(boolean alive) {
        this.alive = alive;
    }

    public boolean getAlive() {
        return alive;
    }

    public void setNumberOfNeighbours(int numberOfNeighbours) {
        this.numberOfNeighbours = numberOfNeighbours;
    }

    public void evolve() {
        if (alive) {
            if (numberOfNeighbours != 2 && numberOfNeighbours != 3) {
                alive = false;
            }
        } else {
            if (numberOfNeighbours == 3) {
                alive = true;
            }
        }
    }
}
