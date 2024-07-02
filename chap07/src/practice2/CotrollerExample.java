package practice2;

public class CotrollerExample {

	public static void main(String[] args) {
		/*Controller controller = new Controller();
		controller.setService((MemberService)new Service());*/
		
		Controller controller = new Controller();
		controller.setService(new MemberService());
		controller.Service.login();

		controller.setService(new AService());
		controller.Service.login();

	}

}
