package Facade;

public class TypeSeting {
	String advertisement;

	public TypeSeting(String advertisement) {
		this.advertisement = advertisement;
	}
	
	public void typeSeting() {
		System.out.println("����Ű��ʽ:");
		System.out.println("*****************");
		System.out.println(this.advertisement);
		System.out.println("*****************");
	}
	
}
