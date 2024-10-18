package Car;

import java.util.AbstractQueue;

public class Car {

    String renk ;  //arabanın rengini saklamak için
    String model;
    int hiz;

    void hizlan(int miktar){
        hiz +=miktar; // Hız artışı, parametre olarak gelen miktarı mevcut hıza ekler
        System.out.println("Hız: " + hiz + " km/s"); // Yeni hızı gösterir
    }

    void yavasla(int miktar){
        if (hiz - miktar < 0) {
            hiz=0;

        }else{
            hiz-=miktar;

        }
        System.out.println("Yeni hız: " + hiz + " km/s"); // Yeni hızı gösterir

    }
}
