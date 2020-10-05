// Use the Pythagorean theorem to find the length of the hypotenuse given the length of the two opposing sides


class hypot {
	public static void main(String args[]) {
	double x, y, z;

	x = 3;
	y = 4;

	z = Math.sqrt(x*x + y*y);

	System.out.println("Hypotenuse is " +z);

	}
}


/*
Mylabot$ javac hypot.java 
Mylabot$ java hypot

Output:
Hypotenuse is 5.0
*/