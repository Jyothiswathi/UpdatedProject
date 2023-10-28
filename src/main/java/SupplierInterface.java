import java.time.LocalDateTime;

import com.google.common.base.Supplier;

public class SupplierInterface {

	public static void main(String[] args) {
Supplier<LocalDateTime> supplier=()->LocalDateTime.now();
LocalDateTime a = supplier.get();
System.out.println(a);
	}

}
