public class Dosis {

	private float gramos;
	private float miligramos;
	private float mililitros;

	public void setGramos(float gramos) {
        this.gramos = gramos;
    }

    public void setMiligramos(float miligramos) {
        this.miligramos = miligramos;
    }

    public void setMililitros(float mililitros) {
        this.mililitros = mililitros;
    }
	public float getGramos() {
        return gramos;
    }

    public float getMiligramos() {
        return miligramos;
    }

    public float getMililitros() {
        return mililitros;
    }

    
    public String toString() {
        return "Dosis{" + this.gramos + "g" + this.miligramos + "mg" + this.mililitros + "ml" +"}";
    }
}