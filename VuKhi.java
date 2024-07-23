package game.model;

public abstract class VuKhi implements Cloneable{
	private String tenvk;
	private int soluong;
	public abstract void tancong();
	public abstract void phongthu();
	
	@Override
	public String toString() {
		return "VuKhi [tenvk=" + tenvk + ", soluong=" + soluong + "]";
	}

	public String getTenvk() {
		return tenvk;
	}

	public void setTenvk(String tenvk) {
		this.tenvk = tenvk;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public VuKhi(String tenvk, int soluong) {
		super();
		this.tenvk = tenvk;
		this.soluong = soluong;
	}

	public abstract double tinhsucmanhVK();
	
	 @Override
	    protected Object clone() throws CloneNotSupportedException {
	        return super.clone(); 
	    }
	 
}
