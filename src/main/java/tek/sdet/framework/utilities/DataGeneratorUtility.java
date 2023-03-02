package tek.sdet.framework.utilities;

import net.datafaker.Faker;

public class DataGeneratorUtility {
	public static void main(String[] args) {
		System.out.println(data("expirationMonth"));
        
        

	}

	public static String data(String input) {
		Faker faker = new Faker();
		
		String outPut = "";
		if(input.equals("firstName")) {
			outPut = faker.name().firstName();
		}else if(input.equals("lastName")) {
			outPut = faker.name().lastName();
		}else if(input.equals("email")) {
			outPut= faker.expression("#{letterify '????.????@gmail.com'}");
		}else if(input.equals("phoneNumber")) {
			outPut = faker.phoneNumber().cellPhone();
		}else if(input.equals("fullName")) {
			outPut = faker.name().fullName();
		}else if(input.equals("streetAddress")) {
			outPut = faker.address().streetAddress();
		}else if (input.equals("city")) {
			outPut = faker.address().city();
		}else if(input.equals("state")) {
			outPut = faker.address().state();
		}else if(input.equals("zipCode")) {
			outPut = faker.address().zipCode();
		}else if(input.equals("country")) {
			outPut = "United States";
		}else if (input.equals("apt")) {
			outPut = faker.address().secondaryAddress();
		}else if(input.equals("cardNumber")) {
			outPut = faker.expression("#{numerify '################'}");
		}else if (input.equals("nameOnCard")) {
			outPut = faker.name().fullName();
		}else if(input.equals("expirationMonth")) {
			outPut = faker.number().digits(1);
		}else if(input.equals("securityCode")) {
			outPut = faker.number().digits(3);
		}else if(input.equals("expirationYear")) {
			outPut= faker.expression("#{numerify '203#'}");
		}
		return outPut;
	}
}
