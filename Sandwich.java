/**
 * Helper class providing sandwich-related utilities
 */
public class Sandwich {
	/**
	 * list of sandwiches
	 */
	private static final String[] sandwiches = new String[]{"hoagie",
		"footlong","ham and cheese","sub"};
	/**
	 * Check if sandwich
	 * @param food String to check if is a sandwich
	 * @return true if food is a sandwich else false
	 */
	public static boolean isSandwich(String food){
		//at first there is no sandwich
		boolean contains = false;
		for(String sandwich : sandwiches){
			//if food matches a sandwich then mark true 
			contains |= food.equals(sandwich); 
		}
		return contains;
	}
}

