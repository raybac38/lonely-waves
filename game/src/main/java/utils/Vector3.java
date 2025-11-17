package utils;

public class Vector3 {
	private float x, y, z;

	Vector3(float x, float y, float z){
		this.x = x;
		this.y = y;
		this.z = z;
	}

	Vector3(){
		x = 0;
		y = 0;
		z = 0;
	}

	/*
	Getter
	 */
	public float getX() {return x;}
	public float getY() {return y;}
	public float getZ() {return z;}

	/*
	Setter
	 */
	public void setX(float new_x) {x = new_x;}
	public void setY(float new_y) {y = new_y;}
	public void setZ(float new_z) {z = new_z;}

}
