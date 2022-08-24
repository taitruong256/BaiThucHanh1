package Bai4;

import java.util.Scanner;

public class testSinhVien {

	public static void tieuDe() {
		for (int i=0; i<76; i++) System.out.print("-");
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien sv1 = new SinhVien(1111, "Nguyễn Thanh An", 6.5, 8.5);
		SinhVien sv2 = new SinhVien();
		sv2.setMaSV(2222);
		sv2.setHoTen("Lê Thị Bông");
		sv2.setDiemLT(7.5f);
		sv2.setDiemTH(8.0f);
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập mã số SV của SV3: ");
		int maSV = sc.nextInt();
		sc = new Scanner(System.in);
		System.out.print("Nhập họ và tên SV3: ");
		String hoTen = sc.nextLine();
		sc = new Scanner(System.in);
		System.out.print("Nhập điểm lý thuyết SV3: ");
		double diemLT = sc.nextDouble();
		sc = new Scanner(System.in);
		System.out.print("Nhập điểm thực hành SV3: ");
		double diemTH = sc.nextDouble();
		SinhVien sv3 = new SinhVien(maSV, hoTen, diemLT, diemTH);
		tieuDe();
		System.out.println(String.format("|%10s|%30s|%10s|%10s|%10s|", "Mã SV", "Họ tên", "Điểm LT", "Điểm TH", "Điểm TB"));
		tieuDe();
		System.out.println(sv1.toString());
		tieuDe();
		System.out.println(sv2.toString());
		tieuDe();
		System.out.println(sv3.toString());
		tieuDe();
		
	}
}
