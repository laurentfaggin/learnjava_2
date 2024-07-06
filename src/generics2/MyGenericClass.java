package generics2;

public class MyGenericClass <Type> {

	Type t;
	
	MyGenericClass(Type t){
		this.t = t;
	}
	
	public Type getValue() {
		return this.t;
	}
	
}
