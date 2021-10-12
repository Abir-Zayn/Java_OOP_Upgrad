package accesModifers;

public class person {

	public static void main(String[] args) {
		//Uses of Getter Method.Commonly Getter method is used for read the value of private modifers data.
		
		perr p=new perr("Ankit");
		System.out.println(p.getname());

	}
}
	
	class perr{
	private String name;
	 public perr(String name) {
		 this.name = name;
	 }
	 
	 public String getname() {
		 return name;
	 }
	}
