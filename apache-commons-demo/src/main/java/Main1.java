import org.apache.commons.codec.digest.DigestUtils;

public class Main1 {

	public static void main(String[] args) {
		System.out.println(new String("123456").hashCode());
		System.out.println(new String("123456").hashCode());
		System.out.println(DigestUtils.md5Hex(new String("123456")));
		System.out.println(DigestUtils.md5Hex(new String("123456")));
	}
}
