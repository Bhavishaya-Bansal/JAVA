class practise {

	int getValue() {

		int returnValue = 10;

		try {

			String[] Languages = {

					"Try block",

					"Try block is running"

			};

			System.out.println(Languages[1]);

		} catch (Exception e) {

			System.out.println("Catch Block :" + returnValue);

			return returnValue;

		} finally {

			returnValue += 10;

			System.out.println("Finally Block :" + returnValue);

		}

		return returnValue;

	}

	public static void main(String args[]) {

		practise

		var = new practise();

		System.out.println("Main Block:" +

				var.getValue());

	}
}