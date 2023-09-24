package day23exceptions;

public class ExceptionRunner {
    public static void main(String[] args) {

        /*
    Exception lar disinda Error diye adlandirdigimiz ve handle edilemeyen bazi problemler vardir
     mesela application larda Memory nin dolmasi bir errordur
        iki tur memory error vardir:
        a) Stack memory dolarsa "StackOverFlow Error" alirsiniz
        b) Heap memory dolarsa "OutOfMemory Error" alirsiniz

        finalize:
        Garbage collector memory i temiz tutmak icin surekli memoryi tarar ve silinmesi gerekenleri siler
        Garbage collector silmeden once sileceği datalari "finalize" yapar sonra siler
        yani Garbage collector sadece finalized yapilmis objeleri toplar ve yok eder

        final - finally - finalize()
        final = keyworddur, variable, classlarla kullanılabiliriz.
        finally=codblocktur, try veya try catch ile kullanabiliriz.

     */

        getStudentGrade(77);//77
        getStudentGrade(-77);//"Notlar 0 dan az olamaz , 100 den büyük olamaz.."
        getStudentGrade(777);//"Notlar 0 dan az olamaz , 100 den büyük olamaz.."



        getTheNumberOfStudents(15);
        getTheNumberOfStudents(-15);//

    }
    //Run Time Exception icin olusturduk
    public static void getTheNumberOfStudents(int numOfStudents){
        if (numOfStudents<0){
            throw new InvalidNumberException("Ögrenci sayisi ngatif olamaz"); // InvalidNumberException bizim olusturdugumuz yerden cekityorrr
        }else{
            System.out.println(numOfStudents);
        }


    }

    //throw new InvalidStudentGradeException("Notlar 0 dan az olamaz , 100 den büyük olamaz.."); bu kısım kırmızı yanar
    //Sorunun gecmesi icin biz try catch seceriz..

    public static void getStudentGrade(int grade){
        if (grade<0 || grade>100){
            try {
                throw new InvalidStudentGradeException("Notlar 0 dan az olamaz , 100 den büyük olamaz..");
            } catch (InvalidStudentGradeException e) {
                e.printStackTrace(); // tüm hatalari görelim diye sectik..
            }
        }else{
            System.out.println(grade);
        }


    }


}
