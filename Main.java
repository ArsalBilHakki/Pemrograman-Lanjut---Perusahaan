public class Main {
    public static void main(String[] args) {

        Perusahaan perusahaan = new Perusahaan("PT. Jamu Tak Jemu");

        Karyawan karyawan1 = new Karyawan("Siti", 1000000, perusahaan);
        Karyawan karyawan2 = new Karyawan("Wati", 1000000, perusahaan);
        Karyawan karyawan3 = new Karyawan("Kartini", 80000, perusahaan);
        Karyawan karyawan4 = new Karyawan("Sarinah", 750000, perusahaan);
        Karyawan karyawan5 = new Karyawan("Sarinem", 750000, perusahaan);

        karyawan1.info();
        System.out.println();
        karyawan2.info();
        System.out.println();
        karyawan3.info();
        System.out.println();
        karyawan4.info();
        System.out.println();
        karyawan5.info();
    }
}