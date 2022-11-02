package com.str;

public class StringRandomPasswordCreation {
	
	
	public static String getDefaultPassword() {
		final int n=5;
		
		String alphaNumericString="ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"@#$&*"+"0123456789"
		+"abcdefghijklmnopqrstuvwxyz";
		
		StringBuffer br=new StringBuffer(n);
		
		for(int i=0;i<n;i++) {
			
			int index=(int) (alphaNumericString.length()*Math.random());
			
			br.append(alphaNumericString.charAt(index));
		}
		
		return br.toString();
	}
	
	public static void main(String[] args) {
		
		System.out.print(getDefaultPassword());
	}

}
