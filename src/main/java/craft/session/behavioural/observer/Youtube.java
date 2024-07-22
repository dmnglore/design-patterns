package craft.session.behavioural.observer;

public class Youtube {
	
	public static void main(String args[]) {
		
		Channel craft = new Channel();
		
		Subscriber s1 = new Subscriber("Akshay");
		Subscriber s2 = new Subscriber("Raj");
		Subscriber s3 = new Subscriber("Abhay");
		Subscriber s4 = new Subscriber("Meera");
		Subscriber s5 = new Subscriber("Ganesh");
		
		craft.subscribe(s1);
		craft.subscribe(s2);
		craft.subscribe(s3);
		craft.subscribe(s4);
		craft.subscribe(s5);
		
		
		//craft.unSubscribe(s3);

		s1.subscribeChannel(craft);
		s2.subscribeChannel(craft);
		s3.subscribeChannel(craft);
		s4.subscribeChannel(craft);
		s5.subscribeChannel(craft);
		
		craft.upload("Why Software Craftmanship??");
	}

}
