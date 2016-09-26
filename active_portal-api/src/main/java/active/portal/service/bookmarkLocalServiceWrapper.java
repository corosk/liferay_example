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
 * Provides a wrapper for {@link bookmarkLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see bookmarkLocalService
 * @generated
 */
@ProviderType
public class bookmarkLocalServiceWrapper implements bookmarkLocalService,
	ServiceWrapper<bookmarkLocalService> {
	public bookmarkLocalServiceWrapper(
		bookmarkLocalService bookmarkLocalService) {
		_bookmarkLocalService = bookmarkLocalService;
	}

	/**
	* Adds the bookmark to the database. Also notifies the appropriate model listeners.
	*
	* @param bookmark the bookmark
	* @return the bookmark that was added
	*/
	@Override
	public active.portal.model.bookmark addbookmark(
		active.portal.model.bookmark bookmark) {
		return _bookmarkLocalService.addbookmark(bookmark);
	}

	/**
	* Creates a new bookmark with the primary key. Does not add the bookmark to the database.
	*
	* @param bookmark_id the primary key for the new bookmark
	* @return the new bookmark
	*/
	@Override
	public active.portal.model.bookmark createbookmark(
		java.lang.Long bookmark_id) {
		return _bookmarkLocalService.createbookmark(bookmark_id);
	}

	/**
	* Deletes the bookmark from the database. Also notifies the appropriate model listeners.
	*
	* @param bookmark the bookmark
	* @return the bookmark that was removed
	*/
	@Override
	public active.portal.model.bookmark deletebookmark(
		active.portal.model.bookmark bookmark) {
		return _bookmarkLocalService.deletebookmark(bookmark);
	}

	/**
	* Deletes the bookmark with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookmark_id the primary key of the bookmark
	* @return the bookmark that was removed
	* @throws PortalException if a bookmark with the primary key could not be found
	*/
	@Override
	public active.portal.model.bookmark deletebookmark(
		java.lang.Long bookmark_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bookmarkLocalService.deletebookmark(bookmark_id);
	}

	@Override
	public active.portal.model.bookmark fetchbookmark(
		java.lang.Long bookmark_id) {
		return _bookmarkLocalService.fetchbookmark(bookmark_id);
	}

	/**
	* Returns the bookmark with the primary key.
	*
	* @param bookmark_id the primary key of the bookmark
	* @return the bookmark
	* @throws PortalException if a bookmark with the primary key could not be found
	*/
	@Override
	public active.portal.model.bookmark getbookmark(java.lang.Long bookmark_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bookmarkLocalService.getbookmark(bookmark_id);
	}

	/**
	* Updates the bookmark in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param bookmark the bookmark
	* @return the bookmark that was updated
	*/
	@Override
	public active.portal.model.bookmark updatebookmark(
		active.portal.model.bookmark bookmark) {
		return _bookmarkLocalService.updatebookmark(bookmark);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _bookmarkLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _bookmarkLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _bookmarkLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bookmarkLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bookmarkLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of bookmarks.
	*
	* @return the number of bookmarks
	*/
	@Override
	public int getbookmarksCount() {
		return _bookmarkLocalService.getbookmarksCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _bookmarkLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _bookmarkLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link active.portal.model.impl.bookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _bookmarkLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link active.portal.model.impl.bookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _bookmarkLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the bookmarks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link active.portal.model.impl.bookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bookmarks
	* @param end the upper bound of the range of bookmarks (not inclusive)
	* @return the range of bookmarks
	*/
	@Override
	public java.util.List<active.portal.model.bookmark> getbookmarks(
		int start, int end) {
		return _bookmarkLocalService.getbookmarks(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _bookmarkLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _bookmarkLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public bookmarkLocalService getWrappedService() {
		return _bookmarkLocalService;
	}

	@Override
	public void setWrappedService(bookmarkLocalService bookmarkLocalService) {
		_bookmarkLocalService = bookmarkLocalService;
	}

	private bookmarkLocalService _bookmarkLocalService;
}