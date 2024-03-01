
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class deneme {




    public static  void main(String[]args){
        ChromeOptions options = new ChromeOptions();
        ChromeDriver driver2 =new ChromeDriver();
        driver2 = new ChromeDriver(options);
     WebDriverManager.chromedriver().setup();
     ChromeDriver driver =new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

     //setur sayfasına git
     driver.get("https://www.setur.com.tr/");
     //arama çubuğuna antalya yaz
    //driver.get("https://www.setur.com.tr/antalya");
     WebElement secenek=driver.findElement(By.id("header_reserve"));
     System.out.println(secenek.getText());

     WebElement aramakutusu = driver.findElement(By.id("[data-testid='select-location-box-input']"));
     WebElement aramakutusu1 = driver.findElement(By.id("sc-acaf4d52-9"));
     aramakutusu1.sendKeys("Antalya");

     WebElement button=driver.findElement(By.id("sc-8de9de7b-0 ddzeSs sc-acaf4d52-31 iwrDdA"));
     button.click();
     List<WebElement> buttonlistesi=driver.findElements(By.tagName("button"));
     System.out.println(buttonlistesi);
     //ENTER
     aramakutusu.submit();
     //4-
     WebElement sonucyaziElemanti=driver.findElement(By.xpath("//div [@class=sc-6d9f9117-0 jJoIoE]"));
     System.out.println(sonucyaziElemanti.getText());

////
//<div class="sc-6d9f9117-0 jJoIoE"><div class="sc-c3618e76-13 eWzwLL"><span class="sc-c3618e76-18 cZvJFW"><span color="BR300" class="sc-363be8ce-0 jjppJr">Antalya</span><span class="sc-c3618e76-22 eKGpOh"><span color="BR300" class="sc-363be8ce-0 dzlggL">(621)</span></span></span><div class="sc-c3618e76-16 heanGA"><span font-size="16" data-role="custom-icon" class="sc-fd984615-0 epYOmQ"><span class="sc-eb82d810-0 eClCrJ"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 28 28" width="1em" height="1em"><path d="M17.318 4.888v1.877c0 1.064.875 1.93 1.95 1.93a1.943 1.943 0 0 0 1.951-1.93V4.893c1.818.046 3.281 1.381 3.281 3.02v13.248c0 1.84-1.515 3.339-3.376 3.339H8.043c-1.862 0-3.376-1.498-3.376-3.339V7.913c0-1.62 1.43-2.943 3.217-3.017v1.869c0 1.064.875 1.93 1.951 1.93s1.951-.866 1.951-1.93V4.888h5.532zm4.648 6.2H7.201v9.021c0 1.04.855 1.886 1.906 1.886H20.06a1.898 1.898 0 0 0 1.907-1.886v-9.022zM9.836 3.5c.468 0 .849.376.849.84v2.425c0 .464-.38.84-.85.84a.844.844 0 0 1-.849-.84V4.34c0-.464.38-.84.85-.84zm9.433 0c.469 0 .848.376.85.84v2.425c0 .464-.381.84-.85.84a.845.845 0 0 1-.85-.84V4.34c0-.464.38-.84.85-.84z" fill-rule="evenodd"></path></svg></span></span><span class="sc-c3618e76-17 dWgskZ"><span color="darkGrey" class="sc-363be8ce-0 kHsynn">Giriş - Çıkış Tarihleri</span></span></div><div class="sc-c3618e76-15 gHqJuZ"><div class="sc-c3618e76-16 heanGA"><span font-size="16" data-role="custom-icon" class="sc-fd984615-0 epYOmQ"><span class="sc-eb82d810-0 eClCrJ"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 28 28" width="1em" height="1em"><path d="M14 2.333a6.654 6.654 0 0 1 6.647 6.647 6.633 6.633 0 0 1-2.142 4.884c1.24.55 2.374 1.328 3.352 2.306a11.041 11.041 0 0 1 3.254 7.856v.285a1.356 1.356 0 1 1-2.712 0v-.285c0-4.63-3.768-8.399-8.399-8.399-4.631 0-8.4 3.768-8.4 8.4v.284a1.355 1.355 0 1 1-2.711 0v-.285c0-2.966 1.156-5.758 3.254-7.856a11.105 11.105 0 0 1 3.352-2.306l-.207-.2A6.632 6.632 0 0 1 7.353 8.98 6.654 6.654 0 0 1 14 2.333zm0 2.712a3.94 3.94 0 0 0-3.935 3.935A3.94 3.94 0 0 0 14 12.915c2.17 0 3.935-1.765 3.935-3.935S16.17 5.045 14 5.045z" fill="none" fill-rule="evenodd"></path></svg></span></span><span class="sc-c3618e76-22 eKGpOh"><span color="darkGrey" class="sc-363be8ce-0 dYqjtL"> 1 Oda, 2 Yetişkin </span></span></div><div role="button" tabindex="0" class="sc-c3618e76-19 iKAcrT"><span class="sc-c3618e76-20 bvmoNp"><span color="D300" class="sc-363be8ce-0 fAWFAY">Yeniden Ara</span></span><span class="sc-c3618e76-21 dHRHyU"><span font-size="24" data-role="custom-icon" class="sc-fd984615-0 gDZgkw"><span class="sc-eb82d810-0 eClCrJ"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 32 32" width="1em" height="1em"><path d="M2.405 19.599 6.62 15.38a8.398 8.398 0 0 1-1.588-4.922 8.4 8.4 0 0 1 2.479-5.98A8.402 8.402 0 0 1 13.492 2c2.26 0 4.385.88 5.982 2.479a8.402 8.402 0 0 1 2.478 5.98c0 2.26-.88 4.384-2.478 5.982a8.405 8.405 0 0 1-5.981 2.479 8.381 8.381 0 0 1-4.921-1.588l-4.217 4.217a1.375 1.375 0 0 1-1.95 0 1.379 1.379 0 0 1 0-1.95zm15.118-5.109a5.665 5.665 0 0 0 1.67-4.031 5.662 5.662 0 0 0-1.67-4.03 5.66 5.66 0 0 0-4.03-1.671 5.662 5.662 0 0 0-4.031 1.67 5.664 5.664 0 0 0-1.67 4.031c0 1.522.592 2.954 1.67 4.032a5.66 5.66 0 0 0 4.03 1.669 5.659 5.659 0 0 0 4.031-1.67z" fill="#636363"></path></svg></span></span></span></div></div></div></div>
     // 4. Adım: "Nereye Gideceksiniz?" alanına csv dosyasından "Antalya" yazılır ve en üsteki Antalya seçeneğine tıklanılır.
     WebElement nereyeInput = driver.findElement(By.id("select-location-box-input"));

     nereyeInput.sendKeys("Antalya");
     nereyeInput.submit();
     nereyeInput.clear();


     WebElement antalyaOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@data-original-index='0']")));
     antalyaOption.click();

     // 5. Adım: Tarih alanında Nisan’ın ilk haftası için bir haftalık aralık seçilir.
     WebElement tarihInput = driver.findElement(By.id("CalendarMonthGrid CalendarMonthGrid_1 CalendarMonthGrid__vertical_scrollable CalendarMonthGrid__vertical_scrollable_2"));
     tarihInput.click();
     WebElement nisanIlkHafta = driver.findElement(By.xpath("//td[@data-date='2022-04-01']"));
     nisanIlkHafta.click();

     // 6. Adım: Yetişkin sayısı 1 artırılır ve kontrol edilir.
     WebElement yetiskinArtir = driver.findElement(By.id("AdultIncrement"));
     yetiskinArtir.click();
     int yetiskinSayisi = Integer.parseInt(driver.findElement(By.id("txtAdults")).getAttribute("value"));
     if (yetiskinSayisi != 2) {
         System.out.println("Yetişkin sayısı kontrolü başarısız.");
         driver.quit();
         return;
     }

     // 7. Adım: "Ara" butonu'nun görünürlüğü kontrol edilir ve tıklanılır.
     WebElement araButton = driver.findElement(By.id("btnSearch"));
     if (!araButton.isDisplayed()) {
         System.out.println("Ara butonu görünürlük kontrolü başarısız.");
         driver.quit();
         return;
     }
     araButton.click();

     // 8. Adım: Açılan url içinde "antalya" kelimesini içerdiği kontrol edilir.
     if (!driver.getCurrentUrl().toLowerCase().contains("antalya")) {
         System.out.println("URL kontrolü başarısız.");
         driver.quit();
         return;
     }

     // 9. Adım: "Diğer Bölgeleri Göster" alanında rastgele tıklama metotu kullanılarak bir seçim yapılır ve "()" içerisinde bulunan sayı kaydedilir.
     WebElement digerBolgeleriGoster = driver.findElement(By.id("lnkShowOtherRegions"));
     digerBolgeleriGoster.click();

     List<WebElement> regionCountElements = driver.findElements(By.xpath("//span[@class='region-count']"));
     if (regionCountElements.size() > 1) {
         String secimSayisi = regionCountElements.get(1).getText();
         System.out.println("Seçilen bölge sayısı: " + secimSayisi);
     } else {
         System.out.println("Bölge sayısı bulunamadı.");
     }

     // 10. Adım: Sayfanın altında bulunan "Antalya Otelleri ve En Uygun Antalya Otel Fiyatları" alanına kadar ekranda kaydırma yapılır, kaydedilen değerin 8. adımda kaydedilen değerle eşit olduğu kontrol edilir.
     driver.executeScript("window.scrollTo(0, document.body.scrollHeight);");



     // Tarayıcıyı kapat
     driver.quit();
     }


 }





