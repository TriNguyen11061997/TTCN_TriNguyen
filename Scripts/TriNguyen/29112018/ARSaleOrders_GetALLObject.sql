DELIMITER $$

USE `ttcn`$$

DROP PROCEDURE IF EXISTS `ARSaleOrders_GetALLObject`$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `ARSaleOrders_GetALLObjectForEmployee`()
BEGIN
	SELECT 	*
	FROM 	ARSaleOrders so
	WHERE	so.AAStatus = 'Alive'
	AND	so.ARSaleOrderStatus = 'New';
	END$$

DELIMITER ;