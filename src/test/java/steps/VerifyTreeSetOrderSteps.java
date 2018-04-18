package steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static org.assertj.core.api.Assertions.*;

public class VerifyTreeSetOrderSteps extends Steps {

    private Set<Integer> set;

    @Given("new tree set")
    public void newTreeSet() {
        set = new TreeSet<>();
    }

    @When("I add $elements to set")
    public void addElementsToSet(List<Integer> elements) {
        set.addAll(elements);
    }

    @Then("I verify elements are in following order $elements")
    public void verifyElementsInOrder(List<Integer> elements) {
        assertThat(set).containsExactly(elements.toArray(new Integer[0]));
    }
}