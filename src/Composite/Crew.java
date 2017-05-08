package Composite;

import java.util.List;
import java.util.ArrayList;

public class Crew {
	
	private String name;
	private String rank;
	private String dept;
	private String position;
	private List<Crew> subordinates;

	//Constructor
	public Crew (String name, String rank, String dept, String position) {
		this.name = name;
		this.rank = rank;
		this.dept = dept;
		this.position = position;
		subordinates = new ArrayList<Crew>();
	}
	
	public void add(Crew e) {
		subordinates.add(e);
	}
	
	public void remove(Crew e) {
		subordinates.remove(e);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public List<Crew> getSubordinates() {
		return subordinates;
	}
	
	public String toString() {
		return (name + ", " + rank + ", " + dept + ", " + position);
	}
	
}
