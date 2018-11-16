package Dekrypyer;

public class DePascal {
	String s;
	public DePascal(String x) {
		this.s=x;
		
	    }
	

	
	public String Getext() {
		//transforming a string in list of int
				int ints[]=new int[s.length()];
				for (int i = 0; i < s.length(); i++) {
				    ints[i] = (s.charAt(i));}
		//ints contain now all my character in int form
				
		boolean trov=false;
		int i=0;
		while(!trov) {
		//from n(n+1)/2
		if((i*i +i)>=((s.length())*2))trov=true;
		else i++;
						}		
		//now DeSierpinski	the code
		int[][] x=DeSierpinski(ints,i);
		x=DeTartaglia(x,i);
		int recode[];
		recode=Taker(x,i);
		return Recode(recode,recode.length);
		
	}



	private int[] Taker(int[][] x, int y) {
	  int asccii[]=new int[(y*y+y)/2+1];
	  int b=0;
		for(int i=0;i<y;i++) {
			for(int j=0;j<(2*y)+1;j++) {
				if (x[i][j]!=0) {asccii[b]=x[i][j];
				                 b++;}}}
			
		return asccii;
				
	}



	private int[][] DeSierpinski(int[] ints,int y) {
		
		int x[][];
		x=new int [y] [(2*y)+1] ; 
		int i=0;
		int din=0;
		while(i<y) {
			
			//use ins for how much i have to insert  use /pos for the ofset of position
			int ins=i+1;
			      int pos=i;
			     while(ins>0) {
			    	if((y-pos)%2==0) { x[i][y-pos]=ints[din];
			    	                   din++;}
			    	 ins=ins-1;
			    	 pos=pos-2;
			    	 }
			 i++;}
	   i=0;
		
		while(i<y) {
			
			//use ins for how much i have to insert  use /pos for the ofset of position
			     int ins=i+1;
			      int pos=i;
			     while(ins>0) {
			    	if((y-pos)%2!=0) { x[i][y-pos]=ints[din];
			    	                   din++;}
			    	 ins=ins-1;
			    	 pos=pos-2;
			    	 }
			 i++;}
		
		
		
		
		 
			

		
		return x;
		
			
	}
	
	private int[][] DeTartaglia(int[][] x, int y) {
		int pos;	
		for(int i=y-1;i>=0;i--) {
		for (pos=(y*2);pos>=0;pos--) {
			if(x[i][pos]!=0) {		
		      if(i==0)x[i][pos]=x[i][pos];
		      else {x[i][pos]=x[i][pos]-x[i-1][pos-1]-x[i-1][pos+1];
		      }}}}
	 //ArrayPrintnt(x,y);
		return x;
		
	

   }
	private String Recode(int x[] ,int length) {
		String ret;
		char[] s=new char[length];
		
		for (int i=0;i<length;i++)
			s[i]=(char)x[i];
		ret=new String(s); 
		return ret;
		}
	


}
