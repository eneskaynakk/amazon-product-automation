Feature: amazon.com.tr sepete ürün ekleme otomasyonu
Scenario: ürünleri sepete eklemek ve adedini artırmak
 Given kullanıcı Amazon.com.tr adresine gider
  When çerez ya da bildirim pop-up'ları varsa kapatılır
  And arama çubuğuna istenilen ürün adı girilir,arama yapılır
  And herhangi bir ürün sepete eklenir
  And kullanıcı arama çubuğunun altındaki kategorilere gider
  And kategori seçildikten sonra filtreleme varsa filtreleme yapılır
  And filtreleme yoksa herhangi bir ürüne tıklanır
  And tıklanan her ürün sepete eklenir
  And tüm ürünler sepete eklendikten sonra sepete gidilir
  And her ürünün adedi 2 katına çıkarılır
  Then kullanıcı sepetteki ürünleri siler