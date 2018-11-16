package Dekrypyer;



public class Dekrypter {
		String s;
		
		public Dekrypter(String s){
		 this.s=s;
		}
	   public String DePascaliT(){
		   DePascal a= new DePascal(s); 
		   return a.Getext();
		  }
}
