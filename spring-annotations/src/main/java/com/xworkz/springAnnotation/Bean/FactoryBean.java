package com.xworkz.springAnnotation.Bean;

public class FactoryBean {
	
	private Integer noOfpaperProduced;
	private boolean isPaperAvailable;
	private TreeBean treeBean;
	
	public FactoryBean(TreeBean treeBean) {
		super();
		this.treeBean = treeBean;
		System.out.println(this.getClass().getSimpleName() + "Object is Created");
	}
	
	public Integer getNoOfpaperProduced() {
		return noOfpaperProduced;
	}

	public void setNoOfpaperProduced(Integer noOfpaperProduced) {
		this.noOfpaperProduced = noOfpaperProduced;
	}

	public boolean isPaperAvailable() {
		return isPaperAvailable;
	}

	public void setPaperAvailable(boolean isPaperAvailable) {
		this.isPaperAvailable = isPaperAvailable;
	}

	public TreeBean getTreeBean() {
		return treeBean;
	}

	public void setTreeBean(TreeBean treeBean) {
		this.treeBean = treeBean;
	}

	public FactoryBean(Integer noOfpaperProduced, boolean isPaperAvailable) {
		super();
		this.noOfpaperProduced = noOfpaperProduced;
		this.isPaperAvailable = isPaperAvailable;
	}
	@Override
	public String toString() {
		return "FactoryBean [noOfpaperProduced=" + noOfpaperProduced + ", isPaperAvailable=" + isPaperAvailable + "]";
	}
	
	public void createPaper() {
		treeBean.provideWood();
		System.out.println("Papers are Created"); 
	}
	

}
