SELECT DISTINCT CITY FROM STATION WHERE LOWER(LEFT(CITY,1)) NOT IN ('a', 'e', 'o', 'u', 'i')