package steps;


import com.sun.source.tree.IfTree;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.CommonMethods;

import java.time.Duration;

public class Hooks extends CommonMethods {

@Before
    public void start(){
        openBrowser();
        //driver = new ChromeDriver();
        //driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/leave/viewLeaveList");
        //driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

   @After
    public void end(Scenario scenario){
    byte[] pic;
       if (scenario.isFailed()){
          pic = takeScreenShot("failed/" +scenario.getName());
       }else {
           pic = takeScreenShot("passed/" +scenario.getName());
       }scenario.attach(pic, "image/png", scenario.getName());
        closeBrowser();
    }
}
