package interview;

public class a_16citiesRunner {
    public static void main(String[] args) {

        a_16Cities sehir = a_16Cities.ADANA;
        System.out.println(sehir);


        //Adana ismine ulaşalım

        String sehirAdi = a_16Cities.ADANA.getSehirAdi();
        System.out.println(sehirAdi);

        //ankara plakakodunu alalım

        int plakaKodu = a_16Cities.ANKARA.getPlakaKodu();
        System.out.println(plakaKodu);

        //izmir postakoduna ulasalım

        String postaKoduu=a_16Cities.İZMİR.getPostaKodu();
        System.out.println(postaKoduu);














    }
}

