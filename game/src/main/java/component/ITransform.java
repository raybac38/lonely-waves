package component;

import utils.Vector3;

public interface ITransform {

	Vector3 getPosition();
	Vector3 getRotation();
	Vector3 getScale();

	void setPosition(Vector3 position);
	void setRotation(Vector3 rotation);
	void setScale(Vector3 scale);

}
