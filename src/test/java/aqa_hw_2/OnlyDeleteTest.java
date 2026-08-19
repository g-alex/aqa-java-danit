package aqa_hw_2;

import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class OnlyDeleteTest {
    @Test
    public void deletePetTest() {
        int petIdToDelete = 346374872;
        String url = "https://petstore.swagger.io/v2/pet/";

        Response deletePet = given().delete(url + petIdToDelete);
        Assert.assertEquals(404, deletePet.getStatusCode());

    }
}
