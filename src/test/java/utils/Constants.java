package utils;

public class Constants {

    public static final String CONFIG_FILE_PATH = "src/test/resources/config/config.properties";
    public static final String SCREENSHOT_FILEPATH = System.getProperty("user.dir") + "/screenshots/";
    public static final String CREDENTIALS_FILEPATH = "src/test/resources/configs/credentials.properties";
    public static final String CHROME_DRIVER_PATH = "src/test/resources/drivers/chromedriver.exe";
    public static final String GECKO_DRIVER_PATH = "src/test/resources/drivers/geckodriver.exe";
    public static final String IE_DRIVER_PATH = "src/test/resources/drivers/IEDriverServer.exe";
    public static final String EDGE_DRIVER_PATH = "src/test/resources/drivers/msedgedriver.exe";
    public static final String REPORT_FILEPATH = System.getProperty("user.dir") + "/target/report.html";
    public static final int IMPLICIT_WAIT_TIME = 10;
    public static final int EXPLICIT_WAIT_TIME = 20;
    public static final int PAGE_LOAD_WAIT_TIME = 30;
}
