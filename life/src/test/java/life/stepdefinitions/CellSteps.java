package life.stepdefinitions;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

public class CellSteps {
    private Cell cell;

    @Given("a dead cell")
    public void givenDeadCell() {
        cell = new Cell(false);
    }

    @Given("the cell has 3 live neighbours")
    public void givenTheCellHas3LiveNeighbours() {
        cell.setNumberOfNeighbours(3);
    }

    @When("the cell evolves to the next generation")
    public void whenTheCellEvolvesToTheNextGeneration() {
        cell.evolve();
    }

    @Then("the cell is now alive")
    public void thenTheCellIsNowAlive() {
        Assert.assertTrue("Cell is not alive!", cell.getAlive());
    }
}
