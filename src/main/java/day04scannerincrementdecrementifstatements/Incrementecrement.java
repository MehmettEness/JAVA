package day04scannerincrementdecrementifstatements;

public class Incrementecrement {
    public static void main(String[] args) {

        // Incrementecrement = arttırma ve azaltma isim halleri

        //Increment

        int a = 5;

        System.out.println(a);

        a = a + 2;//7

        System.out.println(a);

        a += 2;//9
        System.out.println(a);

        //Decrement

        int c = 8;
        System.out.println(c);//8

        c = c - 3;//5
        System.out.println(c);//5

        c -= 3;
        System.out.println(c);//2

        //Increment 2
        int d = 6;
        System.out.println(d);//6
        d = d * 2;
        System.out.println(d);//12
        d *= 2;
        System.out.println(d);//24

        //Decrement 2
        int e = 24;
        System.out.println(e);//24

        e = e / 2;
        System.out.println(e);//12

        e /= 2;

        System.out.println(e);//6

        //1 ile arttırıp azaltma için java greliştirme yapmıştır

        //1 ile increment

        int f = 13;
        //f=f+1;
        //f+=1;
        f++;//artık bu güncel aynı işlevi görüyort bunu kullan


        //1 ile decement

        int h = 9;

        //h= h-1;
        //h-=1;

        h--; //artık bu güncel aynı işlevi görüyort bunu kullan

        //post-increment / pre-increment sonra / önce

        int i = 10;
        int k = i++;
        //int k = i++; Java soldan sağa gider. java= sonra önce variable sonra increment görüyor buna post - increment denir. i++ arttırma işlemi deniyor ++

        System.out.println(k);//10
        System.out.println(i);//11 // 10 dan sonra arttırıldı


        int m = 15;
        int n = ++m;
        //int n =++m; Java soldan sağa gider. java =sonra önce increment sonra variable görür buna pre-incement denir

        System.out.println(m);//16 // m satır sonunda arttırıldığı için m degeri 16 olur
        System.out.println(n);//16 // m arttırıldıktn sonra n ye aktarıldıgı icin 16 olur
        //arttırıilmıs 16 yı o yüzden görüyor 15 göremez çünkü 1 arttirdı ona göre ekledi.

        //Ornek

        int p = 17;
        int r = p--;

        System.out.println(p);//16
        System.out.println(r);//17

        int s = 20;
        int t = --s;

        System.out.println(s);//19
        System.out.println(t);//19


    }

}
