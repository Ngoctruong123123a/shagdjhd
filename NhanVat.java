package game.model;

import java.util.ArrayList;
import java.util.List;

public class NhanVat implements DiChuyen {
	private String ten;  
    private double mana;
    private double blood;
    private double satThuong; 
    private List<VuKhi> dsvk;

	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public double getMana() {
		return mana;
	}
	public void setMana(double mana) {
		this.mana = mana;
	}
	public double getBlood() {
		return blood;
	}
	public void setBlood(double blood) {
		this.blood = blood;
	}
	public double getSatThuong() {
		return satThuong;
	}
	public void setSatThuong(double satThuong) {
		this.satThuong = satThuong;
	}
	public List<VuKhi> getDsvk() {
		return dsvk;
	}
	public void setDsvk(List<VuKhi> dsvk) {
		this.dsvk = dsvk;
	}
	public NhanVat(String ten, double mana, double blood, double satThuong) {
		super();
		this.ten = ten;
		this.mana = mana;
		this.blood = blood;
		this.satThuong = satThuong;
	}
	public NhanVat(double mana2, double blood2, double satThuong2, String ten2, int iD, String gioiTinh, int namSinh,
			List<VuKhi> dsvk2, boolean b, boolean c, boolean d, boolean e) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "NhanVat [mana=" + mana + ", blood=" + blood + ", satThuong=" + satThuong + ", ten=" + ten + ", dsvk="
				+ dsvk + "]";
	}
	@Override
	public void sangPhai() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sangTrai() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void tienLen() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void luiLai() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

}