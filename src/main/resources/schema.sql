create table if not exists contacts(
	id bigint,
	firstName varchar(30) not null,
	lastName varchar(50) not null,
	phoneNumber varchar(13),
	emailNumber varchar(30)
);