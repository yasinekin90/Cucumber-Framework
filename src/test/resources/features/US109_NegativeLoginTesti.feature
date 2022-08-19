

Feature: US109 Negative Login Testi
  @basarisizGiris
  Scenario: TC012_yanlis username,dogru password ile giriş yap

    Given kullanici "HMCUrl" sayfasina gider.
    When login linkine tiklar
    Then kullanici adi olarak "HMCWrongUsername" girer
    And password olarak "HMCValidPassword" girer
    And login butonuna basar
    And giris yapilamadigini test eder
    And sayfayi kapatir

    Scenario:TC013 dogru user name yanlis password

      Given kullanici "HMCUrl" sayfasina gider.
      When login linkine tiklar
      Then kullanici adi olarak "HMCValidUsername" girer
      And password olarak "HMCWrongPassword" girer
      And login butonuna basar
      And giris yapilamadigini test eder
      And sayfayi kapatir

      Scenario: TC014 yanlis username yanlis password
        Given kullanici "HMCUrl" sayfasina gider.
        When login linkine tiklar
        Then kullanici adi olarak "HMCWrongUsername" girer
        And password olarak "HMCWrongPassword" girer
        And login butonuna basar
        And giris yapilamadigini test eder
        And sayfayi kapatir