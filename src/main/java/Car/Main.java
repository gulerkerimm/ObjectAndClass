package Car;

public class Main {
    public static void main(String[] args) {


        //Soru: Araba sınıfı oluşturarak bir nesne oluşturun.
        // Bu nesne ile hızını artırıp azaltma işlemlerini gerçekleştirin.
        Car araba1=new Car();
        araba1.renk="kırmızı";
        araba1.model="bmw";
        araba1.hiz=0;

        araba1.hizlan(50);
        araba1.yavasla(30);

    }
}
