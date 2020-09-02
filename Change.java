public class Change {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		int ways = NumberOfWaysToMakeChange(15);
		System.out.println(ways);
	}
	public static int NumberOfWaysToMakeChange (int cents) {
		return ChangeWays(cents, 25);	
	}
	public static int ChangeWays (int cents, int max) {
		if (cents == 0) {
			return 1;
		}
		else if (cents >= 25 && max == 25) {
			return ChangeWays(cents - 25, 25) + 
			ChangeWays(cents - 10, 10) + ChangeWays(cents - 5, 5) +
			ChangeWays(cents - 1, 1);
		}
		else if (cents >= 10 && max >= 10) {
			return ChangeWays(cents - 10, 10) +
			ChangeWays(cents - 5, 5) + ChangeWays(cents - 1, 1);
		}
		else if (cents >= 5 && max >= 5) {
			return ChangeWays(cents - 5, 5) +
			ChangeWays(cents - 1, 1);
		}
		else {return 1;}
	}
}
