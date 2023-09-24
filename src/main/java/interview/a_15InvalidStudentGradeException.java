package interview;

public class a_15InvalidStudentGradeException extends Exception{ //yani gecersiz ögrenci notu hatası demekk

//sag tıkla generate sec constroction sec exception main sec

    public a_15InvalidStudentGradeException(String message) {
        super(message);
    }




    /*
    1)Custom Exception class olusturmak icin Exception class extends etmeliyiz.
        Exception classs a extend ederek olusturdugumuz Custom Exception "Compile Time Exception" olur
        Eger RunTime Custom Exception olusturmak isterseniz RunTimeException Class Extend etmelisiniz.

    2) Custom Exception Class olusturuken mesaj verebilen obje üretmek isterseniz constructori buna göre secebilirsiniz
      ve bu constructor parenttaki constructori cagırmalıdır. Dolayısıyla bu cons mesaj verecek veya vermeyecek sekilde olusturulabilir.

    3) Custom Exception Class olustulurken ismin sonunda Exception kelimesini kullanmalıyız "InvalidStudentGradeException"

     */




}




