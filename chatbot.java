import java.util.Scanner;

/**
 * This class represents a basic AI that will chat with a human user.
 * It isn't very human-like yet...
 * @author Ethan Chung
 * @version 0.1
 */
public class chatbot
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Hi I'm Chatbot. What's your name?");
		String name = s.nextLine();
		
		System.out.println("Nice to meet you, " + name + ", how old are you?");
		int age = s.nextInt(); // leaves the pointer before the new line character
		s.nextLine(); // gets the pointer to the beginning of the next line. always do this after next int or next double
		
		if (age > 40 && age < 100)
		{
			System.out.println("Wow, that's old");
			System.out.println("only " + (100 - age) + " years until you're 100!");
		}
		else
		{
			System.out.println("How long until you turn " + (++age) + "?");
			s.nextLine();
		}
		
		String answer = "anything other than bye";
		while (!answer.equals ("bye") && !answer.equals ("Bye")) // can't use !=
		{
			System.out.println("tell me one of your hobbies (or say \"bye\" to exit)");
			answer = s.nextLine();
		}
	}
}