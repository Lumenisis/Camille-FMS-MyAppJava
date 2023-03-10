-- -----------------------------------------------------------------------------
-- - Construction de la base de données
-- -----------------------------------------------------------------------------
CREATE DATABASE Linux;
USE Linux;

-- -----------------------------------------------------------------------------
-- - Construction de la tables des systèmes
-- -----------------------------------------------------------------------------
CREATE TABLE T_Distributions (
	IdDistribution			int(4)		PRIMARY KEY AUTO_INCREMENT,
	Description				varchar(100)NOT NULL,
	DistName				varchar(30)	NOT NULL
) ENGINE = InnoDB;

-- -----------------------------------------------------------------------------
-- - Construction de la table des catégories
-- -----------------------------------------------------------------------------
CREATE TABLE T_Categories (
	IdCategory 				INT(4) 		 PRIMARY KEY AUTO_INCREMENT,
	Description 			VARCHAR(100) NOT NULL,
	CatName 				VARCHAR(30)  NOT NULL
) ENGINE = InnoDB;

-- -----------------------------------------------------------------------------
-- - Construction de la table des développeurs
-- -----------------------------------------------------------------------------
CREATE TABLE T_Developers (
	IdDeveloper 			INT(4) 		 PRIMARY KEY AUTO_INCREMENT,
	Description 			VARCHAR(100) NOT NULL,
	DevName 				VARCHAR(30)  NOT NULL
) ENGINE = InnoDB;

-- -----------------------------------------------------------------------------
-- - Construction de la table des spécifications
-- -----------------------------------------------------------------------------
CREATE TABLE T_Specifications (
	IdSpecification 		INT(4) 		 PRIMARY KEY AUTO_INCREMENT,
	Description 			VARCHAR(100) NOT NULL,
	SpecName 				VARCHAR(30)  NOT NULL
) ENGINE = InnoDB;

-- -----------------------------------------------------------------------------
-- - Construction de la table des utilisateurs
-- -----------------------------------------------------------------------------
CREATE TABLE T_Users (
	IdUser 		INT(4) 		 PRIMARY KEY AUTO_INCREMENT,
	Description 			VARCHAR(100) NOT NULL,
	UserName 				VARCHAR(30)  NOT NULL
) ENGINE = InnoDB;

-- -----------------------------------------------------------------------------
-- - Insertion des systèmes dans la table
-- -----------------------------------------------------------------------------
INSERT INTO T_Distributions (Description, DistName) VALUES ();
INSERT INTO T_Distributions (Description, DistName) VALUES ();
INSERT INTO T_Distributions (Description, DistName) VALUES ();

-- -----------------------------------------------------------------------------
-- - Insertion des catégories dans la table
-- -----------------------------------------------------------------------------
INSERT INTO T_Categories (Description, CatName) VALUES ();
INSERT INTO T_Categories (Description, CatName) VALUES ();
INSERT INTO T_Categories (Description, CatName) VALUES ();

-- -----------------------------------------------------------------------------
-- - Insertion des développeurs dans la table
-- -----------------------------------------------------------------------------
INSERT INTO T_Developers (Description, DevName) VALUES ();
INSERT INTO T_Developers (Description, DevName) VALUES ();
INSERT INTO T_Developers (Description, DevName) VALUES ();

-- -----------------------------------------------------------------------------
-- - Insertion des spécifications dans la table
-- -----------------------------------------------------------------------------
INSERT INTO T_Specifications (Description, SpecName) VALUES ();
INSERT INTO T_Specifications (Description, SpecName) VALUES ();
INSERT INTO T_Specifications (Description, SpecName) VALUES ();

-- -----------------------------------------------------------------------------
-- - Insertion des utilisateurs dans la table
-- -----------------------------------------------------------------------------
INSERT INTO T_Users (Description, UserName) VALUES ();
INSERT INTO T_Users (Description, UserName) VALUES ();
INSERT INTO T_Users (Description, UserName) VALUES ();

-- -----------------------------------------------------------------------------
-- - Affichage des tables
-- -----------------------------------------------------------------------------
SELECT * FROM T_Distributions;
SELECT * FROM T_Categories;
SELECT * FROM T_Developers;
SELECT * FROM T_Specifications;
SELECT * FROM T_Users;
