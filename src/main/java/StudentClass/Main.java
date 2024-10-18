package StudentClass;

public class Main {
    public static void main(String[] args) {

        Student ogrenci = new Student();
        ogrenci.setIsim("ali");
        ogrenci.setNumara(123);

        // Numara kontrolü
        if (ogrenci.getNumara() > 0) {
            System.out.println("Öğrenci: " + ogrenci.getIsim() + ", Numara: " + ogrenci.getNumara()); // Öğrenci bilgilerini gösterir
        } else {
            System.out.println("Geçersiz numara.");

        }
    }
}
