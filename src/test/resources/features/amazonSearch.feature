Feature: amazon.com.tr sitesi sepete ürün ekleme otomasyonu
  Scenario: İstenilen ürünlerin sepete eklenememesi durumunda hatanın gerçekleştiği sayfanın ekran görüntüsü alınıp
            mail üzerinden yollanır ve otomasyon sonucu test raporu alınır
    Given Kullanıcı amazon.com.tr adresine gider
    When Çerez pop-up'ı varsa kapatılır
    And Arama çubuğuna istenilen ürün adı "Harry Potter" girilir ve arama yapılır
    And Aranan ürün filtrelenir ve ürün sepete eklenir
    And Alt kategorilerde ürün filtrelemesi varsa yapılır ve istenilen ürünler sırasıyla sepete eklenir
    And Sepet sayfasına gidilir
    Then Sepetteki tüm ürünler kaldırılır