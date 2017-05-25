package ben;

public class TreeTestClass {

	public static void main(String[] args) {

		
		// Einstiegspunkt TreeStruct mit root-Knoten --> data == 0 ( == name)
		TreeStruct<Node> ts = new TreeStruct<>(0); 

		
		int countVar = 1; // fuer Benennung (data)

		
		// Erstelle 3 Kind-Knoten in root-Knoten-children-ArrayList mit unterschiedlichem data (namen --> countVar)
		for (int i = 0; i < 3; i++) {
			ts.root.addChild(countVar);
			countVar++;
		}

		
		// Erstelle jeweils wieder 3 Kind-Knoten in aktuellem-Knoten-children-ArrayList mit unterschiedlichem data (namen --> countVar)
		for (Node node : ts.root.children)
			for (int i = 0; i < 3; i++) {

				node.addChild(countVar);
				countVar++;

			}
		
		
		ts.root.traverse();	// es wird traverse für den root-Knoten des TreeStruct ts gerufen -> Einstiegspunkt, Wurzel
		
		/*
		 * Traversiere den Baum rekursiv (pre-order Traversierung)
		 * --> erst Knoten ausgeben, dann zum ersten Kind --> ausgeben, dessen Kind --> ausgeben
		 * 
		 * ***************************************************************************************
		 * Reihenfolge hier: *0*, *1*, 4, 5, 6, *2*, 7, 8, 9, *3*, 10, 11, 12
		 * ***************************************************************************************
		 * 
		 * 										root(0)
		 * 
		 * 				Kind(1)					Kind(2)						Kind(3)
		 * 
		 * 	Kind(4) Kind(5) Kind(6) 	Kind(7) Kind(8) Kind(9)		Kind(10) Kind(11) Kind(12)
		 * 
		 * ****************************************************************************************
		 * 
		 * die traverse() Fu. gibt nur jeweils data (Momentan also der Name) des aktuellen Knotens,
		 * den Namen seines Eltern-Knotens und die Anzahl seiner eigenen Kinder aus.
		 * 
		 */
		
	}

}
