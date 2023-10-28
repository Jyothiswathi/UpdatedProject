import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Fliter {
	
	
	public static void main(String[] args) {
		List<Product> p2=new ArrayList();
		for(Product product:productList())
		{
		if(product.getsId().equals("1"))	
		{
		System.out.println(product.getsName());	
		}
		}
		//converting into streams
		List<Product> a11 = productList().stream().filter((product)->product.getsId().equals("2")).collect(Collectors.toList());

	System.out.println(a11.get(0));
	
	}

	public static List<Product> productList() {
		List<Product> p=new ArrayList<Product>();
		p.add(new Product("joy","1"));
		p.add(new Product("swathi","2"));
		return p;


	}

}
