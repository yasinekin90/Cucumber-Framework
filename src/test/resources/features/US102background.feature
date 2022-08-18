
@amazontum
Feature: US102 background ile amazon search testi


  Background: amazon sayfasina gider
    Given kullanici amazon sayfasina gider.

    @amazonspace
    Scenario: TC01_Amazon iphone search testi
      And iphone icin arama yapar
      Then Sonuclarin iphone icerdigini test eder.

  @amazoncorona
      Scenario: TC02_Amazon tea pot search testi
        And tea pot icin arama yapar.
        Then sonuclarin teapot icerdigini test eder.

     @amazonspace
        Scenario: TC03_Amazon flower search testi
          And flower icin arama yapar
          Then sonuclarin flower icerdigini test eder