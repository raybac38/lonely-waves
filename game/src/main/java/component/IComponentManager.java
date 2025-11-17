package component;

import entity.IEntity;

public interface IComponentManager {
	void addComponent(IEntity entity, IComponent component);

	void removeComponent(IEntity entity, IComponent component);
}
