public class Staff extends Employee {
    private String gelar;

    public Staff(String nama, String alamat, String nomorTelepon, String email,
            String kantor, double gaji, MyDate tanggalDipekerjakan, String gelar) {
        super(nama, alamat, nomorTelepon, email, kantor, gaji, tanggalDipekerjakan);
        this.gelar = gelar;
    }
    
    @Override
    public String toString() {
        return "Kelas: Staff, Nama: " + nama;
    }
}
