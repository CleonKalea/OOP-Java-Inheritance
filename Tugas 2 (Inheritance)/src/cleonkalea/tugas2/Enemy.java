package cleonkalea.tugas2;

public class Enemy{
    void base(){
        System.out.println("Base Stats");
    }

    void nama(int pilih){
        if(pilih == 1){
            System.out.println("Name : Ravager");

        }else if(pilih == 2){
            System.out.println("Name : Dreamrunner");

        }else if(pilih == 3){
            System.out.println("Name : Tyrant");

        }else if(pilih == 4){
            System.out.println("Name : Hell Knight");

        }else if(pilih == 5){
            System.out.println("Name : Witch");
        }
    }

    void stats(int pilih){
        if(pilih == 1){
            System.out.println("HP : 2000");
            System.out.println("Damage : 10");

        }else if(pilih == 2){
            System.out.println("HP : 1000");
            System.out.println("Damage : 20");

        }else if(pilih == 3){
            System.out.println("HP : 2500");
            System.out.println("Damage : 15");

        }else if(pilih == 4){
            System.out.println("HP : 1500");
            System.out.println("Damage : 50");;

        }else if(pilih == 5) {
            System.out.println("HP : 600");
            System.out.println("Damage : 30");
        }
    }

}
