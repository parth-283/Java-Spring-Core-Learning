package com.springcore.ci;

import java.util.List;

public class Certi {
	String name;
	List<String> list;

	public Certi(String name, List<String> list) {
		super();
		this.name = name;
		this.list = list;

	}

	@Override
	public String toString() {

		return this.name + " " + this.list;
	}

}
