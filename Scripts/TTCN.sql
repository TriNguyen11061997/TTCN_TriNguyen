/*
SQLyog Community v13.0.0 (64 bit)
MySQL - 5.7.24-log : Database - ttcn
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ttcn` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ttcn`;

/*Table structure for table `adusergroups` */

DROP TABLE IF EXISTS `adusergroups`;

CREATE TABLE `adusergroups` (
  `ADUserGroupID` int(11) NOT NULL AUTO_INCREMENT,
  `AAStatus` varchar(1024) DEFAULT NULL,
  `ADUserGroupName` varchar(1024) DEFAULT NULL,
  `ADUserGroupDesc` varchar(1024) DEFAULT NULL,
  PRIMARY KEY (`ADUserGroupID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `adusergroups` */

/*Table structure for table `adusers` */

DROP TABLE IF EXISTS `adusers`;

CREATE TABLE `adusers` (
  `ADUserID` int(11) NOT NULL AUTO_INCREMENT,
  `AAStatus` varchar(1024) DEFAULT NULL,
  `AACreatedDate` datetime DEFAULT NULL,
  `AAUpdatedDate` datetime DEFAULT NULL,
  `AACreatedUser` varchar(1024) DEFAULT NULL,
  `AAUpdatedUser` varchar(1024) DEFAULT NULL,
  `FK_HREmployeeID` int(11) DEFAULT NULL,
  `FK_ADUserGroupID` int(11) DEFAULT NULL,
  `ADUserName` varchar(1024) DEFAULT NULL,
  `ADPassword` varchar(1024) DEFAULT NULL,
  `ADUserActiveCheck` bit(1) DEFAULT NULL,
  `ADUserResetToken` varchar(1024) DEFAULT NULL,
  PRIMARY KEY (`ADUserID`),
  KEY `FK_HREmployeeID` (`FK_HREmployeeID`),
  KEY `FK_ADUserGroupID` (`FK_ADUserGroupID`),
  CONSTRAINT `adusers_ibfk_1` FOREIGN KEY (`FK_HREmployeeID`) REFERENCES `hremployees` (`HREmployeeID`),
  CONSTRAINT `adusers_ibfk_2` FOREIGN KEY (`FK_ADUserGroupID`) REFERENCES `adusergroups` (`ADUserGroupID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `adusers` */

/*Table structure for table `arcarts` */

DROP TABLE IF EXISTS `arcarts`;

CREATE TABLE `arcarts` (
  `ARCartID` int(11) NOT NULL AUTO_INCREMENT,
  `AAStatus` varchar(1024) DEFAULT NULL,
  `ARCartNo` varchar(1024) DEFAULT NULL,
  `ARCartName` varchar(1024) DEFAULT NULL,
  `ARCartQty` decimal(10,0) DEFAULT NULL,
  `FK_ICProductID` int(11) DEFAULT NULL,
  `FK_ARCustomerID` int(11) DEFAULT NULL,
  `ARCartStatus` varchar(1024) DEFAULT NULL,
  `ARCartDate` datetime DEFAULT NULL,
  PRIMARY KEY (`ARCartID`),
  KEY `FK_ICProductID` (`FK_ICProductID`),
  KEY `FK_ARCustomerID` (`FK_ARCustomerID`),
  CONSTRAINT `arcarts_ibfk_1` FOREIGN KEY (`FK_ICProductID`) REFERENCES `icproducts` (`ICProductID`),
  CONSTRAINT `arcarts_ibfk_2` FOREIGN KEY (`FK_ARCustomerID`) REFERENCES `arcustomers` (`ARCustomerID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `arcarts` */

/*Table structure for table `arcustomercomments` */

DROP TABLE IF EXISTS `arcustomercomments`;

CREATE TABLE `arcustomercomments` (
  `ARCustomerCommentID` int(11) NOT NULL AUTO_INCREMENT,
  `AAStatus` varchar(1024) DEFAULT NULL,
  `ARCustomerCommentDate` varchar(1024) DEFAULT NULL,
  `ARCustomerCommentDesc` varchar(1024) DEFAULT NULL,
  `FK_ARCustomerID` int(11) DEFAULT NULL,
  `FK_ICProductID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ARCustomerCommentID`),
  KEY `FK_ARCustomerID` (`FK_ARCustomerID`),
  KEY `FK_ICProductID` (`FK_ICProductID`),
  CONSTRAINT `arcustomercomments_ibfk_1` FOREIGN KEY (`FK_ARCustomerID`) REFERENCES `arcustomers` (`ARCustomerID`),
  CONSTRAINT `arcustomercomments_ibfk_2` FOREIGN KEY (`FK_ICProductID`) REFERENCES `icproducts` (`ICProductID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `arcustomercomments` */

/*Table structure for table `arcustomers` */

DROP TABLE IF EXISTS `arcustomers`;

CREATE TABLE `arcustomers` (
  `ARCustomerID` int(11) NOT NULL AUTO_INCREMENT,
  `AAStatus` varchar(1024) DEFAULT NULL,
  `AACreatedUser` varchar(1024) DEFAULT NULL,
  `AAUpdatedUser` varchar(1024) DEFAULT NULL,
  `AACreatedDate` datetime DEFAULT NULL,
  `AAUpdatedDate` datetime DEFAULT NULL,
  `ARCustomerNo` varchar(1024) DEFAULT NULL,
  `ARCustomerName` varchar(1024) DEFAULT NULL,
  `ARCustomerGender` bit(1) DEFAULT NULL,
  `ARCustomerBirthDay` datetime DEFAULT NULL,
  `ARCustomerStatus` varchar(1024) DEFAULT NULL,
  `ARCustomerDesc` varchar(1024) DEFAULT NULL,
  `ARCustomerPicture` varbinary(1000) DEFAULT NULL,
  `ARCustomerIDNumber` varchar(1024) DEFAULT NULL,
  `ARCustomerCardNumber` varchar(1024) DEFAULT NULL,
  `ARCustomerTaxNumber` varchar(1024) DEFAULT NULL,
  `ARCustomerStartWorkingDate` datetime DEFAULT NULL,
  `ARCustomerEndWorkingDate` datetime DEFAULT NULL,
  `ARCustomerTel1` varchar(1024) DEFAULT NULL,
  `ARCustomerTel2` varchar(1024) DEFAULT NULL,
  `ARCustomerEmail` varchar(1024) DEFAULT NULL,
  `ARCustomerContactAddress` varchar(1024) DEFAULT NULL,
  `ARCustomerContactAddressCity` varchar(1024) DEFAULT NULL,
  `ARCustomerContactAddressCountry` varchar(1024) DEFAULT NULL,
  PRIMARY KEY (`ARCustomerID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `arcustomers` */

/*Table structure for table `arsaleorderitems` */

DROP TABLE IF EXISTS `arsaleorderitems`;

CREATE TABLE `arsaleorderitems` (
  `ARSaleOrderItemID` int(11) NOT NULL AUTO_INCREMENT,
  `AACreatedDate` datetime DEFAULT NULL,
  `AACreatedUser` varchar(1024) DEFAULT NULL,
  `AAUpdatedDate` datetime DEFAULT NULL,
  `AAUpdatedUser` varchar(1024) DEFAULT NULL,
  `AAStatus` varchar(1024) DEFAULT NULL,
  `FK_ARCustomerID` int(11) DEFAULT NULL,
  `FK_HREmployeeID` int(11) DEFAULT NULL,
  `FK_ARSaleOrderID` int(11) DEFAULT NULL,
  `FK_ICProductID` int(11) DEFAULT NULL,
  `ARSaleOrderItemNo` varchar(1024) DEFAULT NULL,
  `ARSaleOrderItemName` varchar(1024) DEFAULT NULL,
  `ARSaleOrderItemDesc` varchar(1024) DEFAULT NULL,
  `ARSaleOrderItemComment` varchar(1024) DEFAULT NULL,
  `ARSaleOrderItemStatus` varchar(1024) DEFAULT NULL,
  `ARSaleOrderItemDate` datetime DEFAULT NULL,
  `ARSaleOrderItemDiscountPerCent` decimal(10,0) DEFAULT NULL,
  `ARSaleOrderItemDiscountAmount` decimal(10,0) DEFAULT NULL,
  `ARSaleOrderItemTaxPercent` decimal(10,0) DEFAULT NULL,
  `ARSaleOrderItemTaxAmount` decimal(10,0) DEFAULT NULL,
  `ARSaleOrderItemShippingFees` decimal(10,0) DEFAULT NULL,
  `ARSaleOrderItemTotalAmount` decimal(10,0) DEFAULT NULL,
  `ARSaleOrderItemPaymentMethod` varchar(1024) DEFAULT NULL,
  `ARSaleOrderItemPaymentStatus` varchar(1024) DEFAULT NULL,
  `ARSaleOrderUnitCost` decimal(10,0) DEFAULT NULL,
  `ARSaleOrderQty` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`ARSaleOrderItemID`),
  KEY `FK_ARCustomerID` (`FK_ARCustomerID`),
  KEY `FK_HREmployeeID` (`FK_HREmployeeID`),
  KEY `FK_ARSaleOrderID` (`FK_ARSaleOrderID`),
  KEY `FK_ICProductID` (`FK_ICProductID`),
  CONSTRAINT `arSaleOrderItems_ibfk_1` FOREIGN KEY (`FK_ARCustomerID`) REFERENCES `arcustomers` (`ARCustomerID`),
  CONSTRAINT `arSaleOrderItems_ibfk_2` FOREIGN KEY (`FK_HREmployeeID`) REFERENCES `hremployees` (`HREmployeeID`),
  CONSTRAINT `arSaleOrderItems_ibfk_3` FOREIGN KEY (`FK_ARSaleOrderID`) REFERENCES `arsaleorders` (`ARSaleOrderID`),
  CONSTRAINT `arSaleOrderItems_ibfk_4` FOREIGN KEY (`FK_ICProductID`) REFERENCES `icproducts` (`ICProductID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `arsaleorderitems` */

/*Table structure for table `arsaleorders` */

DROP TABLE IF EXISTS `arsaleorders`;

CREATE TABLE `arsaleorders` (
  `ARSaleOrderID` int(11) NOT NULL AUTO_INCREMENT,
  `AACreatedDate` datetime DEFAULT NULL,
  `AACreatedUser` varchar(1024) DEFAULT NULL,
  `AAUpdatedDate` datetime DEFAULT NULL,
  `AAUpdatedUser` varchar(1024) DEFAULT NULL,
  `AAStatus` varchar(1024) DEFAULT NULL,
  `FK_ARCustomerID` int(11) DEFAULT NULL,
  `FK_HREmployeeID` int(11) DEFAULT NULL,
  `ARSaleOrderNo` varchar(1024) DEFAULT NULL,
  `ARSaleOrderName` varchar(1024) DEFAULT NULL,
  `ARSaleOrderDesc` varchar(1024) DEFAULT NULL,
  `ARSaleOrderComment` varchar(1024) DEFAULT NULL,
  `ARSaleOrderStatus` varchar(1024) DEFAULT NULL,
  `ARSaleOrderDate` datetime DEFAULT NULL,
  `ARSaleOrderDiscountPerCent` decimal(10,0) DEFAULT NULL,
  `ARSaleOrderDiscountAmount` decimal(10,0) DEFAULT NULL,
  `ARSaleOrderTaxPercent` decimal(10,0) DEFAULT NULL,
  `ARSaleOrderTaxAmount` decimal(10,0) DEFAULT NULL,
  `ARSaleOrderShippingFees` decimal(10,0) DEFAULT NULL,
  `ARSaleOrderTotalAmount` decimal(10,0) DEFAULT NULL,
  `ARSaleOrderPaymentMethod` varchar(1024) DEFAULT NULL,
  `ARSaleOrderPaymentStatus` varchar(1024) DEFAULT NULL,
  PRIMARY KEY (`ARSaleOrderID`),
  KEY `FK_ARCustomerID` (`FK_ARCustomerID`),
  KEY `FK_HREmployeeID` (`FK_HREmployeeID`),
  CONSTRAINT `arsaleorders_ibfk_1` FOREIGN KEY (`FK_ARCustomerID`) REFERENCES `arcustomers` (`ARCustomerID`),
  CONSTRAINT `arsaleorders_ibfk_2` FOREIGN KEY (`FK_HREmployeeID`) REFERENCES `hremployees` (`HREmployeeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `arsaleorders` */

/*Table structure for table `hremployeecomments` */

DROP TABLE IF EXISTS `hremployeecomments`;

CREATE TABLE `hremployeecomments` (
  `HREmployeeCommentID` int(11) NOT NULL AUTO_INCREMENT,
  `AAStatus` int(11) DEFAULT NULL,
  `HREmployeeCommentNo` varchar(1024) DEFAULT NULL,
  `HREmployeeCommentDesc` varchar(1024) DEFAULT NULL,
  `FK_ARCustomerCommentID` int(11) DEFAULT NULL,
  `FK_ICProductID` int(11) DEFAULT NULL,
  PRIMARY KEY (`HREmployeeCommentID`),
  KEY `FK_ICProductID` (`FK_ICProductID`),
  KEY `FK_ARCustomerCommentID` (`FK_ARCustomerCommentID`),
  CONSTRAINT `hremployeecomments_ibfk_1` FOREIGN KEY (`FK_ICProductID`) REFERENCES `icproducts` (`ICProductID`),
  CONSTRAINT `hremployeecomments_ibfk_2` FOREIGN KEY (`FK_ARCustomerCommentID`) REFERENCES `arcustomercomments` (`ARCustomerCommentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `hremployeecomments` */

/*Table structure for table `hremployees` */

DROP TABLE IF EXISTS `hremployees`;

CREATE TABLE `hremployees` (
  `HREmployeeID` int(11) NOT NULL AUTO_INCREMENT,
  `AAStatus` varchar(1024) DEFAULT NULL,
  `AACreatedUser` varchar(1024) DEFAULT NULL,
  `AAUpdatedUser` varchar(1024) DEFAULT NULL,
  `AACreatedDate` datetime DEFAULT NULL,
  `AAUpdatedDate` datetime DEFAULT NULL,
  `HREmployeeNo` varchar(1024) DEFAULT NULL,
  `HREmployeeName` varchar(1024) DEFAULT NULL,
  `HREmployeeGender` bit(1) DEFAULT NULL,
  `HREmployeeBirthDay` datetime DEFAULT NULL,
  `HREmployeeStatus` varchar(1024) DEFAULT NULL,
  `HREmployeeDesc` varchar(1024) DEFAULT NULL,
  `HREmployeePicture` varbinary(1000) DEFAULT NULL,
  `HREmployeeIDNumber` varchar(1024) DEFAULT NULL,
  `HREmployeeCardNumber` varchar(1024) DEFAULT NULL,
  `HREmployeeTaxNumber` varchar(1024) DEFAULT NULL,
  `HREmployeeStartWorkingDate` datetime DEFAULT NULL,
  `HREmployeeEndWorkingDate` datetime DEFAULT NULL,
  `HREmployeeTel1` varchar(1024) DEFAULT NULL,
  `HREmployeeTel2` varchar(1024) DEFAULT NULL,
  `HREmployeeEmail` varchar(1024) DEFAULT NULL,
  `HREmployeeContactAddress` varchar(1024) DEFAULT NULL,
  `HREmployeeContactAddressCity` varchar(1024) DEFAULT NULL,
  `HREmployeeContactAddressCountry` varchar(1024) DEFAULT NULL,
  PRIMARY KEY (`HREmployeeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `hremployees` */

/*Table structure for table `icinventorystocks` */

DROP TABLE IF EXISTS `icinventorystocks`;

CREATE TABLE `icinventorystocks` (
  `ICInventoryStockID` int(11) NOT NULL AUTO_INCREMENT,
  `AAStatus` varchar(1024) DEFAULT NULL,
  `ICInventoryStockName` varchar(1024) DEFAULT NULL,
  `ICInventoryStockQty` decimal(10,0) DEFAULT NULL,
  `ICInventoryStockReceiptQty` decimal(10,0) DEFAULT NULL,
  `ICInventoryStockShipmentQty` decimal(10,0) DEFAULT NULL,
  `FK_ICProductID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ICInventoryStockID`),
  KEY `FK_ICProductID` (`FK_ICProductID`),
  CONSTRAINT `icinventorystocks_ibfk_1` FOREIGN KEY (`FK_ICProductID`) REFERENCES `icproducts` (`ICProductID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `icinventorystocks` */

/*Table structure for table `icproductdetails` */

DROP TABLE IF EXISTS `icproductdetails`;

CREATE TABLE `icproductdetails` (
  `ICProductDetailID` int(11) NOT NULL AUTO_INCREMENT,
  `FK_ICProductID` int(11) DEFAULT NULL,
  `ICProductDetail3G` varchar(1024) DEFAULT NULL,
  `ICProductDetail4G` varchar(1024) DEFAULT NULL,
  `ICProductDetailSIM` varchar(1024) DEFAULT NULL,
  `ICProductDetailKichThuoc` varchar(1024) DEFAULT NULL,
  `ICProductDetailMauSac` varchar(1024) DEFAULT NULL,
  `ICProductDetailTrongLuong` varchar(1024) DEFAULT NULL,
  `ICProductDetailLoai` varchar(1024) DEFAULT NULL,
  `ICProductDetailManHinh` varchar(1024) DEFAULT NULL,
  `ICProductDetailAudio` varchar(1024) DEFAULT NULL,
  `ICProductDetailLoaNgoai` varchar(1024) DEFAULT NULL,
  `ICProductDetailVideo` varchar(1024) DEFAULT NULL,
  `ICProductDetailBoNhoTrong` varchar(1024) DEFAULT NULL,
  `ICProductDetailBluetooth` varchar(1024) DEFAULT NULL,
  `ICProductDetailGPS` varchar(1024) DEFAULT NULL,
  `ICProductDetailPin` varchar(1024) DEFAULT NULL,
  `ICProductDetailWLAN` varchar(1024) DEFAULT NULL,
  `ICProductDetailCameraChinh` varchar(1024) DEFAULT NULL,
  `ICProductDetailCamaraPhu` varchar(1024) DEFAULT NULL,
  `ICProductDetailQuayPhim` varchar(1024) DEFAULT NULL,
  `ICProductDetailCPU` varchar(1024) DEFAULT NULL,
  `ICProductDetailBaoHanh` varchar(1024) DEFAULT NULL,
  PRIMARY KEY (`ICProductDetailID`),
  KEY `FK_ICProductID` (`FK_ICProductID`),
  CONSTRAINT `icproductdetails_ibfk_1` FOREIGN KEY (`FK_ICProductID`) REFERENCES `icproducts` (`ICProductID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `icproductdetails` */

/*Table structure for table `icproducts` */

DROP TABLE IF EXISTS `icproducts`;

CREATE TABLE `icproducts` (
  `ICProductID` int(11) NOT NULL AUTO_INCREMENT,
  `AACreatedUser` varchar(1024) DEFAULT NULL,
  `AACreatedDate` datetime DEFAULT NULL,
  `AAUpdatedUser` varchar(1024) DEFAULT NULL,
  `AAUpdatedDate` datetime DEFAULT NULL,
  `AAStatus` varchar(1024) DEFAULT NULL,
  `ICProductNo` varchar(1024) DEFAULT NULL,
  `ICProductSupplierNumber` varchar(1024) DEFAULT NULL,
  `ICProductSupplierPrice` decimal(10,0) DEFAULT NULL,
  `ICProductName` varchar(1024) DEFAULT NULL,
  `ICProductDesc` varchar(1024) DEFAULT NULL,
  `ICProductActiveCheck` bit(1) DEFAULT NULL,
  `FK_HREmployeeID` int(11) DEFAULT NULL,
  `ICProductPromotion` varchar(1024) DEFAULT NULL,
  `ICProductPicture1` varbinary(1024) DEFAULT NULL,
  `ICProductPicture2` varbinary(1024) DEFAULT NULL,
  `ICProductPicture3` varbinary(1024) DEFAULT NULL,
  `ICProductPicture4` varbinary(1024) DEFAULT NULL,
  `ICProductPicture5` varbinary(1024) DEFAULT NULL,
  `ICProductPicture6` varbinary(1024) DEFAULT NULL,
  `ICProductPicture7` varbinary(1024) DEFAULT NULL,
  `ICProductPicture8` varbinary(1024) DEFAULT NULL,
  `ICProductVideo` varchar(1024) DEFAULT NULL,
  `ICProductDetailHeDieuHanh` varchar(1024) DEFAULT NULL,
  PRIMARY KEY (`ICProductID`),
  KEY `FK_HREmployeeID` (`FK_HREmployeeID`),
  CONSTRAINT `icproducts_ibfk_1` FOREIGN KEY (`FK_HREmployeeID`) REFERENCES `hremployees` (`HREmployeeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `icproducts` */

/* Procedure structure for procedure `ARCarts_GetALLObject` */

/*!50003 DROP PROCEDURE IF EXISTS  `ARCarts_GetALLObject` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `ARCarts_GetALLObject`()
BEGIN
	SELECT 	*
	FROM 	ARCarts arc
	WHERE	arc.AAStatus = 'Alive';	
	END */$$
DELIMITER ;

/* Procedure structure for procedure `ARCustomerComments_GetALLObject` */

/*!50003 DROP PROCEDURE IF EXISTS  `ARCustomerComments_GetALLObject` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `ARCustomerComments_GetALLObject`()
BEGIN
	SELECT 	*
	FROM 	ARCustomerComments cc
	WHERE	cc.AAStatus = 'Alive';	
	END */$$
DELIMITER ;

/* Procedure structure for procedure `ARCustomers_GetALLObject` */

/*!50003 DROP PROCEDURE IF EXISTS  `ARCustomers_GetALLObject` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `ARCustomers_GetALLObject`()
BEGIN
	SELECT 	*
	FROM 	ARCustomers arc
	WHERE	arc.AAStatus = 'Alive';	
	END */$$
DELIMITER ;

/* Procedure structure for procedure `ARSaleOrderItems_GetALLObject` */

/*!50003 DROP PROCEDURE IF EXISTS  `ARSaleOrderItems_GetALLObject` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `ARSaleOrderItems_GetALLObject`()
BEGIN
	SELECT 	*
	FROM 	ARSaleOrderItems so
	WHERE	so.AAStatus = 'Alive';	
	END */$$
DELIMITER ;

/* Procedure structure for procedure `ARSaleOrders_GetALLObject` */

/*!50003 DROP PROCEDURE IF EXISTS  `ARSaleOrders_GetALLObject` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `ARSaleOrders_GetALLObject`()
BEGIN
	SELECT 	*
	FROM 	ARSaleOrders so
	WHERE	so.AAStatus = 'Alive';	
	END */$$
DELIMITER ;

/* Procedure structure for procedure `HREmployeeComments_GetALLObject` */

/*!50003 DROP PROCEDURE IF EXISTS  `HREmployeeComments_GetALLObject` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `HREmployeeComments_GetALLObject`()
BEGIN
	SELECT 	*
	FROM 	HREmployeeComments e
	WHERE	e.AAStatus = 'Alive';	
	END */$$
DELIMITER ;

/* Procedure structure for procedure `HREmployees_GetALLObject` */

/*!50003 DROP PROCEDURE IF EXISTS  `HREmployees_GetALLObject` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `HREmployees_GetALLObject`()
BEGIN
	SELECT 	*
	FROM 	HREmployees e
	WHERE	e.AAStatus = 'Alive';	
	END */$$
DELIMITER ;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
