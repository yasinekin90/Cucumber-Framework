package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class AmazonStepDefinations {

    AmazonPage amazonPage=new AmazonPage();
    @Given("kullanici amazon sayfasina gider.")
    public void kullanici_amazon_sayfasina_gider() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get(ConfigurationReader.getProperty("AmazonURL"));
    }

    @Given("kullanici {string} sayfasina gider.")
    public void kullanici_sayfasina_gider(String istenenURL) {
       Driver.getDriver().get(ConfigurationReader.getProperty(istenenURL));
    }
    @Given("iphone icin arama yapar")
    public void iphone_icin_arama_yapar() {
        // Write code here that turns the phrase above into concrete actions
        amazonPage.aramaKutusu.sendKeys("iphone", Keys.ENTER);
    }
    @Then("Sonuclarin iphone icerdigini test eder.")
    public void sonuclarin_iphone_icerdigini_test_eder() {
        // Write code here that turns the phrase above into concrete actions
       String sonuc=amazonPage.sonucIcerigi.getText();
        Assert.assertTrue(sonuc.contains("iphone"));
    }
    @Given("tea pot icin arama yapar.")
    public void tea_pot_icin_arama_yapar() {

        amazonPage.aramaKutusu.sendKeys("tea pot", Keys.ENTER);
    }
    @Then("sonuclarin teapot icerdigini test eder.")
    public void sonuclarin_teapot_icerdigini_test_eder() {
        String sonuc=amazonPage.sonucIcerigi.getText();
        Assert.assertTrue(sonuc.contains("tea pot"));
    }

    @Given("flower icin arama yapar")
    public void flower_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("flower", Keys.ENTER);
    }

    @Then("sonuclarin flower icerdigini test eder")
    public void sonuclarin_flower_icerdigini_test_eder() {
        String sonuc=amazonPage.sonucIcerigi.getText();
        Assert.assertTrue(sonuc.contains("flower"));
    }

    @Given("{string} icin arama yapar")
    public void icin_arama_yapar(String arananKelime) {
        amazonPage.aramaKutusu.sendKeys(arananKelime, Keys.ENTER);
    }

    @Then("Sonuclarin {string} icerdigini test eder.")
    public void sonuclarin_icerdigini_test_eder(String arananKelime) {
       String sonuc=amazonPage.sonucIcerigi.getText();
       Assert.assertTrue(sonuc.contains(arananKelime));
    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
       Driver.closeDriver();
    }



}
