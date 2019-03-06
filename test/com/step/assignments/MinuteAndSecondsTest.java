package com.step.assignments;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinuteAndSecondsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("it should covert input to correct time format")
    void shouldReturnTheCorrectFormat() {
        String actualOutput = MinuteAndSeconds.getDurationString(60,40);
        String expectedOutput = "01h 00m 40s";
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @DisplayName("it should return the invalid message")
    void shouldReturnError() {
        String actualOutput = MinuteAndSeconds.getDurationString(60,60);
        String expectedOutput = "invalid value";
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @DisplayName("it should return the invalid message")
    void shouldReturnErrorInSeconds() {
        String actualOutput = MinuteAndSeconds.getDurationString(-1);
        String expectedOutput = "invalid value";
        assertEquals(expectedOutput, actualOutput);
    }
}