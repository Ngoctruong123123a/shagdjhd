package game.model;

import java.util.List;

public class CungThu extends NhanVat {
	private boolean kiem;
	private boolean cungten;
	private boolean	duaphep;
	private boolean phao;
	
	//constructor
	public CungThu(String ten, double mana, double blood, double satThuong, boolean kiem, boolean cungten,
			boolean duaphep, boolean phao) {
		super(ten, mana, blood, satThuong);
		this.kiem = kiem;
		this.cungten = cungten;
		this.duaphep = duaphep;
		this.phao = phao;
	}
	

	//getter/setters
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

	//to String
	@Override
	public String toString() {
		return "CungThu [kiem=" + kiem + ", cungten=" + cungten + ", duaphep=" + duaphep + ", phao=" + phao
				+ ", getMana()=" + getMana() + ", getBlood()=" + getBlood() + ", getSatthuong()=" + getSatThuong()
				+ ", getTen()=" + getTen() + ", getID()=" + getBlood() + ", getGioitinh()=" + getGioiTinh()
				+ ", getNamsinh()=" + getNamSinh() + "]";
	}

	private String getGioiTinh() {
		// TODO Auto-generated method stub
		return null;
	}


	private String getNamSinh() {
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
