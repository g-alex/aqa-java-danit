package aqa_hw_2;

import aqa_hw_2.dto.CategoryDto;
import aqa_hw_2.dto.PetDto;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CreatePetTests {
    @Test
    public void verifyPetCanBeCreated() {
        int petIdToCreate = 784;
        String url = "https://petstore.swagger.io/v2/pet/";

        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setName("Staff");
        String petNameToCreate = "Bul";
        String status = "available";

        PetDto petDtoCreate = new PetDto(petIdToCreate, categoryDto, petNameToCreate, status);

        Response response = given()
                .contentType("application/json")
                .body(petDtoCreate)
                .post(url);
        PetDto dtoResponse = response.as(PetDto.class);

        Assert.assertEquals(petIdToCreate, dtoResponse.getId());

        Response respGet = given().get(url + petIdToCreate);
        PetDto respGetDto = respGet.as(PetDto.class);

        Assert.assertEquals(petIdToCreate, respGetDto.getId());
        Assert.assertEquals(categoryDto.getName(), respGetDto.getCategory().getName());
        Assert.assertEquals(petNameToCreate, respGetDto.getName());
        Assert.assertEquals(status, respGetDto.getStatus());
    }
}
