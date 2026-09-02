package aqa_hw_2;

import aqa_hw_2.dto.CategoryDto;
import aqa_hw_2.dto.PetDto;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PutPetTests {
    @Test
    public void verifyPetCanBeModified() {
        int petIdToCreate = 666;
        String url = "https://petstore.swagger.io/v2/pet/";

        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setName("Cosmos");
        String petNameToCreate = "ChayChay";
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
        //System.out.println(respGetDto);
        Assert.assertEquals(petIdToCreate, respGetDto.getId());

        petDtoCreate.setName("Belka");
        petDtoCreate.setStatus("wait");
        categoryDto.setName("Cat");

        Response responsePut = given()
                .contentType("application/json")
                .body(petDtoCreate)
                .put(url);
        PetDto responsePutDto = responsePut.as(PetDto.class);

        Assert.assertEquals(petIdToCreate, responsePutDto.getId());

        Response respGetAfterPut = given().get(url + petIdToCreate);
        PetDto respGetAfterPutDto = respGetAfterPut.as(PetDto.class);
        //System.out.println(respGetAfterPutDto);

        Assert.assertEquals("Belka", respGetAfterPutDto.getName());
        Assert.assertEquals("wait", respGetAfterPutDto.getStatus());
        Assert.assertEquals("Cat", respGetAfterPutDto.getCategory().getName());
    }
}
