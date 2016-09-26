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

package active.portal.service.persistence;

import aQute.bnd.annotation.ProviderType;

import active.portal.model.bookmark;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the bookmark service. This utility wraps {@link active.portal.service.persistence.impl.bookmarkPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see bookmarkPersistence
 * @see active.portal.service.persistence.impl.bookmarkPersistenceImpl
 * @generated
 */
@ProviderType
public class bookmarkUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(bookmark bookmark) {
		getPersistence().clearCache(bookmark);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<bookmark> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<bookmark> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<bookmark> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<bookmark> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static bookmark update(bookmark bookmark) {
		return getPersistence().update(bookmark);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static bookmark update(bookmark bookmark,
		ServiceContext serviceContext) {
		return getPersistence().update(bookmark, serviceContext);
	}

	/**
	* Returns all the bookmarks where bookmark_id = &#63;.
	*
	* @param bookmark_id the bookmark_id
	* @return the matching bookmarks
	*/
	public static List<bookmark> findBybookmarkId(java.lang.Long bookmark_id) {
		return getPersistence().findBybookmarkId(bookmark_id);
	}

	/**
	* Returns a range of all the bookmarks where bookmark_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bookmark_id the bookmark_id
	* @param start the lower bound of the range of bookmarks
	* @param end the upper bound of the range of bookmarks (not inclusive)
	* @return the range of matching bookmarks
	*/
	public static List<bookmark> findBybookmarkId(java.lang.Long bookmark_id,
		int start, int end) {
		return getPersistence().findBybookmarkId(bookmark_id, start, end);
	}

	/**
	* Returns an ordered range of all the bookmarks where bookmark_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bookmark_id the bookmark_id
	* @param start the lower bound of the range of bookmarks
	* @param end the upper bound of the range of bookmarks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bookmarks
	*/
	public static List<bookmark> findBybookmarkId(java.lang.Long bookmark_id,
		int start, int end, OrderByComparator<bookmark> orderByComparator) {
		return getPersistence()
				   .findBybookmarkId(bookmark_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the bookmarks where bookmark_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bookmark_id the bookmark_id
	* @param start the lower bound of the range of bookmarks
	* @param end the upper bound of the range of bookmarks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching bookmarks
	*/
	public static List<bookmark> findBybookmarkId(java.lang.Long bookmark_id,
		int start, int end, OrderByComparator<bookmark> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBybookmarkId(bookmark_id, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first bookmark in the ordered set where bookmark_id = &#63;.
	*
	* @param bookmark_id the bookmark_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookmark
	* @throws NoSuchbookmarkException if a matching bookmark could not be found
	*/
	public static bookmark findBybookmarkId_First(java.lang.Long bookmark_id,
		OrderByComparator<bookmark> orderByComparator)
		throws active.portal.exception.NoSuchbookmarkException {
		return getPersistence()
				   .findBybookmarkId_First(bookmark_id, orderByComparator);
	}

	/**
	* Returns the first bookmark in the ordered set where bookmark_id = &#63;.
	*
	* @param bookmark_id the bookmark_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookmark, or <code>null</code> if a matching bookmark could not be found
	*/
	public static bookmark fetchBybookmarkId_First(java.lang.Long bookmark_id,
		OrderByComparator<bookmark> orderByComparator) {
		return getPersistence()
				   .fetchBybookmarkId_First(bookmark_id, orderByComparator);
	}

	/**
	* Returns the last bookmark in the ordered set where bookmark_id = &#63;.
	*
	* @param bookmark_id the bookmark_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookmark
	* @throws NoSuchbookmarkException if a matching bookmark could not be found
	*/
	public static bookmark findBybookmarkId_Last(java.lang.Long bookmark_id,
		OrderByComparator<bookmark> orderByComparator)
		throws active.portal.exception.NoSuchbookmarkException {
		return getPersistence()
				   .findBybookmarkId_Last(bookmark_id, orderByComparator);
	}

	/**
	* Returns the last bookmark in the ordered set where bookmark_id = &#63;.
	*
	* @param bookmark_id the bookmark_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookmark, or <code>null</code> if a matching bookmark could not be found
	*/
	public static bookmark fetchBybookmarkId_Last(java.lang.Long bookmark_id,
		OrderByComparator<bookmark> orderByComparator) {
		return getPersistence()
				   .fetchBybookmarkId_Last(bookmark_id, orderByComparator);
	}

	/**
	* Removes all the bookmarks where bookmark_id = &#63; from the database.
	*
	* @param bookmark_id the bookmark_id
	*/
	public static void removeBybookmarkId(java.lang.Long bookmark_id) {
		getPersistence().removeBybookmarkId(bookmark_id);
	}

	/**
	* Returns the number of bookmarks where bookmark_id = &#63;.
	*
	* @param bookmark_id the bookmark_id
	* @return the number of matching bookmarks
	*/
	public static int countBybookmarkId(java.lang.Long bookmark_id) {
		return getPersistence().countBybookmarkId(bookmark_id);
	}

	/**
	* Returns all the bookmarks where bookmark_url = &#63;.
	*
	* @param bookmark_url the bookmark_url
	* @return the matching bookmarks
	*/
	public static List<bookmark> findBybookmarkUrl(
		java.lang.String bookmark_url) {
		return getPersistence().findBybookmarkUrl(bookmark_url);
	}

	/**
	* Returns a range of all the bookmarks where bookmark_url = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bookmark_url the bookmark_url
	* @param start the lower bound of the range of bookmarks
	* @param end the upper bound of the range of bookmarks (not inclusive)
	* @return the range of matching bookmarks
	*/
	public static List<bookmark> findBybookmarkUrl(
		java.lang.String bookmark_url, int start, int end) {
		return getPersistence().findBybookmarkUrl(bookmark_url, start, end);
	}

	/**
	* Returns an ordered range of all the bookmarks where bookmark_url = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bookmark_url the bookmark_url
	* @param start the lower bound of the range of bookmarks
	* @param end the upper bound of the range of bookmarks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bookmarks
	*/
	public static List<bookmark> findBybookmarkUrl(
		java.lang.String bookmark_url, int start, int end,
		OrderByComparator<bookmark> orderByComparator) {
		return getPersistence()
				   .findBybookmarkUrl(bookmark_url, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the bookmarks where bookmark_url = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bookmark_url the bookmark_url
	* @param start the lower bound of the range of bookmarks
	* @param end the upper bound of the range of bookmarks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching bookmarks
	*/
	public static List<bookmark> findBybookmarkUrl(
		java.lang.String bookmark_url, int start, int end,
		OrderByComparator<bookmark> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findBybookmarkUrl(bookmark_url, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first bookmark in the ordered set where bookmark_url = &#63;.
	*
	* @param bookmark_url the bookmark_url
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookmark
	* @throws NoSuchbookmarkException if a matching bookmark could not be found
	*/
	public static bookmark findBybookmarkUrl_First(
		java.lang.String bookmark_url,
		OrderByComparator<bookmark> orderByComparator)
		throws active.portal.exception.NoSuchbookmarkException {
		return getPersistence()
				   .findBybookmarkUrl_First(bookmark_url, orderByComparator);
	}

	/**
	* Returns the first bookmark in the ordered set where bookmark_url = &#63;.
	*
	* @param bookmark_url the bookmark_url
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookmark, or <code>null</code> if a matching bookmark could not be found
	*/
	public static bookmark fetchBybookmarkUrl_First(
		java.lang.String bookmark_url,
		OrderByComparator<bookmark> orderByComparator) {
		return getPersistence()
				   .fetchBybookmarkUrl_First(bookmark_url, orderByComparator);
	}

	/**
	* Returns the last bookmark in the ordered set where bookmark_url = &#63;.
	*
	* @param bookmark_url the bookmark_url
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookmark
	* @throws NoSuchbookmarkException if a matching bookmark could not be found
	*/
	public static bookmark findBybookmarkUrl_Last(
		java.lang.String bookmark_url,
		OrderByComparator<bookmark> orderByComparator)
		throws active.portal.exception.NoSuchbookmarkException {
		return getPersistence()
				   .findBybookmarkUrl_Last(bookmark_url, orderByComparator);
	}

	/**
	* Returns the last bookmark in the ordered set where bookmark_url = &#63;.
	*
	* @param bookmark_url the bookmark_url
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookmark, or <code>null</code> if a matching bookmark could not be found
	*/
	public static bookmark fetchBybookmarkUrl_Last(
		java.lang.String bookmark_url,
		OrderByComparator<bookmark> orderByComparator) {
		return getPersistence()
				   .fetchBybookmarkUrl_Last(bookmark_url, orderByComparator);
	}

	/**
	* Returns the bookmarks before and after the current bookmark in the ordered set where bookmark_url = &#63;.
	*
	* @param bookmark_id the primary key of the current bookmark
	* @param bookmark_url the bookmark_url
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bookmark
	* @throws NoSuchbookmarkException if a bookmark with the primary key could not be found
	*/
	public static bookmark[] findBybookmarkUrl_PrevAndNext(
		java.lang.Long bookmark_id, java.lang.String bookmark_url,
		OrderByComparator<bookmark> orderByComparator)
		throws active.portal.exception.NoSuchbookmarkException {
		return getPersistence()
				   .findBybookmarkUrl_PrevAndNext(bookmark_id, bookmark_url,
			orderByComparator);
	}

	/**
	* Removes all the bookmarks where bookmark_url = &#63; from the database.
	*
	* @param bookmark_url the bookmark_url
	*/
	public static void removeBybookmarkUrl(java.lang.String bookmark_url) {
		getPersistence().removeBybookmarkUrl(bookmark_url);
	}

	/**
	* Returns the number of bookmarks where bookmark_url = &#63;.
	*
	* @param bookmark_url the bookmark_url
	* @return the number of matching bookmarks
	*/
	public static int countBybookmarkUrl(java.lang.String bookmark_url) {
		return getPersistence().countBybookmarkUrl(bookmark_url);
	}

	/**
	* Returns all the bookmarks where bookmark_title = &#63;.
	*
	* @param bookmark_title the bookmark_title
	* @return the matching bookmarks
	*/
	public static List<bookmark> findBybookmarTitle(
		java.lang.String bookmark_title) {
		return getPersistence().findBybookmarTitle(bookmark_title);
	}

	/**
	* Returns a range of all the bookmarks where bookmark_title = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bookmark_title the bookmark_title
	* @param start the lower bound of the range of bookmarks
	* @param end the upper bound of the range of bookmarks (not inclusive)
	* @return the range of matching bookmarks
	*/
	public static List<bookmark> findBybookmarTitle(
		java.lang.String bookmark_title, int start, int end) {
		return getPersistence().findBybookmarTitle(bookmark_title, start, end);
	}

	/**
	* Returns an ordered range of all the bookmarks where bookmark_title = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bookmark_title the bookmark_title
	* @param start the lower bound of the range of bookmarks
	* @param end the upper bound of the range of bookmarks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bookmarks
	*/
	public static List<bookmark> findBybookmarTitle(
		java.lang.String bookmark_title, int start, int end,
		OrderByComparator<bookmark> orderByComparator) {
		return getPersistence()
				   .findBybookmarTitle(bookmark_title, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the bookmarks where bookmark_title = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bookmark_title the bookmark_title
	* @param start the lower bound of the range of bookmarks
	* @param end the upper bound of the range of bookmarks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching bookmarks
	*/
	public static List<bookmark> findBybookmarTitle(
		java.lang.String bookmark_title, int start, int end,
		OrderByComparator<bookmark> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findBybookmarTitle(bookmark_title, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first bookmark in the ordered set where bookmark_title = &#63;.
	*
	* @param bookmark_title the bookmark_title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookmark
	* @throws NoSuchbookmarkException if a matching bookmark could not be found
	*/
	public static bookmark findBybookmarTitle_First(
		java.lang.String bookmark_title,
		OrderByComparator<bookmark> orderByComparator)
		throws active.portal.exception.NoSuchbookmarkException {
		return getPersistence()
				   .findBybookmarTitle_First(bookmark_title, orderByComparator);
	}

	/**
	* Returns the first bookmark in the ordered set where bookmark_title = &#63;.
	*
	* @param bookmark_title the bookmark_title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookmark, or <code>null</code> if a matching bookmark could not be found
	*/
	public static bookmark fetchBybookmarTitle_First(
		java.lang.String bookmark_title,
		OrderByComparator<bookmark> orderByComparator) {
		return getPersistence()
				   .fetchBybookmarTitle_First(bookmark_title, orderByComparator);
	}

	/**
	* Returns the last bookmark in the ordered set where bookmark_title = &#63;.
	*
	* @param bookmark_title the bookmark_title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookmark
	* @throws NoSuchbookmarkException if a matching bookmark could not be found
	*/
	public static bookmark findBybookmarTitle_Last(
		java.lang.String bookmark_title,
		OrderByComparator<bookmark> orderByComparator)
		throws active.portal.exception.NoSuchbookmarkException {
		return getPersistence()
				   .findBybookmarTitle_Last(bookmark_title, orderByComparator);
	}

	/**
	* Returns the last bookmark in the ordered set where bookmark_title = &#63;.
	*
	* @param bookmark_title the bookmark_title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookmark, or <code>null</code> if a matching bookmark could not be found
	*/
	public static bookmark fetchBybookmarTitle_Last(
		java.lang.String bookmark_title,
		OrderByComparator<bookmark> orderByComparator) {
		return getPersistence()
				   .fetchBybookmarTitle_Last(bookmark_title, orderByComparator);
	}

	/**
	* Returns the bookmarks before and after the current bookmark in the ordered set where bookmark_title = &#63;.
	*
	* @param bookmark_id the primary key of the current bookmark
	* @param bookmark_title the bookmark_title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bookmark
	* @throws NoSuchbookmarkException if a bookmark with the primary key could not be found
	*/
	public static bookmark[] findBybookmarTitle_PrevAndNext(
		java.lang.Long bookmark_id, java.lang.String bookmark_title,
		OrderByComparator<bookmark> orderByComparator)
		throws active.portal.exception.NoSuchbookmarkException {
		return getPersistence()
				   .findBybookmarTitle_PrevAndNext(bookmark_id, bookmark_title,
			orderByComparator);
	}

	/**
	* Removes all the bookmarks where bookmark_title = &#63; from the database.
	*
	* @param bookmark_title the bookmark_title
	*/
	public static void removeBybookmarTitle(java.lang.String bookmark_title) {
		getPersistence().removeBybookmarTitle(bookmark_title);
	}

	/**
	* Returns the number of bookmarks where bookmark_title = &#63;.
	*
	* @param bookmark_title the bookmark_title
	* @return the number of matching bookmarks
	*/
	public static int countBybookmarTitle(java.lang.String bookmark_title) {
		return getPersistence().countBybookmarTitle(bookmark_title);
	}

	/**
	* Returns all the bookmarks where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching bookmarks
	*/
	public static List<bookmark> findBybookmarUserId(java.lang.Long userId) {
		return getPersistence().findBybookmarUserId(userId);
	}

	/**
	* Returns a range of all the bookmarks where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of bookmarks
	* @param end the upper bound of the range of bookmarks (not inclusive)
	* @return the range of matching bookmarks
	*/
	public static List<bookmark> findBybookmarUserId(java.lang.Long userId,
		int start, int end) {
		return getPersistence().findBybookmarUserId(userId, start, end);
	}

	/**
	* Returns an ordered range of all the bookmarks where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of bookmarks
	* @param end the upper bound of the range of bookmarks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bookmarks
	*/
	public static List<bookmark> findBybookmarUserId(java.lang.Long userId,
		int start, int end, OrderByComparator<bookmark> orderByComparator) {
		return getPersistence()
				   .findBybookmarUserId(userId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the bookmarks where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of bookmarks
	* @param end the upper bound of the range of bookmarks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching bookmarks
	*/
	public static List<bookmark> findBybookmarUserId(java.lang.Long userId,
		int start, int end, OrderByComparator<bookmark> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBybookmarUserId(userId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first bookmark in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookmark
	* @throws NoSuchbookmarkException if a matching bookmark could not be found
	*/
	public static bookmark findBybookmarUserId_First(java.lang.Long userId,
		OrderByComparator<bookmark> orderByComparator)
		throws active.portal.exception.NoSuchbookmarkException {
		return getPersistence()
				   .findBybookmarUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first bookmark in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookmark, or <code>null</code> if a matching bookmark could not be found
	*/
	public static bookmark fetchBybookmarUserId_First(java.lang.Long userId,
		OrderByComparator<bookmark> orderByComparator) {
		return getPersistence()
				   .fetchBybookmarUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last bookmark in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookmark
	* @throws NoSuchbookmarkException if a matching bookmark could not be found
	*/
	public static bookmark findBybookmarUserId_Last(java.lang.Long userId,
		OrderByComparator<bookmark> orderByComparator)
		throws active.portal.exception.NoSuchbookmarkException {
		return getPersistence()
				   .findBybookmarUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last bookmark in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookmark, or <code>null</code> if a matching bookmark could not be found
	*/
	public static bookmark fetchBybookmarUserId_Last(java.lang.Long userId,
		OrderByComparator<bookmark> orderByComparator) {
		return getPersistence()
				   .fetchBybookmarUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the bookmarks before and after the current bookmark in the ordered set where userId = &#63;.
	*
	* @param bookmark_id the primary key of the current bookmark
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bookmark
	* @throws NoSuchbookmarkException if a bookmark with the primary key could not be found
	*/
	public static bookmark[] findBybookmarUserId_PrevAndNext(
		java.lang.Long bookmark_id, java.lang.Long userId,
		OrderByComparator<bookmark> orderByComparator)
		throws active.portal.exception.NoSuchbookmarkException {
		return getPersistence()
				   .findBybookmarUserId_PrevAndNext(bookmark_id, userId,
			orderByComparator);
	}

	/**
	* Removes all the bookmarks where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public static void removeBybookmarUserId(java.lang.Long userId) {
		getPersistence().removeBybookmarUserId(userId);
	}

	/**
	* Returns the number of bookmarks where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching bookmarks
	*/
	public static int countBybookmarUserId(java.lang.Long userId) {
		return getPersistence().countBybookmarUserId(userId);
	}

	/**
	* Caches the bookmark in the entity cache if it is enabled.
	*
	* @param bookmark the bookmark
	*/
	public static void cacheResult(bookmark bookmark) {
		getPersistence().cacheResult(bookmark);
	}

	/**
	* Caches the bookmarks in the entity cache if it is enabled.
	*
	* @param bookmarks the bookmarks
	*/
	public static void cacheResult(List<bookmark> bookmarks) {
		getPersistence().cacheResult(bookmarks);
	}

	/**
	* Creates a new bookmark with the primary key. Does not add the bookmark to the database.
	*
	* @param bookmark_id the primary key for the new bookmark
	* @return the new bookmark
	*/
	public static bookmark create(java.lang.Long bookmark_id) {
		return getPersistence().create(bookmark_id);
	}

	/**
	* Removes the bookmark with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookmark_id the primary key of the bookmark
	* @return the bookmark that was removed
	* @throws NoSuchbookmarkException if a bookmark with the primary key could not be found
	*/
	public static bookmark remove(java.lang.Long bookmark_id)
		throws active.portal.exception.NoSuchbookmarkException {
		return getPersistence().remove(bookmark_id);
	}

	public static bookmark updateImpl(bookmark bookmark) {
		return getPersistence().updateImpl(bookmark);
	}

	/**
	* Returns the bookmark with the primary key or throws a {@link NoSuchbookmarkException} if it could not be found.
	*
	* @param bookmark_id the primary key of the bookmark
	* @return the bookmark
	* @throws NoSuchbookmarkException if a bookmark with the primary key could not be found
	*/
	public static bookmark findByPrimaryKey(java.lang.Long bookmark_id)
		throws active.portal.exception.NoSuchbookmarkException {
		return getPersistence().findByPrimaryKey(bookmark_id);
	}

	/**
	* Returns the bookmark with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param bookmark_id the primary key of the bookmark
	* @return the bookmark, or <code>null</code> if a bookmark with the primary key could not be found
	*/
	public static bookmark fetchByPrimaryKey(java.lang.Long bookmark_id) {
		return getPersistence().fetchByPrimaryKey(bookmark_id);
	}

	public static java.util.Map<java.io.Serializable, bookmark> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the bookmarks.
	*
	* @return the bookmarks
	*/
	public static List<bookmark> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the bookmarks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bookmarks
	* @param end the upper bound of the range of bookmarks (not inclusive)
	* @return the range of bookmarks
	*/
	public static List<bookmark> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the bookmarks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bookmarks
	* @param end the upper bound of the range of bookmarks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of bookmarks
	*/
	public static List<bookmark> findAll(int start, int end,
		OrderByComparator<bookmark> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the bookmarks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bookmarks
	* @param end the upper bound of the range of bookmarks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of bookmarks
	*/
	public static List<bookmark> findAll(int start, int end,
		OrderByComparator<bookmark> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the bookmarks from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of bookmarks.
	*
	* @return the number of bookmarks
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static bookmarkPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<bookmarkPersistence, bookmarkPersistence> _serviceTracker =
		ServiceTrackerFactory.open(bookmarkPersistence.class);
}