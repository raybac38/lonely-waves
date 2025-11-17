package entity;

public interface IEntityManager {
	/*
	Create a new entity with the given name
	 */
	IEntity newEntity(String name);
	/*
	Create a new anonymous entity
	 */
	IEntity newEntity();

	/*
	Destroy the given entity
	 */
	void destroyEntity(IEntity entity);


}
