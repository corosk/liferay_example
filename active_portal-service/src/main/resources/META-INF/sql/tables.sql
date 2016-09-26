create table active_company_bookmark (
	companyId VARCHAR(75) null,
	groupId VARCHAR(75) null,
	bookmark_id VARCHAR(75) not null primary key,
	bookmark_url VARCHAR(75) null,
	bookmark_title VARCHAR(75) null,
	userId LONG,
	content VARCHAR(75) null,
	create_date DATE null,
	update_date DATE null,
	is_delete BOOLEAN
);