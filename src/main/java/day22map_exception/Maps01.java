package day22map_exception;

import java.util.HashMap;

public class Maps01 {
    public static void main(String[] args) {

        //HashMap arkasında calısan mekanizma (interview)
        // bucket (kova) sayisi 16
        //Java Hashcod olarak mesela USA ya 34 veriyor
        //Bu 34 ü 16 ya bölüyor ve kalan 2 oldugu icin 2.bucketa koyar.
        //Elimiizde 2.bucket ta "34 USA Washington" var.
        //capitals.get("USA"); dedigimizde USA nın 34 oldugunu ve 2.bucketta oldugunu biliyor ve bize washingtonu veriyor..
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA" ,"Washington");
        capitals.get("USA");



















    }
}
