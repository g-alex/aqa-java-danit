package testrail;

import io.restassured.response.Response;

import java.util.Base64;

import static io.restassured.RestAssured.given;

public class TestrailApi {

    private static final String BASE_API_URL = System.getenv()
            .getOrDefault("TESTRAIL_URL", "https://gerashka.testrail.io/index.php?/api/v2/");
    private static final String EMAIL = System.getenv("TESTRAIL_EMAIL");
    private static final String API_KEY = System.getenv("TESTRAIL_API_KEY");

    public static void sendResult(int statusId, int testCaseId, int runId) {
        if (EMAIL == null || API_KEY == null) {
            System.out.println("TestRail integration skipped: set TESTRAIL_EMAIL and TESTRAIL_API_KEY env vars");
            return;
        }
        String credentials = Base64.getEncoder().encodeToString((EMAIL + ":" + API_KEY).getBytes());
        Response s = given().header("Authorization", "Basic " + credentials)
                .contentType("Application/json")
                .body(new TestrailDto(statusId))
                .post(BASE_API_URL + String.format("add_result_for_case/%s/%s", runId, testCaseId));
        System.out.println(s.asPrettyString());
    }
}
