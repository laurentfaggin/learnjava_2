package generics_Bounded_Types;

public class MyGenericClass <TypeX extends Number, TypeY> {

	TypeX x;
	TypeY y;
	
	MyGenericClass(TypeX x, TypeY y){
		this.x = x;
		this.y = y;
	}
	
	public TypeX getValueX() {
		return this.x;
	}
	
	public TypeY getValueY() {
		return this.y;
	}
	
}
