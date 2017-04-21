-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
<<<<<<< HEAD
-- Generation Time: Apr 16, 2017 at 10:04 AM
=======
<<<<<<< HEAD
-- Generation Time: Mar 27, 2017 at 01:10 PM
=======
-- Generation Time: Mar 26, 2017 at 10:40 PM
>>>>>>> 3affdaca99b1fbcfd602c9cbc211bdce31c5905f
>>>>>>> 1f3e2861b12e725f9bca6ea7317b3220217a8d77
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `it355-dz5`
--

-- --------------------------------------------------------

--
<<<<<<< HEAD
-- Table structure for table `kategorije`
--

CREATE TABLE IF NOT EXISTS `kategorije` (
  `IDkategorije` int(11) NOT NULL AUTO_INCREMENT,
  `nazivKategorije` varchar(255) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`IDkategorije`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=3 ;

--
-- Dumping data for table `kategorije`
--

INSERT INTO `kategorije` (`IDkategorije`, `nazivKategorije`) VALUES
(1, 'Prva'),
(2, 'Druga');

-- --------------------------------------------------------

--
=======
>>>>>>> 1f3e2861b12e725f9bca6ea7317b3220217a8d77
-- Table structure for table `sobe`
--

CREATE TABLE IF NOT EXISTS `sobe` (
<<<<<<< HEAD
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `brojKreveta` int(11) NOT NULL,
=======
  `ID` int(11) NOT NULL,
<<<<<<< HEAD
  `brojKreveta` int(11) NOT NULL,
=======
  `Broj kreveta` int(11) NOT NULL,
>>>>>>> 3affdaca99b1fbcfd602c9cbc211bdce31c5905f
>>>>>>> 1f3e2861b12e725f9bca6ea7317b3220217a8d77
  `Velicina` int(11) NOT NULL,
  `Kupatilo` varchar(5) COLLATE utf8_bin NOT NULL,
  `TV` varchar(5) COLLATE utf8_bin NOT NULL,
  `Klima` varchar(5) COLLATE utf8_bin NOT NULL,
  `Cena` double NOT NULL,
<<<<<<< HEAD
  `IDkategorije` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `IDkategorije` (`IDkategorije`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=11 ;
=======
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
>>>>>>> 1f3e2861b12e725f9bca6ea7317b3220217a8d77

--
-- Dumping data for table `sobe`
--

<<<<<<< HEAD
INSERT INTO `sobe` (`ID`, `brojKreveta`, `Velicina`, `Kupatilo`, `TV`, `Klima`, `Cena`, `IDkategorije`) VALUES
(1, 1, 50, 'da', 'da', 'da', 64, 1),
(2, 3, 45, 'da', 'da', 'ne', 55, 1),
(3, 2, 45, 'da', 'ne', 'da', 40, 1),
(4, 2, 30, 'da', 'da', 'da', 45, 1),
(5, 1, 30, 'da', 'da', 'da', 65, 1),
(6, 2, 40, 'da', 'da', 'da', 45, 1),
(7, 1, 20, 'da', 'ne', 'ne', 25, 1),
(8, 1, 20, 'da', 'ne', 'ne', 25, 1),
(9, 1, 50, 'da', 'da', 'da', 100, 1),
(10, 1, 50, 'da', 'da', 'da', 100, 1);
=======
<<<<<<< HEAD
INSERT INTO `sobe` (`ID`, `brojKreveta`, `Velicina`, `Kupatilo`, `TV`, `Klima`, `Cena`) VALUES
=======
INSERT INTO `sobe` (`ID`, `Broj kreveta`, `Velicina`, `Kupatilo`, `TV`, `Klima`, `Cena`) VALUES
>>>>>>> 3affdaca99b1fbcfd602c9cbc211bdce31c5905f
(1, 1, 50, 'da', 'da', 'da', 64),
(2, 3, 45, 'da', 'da', 'ne', 55),
(3, 2, 45, 'da', 'ne', 'da', 40),
(4, 2, 30, 'da', 'da', 'da', 45),
<<<<<<< HEAD
(5, 1, 30, 'da', 'da', 'da', 65),
(6, 2, 40, 'da', 'da', 'da', 45),
(7, 1, 20, 'da', 'ne', 'ne', 25),
(8, 1, 20, 'da', 'ne', 'ne', 25),
(9, 1, 50, 'da', 'da', 'da', 100),
(10, 1, 50, 'da', 'da', 'da', 100);
=======
(5, 1, 30, 'da', 'da', 'da', 65);
>>>>>>> 3affdaca99b1fbcfd602c9cbc211bdce31c5905f
>>>>>>> 1f3e2861b12e725f9bca6ea7317b3220217a8d77

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `username` varchar(45) COLLATE utf8_bin NOT NULL,
  `password` varchar(45) COLLATE utf8_bin NOT NULL,
  `enabled` tinyint(4) NOT NULL DEFAULT '1',
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`username`, `password`, `enabled`) VALUES
('admin', 'admin', 3),
('korisnik', 'korisnik', 2);

-- --------------------------------------------------------

--
-- Table structure for table `user_roles`
--

CREATE TABLE IF NOT EXISTS `user_roles` (
  `user_role_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) COLLATE utf8_bin NOT NULL,
  `role` varchar(45) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`user_role_id`),
  UNIQUE KEY `uni_username_role` (`role`,`username`),
  KEY `fk_username_idx` (`username`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=4 ;

--
-- Dumping data for table `user_roles`
--

INSERT INTO `user_roles` (`user_role_id`, `username`, `role`) VALUES
(2, 'admin', 'ROLE_ADMIN'),
(1, 'admin', 'ROLE_USER'),
(3, 'korisnik', 'ROLE_USER');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `sobe`
--
ALTER TABLE `sobe`
  ADD CONSTRAINT `sobe_ibfk_1` FOREIGN KEY (`IDkategorije`) REFERENCES `kategorije` (`IDkategorije`);

--
-- Constraints for table `user_roles`
--
ALTER TABLE `user_roles`
  ADD CONSTRAINT `fk_username` FOREIGN KEY (`username`) REFERENCES `users` (`username`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
