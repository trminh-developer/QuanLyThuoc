
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Thuoc> list = new ArrayList<>();

        // Thuốc Nội Địa
        list.add(new ThuocND("ND1", "Paracetamol", 1000, 2000, 1000));
        list.add(new ThuocND("ND2", "Vitamin C", 8000, 1500, 500));
        list.add(new ThuocND("N03", "Amoxicillin", 12000, 2500, 1200));

        // Thuốc Nhập Khẩu
        list.add(new ThuocNK("NK1", "Panadol", 15000, 3000, 2));
        list.add(new ThuocNK("NK2", "Aspirin", 1300, 2500, 3));
        list.add(new ThuocNK("NK2", "Aspirin", 1400, 2000, 1));

        for (Thuoc t : list) {
            t.ShowDonThuoc();
        }
    }
}
