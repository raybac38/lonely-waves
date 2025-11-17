package entity;

public class Entity implements IEntity {
	private final String name;
	private final int ID;

	public Entity(int ID, String name){
		this.ID = ID;
		this.name = name;
	}

	public Entity(int ID){
		this.ID = ID;
		this.name = this.toString();
	}

	@Override
	public int getID() {
		return ID;
	}

	@Override
	public String getName() {
		return name;
	}
}
