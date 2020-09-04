import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo1 {

	public static void main(String[] args) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			objectMapper.readValue("",ObjectMapper.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

	}

}
