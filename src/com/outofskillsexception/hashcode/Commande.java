package com.outofskillsexception.hashcode;

import java.util.Map;

public class Commande {
	private int id;
	private Map<Item, Integer> demmande;

	public Commande(int id, Map<Item,Integer> items) {
		this.id = id;
		demmande = items;
	}
	
}
