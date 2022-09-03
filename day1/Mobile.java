package week1.day1;

public class Mobile {
	public void makeCall() {
		System.out.println("Make a call");
		String mobilemodel="iphone13";
		String mobileweight="170f";
		

	}
	public void sendmessage() {
	System.out.println("Send a message");
    boolean Fullcharged=true;
    int Mobilecost=25000;
	}
	public static void main(String[] args) {
		Mobile obj=new Mobile();
		obj.makeCall();
		obj.sendmessage();
	System.out.println("This is my phone");
	
	}

}
