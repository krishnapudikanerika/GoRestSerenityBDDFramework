package utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log {

    private static final Logger LOGGER =
            LoggerFactory.getLogger("GoRestFramework");

    public static void info(String message) {
        LOGGER.info(message);
    }

    public static void error(String message) {
        LOGGER.error(message);
    }

    public static void warn(String message) {
        LOGGER.warn(message);
    }
}