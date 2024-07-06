package generics_Bounded_Types;

public class Main {

	public static void main(String[] args) {
		
		MyGenericClass <Integer, Integer> myInt = new MyGenericClass <> (1, 9);
		MyGenericClass <Double, Integer> myDouble= new MyGenericClass <> (3.14, 3);
		MyGenericClass <Integer, String> myString = new MyGenericClass <> (1, "Hello");

		// La ligne suivante sera en erreur car la classe generique 
		//exige un parametre de type number en premier parametre
		
		// MyGenericClass <Character, Integer> myChar = new MyGenericClass <> ('@', 3);

	}

}
