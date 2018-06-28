create table multi_language
(
	id int(19) auto_increment primary key,
	msg_code varchar(50) not null,
	lang_code varchar(20) not null,
	message varchar(4000) not null,
	description varchar(4000) null,
	created_date timestamp default CURRENT_TIMESTAMP not null,
	last_mod_date timestamp default CURRENT_TIMESTAMP not null,
	constraint msg_lang_code unique (msg_code, lang_code)
)
engine=InnoDB
;

