package snackmounir;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//creation d'une classe main
public class scannerbill {

	public static void main(String[] args) {
//creation de ma liste pour stocker les objets
		ArrayList<Ticket> List1 = new ArrayList<Ticket>();

//initialisation scanner
		Scanner scan = new Scanner(System.in);
		String ordernext = "oui";
		int total = 0;
//		boucle do pour recuperer le produit qtiote et prix par commande
		do {

			System.out.println("quel produit a ete pris ?");
			String product = scan.next();

			System.out.println("combien de part");
			int quantity = scan.nextInt();

			System.out.println("Quel est le prix unitaire ?");
			int price = scan.nextInt();

			int soustotal = quantity * price;
			System.out.println("Souhaitez vous passer une autre commande ?");
			total += soustotal;
			ordernext = scan.next();
			List1.add(new Ticket(product, quantity, price));
//si ordernext est ==oui alors on relance le programme por une new commande			
		} while (ordernext.equals("oui"));

		System.out.println("#################################");
		System.out.println(" ");
		System.out.println("       TICKET DE CAISSE");
		System.out.println(" ");
		System.out.println("#################################");
//on parcour la list pour recup les donnees
		for (Ticket ticket : List1) {
			System.out.println("produits consommés : " + ticket.getProduct());
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("quantitée consommée : " + ticket.getQuantity());
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("prix unitaire: " + ticket.getPrice());
			System.out.println(" ");
			System.out.println(" ");
		}
//ici on imprime le resultat ttal de tte les commades
		System.out.println("-----------------------------------");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("votre addition est de : " + total + " $");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("----------------------------------- ");
		System.out.println(" Snack Mounir vous remercie  ");
		System.out.println(" et vous souhaite une bonne journée !");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("#################################");

	}
}
