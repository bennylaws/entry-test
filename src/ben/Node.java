package ben;

import java.util.ArrayList;

public class Node {
	
	int data; // hier spaeter Feld statt int
	Node parent;
	ArrayList<Node> children;
	
	public Node() {
		children = new ArrayList<>();
	}

//	private int treeLevel;
//	private int childNo;

	// int alpha;		DIESE DATEN koennten zb spaeter fuer die Bewertung genutzt werden
	// int beta;
	// int choice;
	
	
// ADD Node
public void addChild(int data) {

	Node n = new Node();
	n.parent = this;
	n.data = data;
	
	this.children.add(n);							

}

// loeschen irgendeines childs - muss aus der jeweiligen Tiefe,
// also vom PARENT des childs, das geloescht werden soll gerufen werden!
public void removeChild(int index) {

	this.children.remove(index);					
}

// Traversierung, hier erstmal nur Test-Ausgaben der Daten, parent nodes und Anzahl children
public void traverse() {							
	
		// AUSGABE des AKTUELLEN Knotens (data, parent-data, child Zahl)
		System.out.println("data: " + this.data);
		
		// pruefe, ob Eltern-Knoten vorhanden (wichtig, sonst ggf. null pointer Exception beim Zugriff auf parent)
		if (this.parent != null)
			System.out.println("parent data: " + this.parent.data);
		else
			System.out.println("I am root!");
		
		System.out.println("child count: " + this.children.size() + "\n");

		for (Node node : this.children) {

			if (this.children.isEmpty())
				return;

			/* HIER Rekursion in PRE ORDER Reihenfolge (Gib Daten aus, siehe System.out.println()
			 * und rufe dann für jedes Deiner Kinder wieder diese Funktion auf (siehe erweiterte FOR-Schleife und dann node.traverse();)
			 * Rekursion wird verlassen, wenn child-ArrayList leer ist, es also keine tiefere Ebene im Baum gibt (siehe IF).
			 */
			node.traverse();

		}

	}
}
