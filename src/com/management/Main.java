package com.management;

import java.util.Scanner;

/**
 *
 * @author LapHoang
 */
public class Main {

    public static void main(String[] args) {
//        ThongTinSinhVien thongTin=new ThongTinSinhVien();
//        thongTin.input();
//        System.out.println(thongTin.toString());
//=========================================================
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("++Nhap so luong sinh vien:");
//        int soSinhVien = scanner.nextInt();
//        ThongTinSinhVien[] thongTin = new ThongTinSinhVien[soSinhVien];
//        System.out.println("++Nhap thong tin sinh vien:");
//        for (int i = 0; i < soSinhVien; i++) {
//            System.out.println("+Nhap sinh vien thu " + (i + 1) + ":");
//            thongTin[i] = new ThongTinSinhVien();
//            thongTin[i].input();
//        }
//        System.out.println("++Xuat sinh vien:");
//        for (int i = 0; i < soSinhVien; i++) {
//            System.out.println("+Xuat sinh vien thu " + (i + 1) + ":");
//            System.out.println(thongTin[i].toString());
//        }
//        System.out.println("Nhap ma the sinh vien de thanh toan: ");
//        scanner = new Scanner(System.in);
//        String maTheCanTim = scanner.nextLine();
//        ThongTinSinhVien.quetMa(thongTin, maTheCanTim);
//=================================================

// int giatri = 10;
//        Mang a = new Mang();
//        a.soLuonngPhanTu = giatri;
//        a.mang = new int[a.soLuonngPhanTu];
//    }
//=================================================
//        ThongTinSinhVien tt = new ThongTinSinhVien(maThe, maSo, hoTen, moneyInAccount);
        int luachon = 0;
        Scanner scanner = new Scanner(System.in);
        QuanLiSinhVien dssv = new QuanLiSinhVien();
        do {
            System.out.println("MENU");
            System.out.println(
                    "1. Them mot sinh vien vao danh sach.\n"
                    + "2. In danh sach sinh vien ra man hinh\n"
                    + "3. Xoa 1 sinh vien\n"
                    + "4. Thanh toan tien gui xe\n"
                    + "5. ghi flie\n"
                    + "0. thoat khoi chuong trinh.\n"
            );
            System.out.print("Chon chuc nang:");
            luachon = scanner.nextInt();

            if (luachon == 1) {
                scanner = new Scanner(System.in);
                System.out.print("Nhap ma the xe:");
                String maThe = scanner.nextLine();
                System.out.print("Nhap ho ten sinh vien:");
                String hoTen = scanner.nextLine();
                System.out.print("Nhap ma so sinh vien:");
                int maSo = scanner.nextInt();
                System.out.print("Nhap so tien:");
                double moneyInAccount = scanner.nextDouble();
                ThongTinSinhVien tt = new ThongTinSinhVien(maThe, maSo, hoTen, moneyInAccount);
                dssv.addSinhVien(tt);
            } else if (luachon == 2) {
                dssv.outputSinhVien();
            } else if (luachon == 3) {
                scanner = new Scanner(System.in);
                System.out.print("Nhap ma the sinh vien can xoa:");
                String maThe = scanner.nextLine();
                ThongTinSinhVien tt = new ThongTinSinhVien(maThe);
                System.out.println("Xoa sinnh vien trong danh sach:" + dssv.removeSinhVien(tt));
            } else if (luachon == 4) {
                scanner = new Scanner(System.in);
                System.out.print("Nhap ten sinh vien :");
                String hoTen = scanner.nextLine();
                ThongTinSinhVien tt = new ThongTinSinhVien(hoTen);
                dssv.thanhToan(hoTen);
            }else if (luachon == 5) {
//                dssv.writeToFile(list);
            }
        } while (luachon != 0);
    }
}
