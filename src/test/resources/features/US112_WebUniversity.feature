
@WebUniversity
Feature: US112 WebUniversity Window Handle
  Scenario Outline: TC017 Reusable Mthots ile Window Handle
  Given kullanici "WebUniversityUrl" sayfasina gider.
  And login portala kadar asagi iner
  And login portala tiklar
  Then diger windowa gecin
  Then "<username>" ve "<password>" kutularina deger yazar
  And WebUniversity Login butonuna basar
  And Popupta cikan yazinin "validation failed" oldugunu test edin
  Then ok diyerek popupi kapatin
  And Ilk sayfaya geri donun
  And Ilk sayfaya donuldugunu test edin
    Then biraz 3 saniye bekle
  And sayfayi kapatir
    Examples:
      | username | password |
      | Bilal | SAFAK |

#"http://webdriveruniversity.com/" adresine gidin
  #"Login Portal" a kadar asagi inin
  #"Login Portal" a tiklayin
  #Diger window'a gecin
  #"username" ve "password" kutularina deger yazdirin
  # WebUniversity Login butonuna basar
  #Popup'ta cikan yazinin "validation failed" oldugunu test edin
  #Ok diyerek Popup'i kapatin
  #Ilk sayfaya geri donun
  #Ilk sayfaya donuldugunu test edin
