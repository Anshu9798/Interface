
public class Test {

	public static void main(String[] args) {
		
		DefaultFormatter n = new DefaultFormatter();
		DecimalFormatter p = new DecimalFormatter();
		BaseTwoFormatter w = new BaseTwoFormatter();
		
		System.out.println(n.format(1000000000));
		System.out.println(p.format(1000000000));
		System.out.println(w.format(15));

	}

}
