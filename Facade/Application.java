package Facade;

public class Application {

	public static void main(String[] args) {
		String clientAdvertisement = "����,�۸�63377,��ϵ�绰5059676";
		ClientServerFacade csf = new ClientServerFacade(clientAdvertisement);
		csf.doAdvertisement();
	}

}
