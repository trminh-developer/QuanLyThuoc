public class ThuocND extends Thuoc {
    private double giaBaoQuan;
    private double giaVanChuyen;

    public ThuocND(String ma, String tenThuoc, double donGiaCB, double giaBaoQuan, double giaVanChuyen) {
        super(ma, tenThuoc, donGiaCB);
        this.giaBaoQuan = giaBaoQuan;
        this.giaVanChuyen = giaVanChuyen;
    }

    @Override
    public double donGiaThuoc() {
        return giaBaoQuan + giaVanChuyen + donGiaCB;
    }
}
