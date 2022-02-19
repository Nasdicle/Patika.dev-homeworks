/*
HOMEWORK-3
*/

SELECT * FROM country
WHERE country LIKE 'A%a';

SELECT * FROM country
WHERE country LIKE '%_____n';

SELECT title FROM film
WHERE title ILIKE '%t%t%t%t%';

SELECT * FROM film
WHERE title LIKE 'C%' AND film.length>90 AND film.rental_rate = 2.99;