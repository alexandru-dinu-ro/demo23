package org.example.step_definitions;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.example.product.Product;
import org.junit.Assert;

public class SearchForProductSD {

    private Response response;

    @When("user calls the search product endpoint for {string}")
    public void user_calls_the_search_product_endpoint_for(String product) {
        response = given().get(
                "https://waarkoop-server.herokuapp.com/api/v1/search/demo/" + product);
    }

    @Then("user should receive response status code {int}")
    public void user_should_receive_response_status_code(int expected_status_code) {
        restAssuredThat(response -> response.statusCode(expected_status_code));
    }

    @Then("user should receive response body containing {int} items")
    public void user_should_receive_response_body_containing_items(int expected_item_count) {
        Assert.assertEquals(expected_item_count,
                response.jsonPath().getList("", Product.class).size());
    }
}
