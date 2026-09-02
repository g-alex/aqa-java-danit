package aqa_hw_2;

import aqa_hw_2.dto.NotFoundPetDto;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class NotFoundGetTest {
    @Test
    public void onlyGet() {
        int petIdToGet = 1145346433;
        String url = "https://petstore.swagger.io/v2/pet/";

        Response respGet = given().get(url + petIdToGet);

        Assert.assertEquals(404, respGet.getStatusCode());

        NotFoundPetDto notFoundPet = respGet.as(NotFoundPetDto.class);

        Assert.assertEquals("error", notFoundPet.getType());
        Assert.assertEquals("Pet not found", notFoundPet.getMessage());

    }
}
