package aqa_hw_11.testrail;


import io.restassured.response.Response;

import java.util.Base64;

import static io.restassured.RestAssured.given;

public class TestrailApi {

    private static final String RUN_ID = "13";
    public static final String API = "***REMOVED***";
    public static final String EMAIL = "***REMOVED***";
    public static final String BASE_API_URL = "https://gerashka.testrail.io/index.php?/api/v2/";
    private static final String CREDENTIALS = Base64.getEncoder().encodeToString((EMAIL + ":" + API).getBytes());

    public static void sendResult(int statusId, int testCaseId) {
        Response s = given().header("Authorization", "Basic " + CREDENTIALS)
                .contentType("Application/json")
                .body(new TestrailDto(statusId))
                .post(BASE_API_URL + String.format("add_result_for_case/%s/%s", RUN_ID, testCaseId));
        System.out.println(s.asPrettyString());
    }

}
