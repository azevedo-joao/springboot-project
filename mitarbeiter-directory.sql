CREATE DATABASE  IF NOT EXISTS `mitarbeiter_directory`;
USE `mitarbeiter_directory`;

--
-- Tabellenstruktur für die Tabelle `mitarbeiter`
--

DROP TABLE IF EXISTS `mitarbeiter`;

CREATE TABLE `mitarbeiter` (
  `id` int NOT NULL AUTO_INCREMENT,
  `vorname` varchar(45) DEFAULT NULL,
  `nachname` varchar(45) DEFAULT NULL,
  `position` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

--
-- Daten für die Tabelle 'mitarbeiter'
--

INSERT INTO `mitarbeiter` VALUES 
	(1,'João','Azevedo', 'Student, Programmierer', 'joao.azevedo@studium.uni-hamburg.de');
