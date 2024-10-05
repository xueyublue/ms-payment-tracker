CREATE TABLE payment_tracker (
	id bigserial NOT NULL,
	txn_amount numeric(19, 2) NULL,
	txn_date timestamp NULL,
	category varchar(255) NULL,
    store varchar(255) NULL,
	remarks1 varchar(255) NULL,
	remarks2 varchar(255) NULL,
	remarks3 varchar(255) NULL,
    created_date timestamp NULL,
	created_by varchar(255) NULL,
    updated_date timestamp NULL,
	updated_by varchar(255) NULL,
	CONSTRAINT payment_tracker_pkey PRIMARY KEY (id)
);
