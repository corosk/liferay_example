/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package active.portal.model.impl;

import aQute.bnd.annotation.ProviderType;

import active.portal.model.bookmark;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing bookmark in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see bookmark
 * @generated
 */
@ProviderType
public class bookmarkCacheModel implements CacheModel<bookmark>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof bookmarkCacheModel)) {
			return false;
		}

		bookmarkCacheModel bookmarkCacheModel = (bookmarkCacheModel)obj;

		if (bookmark_id.equals(bookmarkCacheModel.bookmark_id)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, bookmark_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", bookmark_id=");
		sb.append(bookmark_id);
		sb.append(", bookmark_url=");
		sb.append(bookmark_url);
		sb.append(", bookmark_title=");
		sb.append(bookmark_title);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", content=");
		sb.append(content);
		sb.append(", create_date=");
		sb.append(create_date);
		sb.append(", update_date=");
		sb.append(update_date);
		sb.append(", is_delete=");
		sb.append(is_delete);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public bookmark toEntityModel() {
		bookmarkImpl bookmarkImpl = new bookmarkImpl();

		if (companyId == null) {
			bookmarkImpl.setCompanyId(StringPool.BLANK);
		}
		else {
			bookmarkImpl.setCompanyId(companyId);
		}

		if (groupId == null) {
			bookmarkImpl.setGroupId(StringPool.BLANK);
		}
		else {
			bookmarkImpl.setGroupId(groupId);
		}

		bookmarkImpl.setBookmark_id(bookmark_id);

		if (bookmark_url == null) {
			bookmarkImpl.setBookmark_url(StringPool.BLANK);
		}
		else {
			bookmarkImpl.setBookmark_url(bookmark_url);
		}

		if (bookmark_title == null) {
			bookmarkImpl.setBookmark_title(StringPool.BLANK);
		}
		else {
			bookmarkImpl.setBookmark_title(bookmark_title);
		}

		bookmarkImpl.setUserId(userId);

		if (content == null) {
			bookmarkImpl.setContent(StringPool.BLANK);
		}
		else {
			bookmarkImpl.setContent(content);
		}

		if (create_date == Long.MIN_VALUE) {
			bookmarkImpl.setCreate_date(null);
		}
		else {
			bookmarkImpl.setCreate_date(new Date(create_date));
		}

		if (update_date == Long.MIN_VALUE) {
			bookmarkImpl.setUpdate_date(null);
		}
		else {
			bookmarkImpl.setUpdate_date(new Date(update_date));
		}

		bookmarkImpl.setIs_delete(is_delete);

		bookmarkImpl.resetOriginalValues();

		return bookmarkImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		companyId = objectInput.readUTF();
		groupId = objectInput.readUTF();

		bookmark_id = objectInput.readLong();
		bookmark_url = objectInput.readUTF();
		bookmark_title = objectInput.readUTF();

		userId = objectInput.readLong();
		content = objectInput.readUTF();
		create_date = objectInput.readLong();
		update_date = objectInput.readLong();

		is_delete = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (companyId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(companyId);
		}

		if (groupId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(groupId);
		}

		objectOutput.writeLong(bookmark_id);

		if (bookmark_url == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(bookmark_url);
		}

		if (bookmark_title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(bookmark_title);
		}

		objectOutput.writeLong(userId);

		if (content == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(content);
		}

		objectOutput.writeLong(create_date);
		objectOutput.writeLong(update_date);

		objectOutput.writeBoolean(is_delete);
	}

	public String companyId;
	public String groupId;
	public long bookmark_id;
	public String bookmark_url;
	public String bookmark_title;
	public long userId;
	public String content;
	public long create_date;
	public long update_date;
	public boolean is_delete;
}