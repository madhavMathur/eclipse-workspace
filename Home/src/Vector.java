
public class Vector {

	double magnitude;
	double i, j, k;
	Vector direction;
	Vector origin = new Vector(0, 0, 0);
	
	public Vector(double i, double j, double k) {
		this.i = i;
		this.j = j;
		this.k = k;
		this.magnitude = getMagnitude(this);
	}
	
	public double getDirection(Vector v1) {
		return Math.acos(v1.i / v1.getMagnitude(v1));
	}
	
	public double getMagnitude(Vector v) {
		return Math.sqrt(i * i + j * j + k * k);
	}
	
}
