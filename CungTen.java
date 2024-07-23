package game.model;

public class CungTen extends VuKhi {
	private double congvatly;
	private double tamdanh;
	//cons
	public CungTen(String tenvk, int soluong, double congvatly, double tamdanh) {
		super(tenvk, soluong);
		this.congvatly = congvatly;
		this.tamdanh = tamdanh;
	}
	//getter/setter
	public double getCongvatly() {
		return congvatly;
	}
	public void setCongvatly(double congvatly) {
		this.congvatly = congvatly;
	}
	public double getTamdanh() {
		return tamdanh;
	}
	public void setTamdanh(double tamdanh) {
		this.tamdanh = tamdanh;
	}
	@Override
	public String toString() {
		return "CungTen [congvatly=" + congvatly + ", tamdanh=" + tamdanh + "]";
	}
	@Override
	public double tinhsucmanhVK() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void tancong() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void phongthu() {
		// TODO Auto-generated method stub
		
	}
	
}
