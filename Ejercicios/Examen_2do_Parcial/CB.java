public class CB extends CA {
	
	private int z;

	public CB (int x_p, int y_p, int z_p) {
		super(x_p, y_p);
		this.z = z_p;
	}

	public int suma() {
		return super.suma() + this.z;		
	}
}