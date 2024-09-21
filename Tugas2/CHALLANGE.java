import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CHALLANGE{
    private static final Map<String, String> mahasiswaMap = new HashMap<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Create Mahasiswa");
            System.out.println("2. Read Mahasiswa");
            System.out.println("3. Update Mahasiswa");
            System.out.println("4. Delete Mahasiswa");
            System.out.println("5. Exit");
            System.out.print("Pilih opsi (1-5): ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            switch (choice) {
                case 1 -> createMahasiswa();
                case 2 -> readMahasiswa();
                case 3 -> updateMahasiswa();
                case 4 -> deleteMahasiswa();
                case 5 -> {
                    System.out.println("Keluar dari program...");
                    return;
                }
                default -> System.out.println("Opsi tidak valid, silakan pilih antara 1-5.");
            }
        }
    }
    

    private static void createMahasiswa() {
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = scanner.nextLine();
        
        if (mahasiswaMap.containsKey(nim)) {
            System.out.println("NIM sudah terdaftar.");
        } else {
            mahasiswaMap.put(nim, nama);
            System.out.println("Mahasiswa berhasil ditambahkan.");
        }
    }

    private static void readMahasiswa() {
        if (mahasiswaMap.isEmpty()) {
            System.out.println("Belum ada data mahasiswa.");
        } else {
            System.out.println("Daftar Mahasiswa:");
            for (Map.Entry<String, String> entry : mahasiswaMap.entrySet()) {
                System.out.println("NIM: " + entry.getKey() + ", Nama: " + entry.getValue());
            }
        }
    }

    private static void updateMahasiswa() {
        System.out.print("Masukkan NIM mahasiswa yang ingin diupdate: ");
        String nim = scanner.nextLine();
        
        if (mahasiswaMap.containsKey(nim)) {
            System.out.print("Masukkan nama baru mahasiswa: ");
            String namaBaru = scanner.nextLine();
            mahasiswaMap.put(nim, namaBaru);
            System.out.println("Mahasiswa berhasil diperbarui.");
        } else {
            System.out.println("NIM tidak ditemukan.");
        }
    }

    private static void deleteMahasiswa() {
        System.out.print("Masukkan NIM mahasiswa yang ingin dihapus: ");
        String nim = scanner.nextLine();
        
        if (mahasiswaMap.containsKey(nim)) {
            mahasiswaMap.remove(nim);
            System.out.println("Mahasiswa berhasil dihapus.");
        } else {
            System.out.println("NIM tidak ditemukan😥.");
        }
    }
    
}
