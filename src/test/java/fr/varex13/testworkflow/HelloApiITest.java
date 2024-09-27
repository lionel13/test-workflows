package fr.varex13.testworkflow;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class HelloApiITest {

    private static final String URL = "/hello";

    @LocalServerPort
    private int port;

    @BeforeEach
    void setUp() {
        RestAssured.port = this.port;
    }

    @Test
    void hello() {

        final String responseBody = given()
                .when()
                .get(URL)
                .then()
                .assertThat().statusCode(is(200))
                .extract().asString();


        assertThat(responseBody, is(notNullValue()));
        assertThat(responseBody, is("Hello"));
    }
}