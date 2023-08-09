package zoodb;

public class QueryCreator extends SQLCon {
	public static void selectAll() {
		new SQLCon("SELECT * FROM table1");
	}

	public static void selectAnimal(String animal) {
		new SQLCon("SELECT Animal FROM table1 WHERE Animal = '" + animal + "';");
	}
}
