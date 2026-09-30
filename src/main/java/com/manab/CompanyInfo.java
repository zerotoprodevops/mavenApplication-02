package com.manab;

/**
 * CompanyInfo - Holds and displays static company information
 * for Manab Technologies Ltd - Live DevOps Training Center
 */
public class CompanyInfo {

    // ── Static Company Details ──────────────────────────────────────
    private static final String COMPANY_NAME      = "Manab Technologies Ltd";
    private static final String TAGLINE           = "Live DevOps Training Center";
    private static final String WEBSITE           = "www.manabtechnologies.com";
    private static final String EMAIL             = "info@manabtechnologies.com";
    private static final String PHONE             = "+91-XXXX-XXXXXX";
    private static final String LOCATION          = "India";
    private static final String ESTABLISHED       = "2020";

    // ── Training Courses Offered ────────────────────────────────────
    private static final String[] COURSES = {
        "DevOps Engineering (CI/CD, Jenkins, GitHub Actions)",
        "Docker & Kubernetes (Container Orchestration)",
        "AWS / Azure / GCP Cloud Training",
        "Linux Administration & Shell Scripting",
        "Terraform & Infrastructure as Code (IaC)",
        "Ansible Configuration Management",
        "Monitoring with Prometheus & Grafana",
        "Git & Version Control Workflows"
    };

    // ── Key Features ────────────────────────────────────────────────
    private static final String[] FEATURES = {
        "LIVE Instructor-Led Online Sessions",
        "Hands-on Lab Environments",
        "Real-World Project Experience",
        "Interview Preparation & Placement Support",
        "Recorded Session Access",
        "Industry-Certified Trainers"
    };

    /**
     * Prints a formatted banner with all company information.
     */
    public void displayInfo() {
        printBorder('=', 60);
        printCentered("MANAB TECHNOLOGIES LTD", 60);
        printCentered("~ Live DevOps Training Center ~", 60);
        printBorder('=', 60);

        System.out.println();
        System.out.println("  COMPANY DETAILS");
        printBorder('-', 60);
        System.out.printf("  %-18s: %s%n", "Name",        COMPANY_NAME);
        System.out.printf("  %-18s: %s%n", "Tagline",     TAGLINE);
        System.out.printf("  %-18s: %s%n", "Established", ESTABLISHED);
        System.out.printf("  %-18s: %s%n", "Location",    LOCATION);
        System.out.printf("  %-18s: %s%n", "Website",     WEBSITE);
        System.out.printf("  %-18s: %s%n", "Email",       EMAIL);
        System.out.printf("  %-18s: %s%n", "Phone",       PHONE);

        System.out.println();
        System.out.println("  COURSES OFFERED");
        printBorder('-', 60);
        for (int i = 0; i < COURSES.length; i++) {
            System.out.printf("  %d. %s%n", i + 1, COURSES[i]);
        }

        System.out.println();
        System.out.println("  KEY FEATURES");
        printBorder('-', 60);
        for (String feature : FEATURES) {
            System.out.println("  ✔  " + feature);
        }

        System.out.println();
        printBorder('=', 60);
        printCentered("Enroll Today | Learn. Build. Deploy.", 60);
        printBorder('=', 60);
        System.out.println();
    }

    // ── Helper methods ──────────────────────────────────────────────

    private void printBorder(char ch, int width) {
        System.out.println(String.valueOf(ch).repeat(width));
    }

    private void printCentered(String text, int width) {
        int padding = (width - text.length()) / 2;
        String padStr = " ".repeat(Math.max(0, padding));
        System.out.println(padStr + text);
    }
}
