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

package active.portal.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link bookmark}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see bookmark
 * @generated
 */
@ProviderType
public class bookmarkWrapper implements bookmark, ModelWrapper<bookmark> {
	public bookmarkWrapper(bookmark bookmark) {
		_bookmark = bookmark;
	}

	@Override
	public Class<?> getModelClass() {
		return bookmark.class;
	}

	@Override
	public String getModelClassName() {
		return bookmark.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("bookmark_id", getBookmark_id());
		attributes.put("bookmark_url", getBookmark_url());
		attributes.put("bookmark_title", getBookmark_title());
		attributes.put("userId", getUserId());
		attributes.put("content", getContent());
		attributes.put("create_date", getCreate_date());
		attributes.put("update_date", getUpdate_date());
		attributes.put("is_delete", getIs_delete());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String companyId = (String)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String groupId = (String)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long bookmark_id = (Long)attributes.get("bookmark_id");

		if (bookmark_id != null) {
			setBookmark_id(bookmark_id);
		}

		String bookmark_url = (String)attributes.get("bookmark_url");

		if (bookmark_url != null) {
			setBookmark_url(bookmark_url);
		}

		String bookmark_title = (String)attributes.get("bookmark_title");

		if (bookmark_title != null) {
			setBookmark_title(bookmark_title);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		Date create_date = (Date)attributes.get("create_date");

		if (create_date != null) {
			setCreate_date(create_date);
		}

		Date update_date = (Date)attributes.get("update_date");

		if (update_date != null) {
			setUpdate_date(update_date);
		}

		Boolean is_delete = (Boolean)attributes.get("is_delete");

		if (is_delete != null) {
			setIs_delete(is_delete);
		}
	}

	@Override
	public active.portal.model.bookmark toEscapedModel() {
		return new bookmarkWrapper(_bookmark.toEscapedModel());
	}

	@Override
	public active.portal.model.bookmark toUnescapedModel() {
		return new bookmarkWrapper(_bookmark.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _bookmark.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _bookmark.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _bookmark.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _bookmark.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<active.portal.model.bookmark> toCacheModel() {
		return _bookmark.toCacheModel();
	}

	@Override
	public int compareTo(active.portal.model.bookmark bookmark) {
		return _bookmark.compareTo(bookmark);
	}

	@Override
	public int hashCode() {
		return _bookmark.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _bookmark.getPrimaryKeyObj();
	}

	/**
	* Returns the is_delete of this bookmark.
	*
	* @return the is_delete of this bookmark
	*/
	@Override
	public java.lang.Boolean getIs_delete() {
		return _bookmark.getIs_delete();
	}

	/**
	* Returns the bookmark_id of this bookmark.
	*
	* @return the bookmark_id of this bookmark
	*/
	@Override
	public java.lang.Long getBookmark_id() {
		return _bookmark.getBookmark_id();
	}

	/**
	* Returns the primary key of this bookmark.
	*
	* @return the primary key of this bookmark
	*/
	@Override
	public java.lang.Long getPrimaryKey() {
		return _bookmark.getPrimaryKey();
	}

	/**
	* Returns the user ID of this bookmark.
	*
	* @return the user ID of this bookmark
	*/
	@Override
	public java.lang.Long getUserId() {
		return _bookmark.getUserId();
	}

	@Override
	public java.lang.Object clone() {
		return new bookmarkWrapper((bookmark)_bookmark.clone());
	}

	/**
	* Returns the bookmark_title of this bookmark.
	*
	* @return the bookmark_title of this bookmark
	*/
	@Override
	public java.lang.String getBookmark_title() {
		return _bookmark.getBookmark_title();
	}

	/**
	* Returns the bookmark_url of this bookmark.
	*
	* @return the bookmark_url of this bookmark
	*/
	@Override
	public java.lang.String getBookmark_url() {
		return _bookmark.getBookmark_url();
	}

	/**
	* Returns the company ID of this bookmark.
	*
	* @return the company ID of this bookmark
	*/
	@Override
	public java.lang.String getCompanyId() {
		return _bookmark.getCompanyId();
	}

	/**
	* Returns the content of this bookmark.
	*
	* @return the content of this bookmark
	*/
	@Override
	public java.lang.String getContent() {
		return _bookmark.getContent();
	}

	/**
	* Returns the group ID of this bookmark.
	*
	* @return the group ID of this bookmark
	*/
	@Override
	public java.lang.String getGroupId() {
		return _bookmark.getGroupId();
	}

	@Override
	public java.lang.String toString() {
		return _bookmark.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _bookmark.toXmlString();
	}

	/**
	* Returns the create_date of this bookmark.
	*
	* @return the create_date of this bookmark
	*/
	@Override
	public Date getCreate_date() {
		return _bookmark.getCreate_date();
	}

	/**
	* Returns the update_date of this bookmark.
	*
	* @return the update_date of this bookmark
	*/
	@Override
	public Date getUpdate_date() {
		return _bookmark.getUpdate_date();
	}

	@Override
	public void persist() {
		_bookmark.persist();
	}

	/**
	* Sets the bookmark_id of this bookmark.
	*
	* @param bookmark_id the bookmark_id of this bookmark
	*/
	@Override
	public void setBookmark_id(java.lang.Long bookmark_id) {
		_bookmark.setBookmark_id(bookmark_id);
	}

	/**
	* Sets the bookmark_title of this bookmark.
	*
	* @param bookmark_title the bookmark_title of this bookmark
	*/
	@Override
	public void setBookmark_title(java.lang.String bookmark_title) {
		_bookmark.setBookmark_title(bookmark_title);
	}

	/**
	* Sets the bookmark_url of this bookmark.
	*
	* @param bookmark_url the bookmark_url of this bookmark
	*/
	@Override
	public void setBookmark_url(java.lang.String bookmark_url) {
		_bookmark.setBookmark_url(bookmark_url);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_bookmark.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this bookmark.
	*
	* @param companyId the company ID of this bookmark
	*/
	@Override
	public void setCompanyId(java.lang.String companyId) {
		_bookmark.setCompanyId(companyId);
	}

	/**
	* Sets the content of this bookmark.
	*
	* @param content the content of this bookmark
	*/
	@Override
	public void setContent(java.lang.String content) {
		_bookmark.setContent(content);
	}

	/**
	* Sets the create_date of this bookmark.
	*
	* @param create_date the create_date of this bookmark
	*/
	@Override
	public void setCreate_date(Date create_date) {
		_bookmark.setCreate_date(create_date);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_bookmark.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_bookmark.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_bookmark.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this bookmark.
	*
	* @param groupId the group ID of this bookmark
	*/
	@Override
	public void setGroupId(java.lang.String groupId) {
		_bookmark.setGroupId(groupId);
	}

	/**
	* Sets the is_delete of this bookmark.
	*
	* @param is_delete the is_delete of this bookmark
	*/
	@Override
	public void setIs_delete(java.lang.Boolean is_delete) {
		_bookmark.setIs_delete(is_delete);
	}

	@Override
	public void setNew(boolean n) {
		_bookmark.setNew(n);
	}

	/**
	* Sets the primary key of this bookmark.
	*
	* @param primaryKey the primary key of this bookmark
	*/
	@Override
	public void setPrimaryKey(java.lang.Long primaryKey) {
		_bookmark.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_bookmark.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the update_date of this bookmark.
	*
	* @param update_date the update_date of this bookmark
	*/
	@Override
	public void setUpdate_date(Date update_date) {
		_bookmark.setUpdate_date(update_date);
	}

	/**
	* Sets the user ID of this bookmark.
	*
	* @param userId the user ID of this bookmark
	*/
	@Override
	public void setUserId(java.lang.Long userId) {
		_bookmark.setUserId(userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof bookmarkWrapper)) {
			return false;
		}

		bookmarkWrapper bookmarkWrapper = (bookmarkWrapper)obj;

		if (Objects.equals(_bookmark, bookmarkWrapper._bookmark)) {
			return true;
		}

		return false;
	}

	@Override
	public bookmark getWrappedModel() {
		return _bookmark;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _bookmark.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _bookmark.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_bookmark.resetOriginalValues();
	}

	private final bookmark _bookmark;
}