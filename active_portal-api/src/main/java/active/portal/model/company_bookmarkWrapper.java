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
 * This class is a wrapper for {@link company_bookmark}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see company_bookmark
 * @generated
 */
@ProviderType
public class company_bookmarkWrapper implements company_bookmark,
	ModelWrapper<company_bookmark> {
	public company_bookmarkWrapper(company_bookmark company_bookmark) {
		_company_bookmark = company_bookmark;
	}

	@Override
	public Class<?> getModelClass() {
		return company_bookmark.class;
	}

	@Override
	public String getModelClassName() {
		return company_bookmark.class.getName();
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

		String bookmark_id = (String)attributes.get("bookmark_id");

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
	public active.portal.model.company_bookmark toEscapedModel() {
		return new company_bookmarkWrapper(_company_bookmark.toEscapedModel());
	}

	@Override
	public active.portal.model.company_bookmark toUnescapedModel() {
		return new company_bookmarkWrapper(_company_bookmark.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _company_bookmark.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _company_bookmark.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _company_bookmark.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _company_bookmark.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<active.portal.model.company_bookmark> toCacheModel() {
		return _company_bookmark.toCacheModel();
	}

	@Override
	public int compareTo(active.portal.model.company_bookmark company_bookmark) {
		return _company_bookmark.compareTo(company_bookmark);
	}

	@Override
	public int hashCode() {
		return _company_bookmark.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _company_bookmark.getPrimaryKeyObj();
	}

	/**
	* Returns the is_delete of this company_bookmark.
	*
	* @return the is_delete of this company_bookmark
	*/
	@Override
	public java.lang.Boolean getIs_delete() {
		return _company_bookmark.getIs_delete();
	}

	/**
	* Returns the user ID of this company_bookmark.
	*
	* @return the user ID of this company_bookmark
	*/
	@Override
	public java.lang.Long getUserId() {
		return _company_bookmark.getUserId();
	}

	@Override
	public java.lang.Object clone() {
		return new company_bookmarkWrapper((company_bookmark)_company_bookmark.clone());
	}

	/**
	* Returns the bookmark_id of this company_bookmark.
	*
	* @return the bookmark_id of this company_bookmark
	*/
	@Override
	public java.lang.String getBookmark_id() {
		return _company_bookmark.getBookmark_id();
	}

	/**
	* Returns the bookmark_title of this company_bookmark.
	*
	* @return the bookmark_title of this company_bookmark
	*/
	@Override
	public java.lang.String getBookmark_title() {
		return _company_bookmark.getBookmark_title();
	}

	/**
	* Returns the bookmark_url of this company_bookmark.
	*
	* @return the bookmark_url of this company_bookmark
	*/
	@Override
	public java.lang.String getBookmark_url() {
		return _company_bookmark.getBookmark_url();
	}

	/**
	* Returns the company ID of this company_bookmark.
	*
	* @return the company ID of this company_bookmark
	*/
	@Override
	public java.lang.String getCompanyId() {
		return _company_bookmark.getCompanyId();
	}

	/**
	* Returns the content of this company_bookmark.
	*
	* @return the content of this company_bookmark
	*/
	@Override
	public java.lang.String getContent() {
		return _company_bookmark.getContent();
	}

	/**
	* Returns the group ID of this company_bookmark.
	*
	* @return the group ID of this company_bookmark
	*/
	@Override
	public java.lang.String getGroupId() {
		return _company_bookmark.getGroupId();
	}

	/**
	* Returns the primary key of this company_bookmark.
	*
	* @return the primary key of this company_bookmark
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _company_bookmark.getPrimaryKey();
	}

	@Override
	public java.lang.String toString() {
		return _company_bookmark.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _company_bookmark.toXmlString();
	}

	/**
	* Returns the create_date of this company_bookmark.
	*
	* @return the create_date of this company_bookmark
	*/
	@Override
	public Date getCreate_date() {
		return _company_bookmark.getCreate_date();
	}

	/**
	* Returns the update_date of this company_bookmark.
	*
	* @return the update_date of this company_bookmark
	*/
	@Override
	public Date getUpdate_date() {
		return _company_bookmark.getUpdate_date();
	}

	@Override
	public void persist() {
		_company_bookmark.persist();
	}

	/**
	* Sets the bookmark_id of this company_bookmark.
	*
	* @param bookmark_id the bookmark_id of this company_bookmark
	*/
	@Override
	public void setBookmark_id(java.lang.String bookmark_id) {
		_company_bookmark.setBookmark_id(bookmark_id);
	}

	/**
	* Sets the bookmark_title of this company_bookmark.
	*
	* @param bookmark_title the bookmark_title of this company_bookmark
	*/
	@Override
	public void setBookmark_title(java.lang.String bookmark_title) {
		_company_bookmark.setBookmark_title(bookmark_title);
	}

	/**
	* Sets the bookmark_url of this company_bookmark.
	*
	* @param bookmark_url the bookmark_url of this company_bookmark
	*/
	@Override
	public void setBookmark_url(java.lang.String bookmark_url) {
		_company_bookmark.setBookmark_url(bookmark_url);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_company_bookmark.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this company_bookmark.
	*
	* @param companyId the company ID of this company_bookmark
	*/
	@Override
	public void setCompanyId(java.lang.String companyId) {
		_company_bookmark.setCompanyId(companyId);
	}

	/**
	* Sets the content of this company_bookmark.
	*
	* @param content the content of this company_bookmark
	*/
	@Override
	public void setContent(java.lang.String content) {
		_company_bookmark.setContent(content);
	}

	/**
	* Sets the create_date of this company_bookmark.
	*
	* @param create_date the create_date of this company_bookmark
	*/
	@Override
	public void setCreate_date(Date create_date) {
		_company_bookmark.setCreate_date(create_date);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_company_bookmark.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_company_bookmark.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_company_bookmark.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this company_bookmark.
	*
	* @param groupId the group ID of this company_bookmark
	*/
	@Override
	public void setGroupId(java.lang.String groupId) {
		_company_bookmark.setGroupId(groupId);
	}

	/**
	* Sets the is_delete of this company_bookmark.
	*
	* @param is_delete the is_delete of this company_bookmark
	*/
	@Override
	public void setIs_delete(java.lang.Boolean is_delete) {
		_company_bookmark.setIs_delete(is_delete);
	}

	@Override
	public void setNew(boolean n) {
		_company_bookmark.setNew(n);
	}

	/**
	* Sets the primary key of this company_bookmark.
	*
	* @param primaryKey the primary key of this company_bookmark
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_company_bookmark.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_company_bookmark.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the update_date of this company_bookmark.
	*
	* @param update_date the update_date of this company_bookmark
	*/
	@Override
	public void setUpdate_date(Date update_date) {
		_company_bookmark.setUpdate_date(update_date);
	}

	/**
	* Sets the user ID of this company_bookmark.
	*
	* @param userId the user ID of this company_bookmark
	*/
	@Override
	public void setUserId(java.lang.Long userId) {
		_company_bookmark.setUserId(userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof company_bookmarkWrapper)) {
			return false;
		}

		company_bookmarkWrapper company_bookmarkWrapper = (company_bookmarkWrapper)obj;

		if (Objects.equals(_company_bookmark,
					company_bookmarkWrapper._company_bookmark)) {
			return true;
		}

		return false;
	}

	@Override
	public company_bookmark getWrappedModel() {
		return _company_bookmark;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _company_bookmark.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _company_bookmark.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_company_bookmark.resetOriginalValues();
	}

	private final company_bookmark _company_bookmark;
}