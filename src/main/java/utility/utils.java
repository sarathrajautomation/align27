package utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.android.AndroidDriver;

public class utils {
    public static String takeScreenshot(AndroidDriver driver, String name) throws IOException {

        String time = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));

        String path = "Screenshots/" + name + "_" + time + ".png";

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        File dest = new File(path);

        FileUtils.copyFile(src, dest);

        return dest.getAbsolutePath();
    }
}
