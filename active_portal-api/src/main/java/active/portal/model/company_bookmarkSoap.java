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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link active.portal.service.http.company_bookmarkServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see active.portal.service.http.company_bookmarkServiceSoap
 * @generated
 */
@ProviderType
public class company_bookmarkSoap implements Serializable {
	public static company_bookmarkSoap toSoapModel(company_bookmark model) {
		company_bookmarkSoap soapModel = new company_bookmarkSoap();

		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setBookmark_id(model.getBookmark_id());
		soapModel.setBookmark_url(model.getBookmark_url());
		soapModel.setBookmark_title(model.getBookmark_title());
		soapModel.setUserId(model.getUserId());
		soapModel.setContent(model.getContent());
		soapModel.setCreate_date(model.getCreate_date());
		soapModel.setUpdate_date(model.getUpdate_date());
		soapModel.setIs_delete(model.getIs_delete());

		return soapModel;
	}

	public static company_bookmarkSoap[] toSoapModels(company_bookmark[] models) {
		company_bookmarkSoap[] soapModels = new company_bookmarkSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static company_bookmarkSoap[][] toSoapModels(
		company_bookmark[][] models) {
		company_bookmarkSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new company_bookmarkSoap[models.length][models[0].length];
		}
		else {
			soapModels = new company_bookmarkSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static company_bookmarkSoap[] toSoapModels(
		List<company_bookmark> models) {
		List<company_bookmarkSoap> soapModels = new ArrayList<company_bookmarkSoap>(models.size());

		for (company_bookmark model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new company_bookmarkSoap[soapModels.size()]);
	}

	public company_bookmarkSoap() {
	}

	public String getPrimaryKey() {
		return _bookmark_id;
	}

	public void setPrimaryKey(String pk) {
		setBookmark_id(pk);
	}

	public String getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(String companyId) {
		_companyId = companyId;
	}

	public String getGroupId() {
		return _groupId;
	}

	public void setGroupId(String groupId) {
		_groupId = groupId;
	}

	public String getBookmark_id() {
		return _bookmark_id;
	}

	public void setBookmark_id(String bookmark_id) {
		_bookmark_id = bookmark_id;
	}

	public String getBookmark_url() {
		return _bookmark_url;
	}

	public void setBookmark_url(String bookmark_url) {
		_bookmark_url = bookmark_url;
	}

	public String getBookmark_title() {
		return _bookmark_title;
	}

	public void setBookmark_title(String bookmark_title) {
		_bookmark_title = bookmark_title;
	}

	public Long getUserId() {
		return _userId;
	}

	public void setUserId(Long userId) {
		_userId = userId;
	}

	public String getContent() {
		return _content;
	}

	public void setContent(String content) {
		_content = content;
	}

	public Date getCreate_date() {
		return _create_date;
	}

	public void setCreate_date(Date create_date) {
		_create_date = create_date;
	}

	public Date getUpdate_date() {
		return _update_date;
	}

	public void setUpdate_date(Date update_date) {
		_update_date = update_date;
	}

	public Boolean getIs_delete() {
		return _is_delete;
	}

	public void setIs_delete(Boolean is_delete) {
		_is_delete = is_delete;
	}

	private String _companyId;
	private String _groupId;
	private String _bookmark_id;
	private String _bookmark_url;
	private String _bookmark_title;
	private Long _userId;
	private String _content;
	private Date _create_date;
	private Date _update_date;
	private Boolean _is_delete;
}