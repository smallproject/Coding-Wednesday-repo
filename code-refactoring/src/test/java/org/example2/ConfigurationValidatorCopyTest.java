package org.example2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfigurationValidatorCopyTest {

    @Test
    void validateConfiguration() {
        // Arrange
        // Act
        var config = new Config("user", "mySecret" , "http://localhost:8080");
        var validationResult = new ConfigurationValidatorCopy().validateConfiguration(config);

        // Assert
        assertEquals(config, new Config("user", "mySecret" , "http://localhost:8080"));
        assertEquals(true ,validationResult);
    }

    @Test
    void testValidateConfiguration() {
    }
}