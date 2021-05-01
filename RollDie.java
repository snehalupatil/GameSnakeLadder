
public class RollDie {

	public static void main(String[] args) {
		int SIDES =6;
		int position = (int) ((Math.random() * SIDES) + 1);
		System.out.println(position);
	}

}
