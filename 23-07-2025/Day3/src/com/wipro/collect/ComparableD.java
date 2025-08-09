package com.wipro.collect;


public class ComparableD implements Comparable<ComparableD> 
{
	private String name;
	private int id;
	public ComparableD(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "name=" + name + ", id=" + id ;
	}
	@Override
	public int compareTo(ComparableD that) {
		
		return Integer.compare(this.id, that.id);
	}
	

	
	

}
