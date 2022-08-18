Feature: Parametreli stepdefinition olusturma

@parametre
  Scenario: TC04_parametre kullanimi
  Given kullanici amazon sayfasina gider.
    And "macbook" icin arama yapar
    Then Sonuclarin "macbook" icerdigini test eder.
    And sayfayi kapatir

