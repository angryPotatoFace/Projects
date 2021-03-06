SHOW TABLES;
DESCRIBE LIBRO;
SELECT * FROM LIBRO;

/*----------------CONSULTAS BASICAS ---------------------------*/

/*---1----*/
/*SELECT TITULO AUTOR FROM LIBRO WHERE TIPO LIKE 'NO' AND PRECIO_ACT > 21 ;*/

/*---2----*/
/*SELECT NRO_LIBRO, PRECIO_ORI, EDICION FROM LIBRO
	 WHERE ((TIPO LIKE 'NO' OR PRECIO_ORI > 21) 
	 AND EDICION > 1985); */ 
 
/*---3----*/
/*SELECT AUTOR, EDICION FROM LIBRO WHERE AUTOR LIKE 'L%' ;*/

/*---4----*/
/*SELECT AUTOR, EDICION FROM LIBRO WHERE AUTOR LIKE 'G%';*/

/*---5----*/
/*SELECT AUTOR, EDICION , PRECIO_ORI FROM LIBRO WHERE AUTOR LIKE '%RR%'; */

/*---6----*/
/*SELECT TITULO, EDICION FROM LIBRO WHERE PRECIO_ORI<12 OR  25<PRECIO_ORI ; */

/*---7----*/
/*SELECT TIPO, EDICION FROM LIBRO ORDER BY EDICION ASC;*/

/*---8----
SELECT NRO_LIBRO, EDICION, TIPO, PRECIO_ORI, PRECIO_ACT FROM LIBRO ORDER BY TIPO,PRECIO_ACT ASC; */

/*---9----*/
/*SELECT NRO_LIBRO, EDICION, TIPO, PRECIO_ORI, PRECIO_ACT FROM LIBRO WHERE TIPO = "ES" ; */

/*---10----*/
/* SELECT NRO_LIBRO, PRECIO_ORI , 	EDICION FROM LIBRO WHERE EDICION > 1985 AND  ( TIPO = 'NO' OR PRECIO_ORI > 21 ) ORDER BY PRECIO_ORI DESC; */ 



/*----------------CONSULTAS FUNCIONES AGREGACION HAVING ---------------------------*/

/*---1----*/
/*SELECT MAX(PRECIO_ACT), MIN(PRECIO_ACT) ,SUM(PRECIO_ORI), AVG(PRECIO_ORI) FROM LIBRO WHERE EDICION > 1970 ;*/

/*---2----*/
/*
SELECT SUM(PRECIO_ORI+PRECIO_ACT) AS "SUMA PRECIO", 
	MIN(PRECIO_ACT-PRECIO_ORI) AS "MINIMO",
		MAX(PRECIO_ACT-PRECIO_ORI) AS "MAXIMO",
			AVG( PRECIO_ORI+PRECIO_ACT ) AS "PROMEDIO PRECIOS"
				FROM LIBRO
					WHERE EDICION > 1970; */
