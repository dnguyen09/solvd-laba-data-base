-- Insert
INSERT INTO international_olympic_commitee
VALUES (1, "International Olympic Commitee", "Thomas Bach", 'Lausana, Switzerland', 1984);

INSERT INTO `solvd_laba_olympic`.`host country` (`host_country_id`, `country_name`, `continent`, `capital_city`, `official_language`, `year_of_host`, `IOC_id`) 
VALUES ('1', 'United Kingdom', 'Europe', 'London', 'English', 2012, '1');

INSERT INTO `solvd_laba_olympic`.`host_country` (`host_country_id`, `country_name`, `continent`, `capital_city`, `year_of_host`, `IOC_id`) 
VALUES ('2', 'Brazil', 'South America', 'Brasília', 2016, '1');

INSERT INTO `solvd_laba_olympic`.`nations` (`nation_id`, `nation_name`, `region`) 
VALUES  ('1', 'Australia', 'Ocenia'),
		('2', 'Argentina', 'South America'),
		('3', 'Bolivia', 'South America'),
		('4', 'Beligum', 'Western Europe'),
		('5', 'Belarus', 'Eastern Europe'),
		('6', 'Brazil', 'South America'),
		('7', 'Canada', 'North America'),
		('8', 'Colombia', 'South America'),
		('9', 'China', 'East Asia'),
		('10', 'Denmark', 'Northern Europe'),
		('11', 'Ecuador', 'South America'),
		('12', 'France', 'Western Europe'),
		('13', 'United States', 'North America');
        
INSERT INTO sports
VALUES  (1, 'Athletics'),
		(2, 'Archery'),
		(3, 'Badminton'),
        (4, 'Basketball'),
        (5, 'Cycling'),
        (6, 'Canoeing'),
        (7, 'Gymnastic'),
        (8, 'Tenis'),
        (9, 'Football'),
        (10, 'Volleyball'),
        (11, 'Wrestling'),
        (12, 'Judo'),
        (13, 'Karate'),
        (14, 'Shooting'),
        (15, 'Weightlifting'),
        (16, 'Swimming');
        
INSERT INTO cities
VALUES	(1, "London", 1),
		(2, 'Manchester', 1),
        (3, 'Birmingham', 1),
        (4, 'Glasgow', 1),
        (5, 'Cardiff', 1),
        (6, 'Liverpool', 1),
        (7, 'Edinburgh', 1),
        (8, 'Leeds', 1),
        (9, 'Notingham', 1),
        (10, 'Newcastle', 1);
        
INSERT INTO `solvd_laba_olympic`.`locations` (`location_id`, `location_name`, `city_id`) VALUES ('1', 'Olympic Stadium', '1');
INSERT INTO `solvd_laba_olympic`.`locations` (`location_id`, `location_name`, `city_id`) VALUES ('2', 'Aquatic Center', '1');
INSERT INTO `solvd_laba_olympic`.`locations` (`location_id`, `location_name`, `city_id`) VALUES ('3', 'Olympic Village', '1');
INSERT INTO `solvd_laba_olympic`.`locations` (`location_id`, `location_name`, `city_id`) VALUES ('4', 'Velodrome', '2');
INSERT INTO `solvd_laba_olympic`.`locations` (`location_id`, `location_name`, `city_id`) VALUES ('5', 'Tennis Stadium', '2');
INSERT INTO `solvd_laba_olympic`.`locations` (`location_id`, `location_name`, `city_id`) VALUES ('6', 'Athlectic Stadium', '3');
INSERT INTO `solvd_laba_olympic`.`locations` (`location_id`, `location_name`, `city_id`) VALUES ('7', 'Indoor Arena', '3');
INSERT INTO `solvd_laba_olympic`.`locations` (`location_id`, `location_name`, `city_id`) VALUES ('8', 'Canoeing Course', '4');
INSERT INTO `solvd_laba_olympic`.`locations` (`location_id`, `location_name`, `city_id`) VALUES ('9', 'Shooting Range', '5');
INSERT INTO `solvd_laba_olympic`.`locations` (`location_id`, `location_name`, `city_id`) VALUES ('10', 'Gymnastic Arena', '6');
INSERT INTO `solvd_laba_olympic`.`locations` (`location_id`, `location_name`, `city_id`) VALUES ('11', 'Basketball Arena', '7');
INSERT INTO `solvd_laba_olympic`.`locations` (`location_id`, `location_name`, `city_id`) VALUES ('12', 'Archery Range', '8');

