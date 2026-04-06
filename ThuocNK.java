public class ThuocNK extends Thuoc {
    private final double phiNhapKhau;
    private final int soLanNhapKhau;

    public ThuocNK(String ma, String tenThuoc, double donGiaCB, double phiNhapKhau, int soLanNhapKhau) {
        super(ma, tenThuoc, donGiaCB);
        this.phiNhapKhau = phiNhapKhau;
        this.soLanNhapKhau = soLanNhapKhau;
    }

    @Override
    public double donGiaThuoc() {
        return this.phiNhapKhau * this.soLanNhapKhau + this.donGiaCB;
    }
}
