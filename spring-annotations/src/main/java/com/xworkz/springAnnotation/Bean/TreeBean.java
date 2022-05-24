package com.xworkz.springAnnotation.Bean;

public class TreeBean {
	
	private String treeName;
	private double height;
	
	public TreeBean() {
		System.out.println(this.getClass().getSimpleName() + "Object is Created");
	}
	
	public String getTreeName() {
		return treeName;
	}
	public void setTreeName(String treeName) {
		this.treeName = treeName;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "TreeBean [treeName=" + treeName + ", height=" + height + "]";
	}
	
	void provideWood() {
		System.out.println("Providing Wood to FactoryBean");
	}
 
	
}