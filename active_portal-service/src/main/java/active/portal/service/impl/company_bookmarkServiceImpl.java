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

package active.portal.service.impl;

import aQute.bnd.annotation.ProviderType;

import active.portal.service.base.company_bookmarkServiceBaseImpl;

/**
 * The implementation of the company_bookmark remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link active.portal.service.company_bookmarkService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see company_bookmarkServiceBaseImpl
 * @see active.portal.service.company_bookmarkServiceUtil
 */
@ProviderType
public class company_bookmarkServiceImpl extends company_bookmarkServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link active.portal.service.company_bookmarkServiceUtil} to access the company_bookmark remote service.
	 */
	public String helloWorld(final String worldName) {
	     return "Hello world: " + worldName;
	 }
   	
   	public void updateUserLogin(final long userId, final Date loginDate) {
   	    System.out.println("OK");
   	}
}