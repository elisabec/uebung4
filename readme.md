# Übung 4
Bitte forken Sie sich das Repository. In ihren Fork checken Sie bitte den Quellcode ihrer Lösung ein. Die Fragen können Sie in einer einfachen Textdatei beantworten oder auch gerne direkt in der readme.md einfügen (aber bitte kenntlich machen. Also markieren!). Die Lösungen zu den Diagrammen checken Sie bitte als separate Bilder ein. Der Link zu ihrem Repository mit der Angabe ihres letzten Commits (der Hash) ist bis zur Abgabe per Mail einzureichen.

Viel Erfolg!


## Aufgabe 1
Entwerfen Sie ein Anwendungsfalldiagramm zu der folgenden Beschreibung:
In einem Kino kann ein Gast Kinokarten an der Kasse kaufen, die vorbestellt sein könnten. Außerdem
ist es möglich Popcorn und Getränke zu bestellen. Danach bezahlt der Kunde beim Kassierer die
Rechnung. Es ist auch möglich mit Kreditkarte zu bezahlen, welche bei Bedarf einer automatischen
Prüfung unterzogen werden kann.

## Aufgabe 2
Entwerfen Sie ein Zustandsdiagramm, das folgenden Sachverhalt über die Bestellung eines Blumenstraußes
über das Internet beschreibt:
Die über das Internet aufgegebenen Bestellungen werden zuerst vom Kundencenter überprüft. Sind
die Bestelldaten nicht korrekt oder ist die Bestellung nicht plausibel, so nimmt das Kundencenter mit
dem entsprechenden Kunden Kontakt auf, um die offenen Fragen zu klären. Ist mit der Bestellung alles
in Ordnung, bzw. sind die offenen Fragen geklärt, dann stellt die Floristin mit Hilfe der Bestelldaten
den Strauß zusammen. Sobald der Strauÿ fertig ist, wird er vom Lieferdienst an die auf der Bestellung
vermerkte Adresse geliefert.
file:///Users/Elisa/git/uebung4/A1_2.JPG
### Entwerfen Sie zu diesem Beispiel auch ein Aktivitätsdiagramm. Erkennen Sie die Unterschiede?
file:///Users/Elisa/git/uebung4/Aktivit%C3%A4tsdiagramm.JPG
## Aufgabe 3
Welche der folgenden Aussagen über ein Interface ist korrekt?
1. Ein Interface kann private Attribute besitzen
falsche; ein Interface kann nur nicht private Attribute bestizen, weil private Attribute nur in der Klasse selber verwendet werden darf. In einem Interface werden Methoden aber nie definiert, sondern nur ausgeführt; folgich wäre private Attribute nirgends verwendbar.
2. Ein Interface kann andere Interfaces redefinieren
Nein, Interface kann kein anderes Interface implementieren und somit nicht redefinieren. Ich denke es liegt an der Vererbungslogik. Ein Interface ist eine Art abstrakte Klasse, die also keine Objekte erstellen kann. Es erben aber nur Objekte und keine KLassen? 
3. Alle Merkmale eines Interface müssen die Sichtbarkeit "private" haben
Falsch. Gibt es einen Unterschied zur Frage 1? Attribute sind die Merkmale, die ein Objekt von einem anderen unterscheiden. Somit gleiche Argumentation wie in Frage 1.
4. Ein Interface kann keine Attribute haben
Richtig.

## Aufgabe 4
Welche Aussagen sind korrekt?
1. An Interface may be implemented by multiple classifiers, but one classifier may only implement one interface.
2. An Interface may be implemented by multiple classifiers, and one classifier may implement multiple interfaces.
3. An interface may be implemented by at most one classifier, and one classifier may implement at most one interface.
4. An interface may be implemented by at most one classifier, but one classifier may implement multiple interfaces.

## Aufgabe 5
Geben Sie in der folgenden Abbildung die Bezeichnungen der dargestellten Elemente an.
![Aufgabe 5](https://github.com/Reitz86/uebung4/raw/master/aufgabe5.JPG)
1 abstrakte Klasse
2 Rolle 
3 Aggregation
4 Klassenname
5 Klasse
6 Generalisierung
7 gerichtete Assoziation
8 Attribut
9 Multiplizität
10 Komposition
11 Assoziation
12 Operation
13 Stereotyp


## Aufgabe 6
Welche der folgenden Aussagen ist korrekt?
![Aufgabe 6](https://github.com/Reitz86/uebung4/raw/master/aufgabe6.JPG)

1. Sobald w zerstört wird, dann wird auch z zerstört.
falsch
2. Sobald z zerstört wird, dann wird auch w zerstört.
richig
3. Zu einem bestimmten Zeitpunkt kann eine Instanz von z in genau einer Instanz von w enthalten sein.
richtig
4. Zu einem bestimmten Zeitpunkt kann eine Instanz von z in mehreren Instanzen von w enthalten sein.
falsch, denn w erstellt explizit nur die Instanzen von z, die w braucht. 
## Aufgabe 7
Schauen Sie sich die Java Dateien im Ordner RobotAdapter an: Die Spielfiguren in einem Computerspiel müssen alle das Interface Spieler implementieren. Die Klasse Human tut dies. Nun hat eine Zulieferfirma den Code für einen Roboter geschrieben (Robot.java). Leider haben Sie auf diesen keinen Einfluss und müssen den Roboter so in ihr Spiel integrieren. Welches Pattern eignet sich dafür? Implementieren Sie den entsprechenden Code.

# Zusätzliche Materialien (wird nach und nach erweitert, bis alle Inhalte die keine Folien haben hier vorhanden sind. Daher immer wieder reinschauen)
## Adapter Pattern
1. Einfache Einführung als Video: https://www.video2brain.com/de/tutorial/passt-schon-adapter
2. Technische Beschreibung mit Beispielen (Folie 47-50): https://homepages.fhv.at/hv/Semester4/OOAD/Patterns.pdf

## Observer Pattern
1. Technische Beschreibung mit Beispielen (Folie 35-46): https://homepages.fhv.at/hv/Semester4/OOAD/Patterns.pdf

## Factory Pattern
1. Technische Beschreibung mit Beispielen (Folie 75-83): https://homepages.fhv.at/hv/Semester4/OOAD/Patterns.pdf

