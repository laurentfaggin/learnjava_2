package generics2;

public class MyGenericClass2Parameters<TypeX, TypeY> {
	TypeX x;
	TypeY y;
	
	MyGenericClass2Parameters(TypeX x, TypeY y){
		this.x = x;
		this.y = y;
	}
	
	public TypeX getValue1() {
		return this.x;
	}
	
	public TypeY getValue2() {
		return this.y;
	}
}
