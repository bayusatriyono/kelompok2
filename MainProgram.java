import java.util.*;

public class MainProgram {
    public static void main(String[] args) {

        ArrayList<String> idKendaraan = new ArrayList<>();
        ArrayList<String> merkKendaraan = new ArrayList<>();
        ArrayList<String> tipeKendaraan = new ArrayList<>();
        ArrayList<String> tahunPembuatan = new ArrayList<>();
        ArrayList<String> pengguna = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        String pilihan;
        boolean ulang = true;

        while (ulang) {
            clearScreen();
            System.out.println("===========================");
            System.out.println("Selamat Datang Di Aplikasi");
            System.out.println("Database Kendaraan Dinas");
            System.out.println("PT. Toyota Astra Motor");
            System.out.println("===========================");
            System.out.println("1. Tambah Data Kendaraan");
            System.out.println("2. Tampilkan Data Kendaraan");
            System.out.println("3. Cari Data Kendaraan");
            System.out.println("4. Cari Data Pengguna");
            System.out.println("5. Ubah Data Kendaraan");
            System.out.println("6. Hapus Data Kendaraan");
            System.out.println();
    
            System.out.print("Pilih menu: "); 
            pilihan = input.next();
            System.out.println();

            switch (pilihan) {
                case "1":
                    System.out.print("Masukkan ID kendaraan : ");
                    String idKendaraanBaru = input.next();
                    idKendaraan.add(idKendaraanBaru);

                    System.out.print("Masukkan Nama Pengguna : ");
                    String penggunaBaru = input.next();
                    pengguna.add(penggunaBaru);
                    
                    System.out.print("Masukkan Merk Kendaraan : ");
                    String merkKendaraanBaru = input.next();
                    merkKendaraan.add(merkKendaraanBaru);

                    System.out.print("Masukkan Tipe Kendaraan : ");
                    String tipeKendaraanBaru = input.next();
                    tipeKendaraan.add(tipeKendaraanBaru);

                    System.out.print("Tahun Pembuatan : ");
                    String tahunPembuatanBaru = input.next();
                    tahunPembuatan.add(tahunPembuatanBaru);

                    System.out.println("Berhasil Input Kendaraan!");
                    System.out.println();
                    break;
                case "2":
                    System.out.println("Menampilkan Semua Data Kendaraan");
                    System.out.println("================================");
                    if (idKendaraan.size() == 0) {
                        System.out.println("Data Kendaraan Tidak Ada");
                    }
                    for (int i = 0; i < idKendaraan.size(); i++) {
                        System.out.println("ID Kendaraan    : " + idKendaraan.get(i));
                        System.out.println("Pengguna        : " + pengguna.get(i));
                        System.out.println("Merk Kendaraan  : " + merkKendaraan.get(i));
                        System.out.println("Tipe Kendaraan  : " + tipeKendaraan.get(i));
                        System.out.println("Tahun Pembuatan : " + tahunPembuatan.get(i));
                        System.out.println();
                        }
                    System.out.println();
                break;
                case "3":
                    System.out.println("Pencarian Data Kendaraan");
                    System.out.println("========================");
                    System.out.print("Masukkan ID Kendaraan : ");
                    String idKendaraanCari = input.next();

                    boolean found = false;
                    for (int i = 0; i < idKendaraan.size(); i++) {
                        if (idKendaraan.get(i).equals(idKendaraanCari)) {
                            System.out.println("Data Kendaraan Ditemukan : ");
                            System.out.println("ID Kendaraan    : " + idKendaraan.get(i));
                            System.out.println("Pengguna        : " + pengguna.get(i));
                            System.out.println("Merk Kendaraan  : " + merkKendaraan.get(i));
                            System.out.println("Tipe Kendaraan  : " + tipeKendaraan.get(i));
                            System.out.println("Tahun Pembuatan : " + tahunPembuatan.get(i));
                            System.out.println();
                            found = true;
                            System.out.println();
                            break;
                        }
                    }if (!found) {
                            System.out.println("ID Kendaraan Tidak Ditemukan");
                        }
                    break;
                case "4":
                    System.out.println("Cari Data Pengguna");
                    System.out.println("====================");
                    System.out.print("Masukkan Nama Pengguna : ");
                    String penggunaCari = input.next();
                    boolean foundPengguna = false;
                    for (int i = 0; i < pengguna.size(); i++) {
                        if (pengguna.get(i).equals(penggunaCari)) {
                            System.out.println("Data Pengguna Ditemukan : ");
                            System.out.println();
                            System.out.println("ID Kendaraan    : " + idKendaraan.get(i));
                            System.out.println("Merk Kendaraan  : " + merkKendaraan.get(i));
                            System.out.println("Tipe Kendaraan  : " + tipeKendaraan.get(i));
                            System.out.println("Tahun Pembuatan : " + tahunPembuatan.get(i));
                        }
                    }
                break;            
                case "5":
                    System.out.println("Ubah Data Kendaraan");
                    System.out.println("===================");
                    System.out.print("Masukkan ID Kendaraan Yang Akan Diubah : ");
                    String ubahIdKendaraan = input.next();
                    for (int i = 0; i < idKendaraan.size(); i++) {
                        if (idKendaraan.get(i).equals(ubahIdKendaraan)) {
                            System.out.println();
                            System.out.println("Data Kendaraan Ditemukan : ");
                            System.out.println();
                            System.out.println("ID Kendaraan : " + idKendaraan.get(i));
                            System.out.println("Pengguna : " + pengguna.get(i));
                            System.out.println("Merk Kendaraan : " + merkKendaraan.get(i));
                            System.out.println("Tipe Kendaraan : " + tipeKendaraan.get(i));
                            System.out.println("Tahun Pembuatan : " + tahunPembuatan.get(i));
                            System.out.println();

                            System.out.println("Masukkan Data Baru : ");
                            System.out.print("Merk Kendaraan : ");
                            String ubahMerkKendaraan = input.next();
                            merkKendaraan.set(i, ubahMerkKendaraan);
                            
                            System.out.print("Tipe Kendaraan : ");
                            String ubahTipeKendaraan = input.next();
                            tipeKendaraan.set(i, ubahTipeKendaraan);
                            
                            System.out.print("Tahun Pembuatan : ");
                            String ubahtahunPembuatanBaru = input.next();
                            tahunPembuatan.set(i, ubahtahunPembuatanBaru);
                            
                            System.out.println();
                            System.out.println("Data Kendaraan Berhasil Diubah");
                            System.out.println();
                        } else {
                            System.out.println("Gagal Mengubah Data Kendaraan!");
                            System.out.println();
                        }
                    }
                    break;
                case "6":
                    System.out.print("Masukkan ID Kendaraan yang akan dihapus : ");
                    String hapusIdKendaraan = input.next();
                    boolean hapus = false;
                    for (int i = 0; i < idKendaraan.size(); i++) {
                        if (idKendaraan.get(i).equals(hapusIdKendaraan)) {
                            idKendaraan.remove(i);
                            merkKendaraan.remove(i);
                            tipeKendaraan.remove(i);
                            tahunPembuatan.remove(i);

                            System.out.println("Data Kendaraan Berhasil Dihapus");
                            System.out.println();
                            hapus = true;
                            break;
                        } if (!hapus) {
                            System.out.println("ID Kendaraan Tidak Ditemukan");
                        }
                    }
                    break;
                default:
                    System.err.println("INPUT TIDAK DITEMUKAN, SILAHKAN PILIH 1-6!");
            }
            System.out.print("Apakah Anda Ingin Melanjutkan ? (y/n) : ");
            pilihan = input.next();

            ulang = pilihan.equalsIgnoreCase("y");
        }      
    }
        private static void clearScreen() {
            try {
                if (System.getProperty("os.name").contains("Linux")) {
                    new ProcessBuilder("bash", "-c", "clear").inheritIO().start().waitFor();
                } else {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                }
            }catch (Exception ex) {
                System.err.println("Tidak bisa clear screen");
                ex.printStackTrace();
            }
    }
}