// Don't understand this char code

class charArith {
	public static void main(String args[]) {
	char th;
	th = 'X';
	System.out.println("th has " + th);
	th ++; //Increment the th, it is possible to increment a char
	System.out.println("th is now " +th);
	th = 90; //we assign th the value Z. HOW??????? Confused!!!
	System.out.println("th is now " +th);
	}
}


/*
Mylabot$ javac chararith.java 
Mylabot$ java charArith

Output:
th has X
th is now Y
th is now Z
*/