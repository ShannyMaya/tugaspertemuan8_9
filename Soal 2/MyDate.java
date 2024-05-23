public class MyDate {
    private int tahun;
    private int bulan;
    private int hari;

    public MyDate(int tahun, int bulan, int hari) {
        this.tahun = tahun;
        this.bulan = bulan;
        this.hari = hari;
    }

    @Override
    public String toString() {
        return tahun + "-" + bulan + "-" + hari;
    }
}
