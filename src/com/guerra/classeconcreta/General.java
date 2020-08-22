package com.guerra.classeconcreta;

import java.util.ArrayList;
import java.util.List;

import com.guerra.interfaces.IComando;
import com.guerra.interfaces.ISubalterno;

public class General implements IComando{
	
	List<ISubalterno> subalternos = new ArrayList<ISubalterno>();

	@Override
	public void alistarSoldado(ISubalterno subalterno) {
		subalternos.add(subalterno);
		
	}

	@Override
	public void dispensarSoldado(ISubalterno subalterno) {
		subalternos.remove(subalterno);
		
	}

	@Override
	public void fogo() {
		for(ISubalterno subalterno: subalternos) {
			subalterno.atacar();
		}
		
	}

}
