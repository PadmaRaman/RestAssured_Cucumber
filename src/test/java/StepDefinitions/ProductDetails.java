package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ProductDetails {

    private Response response;

    @Given("the base URI is {string}")
    public void the_base_uri_is(String baseUri) {
        RestAssured.baseURI = baseUri;
    }
    @When("I send a GET request to retrieve all books using {string}")
    public void i_send_a_get_request_to_retrieve_all_books_using(String endpoint) {
        response = given().header("ContentType","application/json")
                .when().log().all().get(endpoint);
    }
    @Then("the status code should be {int}")
    public void the_status_code_should_be(Integer expectedStatus) {
        response.then().log().all().statusCode(expectedStatus);
    }
    /*@Then("the {string} should be {int}")
    public void the_should_be(String attribute, Integer value) {
       response.then().log().all()
               .body(attribute,equalTo(value));
    }*/
    @Then("the response should contain {string} array")
    public void the_response_should_contain_array(String key) {
        response.then().log().all().body(key,notNullValue());
    }
    @Then("each product should have atleast id, name, price and category")
    public void each_product_should_have_atleast_and() {
        response.then().log().all()
                .body("products.size()", greaterThan(0))
                .body("products.id", everyItem(notNullValue()))
                .body("products.name", everyItem(notNullValue()))
                .body("products.price", everyItem(notNullValue()))
                .body("products.category", everyItem(notNullValue()));
    }
    @Then("the {string} array should not be empty")
    public void the_array_should_not_be_empty(String str1) {
        response.then().log().all()
                .body(str1+".size()", greaterThan(0));
    }
    @When("I send a POST request to add all books using {string}")
    public void i_send_a_post_request_to_add_all_books_using(String endpoint) {
        response =  given().header("Content-Type","application/json")
                .when().log().all().post(endpoint);
    }
    /*@Then("the {string} should be {string}")
    public void the_should_be(String attribute, String value) {
        JsonPath json =  response.jsonPath();
        String actual =  json.getString(attribute);
        System.out.println("The Actual value is" +actual);
        response.then().log().all()
                .body(attribute, equalTo(value));
    }*/
    @Then("each product should have atleast id and brand")
    public void each_product_should_have_atleast_id_and_brand() {
         response.then().log().all()
                 .body("brands.size()", greaterThan(0))
                 .body("brands.id",everyItem(notNullValue()))
                 .body("brands.brand", everyItem(notNullValue()));
    }

    @When("I send a PUT request to add all books using {string}")
    public void i_send_a_put_request_to_add_all_books_using(String endpoint) {
        response = given()
                .when().log().all().put(endpoint);
    }
    @When("I send a POST request to add all books using {string} filtered as {string}")
    public void i_send_a_get_request_to_add_all_books_using(String endpoint, String parameter) {
        response = given().header("ContentType","application/json").queryParam("search_product", parameter)
                .when().log().all().post(endpoint);
    }

    @When("I send a POST request to login to {string} using {string}, {string}")
    public void i_send_a_post_request_to_login_using(String endpoint, String email, String password) {
        response = given().header("ContentType","application/json").queryParam("email", email).queryParam("password", password)
                .when().log().all().post(endpoint);
    }
    //Regular expressions
    /*@When("^I send a POST request to login to (.+) using (.+)$")
    public void i_send_a_post_request_to_login_to_using(String endpoint, String password) {
        response = given().header("ContentType","application/json").queryParam("password", password)
                .when().log().all().post(endpoint);
    }*/
    @When("I send a POST request to login to {string} using {string}")
    public void i_send_a_post_request_to_login_to_using(String endpoint, String password) {
        response = given().header("ContentType","application/json").queryParam("password", password)
                .when().log().all().post(endpoint);
    }

    @When("I send a DELETE request to login to {string}")
    public void i_send_a_delete_request_to_login_to(String endpoint) {
        response = given()
                .when().log().all().delete(endpoint);
    }

    /*@When("I send a POST request to login to {string}")
    public void i_send_a_post_request_to_login_to(String string, List<String> data) {
        System.out.println(data.get(0));
        System.out.println(data.get(1));
        System.out.println(data.get(2));
        System.out.println(data.get(3));
        System.out.println(data.get(4));
        System.out.println(data.get(5));
        System.out.println(data.get(6));
    }*/

    @When("I send a POST request to login to {string}")
    public void i_send_a_post_request_to_login_to(String endpoint) {
        response = given()
                .when().log().all().post(endpoint);
    }


}
