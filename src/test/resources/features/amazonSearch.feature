Feature: amazon.com.tr sepete ürün ekleme otomasyonu
Scenario: ürünleri sepete eklemek ve adedini artırmak
 Given Kullanıcı amazon.com.tr adresine gider
  When Çerez pop-up'ı varsa kapatılır
  And Arama çubuğuna istenilen ürün adı "Harry Potter" girilir,arama yapılır
