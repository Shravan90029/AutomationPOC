package algos;

public class Algo1 {
	
	//Fibinocci number alogrithm
	
	public static void fibinoci() {
		int f = 0;
        int g = 1;

        for(int i = 1; i <= 10; i++)
        {
            f = f + g;
            g = f - g;
            System.out.print(f + " ");
        }

        System.out.println();
    
	
		
	}
	public static void main(String[] args)
    {
      fibinoci();  
}
}
