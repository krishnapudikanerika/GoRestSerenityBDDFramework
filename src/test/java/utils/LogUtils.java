package utils;

import io.restassured.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogUtils {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(
                    LogUtils.class);

    public static void step(String stepName) {

        LOGGER.info("");
        LOGGER.info(
                "================================================");
        LOGGER.info(stepName);
        LOGGER.info(
                "================================================");
    }

    public static void logRequest(
            String method,
            String url,
            Object body) {

        LOGGER.info("");

        LOGGER.info(
                "================================");

        LOGGER.info(
                "REQUEST METHOD : {}", method);

        LOGGER.info(
                "REQUEST URL    : {}", url);

        LOGGER.info(
                "REQUEST BODY   :");

        LOGGER.info(
                "{}",
                body == null
                        ? "NO BODY"
                        : body);

        LOGGER.info(
                "================================");
    }

    public static void logResponse(
            Response response) {

        LOGGER.info("");

        LOGGER.info(
                "================================");

        LOGGER.info(
                "STATUS CODE    : {}",
                response.getStatusCode());

        LOGGER.info(
                "RESPONSE BODY  :");

        LOGGER.info(
                response.asPrettyString());

        LOGGER.info(
                "================================");
    }
}