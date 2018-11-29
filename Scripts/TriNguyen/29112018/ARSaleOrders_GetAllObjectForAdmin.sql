DELIMITER $$

CREATE
    PROCEDURE `ttcn`.`ARSaleOrders_GetAllObjectForAdmin`()  
	BEGIN
	SELECT 	*
	FROM 	ARSaleOrders so
	WHERE	so.AAStatus = 'Alive'
	AND	so.ARSaleOrderStatus = 'Confirm';
	END$$
	END$$
DELIMITER ;