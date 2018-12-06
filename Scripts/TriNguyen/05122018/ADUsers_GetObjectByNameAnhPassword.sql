CREATE DEFINER=`root`@`localhost` PROCEDURE `ADUsers_GetObjectByNameAnhPassword`(
	IN ADUserName VARCHAR(200),
	IN ADPassword VARCHAR(200)
	)
BEGIN
	SELECT 	*
	FROM 	ADUsers us
	WHERE 	us.AAStatus = 'Alive'
	AND 	us.ADUserName =  ADUserName
	AND		us.ADPassword = ADPassword; 		
	END