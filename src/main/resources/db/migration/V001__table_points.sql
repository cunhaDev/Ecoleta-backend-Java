create table points(

	id bigint not null auto_increment,
	image varchar(255),
	name varchar(255) not null,
	email varchar(255) not null,
	whatsapp varchar(100) not null,
	latitude INTEGER not null,
	longitude INTEGER not null,
	city varchar(90) not null,
	uf varchar(3) not null,

	primary key(id)

);