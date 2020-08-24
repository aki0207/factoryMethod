package factoryMethod;

import java.util.HashMap;

public class IdCardFactory extends Factory {
	private HashMap<Integer, String> database = new HashMap<>();
	private int serial = 1;


	@Override
	protected synchronized Product createProduct(String owner) {
		return new IdCard(owner, serial++);
	}

	@Override
	protected void registerProduct(Product product) {
		IdCard card = (IdCard)product;
		database.put(card.getSerial(), card.getOwner());
	}

	public HashMap<Integer, String> getDatabase() {
		return database;
	}

}
