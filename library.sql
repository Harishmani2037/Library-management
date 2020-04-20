-- MariaDB dump 10.17  Distrib 10.4.11-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: library
-- ------------------------------------------------------
-- Server version	10.4.11-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin` (
  `s_no` int(11) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1,'Harish','123');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `black`
--

DROP TABLE IF EXISTS `black`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `black` (
  `reg_no` int(11) DEFAULT NULL,
  `student_name` varchar(50) DEFAULT NULL,
  `dept` varchar(50) DEFAULT NULL,
  `book_id` int(11) DEFAULT NULL,
  `book_name` varchar(50) DEFAULT NULL,
  `author` varchar(50) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  `regulations` int(11) DEFAULT NULL,
  `publications` varchar(50) DEFAULT NULL,
  `issue_date` date DEFAULT NULL,
  `return_date` date DEFAULT NULL,
  `place` varchar(50) DEFAULT NULL,
  `student_phone` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `black`
--

LOCK TABLES `black` WRITE;
/*!40000 ALTER TABLE `black` DISABLE KEYS */;
INSERT INTO `black` VALUES (5051,'Harish','B.TECH',2,'Network protocal','Andy','Magazine',2018,'Incorp','2020-04-01','2020-04-05','kerala',''),(5059,'Suray','CSE',2,'Network protocal','Andy','Magazine',2018,'Incorp','2020-04-01','2020-04-05','Tenkasi','8608907533'),(5050,'Harish','B.TECH',1,'Java','Sun micro SYstem','Computer science',2019,'Sun micro System','2020-03-17','2020-04-02','Tenkasi','99227672345'),(5052,'Aron','CIVIL',3,'C','Denis Ritche','Computer science',2019,'denis rithche','2020-04-01','2020-04-05','Chennai','8765434567');
/*!40000 ALTER TABLE `black` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `issue`
--

DROP TABLE IF EXISTS `issue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `issue` (
  `reg_no` int(50) DEFAULT NULL,
  `student_name` varchar(50) DEFAULT NULL,
  `dept` varchar(50) DEFAULT NULL,
  `book_id` int(50) DEFAULT NULL,
  `book_name` varchar(50) DEFAULT NULL,
  `author` varchar(50) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  `regulations` varchar(50) DEFAULT NULL,
  `publications` varchar(50) DEFAULT NULL,
  `issue_date` date DEFAULT NULL,
  `return_date` date DEFAULT NULL,
  `place` varchar(50) DEFAULT NULL,
  `student_phone` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `issue`
--

LOCK TABLES `issue` WRITE;
/*!40000 ALTER TABLE `issue` DISABLE KEYS */;
INSERT INTO `issue` VALUES (5051,'Harish','B.TECH',2,'Python','Guido van roosom','Computer science','2020','Guido van roosom','2020-04-06','2020-04-16','Tenkasi','99227672345'),(5053,'Aron','CIVIL',4,'Fairy Tales','Leo tolstoy','Story','2018','Disney','2020-04-07','2020-04-22','Chennai','8765434567');
/*!40000 ALTER TABLE `issue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `last`
--

DROP TABLE IF EXISTS `last`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `last` (
  `reg_no` int(11) DEFAULT NULL,
  `student_name` varchar(50) DEFAULT NULL,
  `dept` varchar(50) DEFAULT NULL,
  `book_id` int(11) DEFAULT NULL,
  `book_name` varchar(50) DEFAULT NULL,
  `author` varchar(50) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  `regulations` int(11) DEFAULT NULL,
  `publications` varchar(50) DEFAULT NULL,
  `issue_date` date DEFAULT NULL,
  `return_date` date DEFAULT NULL,
  `place` varchar(50) DEFAULT NULL,
  `student_phone` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `last`
--

LOCK TABLES `last` WRITE;
/*!40000 ALTER TABLE `last` DISABLE KEYS */;
INSERT INTO `last` VALUES (5054,'Gowtham','EEE',5,'Avengers','Faige & Brothers','Magazine',2018,'Disney','2020-04-01','2020-04-07','Kochin','8123456780');
/*!40000 ALTER TABLE `last` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `reg_no` int(11) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `dept` varchar(40) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `place` varchar(50) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES (5050,'Harish','B.TECH','99227672345','Tenkasi','123456'),(5051,'Mani','CIVIL','8768883456','Kerala','9876543'),(5052,'Aron','CIVIL','8765434567','Chennai','12345678'),(5053,'Fakkeer','MECH','9234567891','Erode','12345678'),(5054,'Gowtham','EEE','8123456780','Kochin','6578903422'),(5055,'Bharani','ECE','7234567890','nellai','3456789012'),(5056,'Sandy','B.TECH','6747399324','Madurai','234567890'),(5057,'sri ram','CIVIL','82345678900','Rajapalayam','1234567890');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `whole`
--

DROP TABLE IF EXISTS `whole`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `whole` (
  `book_id` int(11) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `author` varchar(50) DEFAULT NULL,
  `date` varchar(50) DEFAULT NULL,
  `regulations` varchar(50) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  `publications` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `whole`
--

LOCK TABLES `whole` WRITE;
/*!40000 ALTER TABLE `whole` DISABLE KEYS */;
INSERT INTO `whole` VALUES (1,'Java','Sun micro SYstem','Mon Apr 15 00:00:00 PDT 1996','2019','Computer science','Sun micro System'),(2,'Python','Guido van roosom','Sun Aug 25 00:00:00 PDT 1996','2020','Computer science','Guido van roosom'),(3,'C','Denis Ritche','Tue Feb 24 00:00:00 PST 1970','2019','Computer science','denis rithche'),(4,'Fairy Tales','Leo tolstoy','Mon Apr 30 09:00:16 PDT 1990','2018','Story','Disney'),(5,'Avengers','Faige & Brothers','Thu Apr 11 09:01:29 PDT 2013','2018','Magazine','Disney');
/*!40000 ALTER TABLE `whole` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-04-07  9:15:45
