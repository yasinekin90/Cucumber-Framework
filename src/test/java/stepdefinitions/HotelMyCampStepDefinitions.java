package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HMCPage;
import utilities.ConfigurationReader;

public class HotelMyCampStepDefinitions {

    HMCPage hmcPage=new HMCPage();

    @When("login linkine tiklar")
    public void login_linkine_tiklar() {
     hmcPage.mainPageLogin.click();
    }
    @Then("kullanici adi olarak {string} girer")
    public void kullanici_adi_olarak_girer(String string) {
        hmcPage.usernameTextBox.sendKeys(ConfigurationReader.getProperty(string));
    }
    @Then("password olarak {string} girer")
    public void password_olarak_girer(String string) {
      hmcPage.passwordTextBox.sendKeys(ConfigurationReader.getProperty(string));
    }
    @Then("login butonuna basar")
    public void login_butonuna_basar() {
     hmcPage.loginButonu.click();
    }
    @Then("basarili olarak giris yaptigini test eder")
    public void basarili_olarak_giris_yaptigini_test_eder() {

        Assert.assertTrue("basarılı giris yapılamadı",hmcPage.basariliGirisYaziElementi.isDisplayed());
    }

    @Then("giris yapilamadigini test eder")
    public void giris_yapilamadigini_test_eder() {
        Assert.assertTrue("basarılı giris yapıldı",hmcPage.girisYapilamadiYaziElementi.isDisplayed());
    }

    @And("password olarak {string} girmeli")
    public void passwordOlarakGirmeli(String password) {
        hmcPage.passwordTextBox.sendKeys(password);
    }

    @And("kullanici adi olarak {string} girmeli")
    public void kullaniciAdiOlarakGirmeli(String username) {
        hmcPage.usernameTextBox.sendKeys(username);
    }


}