INSERT INTO `solvd_laba_olympic`.`hotels` (`hotel_id`, `hotel_name`, `city_id`) VALUES ('1', 'Grand Plaza', '1');
INSERT INTO `solvd_laba_olympic`.`hotels` (`hotel_id`, `hotel_name`, `city_id`) VALUES ('2', 'Sunset View', '2');
INSERT INTO `solvd_laba_olympic`.`hotels` (`hotel_id`, `hotel_name`, `city_id`) VALUES ('3', 'Royal Palace', '3');
INSERT INTO `solvd_laba_olympic`.`hotels` (`hotel_id`, `hotel_name`, `city_id`) VALUES ('4', 'Sapphire Inn', '4');
INSERT INTO `solvd_laba_olympic`.`hotels` (`hotel_id`, `hotel_name`, `city_id`) VALUES ('5', 'Ocean Breeze', '5');
INSERT INTO `solvd_laba_olympic`.`hotels` (`hotel_id`, `hotel_name`, `city_id`) VALUES ('6', 'Elite resort', '1');
INSERT INTO `solvd_laba_olympic`.`hotels` (`hotel_id`, `hotel_name`, `city_id`) VALUES ('7', 'Paradise Hotel', '2');
INSERT INTO `solvd_laba_olympic`.`hotels` (`hotel_id`, `hotel_name`, `city_id`) VALUES ('8', 'Majestic Suites', '3');
INSERT INTO `solvd_laba_olympic`.`hotels` (`hotel_id`, `hotel_name`, `city_id`) VALUES ('9', 'Golden Crow', '4');
INSERT INTO `solvd_laba_olympic`.`hotels` (`hotel_id`, `hotel_name`, `city_id`) VALUES ('10', 'Silver Sands', '5');

INSERT INTO `solvd_laba_olympic`.`events` (`event_id`, `event_name`, `start_date`, `end_date`, `sport_id`, `location_id`) VALUES ('1', 'Parallel Bars', '2012-07-14', '2012-07-15', '7', '10');
INSERT INTO `solvd_laba_olympic`.`events` (`event_id`, `event_name`, `start_date`, `end_date`, `sport_id`, `location_id`) VALUES ('2', 'Floor Exercise', '2012-07-13', '2012-07-14', '7', '10');
INSERT INTO `solvd_laba_olympic`.`events` (`event_id`, `event_name`, `start_date`, `end_date`, `sport_id`, `location_id`) VALUES ('3', 'Rings', '2012-07-15', '2012-07-16', '7', '10');
INSERT INTO `solvd_laba_olympic`.`events` (`event_id`, `event_name`, `start_date`, `end_date`, `sport_id`, `location_id`) VALUES ('4', 'Sprint 100m', '2012-07-13', '2012-07-14', '1', '6');
INSERT INTO `solvd_laba_olympic`.`events` (`event_id`, `event_name`, `start_date`, `end_date`, `sport_id`, `location_id`) VALUES ('5', 'Sprint 200m', '2012-07-13', '2012-07-14', '1', '6');
INSERT INTO `solvd_laba_olympic`.`events` (`event_id`, `event_name`, `start_date`, `end_date`, `sport_id`, `location_id`) VALUES ('6', 'Long 5000m', '2012-07-15', '2012-07-16', '1', '6');
INSERT INTO `solvd_laba_olympic`.`events` (`event_id`, `event_name`, `start_date`, `end_date`, `sport_id`, `location_id`) VALUES ('7', 'Long 10000m', '2012-07-15', '2012-07-16', '1', '6');
INSERT INTO `solvd_laba_olympic`.`events` (`event_id`, `event_name`, `start_date`, `end_date`, `sport_id`, `location_id`) VALUES ('8', 'Men\'s Basketball', '2012-07-25', '2012-08-08', '4', '11');
INSERT INTO `solvd_laba_olympic`.`events` (`event_id`, `event_name`, `start_date`, `end_date`, `sport_id`, `location_id`) VALUES ('9', 'Rifle', '2012-07-20', '2012-07-23', '14', '9');
INSERT INTO `solvd_laba_olympic`.`events` (`event_id`, `event_name`, `start_date`, `end_date`, `sport_id`, `location_id`) VALUES ('10', 'Pistol', '2012-07-20', '2012-07-22', '14', '9');
INSERT INTO `solvd_laba_olympic`.`events` (`event_id`, `event_name`, `start_date`, `end_date`, `sport_id`, `location_id`) VALUES ('11', 'Free Style 100m', '2012-07-28', '2012-07-30', '16', '2');
INSERT INTO `solvd_laba_olympic`.`events` (`event_id`, `event_name`, `start_date`, `end_date`, `sport_id`, `location_id`) VALUES ('12', 'Butterfly 200m', '2012-08-01', '2012-08-03', '16', '2');

