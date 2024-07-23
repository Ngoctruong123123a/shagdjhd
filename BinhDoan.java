package game.model;

public class BinhDoan {
	private String tenBinhDoan;
	private int soluong;
	public BinhDoan(String tenBinhDoan, int soLuong2) {
		super();
		this.tenBinhDoan = tenBinhDoan;
		this.soluong = soLuong2;
	}
	public String getTenBinhDoan() {
		return tenBinhDoan;
	}
	public void setTenBinhDoan(String tenBinhDoan) {
		this.tenBinhDoan = tenBinhDoan;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	@Override
	public String toString() {
		return "BinhDoan [tenBinhDoan=" + tenBinhDoan + ", soluong=" + soluong + "]";
	}
	
}
