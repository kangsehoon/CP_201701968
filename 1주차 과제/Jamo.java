package sehoon;

public class Jamo {
	public String convo;
	char ch;
	int con=0;
	int vo=0;
	
	public int con() {
		for (int i=0;i<convo.length();i++) {
			ch= convo.charAt(i);
			if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u')
				con++;
		}return con;
	}
	public int vo() {
		for(int i=0; i<convo.length();i++) {
			ch=convo.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				vo++;
		}return vo;
	}
	}

