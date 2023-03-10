-- -----------------------------------------------------------------------------
-- - Reconstruction de la base de données
-- -----------------------------------------------------------------------------
DROP DATABASE IF EXISTS Games;
CREATE DATABASE Games;
USE Games;

-- -----------------------------------------------------------------------------
-- - Construction de la tables des articles
-- -----------------------------------------------------------------------------
CREATE TABLE T_Articles (
	IdArticle				int(4)		PRIMARY KEY AUTO_INCREMENT,
	Description				varchar(100)NOT NULL,
	ArtName					varchar(30)	NOT NULL,
	UnitaryPrice			float(8)	NOT NULL DEFAULT 0,
) ENGINE = InnoDB;

-- -----------------------------------------------------------------------------
-- - Construction de la table des catégories
-- -----------------------------------------------------------------------------
CREATE TABLE T_Categories (
	IdCategory 				INT(4) 		 PRIMARY KEY AUTO_INCREMENT,
	Description 			VARCHAR(100) NOT NULL,
	CatName 				VARCHAR(30)  NOT NULL,
	Ranking					VARCHAR(30)  NOT NULL
) ENGINE = InnoDB;

-- -----------------------------------------------------------------------------
-- - Construction de la table des développeurs
-- -----------------------------------------------------------------------------
CREATE TABLE T_Developers (
	IdDeveloper 			INT(4) 		 PRIMARY KEY AUTO_INCREMENT,
	Description 			VARCHAR(100) NOT NULL,
	DevName 				VARCHAR(30)  NOT NULL,
	Location				VARCHAR(30)  NOT NULL
) ENGINE = InnoDB;

-- -----------------------------------------------------------------------------
-- - Insertion des articles dans la table
-- -----------------------------------------------------------------------------
INSERT INTO T_Articles (Description, ArtName, UnitaryPrice) VALUES ();
INSERT INTO T_Articles (Description, ArtName, UnitaryPrice) VALUES ();
INSERT INTO T_Articles (Description, ArtName, UnitaryPrice) VALUES ();
INSERT INTO T_Articles (Description, ArtName, UnitaryPrice) VALUES ();
INSERT INTO T_Articles (Description, ArtName, UnitaryPrice) VALUES ();

-- -----------------------------------------------------------------------------
-- - Insertion des catégories dans la table
-- -----------------------------------------------------------------------------
INSERT INTO T_Categories (Description, CatName, Ranking) VALUES ();
INSERT INTO T_Categories (Description, CatName, Ranking) VALUES ();
INSERT INTO T_Categories (Description, CatName, Ranking) VALUES ();
INSERT INTO T_Categories (Description, CatName, Ranking) VALUES ();
INSERT INTO T_Categories (Description, CatName, Ranking) VALUES ();

-- -----------------------------------------------------------------------------
-- - Insertion des développeurs dans la table
-- -----------------------------------------------------------------------------
INSERT INTO T_Developers (Description, DevName, Location) VALUES ();
INSERT INTO T_Developers (Description, DevName, Location) VALUES ();
INSERT INTO T_Developers (Description, DevName, Location) VALUES ();
INSERT INTO T_Developers (Description, DevName, Location) VALUES ();
INSERT INTO T_Developers (Description, DevName, Location) VALUES ();

-- -----------------------------------------------------------------------------
-- - Affichage des tables
-- -----------------------------------------------------------------------------
SELECT * FROM T_Articles;
SELECT * FROM T_Categories;
SELECT * FROM T_Developers;
