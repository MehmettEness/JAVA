package day18oop;

public class Cat extends Animal {
    public void meow(){
        System.out.println("Cats meow..");
    }

    @Override//override annotation(mutasyon) : override kurallarini java tarafindan kontrol edilmesini sagliyor
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public void drink() {
        System.out.println("Cats drink");
    }


    @Override
    public Animal create() { // burada cat objesi olusturduk ve animal return ediyor ama java kızmıyor
        return new Cat();     //cunku cat animal arasında IS A var
    }

    @Override
    public int add(int a, int b) { // primitive oldukları icin int kısmını degistiremezsin
        return a+b;
    }

    @Override
    public Integer carpma(Integer a, Integer b) { //ctrl Byte üzerine geldiğimizde bu ifade cıkıyorByte extends Number
        return a*b;                            //Integer da Numberin kardesi Byte da. O yüzden Integer etmek zorundayız
                                                // O yüzden Byte silip yerine Integer yazdık
    }

   // public final double daireyarıCapı(double r){
    //    return 3.14*r*r;
    //bunu sag tık yapıp override yapamıyoruz





}























