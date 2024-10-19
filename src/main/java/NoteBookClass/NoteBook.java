package NoteBookClass;

    class NoteBook {

        private String[] notlar;
        private int sayac = 0;

        public NoteBook(int boyut) {
            notlar = new String[boyut];

        }

        public void notEkle(String not) {

            if (sayac < notlar.length) {
                notlar[sayac] = not;
                sayac++;

            } else {
                System.out.println("Not defteri doldu");
            }
        }
     public void notlariGoster(){
            for (String not:notlar){
                if(not !=null){
                    System.out.println(not);
                }
            }


        }


    }




