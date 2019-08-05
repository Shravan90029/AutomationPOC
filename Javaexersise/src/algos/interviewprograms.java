package algos;

public class interviewprograms {
	
	public static void stringfunct() {
		String abc= "shravan";
		StringBuilder reversestring = new StringBuilder();
		reversestring.append(abc);
	System.out.println(reversestring.reverse());
	
	String reverse2="";
	for (int i=0;i<abc.length();i++) {
		reverse2=reverse2+abc.charAt(i);
		}
	System.out.println(reverse2);
	}
	
	
	public static void numberswap() {
		int x=2;
		int y=3;
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("x="+x+"y="+y);
	}

	
	public static void prime() {
		int n=7;
		if (n==0||n==1) {
			System.out.println(n+"n is not a prime number");
		}else {
			for (int i=2;i<=(n/2);i++) {
			if (n%i==0) {
				System.out.println( n+ "is not a prime number");
				break;
			}else {
				System.out.println(n+"is a prime number");
				break;

			}
		
			}
		}
	}
	
	public static void duplicatechar() {
		String duplicate="shravan";
		char[] abc=duplicate.toCharArray();
		for (int i=0;i<duplicate.length();i++) {
			for (int j=i+1;j<duplicate.length();j++) {
				if (abc[i]==abc[j]) {
					System.out.println("string has duplicate characters");
					break;
				}
			}
			
		}
	}


		
		public static void secondlarget() {
			int arr[]= {10,20,30,40,50,60};
			int largest =arr[0];
			int secondlar=arr[1];
			for (int i=0;i<arr.length;i++) {
				if(arr[i]>largest) {
					secondlar=largest;
					largest=arr[i];
				}else if(arr[i]>secondlar) {
					secondlar=arr[i];
				}
			}
			System.out.println("largets=="+largest+"secondlargest"+secondlar);
		}
		
		public static void stringfun() {
			String abc= "welcome to home";
			String abc1="";
			abc1=abc.replaceAll("\\s", "");
			System.out.println(abc1);
		}
		
		public static void main(String[] args) {
		
		//numberswap();
		//prime();
		//duplicatechar();
		//secondlarget();
		stringfun();
	}
	
}
