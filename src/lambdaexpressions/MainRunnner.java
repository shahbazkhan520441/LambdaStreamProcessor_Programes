package lambdaexpressions;

public class MainRunnner {
	class A extends MainRunnner{
		static {
			System.out.println("static block");
		}
	}

	public static void main(String[] args) {
		MainRunnner m=new MainRunnner();
		m.new A();
		Messageable msg=new Messageable() {

			@Override
			public void printMessage() {
				Inforamtion.displayinfo();
			}

		};
		msg.printMessage();


	}

}

