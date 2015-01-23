# Web-Technologien 
## Projekt: SweetShop
### Team 2: Nina Keller, Svitlana Khomenko

##### Projektbeschreibung
Im Rahmen der Veranstaltung Web-Technologien wurde der Online-Shop „Sweet Shop“ als Projektarbeit umgesetzt. Der Online-Shop ist so aufgebaut, dass der User Produkte aus zwei verschiedenen Kategorien wählen kann, nämlich Torten und Pralinen. 

##### Anforderungsanalyse
Use-Cases
![Use-Cases](app/public/images/Use-Case.jpg)

##### Funktionale Anforderungen
1.	Der User sollte sich registrieren können
2.	Der User sollte sich anmelden und abmelden können.
3.	Der User soll zwischen verschiedenen Kategorien wählen können.
4.	Der User soll einzelne Produkte in den Warenkorb legen können.
5.	Der User soll die Produkte, die sich im Warenkorb befinden, bestellen können.

##### Nichtfunktionale Anforderungen
1.	 Zur Versionsverwaltung soll GIT zum Einsatz kommen 
2.	Auf Clientseite soll HTML, CSS, JavaScript mit JQuery, Responsive Web Design (Bootstrap) eingesetzt werden 
3.	Aus Serverseite soll Java, das Play Framework, SQLite, … benutzt werden  
4.	Zur Kommunikation zwischen Client und Server sollen HTTP GET / POST, AJAX und 
WebSockets verwendet werden 
5.	Die Web-Applikation soll auf Heroku deployed werden

##### Erste Idee / Realisierung
Die erste Idee des Projekts wurde in verschiedenen Mockups dargestellt. 
Die Mockups werden hier mit der tatsächlichen Realisierung verglichen. 

Die Startseite sollte ein Suchfeld, einen Anmelde-Button und einen Warenkorb-Button enthalten. Auf der linken Seite sollen verschiedene Kategorien aufgeführt werden. Den Hauptteil der Startseite soll eine Bilderübersicht der Produkte der verschiedenen Kategorien ausfüllen. 
![Startseite](/public/images/Mockup1.jpg)
Bei der Realisierung der Startseite wurde auf das Suchfeld verzichtet und die Bildübersicht der Produkte der verschiedenen Kategorien wurde durch eine Slideshow ersetzt. 
![Startseite](/nikeller/webt_onlineshop/blob/master/public/images/Screenshot1.jpg)
Die weitere Idee war, dass jedes Produkt einzeln angeklickt werden kann, um auf die Seite des Produktes zu gelangen, auf der mehr Informationen, wie zum Beispiel eine Produktbeschreibung enthalten ist. Dort sollte dann auch ein Button sein, mit dem das Produkt in den Warenkorb gelegt werden kann. 
![Produkt](/nikeller/webt_onlineshop/blob/master/public/images/Mockup2.jpg)
In der Realisierung  können die Produkte jetzt direkt aus der Kategorie in den Warenkorb gelegt werden und müssen nicht noch extra angeklickt werden. 
![Produkt](/nikeller/webt_onlineshop/blob/master/public/images/Screenshot2.jpg)
Im Warenkorb sollten dann die dort hineingelegten Produkte nochmals aufgelistet und der Gesamtpreis ermittelt werden. Hier kann dann entschieden werden, ob noch weiter eingekauft oder zur Kasse gegangen werden soll. 
![Warenkorb](/nikeller/webt_onlineshop/blob/master/public/images/Mockup3.jpg)
Bei der Realisierung des Warenkorbs erscheint jetzt kein Gesamtpreis, der im Warenkorb befindlichen Produkte. Außerdem wurde der Schritt „zur Kasse gehen“ übersprungen. Somit können die Produkte direkt aus dem Warenkorb bestellt werden.
![Warenkorb](/nikeller/webt_onlineshop/blob/master/public/images/Screenshot3.jpg)

#### Architektur
##### Klassendiagramm
![Klassendiagramm](/nikeller/webt_onlineshop/blob/master/public/images/Klassendiagramm.jpg)

##### Verwendete Technologien
In dem Projekt wurden die folgenden Technologien verwendet: HTML5, CSS, JavaScript/JQuery, AJAX mit JSON, Java und WebSockets mit JSON.

##### Einsatz der Technologien
HTML5 und CSS wurden verwendet, um den Inhalt und die Formatierung der Web-Applikation darzustellen. 
JavaScript/JQuery wurden zur dynamischen Manipulation der Web-Applikation verwendet. Dies kam unter anderem auf der Startseite für die Slideshow zur Anwendung. 
AJAX/JSON wurden zum asynchronen Nachladen von Daten verwendet. Realisiert wurde dies beim Registrieren-Formular. Wenn der Benutzer in dem Feld PLZ und Ort die PLZ eintippt, sollen per AJAX Vorschläge für die Eingabe asynchron nachgeladen werden. Die PLZ-Daten sind in einer JSON-Datei enthalten. 
Java wurde für die gesamte Logik verwendet. Zu nennen wären hier…

Mit WebSockets wurde eine Verbindung zwischen dem Webbrowser (Client) und dem Server hergestellt. Implementiert wurde dies um die Verfügbarkeit der Waren darzustellen und zu aktualisieren, ohne dass die Seite neu geladen werden muss. 	
##### Was wurde gelernt?
Umgang mit neuem Framework, Umgang mit Technologien, Wie ein Projekt umgesetzt wird

##### Probleme
Datenbank-Locks und Heroku
