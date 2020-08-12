import com.google.common.base.Joiner;

import java.math.BigDecimal;

public class StringUtilsDemo1 {

	public static void main(String[] args) {
		System.out.println(new BigDecimal("0.000").compareTo(new BigDecimal("0.00")));
		System.out.println(new BigDecimal("1.000").compareTo(new BigDecimal("0.00")));
	}

}
