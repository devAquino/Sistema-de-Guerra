package com.guerra.main;

import com.guerra.armas.Bazuca;
import com.guerra.armas.Metralhadora;
import com.guerra.armas.Tanque;
import com.guerra.classeconcreta.General;
import com.guerra.classeconcreta.Soldado;

public class Main {
	
	public static void main(String[] args) {
		
		General general = new General();
		
		Soldado soldado1 = new Soldado("Reginaldo", 1);
		soldado1.setArma(new Metralhadora());
		
		Soldado soldado2 = new Soldado("Jonas", 1);
		soldado2.setArma(new Bazuca());
		
		Soldado soldado3 = new Soldado("Paulo", 2);
		soldado3.setArma(new Tanque());
		
		general.alistarSoldado(soldado1);
		general.alistarSoldado(soldado2);
		general.alistarSoldado(soldado3);
		
		general.fogo();
		
	}

}
