create database dxclms;

use dxclms;

-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: lms
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `EMP_ID` int NOT NULL,
  `EMP_NAME` char(20) NOT NULL,
  `EMP_MAIL` char(30) NOT NULL,
  `EMP_MOB_NO` bigint NOT NULL,
  `EMP_DT_JOIN` date NOT NULL,
  `EMP_DEPT` char(25) DEFAULT NULL,
  `EMP_MANAGER_ID` int DEFAULT NULL,
  `EMP_AVAIL_LEAVE_BAL` int DEFAULT NULL,
  PRIMARY KEY (`EMP_ID`),
  KEY `EMP_MANAGER_ID` (`EMP_MANAGER_ID`),
  CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`EMP_MANAGER_ID`) REFERENCES `employee` (`EMP_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1000,'ABHILASH','AbhilashP@hexaware.com',7772021561,'2017-11-14','Infinite',NULL,16),(2000,'SANDEEP','SandeepM@hexaware.com',9853969055,'2017-11-14','Infinite',1000,3),(2001,'SHIKHA','ShikhaR@hexaware.com',7987753369,'2017-11-14','Infinite',1000,5),(3000,'AISHWARYA','AishwaryaT2@hexaware.com',9424401658,'2017-11-14','Infinite',2000,15),(3001,'SURABHI','SurabhiG@hexaware.com',7566008477,'2017-11-14','Infinite',2001,20);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `leave_history`
--

DROP TABLE IF EXISTS `leave_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `leave_history` (
  `LEAVE_ID` int NOT NULL AUTO_INCREMENT,
  `LEAVE_NO_OF_DAYS` int DEFAULT NULL,
  `LEAVE_MNGR_COMMENTS` char(200) DEFAULT NULL,
  `EMP_ID` int DEFAULT NULL,
  `LEAVE_START_DATE` date NOT NULL,
  `LEAVE_END_DATE` date NOT NULL,
  `LEAVE_TYPE` enum('EL') DEFAULT 'EL',
  `LEAVE_STATUS` enum('PENDING','APPROVED','DENIED') DEFAULT 'PENDING',
  `LEAVE_REASON` char(50) NOT NULL,
  PRIMARY KEY (`LEAVE_ID`),
  KEY `EMP_ID` (`EMP_ID`),
  CONSTRAINT `leave_history_ibfk_1` FOREIGN KEY (`EMP_ID`) REFERENCES `employee` (`EMP_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `leave_history`
--

LOCK TABLES `leave_history` WRITE;
/*!40000 ALTER TABLE `leave_history` DISABLE KEYS */;
INSERT INTO `leave_history` VALUES (1,2,NULL,1000,'2021-12-22','2021-12-23','EL','PENDING','Going Home'),(2,3,'Go Ahead',2000,'2021-12-23','2021-12-25','EL','APPROVED','Going HOmetown'),(3,2,'Enjoy a lot',2000,'2021-12-23','2021-12-24','EL','APPROVED','Marriage'),(4,4,'No More Leaves',2001,'2021-12-24','2021-12-27','EL','DENIED','Timepass'),(5,3,'goahead',2000,'2022-01-15','2022-01-17','EL','APPROVED','Marriage'),(6,6,'Strictly NO',2000,'2022-01-06','2022-01-13','EL','DENIED','Marriage'),(7,4,'project finish and go',2001,'2021-12-31','2022-01-05','EL','APPROVED','Timepass'),(8,3,NULL,2001,'2022-01-13','2022-01-15','EL','PENDING','pongal'),(9,1,NULL,2001,'2022-01-14','2022-01-14','EL','PENDING','pongal'),(10,2,'Nooo',2000,'2022-01-30','2022-01-31','EL','DENIED','Going to Marriage'),(11,1,NULL,2000,'2022-01-28','2022-01-28','EL','PENDING','personal'),(12,3,NULL,3000,'2022-01-21','2022-01-23','EL','PENDING','exam preparation'),(13,2,NULL,1000,'2022-02-03','2022-02-04','EL','PENDING','marriage'),(14,2,NULL,2000,'2022-01-21','2022-01-22','EL','PENDING','timepass'),(15,2,NULL,2000,'2022-01-16','2022-01-17','EL','PENDING','asdfasfd'),(16,18,NULL,2000,'2022-01-06','2022-01-23','EL','PENDING','asdfasf');
/*!40000 ALTER TABLE `leave_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'lms'
--

--
-- Dumping routines for database 'lms'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-15 10:36:28
