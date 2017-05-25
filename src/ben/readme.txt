Hi!

Kurze Erklärung, das meiste steht ja schon in den Kommentaren...



[TreeTestClass]
= main,
hier wird nur eine Instanz von [TreeStruct] angelegt.



[TreeStruct]
beinhaltet lediglich genau ein Objekt, nämlich den Root-Knoten vom Typ [Node].



[Node]
ist die "wichtigste Klasse". Hier werden alle Daten gespeichert.
Momentan beinhaltet [Node] als Daten nur einen int-Wert namens data. Später wäre das aber ein Feld (Spielfeld).
Außerdem könnten später noch weitere Daten dazu kommen (sind auskommentiert) zb. Alpha, Beta, ... irgendwas halt.
[Node] besitzt zusätzlich Methoden um seinem eigenen ArrayList<Node> "children" wieder neue Knoten (Nodes)
hinzuzufügen, zu löschen, und den Baum auszugeben.
Die Methode traverse() (die momentan einfach den Knoten, den Parent-Knoten und die Anzahl seiner Kinder ausgibt),
muss aus irgendeinem Knoten heraus gerufen werden. Logischerweise für den kompletten Baum dann von TreeStruct.Node aus,
siehe main-Funktion ( ts.root.traverse(); )



[Main]
ist nur zum erstellen des Einstiegspunktes da und zum aufruf der addChild-Funktionen... so wird erst
ein Baum ("ts") erstellt, darin dann in einer Schleife 3 Kinder erzeugt und in jedem dieser Kinder in einer weiteren Schleife jeweils
wieder 3 Kinder... siehe Kommentierung im Quelltext... dann wird mit ts.root.traverse die Ausgabe bzw. die Traversierung gestartet.



[IN-ORDER-TRAVERSIERUNG] = erst aktuelles Element ausgeben, dann zum kind; ausgeben; zu dessen Kind, ausgeben; ... usw. (rekursiv)

***************************************************************************************
Reihenfolge hier: *0*, *1*, 4, 5, 6, *2*, 7, 8, 9, *3*, 10, 11, 12
***************************************************************************************
 
                                 root(0)

 		Kind(1)                  Kind(2)                     Kind(3)

Kind(4) Kind(5) Kind(6)   Kind(7) Kind(8) Kind(9)   Kind(10) Kind(11) Kind(12)
 
****************************************************************************************
 
die traverse() Fu. gibt nur jeweils data (Momentan also der Name) des aktuellen Knotens,
den Namen seines Eltern-Knotens und die Anzahl seiner eigenen Kinder aus.
 




[AUSGABE]
sieht wie folgt aus: (data ist hier als "name" verwendet)

data: 0
I am root!
child count: 3

data: 1
parent data: 0
child count: 3

data: 4
parent data: 1
child count: 0

data: 5
parent data: 1
child count: 0

data: 6
parent data: 1
child count: 0

data: 2
parent data: 0
child count: 3

data: 7
parent data: 2
child count: 0

data: 8
parent data: 2
child count: 0

data: 9
parent data: 2
child count: 0

data: 3
parent data: 0
child count: 3

data: 10
parent data: 3
child count: 0

data: 11
parent data: 3
child count: 0

data: 12
parent data: 3
child count: 0

