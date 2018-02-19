package in.Home;

public class Demo {

	public static void main(String[] args) {

		/*Addition Mthd = new Addition();
		Mthd.add("a", "b");
		Mthd.add(44, 45);
		Mthd.add(44.2, 44.5);

		Substration mthd1 = new Substration();
		mthd1.sub(88.9, 92.4);
		mthd1.sub(66, 77);*/

	}

	class Addition {
		void add(int a, int b) {
			int s = a + b;
			System.out.println("Addition of two numbers:" + s);

		}

		void add(float a, float b) {
			float c = a + b;
			System.out.println(" Addition of two numbers:" + c);

		}

		void add(double a, double b) {
			double e = a + b;
			System.out.println(" Addition of two numbers:" + e);
		}

		void add(String a, String b) {
			String f = a + b;
			System.out.println("Addition of two numbers:" + f);

		}
	}

	class Substration {
		void sub(int a, int b) {
			int d = a - b;
			System.out.println("Substration of two numbers:" + d);

		}

		void sub(float a, float b) {
			float d = a - b;
			System.out.println("Substration of two numbers:" + d);

		}

		void sub(double a, double b) {
			double d = a - b;
			System.out.println("Substration of two numbers:" + d);

		}

	}

}

class Multiplication {
	void mul(int a, int b) {
		int d = a * b;

		System.out.println(" Mulitiplication of two number:" + d);
	}

	void mul(double a, double b) {

		double d = a * b;
		System.out.println(" Mulitiplication of two numbers:" + d);

	}

	void mul(float a, float b) {
		float d = a * b;

	}

}
