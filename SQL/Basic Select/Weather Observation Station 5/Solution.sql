SELECT CITY, LENGTH(CITY) 
FROM STATION 
WHERE LENGTH(CITY) = (SELECT MAX(CHAR_LENGTH(CITY)) FROM STATION) 
LIMIT 1
UNION 
(SELECT CITY, LENGTH(CITY) 
 FROM STATION 
 WHERE LENGTH(CITY) = (SELECT MIN(CHAR_LENGTH(CITY)) FROM STATION)
ORDER BY CITY
LIMIT 1)