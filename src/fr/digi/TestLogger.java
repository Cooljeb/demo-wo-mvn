package fr.digi;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogger {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestLogger.class);
    public static void main(String[] args) {
        LOGGER.info("Bonjour SLF4J !");
        LOGGER.info("Implémentation Logback");

    }
}
