package day12arrayLists;

import java.util.*;

public class work12_01 {
    public static void main(String[] args) {

        //Bir list olusturun eleman ekleyin ve yazdirin

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(5);
        myList.add(10);
        myList.add(20);
        myList.add(40);
        System.out.println(myList);

        //bir list olusturun ve listeki elemanlari alfabetik sıaya göre sıralayın
        ArrayList<String> sehirler = new ArrayList<>();
        sehirler.add("Manisa");
        sehirler.add("İzmir");
        sehirler.add("Denizli");
        sehirler.add("Giresun");
        sehirler.add("Erzurum");

        Collections.sort(sehirler);
        System.out.println(sehirler);

        //Bir dogal sayi listesi olusturun ve olusturdugunuz listesdeki tüm ögeeleri toplayın

        ArrayList<Integer> sayilarim = new ArrayList<>();
        sayilarim.add(1);
        sayilarim.add(8);
        sayilarim.add(9);
        sayilarim.add(15);
        sayilarim.add(21);

        int sum = 0;
        for (Integer w : sayilarim) {
            sum = sum + w;
        }
        System.out.println(sum);


        //Bir dogal sayi listesi olusturun ve cift olanları toplayın..

        ArrayList<Integer> mylistt = new ArrayList<>();
        mylistt.add(2);
        mylistt.add(5);
        mylistt.add(89);
        mylistt.add(2);
        mylistt.add(12);
        mylistt.add(72);
        mylistt.add(20);
        mylistt.add(19);
        mylistt.add(3);
        mylistt.add(7);
        int summ = 0;
        for (Integer w : mylistt) {
            if (w % 2 == 0) {
                summ = summ + w;
            }
        }
        System.out.println(summ);

        //İcinde 200 tane 1000den kücük pozitif tamsayi olan bir list olusturun
        //Kullanicidan bir sayi isteyip
        //listede var oup olmadıgını kullaaniciya yazin

        Random random = new Random();
        //int sayi= random.nextInt(1000); // 0 ila 1000 arasında randm sayi üretmiş oluyor
        int sayi = 0;
        ArrayList<Integer> sayiListesii = new ArrayList<>();
        while (sayiListesii.size() < 200) {
            sayi = random.nextInt(1000);
            if (sayiListesii.contains(sayi)) {
                continue;
            }
            sayiListesii.add(sayi);
        }
        Scanner scan = new Scanner(System.in);
        int tahminhakki = 5;
        int tahminSayisi = 0;
        do {
            System.out.println("lütfen tahminde bulunmak icin  bir tam sayi giriniz");
            sayi = scan.nextInt();
            tahminSayisi++;
            if (sayiListesii.contains(sayi)) {
                System.out.println("tebrikler" + tahminSayisi + "tahminde dogru sonuca vardınız");
                break;
            } else {
                System.out.println("tekrar deneyiniz");
                tahminhakki--;
                System.out.println("kalan tahmin hakkınız :" + tahminhakki);

            }

        } while (tahminhakki > 0);
        if (tahminhakki == 0) {
            System.out.println("malesef bilemediniz.Lütfen tekrar oyunu acınız");
        }

        //Verilen bir listede tekrar eden sayilari sadece 1 yapan bir method olusturun
        //[1,3,5,3,5,6,1,7]
        //[1,3,5,6,7] olacak

        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(1);
        liste.add(3);
        liste.add(5);
        liste.add(3);
        liste.add(5);
        liste.add(6);
        liste.add(7);
        liste.add(1);
        tekrarsizListOlustur(liste);


    }


    private static void tekrarsizListOlustur(ArrayList<Integer> liste) {

        ArrayList<Integer> tekrarsizList = new ArrayList<>();
        for (Integer w : liste) {
            if (tekrarsizList.contains(w)) {
                continue;
            } else {
                tekrarsizList.add(w);
            }
        }
        System.out.println(tekrarsizList);
    }
}







