package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HerokuPage;
import utilities.ReusableMethods;

public class HerokuStepDefinitions {

    //todo
//Yeni bir test methodu olusturalim
//https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
//“Add Element” butona basin
//“Delete” butonu gorunur oluncaya kadar bekleyin
//“Delete” butonunun gorunur oldugunu test edin
//Delete butonuna basarak butonu silin
//Delete butonunun gorunmedigini test edin
 HerokuPage herokuPage=new HerokuPage();

    @Then("Add element butonuna basar")
    public void add_element_butonuna_basar() {
        herokuPage.addElement.click();
    }
    @Then("Delete butonu gorunur oluncaya kadar bekler")
    public void delete_butonu_gorunur_oluncaya_kadar_bekler() {
        ReusableMethods.waitForVisibility(herokuPage.deleteButton,3);
    }
    @Then("Delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(herokuPage.deleteButton.isDisplayed());
    }
    @Then("Delete butonuna basarak butonu siler")
    public void delete_butonuna_basarak_butonu_siler() {
       herokuPage.deleteButton.click();
    }
    @Then("Delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_eder() {
        Assert.assertTrue("delete görünüyor",herokuPage.deleteText.getText().equals(""));
    }


}
