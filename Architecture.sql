CREATE database architecture;
use architecture;
CREATE table city(
id int(10) NOT NULL UNIQUE,
name varchar(40) NOT NULL UNIQUE,
Primary key(id)
);

CREATE table streets(
id int(10) NOT NULL UNIQUE,
name varchar(40) NOT NULL UNIQUE,
city int(10) NOT NULL,
Foreign key(city) REFERENCES city(id),
Primary key(id)
);

CREATE table building(
id int(10) NOT NULL UNIQUE,
civil bool NOT NULL UNIQUE,
entrprise bool NOT NULL UNIQUE,
city int(10) NOT NULL,
street int(10) NOT NULL,
Foreign key(city) REFERENCES city(id),
Foreign key(street) REFERENCES streets(id),
Primary key(id)
);

CREATE table cityHasStreets(
	id_city int(10) NOT NULL UNIQUE,
	id_street int(10) NOT NULL UNIQUE,
	Foreign key(id_city) REFERENCES city(id),
	Foreign key(id_street) REFERENCES streets(id)
);

CREATE table streetsHasBuildings(
	id_build int(10) NOT NULL UNIQUE,
	id_street int(10) NOT NULL UNIQUE,
	Foreign key(id_build) REFERENCES buildings(id),
	Foreign key(id_street) REFERENCES streets(id)
);