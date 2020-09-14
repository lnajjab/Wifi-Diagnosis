import java.util.Scanner;

/* 
  The class WifiDiagnosis provides the user with an algorithm to solve any wifi problems they might have.
 */
public class WifiDiagnosis {

	public static void main(String[] args) {
		System.out.println("-----------------------------------");
		System.out.println("Wifi Issues Assisstant");
		System.out.println("-----------------------------------");
		System.out.println("So you're having wifi troubles!\nNot to worry, follow these instructions and your wifi will be working in no time!");
		System.out.println("Would you like to proceed(y/n)?");
		
		final String PROGRAMMERS_NAME = "Laith Najjab";
		boolean notReady = true;
		Scanner keyboard = new Scanner(System.in);
		String response;
		char responseLetter;
		
		while (notReady)
		{
			response = keyboard.nextLine();
			responseLetter = response.charAt(0);
				
				if (responseLetter == 'y' || responseLetter == 'Y')
				{
					notReady = false;
				}
				else if (responseLetter == 'n'|| responseLetter == 'N')
				{
					System.out.println("Why'd you even start this program?");
					System.out.println("Programmer: " + PROGRAMMERS_NAME);
					System.exit(0);
				}
				else
				{
					System.out.println("Invalid response, try again.");
					notReady = true;
				}
		}
		
		notReady = true; // I must reset notReady after every loop
		System.out.println("First: reboot the computer and attempt to reconnect.\nDid that fix the problem(y/n)?");
		
		while (notReady)
		{
			response = keyboard.nextLine();
			responseLetter = response.charAt(0);
				
				if (responseLetter == 'y' || responseLetter == 'Y')
				{
					System.out.println("Happy to help, see you next time!");
					System.out.println("Programmer: " + PROGRAMMERS_NAME);
					System.exit(0);
				}
				else if (responseLetter == 'n'|| responseLetter == 'N')
				{
					notReady = false;
				}
				else
				{
					System.out.println("Invalid response, try again.");
					notReady = true;
				}
		}
	
		notReady = true;
		System.out.println("Second: reboot the router and attempt to reconnect.\nDid that fix the problem(y/n)?");
		
		while (notReady)
		{
			response = keyboard.nextLine();
			responseLetter = response.charAt(0);
				
				if (responseLetter == 'y' || responseLetter == 'Y')
				{
					System.out.println("Happy to help, see you next time!");
					System.out.println("Programmer: " + PROGRAMMERS_NAME);
					System.exit(0);
				}
				else if (responseLetter == 'n'|| responseLetter == 'N')
				{
					notReady = false;
				}
				else
				{
					System.out.println("Invalid response, try again.");
					notReady = true;
				}
		}
		
		notReady = true;
		System.out.println("Third: Emsure all cables are securely plugged into the router.\nDid that fix the problem(y/n)?");
		
		while (notReady)
		{
			response = keyboard.nextLine();
			responseLetter = response.charAt(0);
				
				if (responseLetter == 'y' || responseLetter == 'Y')
				{
					System.out.println("Happy to help, see you next time!");
					System.out.println("Programmer: " + PROGRAMMERS_NAME);
					System.exit(0);
				}
				else if (responseLetter == 'n'|| responseLetter == 'N')
				{
					notReady = false;
				}
				else
				{
					System.out.println("Invalid response, try again.");
					notReady = true;
				}
		}
		
		notReady = true;
		System.out.println("Fourth: move your computer closer to the router and attempt to reconnect to the Wifi.\nDid that fix the problem(y/n)?");
	
		while (notReady)
		{
			response = keyboard.nextLine();
			responseLetter = response.charAt(0);
				
				if (responseLetter == 'y' || responseLetter == 'Y')
				{
					System.out.println("Happy to help, see you next time!");
					System.out.println("Programmer: " + PROGRAMMERS_NAME);
					System.exit(0);
				}
				else if (responseLetter == 'n'|| responseLetter == 'N')
				{
					notReady = false;
				}
				else
				{
					System.out.println("Invalid response, try again.");
					notReady = true;
				}
		}
	
	System.out.println("Fifth: contact your ISP to solve your Wifi issues.\nHope that fixes it, you're on your own!");
	System.out.println("Programmer: " + PROGRAMMERS_NAME);
	}
	

}
