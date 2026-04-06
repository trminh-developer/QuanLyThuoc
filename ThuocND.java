public class ThuocND extends Thuoc {
    private double giaBaoQuan;
    private double giaVanChuyen;

    public ThuocND(String ma, String tenThuoc, double donGiaCB, double giaBaoQuan, double giaVanChuyen) {
        super(ma, tenThuoc, donGiaCB);
        this.giaBaoQuan = giaBaoQuan;
        this.giaVanChuyen = giaVanChuyen;
    }

    public double getGiaBaoQuan() {
        return giaBaoQuan;
    }

    public double getGiaVanChuyen() {
        return giaVanChuyen;
    }

    public void setGiaBaoQuan(double giaBaoQuan) {
        this.giaBaoQuan = giaBaoQuan;
    }

    public void setGiaVanChuyen(double giaVanChuyen) {
        this.giaVanChuyen = giaVanChuyen;
    }

    @Override
    public double donGiaThuoc() { // Tính giá thuốc nội địa
        return this.giaBaoQuan + this.giaVanChuyen + this.donGiaCB;
    }
}
