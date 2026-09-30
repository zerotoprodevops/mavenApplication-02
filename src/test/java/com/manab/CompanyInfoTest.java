package com.manab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit Tests for CompanyInfo class
 * Tests that all static company information is displayed correctly
 */
@DisplayName("CompanyInfo Unit Tests")
public class CompanyInfoTest {

    private CompanyInfo companyInfo;
    private ByteArrayOutputStream outputStream;

    // ── Setup ────────────────────────────────────────────────────────
    @BeforeEach
    void setUp() {
        companyInfo = new CompanyInfo();

        // Capture console output for assertions
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    // ── Tests ────────────────────────────────────────────────────────

    @Test
    @DisplayName("Output should contain company name")
    void testCompanyNameIsDisplayed() {
        companyInfo.displayInfo();
        String output = outputStream.toString();

        assertTrue(output.contains("Manab Technologies Ltd"),
            "Output should contain the company name: Manab Technologies Ltd");
    }

    @Test
    @DisplayName("Output should contain tagline")
    void testTaglineIsDisplayed() {
        companyInfo.displayInfo();
        String output = outputStream.toString();

        assertTrue(output.contains("Live DevOps Training Center"),
            "Output should contain the tagline: Live DevOps Training Center");
    }

    @Test
    @DisplayName("Output should contain website")
    void testWebsiteIsDisplayed() {
        companyInfo.displayInfo();
        String output = outputStream.toString();

        assertTrue(output.contains("www.manabtechnologies.com"),
            "Output should contain the website URL");
    }

    @Test
    @DisplayName("Output should contain email address")
    void testEmailIsDisplayed() {
        companyInfo.displayInfo();
        String output = outputStream.toString();

        assertTrue(output.contains("info@manabtechnologies.com"),
            "Output should contain the email address");
    }

    @Test
    @DisplayName("Output should contain establishment year")
    void testEstablishedYearIsDisplayed() {
        companyInfo.displayInfo();
        String output = outputStream.toString();

        assertTrue(output.contains("2020"),
            "Output should contain the established year: 2020");
    }

    @Test
    @DisplayName("Output should contain Docker & Kubernetes course")
    void testDockerCourseIsDisplayed() {
        companyInfo.displayInfo();
        String output = outputStream.toString();

        assertTrue(output.contains("Docker & Kubernetes"),
            "Output should list Docker & Kubernetes course");
    }

    @Test
    @DisplayName("Output should contain AWS course")
    void testAWSCourseIsDisplayed() {
        companyInfo.displayInfo();
        String output = outputStream.toString();

        assertTrue(output.contains("AWS"),
            "Output should list AWS training course");
    }

    @Test
    @DisplayName("Output should mention LIVE sessions feature")
    void testLiveSessionFeatureIsDisplayed() {
        companyInfo.displayInfo();
        String output = outputStream.toString();

        assertTrue(output.contains("LIVE"),
            "Output should mention LIVE Instructor-Led sessions");
    }

    @Test
    @DisplayName("Output should not be empty")
    void testOutputIsNotEmpty() {
        companyInfo.displayInfo();
        String output = outputStream.toString();

        assertFalse(output.isEmpty(), "Output should not be empty");
    }

    @Test
    @DisplayName("Output should contain section headers")
    void testSectionHeadersArePresent() {
        companyInfo.displayInfo();
        String output = outputStream.toString();

        assertAll("Section headers should all be present",
            () -> assertTrue(output.contains("COMPANY DETAILS"),  "Missing: COMPANY DETAILS section"),
            () -> assertTrue(output.contains("COURSES OFFERED"),  "Missing: COURSES OFFERED section"),
            () -> assertTrue(output.contains("KEY FEATURES"),     "Missing: KEY FEATURES section")
        );
    }
}
