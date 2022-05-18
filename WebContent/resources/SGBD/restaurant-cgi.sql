CREATE DATABASE  IF NOT EXISTS `restaurant-cgi` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `restaurant-cgi`;
-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: restaurant-cgi
-- ------------------------------------------------------
-- Server version	5.7.12-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `article`
--

DROP TABLE IF EXISTS `article`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `article` (
  `idarticle` int(11) NOT NULL,
  `descriptions` varchar(100) NOT NULL,
  `prix` int(11) NOT NULL,
  `categorie` varchar(45) NOT NULL,
  `image` varchar(100) NOT NULL,
  PRIMARY KEY (`idarticle`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `article`
--

LOCK TABLES `article` WRITE;
/*!40000 ALTER TABLE `article` DISABLE KEYS */;
INSERT INTO `article` VALUES (1,'aubergines',6,'plat','resources/images/aubergines.jpg'),(2,'bruschetta',5,'entrée','resources/images/bruschetta.jpg'),(3,'carpaccio',8,'entrée','resources/images/carpaccio.jpg'),(4,'coca',4,'boisson','resources/images/coca.jpg'),(5,'eau',2,'boisson','resources/images/eau.jpg'),(6,'fondant',7,'dessert','resources/images/fondant.jpg'),(7,'glace',6,'dessert','resources/images/glace.jpg'),(8,'jus',4,'boisson','resources/images/jus.jpg'),(9,'lambrusco',8,'boisson','resources/images/lambrusco.jpg'),(10,'lasagne',9,'plat','resources/images/lasgnes.jpg'),(11,'pannacotta',6,'dessert','resources/images/pannacotta.jpg'),(12,'pate',7,'plat','resources/images/pateitalienne.jpg'),(13,'pizza',11,'plat','resources/images/pizza.jpg'),(14,'risotto',13,'plat','resources/images/risotto.jpg'),(15,'spaghetti bolognaise',12,'plat','resources/images/spaghetti.jpg'),(16,'salade caprese',8,'entrée','resources/images/salade-Caprese.jpg'),(17,'tiramisu',9,'dessert','resources/images/tiramisu1.png');
/*!40000 ALTER TABLE `article` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `client`
--

DROP TABLE IF EXISTS `client`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `client` (
  `idclient` int(11) NOT NULL,
  `password` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `fname` varchar(45) NOT NULL,
  `phone` varchar(45) NOT NULL,
  `adress` varchar(45) NOT NULL,
  `instruction` varchar(45) NOT NULL,
  PRIMARY KEY (`idclient`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `client`
--

LOCK TABLES `client` WRITE;
/*!40000 ALTER TABLE `client` DISABLE KEYS */;
INSERT INTO `client` VALUES (2,'zfzf','zfz','zfzf','jrdpohjpodh','egrerherg','instruction');
/*!40000 ALTER TABLE `client` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `commandes`
--

DROP TABLE IF EXISTS `commandes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `commandes` (
  `idcommande` int(11) NOT NULL AUTO_INCREMENT,
  `idclient` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  `info` varchar(45) NOT NULL,
  PRIMARY KEY (`idcommande`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `commandes`
--

LOCK TABLES `commandes` WRITE;
/*!40000 ALTER TABLE `commandes` DISABLE KEYS */;
INSERT INTO `commandes` VALUES (3,3,12,'oozc'),(4,0,0,'model.Panier@75ba9a9d'),(5,0,0,'[1-1]'),(6,0,25,'[1-43-6]'),(7,0,16,'[2-5;2-7]'),(8,0,16,'[2-5;2-7]');
/*!40000 ALTER TABLE `commandes` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-18  0:04:50
