package domain;

public class Marvel {
	
	//Attributes
	private Long id;
	private String name;
	private String Species;
	private boolean dead;
	private boolean superHero;
	
	
	public Marvel(Long id, String name, String species, boolean dead, boolean superHero) {
		super();
		this.id = id;
		this.name = name;
		Species = species;
		this.dead = dead;
		this.superHero = superHero;
	}
	
	
	//Methods - GETTERS AND SETTERS
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecies() {
		return Species;
	}
	public void setSpecies(String species) {
		Species = species;
	}
	public boolean isDead() {
		return dead;
	}
	public void setDead(boolean dead) {
		this.dead = dead;
	}
	public boolean isSuperHero() {
		return superHero;
	}
	public void setSuperHero(boolean superHero) {
		this.superHero = superHero;
	}
	
	

	
	

}
