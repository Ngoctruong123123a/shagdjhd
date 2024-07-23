package game.model;

import java.util.List;

public class KiemKhach extends NhanVat{
	public KiemKhach(double mana2, double blood2, double satThuong2, String ten2, int iD, String gioiTinh, int namSinh,
			List<VuKhi> dsvk2, boolean b, boolean c, boolean d, boolean e) {
		super(mana2, blood2, satThuong2, ten2, iD, gioiTinh, namSinh, dsvk2, b, c, d, e);
		// TODO Auto-generated constructor stub
	}
	private boolean kiem;
	private boolean cungten;
	private boolean duaphep;
	private boolean phao;
	

	
	public boolean isKiem() {
		return kiem;
	}
	public void setKiem(boolean kiem) {
		this.kiem = kiem;
	}
	public boolean isCungten() {
		return cungten;
	}
	public void setCungten(boolean cungten) {
		this.cungten = cungten;
	}
	public boolean isDuaphep() {
		return duaphep;
	}
	public void setDuaphep(boolean duaphep) {
		this.duaphep = duaphep;
	}
	public boolean isPhao() {
		return phao;
	}
	public void setPhao(boolean phao) {
		this.phao = phao;
	}
	@Override
	public String toString() {
		return "KiemKhach [kiem=" + kiem + ", cungten=" + cungten + ", duaphep=" + duaphep + ", phao=" + phao
				+ ", getMana()=" + getMana() + ", getBlood()=" + getBlood() + ", getSatthuong()=" + getSatThuong()
				+ ", getTen()=" + getTen() + ", getID()=" + getBlood() + ", getGioiTinh()=" + getGioiTinh()
				+ ", getNamSinh()=" + getNamSinh() + "]";
	}
	private String getNamSinh() {
		// TODO Auto-generated method stub
		return null;
	}
	private String getGioiTinh() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void sangPhai() {
		// TODO Auto-generated method stub
		super.sangPhai();
	}
	@Override
	public void sangTrai() {
		// TODO Auto-generated method stub
		super.sangTrai();
	}
	@Override
	public void tienLen() {
		// TODO Auto-generated method stub
		super.tienLen();
	}
	@Override
	public void luiLai() {
		// TODO Auto-generated method stub
		super.luiLai();
	}
	@Override
	public void jump() {
		// TODO Auto-generated method stub
		super.jump();
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		super.fly();
	}
	
	
	
	
	
	
	
}
