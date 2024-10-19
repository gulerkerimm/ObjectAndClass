package NoteBookClass;

public class Main {
    public static void main(String[] args) {
        NoteBook notDefteri = new NoteBook(3);
        notDefteri.notEkle("Java dersi");
        notDefteri.notEkle("OOP kavramları");

        notDefteri.notlariGoster();//tüm notları gösteriir

        // Ek net ekleyelim
        notDefteri.notEkle("Yeni not");//doluysa "not defteri

    }
}
