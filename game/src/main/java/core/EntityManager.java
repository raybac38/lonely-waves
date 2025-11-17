package core;

import entity.Entity;
import entity.IEntity;
import entity.IEntityManager;

import java.util.HashMap;
import java.util.Random;

public class EntityManager implements IEntityManager {
	private final Random random = new Random(System.nanoTime());
	private final HashMap<Integer, IEntity> livingEntity = new HashMap<>();

	private int getAvailableID(){
		int ID;
		do {
			ID = random.nextInt();
		} while (! livingEntity.containsKey(ID));
		return ID;
	}

	@Override
	public IEntity newEntity(String name) {
		int ID = getAvailableID();
		IEntity entity = new Entity(ID, name);
		livingEntity.put(ID, entity);
		return entity;
	}

	@Override
	public IEntity newEntity() {
		int ID = getAvailableID();
		IEntity entity = new Entity(ID);
		livingEntity.put(ID, entity);
		return entity;
	}

	@Override
	public void destroyEntity(IEntity entity) {
		int IDToDestroy = entity.getID();
		if (livingEntity.containsKey(IDToDestroy)) {

		} else {
			throw new RuntimeException("Entity to remove is not living");
		}

	}
}
