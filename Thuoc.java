public abstract class Thuoc {
    protected String ma;
    protected String tenThuoc;
    protected double donGiaCB;

    public Thuoc(String ma, String tenThuoc, double donGiaCB) {
        this.ma = ma;
        this.tenThuoc = tenThuoc;
        this.donGiaCB = donGiaCB;
    }

    public String getMa() {
        return ma;
    }
    
    public String getTenThuoc() {
        return tenThuoc;
    }

    public double getDonGiaCB() {
        return donGiaCB;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTenThuoc(String tenThuoc) {
        this.tenThuoc = tenThuoc;
    }
    public void setDonGiaCB(double donGiaCB) {
        this.donGiaCB = donGiaCB;
    }

    public abstract double donGiaThuoc();

    public void ShowDonThuoc() {
        System.out.println("----- Đơn Thuốc -----");
        System.out.println("\tMã: " + this.ma + "\n\tTên: " + this.tenThuoc + "\n\tĐơn Giá: " + this.donGiaThuoc());
    }
}