Feature: US101_amazon_search
  Scenario: TC01_Amazon Search Test
    Given kullanici amazon sayfasina gider.
    And iphone icin arama yapar
    Then Sonuclarin iphone icerdigini test eder.

    Given kullanici amazon sayfasina gider.
    And tea pot icin arama yapar.
    Then sonuclarin teapot icerdigini test eder.

    Given kullanici amazon sayfasina gider.
    And flower icin arama yapar
    Then sonuclarin flower icerdigini test eder
