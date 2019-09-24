//HENRY WANG
//8/29/19
//CALL MATH METHODS FROM CALCULATE LIBRARY
//CLIENT/RUNNER CODE

public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(-11));
		System.out.println(Calculate.cube(2));
		System.out.println(Calculate.average(2.0, 4.0));
		System.out.println(Calculate.average(2.0, 4.0, 3.0));
		System.out.println(Calculate.toDegrees((4.0 * 3.14159) / 3));
		System.out.println(Calculate.toRadians(30.0));
		System.out.println((Calculate.discriminant(2, 2, 4)));
		System.out.println((Calculate.toImproperFract(3, 1, 2)));
		System.out.println((Calculate.toMixedNum(7, 2)));
		System.out.println((Calculate.foil(2, 3, 6, -7, "n")));
		System.out.println((Calculate.isDivisibleBy(2, 3)));
		System.out.println((Calculate.absValue(-355556.0)));
		System.out.println((Calculate.max(100, 100)));
		System.out.println((Calculate.max(5, 6, 3)));
		System.out.println((Calculate.round2(3.1415)));
		System.out.println((Calculate.exponent(2, 4)));
		System.out.println((Calculate.factorial(3)));
		System.out.println((Calculate.isPrime(17)));
		System.out.println((Calculate.sqrt(4)));
	}

}
