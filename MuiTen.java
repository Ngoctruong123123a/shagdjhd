package game.model;

import java.util.Comparator;

public class MuiTen implements Comparator<CungThu> {
	private int soluongmuiten;

	public MuiTen(int soluongmuiten) {
		super();
		this.soluongmuiten = soluongmuiten;
	}

	public int getSoluongmuiten() {
		return soluongmuiten;
	}

	public void setSoluongmuiten(int soluongmuiten) {
		this.soluongmuiten = soluongmuiten;
	}

	@Override
	public String toString() {
		return "MuiTen [soluongmuiten=" + soluongmuiten + "]";
	}

	@Override
	public int compare(CungThu o1, CungThu o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
