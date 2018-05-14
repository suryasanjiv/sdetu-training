class urlify{
	static char[] createUrl(char[] url, int trueLength){
		
		int space =0; //space counter
		for (int i=0; i<trueLength; i++){
			if (url[i]==' '){
				space++; //counts space for every ""
			}
		}
		int newLength = trueLength + space*3; // have 3 characters for every space
		char [] newUrl = new char[newLength];
		int index = 0;
		char perc = '%';
		char two = '2';
		char zero = '0';
		for (int j=0; j<newLength; j++){
			if(url[j]==' '){
				//instead of copying over the space
				//the first element will be "%"
				//the second element will be "20"
				newUrl[j+index]=perc;
				newUrl[j+index+1]=two;
				newUrl[j+index+2]=zero;
				index = index+2;
			}
			else{
				newUrl[j+index]=url[j];
			}
		}
		return newUrl;
	}
	public static void main (String [] args){
		char[] stuff={'M','r',' ','J','o','h','n',' ',' '};
		System.out.println(createUrl(stuff, 7));
	}
}