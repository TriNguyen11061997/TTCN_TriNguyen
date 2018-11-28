
USE `ttcn`;
DROP procedure IF EXISTS `ttcn`.`ARProducts_GetObjectByIndex`;

DELIMITER $$
USE `ttcn`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `ICProducts_GetObjectByIndex`()
BEGIN
	SELECT 	*
	FROM 	ICProducts p
	WHERE	p.AAStatus = 'Alive';
END$$

DELIMITER ;
;
