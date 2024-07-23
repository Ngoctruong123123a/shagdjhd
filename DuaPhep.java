package game.model;

public class DuaPhep extends VuKhi {
	private double congphepthuat;
	private double tamdanh;
	//cons
	public DuaPhep(String tenvk, int soluong, double congphepthuat, double tamdanh) {
		super(tenvk, soluong);
		this.congphepthuat = congphepthuat;
		this.tamdanh = tamdanh;
	}
	//getter/setter
	public double getCongphepthuat() {
		return congphepthuat;
	}
	public void setCongphepthuat(double congphepthuat) {
		this.congphepthuat = congphepthuat;
	}
	public double getTamdanh() {
		return tamdanh;
	}
	public void setTamdanh(double tamdanh) {
		this.tamdanh = tamdanh;
	}
	@Override
	public String toString() {
		return "DuaPhep [congphepthuat=" + congphepthuat + ", tamdanh=" + tamdanh + "]";
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
