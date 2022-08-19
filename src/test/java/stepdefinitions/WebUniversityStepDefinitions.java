package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.WebUniversityPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class WebUniversityStepDefinitions {
    WebUniversityPage universityPage=new WebUniversityPage();
    Actions actions=new Actions(Driver.getDriver());

    @Given("login portala kadar asagi iner")
    public void login_portala_kadar_asagi_iner() {
        ReusableMethods.hover(universityPage.webUniversityLoginPortal);
    }
    @Given("login portala tiklar")
    public void login_portala_tiklar() {
     universityPage.webUniversityLoginPortal.click();
    }
    @Then("diger windowa gecin")
    public void diger_windowa_gecin() {
    ReusableMethods.switchToWindow("WebDriver | Login Portal");
    }
    @Then("{string} ve {string} kutularina deger yazar")
    public void ve_kutularina_deger_yazar(String username, String password) {
     universityPage.webUniversityUserNameButton.sendKeys(username);
     universityPage.webUniversityPasswordButton.sendKeys(password);
    }
    @Then("WebUniversity Login butonuna basar")
    public void web_university_login_butonuna_basar() {
      universityPage.webUniversityButton.click();
    }
    @Then("Popupta cikan yazinin {string} oldugunu test edin")
    public void popupta_cikan_yazinin_oldugunu_test_edin(String alert) {
        String pop=Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(pop,alert);
    }
    @Then("ok diyerek popupi kapatin")
    public void ok_diyerek_popupi_kapatin() {
       Driver.getDriver().switchTo().alert().accept();
    }
    @Then("Ilk sayfaya geri donun")
    public void ılk_sayfaya_geri_donun() {
     ReusableMethods.switchToWindow("WebDriverUniversity.com");
    }
    @Then("Ilk sayfaya donuldugunu test edin")
    public void ılk_sayfaya_donuldugunu_test_edin() {
      String actualTitle=Driver.getDriver().getTitle();
      String expectedTitle="WebDriverUniversity.com";
      Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Then("biraz {int} saniye bekle")
    public void birazSaniyeBekle(int sec) {
        ReusableMethods.waitFor(sec);

    }
}
