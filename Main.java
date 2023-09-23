// Mendefinisikan kelas Mobil
class Mobil {
    // Deklarasi atribut atau variabel kelas Mobil
    String merek;
    boolean menyala = true; // Inisialisasi variabel menyala dengan nilai true
    boolean tidakMenyala = false; // Inisialisasi variabel tidakMenyala dengan nilai false
    
    // Metode startMesin, digunakan untuk memulai mesin mobil
    void startMesin() {
        System.out.println("Mesin mobil " + merek + " telah menyala dalam status " + menyala + ".");
    }
    
    // Metode stopMesin, digunakan untuk menghentikan mesin mobil
    void stopMesin() {
        System.out.println("Mesin mobil " + merek + " telah berhenti dalam status " + tidakMenyala + ".");
    }
}

// Kelas utama Main
public class Main {

     // Metode utama (main method)
    public static void main(String[] args) {
        // Membuat objek mobil1 dari kelas Mobil
        Mobil mobil1 = new Mobil();
        mobil1.merek = "toyota"; // Menetapkan merek mobil1 menjadi "toyota"
        mobil1.startMesin(); // Memanggil metode startMesin untuk mobil1
        
        // Membuat objek mobil2 dari kelas Mobil
        Mobil mobil2 = new Mobil();
        mobil2.merek = "honda"; // Menetapkan merek mobil2 menjadi "honda"
        mobil2.stopMesin(); // Memanggil metode stopMesin untuk mobil2
    }
}
