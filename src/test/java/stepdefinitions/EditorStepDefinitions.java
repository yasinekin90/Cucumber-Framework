package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.EditorPage;

public class EditorStepDefinitions {
    EditorPage editorPage=new EditorPage();

    @When("new butonuna basar")
    public void newButonunaBasar() {
        editorPage.newButonu.click();
    }

    @Then("firstname olarak {string} girer")
    public void firstnameOlarakGirer(String firstname) {
        editorPage.firstNameBox.sendKeys(firstname);
    }

    @Then("lastname olarak {string} girer")
    public void lastnameOlarakGirer(String lastname) {
        editorPage.lastNameBox.sendKeys(lastname);
    }

    @Then("Position olarak {string} girer")
    public void positionOlarakGirer(String position) {
        editorPage.possitionBox.sendKeys(position);
    }

    @Then("Office olarak {string} girer")
    public void officeOlarakGirer(String office) {
        editorPage.officeBox.sendKeys(office);
    }

    @Then("Extension olarak {string} girer")
    public void extensionOlarakGirer(String extention) {
        editorPage.extensionBox.sendKeys(extention);
    }

    @Then("Start date olarak {string} girer")
    public void startDateOlarakGirer(String date) {
        editorPage.dateBox.sendKeys(date);
    }

    @Then("Salary olarak {string} girer")
    public void salaryOlarakGirer(String salary) {
        editorPage.salary.sendKeys(salary);
    }

    @And("kullanici create tusuna basar")
    public void kullaniciCreateTusunaBasar() {
        editorPage.createButonElement.click();
    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstnameArama) {
        editorPage.searchBoxElement.sendKeys(firstnameArama);
    }

    @And("isim bolumunde {string} dogrular")
    public void isimBolumundeDogrular(String firstsearch) {
        String text = editorPage.aramasonucuElement.getText();
        Assert.assertTrue(text.contains(firstsearch));
    }
}
