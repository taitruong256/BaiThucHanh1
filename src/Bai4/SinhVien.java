package Bai4;

public class SinhVien {
	private int maSV;
	private String hoTen;
	private double diemLT;
	private double diemTH;
	public SinhVien() {
		this.maSV=0;
		this.hoTen="";
		this.diemLT=0;
		this.diemTH=0;
	}
	public SinhVien(int maSV, String hoTen, double diemLT, double diemTH) {
		super();
		this.maSV = maSV<0?0:maSV;
		this.hoTen = hoTen.equals("")?"@":hoTen;
		this.diemLT = (diemLT<0 || diemLT>10)?0:diemLT;
		this.diemTH = (diemTH<0 || diemTH>10)?0:diemTH;
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public double getDiemLT() {
		return diemLT;
	}
	public void setDiemLT(float diemLT) {
		this.diemLT = diemLT;
	}
	public double getDiemTH() {
		return diemTH;
	}
	public void setDiemTH(float diemTH) {
		this.diemTH = diemTH;
	}
	public double diemTB() {
		return (diemTH+diemLT)/2;
	}
	@Override
	public String toString() {
		return String.format("|%10d|%30s|%10.2f|%10.2f|%10.2f|", maSV, hoTen, diemLT, diemTH, diemTB());
	}
	
}
