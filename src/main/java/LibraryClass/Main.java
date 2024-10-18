package LibraryClass;

public class Main {
    public static void main(String[] args) {


        Book book = new Book();
        book.isim = "sezar";
        book.yazar = "kerim";
        book.mevcut = true;

        book.bilgilerigoster();

        if (book.mevcut) {
            System.out.println("Kitap ödünç alınabilir."); // Kitap mevcutsa bu mesajı gösterir
        } else {
            System.out.println("Kitap mevcut değil.");
        }
    }
}
