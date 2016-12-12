create index IX_3628AA05 on active_companyBookmark (bookmarkId[$COLUMN_LENGTH:75$]);
create index IX_D8C6CC12 on active_companyBookmark (bookmarkTitle[$COLUMN_LENGTH:75$]);
create index IX_8F9D0769 on active_companyBookmark (bookmarkUrl[$COLUMN_LENGTH:75$]);
create index IX_7143FF1A on active_companyBookmark (userId);

create index IX_66C2E2FD on active_company_bookmark (bookmark_id[$COLUMN_LENGTH:75$]);
create index IX_C3D2501A on active_company_bookmark (bookmark_title[$COLUMN_LENGTH:75$]);
create index IX_7249ED71 on active_company_bookmark (bookmark_url[$COLUMN_LENGTH:75$]);
create index IX_D4BF0B91 on active_company_bookmark (userId);