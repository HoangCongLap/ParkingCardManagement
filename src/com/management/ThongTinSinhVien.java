package com.management;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author LapHoang
 */
public class ThongTinSinhVien {

    static final int tienGuiXe = 5;
    private String maThe;
    private int maSo;
    private String hoTen;
    private double moneyInAccount;

    public ThongTinSinhVien(String maThe) {
        this.maThe = maThe;
    }

    public ThongTinSinhVien() {
        this.maThe = "";
        this.maSo = 0;
        this.hoTen = "";
        this.moneyInAccount = 0;
    }

    public ThongTinSinhVien(ThongTinSinhVien giaTri) {
        this.maThe = giaTri.maThe;
        this.maSo = giaTri.maSo;
        this.hoTen = giaTri.hoTen;
        this.moneyInAccount = giaTri.moneyInAccount;
    }

    public ThongTinSinhVien(String maThe, int maSo, String hoTen, double moneyInAccount) {
        this.maThe = maThe;
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.moneyInAccount = moneyInAccount;
    }

    public String getMaThe() {
        return maThe;
    }

    public int getMaSo() {
        return maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getSoTienTrongAccount() {
        return moneyInAccount;
    }

    public void setMaThe(String maThe) {
        this.maThe = maThe;
    }

    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setSoTienTrongAccount(double soTienTrongAccount) {
        this.moneyInAccount = soTienTrongAccount;
    }
//======================================================

//    public static void quetMa(ThongTinSinhVien[] thongTin, String maTheCanTim) {
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < thongTin.length; i++) {
//            if (thongTin[i].maThe.equals(maTheCanTim)) {
//                if (thongTin[i].moneyInAccount < tienGuiXe) {
//                    System.out.println("Thanh toan that bai!!!");
//                } else {
//                    thongTin[i].moneyInAccount -= tienGuiXe;
//                    System.out.println("Thanh toan thanh cong.");
//                    System.out.println("Hay kiem tra thong tin va tien trong tai khoan:" + thongTin[i].toString());
//                }
//            }
//        }
//    }
//======================================================
//    public void themSinhVien(ThongTinSinhVien sv) {
//
//    }
//======================================================
//    public void input() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhap ma the xe:");
//        maThe = scanner.nextLine();
//        System.out.print("Nhap ma so sinh vien:");
//        maSo = scanner.nextInt();
//        scanner = new Scanner(System.in);
//        System.out.print("Nhap ho ten sinh vien:");
//        hoTen = scanner.nextLine();
//        System.out.print("Nhap so tien:");
//        moneyInAccount = scanner.nextDouble();
//    }
//======================================================
    @Override
    public String toString() {
        return "ThongTinSinhVien{" + "Ma the= " + maThe + ", Ma so= " + maSo + ", Ho ten= " + hoTen + ", Money in account= " + moneyInAccount + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(maThe, maSo, hoTen, moneyInAccount);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ThongTinSinhVien other = (ThongTinSinhVien) obj;
        if (!Objects.equals(maThe, other.maThe)) {
            return false;
        }
        return true;
    }

    public void sumThanhToan(ThongTinSinhVien[] thongTin) {
        for (int i = 0; i < thongTin.length; i++) {
            thongTin[i].moneyInAccount -= 5;
        }
    }
}
//
//class DanhSach {
//
//    public int soLuonngPhanTu;
//    public int[] mang;
//
//    public DanhSach() {
//
//    }
//
//    public int getSoLuonngPhanTu() {
//        return soLuonngPhanTu;
//    }
//
//    public int[] getMang() {
//        return mang;
//    }
//
//    public void setSoLuonngPhanTu(int soLuonngPhanTu) {
//        this.soLuonngPhanTu = soLuonngPhanTu;
//    }
//
//    public void setMang(int[] mang) {
//        this.mang = mang;
//    }
//}
