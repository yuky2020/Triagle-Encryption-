package main;

import java.util.Scanner;

import Dekrypyer.Dekrypter;
import Encrypter.Encrypter;


public class Main {
	
	public static void main(String [ ] args)
	{
	      System.out.println("Inserit text");
	      Scanner s=new Scanner(System.in);
	      Encrypter a=new Encrypter(s.nextLine());
	      System.out.println(a.PascaliT());
	      //All full work
	      Dekrypter b=new Dekrypter(a.PascaliT());
	      System.out.println(b.DePascaliT());
	      
	      
	      	

}}
