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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for company_bookmark. This utility wraps
 * {@link active.portal.service.impl.company_bookmarkLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see company_bookmarkLocalService
 * @see active.portal.service.base.company_bookmarkLocalServiceBaseImpl
 * @see active.portal.service.impl.company_bookmarkLocalServiceImpl
 * @generated
 */
@ProviderType
public class company_bookmarkLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link active.portal.service.impl.company_bookmarkLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the company_bookmark to the database. Also notifies the appropriate model listeners.
	*
	* @param company_bookmark the company_bookmark
	* @return the company_bookmark that was added
	*/
	public static active.portal.model.company_bookmark addcompany_bookmark(
		active.portal.model.company_bookmark company_bookmark) {
		return getService().addcompany_bookmark(company_bookmark);
	}

	/**
	* Creates a new company_bookmark with the primary key. Does not add the company_bookmark to the database.
	*
	* @param bookmark_id the primary key for the new company_bookmark
	* @return the new company_bookmark
	*/
	public static active.portal.model.company_bookmark createcompany_bookmark(
		java.lang.String bookmark_id) {
		return getService().createcompany_bookmark(bookmark_id);
	}

	/**
	* Deletes the company_bookmark from the database. Also notifies the appropriate model listeners.
	*
	* @param company_bookmark the company_bookmark
	* @return the company_bookmark that was removed
	*/
	public static active.portal.model.company_bookmark deletecompany_bookmark(
		active.portal.model.company_bookmark company_bookmark) {
		return getService().deletecompany_bookmark(company_bookmark);
	}

	/**
	* Deletes the company_bookmark with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookmark_id the primary key of the company_bookmark
	* @return the company_bookmark that was removed
	* @throws PortalException if a company_bookmark with the primary key could not be found
	*/
	public static active.portal.model.company_bookmark deletecompany_bookmark(
		java.lang.String bookmark_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletecompany_bookmark(bookmark_id);
	}

	public static active.portal.model.company_bookmark fetchcompany_bookmark(
		java.lang.String bookmark_id) {
		return getService().fetchcompany_bookmark(bookmark_id);
	}

	/**
	* Returns the company_bookmark with the primary key.
	*
	* @param bookmark_id the primary key of the company_bookmark
	* @return the company_bookmark
	* @throws PortalException if a company_bookmark with the primary key could not be found
	*/
	public static active.portal.model.company_bookmark getcompany_bookmark(
		java.lang.String bookmark_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getcompany_bookmark(bookmark_id);
	}

	/**
	* Updates the company_bookmark in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param company_bookmark the company_bookmark
	* @return the company_bookmark that was updated
	*/
	public static active.portal.model.company_bookmark updatecompany_bookmark(
		active.portal.model.company_bookmark company_bookmark) {
		return getService().updatecompany_bookmark(company_bookmark);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of company_bookmarks.
	*
	* @return the number of company_bookmarks
	*/
	public static int getcompany_bookmarksCount() {
		return getService().getcompany_bookmarksCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.lang.String helloWorld(java.lang.String worldName) {
		return getService().helloWorld(worldName);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link active.portal.model.impl.company_bookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link active.portal.model.impl.company_bookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the company_bookmarks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link active.portal.model.impl.company_bookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of company_bookmarks
	* @param end the upper bound of the range of company_bookmarks (not inclusive)
	* @return the range of company_bookmarks
	*/
	public static java.util.List<active.portal.model.company_bookmark> getcompany_bookmarks(
		int start, int end) {
		return getService().getcompany_bookmarks(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static void updateUserLogin(long userId, Date loginDate) {
		getService().updateUserLogin(userId, loginDate);
	}

	public static company_bookmarkLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<company_bookmarkLocalService, company_bookmarkLocalService> _serviceTracker =
		ServiceTrackerFactory.open(company_bookmarkLocalService.class);
}