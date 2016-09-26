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

package active.portal.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link company_bookmarkService}.
 *
 * @author Brian Wing Shun Chan
 * @see company_bookmarkService
 * @generated
 */
@ProviderType
public class company_bookmarkServiceWrapper implements company_bookmarkService,
	ServiceWrapper<company_bookmarkService> {
	public company_bookmarkServiceWrapper(
		company_bookmarkService company_bookmarkService) {
		_company_bookmarkService = company_bookmarkService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _company_bookmarkService.getOSGiServiceIdentifier();
	}

	@Override
	public java.lang.String helloWorld(java.lang.String worldName) {
		return _company_bookmarkService.helloWorld(worldName);
	}

	@Override
	public void updateUserLogin(long userId, Date loginDate) {
		_company_bookmarkService.updateUserLogin(userId, loginDate);
	}

	@Override
	public company_bookmarkService getWrappedService() {
		return _company_bookmarkService;
	}

	@Override
	public void setWrappedService(
		company_bookmarkService company_bookmarkService) {
		_company_bookmarkService = company_bookmarkService;
	}

	private company_bookmarkService _company_bookmarkService;
}