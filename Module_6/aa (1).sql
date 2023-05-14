-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: theater_management
-- ------------------------------------------------------
-- Server version	8.0.30

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
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `account` (
  `username` varchar(45) NOT NULL,
  `is_delete` bit(1) NOT NULL,
  `is_enable` bit(1) NOT NULL,
  `password` varchar(255) NOT NULL,
  `verification_code` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account`
--

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
INSERT INTO `account` VALUES ('admin',_binary '\0',_binary '','$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2',NULL),('customer',_binary '\0',_binary '','$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2',NULL),('customer1',_binary '\0',_binary '','$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2',NULL),('customer10',_binary '\0',_binary '','$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2',NULL),('customer11',_binary '\0',_binary '','$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2',NULL),('customer2',_binary '\0',_binary '','$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2',NULL),('customer3',_binary '\0',_binary '','$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2',NULL),('customer4',_binary '\0',_binary '','Trandinhduynghia2',NULL),('customer5',_binary '\0',_binary '','$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2',NULL),('customer6',_binary '\0',_binary '','$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2',NULL),('customer7',_binary '\0',_binary '','$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2',NULL),('customer8',_binary '\0',_binary '','$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2',NULL),('customer9',_binary '\0',_binary '','$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2',NULL),('employee1',_binary '\0',_binary '','$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2',NULL),('employee10',_binary '\0',_binary '','$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2',NULL),('employee11',_binary '\0',_binary '','$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2',NULL),('employee2',_binary '\0',_binary '','$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2',NULL),('employee3',_binary '\0',_binary '','$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2',NULL),('employee4',_binary '\0',_binary '','$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2',NULL),('employee5',_binary '\0',_binary '','$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2',NULL),('employee6',_binary '\0',_binary '','$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2',NULL),('employee7',_binary '\0',_binary '','$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2',NULL),('employee8',_binary '\0',_binary '','$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2',NULL),('employee9',_binary '\0',_binary '','$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2',NULL),('tcryuii',_binary '\0',_binary '','Tr1!@#$%^&*(do',NULL),('Tri123',_binary '\0',_binary '','Tr1!@#$%^&*od',NULL),('TRiLHH',_binary '\0',_binary '','Tr1!@#$%^&*od',NULL),('TRiLHH23',_binary '\0',_binary '','Tr1!@#$%^&*od',NULL),('TYT221',_binary '\0',_binary '','Tr1!@#$%^&*(do',NULL);
/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `account_role`
--

DROP TABLE IF EXISTS `account_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `account_role` (
  `id` int NOT NULL AUTO_INCREMENT,
  `is_delete` bit(1) DEFAULT NULL,
  `username` varchar(45) NOT NULL,
  `role_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK6maxca7k70niuh7p1mo6duxx9` (`username`),
  KEY `FKrs2s3m3039h0xt8d5yhwbuyam` (`role_id`),
  CONSTRAINT `FK6maxca7k70niuh7p1mo6duxx9` FOREIGN KEY (`username`) REFERENCES `account` (`username`),
  CONSTRAINT `FKrs2s3m3039h0xt8d5yhwbuyam` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account_role`
--

LOCK TABLES `account_role` WRITE;
/*!40000 ALTER TABLE `account_role` DISABLE KEYS */;
INSERT INTO `account_role` VALUES (1,_binary '\0','admin',1),(2,_binary '\0','customer',3),(3,_binary '\0','customer1',3),(4,_binary '\0','customer2',3),(5,_binary '\0','customer3',3),(6,_binary '\0','customer4',3),(7,_binary '\0','customer5',3),(8,_binary '\0','customer6',3),(9,_binary '\0','customer7',3),(10,_binary '\0','customer8',3),(11,_binary '\0','customer9',3),(12,_binary '\0','customer10',3),(13,_binary '\0','customer11',3),(14,_binary '\0','employee1',2),(15,_binary '\0','employee2',2),(16,_binary '\0','employee3',2),(17,_binary '\0','employee4',2),(18,_binary '\0','employee5',2),(19,_binary '\0','employee6',2),(20,_binary '\0','employee7',2),(21,_binary '\0','employee8',2),(22,_binary '\0','employee9',2),(23,_binary '\0','employee10',2),(24,_binary '\0','employee11',2);
/*!40000 ALTER TABLE `account_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `actor`
--

DROP TABLE IF EXISTS `actor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `actor` (
  `id` int NOT NULL AUTO_INCREMENT,
  `is_delete` bit(1) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `actor`
--

LOCK TABLES `actor` WRITE;
/*!40000 ALTER TABLE `actor` DISABLE KEYS */;
INSERT INTO `actor` VALUES (1,_binary '\0','Lucia Caporaso'),(2,_binary '\0','Chiara Casolari'),(3,_binary '\0','Thái Hòa'),(4,_binary '\0','Huỳnh Phương'),(5,_binary '\0','Russell Crowe'),(6,_binary '\0','Franco Nero'),(7,_binary '\0','Vinh Râu'),(8,_binary '\0','Kim Da-mi'),(9,_binary '\0','Woo-Seok Byeon'),(10,_binary '\0','So-nee Jeon'),(11,_binary '\0','Kim Soo Hyung'),(12,_binary '\0','Zachary Levi'),(13,_binary '\0','Asher Angel'),(14,_binary '\0','Jack Dylan Grazer'),(15,_binary '\0',' Marta Milans'),(16,_binary '\0','Cooper Andrews'),(17,_binary '\0','abc');
/*!40000 ALTER TABLE `actor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chair`
--

DROP TABLE IF EXISTS `chair`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chair` (
  `id` int NOT NULL AUTO_INCREMENT,
  `is_delete` bit(1) DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chair`
--

LOCK TABLES `chair` WRITE;
/*!40000 ALTER TABLE `chair` DISABLE KEYS */;
INSERT INTO `chair` VALUES (1,_binary '\0','A1'),(2,_binary '\0','A2'),(3,_binary '\0','A3'),(4,_binary '\0','A4'),(5,_binary '\0','A5'),(6,_binary '\0','A6'),(7,_binary '\0','A7'),(8,_binary '\0','A8'),(9,_binary '\0','A9'),(10,_binary '\0','A10'),(11,_binary '\0','B1'),(12,_binary '\0','B2'),(13,_binary '\0','B3'),(14,_binary '\0','B4'),(15,_binary '\0','B5'),(16,_binary '\0','B6'),(17,_binary '\0','B7'),(18,_binary '\0','B8'),(19,_binary '\0','B9'),(20,_binary '\0','B10'),(21,_binary '\0','C1'),(22,_binary '\0','C2'),(23,_binary '\0','C3'),(24,_binary '\0','C4'),(25,_binary '\0','C5'),(26,_binary '\0','C6'),(27,_binary '\0','C7'),(28,_binary '\0','C8'),(29,_binary '\0','C9'),(30,_binary '\0','C10'),(31,_binary '\0','D1'),(32,_binary '\0','D2'),(33,_binary '\0','D2'),(34,_binary '\0','D4'),(35,_binary '\0','D5'),(36,_binary '\0','D6'),(37,_binary '\0','D7'),(38,_binary '\0','D8'),(39,_binary '\0','D9'),(40,_binary '\0','D10');
/*!40000 ALTER TABLE `chair` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chair_room`
--

DROP TABLE IF EXISTS `chair_room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chair_room` (
  `id` int NOT NULL AUTO_INCREMENT,
  `is_delete` bit(1) DEFAULT NULL,
  `status` bit(1) DEFAULT NULL,
  `chair_id` int DEFAULT NULL,
  `room_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKhckjje9cvkpsehvhl1ohovr36` (`chair_id`),
  KEY `FK6brs8w2q43mc6dij6u29yep1s` (`room_id`),
  CONSTRAINT `FK6brs8w2q43mc6dij6u29yep1s` FOREIGN KEY (`room_id`) REFERENCES `room` (`id`),
  CONSTRAINT `FKhckjje9cvkpsehvhl1ohovr36` FOREIGN KEY (`chair_id`) REFERENCES `chair` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=161 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chair_room`
--

LOCK TABLES `chair_room` WRITE;
/*!40000 ALTER TABLE `chair_room` DISABLE KEYS */;
INSERT INTO `chair_room` VALUES (1,_binary '\0',_binary '\0',1,1),(2,_binary '\0',_binary '\0',2,1),(3,_binary '\0',_binary '\0',3,1),(4,_binary '\0',_binary '\0',4,1),(5,_binary '\0',_binary '\0',5,1),(6,_binary '\0',_binary '\0',6,1),(7,_binary '\0',_binary '\0',7,1),(8,_binary '\0',_binary '\0',8,1),(9,_binary '\0',_binary '\0',9,1),(10,_binary '\0',_binary '\0',10,1),(11,_binary '\0',_binary '\0',11,1),(12,_binary '\0',_binary '\0',12,1),(13,_binary '\0',_binary '\0',13,1),(14,_binary '\0',_binary '\0',14,1),(15,_binary '\0',_binary '\0',15,1),(16,_binary '\0',_binary '\0',16,1),(17,_binary '\0',_binary '\0',17,1),(18,_binary '\0',_binary '\0',18,1),(19,_binary '\0',_binary '\0',19,1),(20,_binary '\0',_binary '\0',20,1),(21,_binary '\0',_binary '\0',21,1),(22,_binary '\0',_binary '\0',22,1),(23,_binary '\0',_binary '\0',23,1),(24,_binary '\0',_binary '\0',24,1),(25,_binary '\0',_binary '\0',25,1),(26,_binary '\0',_binary '\0',26,1),(27,_binary '\0',_binary '\0',27,1),(28,_binary '\0',_binary '\0',28,1),(29,_binary '\0',_binary '\0',29,1),(30,_binary '\0',_binary '\0',30,1),(31,_binary '\0',_binary '\0',31,1),(32,_binary '\0',_binary '\0',32,1),(33,_binary '\0',_binary '\0',33,1),(34,_binary '\0',_binary '\0',34,1),(35,_binary '\0',_binary '\0',35,1),(36,_binary '\0',_binary '\0',36,1),(37,_binary '\0',_binary '\0',37,1),(38,_binary '\0',_binary '\0',38,1),(39,_binary '\0',_binary '\0',39,1),(40,_binary '\0',_binary '\0',40,1),(41,_binary '\0',_binary '\0',1,2),(42,_binary '\0',_binary '\0',2,2),(43,_binary '\0',_binary '\0',3,2),(44,_binary '\0',_binary '\0',4,2),(45,_binary '\0',_binary '\0',5,2),(46,_binary '\0',_binary '\0',6,2),(47,_binary '\0',_binary '\0',7,2),(48,_binary '\0',_binary '\0',8,2),(49,_binary '\0',_binary '\0',9,2),(50,_binary '\0',_binary '\0',10,2),(51,_binary '\0',_binary '\0',11,2),(52,_binary '\0',_binary '\0',12,2),(53,_binary '\0',_binary '\0',13,2),(54,_binary '\0',_binary '\0',14,2),(55,_binary '\0',_binary '\0',15,2),(56,_binary '\0',_binary '\0',16,2),(57,_binary '\0',_binary '\0',17,2),(58,_binary '\0',_binary '\0',18,2),(59,_binary '\0',_binary '\0',19,2),(60,_binary '\0',_binary '\0',20,2),(61,_binary '\0',_binary '\0',21,2),(62,_binary '\0',_binary '\0',22,2),(63,_binary '\0',_binary '\0',23,2),(64,_binary '\0',_binary '\0',24,2),(65,_binary '\0',_binary '\0',25,2),(66,_binary '\0',_binary '\0',26,2),(67,_binary '\0',_binary '\0',27,2),(68,_binary '\0',_binary '\0',28,2),(69,_binary '\0',_binary '\0',29,2),(70,_binary '\0',_binary '\0',30,2),(71,_binary '\0',_binary '\0',31,2),(72,_binary '\0',_binary '\0',32,2),(73,_binary '\0',_binary '\0',33,2),(74,_binary '\0',_binary '\0',34,2),(75,_binary '\0',_binary '\0',35,2),(76,_binary '\0',_binary '\0',36,2),(77,_binary '\0',_binary '\0',37,2),(78,_binary '\0',_binary '\0',38,2),(79,_binary '\0',_binary '\0',39,2),(80,_binary '\0',_binary '\0',40,2),(81,_binary '\0',_binary '\0',1,3),(82,_binary '\0',_binary '\0',2,3),(83,_binary '\0',_binary '\0',3,3),(84,_binary '\0',_binary '\0',4,3),(85,_binary '\0',_binary '\0',5,3),(86,_binary '\0',_binary '\0',6,3),(87,_binary '\0',_binary '\0',7,3),(88,_binary '\0',_binary '\0',8,3),(89,_binary '\0',_binary '\0',9,3),(90,_binary '\0',_binary '\0',10,3),(91,_binary '\0',_binary '\0',11,3),(92,_binary '\0',_binary '\0',12,3),(93,_binary '\0',_binary '\0',13,3),(94,_binary '\0',_binary '\0',14,3),(95,_binary '\0',_binary '\0',15,3),(96,_binary '\0',_binary '\0',16,3),(97,_binary '\0',_binary '\0',17,3),(98,_binary '\0',_binary '\0',18,3),(99,_binary '\0',_binary '\0',19,3),(100,_binary '\0',_binary '\0',20,3),(101,_binary '\0',_binary '\0',21,3),(102,_binary '\0',_binary '\0',22,3),(103,_binary '\0',_binary '\0',23,3),(104,_binary '\0',_binary '\0',24,3),(105,_binary '\0',_binary '\0',25,3),(106,_binary '\0',_binary '\0',26,3),(107,_binary '\0',_binary '\0',27,3),(108,_binary '\0',_binary '\0',28,3),(109,_binary '\0',_binary '\0',29,3),(110,_binary '\0',_binary '\0',30,3),(111,_binary '\0',_binary '\0',31,3),(112,_binary '\0',_binary '\0',32,3),(113,_binary '\0',_binary '\0',33,3),(114,_binary '\0',_binary '\0',34,3),(115,_binary '\0',_binary '\0',35,3),(116,_binary '\0',_binary '\0',36,3),(117,_binary '\0',_binary '\0',37,3),(118,_binary '\0',_binary '\0',38,3),(119,_binary '\0',_binary '\0',39,3),(120,_binary '\0',_binary '\0',40,3),(121,_binary '\0',_binary '\0',1,4),(122,_binary '\0',_binary '\0',2,4),(123,_binary '\0',_binary '\0',3,4),(124,_binary '\0',_binary '\0',4,4),(125,_binary '\0',_binary '\0',5,4),(126,_binary '\0',_binary '\0',6,4),(127,_binary '\0',_binary '\0',7,4),(128,_binary '\0',_binary '\0',8,4),(129,_binary '\0',_binary '\0',9,4),(130,_binary '\0',_binary '\0',10,4),(131,_binary '\0',_binary '\0',11,4),(132,_binary '\0',_binary '\0',12,4),(133,_binary '\0',_binary '\0',13,4),(134,_binary '\0',_binary '\0',14,4),(135,_binary '\0',_binary '\0',15,4),(136,_binary '\0',_binary '\0',16,4),(137,_binary '\0',_binary '\0',17,4),(138,_binary '\0',_binary '\0',18,4),(139,_binary '\0',_binary '\0',19,4),(140,_binary '\0',_binary '\0',20,4),(141,_binary '\0',_binary '\0',21,4),(142,_binary '\0',_binary '\0',22,4),(143,_binary '\0',_binary '\0',23,4),(144,_binary '\0',_binary '\0',24,4),(145,_binary '\0',_binary '\0',25,4),(146,_binary '\0',_binary '\0',26,4),(147,_binary '\0',_binary '\0',27,4),(148,_binary '\0',_binary '\0',28,4),(149,_binary '\0',_binary '\0',29,4),(150,_binary '\0',_binary '\0',30,4),(151,_binary '\0',_binary '\0',31,4),(152,_binary '\0',_binary '\0',32,4),(153,_binary '\0',_binary '\0',33,4),(154,_binary '\0',_binary '\0',34,4),(155,_binary '\0',_binary '\0',35,4),(156,_binary '\0',_binary '\0',36,4),(157,_binary '\0',_binary '\0',37,4),(158,_binary '\0',_binary '\0',38,4),(159,_binary '\0',_binary '\0',39,4),(160,_binary '\0',_binary '\0',40,4);
/*!40000 ALTER TABLE `chair_room` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `id` varchar(45) NOT NULL,
  `address` varchar(255) NOT NULL,
  `birthday` datetime(6) NOT NULL,
  `card_id` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `full_name` varchar(255) NOT NULL,
  `gender` bit(1) NOT NULL,
  `is_delete` bit(1) DEFAULT NULL,
  `phone_number` varchar(15) NOT NULL,
  `username` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKsn7i4emc8fm44n66ge5ulpfio` (`username`),
  CONSTRAINT `FKsn7i4emc8fm44n66ge5ulpfio` FOREIGN KEY (`username`) REFERENCES `account` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES ('KH-001','23 Nguyễn Hoàng, Đà Nẵng','1970-11-07 00:00:00.000000','643431213','thihao07@gmail.com','Nguyễn Thị Hào',_binary '\0',_binary '\0','0945423362','customer'),('KH-002','K77/22 Thái Phiên, Quảng Trị','1992-08-08 00:00:00.000000','865342123','xuandieu92@gmail.com','Phạm Xuân Diệu',_binary '',_binary '\0','0954333333','customer1'),('KH-003','K323/12 Ông Ích Khiêm, Vinh','1990-02-27 00:00:00.000000','488645199','nghenhan2702@gmail.com','Trương Đình Nghệ',_binary '',_binary '\0','0373213122','customer2'),('KH-004','K453/12 Lê Lợi, Đà Nẵng','1981-07-08 00:00:00.000000','543432111','duongquan@gmail.com','Dương Văn Quan',_binary '',_binary '\0','0490039241','customer3'),('KH-005','224 Lý Thái Tổ, Gia Lai','1995-12-09 00:00:00.000000','795453345','nhinhi123@gmail.com','Hoàng Trần Nhi Nhi',_binary '\0',_binary '\0','0312345678','customer4'),('KH-006','37 Yên Thế, Đà Nẵng','2005-12-06 00:00:00.000000','732434215','tonnuchau@gmail.com','Tôn Nữ Mộc Châu',_binary '\0',_binary '\0','0988888844','customer5'),('KH-007','K123/45 Lê Lợi, Hồ Chí Minh','1984-04-08 00:00:00.000000','856453123','kimcuong84@gmail.com','Nguyễn Mỹ Kim',_binary '\0',_binary '\0','0912345698','customer6'),('KH-008','55 Nguyễn Văn Linh, Kon Tum','1999-04-08 00:00:00.000000','965656433','haohao99@gmail.com','Nguyễn Thị Hào',_binary '\0',_binary '\0','0763212345','customer7'),('KH-009','24 Lý Thường Kiệt, Quảng Ngãi','1994-07-01 00:00:00.000000','432341235','danhhai99@gmail.com','Trần Đại Danh',_binary '',_binary '\0','0643343433','customer8'),('KH-010','22 Ngô Quyền, Đà Nẵng','1989-07-01 00:00:00.000000','344343432','dactam@gmail.com','Nguyễn Tâm Đắc',_binary '',_binary '\0','0987654321','customer9'),('KH-011','224 Lý Thái Tổ, Gia Lai','1995-12-09 00:00:00.000000','795453445','nhi123@gmail.com','Hoàng Trần Hoàng',_binary '\0',_binary '\0','0312345676','customer10'),('KH-012','37 Yên Thế, Đà Nẵng','2005-12-06 00:00:00.000000','732434215','tonnuhau@gmail.com','Tôn Nữ Mộc Châu Cách Cách',_binary '\0',_binary '\0','0988888844','customer11'),('KH-013','Huyện Hiệp Đức Tỉnh Quảng Nam','2001-10-20 07:00:00.000000','03339151378','tro102@gmail.com','Lý Huỳnh Hữu Trí',_binary '',_binary '\0','03339151378','TRiLHH'),('KH-014','Huyện Hiệp Đức Tỉnh Quảng Nam','2001-10-20 07:00:00.000000','03339151378','tro102@gmail.com','Lý Huỳnh Hữu Trí',_binary '',_binary '\0','03339151378','TRiLHH23'),('KH-015','Huyện Hiệp Đức Tỉnh Quảng Nam','2001-10-20 07:00:00.000000','03339151378','tro102@gmail.com','Lý Huỳnh Hữu Trí',_binary '',_binary '\0','03339151378','Tri123'),('KH-016','qưewqq','2003-06-08 07:00:00.000000','0333915138','ltri1042@gmail.com','Nguyễn Nọc Hiếu',_binary '',_binary '\0','0333915138','tcryuii'),('KH-017','qưewqq','2003-06-08 07:00:00.000000','0333915138','ltri1042@gmail.com','Nguyễn Nọc Hiếu',_binary '',_binary '\0','0333915138','TYT221');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `director`
--

DROP TABLE IF EXISTS `director`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `director` (
  `id` int NOT NULL AUTO_INCREMENT,
  `is_delete` bit(1) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `director`
--

LOCK TABLES `director` WRITE;
/*!40000 ALTER TABLE `director` DISABLE KEYS */;
INSERT INTO `director` VALUES (1,_binary '\0','Orson Welles'),(2,_binary '\0','Francis Ford Coppola'),(3,_binary '\0','Michael Curtiz'),(4,_binary '\0','Martin Scorsese'),(5,_binary '\0','Gene Kelly'),(6,_binary '\0','Stanley Donen'),(7,_binary '\0','David Lean'),(8,_binary '\0','Steven Spielberg'),(9,_binary '\0','John Ford'),(10,_binary '\0','Billy Wilder'),(11,_binary '\0','George Lucas'),(12,_binary '\0','Alfred Hitchcock'),(13,_binary '\0','Frank Capra'),(14,_binary '\0','Elia Kazan'),(15,_binary '\0','Robert Mulligan'),(16,_binary '\0','Billy Wilder');
/*!40000 ALTER TABLE `director` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `id` varchar(45) NOT NULL,
  `address` varchar(255) NOT NULL,
  `birthday` datetime(6) NOT NULL,
  `card_id` varchar(255) DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `full_name` varchar(255) NOT NULL,
  `gender` bit(1) NOT NULL,
  `image` varchar(255) DEFAULT NULL,
  `is_activated` bit(1) DEFAULT NULL,
  `is_delete` bit(1) DEFAULT NULL,
  `phone_number` varchar(15) NOT NULL,
  `username` varchar(45) NOT NULL,
  `position_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKfyykgcnyif1w8n02bn82vl4yv` (`username`),
  KEY `FKbc8rdko9o9n1ri9bpdyxv3x7i` (`position_id`),
  CONSTRAINT `FKbc8rdko9o9n1ri9bpdyxv3x7i` FOREIGN KEY (`position_id`) REFERENCES `position` (`id`),
  CONSTRAINT `FKfyykgcnyif1w8n02bn82vl4yv` FOREIGN KEY (`username`) REFERENCES `account` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES ('NV-001','22 Yên Bái, Đà Nẵng','1997-04-09 00:00:00.000000','654231234','binhlv@gmail.com','Lê Văn Bình',_binary '\0','empty',_binary '',_binary '\0','0934212314','employee1',2),('NV-002','K234/11 Điện Biên Phủ, Gia Lai','1995-12-12 00:00:00.000000','999231723','thiyen@gmail.com','Hồ Thị Yến',_binary '\0','empty',_binary '',_binary '\0','0412352315','employee2',3),('NV-003','77 Hoàng Diệu, Quảng Trị','1980-04-04 00:00:00.000000','123231365','toan0404@gmail.com','Võ Công Toản',_binary '','empty',_binary '\0',_binary '\0','0374443232','employee3',2),('NV-004','43 Yên Bái, Đà Nẵng','1999-12-09 00:00:00.000000','454363232','phatphat@gmail.com','Nguyễn Bỉnh Phát',_binary '\0','empty',_binary '',_binary '\0','0902341231','employee4',1),('NV-005','294 Nguyễn Tất Thành, Đà Nẵng','2000-11-08 00:00:00.000000','964542311','annghi20@gmail.com','Khúc Nguyễn An Nghi',_binary '','empty',_binary '',_binary '\0','0978653213','employee5',4),('NV-006','4 Nguyễn Chí Thanh, Huế','1993-01-01 00:00:00.000000','534323231','nhh0101@gmail.com','Nguyễn Hữu Hà',_binary '\0','empty',_binary '',_binary '\0','0941234553','employee6',5),('NV-007','111 Hùng Vương, Hà Nội','1989-09-03 00:00:00.000000','234414123','donghanguyen@gmail.com','Nguyễn Hà Đông',_binary '','empty',_binary '',_binary '\0','0642123111','employee7',4),('NV-008','213 Hàm Nghi, Đà Nẵng','1982-09-03 00:00:00.000000','256781231','hoangtong@gmail.com','Tòng Hoang',_binary '','empty',_binary '',_binary '\0','0245144444','employee8',6),('NV-009','6 Hoà Khánh, Đồng Nai','1994-01-08 00:00:00.000000','755434343','nguyencongdao12@gmail.com','Nguyễn Công Danh',_binary '','empty',_binary '',_binary '\0','0988767111','employee9',1),('NV-010','6 Hoà Khánh, Đồng Nai','1994-01-08 00:00:00.000000','755434343','nguyencongdao12@gmail.com','Nguyễn Công Du',_binary '','empty',_binary '',_binary '\0','0988767111','employee10',1),('NV-011','6 Hoà Khánh, Đồng Nai','1994-01-08 00:00:00.000000','755434343','nguyencongdao12@gmail.com','Nguyễn Công Đạo',_binary '','empty',_binary '',_binary '\0','0988767111','employee11',1);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movie`
--

DROP TABLE IF EXISTS `movie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movie` (
  `id` int NOT NULL AUTO_INCREMENT,
  `description` text NOT NULL,
  `image` varchar(255) NOT NULL,
  `is_delete` bit(1) NOT NULL,
  `language` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `rating` double NOT NULL,
  `start_day` datetime(6) DEFAULT NULL,
  `status` varchar(255) NOT NULL,
  `time_amount` int NOT NULL,
  `trailer` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie`
--

LOCK TABLES `movie` WRITE;
/*!40000 ALTER TABLE `movie` DISABLE KEYS */;
INSERT INTO `movie` VALUES (1,'\"Khóa Chặt Cửa Nào Suzume\" kể câu chuyện khi Suzume vô tình gặp một chàng trai trẻ đến thị trấn nơi cô sinh sống với mục đích tìm kiếm \"một cánh cửa\". Để bảo vệ Nhật Bản khỏi thảm họa, những cánh cửa rải rác khắp nơi phải được đóng lại, và bất ngờ thay Suzume cũng có khả năng đóng cửa đặc biệt này. Từ đó cả hai cùng nhau thực hiện sự mệnh \"khóa chặt cửa\"!\n		','empty',_binary '\0','English','SUZUME NO TOJIMARI',5,'2023-03-10 00:00:00.000000','1',122,'empty'),(2,'Ming-Han là một cảnh sát nhiệt huyết. Một ngày nọ, trong quá trình truy bắt tội phạm cùng người đồng nghiệp xinh đẹp Zi-Qing, Ming-Han vô tình nhặt được một phong bao màu đỏ, và một nhóm người bất ngờ nhảy ra gọi anh là \"con rể\". Họ yêu cầu anh ta kết hôn với đứa con đã chết của họ.\n        ','empty',_binary '\0','English','MARRY MY DEAD BODY',4.5,'2023-04-07 00:00:00.000000','1',130,'empty'),(3,'Dự án chuyển thể từ trò chơi điện tử huyền thoại gắn liền với tuổi thơ của hàng triệu fan trên toàn thế giới và là sự kết hợp đặc biệt giữa hai “ông lớn” Nintendo và Illumination, Phim Anh Em Super Mario sẽ đưa khán giả quay trở lại từ nguồn gốc về cuộc phiêu lưu đến Vương quốc Nấm của anh chàng thợ sửa ống nước Mario và quá trình anh vươn lên trở thành một huyền thoại\n        ','empty',_binary '\0','English','ANH EM SUPER MARIO',3,'2023-04-07 00:00:00.000000','1',93,'empty'),(4,'Thuộc phong cách hành động – hài hước với các “cú lừa” thông minh và lầy lội đến từ bộ đôi Tú (Anh Tú) và Khoa (Mạc Văn Khoa), Siêu Lừa Gặp Siêu Lầy của đạo diễn Võ Thanh Hòa theo chân của Khoa – tên lừa đảo tầm cỡ “quốc nội” đến đảo ngọc Phú Quốc với mong muốn đổi đời. Tại đây, Khoa gặp Tú – tay lừa đảo “hàng real” và cùng Tú thực hiện các phi vụ từ nhỏ đến lớn\n        ','empty',_binary '\0','Vietnamese','SIÊU LỪA GẶP SIÊU LẦY',3,'2023-03-01 00:00:00.000000','1',112,'empty'),(5,'Lấy cảm hứng từ những hồ sơ có thật của Cha Gabriele Amorth, Trưởng Trừ Tà của Vatican (Russell Crowe, đoạt giải Oscar), bộ phim \"The Popes Exorcist\" theo chân Amorth trong cuộc điều tra về vụ quỷ ám kinh hoàng của một cậu bé và dần khám phá ra những bí mật hàng thế kỷ mà Vatican đã cố gắng giấu kín.\n        ','empty',_binary '\0','USA','KHẮC TINH CỦA QUỶ',3,'2023-04-12 00:00:00.000000','1',104,'empty'),(6,'BIỆT ĐỘI RẤT ỔN xoay quanh bộ đôi Khuê (Hoàng Oanh) và Phong (Hứa Vĩ Văn). Sau lần chạm trán tình cờ, bộ đôi lôi kéo Bảy Cục (Võ Tấn Phát), Bảy Súc (Nguyên Thảo), Quạu (Ngọc Phước), Quọ (Ngọc Hoa) tham gia vào phi vụ đặc biệt','empty',_binary '\0','Vietnamese','BIỆT ĐỘI RẤT ỔN',3,'2023-03-30 00:00:00.000000','1',104,'empty'),(7,'Nhóm du khách trẻ vô tình phá bỏ phong ấn của con quái vật khát máu khi đến tham quan một hòn đảo cấm không dân địa phương nào dám đặt chân đến. Liệu họ có thể bình an thoát khỏi hay đó sẽ là nơi chôn vùi tất cả?\n        ','empty',_binary '\0','Australia','ĐẢO TỘI ÁC',5,'2023-03-31 00:00:00.000000','1',112,'empty'),(8,'Trong câu chuyện quái vật hiện đại về người hầu trung thành của Dracula, Renfield (do Nicholas Hoult thủ vai), kẻ bề tôi đáng thương của ông chủ tự ái nhất lịch sử, Dracula (do Nicolas Cage thủ vai). Renfield bị buộc phải bắt con mồi về cho chủ nhân và thực hiện mọi mệnh lệnh, kể cả việc đó nhục nhã như thế nào.\n        ','empty',_binary '\0','English','TAY SAI CỦA QUỶ',5,'2023-04-14 00:00:00.000000','1',91,'empty'),(9,'Từ đạo diễn đã từng đoạt giải thưởng Ben Affleck, AIR hé lộ mối quan hệ đột phá giữa huyền thoại Michael Jordan khi mới bắt đầu sự nghiệp và bộ phận bóng rổ còn non trẻ của Nike, đã làm thay đổi thế giới thể thao và văn hóa đương đại với thương hiệu Air Jordan\n        ','empty',_binary '\0','English','AIR - THEO ĐUỔI MỘT HUYỀN THOẠI',5,'2023-04-14 00:00:00.000000','1',112,'empty'),(10,'Bộ phim hoạt hình chuyển thể từ loạt truyện tranh “Slam Dunk” nổi tiếng của Takehiko Inoue, khắc họa quá trình trưởng thành cá nhân của những học sinh trung học cống hiến tuổi trẻ cho bóng rổ\n        ','empty',_binary '\0','Japan','PHIM CÚ ÚP RỔ ĐẦU TIÊN',5,'2023-04-14 00:00:00.000000','1',124,'empty'),(11,'Hira, một nam sinh 17 tuổi có một cuộc sống cô độc ở trường, không bao giờ muốn phơi bày tật nói lắp của mình với các bạn cùng lớp. Anh ấy nhìn thế giới qua ống kính máy ảnh của mình, cho đến một ngày Kiyoi Sou bước qua cửa lớp.\n        ','empty',_binary '\0','Japan','CHÀNG TRAI XINH ĐẸP CỦA TÔI',5,'2023-04-14 00:00:00.000000','1',132,'empty'),(12,'Bí ẩn về cái chết của em gái Evie 20 năm trước còn bỏ ngỏ, vào lúc 09:09 hằng đêm, hàng loạt cuộc chạm trán kinh hoàng xảy ra. Liệu Margot có biết được sự thật ai là kẻ giết em gái mình?\n        ','empty',_binary '\0','English','MẶT NẠ QUỶ',5,'2023-04-14 00:00:00.000000','1',102,'empty'),(13,'Theo chân một tên trộm quyến rũ và một nhóm những kẻ bịp bợm nghiệp dư thực hiện vụ trộm sử thi nhằm lấy lại một di vật đã mất, nhưng mọi thứ trở nên nguy hiểm khó lường hơn bao giờ hết khi họ đã chạm trán nhầm người\n        ','empty',_binary '\0','English','NGỤC TỐI & RỒNG: DANH DỰ CỦA KẺ TRỘM',5,'2023-04-21 00:00:00.000000','1',132,'empty'),(14,'Trong nhiệm vụ cuối cùng ở Afghanistan, Trung sĩ John Kinley cùng đội với phiên dịch viên bản địa Ahmed. Khi đơn vị của họ bị phục kích, Kinley và Ahmed là 2 người sống sót duy nhất.\n        ','empty',_binary '\0','English','KHẾ ƯỚC',5,'2023-04-21 00:00:00.000000','1',123,'empty'),(15,'Phim Đầu Gấu Đụng Đầu Đất dựa trên câu chuyện thần thoại nổi tiếng tại Hàn Quốc về hai chú gấu sinh đôi hoá thành người sau khi ăn tỏi và ngải cứu trong 100 ngày. Chú gấu ăn tỏi trở thành Na Woong-nam, được một cặp vợ chồng nhà khoa học mang về nuôi nấng, tuy chỉ mới 25 tuổi nhưng lại sở hữu “giao diện” của một ông chú 52 với cái “đầu đất” ngây thơ, hiền lành.\n        ','empty',_binary '\0','Korea','ĐẦU GẤU ĐỤNG ĐẦU ĐẤT',5,'2023-04-21 00:00:00.000000','1',132,'empty'),(16,'Sau cái chết của cha, Emma (Penelope Sangiorgi) vội vã bay từ New York về quê nhà ở Ý để lo hậu sự. Trong thời gian diễn ra tang lễ, Emma ở một mình trong căn nhà mà cha mẹ để lại.\n        ','empty',_binary '\0','English','ÂM VỰC CHẾT',5,'2023-04-21 00:00:00.000000','1',132,'empty');
/*!40000 ALTER TABLE `movie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movie_actor`
--

DROP TABLE IF EXISTS `movie_actor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movie_actor` (
  `id` int NOT NULL AUTO_INCREMENT,
  `actor_id` int DEFAULT NULL,
  `movie_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK69qnqd5hnjn2aykvxcj72r9i5` (`actor_id`),
  KEY `FKhedvt8u16luotgyoel4fqy7t1` (`movie_id`),
  CONSTRAINT `FK69qnqd5hnjn2aykvxcj72r9i5` FOREIGN KEY (`actor_id`) REFERENCES `actor` (`id`),
  CONSTRAINT `FKhedvt8u16luotgyoel4fqy7t1` FOREIGN KEY (`movie_id`) REFERENCES `movie` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie_actor`
--

LOCK TABLES `movie_actor` WRITE;
/*!40000 ALTER TABLE `movie_actor` DISABLE KEYS */;
INSERT INTO `movie_actor` VALUES (1,8,1),(2,2,1),(3,1,2),(4,6,2),(5,7,3),(6,5,3),(7,12,4),(8,11,4),(9,14,5),(10,1,5),(11,9,6),(12,6,6),(13,10,7),(14,12,7),(15,2,8),(16,3,8),(17,5,9),(18,6,9),(19,13,10),(20,14,10),(21,10,11),(22,1,11),(23,8,12),(24,9,12),(25,7,13),(26,5,13),(27,2,14),(28,3,14),(29,15,15),(30,3,15),(31,5,16),(32,8,16);
/*!40000 ALTER TABLE `movie_actor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movie_and_studio`
--

DROP TABLE IF EXISTS `movie_and_studio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movie_and_studio` (
  `id` int NOT NULL AUTO_INCREMENT,
  `movie_id` int DEFAULT NULL,
  `movie_studio_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKhq0v5jbhcvok8tyuqb06ygy17` (`movie_id`),
  KEY `FKpyu3jw39n8wwdxwojxo81cq5m` (`movie_studio_id`),
  CONSTRAINT `FKhq0v5jbhcvok8tyuqb06ygy17` FOREIGN KEY (`movie_id`) REFERENCES `movie` (`id`),
  CONSTRAINT `FKpyu3jw39n8wwdxwojxo81cq5m` FOREIGN KEY (`movie_studio_id`) REFERENCES `movie_studio` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie_and_studio`
--

LOCK TABLES `movie_and_studio` WRITE;
/*!40000 ALTER TABLE `movie_and_studio` DISABLE KEYS */;
INSERT INTO `movie_and_studio` VALUES (1,1,8),(2,1,2),(3,2,1),(4,2,6),(5,3,7),(6,3,5),(7,4,12),(8,4,11),(9,5,14),(10,5,1),(11,6,9),(12,6,6),(13,7,10),(14,7,12),(15,8,2),(16,8,3),(17,9,5),(18,9,6),(19,10,13),(20,10,14),(21,11,10),(22,11,1),(23,12,8),(24,12,9),(25,13,7),(26,13,5),(27,14,2),(28,14,3),(29,15,15),(30,15,3),(31,16,5),(32,16,8);
/*!40000 ALTER TABLE `movie_and_studio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movie_and_type`
--

DROP TABLE IF EXISTS `movie_and_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movie_and_type` (
  `id` int NOT NULL AUTO_INCREMENT,
  `movie_id` int DEFAULT NULL,
  `movie_type_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKmio8dalb8d2tma5mavyo415b5` (`movie_id`),
  KEY `FK5nw2ujo2tnxgmow7w6xeovrf1` (`movie_type_id`),
  CONSTRAINT `FK5nw2ujo2tnxgmow7w6xeovrf1` FOREIGN KEY (`movie_type_id`) REFERENCES `movie_type` (`id`),
  CONSTRAINT `FKmio8dalb8d2tma5mavyo415b5` FOREIGN KEY (`movie_id`) REFERENCES `movie` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie_and_type`
--

LOCK TABLES `movie_and_type` WRITE;
/*!40000 ALTER TABLE `movie_and_type` DISABLE KEYS */;
INSERT INTO `movie_and_type` VALUES (1,1,8),(2,1,2),(3,2,1),(4,2,6),(5,3,7),(6,3,5),(7,4,12),(8,4,11),(9,5,14),(10,5,1),(11,6,9),(12,6,6),(13,7,10),(14,7,12),(15,8,2),(16,8,3),(17,9,5),(18,9,6),(19,10,13),(20,10,14),(21,11,10),(22,11,1),(23,12,8),(24,12,9),(25,13,7),(26,13,5),(27,14,2),(28,14,3),(29,15,15),(30,15,3),(31,16,5),(32,16,8);
/*!40000 ALTER TABLE `movie_and_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movie_director`
--

DROP TABLE IF EXISTS `movie_director`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movie_director` (
  `id` int NOT NULL AUTO_INCREMENT,
  `director_id` int DEFAULT NULL,
  `movie_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKgn1rkfh7ioiax467kc9dcrcrr` (`director_id`),
  KEY `FKbay4b2v2db4yfaww2oocpld9m` (`movie_id`),
  CONSTRAINT `FKbay4b2v2db4yfaww2oocpld9m` FOREIGN KEY (`movie_id`) REFERENCES `movie` (`id`),
  CONSTRAINT `FKgn1rkfh7ioiax467kc9dcrcrr` FOREIGN KEY (`director_id`) REFERENCES `director` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie_director`
--

LOCK TABLES `movie_director` WRITE;
/*!40000 ALTER TABLE `movie_director` DISABLE KEYS */;
INSERT INTO `movie_director` VALUES (1,8,1),(2,2,1),(3,1,2),(4,6,2),(5,7,3),(6,5,3),(7,12,4),(8,11,4),(9,14,5),(10,1,5),(11,9,6),(12,6,6),(13,10,7),(14,12,7),(15,2,8),(16,3,8),(17,5,9),(18,6,9),(19,13,10),(20,14,10),(21,10,11),(22,1,11),(23,8,12),(24,9,12),(25,7,13),(26,5,13),(27,2,14),(28,3,14),(29,15,15),(30,3,15),(31,5,16),(32,8,16);
/*!40000 ALTER TABLE `movie_director` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movie_studio`
--

DROP TABLE IF EXISTS `movie_studio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movie_studio` (
  `id` int NOT NULL AUTO_INCREMENT,
  `is_delete` bit(1) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie_studio`
--

LOCK TABLES `movie_studio` WRITE;
/*!40000 ALTER TABLE `movie_studio` DISABLE KEYS */;
INSERT INTO `movie_studio` VALUES (1,_binary '\0','CoMix Wave Films'),(2,_binary '\0','Marvel Studios'),(3,_binary '\0','Warner Bros'),(4,_binary '\0','Universal Pictures'),(5,_binary '\0','Walt Disney Studios Motion Pictures'),(6,_binary '\0','20th Century Fox'),(7,_binary '\0','Paramount Pictures'),(8,_binary '\0','Sony Pictures Studios'),(9,_binary '\0','Pixar'),(10,_binary '\0','Dream Works'),(11,_binary '\0','Columbia Pictures'),(12,_binary '\0','The godfather'),(13,_binary '\0','Raging Bull'),(14,_binary '\0','City Lights'),(15,_binary '\0','Psycho'),(16,_binary '\0','The General');
/*!40000 ALTER TABLE `movie_studio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movie_type`
--

DROP TABLE IF EXISTS `movie_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movie_type` (
  `id` int NOT NULL AUTO_INCREMENT,
  `is_delete` bit(1) NOT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie_type`
--

LOCK TABLES `movie_type` WRITE;
/*!40000 ALTER TABLE `movie_type` DISABLE KEYS */;
INSERT INTO `movie_type` VALUES (1,_binary '\0','Kinh Dị'),(2,_binary '\0','Hài'),(3,_binary '\0','Hành Động'),(4,_binary '\0','Hồi hộp'),(5,_binary '\0','Tâm Lý'),(6,_binary '\0','Tình cảm'),(7,_binary '\0','Giả Tưởng'),(8,_binary '\0','Hoạt Hình'),(9,_binary '\0','Bí ẩn'),(10,_binary '\0','Phim tài liệu'),(11,_binary '\0','Phiêu Lưu'),(12,_binary '\0','Khoa Học Viễn Tưởng'),(13,_binary '\0','Thần thoại'),(14,_binary '\0','Tội phạm'),(15,_binary '\0','Gia đình');
/*!40000 ALTER TABLE `movie_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `point`
--

DROP TABLE IF EXISTS `point`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `point` (
  `id` int NOT NULL AUTO_INCREMENT,
  `date` datetime(6) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `is_delete` bit(1) DEFAULT NULL,
  `point` int DEFAULT NULL,
  `customer_id` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKsxldr7490wrbb5nhwoonroutv` (`customer_id`),
  CONSTRAINT `FKsxldr7490wrbb5nhwoonroutv` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `point`
--

LOCK TABLES `point` WRITE;
/*!40000 ALTER TABLE `point` DISABLE KEYS */;
INSERT INTO `point` VALUES (1,'2022-12-09 00:00:00.000000','Điểm tích lũy',_binary '\0',10000,'KH-005'),(2,'2022-12-09 00:00:00.000000','Điểm tích lũy',_binary '\0',10000,'KH-005'),(3,'2022-12-09 00:00:00.000000','Điểm tích lũy',_binary '\0',10000,'KH-005'),(4,'2022-12-09 00:00:00.000000','Điểm tích lũy',_binary '\0',10000,'KH-005'),(5,'2022-12-09 00:00:00.000000','Điểm tích lũy',_binary '\0',10000,'KH-005'),(6,'2022-12-09 00:00:00.000000','Điểm tích lũy',_binary '\0',10000,'KH-005'),(7,'2022-12-09 00:00:00.000000','Điểm tích lũy',_binary '\0',10000,'KH-005'),(8,'2022-12-09 00:00:00.000000','Điểm tích lũy',_binary '\0',10000,'KH-005'),(9,'2023-03-18 00:00:00.000000','Điểm tích lũy',_binary '\0',10000,'KH-005'),(10,'2023-04-01 00:00:00.000000','Điểm tích lũy',_binary '\0',10000,'KH-005'),(11,'2023-03-02 00:00:00.000000','Điểm tích lũy',_binary '\0',10000,'KH-005'),(12,'2023-04-25 17:18:05.292000','Phim : BỐ GIÀ',_binary '\0',4000,'KH-005'),(13,'2023-04-25 17:18:18.036000','Phim : BỐ GIÀ',_binary '\0',4000,'KH-005'),(14,'2023-04-25 17:18:33.401000','Phim : BỐ GIÀ',_binary '\0',4000,'KH-005'),(15,'2023-04-25 17:18:48.245000','Phim : BỐ GIÀ',_binary '\0',4000,'KH-005'),(16,'2023-04-25 17:21:53.955000','Phim : BỐ GIÀ',_binary '\0',4000,'KH-005'),(17,'2023-04-25 17:55:00.618000','Phim : BỐ GIÀ',_binary '\0',4000,'KH-005'),(18,'2023-04-25 18:03:17.501000','Phim : BỐ GIÀ',_binary '\0',4000,'KH-005'),(19,'2023-04-25 18:03:18.149000','Phim : BỐ GIÀ',_binary '\0',4000,'KH-005'),(20,'2023-04-25 18:03:22.214000','Phim : BỐ GIÀ',_binary '\0',4000,'KH-005'),(21,'2023-04-25 18:03:22.857000','Phim : BỐ GIÀ',_binary '\0',4000,'KH-005'),(22,'2023-04-25 18:03:23.246000','Phim : BỐ GIÀ',_binary '\0',4000,'KH-005'),(23,'2023-04-25 18:03:23.588000','Phim : BỐ GIÀ',_binary '\0',4000,'KH-005'),(24,'2023-04-25 18:03:31.870000','Phim : BỐ GIÀ',_binary '\0',4000,'KH-005'),(25,'2023-04-25 18:03:32.560000','Phim : BỐ GIÀ',_binary '',4000,'KH-005'),(26,'2023-04-25 18:03:33.193000','Phim : BỐ GIÀ',_binary '\0',4000,'KH-005'),(27,'2023-04-25 18:03:33.897000','Phim : BỐ GIÀ',_binary '\0',4000,'KH-005'),(28,'2023-04-25 18:03:34.625000','Phim : BỐ GIÀ',_binary '\0',4000,'KH-005'),(29,'2023-04-25 18:03:35.291000','Phim : BỐ GIÀ',_binary '\0',4000,'KH-005'),(30,'2023-04-25 18:03:36.057000','Phim : BỐ GIÀ',_binary '\0',4000,'KH-005'),(31,'2023-04-25 18:03:36.787000','Phim : BỐ GIÀ',_binary '\0',4000,'KH-005'),(32,'2023-04-25 18:03:37.445000','Phim : BỐ GIÀ',_binary '\0',4000,'KH-005'),(33,'2023-04-25 18:03:38.165000','Phim : BỐ GIÀ',_binary '\0',4000,'KH-005'),(34,'2023-04-25 18:03:38.812000','Phim : BỐ GIÀ',_binary '\0',4000,'KH-005'),(35,'2023-04-25 18:03:39.505000','Phim : BỐ GIÀ',_binary '\0',4000,'KH-005'),(36,'2023-04-25 18:03:40.199000','Phim : BỐ GIÀ',_binary '\0',4000,'KH-005'),(37,'2023-04-25 18:03:40.870000','Phim : BỐ GIÀ',_binary '\0',4000,'KH-005'),(38,'2023-04-25 18:03:48.822000','Phim : BỐ GIÀ',_binary '\0',4000,'KH-005'),(39,'2023-04-25 18:03:49.496000','Phim : BỐ GIÀ',_binary '\0',4000,'KH-005'),(40,'2023-04-25 18:03:50.099000','Phim : BỐ GIÀ',_binary '\0',4000,'KH-005'),(41,'2023-04-25 18:03:50.739000','Phim : BỐ GIÀ',_binary '\0',4000,'KH-005'),(42,'2023-04-25 18:03:51.424000','Phim : BỐ GIÀ',_binary '\0',4000,'KH-005'),(43,'2023-04-25 18:03:52.106000','Phim : BỐ GIÀ',_binary '\0',4000,'KH-005'),(44,'2023-04-25 18:03:52.871000','Phim : BỐ GIÀ',_binary '\0',4000,'KH-005'),(45,'2023-04-25 18:03:53.585000','Phim : BỐ GIÀ',_binary '\0',4000,'KH-005'),(46,'2023-04-25 18:03:54.290000','Phim : BỐ GIÀ',_binary '\0',4000,'KH-005'),(47,'2023-04-25 18:03:55.007000','Phim : BỐ GIÀ',_binary '\0',4000,'KH-005'),(48,'2023-04-25 18:14:45.703000','Phim : BỐ GIÀ',_binary '\0',4000,'KH-005'),(49,'2023-04-25 18:19:44.797000','Phim : BỐ GIÀ',_binary '',4000,'KH-005'),(50,'2023-04-25 18:21:15.410000','Phim : BỐ GIÀ',_binary '',4000,'KH-005'),(51,'2023-04-25 18:25:19.801000','Phim : BỐ GIÀ',_binary '',4000,'KH-005'),(52,'2023-04-25 18:25:33.347000','Phim : BỐ GIÀ',_binary '',4000,'KH-005'),(53,'2023-04-25 18:32:01.503000','Phim : BỐ GIÀ',_binary '',4000,'KH-006'),(54,'2023-04-25 18:32:26.654000','Phim : SUPERMAN',_binary '',4000,'KH-006'),(55,'2023-04-26 20:17:29.091000','SUPERMAN AND BATMAN',_binary '\0',4000,'KH-005'),(56,'2023-04-26 20:17:48.068000','AND BATMAN',_binary '\0',4000,'KH-005');
/*!40000 ALTER TABLE `point` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `position`
--

DROP TABLE IF EXISTS `position`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `position` (
  `id` int NOT NULL AUTO_INCREMENT,
  `is_delete` bit(1) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `position`
--

LOCK TABLES `position` WRITE;
/*!40000 ALTER TABLE `position` DISABLE KEYS */;
INSERT INTO `position` VALUES (1,_binary '\0','Lễ tân'),(2,_binary '\0','Phục vụ'),(3,_binary '\0','Nhân Viên Bán vé'),(4,_binary '\0','Giám sát'),(5,_binary '\0','Quản lý'),(6,_binary '\0','Giám đốc');
/*!40000 ALTER TABLE `position` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `promotion`
--

DROP TABLE IF EXISTS `promotion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `promotion` (
  `id` int NOT NULL AUTO_INCREMENT,
  `description` varchar(255) NOT NULL,
  `is_delete` bit(1) DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  `sale_off` double NOT NULL,
  `time` datetime(6) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `promotion`
--

LOCK TABLES `promotion` WRITE;
/*!40000 ALTER TABLE `promotion` DISABLE KEYS */;
/*!40000 ALTER TABLE `promotion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `promotionv02`
--

DROP TABLE IF EXISTS `promotionv02`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `promotionv02` (
  `id` int NOT NULL AUTO_INCREMENT,
  `condition_promotion` text NOT NULL,
  `content` text NOT NULL,
  `description` text NOT NULL,
  `image` varchar(255) NOT NULL,
  `is_delete` bit(1) DEFAULT NULL,
  `location` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `time` varchar(255) DEFAULT NULL,
  `title` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `promotionv02`
--

LOCK TABLES `promotionv02` WRITE;
/*!40000 ALTER TABLE `promotionv02` DISABLE KEYS */;
/*!40000 ALTER TABLE `promotionv02` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rating_movie`
--

DROP TABLE IF EXISTS `rating_movie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rating_movie` (
  `id` int NOT NULL AUTO_INCREMENT,
  `is_delete` bit(1) DEFAULT NULL,
  `rating` double NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `movie_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKg0qpt2u830jgmvu1ibewgvt1q` (`movie_id`),
  CONSTRAINT `FKg0qpt2u830jgmvu1ibewgvt1q` FOREIGN KEY (`movie_id`) REFERENCES `movie` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rating_movie`
--

LOCK TABLES `rating_movie` WRITE;
/*!40000 ALTER TABLE `rating_movie` DISABLE KEYS */;
/*!40000 ALTER TABLE `rating_movie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role` (
  `id` int NOT NULL AUTO_INCREMENT,
  `is_delete` bit(1) DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,_binary '\0','ROLE_ADMIN'),(2,_binary '\0','ROLE_EMPLOYEE'),(3,_binary '\0','ROLE_CUSTOMER');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `room` (
  `id` int NOT NULL AUTO_INCREMENT,
  `is_delete` bit(1) DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  `screen` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room`
--

LOCK TABLES `room` WRITE;
/*!40000 ALTER TABLE `room` DISABLE KEYS */;
INSERT INTO `room` VALUES (1,_binary '\0','A04 Cinema Room 1','A04 Cinema Screen 1'),(2,_binary '\0','A04 Cinema Room 2','A04 Cinema Screen 1'),(3,_binary '\0','A04 Cinema Room 3','A04 Cinema Screen 1'),(4,_binary '\0','A04 Cinema Room 4','A04 Cinema Screen 1');
/*!40000 ALTER TABLE `room` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `show_time`
--

DROP TABLE IF EXISTS `show_time`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `show_time` (
  `id` int NOT NULL AUTO_INCREMENT,
  `date` datetime(6) NOT NULL,
  `end_time` varchar(255) DEFAULT NULL,
  `is_delete` bit(1) DEFAULT NULL,
  `sold_out` bit(1) NOT NULL,
  `start_time` varchar(255) NOT NULL,
  `movie_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK8e72rkmjwjag9nshwu5hvh6b4` (`movie_id`),
  CONSTRAINT `FK8e72rkmjwjag9nshwu5hvh6b4` FOREIGN KEY (`movie_id`) REFERENCES `movie` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `show_time`
--

LOCK TABLES `show_time` WRITE;
/*!40000 ALTER TABLE `show_time` DISABLE KEYS */;
INSERT INTO `show_time` VALUES (1,'2023-05-15 00:00:00.000000','17:10',_binary '\0',_binary '\0','15:00',1),(2,'2023-03-10 00:00:00.000000','15:10',_binary '\0',_binary '\0','13:00',1),(3,'2023-04-07 00:00:00.000000','11:10',_binary '\0',_binary '\0','09:00',2),(4,'2023-04-07 00:00:00.000000','21:00',_binary '\0',_binary '\0','19:00',2),(5,'2023-04-07 00:00:00.000000','11:10',_binary '\0',_binary '\0','09:00',3),(6,'2023-04-07 00:00:00.000000','21:00',_binary '\0',_binary '\0','19:00',3),(7,'2023-03-01 00:00:00.000000','11:10',_binary '\0',_binary '\0','09:00',4),(8,'2023-03-01 00:00:00.000000','21:00',_binary '\0',_binary '\0','19:00',4),(9,'2023-04-12 00:00:00.000000','11:10',_binary '\0',_binary '\0','09:00',5),(10,'2023-04-12 00:00:00.000000','21:00',_binary '\0',_binary '\0','19:00',5),(11,'2023-03-30 00:00:00.000000','11:10',_binary '\0',_binary '\0','09:00',6),(12,'2023-03-30 00:00:00.000000','21:00',_binary '\0',_binary '\0','19:00',6),(13,'2023-03-31 00:00:00.000000','11:10',_binary '\0',_binary '\0','09:00',7),(14,'2023-03-31 00:00:00.000000','21:00',_binary '\0',_binary '\0','19:00',7),(15,'2023-04-14 00:00:00.000000','11:10',_binary '\0',_binary '\0','09:00',8),(16,'2023-04-14 00:00:00.000000','21:00',_binary '\0',_binary '\0','19:00',8),(17,'2023-04-14 00:00:00.000000','11:10',_binary '\0',_binary '\0','09:00',9),(18,'2023-04-14 00:00:00.000000','21:00',_binary '\0',_binary '\0','19:00',9);
/*!40000 ALTER TABLE `show_time` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticket`
--

DROP TABLE IF EXISTS `ticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ticket` (
  `id` varchar(20) NOT NULL,
  `book_date_time` datetime(6) DEFAULT NULL,
  `is_delete` bit(1) DEFAULT NULL,
  `price` double NOT NULL,
  `status` bit(1) NOT NULL,
  `chair_room_id` int DEFAULT NULL,
  `customer_id` varchar(20) DEFAULT NULL,
  `showtime_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKvo5widx306e73p65070drjtc` (`chair_room_id`),
  KEY `FKmli0eqrecnnqvdgv3kcx7d9m8` (`customer_id`),
  KEY `FK5oppeqt51jnppkg0ml7i3qrb1` (`showtime_id`),
  CONSTRAINT `FK5oppeqt51jnppkg0ml7i3qrb1` FOREIGN KEY (`showtime_id`) REFERENCES `show_time` (`id`),
  CONSTRAINT `FKmli0eqrecnnqvdgv3kcx7d9m8` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`),
  CONSTRAINT `FKvo5widx306e73p65070drjtc` FOREIGN KEY (`chair_room_id`) REFERENCES `chair_room` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket`
--

LOCK TABLES `ticket` WRITE;
/*!40000 ALTER TABLE `ticket` DISABLE KEYS */;
INSERT INTO `ticket` VALUES ('1','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '',1,NULL,1),('10','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '',10,NULL,1),('11','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '',11,NULL,1),('12','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '',12,NULL,1),('13','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '',13,NULL,1),('14','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '',14,NULL,1),('15','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '',15,NULL,1),('16','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '',16,NULL,1),('17','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '',17,NULL,1),('18','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '',18,NULL,1),('19','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '',19,NULL,1),('2','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '',2,NULL,1),('20','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '',20,NULL,1),('21','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '\0',21,NULL,1),('22','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '\0',22,NULL,1),('23','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '\0',23,NULL,1),('24','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '\0',24,NULL,1),('25','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '\0',25,NULL,1),('26','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '\0',26,'KH-005',1),('27','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '\0',27,'KH-005',1),('28','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '\0',28,'KH-005',1),('29','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '\0',29,'KH-005',1),('3','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '',3,'KH-005',1),('30','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '\0',30,'KH-005',1),('31','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '\0',31,'KH-005',1),('32','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '\0',32,'KH-005',1),('33','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '\0',33,'KH-005',1),('34','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '\0',34,'KH-005',1),('35','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '\0',35,'KH-005',1),('36','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '\0',36,'KH-005',1),('37','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '\0',37,'KH-005',1),('38','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '\0',38,'KH-005',1),('39','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '\0',39,'KH-005',1),('4','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '\0',4,'KH-005',1),('40','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '\0',40,'KH-005',1),('5','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '',5,NULL,1),('6','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '',6,NULL,1),('7','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '',7,NULL,1),('8','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '',8,NULL,1),('9','2023-03-10 00:00:00.000000',_binary '\0',40000,_binary '',9,NULL,1);
/*!40000 ALTER TABLE `ticket` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-15  0:51:30