INSERT INTO `solvd_laba_olympic`.`competition` (`compete_id`, `team_id`, `event_id`) VALUES ('1', '1', '4');
INSERT INTO `solvd_laba_olympic`.`competition` (`team_id`, `event_id`) VALUES ('2', '4');
INSERT INTO `solvd_laba_olympic`.`competition` (`team_id`, `event_id`) VALUES ('1', '6');
INSERT INTO `solvd_laba_olympic`.`competition` (`team_id`, `event_id`) VALUES ('2', '6');
INSERT INTO `solvd_laba_olympic`.`competition` (`team_id`, `event_id`) VALUES ('10', '6');
INSERT INTO `solvd_laba_olympic`.`competition` (`team_id`, `event_id`) VALUES ('3', '8');
INSERT INTO `solvd_laba_olympic`.`competition` (`team_id`, `event_id`) VALUES ('4', '8');
INSERT INTO `solvd_laba_olympic`.`competition` (`team_id`, `event_id`) VALUES ('6', '1');
INSERT INTO `solvd_laba_olympic`.`competition` (`team_id`, `event_id`) VALUES ('6', '2');
INSERT INTO `solvd_laba_olympic`.`competition` (`team_id`, `event_id`) VALUES ('8', '11');
INSERT INTO `solvd_laba_olympic`.`competition` (`team_id`, `event_id`) VALUES ('9', '12');

