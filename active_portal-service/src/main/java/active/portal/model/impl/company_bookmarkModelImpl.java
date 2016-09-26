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

import active.portal.model.company_bookmark;
import active.portal.model.company_bookmarkModel;
import active.portal.model.company_bookmarkSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the company_bookmark service. Represents a row in the &quot;active_company_bookmark&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link company_bookmarkModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link company_bookmarkImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see company_bookmarkImpl
 * @see company_bookmark
 * @see company_bookmarkModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class company_bookmarkModelImpl extends BaseModelImpl<company_bookmark>
	implements company_bookmarkModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a company_bookmark model instance should use the {@link company_bookmark} interface instead.
	 */
	public static final String TABLE_NAME = "active_company_bookmark";
	public static final Object[][] TABLE_COLUMNS = {
			{ "companyId", Types.VARCHAR },
			{ "groupId", Types.VARCHAR },
			{ "bookmark_id", Types.VARCHAR },
			{ "bookmark_url", Types.VARCHAR },
			{ "bookmark_title", Types.VARCHAR },
			{ "userId", Types.BIGINT },
			{ "content", Types.VARCHAR },
			{ "create_date", Types.TIMESTAMP },
			{ "update_date", Types.TIMESTAMP },
			{ "is_delete", Types.BOOLEAN }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("companyId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("groupId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("bookmark_id", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("bookmark_url", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("bookmark_title", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("content", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("create_date", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("update_date", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("is_delete", Types.BOOLEAN);
	}

	public static final String TABLE_SQL_CREATE = "create table active_company_bookmark (companyId VARCHAR(75) null,groupId VARCHAR(75) null,bookmark_id VARCHAR(75) not null primary key,bookmark_url VARCHAR(75) null,bookmark_title VARCHAR(75) null,userId LONG,content VARCHAR(75) null,create_date DATE null,update_date DATE null,is_delete BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table active_company_bookmark";
	public static final String ORDER_BY_JPQL = " ORDER BY company_bookmark.bookmark_id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY active_company_bookmark.bookmark_id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(active.service.util.PropsUtil.get(
				"value.object.entity.cache.enabled.active.portal.model.company_bookmark"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(active.service.util.PropsUtil.get(
				"value.object.finder.cache.enabled.active.portal.model.company_bookmark"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(active.service.util.PropsUtil.get(
				"value.object.column.bitmask.enabled.active.portal.model.company_bookmark"),
			true);
	public static final long BOOKMARK_ID_COLUMN_BITMASK = 1L;
	public static final long BOOKMARK_TITLE_COLUMN_BITMASK = 2L;
	public static final long BOOKMARK_URL_COLUMN_BITMASK = 4L;
	public static final long USERID_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static company_bookmark toModel(company_bookmarkSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		company_bookmark model = new company_bookmarkImpl();

		model.setCompanyId(soapModel.getCompanyId());
		model.setGroupId(soapModel.getGroupId());
		model.setBookmark_id(soapModel.getBookmark_id());
		model.setBookmark_url(soapModel.getBookmark_url());
		model.setBookmark_title(soapModel.getBookmark_title());
		model.setUserId(soapModel.getUserId());
		model.setContent(soapModel.getContent());
		model.setCreate_date(soapModel.getCreate_date());
		model.setUpdate_date(soapModel.getUpdate_date());
		model.setIs_delete(soapModel.getIs_delete());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<company_bookmark> toModels(
		company_bookmarkSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<company_bookmark> models = new ArrayList<company_bookmark>(soapModels.length);

		for (company_bookmarkSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(active.service.util.PropsUtil.get(
				"lock.expiration.time.active.portal.model.company_bookmark"));

	public company_bookmarkModelImpl() {
	}

	@Override
	public String getPrimaryKey() {
		return _bookmark_id;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setBookmark_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _bookmark_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
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

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

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

	@JSON
	@Override
	public String getCompanyId() {
		if (_companyId == null) {
			return StringPool.BLANK;
		}
		else {
			return _companyId;
		}
	}

	@Override
	public void setCompanyId(String companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public String getGroupId() {
		if (_groupId == null) {
			return StringPool.BLANK;
		}
		else {
			return _groupId;
		}
	}

	@Override
	public void setGroupId(String groupId) {
		_groupId = groupId;
	}

	@JSON
	@Override
	public String getBookmark_id() {
		if (_bookmark_id == null) {
			return StringPool.BLANK;
		}
		else {
			return _bookmark_id;
		}
	}

	@Override
	public void setBookmark_id(String bookmark_id) {
		_columnBitmask |= BOOKMARK_ID_COLUMN_BITMASK;

		if (_originalBookmark_id == null) {
			_originalBookmark_id = _bookmark_id;
		}

		_bookmark_id = bookmark_id;
	}

	public String getOriginalBookmark_id() {
		return GetterUtil.getString(_originalBookmark_id);
	}

	@JSON
	@Override
	public String getBookmark_url() {
		if (_bookmark_url == null) {
			return StringPool.BLANK;
		}
		else {
			return _bookmark_url;
		}
	}

	@Override
	public void setBookmark_url(String bookmark_url) {
		_columnBitmask |= BOOKMARK_URL_COLUMN_BITMASK;

		if (_originalBookmark_url == null) {
			_originalBookmark_url = _bookmark_url;
		}

		_bookmark_url = bookmark_url;
	}

	public String getOriginalBookmark_url() {
		return GetterUtil.getString(_originalBookmark_url);
	}

	@JSON
	@Override
	public String getBookmark_title() {
		if (_bookmark_title == null) {
			return StringPool.BLANK;
		}
		else {
			return _bookmark_title;
		}
	}

	@Override
	public void setBookmark_title(String bookmark_title) {
		_columnBitmask |= BOOKMARK_TITLE_COLUMN_BITMASK;

		if (_originalBookmark_title == null) {
			_originalBookmark_title = _bookmark_title;
		}

		_bookmark_title = bookmark_title;
	}

	public String getOriginalBookmark_title() {
		return GetterUtil.getString(_originalBookmark_title);
	}

	@JSON
	@Override
	public Long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(Long userId) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

		_userId = userId;
	}

	public Long getOriginalUserId() {
		return _originalUserId;
	}

	@JSON
	@Override
	public String getContent() {
		if (_content == null) {
			return StringPool.BLANK;
		}
		else {
			return _content;
		}
	}

	@Override
	public void setContent(String content) {
		_content = content;
	}

	@JSON
	@Override
	public Date getCreate_date() {
		return _create_date;
	}

	@Override
	public void setCreate_date(Date create_date) {
		_create_date = create_date;
	}

	@JSON
	@Override
	public Date getUpdate_date() {
		return _update_date;
	}

	@Override
	public void setUpdate_date(Date update_date) {
		_update_date = update_date;
	}

	@JSON
	@Override
	public Boolean getIs_delete() {
		return _is_delete;
	}

	@Override
	public void setIs_delete(Boolean is_delete) {
		_is_delete = is_delete;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public company_bookmark toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (company_bookmark)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		company_bookmarkImpl company_bookmarkImpl = new company_bookmarkImpl();

		company_bookmarkImpl.setCompanyId(getCompanyId());
		company_bookmarkImpl.setGroupId(getGroupId());
		company_bookmarkImpl.setBookmark_id(getBookmark_id());
		company_bookmarkImpl.setBookmark_url(getBookmark_url());
		company_bookmarkImpl.setBookmark_title(getBookmark_title());
		company_bookmarkImpl.setUserId(getUserId());
		company_bookmarkImpl.setContent(getContent());
		company_bookmarkImpl.setCreate_date(getCreate_date());
		company_bookmarkImpl.setUpdate_date(getUpdate_date());
		company_bookmarkImpl.setIs_delete(getIs_delete());

		company_bookmarkImpl.resetOriginalValues();

		return company_bookmarkImpl;
	}

	@Override
	public int compareTo(company_bookmark company_bookmark) {
		String primaryKey = company_bookmark.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof company_bookmark)) {
			return false;
		}

		company_bookmark company_bookmark = (company_bookmark)obj;

		String primaryKey = company_bookmark.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		company_bookmarkModelImpl company_bookmarkModelImpl = this;

		company_bookmarkModelImpl._originalBookmark_id = company_bookmarkModelImpl._bookmark_id;

		company_bookmarkModelImpl._originalBookmark_url = company_bookmarkModelImpl._bookmark_url;

		company_bookmarkModelImpl._originalBookmark_title = company_bookmarkModelImpl._bookmark_title;

		company_bookmarkModelImpl._originalUserId = company_bookmarkModelImpl._userId;

		company_bookmarkModelImpl._setOriginalUserId = false;

		company_bookmarkModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<company_bookmark> toCacheModel() {
		company_bookmarkCacheModel company_bookmarkCacheModel = new company_bookmarkCacheModel();

		company_bookmarkCacheModel.companyId = getCompanyId();

		String companyId = company_bookmarkCacheModel.companyId;

		if ((companyId != null) && (companyId.length() == 0)) {
			company_bookmarkCacheModel.companyId = null;
		}

		company_bookmarkCacheModel.groupId = getGroupId();

		String groupId = company_bookmarkCacheModel.groupId;

		if ((groupId != null) && (groupId.length() == 0)) {
			company_bookmarkCacheModel.groupId = null;
		}

		company_bookmarkCacheModel.bookmark_id = getBookmark_id();

		String bookmark_id = company_bookmarkCacheModel.bookmark_id;

		if ((bookmark_id != null) && (bookmark_id.length() == 0)) {
			company_bookmarkCacheModel.bookmark_id = null;
		}

		company_bookmarkCacheModel.bookmark_url = getBookmark_url();

		String bookmark_url = company_bookmarkCacheModel.bookmark_url;

		if ((bookmark_url != null) && (bookmark_url.length() == 0)) {
			company_bookmarkCacheModel.bookmark_url = null;
		}

		company_bookmarkCacheModel.bookmark_title = getBookmark_title();

		String bookmark_title = company_bookmarkCacheModel.bookmark_title;

		if ((bookmark_title != null) && (bookmark_title.length() == 0)) {
			company_bookmarkCacheModel.bookmark_title = null;
		}

		company_bookmarkCacheModel.userId = getUserId();

		company_bookmarkCacheModel.content = getContent();

		String content = company_bookmarkCacheModel.content;

		if ((content != null) && (content.length() == 0)) {
			company_bookmarkCacheModel.content = null;
		}

		Date create_date = getCreate_date();

		if (create_date != null) {
			company_bookmarkCacheModel.create_date = create_date.getTime();
		}
		else {
			company_bookmarkCacheModel.create_date = Long.MIN_VALUE;
		}

		Date update_date = getUpdate_date();

		if (update_date != null) {
			company_bookmarkCacheModel.update_date = update_date.getTime();
		}
		else {
			company_bookmarkCacheModel.update_date = Long.MIN_VALUE;
		}

		company_bookmarkCacheModel.is_delete = getIs_delete();

		return company_bookmarkCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", bookmark_id=");
		sb.append(getBookmark_id());
		sb.append(", bookmark_url=");
		sb.append(getBookmark_url());
		sb.append(", bookmark_title=");
		sb.append(getBookmark_title());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", content=");
		sb.append(getContent());
		sb.append(", create_date=");
		sb.append(getCreate_date());
		sb.append(", update_date=");
		sb.append(getUpdate_date());
		sb.append(", is_delete=");
		sb.append(getIs_delete());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("active.portal.model.company_bookmark");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bookmark_id</column-name><column-value><![CDATA[");
		sb.append(getBookmark_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bookmark_url</column-name><column-value><![CDATA[");
		sb.append(getBookmark_url());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bookmark_title</column-name><column-value><![CDATA[");
		sb.append(getBookmark_title());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>content</column-name><column-value><![CDATA[");
		sb.append(getContent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>create_date</column-name><column-value><![CDATA[");
		sb.append(getCreate_date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>update_date</column-name><column-value><![CDATA[");
		sb.append(getUpdate_date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>is_delete</column-name><column-value><![CDATA[");
		sb.append(getIs_delete());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = company_bookmark.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			company_bookmark.class
		};
	private String _companyId;
	private String _groupId;
	private String _bookmark_id;
	private String _originalBookmark_id;
	private String _bookmark_url;
	private String _originalBookmark_url;
	private String _bookmark_title;
	private String _originalBookmark_title;
	private Long _userId;
	private Long _originalUserId;
	private boolean _setOriginalUserId;
	private String _content;
	private Date _create_date;
	private Date _update_date;
	private Boolean _is_delete;
	private long _columnBitmask;
	private company_bookmark _escapedModel;
}