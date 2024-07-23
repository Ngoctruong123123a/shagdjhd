package game.model;

import java.util.Comparator;

public class Dan implements Comparator<Phao> {
	private int soluongdan;
	@Override
	public int compare(Phao o1, Phao o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	public Dan(int soluongdan) {
		super();
		this.soluongdan = soluongdan;
	}
	public int getSoluongdan() {
		return soluongdan;
	}
	public void setSoluongdan(int soluongdan) {
		this.soluongdan = soluongdan;
	}
	@Override
	public String toString() {
		return "bullet [soluongdan=" + soluongdan + "]";
	}

}
