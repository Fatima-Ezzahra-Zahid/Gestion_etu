-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  ven. 15 jan. 2021 à 13:38
-- Version du serveur :  10.4.10-MariaDB
-- Version de PHP :  7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `g_et`
--

-- --------------------------------------------------------

--
-- Structure de la table `etudiant`
--

DROP TABLE IF EXISTS `etudiant`;
CREATE TABLE IF NOT EXISTS `etudiant` (
  `ID_ET` int(11) NOT NULL AUTO_INCREMENT,
  `ID_SP` int(11) DEFAULT NULL,
  `NOM` varchar(250) DEFAULT NULL,
  `PRENOM` varchar(250) DEFAULT NULL,
  `DATE_NAISSANCE` date DEFAULT NULL,
  `EMAIL` varchar(250) DEFAULT NULL,
  `VILLE` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`ID_ET`),
  KEY `ID_SP` (`ID_SP`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `module`
--

DROP TABLE IF EXISTS `module`;
CREATE TABLE IF NOT EXISTS `module` (
  `ID_M` int(11) NOT NULL,
  `ID_SP` int(11) NOT NULL,
  `NOM_MODULE` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`ID_M`),
  KEY `ID_SP` (`ID_SP`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `specialite`
--

DROP TABLE IF EXISTS `specialite`;
CREATE TABLE IF NOT EXISTS `specialite` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `specialite`
--

INSERT INTO `specialite` (`id`, `nom`) VALUES
(1, 'java'),
(2, 'java'),
(3, 'java'),
(4, 'java'),
(5, 'java'),
(6, 'java'),
(7, 'c#');

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `etudiant`
--
ALTER TABLE `etudiant`
  ADD CONSTRAINT `etudiant_ibfk_1` FOREIGN KEY (`ID_SP`) REFERENCES `specialite` (`id`);

--
-- Contraintes pour la table `module`
--
ALTER TABLE `module`
  ADD CONSTRAINT `module_ibfk_1` FOREIGN KEY (`ID_SP`) REFERENCES `specialite` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
