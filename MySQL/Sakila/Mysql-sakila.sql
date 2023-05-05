USE sakila;

#1.-	-- ¿Qué consulta ejecutarías para obtener todos los clientes dentro de city_id = 312? 
		-- Su consulta debe devolver el nombre, apellido, correo electrónico y dirección del cliente.
        
SELECT c.first_name, c.last_name ,c.email, a.address, ct.city
FROM customer c
INNER JOIN address a
ON c.address_id = a.address_id
INNER JOIN city ct
ON a.city_id = ct.city_id
WHERE ct.city_id = 312;

#2.- 	-- ¿Qué consulta harías para obtener todas las películas de comedia? 
		-- Su consulta debe devolver el título de la película, la descripción, 
        -- el año de estreno, la calificación, las características especiales y el género (categoría).
        
SELECT f.film_id , f.title, f.description, f.release_year, f.rating, f.special_features, c.name as genero 
FROM film f
INNER JOIN film_category fm
ON f.film_id = fm.film_id
INNER JOIN category c
ON c.category_id= fm.category_id
WHERE c.name = "comedy";

#3.-	-- ¿Qué consulta harías para obtener todas las películas unidas por actor_id = 5? 
		-- Su consulta debe devolver la identificación del actor, el nombre del actor, 
		-- el título de la película, la descripción y el año de lanzamiento.
        
SELECT a.actor_id, CONCAT(a.first_name," ",a.last_name) as complete_name, f.title, f.description, f.release_year
FROM film as f
INNER JOIN  film_actor as fa 
ON f.film_id = fa.film_id 
INNER JOIN  actor as a 
ON a.actor_id= fa.actor_id 
WHERE a.actor_id=5;

#4.-	-- ¿Qué consulta ejecutaría para obtener todos los clientes en store_id = 1 
		-- y dentro de estas ciudades (1, 42, 312 y 459)? Su consulta debe devolver el nombre,
        -- apellido, correo electrónico y dirección del cliente.
        
SELECT c.store_id, a.city_id, c.first_name, c.last_name, c.email, a.address
FROM customer c
INNER JOIN address a
ON c.address_id = a.address_id
WHERE c.store_id=1
AND (a.city_id=1 || a.city_id=42 || a.city_id=312 || a.city_id=459);

#5.-	-- ¿Qué consulta realizarías para obtener todas las películas con una "calificación = G" 
		-- y "característica especial = detrás de escena", unidas por actor_id = 15? 
        -- Su consulta debe devolver el título de la película, la descripción, el año de lanzamiento, 
        -- la calificación y la función especial. Sugerencia: puede usar la función LIKE para obtener la parte 'detrás de escena'.
        
SELECT f.title, f.description, f.release_year, f.rating, f.special_features
FROM film f 
INNER JOIN film_actor fa 
ON f.film_id=fa.film_id 
WHERE f.rating="G" 
AND f.special_features LIKE "%Behind the Scenes%"
AND fa.actor_id=15;

#6.-	-- ¿Qué consulta harías para obtener todos los actores que se unieron en el film_id = 369? 
		-- Su consulta debe devolver film_id, title, actor_id y actor_name.
        
SELECT f.film_id, f.title,a.actor_id, CONCAT(a.first_name," ", a.last_name) as actor_name FROM actor a
INNER JOIN film_actor fa
ON fa.actor_id=a.actor_id
INNER JOIN film f
ON fa.film_id=f.film_id
WHERE f.film_id=369;

#7.-	-- ¿Qué consulta harías para obtener todas las películas dramáticas con una tarifa de alquiler de 2.99? 
		-- Su consulta debe devolver el título de la película, la descripción, el año de estreno, la calificación, 
        -- las características especiales y el género (categoría).
        
SELECT f.film_id, f.title, f.description, f.release_year, f.rating, f.special_features, c.name, f.rental_rate
FROM film f
INNER JOIN film_category fc
ON fc.film_id=f.film_id
INNER JOIN category c
ON fc.category_id=c.category_id
WHERE c.name="Drama"
AND f.rental_rate=2.99;

#8.-	-- ¿Qué consulta harías para obtener todas las películas de acción a las que se une SANDRA KILMER? 
		-- Su consulta debe devolver el título de la película, la descripción, el año de estreno, 
        -- la calificación, las características especiales, el género (categoría) y el nombre y apellido del actor.
        
SELECT f.film_id, f.title, f.description, f.release_year, f.rating, f.special_features, c.name as category, a.actor_id, CONCAT(a.first_name," ", a.last_name) as actor_name 
FROM actor a
INNER JOIN film_actor fa
ON fa.actor_id=a.actor_id
INNER JOIN film f
ON fa.film_id=f.film_id
INNER JOIN film_category fc
ON fc.film_id=f.film_id
INNER JOIN category c
ON c.category_id=fc.category_id
WHERE a.first_name = "SANDRA" AND a.last_name="KILMER"
AND c.name="action"