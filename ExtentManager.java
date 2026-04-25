package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    public static ExtentReports extentReports;

    public static ExtentReports getReportObject() {

        String path = System.getProperty("user.dir") +
                "/reports/index.html";

        ExtentSparkReporter reporter =
                new ExtentSparkReporter(path);

        reporter.config().setReportName("Automation Test Results");
        reporter.config().setDocumentTitle("Selenium Report");

        extentReports = new ExtentReports();
        extentReports.attachReporter(reporter);

        return extentReports;
    }
}
