package com.example.proba;

public class Filtro {
	
	private static boolean playas;
	private static boolean tiendas;
	private static boolean algo;
	
	public static boolean isTiendas() {
		return tiendas;
	}
	public static void setTiendas(boolean tiendas) {
		Filtro.tiendas = tiendas;
	}
	
	public static boolean isPlayas() {
		return playas;
	}
	public static void setPlayas(boolean playas) {
		Filtro.playas = playas;
	}
	
	public static boolean isAlgo() {
		return algo;
	}
	public static void setAlgo(boolean algo) {
		Filtro.algo = algo;
	}

}
