package com.onixlab.teste;

import java.util.ArrayList;
import java.util.Collection;
//import java.util.HashSet;

public class CadastroDePessoa {
	 private static Collection<Pessoa> pessoas = new ArrayList<>();
	
//	private static Collection<Pessoa> pessoas = new HashSet<>();

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("66156172777", "João Silva");
		
		gravaPessoa(pessoa1);
		
		Pessoa pessoa2 = new Pessoa("66156172777", "João Silva");
		
		gravaPessoa(pessoa2);
		
		
	}

	public static void gravaPessoa(Pessoa pessoa){
		if(pessoas.contains(pessoa)){
			throw new RuntimeException("Erro: pessoa já adicionada. " + pessoa);			
		} else {
			pessoas.add(pessoa);
			System.out.println("Pessoa " + pessoa + " adicionada com sucesso! \n\n");
		}
	}
}
