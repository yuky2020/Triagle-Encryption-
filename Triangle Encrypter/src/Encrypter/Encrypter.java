package Encrypter;

public class Encrypter {
	String s;
	
	public Encrypter(String s){
	 this.s=s;
	}
   public String PascaliT(){
	   Pascal a= new Pascal(s); 
	   return a.GetKeyd();
	  }
}