INSERT INTO `solvd_laba_olympic`.`athletes` (`athlete_id`, `athlete_name`, `gender`, `age`, `team_id`) VALUES ('1', 'Jordan Williams', 'male', '23', '8');
INSERT INTO `solvd_laba_olympic`.`athletes` (`athlete_id`, `athlete_name`, `gender`, `age`, `team_id`) VALUES ('2', 'Liam Johnson', 'male', '28', '8');
INSERT INTO `solvd_laba_olympic`.`athletes` (`athlete_id`, `athlete_name`, `gender`, `age`, `team_id`) VALUES ('3', 'Ethan Trremblay', 'male', '25', '8');
INSERT INTO `solvd_laba_olympic`.`athletes` (`athlete_id`, `athlete_name`, `gender`, `age`, `team_id`) VALUES ('4', 'Mateo Herrera', 'male', '25', '9');
INSERT INTO `solvd_laba_olympic`.`athletes` (`athlete_id`, `athlete_name`, `gender`, `age`, `team_id`) VALUES ('5', 'Valentina Gomez', 'female', '22', '9');
INSERT INTO `solvd_laba_olympic`.`athletes` (`athlete_id`, `athlete_name`, `gender`, `age`, `team_id`) VALUES ('6', 'Isabella Lopez', 'female', '29', '9');
INSERT INTO `solvd_laba_olympic`.`athletes` (`athlete_id`, `athlete_name`, `gender`, `age`, `team_id`) VALUES ('7', 'Jack Wilson', 'male', '26', '1');
INSERT INTO `solvd_laba_olympic`.`athletes` (`athlete_id`, `athlete_name`, `gender`, `age`, `team_id`) VALUES ('8', 'Noah Roberts', 'male', '30', '1');
INSERT INTO `solvd_laba_olympic`.`athletes` (`athlete_id`, `athlete_name`, `gender`, `age`, `team_id`) VALUES ('9', 'Camila Gutierrez', 'female', '25', '2');
INSERT INTO `solvd_laba_olympic`.`athletes` (`athlete_id`, `athlete_name`, `gender`, `age`, `team_id`) VALUES ('10', 'Sofia Chavez', 'female', '28', '2');
INSERT INTO `solvd_laba_olympic`.`athletes` (`athlete_id`, `athlete_name`, `gender`, `age`, `team_id`) VALUES ('11', 'Gabriela Mendez', 'female', '27', '2');
INSERT INTO `solvd_laba_olympic`.`athletes` (`athlete_id`, `athlete_name`, `gender`, `age`, `team_id`) VALUES ('12', 'Andrea Mendoza', 'female', '24', '2');
INSERT INTO `solvd_laba_olympic`.`athletes` (`athlete_id`, `athlete_name`, `gender`, `age`, `team_id`) VALUES ('13', 'Oliver Jensen', 'male', '29', '3');
INSERT INTO `solvd_laba_olympic`.`athletes` (`athlete_id`, `athlete_name`, `gender`, `age`, `team_id`) VALUES ('14', 'Andres Hernandez', 'male', '30', '4');
INSERT INTO `solvd_laba_olympic`.`athletes` (`athlete_id`, `athlete_name`, `gender`, `age`, `team_id`) VALUES ('15', 'Lucas Hansen', 'male', '30', '3');
INSERT INTO `solvd_laba_olympic`.`athletes` (`athlete_id`, `athlete_name`, `gender`, `age`, `team_id`) VALUES ('16', 'Juan Ramirez', 'male', '25', '4');
INSERT INTO `solvd_laba_olympic`.`athletes` (`athlete_id`, `athlete_name`, `gender`, `age`, `team_id`) VALUES ('17', 'Andre Alyna', 'female', '24', '7');
INSERT INTO `solvd_laba_olympic`.`athletes` (`athlete_id`, `athlete_name`, `gender`, `age`, `team_id`) VALUES ('18', 'Babineaux Chloe', 'female', '23', '7');

INSERT INTO `solvd_laba_olympic`.`broadcasting_schedule` (`broadcast_id`, `channel`, `broadcast_date`, `start_time`, `end_time`, `even_id`) VALUES ('1', 'Velocity Sports', '2012-07-13', '10:00:00', '12:00:00', '4');
INSERT INTO `solvd_laba_olympic`.`broadcasting_schedule` (`broadcast_id`, `channel`, `broadcast_date`, `start_time`, `end_time`, `even_id`) VALUES ('2', 'Stellar TV', '2012-07-28', '09:00:00', '11:30:00', '11');
INSERT INTO `solvd_laba_olympic`.`broadcasting_schedule` (`broadcast_id`, `channel`, `broadcast_date`, `start_time`, `end_time`, `even_id`) VALUES ('3', 'Peak Sports', '2012-08-01', '14:00:00', '17:00:00', '6');
INSERT INTO `solvd_laba_olympic`.`broadcasting_schedule` (`broadcast_id`, `channel`, `broadcast_date`, `start_time`, `end_time`, `even_id`) VALUES ('4', 'Horizon Network', '2012-07-13', '10:00:00', '12:00:00', '4');
INSERT INTO `solvd_laba_olympic`.`broadcasting_schedule` (`broadcast_id`, `channel`, `broadcast_date`, `start_time`, `end_time`, `even_id`) VALUES ('5', 'Aurora Sports', '2012-08-01', '11:30:00', '13:30:00', '12');

