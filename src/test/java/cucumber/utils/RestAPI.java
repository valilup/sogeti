package cucumber.utils;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.given;

public class RestAPI {

    private static Response response;
    private static final String baseUrl = "http://api.zippopotam.us/";

    public static Response GET(String url) {
        response =
                given()
                        .get(baseUrl + url);
        return response;
    }

    public static void validateStatusCode(Response response, int statusCode) {
        Assert.assertEquals(response.getStatusCode(), statusCode);
    }

    public static void checkContentType(Response response, String contentType) {
        Assert.assertEquals(response.getContentType(), contentType);
    }

    public static void checkResponseTimeSmallerThan(Response response, int time) {
        Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) < time);
    }

    public static String getSpecificResponseValue(Response response, String key) {
        JsonPath jsonPath = response.jsonPath();
        return jsonPath.getString(key);
    }

    public static void checkSpecificResponseValueIsCorrect(Response response, String key, String value) {
        Assert.assertEquals(getSpecificResponseValue(response, key), value);
    }
}
