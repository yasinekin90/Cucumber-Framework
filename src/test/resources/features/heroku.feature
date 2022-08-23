
  Feature: Heroku sayfasinda add element butonu testi
    Scenario: Kullanici add element butonunu test eder
      Given kullanici "heroku" sayfasina gider.
      Then Add element butonuna basar
      And Delete butonu gorunur oluncaya kadar bekler
      Then Delete butonunun gorunur oldugunu test eder
      Then Delete butonuna basarak butonu siler
      Then Delete butonunun gorunmedigini test eder
