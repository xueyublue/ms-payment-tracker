CREATE TABLE bank_account (
	id bigserial NOT NULL,
	account_number varchar(255) NOT NULL,
	account_status varchar(255) NULL,
	balance numeric(19, 2) NULL,
	created_on timestamp NULL,
	updated_on timestamp NULL,
	CONSTRAINT bank_account_pkey PRIMARY KEY (id),
	CONSTRAINT uk_mb8kv2x9143o96jgxbv6mahcq UNIQUE (account_number)
);
