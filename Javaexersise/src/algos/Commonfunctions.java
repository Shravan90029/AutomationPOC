package algos;

import java.util.UUID;

public class Commonfunctions {

	
	//random number generation
	public static String generateString() {
        String uuid = UUID.randomUUID().toString();
        return "uuid = " + uuid;
    }
	
	public static void main(String[] args)
    {
		System.out.println(generateString());
}
}
