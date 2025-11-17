package system;

import component.IComponent;
import entity.IEntity;

public interface ISystem {
	/*
	Update all behaviour for the system
	 */
	void update();

	/*
	Notify that a component is added to the given entity
	 */
	void addComponent(IEntity entity, IComponent component);

	/*
	Notify that a component is removed to the given entity
	 */
	void removeComponent(IEntity entity, IComponent component);

	/*
	Notify that the entity have be removed
	 */
	void removeEntity(IEntity entity);
}
