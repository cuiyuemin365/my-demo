import com.google.common.base.Joiner;

public class StringUtilsDemo {

	public static void main(String[] args) {
		System.out.println(Joiner.on("-").skipNulls().join(null, "1234"));
	}

}
