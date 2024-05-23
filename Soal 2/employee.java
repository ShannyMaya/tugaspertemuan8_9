public class Employee extends Person {
    private String kantor;
    private double gaji;
    private MyDate tanggalDipekerjakan;

    public Employee(String nama, String alamat, String nomorTelepon, String email, 
            String kantor, double gaji, MyDate tanggalDipekerjakan) {
        super(nama, alamat, nomorTelepon, email);
        this.kantor = kantor;
        this.gaji = gaji;
        this.tanggalDipekerjakan = tanggalDipekerjakan;
    }
    @Override
    public String toString() {
        return "Kelas: Employee, Nama: " + nama;
   }
}
