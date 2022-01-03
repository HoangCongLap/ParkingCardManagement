package com.management;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LapHoang
 */
public class QuanLiSinhVien {

    private int tienGuiXe = 5;
    private ArrayList<ThongTinSinhVien> danhSach;

    public QuanLiSinhVien() {
        this.danhSach = new ArrayList<>();
    }

    public QuanLiSinhVien(ArrayList<ThongTinSinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    public void setTienGuiXe(int tienGuiXe) {
        this.tienGuiXe = tienGuiXe;
    }

    public void writeToFile() {
        try {
            FileWriter fw = new FileWriter("data.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (ThongTinSinhVien o : danhSach) {
                bw.write(o.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * *
     * Thêmm sinh viên
     *
     * @param sv
     */
    public void addSinhVien(ThongTinSinhVien sv) {
        this.danhSach.add(sv);
    }

    /**
     * *
     * remove sinh
     *
     * @param svvien sinh vien truyen
     * @return true n?u sinh viên du?c
     */
    public boolean removeSinhVien(ThongTinSinhVien sv) {
        return this.danhSach.remove(sv);
    }

    public void thanhToan(String ten) {
        for (int i = 0; i < danhSach.size(); i++) {
            ThongTinSinhVien thongTin = danhSach.get(i);
            if (thongTin.getHoTen().contains(ten)) {
                if (thongTin.getSoTienTrongAccount() < tienGuiXe) {
                    System.out.println("Thanh toan that bai!!!");
                } else {
                    double sum = thongTin.getSoTienTrongAccount() - tienGuiXe;
                    thongTin.setSoTienTrongAccount(sum);
                    System.out.println("Thanh toan thanh cong.");
                }
            }
        }
    }

    public void outputSinhVien() {
        for (ThongTinSinhVien thongTin : danhSach) {
            System.out.println(thongTin);
        }
    }

    public static void main(String[] args) {

        ThongTinSinhVien tt = new ThongTinSinhVien("6s", 1, "lap", 6);
        QuanLiSinhVien ds = new QuanLiSinhVien();
        ds.addSinhVien(tt);
        ds.writeToFile();
//        ds.thanhToan("lap");

    }
}
