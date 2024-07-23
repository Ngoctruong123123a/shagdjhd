package game.model;

import java.util.List;

public class PhaoBinh extends NhanVat {
	private boolean kiem;
	private boolean cungTen;
	private boolean duaPhep;
	private boolean phao;
	
	// Constructor
	public PhaoBinh(double mana, double blood, double satThuong, String ten, int iD, String gioiTinh, int namSinh,
			List<VuKhi> dsvk, boolean b, boolean c, boolean d, boolean e, boolean kiem, boolean cungTen,
			boolean duaPhep, boolean phao) {
		super(mana, blood, satThuong, ten, iD, gioiTinh, namSinh, dsvk, b, c, d, e);
		this.kiem = kiem;
		this.cungTen = cungTen;
		this.duaPhep = duaPhep;
		this.phao = phao;
	}

	
	// Getter/Setters
	public boolean isKiem() {
		return kiem;
	}
	public void setKiem(boolean kiem) {
		this.kiem = kiem;
	}

	public boolean isCungTen() {
		return cungTen;
	}

	public void setCungTen(boolean cungTen) {
		this.cungTen = cungTen;
	}

	public boolean isDuaPhep() {
		return duaPhep;
	}

	public void setDuaPhep(boolean duaPhep) {
		this.duaPhep = duaPhep;
	}

	public boolean isPhao() {
		return phao;
	}

	public void setPhao(boolean phao) {
		this.phao = phao;
	}

	// toString
	@Override
	public String toString() {
		return "PhaoBinh [kiem=" + kiem + ", cungTen=" + cungTen + ", duaPhep=" + duaPhep + ", phao=" + phao
				+ ", getMana()=" + getMana() + ", getBlood()=" + getBlood() + ", getSatThuong()=" + getSatThuong()
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
	
}
