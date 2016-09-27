package Facade;

public class Application {

	public static void main(String[] args) {
		String clientAdvertisement = "电脑,价格63377,联系电话5059676";
		ClientServerFacade csf = new ClientServerFacade(clientAdvertisement);
		csf.doAdvertisement();
	}

}
