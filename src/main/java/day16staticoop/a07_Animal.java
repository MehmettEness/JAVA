package day16staticoop;

public class a07_Animal {

    //oop konseptine giriş yapıyoruz bunda 4 konsept var
    /*
    1)Inheritance
    2)Polymorphism
    3)Encapsulation
    4)Abstraction
     */

    //1) Inheritance
    /*
    Ozellikleri bir clastan diger classlara alan bir kavramdır
    Orn: Siz bir class olusturacaksınız ama daha once olusturulmus bir class sizin istediginiz ozelliklerin bir cogunu kapsiyor
    O zaman yeni olusturdugunuz classi ozellerini kullanmak istediginiz class a child yapariz.
     1) Inhentiance sayesinde
        a) Code tekrarlarindan kurutuluruz
        b) Code tamiri(maintenance) kolay olur
        c) Child Class'lari daha atomic yapmis oluruz

   2) Bir class'i baska bir classin child class i yapmak icin
   extends keywordunu kullaniriz.
   3) Child class objectleri Parent class tan method ve variable lari kullanabilirler
   4) Parent class objectleri child class dan method ve variable lari kullanamazlar
   5)Javada bir classın sadece bir tane parenti olabilir, coklu parent aMultple Inheritance derler
     tekli parent a Single Inheritance derler, Java Multiple Inhertince i desteklemez, single Inhertince kullanır
   6) Apartman seklindeki Inhertince yapisina "Multilevel Inhertince" denir. ve javada "Multilevel Inhertince" destekler
   7) Object class her classın parentidir. Java da object clas haric her classın parenti vardır
   8) Javada parent tan child a olan iliskilere HAS - A relationship denir.
      Javada chlid tan parent a olan iliskilere IS - A relationship denir.
   9) Java da her classin bir tane default constructor vardır ama default constructor class icinde gorunmez
      cunku default constructor "Object Class" icindedir.
     */






    public void eat(){

        System.out.println("animals eat");

    }
    public void drink(){
        System.out.println("animals drink");
    }

}

//Java bunların hangisi parent hangisi child bilmez o yüzden
//extends kulalnırız
