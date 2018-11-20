package es.upm.grise.profundizacion2018.miguelm;

public class MyString {
	
	private int length;
	private String str;
	
	
	//Constructor
	public MyString(String str) {
		this.str = str; 
		this.length = str.length();
	}
	public int compareTo(MyString str2) {
		int menor;
		int diff;
		int res;
		//nodo 1
		menor = Math.min(this.length, str2.length());
		// nodo 2
		for (int i=0; i<menor; i++) {
			int first = this.str.charAt(i);
			int sec = str2.getString().charAt(i);
			// nodo 3
			diff = first - sec;
			// nodo 4
			if (diff!=0) {
				// nodo 5
				return diff;
			}
		}
		// nodo 6
		res =  this.length - str2.length;
		return res;
	}
	
	//Getters y Setters
		public String getString() {
			return this.str;
		}
		public int length() {
			return this.length;
		}

}



