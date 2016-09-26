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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the company_bookmark service. Represents a row in the &quot;active_company_bookmark&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link active.portal.model.impl.company_bookmarkModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link active.portal.model.impl.company_bookmarkImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see company_bookmark
 * @see active.portal.model.impl.company_bookmarkImpl
 * @see active.portal.model.impl.company_bookmarkModelImpl
 * @generated
 */
@ProviderType
public interface company_bookmarkModel extends BaseModel<company_bookmark>,
	ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a company_bookmark model instance should use the {@link company_bookmark} interface instead.
	 */

	/**
	 * Returns the primary key of this company_bookmark.
	 *
	 * @return the primary key of this company_bookmark
	 */
	public String getPrimaryKey();

	/**
	 * Sets the primary key of this company_bookmark.
	 *
	 * @param primaryKey the primary key of this company_bookmark
	 */
	public void setPrimaryKey(String primaryKey);

	/**
	 * Returns the company ID of this company_bookmark.
	 *
	 * @return the company ID of this company_bookmark
	 */
	@AutoEscape
	@Override
	public String getCompanyId();

	/**
	 * Sets the company ID of this company_bookmark.
	 *
	 * @param companyId the company ID of this company_bookmark
	 */
	@Override
	public void setCompanyId(String companyId);

	/**
	 * Returns the group ID of this company_bookmark.
	 *
	 * @return the group ID of this company_bookmark
	 */
	@AutoEscape
	public String getGroupId();

	/**
	 * Sets the group ID of this company_bookmark.
	 *
	 * @param groupId the group ID of this company_bookmark
	 */
	public void setGroupId(String groupId);

	/**
	 * Returns the bookmark_id of this company_bookmark.
	 *
	 * @return the bookmark_id of this company_bookmark
	 */
	@AutoEscape
	public String getBookmark_id();

	/**
	 * Sets the bookmark_id of this company_bookmark.
	 *
	 * @param bookmark_id the bookmark_id of this company_bookmark
	 */
	public void setBookmark_id(String bookmark_id);

	/**
	 * Returns the bookmark_url of this company_bookmark.
	 *
	 * @return the bookmark_url of this company_bookmark
	 */
	@AutoEscape
	public String getBookmark_url();

	/**
	 * Sets the bookmark_url of this company_bookmark.
	 *
	 * @param bookmark_url the bookmark_url of this company_bookmark
	 */
	public void setBookmark_url(String bookmark_url);

	/**
	 * Returns the bookmark_title of this company_bookmark.
	 *
	 * @return the bookmark_title of this company_bookmark
	 */
	@AutoEscape
	public String getBookmark_title();

	/**
	 * Sets the bookmark_title of this company_bookmark.
	 *
	 * @param bookmark_title the bookmark_title of this company_bookmark
	 */
	public void setBookmark_title(String bookmark_title);

	/**
	 * Returns the user ID of this company_bookmark.
	 *
	 * @return the user ID of this company_bookmark
	 */
	public Long getUserId();

	/**
	 * Sets the user ID of this company_bookmark.
	 *
	 * @param userId the user ID of this company_bookmark
	 */
	public void setUserId(Long userId);

	/**
	 * Returns the content of this company_bookmark.
	 *
	 * @return the content of this company_bookmark
	 */
	@AutoEscape
	public String getContent();

	/**
	 * Sets the content of this company_bookmark.
	 *
	 * @param content the content of this company_bookmark
	 */
	public void setContent(String content);

	/**
	 * Returns the create_date of this company_bookmark.
	 *
	 * @return the create_date of this company_bookmark
	 */
	public Date getCreate_date();

	/**
	 * Sets the create_date of this company_bookmark.
	 *
	 * @param create_date the create_date of this company_bookmark
	 */
	public void setCreate_date(Date create_date);

	/**
	 * Returns the update_date of this company_bookmark.
	 *
	 * @return the update_date of this company_bookmark
	 */
	public Date getUpdate_date();

	/**
	 * Sets the update_date of this company_bookmark.
	 *
	 * @param update_date the update_date of this company_bookmark
	 */
	public void setUpdate_date(Date update_date);

	/**
	 * Returns the is_delete of this company_bookmark.
	 *
	 * @return the is_delete of this company_bookmark
	 */
	public Boolean getIs_delete();

	/**
	 * Sets the is_delete of this company_bookmark.
	 *
	 * @param is_delete the is_delete of this company_bookmark
	 */
	public void setIs_delete(Boolean is_delete);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(active.portal.model.company_bookmark company_bookmark);

	@Override
	public int hashCode();

	@Override
	public CacheModel<active.portal.model.company_bookmark> toCacheModel();

	@Override
	public active.portal.model.company_bookmark toEscapedModel();

	@Override
	public active.portal.model.company_bookmark toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}