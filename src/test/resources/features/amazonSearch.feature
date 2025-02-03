Feature: amazon.com.tr sepete ürün ekleme otomasyonu
Scenario: Ürünleri sepete eklemek ve adedini artırmak
 Given Kullanıcı amazon.com.tr adresine gider
  When Çerez pop-up'ı varsa kapatılır
  And Arama çubuğuna istenilen ürün adı "Harry Potter" girilir ve arama yapılır
  And Aranan ürün filtrelenir ve ürün sepete eklenir
  And Alt kategorilerde ürün filtrelemesi varsa yapılır ve istenilen ürünler sırasıyla sepete eklenir
  And Sepet sayfasına gidilir
  Then Sepetteki tüm ürünler kaldırılır