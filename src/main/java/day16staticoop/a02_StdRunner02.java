package day16staticoop;

public class a02_StdRunner02 {
    public static void main(String[] args) {
        System.out.println(a01_Student01.stdName);//Ali Can
        // Student.stdName gözüküyor
        //stdName static oldugunda ona ulasmak icin obje olusturmadım
        //static class memberlara ulasmak icin sadece class ismi yeterlidir
//3
        a01_Student01 age= new a01_Student01();
        System.out.println(age.age);
        //18
        //ali.age  çıkıyor yani age  non statictir onu görebilmek icin obje olusturmak zorundayız.

        //age görebilemmei,z icin alinin dünyaya gelmesi lazım
        //biz birde veli olarak atarsak yeni bir obje olusturucak ve age ortaya çıkacak
        //ama stdName hep sabit. stdName ay olarak düşünebilirz.
        //ali non statictir. alinin kafasında degişiklik yapsak veli can bu durumdan etkilenmez
        //stdName statictir.Bunu üzerinde degisişiklik yaparsak herkes etkilenir

  //6
        a01_Student01.staticMethod();
        a01_Student01.nonStaticMethod();


    }
}
