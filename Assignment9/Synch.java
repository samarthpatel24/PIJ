package assignment_9;

public class Synch {
	public static void main(String[] args) {

		CallMe target = new CallMe();

		Caller ob1 = new Caller(target, "Demon Slayer");
		Caller ob2 = new Caller(target, "Is");
		Caller ob3 = new Caller(target, "Bad");

		ob1.t.start();
		ob2.t.start();
		ob3.t.start();

		try {

			ob1.t.join();
			ob2.t.join();
			ob3.t.join();

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}
}
