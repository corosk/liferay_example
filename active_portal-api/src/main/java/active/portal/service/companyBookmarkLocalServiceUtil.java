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
 * Provides the local service utility for companyBookmark. This utility wraps
 * {@link active.portal.service.impl.companyBookmarkLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see companyBookmarkLocalService
 * @see active.portal.service.base.companyBookmarkLocalServiceBaseImpl
 * @see active.portal.service.impl.companyBookmarkLocalServiceImpl
 * @generated
 */
@ProviderType
public class companyBookmarkLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link active.portal.service.impl.companyBookmarkLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the company bookmark to the database. Also notifies the appropriate model listeners.
	*
	* @param companyBookmark the company bookmark
	* @return the company bookmark that was added
	*/
	public static active.portal.model.companyBookmark addcompanyBookmark(
		active.portal.model.companyBookmark companyBookmark) {
		return getService().addcompanyBookmark(companyBookmark);
	}

	/**
	* Creates a new company bookmark with the primary key. Does not add the company bookmark to the database.
	*
	* @param bookmarkId the primary key for the new company bookmark
	* @return the new company bookmark
	*/
	public static active.portal.model.companyBookmark createcompanyBookmark(
		java.lang.String bookmarkId) {
		return getService().createcompanyBookmark(bookmarkId);
	}

	/**
	* Deletes the company bookmark from the database. Also notifies the appropriate model listeners.
	*
	* @param companyBookmark the company bookmark
	* @return the company bookmark that was removed
	*/
	public static active.portal.model.companyBookmark deletecompanyBookmark(
		active.portal.model.companyBookmark companyBookmark) {
		return getService().deletecompanyBookmark(companyBookmark);
	}

	/**
	* Deletes the company bookmark with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookmarkId the primary key of the company bookmark
	* @return the company bookmark that was removed
	* @throws PortalException if a company bookmark with the primary key could not be found
	*/
	public static active.portal.model.companyBookmark deletecompanyBookmark(
		java.lang.String bookmarkId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletecompanyBookmark(bookmarkId);
	}

	public static active.portal.model.companyBookmark fetchcompanyBookmark(
		java.lang.String bookmarkId) {
		return getService().fetchcompanyBookmark(bookmarkId);
	}

	/**
	* Returns the company bookmark with the primary key.
	*
	* @param bookmarkId the primary key of the company bookmark
	* @return the company bookmark
	* @throws PortalException if a company bookmark with the primary key could not be found
	*/
	public static active.portal.model.companyBookmark getcompanyBookmark(
		java.lang.String bookmarkId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getcompanyBookmark(bookmarkId);
	}

	/**
	* Updates the company bookmark in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param companyBookmark the company bookmark
	* @return the company bookmark that was updated
	*/
	public static active.portal.model.companyBookmark updatecompanyBookmark(
		active.portal.model.companyBookmark companyBookmark) {
		return getService().updatecompanyBookmark(companyBookmark);
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
	* Returns the number of company bookmarks.
	*
	* @return the number of company bookmarks
	*/
	public static int getcompanyBookmarksCount() {
		return getService().getcompanyBookmarksCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link active.portal.model.impl.companyBookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link active.portal.model.impl.companyBookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the company bookmarks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link active.portal.model.impl.companyBookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of company bookmarks
	* @param end the upper bound of the range of company bookmarks (not inclusive)
	* @return the range of company bookmarks
	*/
	public static java.util.List<active.portal.model.companyBookmark> getcompanyBookmarks(
		int start, int end) {
		return getService().getcompanyBookmarks(start, end);
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

	public static companyBookmarkLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<companyBookmarkLocalService, companyBookmarkLocalService> _serviceTracker =
		ServiceTrackerFactory.open(companyBookmarkLocalService.class);
}