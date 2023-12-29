package super_this_sayilar.day14constructordatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {

        //Anlık zamanı nasıl alırız

       LocalTime myCurrentTime =  LocalTime.now();
        System.out.println(myCurrentTime); //13:21:48.064473600 nano saniyeye kada,r verir ==> saat:dakika:saniye.nanosaniye

       //ben nano saniye kısmını görmek istemiyorum
        /*
    DateTime Class ta kullanilan tarih saat formatlari
    HH : mm ==> 24'lu saat sistemi
    hh : mm ==> 12'li saat sistemi AM, PM gösterilmez
    hh : mm a ==> 12'li saat sistemi AM, PM
    HH : mm : ss==> saniyeyi gosterir
    HH : MM ==> yanlis format cunku MM aylar icin kullanilir
    "mm" "minute" demektir. "MM" "month" demektir.

    dd-MM-yyyy ==> gun - ay - yil
    MMM ==> Aug
    MMMM ==> August  */

        //time objesini formatladik
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH : mm");
        String formattedTime = dtf1.format(myCurrentTime);
        System.out.println("formattedTime = " + formattedTime);

        //Date objesini formatlayalim

        LocalDate date1 = LocalDate.of(2022, 8, 28);
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formattedDate = dtf2.format(date1);
        System.out.println("formattedDate = " + formattedDate);//formattedDate = Ağustos/28/2022

        //28/Ağustos/2023
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd / MMMM / yyyy");
        System.out.println(dtf3.format(date1));

        //Baska bir zaman dilimindeki tarih ve zamanı nasıl alırız?

        LocalDate dateIntokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));//zoneıd zone sectik
        System.out.println(dateIntokyo); //2023-08-29 tokyodaki tarih

        LocalDate dateInAmsterdam = LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam);//2023-08-29 amsterdam tarih

        LocalTime timeIntokyo =  LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeIntokyo); //17:08:28.971050700 tokyoda saat

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt); // 2023-08-29T11:11:08.822748200
        //bu tarih ve zamanı istedigimiz gibi yapalım==> 29 * Aug * 2023 - 11 : 15
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd * MMM * yyyy - hh : mm ");
        String formatedldt =  dtf4.format(ldt);
        System.out.println(formatedldt); //29 * Ağu * 2023 - 11 : 19

    }
}
