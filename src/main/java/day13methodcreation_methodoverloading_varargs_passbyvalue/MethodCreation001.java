package day13methodcreation_methodoverloading_varargs_passbyvalue;

public class MethodCreation001 {
    public static void main(String[] args) {
           /*
        Java da method nasil olusturulur?

        1)main methodun disinda classin icinde olusuturulur
        2)Access Modifier + return type + Method ismi + () + {  }

        3)Olusturulan method nasil kullanilir?
            a)Method olusturmak methodu calistirmak icin yeterli degildir

         */
        //Method call : "main method icinde bir method kullanilmasina method call denir"
       int sonuc = toplamaYap (3,5);
        System.out.println(sonuc);
    }
    //ornek 1 :toplama islemi yapan bir method olusturunuz
    public static int toplamaYap (int a , int b) {
        return a+b;

    }


    }

