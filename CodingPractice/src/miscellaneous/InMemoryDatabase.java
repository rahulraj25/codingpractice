package miscellaneous;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryDatabase {
	
	private Map<String,List<Object>> list = new HashMap<>();
	
	public Object selectRecord(int id, String tableName){
		return "msci";
	}
}
