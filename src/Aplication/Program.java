package Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import Entidades.Usuario;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Usuario> litUs = new ArrayList<>(); 
		List<Boolean> lno = new ArrayList<>();  
		
		Scanner sc = new Scanner (System.in ); 
		boolean  cas = true ; 
		
		while (cas ) {
			
		
			System.out.println("qual e seu nome ? ");
			String nome = sc.next(); 
			
			sc.nextLine();
			System.out.println("Qual a sua idade ? ");
			Integer idade = sc.nextInt();
			
			sc.nextLine();
			System.out.println("Qual seu email ");
			String email = sc.next();
			
			litUs.add(new Usuario (nome , idade , email )); 
			System.out.println("Continuar [s] / [n] ? ");
			char res = sc.next().charAt(0); 
			
			if (res == 's' ) {
				cas = true ; 
			}else 
				cas = false ; 
		}
		
		
		String nom = "maria"; 
		
		  lno= litUs.stream().map(x -> x.getNome() == nom ).collect(Collectors.toList()); 
		
		
		
		
		
		/*
		String msg = "Ola tudo bem ? "; 
		System.out.println(msg);
		
		char resp = sc.next().charAt(0); 
		
		
		*/
		
	}

}
