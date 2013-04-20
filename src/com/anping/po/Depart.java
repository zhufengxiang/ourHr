package com.anping.po;

import java.util.HashSet;
import java.util.Set;

public class Depart {
	private Integer id;
	private String text;
	private int leaf;
	private int checked;
	private int expanded;
	private int expandable;
	private String url;
	private Set<Depart> children = new HashSet<Depart>();
	private Depart parent;
	private int sort;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getLeaf() {
		return leaf;
	}

	public void setLeaf(int leaf) {
		this.leaf = leaf;
	}

	public int getChecked() {
		return checked;
	}

	public void setChecked(int checked) {
		this.checked = checked;
	}

	public int getExpanded() {
		return expanded;
	}

	public void setExpanded(int expanded) {
		this.expanded = expanded;
	}

	public int getExpandable() {
		return expandable;
	}

	public void setExpandable(int expandable) {
		this.expandable = expandable;
	}

	public Set<Depart> getChildren() {
		return children;
	}

	public void setChildren(Set<Depart> children) {
		this.children = children;
	}

	public Depart getParent() {
		return parent;
	}

	public void setParent(Depart parent) {
		this.parent = parent;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

}
