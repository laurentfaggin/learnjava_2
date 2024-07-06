package generics2;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		
		
		MyGenericClass <Integer> myInt = new MyGenericClass <> (1);
		MyGenericClass <Double> myDouble= new MyGenericClass <> (3.14);
		MyGenericClass <Character> myChar = new MyGenericClass <> ('@');
		MyGenericClass <String> myString = new MyGenericClass <> ("Hello");
		
		MyGenericClass2Parameters <Integer, Double> myIntAndDouble = new MyGenericClass2Parameters <> (1, 3.14);
		MyGenericClass2Parameters <Integer, Integer> twoIntegers= new MyGenericClass2Parameters <> (1,9);
		MyGenericClass2Parameters <Double, Double> twoDoubles = new MyGenericClass2Parameters <> (1.01, 2.02);
		
		
		// la classe generique avec deux parametres est similaire a la classe hashmap.
		HashMap <Integer, String> users = new HashMap<>();
		
		System.out.println("############### un parametre  ###############");
		System.out.println(myInt.getValue());
		System.out.println(myDouble.getValue());
		System.out.println(myChar.getValue());
		System.out.println(myString.getValue());
		
		System.out.println("############## deux parametres  ##############");
		System.out.println(myIntAndDouble.getValue1());
		System.out.println(myIntAndDouble.getValue2());
		System.out.println(twoIntegers.getValue1());
		System.out.println(twoIntegers.getValue2());
		System.out.println(twoDoubles.getValue1());
		System.out.println(twoDoubles.getValue2());


	}
}
