import java.util.Scanner;

public class BioskopWithScanner2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama;
        String[][] penonton = new String[4][2];

        while (true) {
            // Menampilkan menu
            System.out.println("\nMenu: ");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3) : ");

            // Membaca pilihan menu
            int pilihan = sc.nextInt();
            sc.nextLine();  // Membersihkan newline yang tertinggal

            switch (pilihan) {
                case 1:
                    // Input data penonton
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris (1-4): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine();  // Membersihkan newline

                    // Validasi input baris dan kolom
                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Baris atau kolom tidak valid! Isi baris 1-4 dan kolom 1-2.");
                    }else if(penonton[baris -1][kolom-1] != null){
                        System.out.println("kursi baris " + baris + ", kolom " + kolom + " sudah terisi oleh " +penonton[baris -1][kolom -1]);
                        System.out.println("Silahkan pilih kursi lain.");
                    }else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Penonton berhasil ditambahkan.");
                    }
                    break;

                case 2:
                    // Tampilkan daftar penonton
                    System.out.println("\nDaftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] != null) {
                                System.out.printf("Baris %d, Kolom %d: %s\n", i + 1, j + 1, penonton[i][j]);
                            } else {
                                System.out.printf("Baris %d, Kolom %d: ***\n ", i + 1, j + 1);
                            }
                        }
                    }
                    break;

                case 3:
                    // Exit program
                    System.out.println("Terima kasih!");
                    return;

                default:
                    System.out.println("Pilihan tidak valid! Pilih menu 1, 2, atau 3.");
            }
        }
    }
}
