-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.5.29


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema bd_polla
--

CREATE DATABASE IF NOT EXISTS bd_polla;
USE bd_polla;

--
-- Definition of table `pais`
--

DROP TABLE IF EXISTS `pais`;
CREATE TABLE `pais` (
  `id_pais` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) DEFAULT NULL,
  `ruta_imagen_web` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id_pais`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `pais`
--

/*!40000 ALTER TABLE `pais` DISABLE KEYS */;
INSERT INTO `pais` (`id_pais`,`nombre`,`ruta_imagen_web`) VALUES 
 (1,'MEXICO','http://icons.iconarchive.com/icons/custom-icon-design/flag-3/64/Mexico-Flag-icon.png'),
 (2,'USA','http://icons.iconarchive.com/icons/custom-icon-design/flag-3/64/United-States-Flag-icon.png'),
 (3,'INGLATERRA','http://icons.iconarchive.com/icons/custom-icon-design/flag-3/64/United-Kingdom-flag-icon.png'),
 (4,'RUSIA','http://icons.iconarchive.com/icons/custom-icon-design/flag-3/64/Russia-Flag-icon.png'),
 (5,'CROAZIA','http://icons.iconarchive.com/icons/custom-icon-design/flag-3/64/Croatian-Flag-icon.png'),
 (6,'BRASIL','http://icons.iconarchive.com/icons/custom-icon-design/flag-3/64/Brazil-Flag-icon.png');
/*!40000 ALTER TABLE `pais` ENABLE KEYS */;


--
-- Definition of table `partido`
--

DROP TABLE IF EXISTS `partido`;
CREATE TABLE `partido` (
  `id_partido` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` datetime DEFAULT NULL,
  `id_pais1` int(11) DEFAULT NULL,
  `id_pais2` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_partido`),
  KEY `fk_partido_pais1_idx` (`id_pais1`),
  KEY `fk_partido_pais2_idx` (`id_pais2`),
  CONSTRAINT `fk_partido_pais1` FOREIGN KEY (`id_pais1`) REFERENCES `pais` (`id_pais`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_partido_pais2` FOREIGN KEY (`id_pais2`) REFERENCES `pais` (`id_pais`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `partido`
--

/*!40000 ALTER TABLE `partido` DISABLE KEYS */;
INSERT INTO `partido` (`id_partido`,`fecha`,`id_pais1`,`id_pais2`) VALUES 
 (1,'2014-01-17 05:36:25',1,2),
 (2,'2014-01-17 05:36:25',1,3),
 (3,'2014-01-17 05:36:25',1,6),
 (4,'2014-01-17 05:36:25',1,5);
/*!40000 ALTER TABLE `partido` ENABLE KEYS */;


--
-- Definition of table `pronostico`
--

DROP TABLE IF EXISTS `pronostico`;
CREATE TABLE `pronostico` (
  `id_pronostico` int(11) NOT NULL AUTO_INCREMENT,
  `id_partido` int(11) DEFAULT NULL,
  `resultado_pais1` varchar(45) DEFAULT NULL,
  `resultado_pais2` varchar(45) DEFAULT NULL,
  `estado_pais1` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_pronostico`),
  KEY `fk_prontostico_partido_idx` (`id_partido`),
  CONSTRAINT `fk_prontostico_partido` FOREIGN KEY (`id_partido`) REFERENCES `partido` (`id_partido`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `pronostico`
--

/*!40000 ALTER TABLE `pronostico` DISABLE KEYS */;
INSERT INTO `pronostico` (`id_pronostico`,`id_partido`,`resultado_pais1`,`resultado_pais2`,`estado_pais1`) VALUES 
 (1,1,'3','0',2),
 (2,2,'1','1',0),
 (3,3,'1','3',1),
 (4,4,'2','2',0),
 (5,1,'2','0',2),
 (6,1,'3','1',2),
 (7,1,'7','0',2),
 (8,1,'0','0',0),
 (9,1,'1','1',0);
/*!40000 ALTER TABLE `pronostico` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
