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
 * Provides a wrapper for {@link bookmarkService}.
 *
 * @author Brian Wing Shun Chan
 * @see bookmarkService
 * @generated
 */
@ProviderType
public class bookmarkServiceWrapper implements bookmarkService,
	ServiceWrapper<bookmarkService> {
	public bookmarkServiceWrapper(bookmarkService bookmarkService) {
		_bookmarkService = bookmarkService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _bookmarkService.getOSGiServiceIdentifier();
	}

	@Override
	public java.lang.String helloWorld(java.lang.String worldName) {
		return _bookmarkService.helloWorld(worldName);
	}

	@Override
	public void updateUserLogin(long userId, Date loginDate) {
		_bookmarkService.updateUserLogin(userId, loginDate);
	}

	@Override
	public bookmarkService getWrappedService() {
		return _bookmarkService;
	}

	@Override
	public void setWrappedService(bookmarkService bookmarkService) {
		_bookmarkService = bookmarkService;
	}

	private bookmarkService _bookmarkService;
}