-- Updating statment

UPDATE `solvd_laba_olympic`.`locations` SET `capacity` = '10000' WHERE (`location_id` = '5');
UPDATE `solvd_laba_olympic`.`locations` SET `capacity` = '80000' WHERE (`location_id` = '1');
UPDATE `solvd_laba_olympic`.`locations` SET `capacity` = '15000' WHERE (`location_id` = '2');
UPDATE `solvd_laba_olympic`.`locations` SET `capacity` = '6000' WHERE (`location_id` = '4');
UPDATE `solvd_laba_olympic`.`locations` SET `capacity` = '8000' WHERE (`location_id` = '6');
UPDATE `solvd_laba_olympic`.`locations` SET `capacity` = '5000' WHERE (`location_id` = '7');
UPDATE `solvd_laba_olympic`.`locations` SET `capacity` = '6000' WHERE (`location_id` = '10');
UPDATE `solvd_laba_olympic`.`locations` SET `capacity` = '3000' WHERE (`location_id` = '11');
UPDATE `solvd_laba_olympic`.`locations` SET `capacity` = '1000' WHERE (`location_id` = '12');

UPDATE `solvd_laba_olympic`.`competitions` SET `athlete_id` = '9', `event_id` = '4' WHERE (`compete_id` = '1');
UPDATE `solvd_laba_olympic`.`competitions` SET `athlete_id` = '12', `event_id` = '6' WHERE (`compete_id` = '2');
UPDATE `solvd_laba_olympic`.`competitions` SET `athlete_id` = '17', `event_id` = '4' WHERE (`compete_id` = '3');
UPDATE `solvd_laba_olympic`.`competitions` SET `athlete_id` = '18', `event_id` = '6' WHERE (`compete_id` = '4');
UPDATE `solvd_laba_olympic`.`competitions` SET `team_id` = '4', `event_id` = '8' WHERE (`compete_id` = '6');
UPDATE `solvd_laba_olympic`.`competitions` SET `athlete_id` = '1', `event_id` = '11' WHERE (`compete_id` = '7');
UPDATE `solvd_laba_olympic`.`competitions` SET `athlete_id` = '2', `event_id` = '12' WHERE (`compete_id` = '8');
UPDATE `solvd_laba_olympic`.`competitions` SET `athlete_id` = '4', `event_id` = '11' WHERE (`compete_id` = '9');
UPDATE `solvd_laba_olympic`.`competitions` SET `athlete_id` = '6', `event_id` = '12' WHERE (`compete_id` = '10');
UPDATE `solvd_laba_olympic`.`competitions` SET `team_id` = '3', `event_id` = '8' WHERE (`compete_id` = '5');

UPDATE `solvd_laba_olympic`.`teams` SET `team_name` = 'Athletic Team' WHERE (`team_id` = '7');

