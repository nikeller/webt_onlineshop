BEGIN TRANSACTION;
CREATE TABLE "Torte" (
	`id`	INTEGER PRIMARY KEY,
	`name`	varchar(50) NOT NULL,
	`pfad`	varchar(100) NOT NULL,
	`beschr`	varchar(150),
	`kategorie_id`	varchar(10) NOT NULL,
	`preis`	decimal(4,2) NOT NULL,
	`bestand`	INTEGER NOT NULL
);
INSERT INTO `Torte` VALUES(1, 'Goldene Freude','images/Palissaden.jpg','Hochzeitstorte', 'T', 35.0, 30);
INSERT INTO `Torte` VALUES(2, 'Himmlische Torte','/assets/images/Torte_002.jpg','Passend zur Hochzeit, Geburtstag', 'T', 33.00, 36);
INSERT INTO `Torte` VALUES(3, 'Hochzeitstorte','/assets/images/Torte_003.jpg','Dreistöckige Torte für besondere Anlässe', 'T', 70.00, 53);
INSERT INTO `Torte` VALUES(4, 'Nusstorte','/assets/images/Torte_004.jpg','Zum Frühstück oder Geburtstag', 'T', 10.00, 50);
INSERT INTO `Torte` VALUES(5, 'Wuff-Wuff','/assets/images/Torte_005.jpg','Passend zum Kindergeburtstag', 'T', 25.00, 42);

CREATE TABLE "Praline" (
	`id`	INTEGER PRIMARY KEY,
	`name`	varchar(50) NOT NULL,
	`pfad`	varchar(100) NOT NULL,
	`beschr`	varchar(150),
	`kategorie_id`	varchar(10) NOT NULL,
	`preis`	decimal(4,2) NOT NULL,
	`bestand`	INTEGER NOT NULL
);
INSERT INTO `Praline` VALUES(6, 'Pralinen aus Milchschokolade','/assets/images/Praline_001.jpg','Für unsere Lieblinge', 'P', 10.00, 70);
INSERT INTO `Praline` VALUES(7, 'Marmorpralinen','/assets/images/Praline_002.jpg','Für unsere Lieblinge', 'P', 8.0, 47);
INSERT INTO `Praline` VALUES(8, 'Pralinen aus weisser Schokolade','/assets/images/Praline_003.jpg','Für unsere Lieblinge', 'P', 9.00, 49);
INSERT INTO `Praline` VALUES(9, 'Pralinen-Assorti','/assets/images/Praline_004.jpg','Für unsere Lieblinge', 'P', 12.00, 36);
INSERT INTO `Praline` VALUES(10, 'Assorti','/assets/images/Praline_005.jpg','Für unsere Lieblinge', 'P', 11.00, 40);

CREATE TABLE "User" (
	`email`	varchar(50) PRIMARY KEY,
	`passwort` varchar(50) NOT NULL,
	`vorname`	varchar(50) NOT NULL,
	`nachname`	varchar(50) NOT NULL,
	`adresse` varchar(100) NOT NULL,
	`PLZ` INTEGER NOT NULL
);

CREATE TABLE "Warenkorb" (
	`id`	INTEGER  PRIMARY KEY AUTOINCREMENT,
	`email` varchar(100) NOT NULL,
	`ware` varchar(100) NOT NULL,
	`preis`	decimal(4,2) NOT NULL
);

;
;
COMMIT;