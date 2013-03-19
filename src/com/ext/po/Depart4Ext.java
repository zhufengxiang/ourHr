package com.ext.po;
 import java.util.HashSet;
 
import java.util.Set;

public class Depart4Ext {
	  private  int   id  ;
       private   String  text ;
      private   boolean  leaf;
//     private   boolean   checked;
     private   boolean    expanded ;
     private   boolean expandable ;
 
     
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public boolean isLeaf() {
		return leaf;
	}
	public void setLeaf(boolean leaf) {
		this.leaf = leaf;
	}
//	public boolean isChecked() {
//		return checked;
//	}
//	public void setChecked(boolean checked) {
//		this.checked = checked;
//	}
	public boolean isExpanded() {
		return expanded;
	}
	public void setExpanded(boolean expanded) {
		this.expanded = expanded;
	}
	public boolean isExpandable() {
		return expandable;
	}
	public void setExpandable(boolean expandable) {
		this.expandable = expandable;
	}
 
	 
	 
      
}

