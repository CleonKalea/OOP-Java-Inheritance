package cleonkalea.tugas2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int healthpoint1 = 500;
        int damagepoint1 = 50;

        int pilihan;
        int pilih;

        Scanner karakter = new Scanner(System.in);

        Karakter character = new Karakter();
        Enemy enemy = new Enemy();
        Npc npc = new Npc();
        Weakness weakness = new Weakness();

        System.out.println("1. Player");
        System.out.println("2. Enemy");
        System.out.print(": ");

        pilihan = karakter.nextInt();

        if (pilihan == 1){
            System.out.println("--- Pilih Karakter Player ---");
            System.out.println("1. Dante");
            System.out.println("2. Vergil");
            System.out.print(": ");
            pilih = karakter.nextInt();

            character.header();
            character.hp(healthpoint1);
            character.dp(damagepoint1);

            npc.kalimat();

        }else if(pilihan == 2){
            System.out.println("Pilih Jenis Enemy : ");
            System.out.println("1. Ravager");
            System.out.println("2. Dreamrunner");
            System.out.println("3. Tyrant");
            System.out.println("4. Hell Knight");
            System.out.println("5. Witch");
            System.out.println(": ");
            pilih = karakter.nextInt();

            enemy.base();
            enemy.nama(pilih);
            enemy.stats(pilih);

            if(pilih == 1){
                weakness.ravager();
            }else if(pilih == 2){
                weakness.dreamrunner();
            }else if(pilih == 3){
                weakness.tyrant();
            }else if(pilih == 4){
                weakness.hell_knight();
            }else if(pilih == 5){
                weakness.witch();
            }
        }
    }
}
