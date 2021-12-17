package life.stepdefinitions;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class ExampleTableExSteps {
    String context;

    @Given("an example table is defined")
    public void givenAnExampleTableIsDefined() {
        // PENDING
    }

    @When("the example table is saved to the context: $table")
    public void whenTheExampleTableIsSavedToTheContext(ExamplesTable table) {
        context = table.getRow(0).toString();
    }

    @Then("the subsequent step can read the address from the context")
    public void thenTheSubsequentStepCanReadTheAddressFromTheContext() {
        System.out.println("=== Context ===");
        System.out.println(context);
    }
}
