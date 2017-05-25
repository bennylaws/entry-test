package ben;

import java.util.ArrayList;

public class TreeStruct<T> { 								

	Node root; 												// Root Node (Einstiegspunkt)

	public TreeStruct(int rootData) {

		root = new Node(); 									// construct Node
		root.data = rootData; 								// data (momentan int, später zb. Spielfeld...)
		root.parent = null;									// root Knoten hat keinen Eltern-Knoten, daher null
		root.children = new ArrayList<Node>(); 				// ArrayList fuer beliebig viele Kinder
		
	}														
}