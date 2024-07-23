package game.model;

public class Kiem extends VuKhi {
	private double congvatly;
	private double tamdanh;
	@Override
	public double tinhsucmanhVK() {
		// TODO Auto-generated method stub
		return 0;
	}
	//cons
	public Kiem(String tenvk, int soluong, double congvatly, double tamdanh) {
		super(tenvk, soluong);
		this.congvatly = congvatly;
		this.tamdanh = tamdanh;
	}

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
		return "Kiem [congvatly=" + congvatly + ", tamdanh=" + tamdanh + "]";
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
