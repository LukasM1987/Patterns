package com.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void lastLogDate() {
        logger = Logger.INSTANCE;
        logger.log("18.06.2022");
    }

    @Test
    void getLastLog() {
        //Given
        //When
        String lastLog = logger.getLastLog();
        //Then
        assertEquals("18.06.2022", lastLog);
    }
}
