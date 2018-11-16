package Encrypter;



public class Pascal {
	Boolean trov=false;
	String a;
	int dim;
	int i =0;
	String keyd;
	
	public Pascal(String  a) {
		this.a =a;
		dim =a.length();
		while(!trov) {
			//from n(n+1)/2
			if((i*i +i)>(dim*2))trov=true;
			else i++;
			}
		int diff=((i*i+i)/2)-dim;
        String s=new String(new char[diff]).replace("\0", " ");
        a=a+s;
        dim=a.length();
        this.keyd=Coding(a,dim,i);
				
	}
	
	
	private String Coding(String mes, int dim,int y) {
		//create array of value to use ;
		int x[][];
		x=new int[y][2*y+1] ;
		//transforming a string in list of int
		int ints[]=new int[mes.length()];
		for (int i = 0; i < mes.length(); i++) {
		    ints[i] = (mes.charAt(i));}
		//placing the triangle in 2d array
		x=Triangola(ints,x,y,dim);
		//Appling Tartaglia (another name to pascal )
		Tartaglia(x,y);
		//In Sierpinski triangle, the characters at the odd positions are written first
		//and then the even position characters. 
		int recode[];
		recode=Sierpinski(x,y);
		//finaly recoding and give the string ;
		return Recode(recode,recode.length);
		
			
		
		
	}


	private String Recode(int x[] ,int length) {
		String ret;
		char[] s=new char[length];
		
		for (int i=0;i<length;i++)
			s[i]=(char)x[i];
		ret=new String(s); 
		return ret;
		}
		
	

//   some problem here think now everything sounds good
	private int[] Sierpinski(int[][] x, int y) {
		
		int[] back= new int[((y*y+y)/2)];
		int pos=0;
		
		for(int i=0;i<y;i++) {
			for(int j=0;j<((y*2)+1);j=j+2) {
				if(x[i][j]!=0) {back[pos]=x[i][j];
				                pos++;}}}
				
		for(int i=0;i<y;i++) {
			for(int j=1;j<((y*2)+1);j=j+2) {
				if(x[i][j]!=0) {back[pos]=x[i][j];
				                pos++;}}}
				
				
	 return back;
	   
			}


	private int[][]Tartaglia(int[][] x, int y) {
		
		int pos;	
		for(int i=0;i<y;i++) {
		for (pos=0;pos<(y*2+1);pos++) {
			if(x[i][pos]!=0) {		
		      if(i==0)x[i][pos]=x[i][pos];
		      else x[i][pos]=x[i][pos]+x[i-1][pos-1]+x[i-1][pos+1];
		      }}}
		
		return x;
		
	}
		
	


	private int[][] Triangola(int[] ints, int[][] x, int y,int dim) {
		int i=0;
		int din=0;
		while(i<y) {
			if (i==0) {x[0][y]=ints[0];
			         din++;}
			//use ins for how much i have to insert  use /pos for the ofset of position
			else {int ins=i+1;
			      int pos=i;
			     while(ins>0) {
			    	 x[i][y-pos]=ints[din];
			    	 ins=ins-1;
			    	 pos=pos-2;
			    	 din++;}}
			 i++;}
		return x;
			    	 
			    	 
			    	 
			     }
				
			
		
	
		
	


	public String GetKeyd() {
        return this.keyd;

	    }
	
	
	

}
