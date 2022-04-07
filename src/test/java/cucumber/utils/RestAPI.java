package cucumber.utils;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.given;

public class RestAPI {
    private static final String baseUrl = "http://api.zippopotam.us/";
    private static Response response;

    public static Response GET(String url) {
        response = given().get(baseUrl + url);
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

    public static void checkThatPostalCodeHasPlaceName(Response response, String postalCode, String placeName) throws ParseException {
        JSONParser parser = new JSONParser();
        Object object = parser.parse(response.asString());
        JSONObject responseJsonObject = (JSONObject) object;

        JSONArray placesJsonArray = (JSONArray) responseJsonObject.get("places");
        for (int i = 0; i < placesJsonArray.size(); i++) {
            JSONObject jsonPlaces = (JSONObject) placesJsonArray.get(i);

            String postCode = (String) jsonPlaces.get("post code");
            String placesPlaceName = (String) jsonPlaces.get("place name");

            if (postCode.equals(postalCode)){
                Assert.assertEquals(placesPlaceName, placeName);
            }
        }
    }
}
