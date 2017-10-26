import java.util.Scanner;
/**
 *
 * @author DassinRock
 */
public class GuessNumber {
       static  String name;
      
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
                                                Scanner sc = new Scanner(System.in);
		int nbre_secret, nbre_user, score=100, a=5;
		nbre_secret = (int) (Math.random() * 999) + 1; // de 1 à 1000
                                                 
		System.out.println("Bienvenu dans GuessNumber");
                                                System.out.print("Entrer votre pseudo: ");
                                                  name = sc.nextLine();


                
		do{
			System.out.println("\nDevinez un nombre entier ( entre 1 et 1000): ");
				nbre_user = sc.nextInt();
				score--;

			if( nbre_user == nbre_secret ){
				//System.out.println("Felicitations vous l'avez devine !!! Votre score est "+score);
				System.out.println("Felicitations " + afficherName() + "." + "\nVotre score: " + score);
			} else if( nbre_user > nbre_secret ){
				System.out.println("Votre nombre est trop grand ! \nReessayez encore!!!");
			} else {
				System.out.println("Votre nombre est trop petit ! \nReessayez encore!!!");
			}
		} while( nbre_user != nbre_secret );
    }
        public static String afficherName(){
        return name;
    }
    
} 