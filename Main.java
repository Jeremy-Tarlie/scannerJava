package scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try {			
			// scanner c'est pour entrer des données 
			Scanner userInput = new Scanner(System.in);
			System.out.println("Entrer username");
			
			String userName = userInput.nextLine(); //Lire l'input
			System.out.println("Username is : "+userName);
			
			
			//int Input
			Scanner userInputAge = new Scanner(System.in);
			System.out.println("Enter your age");
			
			//cast into int
			int age = userInputAge.nextInt();
			//Affichage
			System.out.println("Ton age est : " + age);
			
			//Je ferme les scanner car c'est pour liberer la place dans la mémoire
			userInput.close();
			userInputAge.close();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
