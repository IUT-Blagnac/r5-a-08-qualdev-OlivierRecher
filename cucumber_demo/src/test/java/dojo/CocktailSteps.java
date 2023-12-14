package dojo;

import static org.junit.Assert.assertEquals;

import java.util.List;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CocktailSteps {
    private Order order;

    @Given("{string} who wants to buy a drink")
    public void romeo_who_wants_to_buy_a_drink(String customer) {
        order = new Order();
        order.declareOwner(customer);
    }

    @When("an order is declared for {string}")
    public void an_order_is_declared_for_juliette(String target) {
        order.declareTarget(target);
    }

    @Then("there is {int} cocktail(s) in the order")
    public void there_is_no_cocktail_in_the_order(int nbCocktails) {
        List<String> cocktails =  order.getCocktails();
        assertEquals(nbCocktails, cocktails.size());
    }

}