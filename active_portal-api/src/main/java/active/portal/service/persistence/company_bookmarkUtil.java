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

import active.portal.model.company_bookmark;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the company_bookmark service. This utility wraps {@link active.portal.service.persistence.impl.company_bookmarkPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see company_bookmarkPersistence
 * @see active.portal.service.persistence.impl.company_bookmarkPersistenceImpl
 * @generated
 */
@ProviderType
public class company_bookmarkUtil {
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
	public static void clearCache(company_bookmark company_bookmark) {
		getPersistence().clearCache(company_bookmark);
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
	public static List<company_bookmark> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<company_bookmark> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<company_bookmark> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<company_bookmark> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static company_bookmark update(company_bookmark company_bookmark) {
		return getPersistence().update(company_bookmark);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static company_bookmark update(company_bookmark company_bookmark,
		ServiceContext serviceContext) {
		return getPersistence().update(company_bookmark, serviceContext);
	}

	/**
	* Returns all the company_bookmarks where bookmark_id = &#63;.
	*
	* @param bookmark_id the bookmark_id
	* @return the matching company_bookmarks
	*/
	public static List<company_bookmark> findBybookmarkId(
		java.lang.String bookmark_id) {
		return getPersistence().findBybookmarkId(bookmark_id);
	}

	/**
	* Returns a range of all the company_bookmarks where bookmark_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link company_bookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bookmark_id the bookmark_id
	* @param start the lower bound of the range of company_bookmarks
	* @param end the upper bound of the range of company_bookmarks (not inclusive)
	* @return the range of matching company_bookmarks
	*/
	public static List<company_bookmark> findBybookmarkId(
		java.lang.String bookmark_id, int start, int end) {
		return getPersistence().findBybookmarkId(bookmark_id, start, end);
	}

	/**
	* Returns an ordered range of all the company_bookmarks where bookmark_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link company_bookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bookmark_id the bookmark_id
	* @param start the lower bound of the range of company_bookmarks
	* @param end the upper bound of the range of company_bookmarks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching company_bookmarks
	*/
	public static List<company_bookmark> findBybookmarkId(
		java.lang.String bookmark_id, int start, int end,
		OrderByComparator<company_bookmark> orderByComparator) {
		return getPersistence()
				   .findBybookmarkId(bookmark_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the company_bookmarks where bookmark_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link company_bookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bookmark_id the bookmark_id
	* @param start the lower bound of the range of company_bookmarks
	* @param end the upper bound of the range of company_bookmarks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching company_bookmarks
	*/
	public static List<company_bookmark> findBybookmarkId(
		java.lang.String bookmark_id, int start, int end,
		OrderByComparator<company_bookmark> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBybookmarkId(bookmark_id, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first company_bookmark in the ordered set where bookmark_id = &#63;.
	*
	* @param bookmark_id the bookmark_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching company_bookmark
	* @throws NoSuchcompany_bookmarkException if a matching company_bookmark could not be found
	*/
	public static company_bookmark findBybookmarkId_First(
		java.lang.String bookmark_id,
		OrderByComparator<company_bookmark> orderByComparator)
		throws active.portal.exception.NoSuchcompany_bookmarkException {
		return getPersistence()
				   .findBybookmarkId_First(bookmark_id, orderByComparator);
	}

	/**
	* Returns the first company_bookmark in the ordered set where bookmark_id = &#63;.
	*
	* @param bookmark_id the bookmark_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching company_bookmark, or <code>null</code> if a matching company_bookmark could not be found
	*/
	public static company_bookmark fetchBybookmarkId_First(
		java.lang.String bookmark_id,
		OrderByComparator<company_bookmark> orderByComparator) {
		return getPersistence()
				   .fetchBybookmarkId_First(bookmark_id, orderByComparator);
	}

	/**
	* Returns the last company_bookmark in the ordered set where bookmark_id = &#63;.
	*
	* @param bookmark_id the bookmark_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching company_bookmark
	* @throws NoSuchcompany_bookmarkException if a matching company_bookmark could not be found
	*/
	public static company_bookmark findBybookmarkId_Last(
		java.lang.String bookmark_id,
		OrderByComparator<company_bookmark> orderByComparator)
		throws active.portal.exception.NoSuchcompany_bookmarkException {
		return getPersistence()
				   .findBybookmarkId_Last(bookmark_id, orderByComparator);
	}

	/**
	* Returns the last company_bookmark in the ordered set where bookmark_id = &#63;.
	*
	* @param bookmark_id the bookmark_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching company_bookmark, or <code>null</code> if a matching company_bookmark could not be found
	*/
	public static company_bookmark fetchBybookmarkId_Last(
		java.lang.String bookmark_id,
		OrderByComparator<company_bookmark> orderByComparator) {
		return getPersistence()
				   .fetchBybookmarkId_Last(bookmark_id, orderByComparator);
	}

	/**
	* Removes all the company_bookmarks where bookmark_id = &#63; from the database.
	*
	* @param bookmark_id the bookmark_id
	*/
	public static void removeBybookmarkId(java.lang.String bookmark_id) {
		getPersistence().removeBybookmarkId(bookmark_id);
	}

	/**
	* Returns the number of company_bookmarks where bookmark_id = &#63;.
	*
	* @param bookmark_id the bookmark_id
	* @return the number of matching company_bookmarks
	*/
	public static int countBybookmarkId(java.lang.String bookmark_id) {
		return getPersistence().countBybookmarkId(bookmark_id);
	}

	/**
	* Returns all the company_bookmarks where bookmark_url = &#63;.
	*
	* @param bookmark_url the bookmark_url
	* @return the matching company_bookmarks
	*/
	public static List<company_bookmark> findBybookmarkUrl(
		java.lang.String bookmark_url) {
		return getPersistence().findBybookmarkUrl(bookmark_url);
	}

	/**
	* Returns a range of all the company_bookmarks where bookmark_url = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link company_bookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bookmark_url the bookmark_url
	* @param start the lower bound of the range of company_bookmarks
	* @param end the upper bound of the range of company_bookmarks (not inclusive)
	* @return the range of matching company_bookmarks
	*/
	public static List<company_bookmark> findBybookmarkUrl(
		java.lang.String bookmark_url, int start, int end) {
		return getPersistence().findBybookmarkUrl(bookmark_url, start, end);
	}

	/**
	* Returns an ordered range of all the company_bookmarks where bookmark_url = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link company_bookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bookmark_url the bookmark_url
	* @param start the lower bound of the range of company_bookmarks
	* @param end the upper bound of the range of company_bookmarks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching company_bookmarks
	*/
	public static List<company_bookmark> findBybookmarkUrl(
		java.lang.String bookmark_url, int start, int end,
		OrderByComparator<company_bookmark> orderByComparator) {
		return getPersistence()
				   .findBybookmarkUrl(bookmark_url, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the company_bookmarks where bookmark_url = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link company_bookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bookmark_url the bookmark_url
	* @param start the lower bound of the range of company_bookmarks
	* @param end the upper bound of the range of company_bookmarks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching company_bookmarks
	*/
	public static List<company_bookmark> findBybookmarkUrl(
		java.lang.String bookmark_url, int start, int end,
		OrderByComparator<company_bookmark> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBybookmarkUrl(bookmark_url, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first company_bookmark in the ordered set where bookmark_url = &#63;.
	*
	* @param bookmark_url the bookmark_url
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching company_bookmark
	* @throws NoSuchcompany_bookmarkException if a matching company_bookmark could not be found
	*/
	public static company_bookmark findBybookmarkUrl_First(
		java.lang.String bookmark_url,
		OrderByComparator<company_bookmark> orderByComparator)
		throws active.portal.exception.NoSuchcompany_bookmarkException {
		return getPersistence()
				   .findBybookmarkUrl_First(bookmark_url, orderByComparator);
	}

	/**
	* Returns the first company_bookmark in the ordered set where bookmark_url = &#63;.
	*
	* @param bookmark_url the bookmark_url
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching company_bookmark, or <code>null</code> if a matching company_bookmark could not be found
	*/
	public static company_bookmark fetchBybookmarkUrl_First(
		java.lang.String bookmark_url,
		OrderByComparator<company_bookmark> orderByComparator) {
		return getPersistence()
				   .fetchBybookmarkUrl_First(bookmark_url, orderByComparator);
	}

	/**
	* Returns the last company_bookmark in the ordered set where bookmark_url = &#63;.
	*
	* @param bookmark_url the bookmark_url
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching company_bookmark
	* @throws NoSuchcompany_bookmarkException if a matching company_bookmark could not be found
	*/
	public static company_bookmark findBybookmarkUrl_Last(
		java.lang.String bookmark_url,
		OrderByComparator<company_bookmark> orderByComparator)
		throws active.portal.exception.NoSuchcompany_bookmarkException {
		return getPersistence()
				   .findBybookmarkUrl_Last(bookmark_url, orderByComparator);
	}

	/**
	* Returns the last company_bookmark in the ordered set where bookmark_url = &#63;.
	*
	* @param bookmark_url the bookmark_url
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching company_bookmark, or <code>null</code> if a matching company_bookmark could not be found
	*/
	public static company_bookmark fetchBybookmarkUrl_Last(
		java.lang.String bookmark_url,
		OrderByComparator<company_bookmark> orderByComparator) {
		return getPersistence()
				   .fetchBybookmarkUrl_Last(bookmark_url, orderByComparator);
	}

	/**
	* Returns the company_bookmarks before and after the current company_bookmark in the ordered set where bookmark_url = &#63;.
	*
	* @param bookmark_id the primary key of the current company_bookmark
	* @param bookmark_url the bookmark_url
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next company_bookmark
	* @throws NoSuchcompany_bookmarkException if a company_bookmark with the primary key could not be found
	*/
	public static company_bookmark[] findBybookmarkUrl_PrevAndNext(
		java.lang.String bookmark_id, java.lang.String bookmark_url,
		OrderByComparator<company_bookmark> orderByComparator)
		throws active.portal.exception.NoSuchcompany_bookmarkException {
		return getPersistence()
				   .findBybookmarkUrl_PrevAndNext(bookmark_id, bookmark_url,
			orderByComparator);
	}

	/**
	* Removes all the company_bookmarks where bookmark_url = &#63; from the database.
	*
	* @param bookmark_url the bookmark_url
	*/
	public static void removeBybookmarkUrl(java.lang.String bookmark_url) {
		getPersistence().removeBybookmarkUrl(bookmark_url);
	}

	/**
	* Returns the number of company_bookmarks where bookmark_url = &#63;.
	*
	* @param bookmark_url the bookmark_url
	* @return the number of matching company_bookmarks
	*/
	public static int countBybookmarkUrl(java.lang.String bookmark_url) {
		return getPersistence().countBybookmarkUrl(bookmark_url);
	}

	/**
	* Returns all the company_bookmarks where bookmark_title = &#63;.
	*
	* @param bookmark_title the bookmark_title
	* @return the matching company_bookmarks
	*/
	public static List<company_bookmark> findBybookmarTitle(
		java.lang.String bookmark_title) {
		return getPersistence().findBybookmarTitle(bookmark_title);
	}

	/**
	* Returns a range of all the company_bookmarks where bookmark_title = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link company_bookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bookmark_title the bookmark_title
	* @param start the lower bound of the range of company_bookmarks
	* @param end the upper bound of the range of company_bookmarks (not inclusive)
	* @return the range of matching company_bookmarks
	*/
	public static List<company_bookmark> findBybookmarTitle(
		java.lang.String bookmark_title, int start, int end) {
		return getPersistence().findBybookmarTitle(bookmark_title, start, end);
	}

	/**
	* Returns an ordered range of all the company_bookmarks where bookmark_title = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link company_bookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bookmark_title the bookmark_title
	* @param start the lower bound of the range of company_bookmarks
	* @param end the upper bound of the range of company_bookmarks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching company_bookmarks
	*/
	public static List<company_bookmark> findBybookmarTitle(
		java.lang.String bookmark_title, int start, int end,
		OrderByComparator<company_bookmark> orderByComparator) {
		return getPersistence()
				   .findBybookmarTitle(bookmark_title, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the company_bookmarks where bookmark_title = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link company_bookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bookmark_title the bookmark_title
	* @param start the lower bound of the range of company_bookmarks
	* @param end the upper bound of the range of company_bookmarks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching company_bookmarks
	*/
	public static List<company_bookmark> findBybookmarTitle(
		java.lang.String bookmark_title, int start, int end,
		OrderByComparator<company_bookmark> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBybookmarTitle(bookmark_title, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first company_bookmark in the ordered set where bookmark_title = &#63;.
	*
	* @param bookmark_title the bookmark_title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching company_bookmark
	* @throws NoSuchcompany_bookmarkException if a matching company_bookmark could not be found
	*/
	public static company_bookmark findBybookmarTitle_First(
		java.lang.String bookmark_title,
		OrderByComparator<company_bookmark> orderByComparator)
		throws active.portal.exception.NoSuchcompany_bookmarkException {
		return getPersistence()
				   .findBybookmarTitle_First(bookmark_title, orderByComparator);
	}

	/**
	* Returns the first company_bookmark in the ordered set where bookmark_title = &#63;.
	*
	* @param bookmark_title the bookmark_title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching company_bookmark, or <code>null</code> if a matching company_bookmark could not be found
	*/
	public static company_bookmark fetchBybookmarTitle_First(
		java.lang.String bookmark_title,
		OrderByComparator<company_bookmark> orderByComparator) {
		return getPersistence()
				   .fetchBybookmarTitle_First(bookmark_title, orderByComparator);
	}

	/**
	* Returns the last company_bookmark in the ordered set where bookmark_title = &#63;.
	*
	* @param bookmark_title the bookmark_title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching company_bookmark
	* @throws NoSuchcompany_bookmarkException if a matching company_bookmark could not be found
	*/
	public static company_bookmark findBybookmarTitle_Last(
		java.lang.String bookmark_title,
		OrderByComparator<company_bookmark> orderByComparator)
		throws active.portal.exception.NoSuchcompany_bookmarkException {
		return getPersistence()
				   .findBybookmarTitle_Last(bookmark_title, orderByComparator);
	}

	/**
	* Returns the last company_bookmark in the ordered set where bookmark_title = &#63;.
	*
	* @param bookmark_title the bookmark_title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching company_bookmark, or <code>null</code> if a matching company_bookmark could not be found
	*/
	public static company_bookmark fetchBybookmarTitle_Last(
		java.lang.String bookmark_title,
		OrderByComparator<company_bookmark> orderByComparator) {
		return getPersistence()
				   .fetchBybookmarTitle_Last(bookmark_title, orderByComparator);
	}

	/**
	* Returns the company_bookmarks before and after the current company_bookmark in the ordered set where bookmark_title = &#63;.
	*
	* @param bookmark_id the primary key of the current company_bookmark
	* @param bookmark_title the bookmark_title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next company_bookmark
	* @throws NoSuchcompany_bookmarkException if a company_bookmark with the primary key could not be found
	*/
	public static company_bookmark[] findBybookmarTitle_PrevAndNext(
		java.lang.String bookmark_id, java.lang.String bookmark_title,
		OrderByComparator<company_bookmark> orderByComparator)
		throws active.portal.exception.NoSuchcompany_bookmarkException {
		return getPersistence()
				   .findBybookmarTitle_PrevAndNext(bookmark_id, bookmark_title,
			orderByComparator);
	}

	/**
	* Removes all the company_bookmarks where bookmark_title = &#63; from the database.
	*
	* @param bookmark_title the bookmark_title
	*/
	public static void removeBybookmarTitle(java.lang.String bookmark_title) {
		getPersistence().removeBybookmarTitle(bookmark_title);
	}

	/**
	* Returns the number of company_bookmarks where bookmark_title = &#63;.
	*
	* @param bookmark_title the bookmark_title
	* @return the number of matching company_bookmarks
	*/
	public static int countBybookmarTitle(java.lang.String bookmark_title) {
		return getPersistence().countBybookmarTitle(bookmark_title);
	}

	/**
	* Returns all the company_bookmarks where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching company_bookmarks
	*/
	public static List<company_bookmark> findBybookmarUserId(
		java.lang.Long userId) {
		return getPersistence().findBybookmarUserId(userId);
	}

	/**
	* Returns a range of all the company_bookmarks where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link company_bookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of company_bookmarks
	* @param end the upper bound of the range of company_bookmarks (not inclusive)
	* @return the range of matching company_bookmarks
	*/
	public static List<company_bookmark> findBybookmarUserId(
		java.lang.Long userId, int start, int end) {
		return getPersistence().findBybookmarUserId(userId, start, end);
	}

	/**
	* Returns an ordered range of all the company_bookmarks where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link company_bookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of company_bookmarks
	* @param end the upper bound of the range of company_bookmarks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching company_bookmarks
	*/
	public static List<company_bookmark> findBybookmarUserId(
		java.lang.Long userId, int start, int end,
		OrderByComparator<company_bookmark> orderByComparator) {
		return getPersistence()
				   .findBybookmarUserId(userId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the company_bookmarks where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link company_bookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of company_bookmarks
	* @param end the upper bound of the range of company_bookmarks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching company_bookmarks
	*/
	public static List<company_bookmark> findBybookmarUserId(
		java.lang.Long userId, int start, int end,
		OrderByComparator<company_bookmark> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBybookmarUserId(userId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first company_bookmark in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching company_bookmark
	* @throws NoSuchcompany_bookmarkException if a matching company_bookmark could not be found
	*/
	public static company_bookmark findBybookmarUserId_First(
		java.lang.Long userId,
		OrderByComparator<company_bookmark> orderByComparator)
		throws active.portal.exception.NoSuchcompany_bookmarkException {
		return getPersistence()
				   .findBybookmarUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first company_bookmark in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching company_bookmark, or <code>null</code> if a matching company_bookmark could not be found
	*/
	public static company_bookmark fetchBybookmarUserId_First(
		java.lang.Long userId,
		OrderByComparator<company_bookmark> orderByComparator) {
		return getPersistence()
				   .fetchBybookmarUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last company_bookmark in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching company_bookmark
	* @throws NoSuchcompany_bookmarkException if a matching company_bookmark could not be found
	*/
	public static company_bookmark findBybookmarUserId_Last(
		java.lang.Long userId,
		OrderByComparator<company_bookmark> orderByComparator)
		throws active.portal.exception.NoSuchcompany_bookmarkException {
		return getPersistence()
				   .findBybookmarUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last company_bookmark in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching company_bookmark, or <code>null</code> if a matching company_bookmark could not be found
	*/
	public static company_bookmark fetchBybookmarUserId_Last(
		java.lang.Long userId,
		OrderByComparator<company_bookmark> orderByComparator) {
		return getPersistence()
				   .fetchBybookmarUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the company_bookmarks before and after the current company_bookmark in the ordered set where userId = &#63;.
	*
	* @param bookmark_id the primary key of the current company_bookmark
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next company_bookmark
	* @throws NoSuchcompany_bookmarkException if a company_bookmark with the primary key could not be found
	*/
	public static company_bookmark[] findBybookmarUserId_PrevAndNext(
		java.lang.String bookmark_id, java.lang.Long userId,
		OrderByComparator<company_bookmark> orderByComparator)
		throws active.portal.exception.NoSuchcompany_bookmarkException {
		return getPersistence()
				   .findBybookmarUserId_PrevAndNext(bookmark_id, userId,
			orderByComparator);
	}

	/**
	* Removes all the company_bookmarks where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public static void removeBybookmarUserId(java.lang.Long userId) {
		getPersistence().removeBybookmarUserId(userId);
	}

	/**
	* Returns the number of company_bookmarks where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching company_bookmarks
	*/
	public static int countBybookmarUserId(java.lang.Long userId) {
		return getPersistence().countBybookmarUserId(userId);
	}

	/**
	* Caches the company_bookmark in the entity cache if it is enabled.
	*
	* @param company_bookmark the company_bookmark
	*/
	public static void cacheResult(company_bookmark company_bookmark) {
		getPersistence().cacheResult(company_bookmark);
	}

	/**
	* Caches the company_bookmarks in the entity cache if it is enabled.
	*
	* @param company_bookmarks the company_bookmarks
	*/
	public static void cacheResult(List<company_bookmark> company_bookmarks) {
		getPersistence().cacheResult(company_bookmarks);
	}

	/**
	* Creates a new company_bookmark with the primary key. Does not add the company_bookmark to the database.
	*
	* @param bookmark_id the primary key for the new company_bookmark
	* @return the new company_bookmark
	*/
	public static company_bookmark create(java.lang.String bookmark_id) {
		return getPersistence().create(bookmark_id);
	}

	/**
	* Removes the company_bookmark with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookmark_id the primary key of the company_bookmark
	* @return the company_bookmark that was removed
	* @throws NoSuchcompany_bookmarkException if a company_bookmark with the primary key could not be found
	*/
	public static company_bookmark remove(java.lang.String bookmark_id)
		throws active.portal.exception.NoSuchcompany_bookmarkException {
		return getPersistence().remove(bookmark_id);
	}

	public static company_bookmark updateImpl(company_bookmark company_bookmark) {
		return getPersistence().updateImpl(company_bookmark);
	}

	/**
	* Returns the company_bookmark with the primary key or throws a {@link NoSuchcompany_bookmarkException} if it could not be found.
	*
	* @param bookmark_id the primary key of the company_bookmark
	* @return the company_bookmark
	* @throws NoSuchcompany_bookmarkException if a company_bookmark with the primary key could not be found
	*/
	public static company_bookmark findByPrimaryKey(
		java.lang.String bookmark_id)
		throws active.portal.exception.NoSuchcompany_bookmarkException {
		return getPersistence().findByPrimaryKey(bookmark_id);
	}

	/**
	* Returns the company_bookmark with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param bookmark_id the primary key of the company_bookmark
	* @return the company_bookmark, or <code>null</code> if a company_bookmark with the primary key could not be found
	*/
	public static company_bookmark fetchByPrimaryKey(
		java.lang.String bookmark_id) {
		return getPersistence().fetchByPrimaryKey(bookmark_id);
	}

	public static java.util.Map<java.io.Serializable, company_bookmark> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the company_bookmarks.
	*
	* @return the company_bookmarks
	*/
	public static List<company_bookmark> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the company_bookmarks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link company_bookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of company_bookmarks
	* @param end the upper bound of the range of company_bookmarks (not inclusive)
	* @return the range of company_bookmarks
	*/
	public static List<company_bookmark> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the company_bookmarks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link company_bookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of company_bookmarks
	* @param end the upper bound of the range of company_bookmarks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of company_bookmarks
	*/
	public static List<company_bookmark> findAll(int start, int end,
		OrderByComparator<company_bookmark> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the company_bookmarks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link company_bookmarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of company_bookmarks
	* @param end the upper bound of the range of company_bookmarks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of company_bookmarks
	*/
	public static List<company_bookmark> findAll(int start, int end,
		OrderByComparator<company_bookmark> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the company_bookmarks from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of company_bookmarks.
	*
	* @return the number of company_bookmarks
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static company_bookmarkPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<company_bookmarkPersistence, company_bookmarkPersistence> _serviceTracker =
		ServiceTrackerFactory.open(company_bookmarkPersistence.class);
}