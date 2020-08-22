package com.guerra.classeconcreta;

import com.guerra.interfaces.IArma;
import com.guerra.interfaces.ISubalterno;

public class Soldado implements ISubalterno{
	
	private IArma arma;
	private String nome;
	private int pelotao;
	
	public Soldado(String nome, int pelotao) {
		this.nome = nome;
		this.pelotao = pelotao;
	}

	@Override
	public void atacar() {
		String artigoIndefinido = "";
		if(arma.getClass().getSimpleName().endsWith("a")) {
			artigoIndefinido = "uma";
		}
		artigoIndefinido = "um";
		System.out.println("Soldado "+nome+" pelotão "+pelotao+" está usando "+artigoIndefinido+" "+arma.getClass().getSimpleName()  );
		arma.disparar();
		
	}
	
	public void setArma(IArma arma) {
		this.arma = arma;
	}

}
