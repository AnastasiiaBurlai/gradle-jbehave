package stories;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static org.assertj.core.api.Assertions.*;

public class VerifyTreeSetOrder {

    Set<Integer> set;

    @Given("new tree set")
    public void newTreeSet() {
        set = new TreeSet<>();
    }

    @When("I add $elements to set")
    public void addElementsToSet(List<Integer> elements) {
        for(Integer element : elements){
            set.add(element);
        }
    }

    @Then("I verify elements are in following order $elements")
    public void verifyElementsInOrder(List<Integer> elements) {
        assertThat(set).containsExactly(elements.toArray(new Integer[0]));
    }
}
