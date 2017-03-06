SELECT
CASE 
    WHEN (A+B<=C) OR (A+C<=B) OR (B+C<=A) Then 'Not A Triangle' 
    WHEN A=B AND B=C Then 'Equilateral' 
    WHEN (A=B AND A+B>C) OR (A=C AND A+C>B) OR (B=C AND B+C>A) Then 'Isosceles' 
ELSE 'Scalene' 
END 
FROM Triangles;