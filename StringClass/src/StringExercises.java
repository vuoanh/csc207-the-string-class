import java.util.Scanner;

public class StringExercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(forgivingPrompt("Hi?"));
		System.out.println(parseName("Turing,Alan,Mathison"));
		System.out.println(add("  0 + 8+6     + 9+3"));
	}

	static boolean forgivingPrompt (String question){
		Scanner input = new Scanner (System.in);
		while (true){
			System.out.println (question);
			System.out.print ("Yes or No? ");
			String response  = input.nextLine().trim().toLowerCase();
			if (response.equals("y") 
					|| response.equals("yep") 
					|| response.equals("yes"))
				return true;
			else if (response.equals("n") 
					|| response.equals("no") 
					|| response.equals("nope"))
				return false;
		}
	}

	static String parseName (String s){
		String [] name = s.split(",");
		return name[1] + " " + name[2] + " " + name[0] + " ";		
	}
	
	static int add(String line) {
		int sum = 0;
		String [] equation = line.split("\\+");
		for (int i = 0; i < equation.length; i++)
			sum += Integer.parseInt(equation[i].trim());
		return sum;
	}
}