INSERT INTO `solvd_laba_olympic`.`results` (`result_id`, `medal`, `event_id`, `athlete_id`) VALUES ('1', 'Gold', '4', '9');
INSERT INTO `solvd_laba_olympic`.`results` (`result_id`, `medal`, `event_id`, `athlete_id`) VALUES ('2', 'Silver', '4', '17');
INSERT INTO `solvd_laba_olympic`.`results` (`result_id`, `medal`, `event_id`, `athlete_id`) VALUES ('3', 'Bronze', '6', '18');
INSERT INTO `solvd_laba_olympic`.`results` (`result_id`, `medal`, `event_id`, `athlete_id`) VALUES ('4', 'Gold', '6', '12');
INSERT INTO `solvd_laba_olympic`.`results` (`result_id`, `medal`, `event_id`, `team_id`) VALUES ('5', 'Silver', '8', '3');
INSERT INTO `solvd_laba_olympic`.`results` (`result_id`, `medal`, `event_id`, `team_id`) VALUES ('6', 'Gold', '8', '4');
INSERT INTO `solvd_laba_olympic`.`results` (`result_id`, `medal`, `event_id`, `athlete_id`) VALUES ('7', 'Gold', '12', '4');
INSERT INTO `solvd_laba_olympic`.`results` (`result_id`, `medal`, `event_id`, `athlete_id`) VALUES ('8', 'Silver', '11', '1');
INSERT INTO `solvd_laba_olympic`.`results` (`result_id`, `medal`, `event_id`, `athlete_id`) VALUES ('9', 'Bronze', '12', '6');


-- Alter table
ALTER TABLE events
RENAME COLUMN stadiums_stadium_id TO stadium_id;

ALTER TABLE results
RENAME COLUMN athletes_athlete_id TO athlete_id;

ALTER TABLE `solvd_laba_olympic`.`host country`
RENAME TO host_country;

ALTER TABLE host_country
DROP COLUMN official_language;

ALTER TABLE events
DROP FOREIGN KEY `fk_host country1`;

ALTER TABLE events
DROP COLUMN host_country_id;

ALTER TABLE cities
ADD COLUMN host_country_id INT,
ADD CONSTRAINT fk_host_country
FOREIGN KEY (host_country_id)
REFERENCES host_country (host_country_id);

RENAME TABLE stadiums TO locations;

ALTER TABLE teams
DROP FOREIGN KEY `teams_ibfk_2`;

ALTER TABLE teams
ADD CONSTRAINT fk_nation_id
FOREIGN KEY (nation_id) REFERENCES nations(nation_id);

ALTER TABLE teams
DROP COLUMN event_id;

ALTER TABLE locations
RENAME COLUMN stadium_id TO location_id,
RENAME COLUMN stadium_name TO location_name;

ALTER TABLE locations
MODIFY COLUMN capacity INT NULL;

ALTER TABLE events
DROP COLUMN team_id;

ALTER TABLE `solvd_laba_olympic`.`competition` 
RENAME TO  `solvd_laba_olympic`.`competitions` ;

-- INNER JOIN
SELECT *
FROM cities INNER JOIN locations
ON cities.city_id = locations.city_id;

SELECT cities.city_id, cities.city_name, locations.location_name, locations.capacity
FROM cities INNER JOIN locations
ON cities.city_id = locations.city_id;

SELECT cities.city_id, cities.city_name, locations.location_name, locations.capacity
FROM cities INNER JOIN locations
ON cities.city_id = locations.city_id
WHERE locations.capacity > 10000;

SELECT sports.sport_id, sports.sport_name, events.event_name, events.event_id
FROM sports INNER JOIN events
On sports.sport_id = events.sport_id;

SELECT events.event_name, locations.location_name
FROM events INNER JOIN locations
ON events.location_id = locations.location_id; 

-- LEFT JOIN
SELECT *
FROM cities LEFT JOIN locations
ON cities.city_id = locations.city_id;

SELECT cities.city_id, cities.city_name, locations.location_name, locations.capacity
FROM cities LEFT JOIN locations
ON cities.city_id = locations.city_id;

SELECT cities.city_id, cities.city_name, locations.location_name, locations.capacity
FROM cities LEFT JOIN locations
ON cities.city_id = locations.city_id
WHERE locations.location_name IS NULL;

