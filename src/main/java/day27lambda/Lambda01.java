package day27lambda;

import day26lambda.Course;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
        Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
        Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);

        List<Course> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        //1)Average score'u en yuksek olan kursun ismini console yazdiran kodu yaziniz.

        String name1 = coursesList.stream().sorted(Comparator.comparing(Course::getAvarageScore).reversed()).findFirst().get().getCourseName();

        //Comparator.comparing(Course::getAvarageScore) = avaragescore mu karsılastır kıyasla dedik
        //sorted kücükten büyüge aldı biz reversed yaparak ters cevirdik ve findfirst yazarak ilk yazılanı aldık.
        //findfirst Optinal course veriyor  o yüzden .get() yazdık ki onu get'e cevirdik
        //getCourseName ile getirmesini istedigimiz course adıını istedik

        System.out.println(name1);//Turkish Night


        //2) Tum course object'lerini average score'a gore kucukten buyuge diziniz ve ilk ikisi haric liste halinde console'a yazdiriniz.

  List<Course> mylist=  coursesList.stream().sorted(Comparator.comparing(Course::getAvarageScore)).skip(2).collect(Collectors.toList());
  //skip atlatmak demek biz 2 tanesini atla dedik
        //collect(Collectors.toList()) bunu yazdıgımız da List<course> yazıyor o yüzden List<course> sepetine koyduk
        System.out.println(mylist);
//          [Course{season='Summer', courseName='Turkish Day', avarageScore=97, numberOfStudents=128}, Course{season='Winter', courseName='Turkish Night', avarageScore=98, numberOfStudents=154}]


        //3)Tum course object'lerini average score'a gore kucukten buyuge diziniz ve ilk ucunu liste halinde console'a yazdiriniz.

       List<Course> yourlist = coursesList.stream().sorted(Comparator.comparing(Course::getAvarageScore)).limit(3).collect(Collectors.toList()); //limit(3) ilk üçünü koyuyor

        System.out.println(yourlist);
        //[Course{season='Winter', courseName='English Night', avarageScore=93, numberOfStudents=144},
        // Course{season='Spring', courseName='English Day', avarageScore=95, numberOfStudents=132},
        // Course{season='Summer', courseName='Turkish Day', avarageScore=97, numberOfStudents=128}]

        // 4) Kursta bulunan ogrenci sayilarina gore buyukten kucuge sirali bir sekilde listin icinde  veren  kodu yaziniz.
        List<Course> number = coursesList.stream().sorted(Comparator.comparing(Course::getNumberOfStudents).reversed()).collect(Collectors.toList());

        System.out.println(number);

        //5)Kursta bulunan Ingilizce bölümlerinin sayisini veren kodu yazınız

    long ingilizceBolumSayisi = coursesList.stream().filter(t->t.getCourseName().contains("English")).count(); //count long return ediyor
        System.out.println(ingilizceBolumSayisi); //2


        //6)Ogrenci sayisi 140 tan az olan kurslari bir liste halinde veren kodu yaziniz
     List<Course> liste=  coursesList.stream().filter(t->t.getNumberOfStudents()<140).collect(Collectors.toList());
        System.out.println(liste);









    }


}