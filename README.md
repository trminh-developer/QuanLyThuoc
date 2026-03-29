# 📌 Quản lý Thuốc

## 1. Tổng quan
- Kế thừa (`extends`)
- Đa hình (polymorphism)
- Abstract class

---

## 2. Sơ đồ lớp

- `Thuoc` (lớp cha - abstract)
- `ThuocND` (thuốc nội địa)
- `ThuocNK` (thuốc nhập khẩu)

---

## 3. Class cha: Thuoc

### Thuộc tính:
- `ma: String`
- `tenThuoc: String`
- `donGiaCB: double`

### Phương thức:
- `donGiaThuoc()` → abstract
- `ShowDonThuoc()`

---

## 4. Class ThuocND (thuốc nội địa)

### Thuộc tính:
- `giaBaoQuan: double`
- `giaVanChuyen: double`

### Công thức:

---

## 5. Class ThuocNK (thuốc nhập khẩu)

### Thuộc tính:
- `phiNhapKhau: double`
- `soLanNhapKhau: int`

### Công thức:

---

## 6. Vì sao dùng abstract?

### ❓ Vấn đề:
Không có cách tính đơn giá chung cho tất cả thuốc.

### ✅ Giải pháp:
Dùng `abstract` để:
- Định nghĩa phương thức chung
- Ép class con phải @Override

👉 Nguyên tắc:
> "Biết phải làm gì, nhưng không biết làm như thế nào"

---

## 7. Khi nào nên dùng abstract?

- Có hành vi chung nhưng cách làm khác nhau
- Không muốn tạo object từ class cha
- Muốn ép class con phải cài đặt phương thức

---

## 8. Main sử dụng ArrayList

### Mục đích:
- Lưu danh sách thuốc
- Áp dụng đa hình

```java
ArrayList<Thuoc> list = new ArrayList<>();