SELECT events.event_name, teams.team_name, athletes.athlete_name, teams.team_id
FROM events
LEFT JOIN competitions ON events.event_id = competitions.event_id
LEFT JOIN teams ON competitions.team_id = teams.team_id
LEFT JOIN nations ON teams.nation_id = nations.nation_id
LEFT JOIN athletes ON athletes.athlete_id = competitions.athlete_id;

-- RIGHT JOIN
SELECT *
FROM cities RIGHT JOIN locations
ON cities.city_id = locations.city_id;

SELECT athletes.athlete_name, teams.team_name, nations.nation_name
FROM athletes 
RIGHT JOIN teams ON athletes.team_id = teams.team_id
RIGHT JOIN nations ON nations.nation_id = teams.nation_id;

SELECT athletes.athlete_name, teams.team_name, nations.nation_name, nations.region
FROM athletes 
RIGHT JOIN teams ON athletes.team_id = teams.team_id
RIGHT JOIN nations ON nations.nation_id = teams.nation_id
WHERE athlete_name IS NOT NULL;

SELECT teams.team_name, nations.nation_name, hotels.hotel_name
FROM teams
RIGHT JOIN hotels ON teams.hotel_id = hotels.hotel_id
LEFT JOIN nations ON teams.nation_id = nations.nation_id;

-- JOIN all tables

SELECT 	athletes.athlete_id, athletes.athlete_name, athletes.gender, teams.team_id,
		teams.team_name, hotels.hotel_name, cities.city_name, nations.nation_name, 
        sports.sport_name, channel, broadcast_date, start_time, end_time,
        events.event_name, events.event_id, events.start_date, events.end_date, 
        locations.location_name, locations.capacity, results.medal
FROM athletes
JOIN teams ON athletes.team_id = teams.team_id
JOIN nations ON nations.nation_id = teams.nation_id
LEFT JOIN competitions ON athletes.athlete_id = competitions.athlete_id
LEFT JOIN events ON events.event_id = competitions.event_id
LEFT JOIN results ON results.athlete_id = athletes.athlete_id
LEFT JOIN sports ON sports.sport_id = events.sport_id
LEFT JOIN hotels ON teams.hotel_id = hotels.hotel_id
LEFT JOIN cities ON cities.city_id = hotels.city_id
LEFT JOIN locations ON locations.location_id = events.location_id
LEFT JOIN broadcasting_schedule ON events.event_id = broadcasting_schedule.even_id;

-- AGREGATION WITHOU HAVING

SELECT region, nation_name, COUNT(nation_name) AS nation_count
FROM nations
GROUP BY region, nation_name;
 
SELECT region, COUNT(region) AS region_total
FROM nations
GROUP BY region;

SELECT TRIM(team_name), COUNT(team_name) AS teams_total
FROM teams
GROUP BY TRIM(team_name);

SELECT city_id, AVG(capacity) AS average_capacity
FROM locations
GROUP BY city_id;

SELECT city_id, COUNT(location_name) as total_locations
FROM locations
GROUP BY city_id;

SELECT city_id, COUNT(hotel_name) as number_hotels
FROM hotels
GROUP BY city_id;


-- GROUP BY WITH HAVING

 SELECT region, COUNT(region) AS region_total
 FROM nations
 GROUP BY region
 HAVING region_total >= 2;
 
SELECT TRIM(team_name), COUNT(team_name) AS teams_total
FROM teams
GROUP BY TRIM(team_name)
HAVING teams_total = 2;
 
SELECT city_id, AVG(capacity) AS average_capacity
FROM locations
GROUP BY city_id
HAVING average_capacity IS NOT NULL;

SELECT city_id, COUNT(location_name) as total_locations
FROM locations
GROUP BY city_id
HAVING total_locations = 1;

SELECT athlete_name, age
FROM athletes
GROUP BY athlete_name, age
HAVING age = (SELECT MAX(age) FROM athletes);

SELECT location_name, capacity
FROM locations
GROUP BY location_name, capacity
HAVING capacity = (SELECT MIN(capacity) FROM locations);



