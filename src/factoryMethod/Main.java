package factoryMethod;

public class Main {

	public static void main(String[] args) {
		Factory factory = new IdCardFactory();
		Product card1 = factory.create("田中");
		Product card2 = factory.create("鈴木");
		Product card3 = factory.create("佐藤");
		card1.use();
		card2.use();
		card3.use();

	}

}
