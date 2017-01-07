
public class setMap{
	public static void main(String[] args){
		Set<String> keys = mapOfIntegers.keySet();
		Logger l = Logger.getLogger("Test");
		for (String key : keys) {
		  Integer  value = mapOfIntegers.get(key);
		  l.info("Value keyed by '" + key + "' is '" + value + "'");
		}		
	}
}