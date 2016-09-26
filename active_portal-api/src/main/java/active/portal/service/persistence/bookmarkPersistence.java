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

import active.portal.exception.NoSuchbookmarkException;

import active.portal.model.bookmark;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the bookmark service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see active.portal.service.persistence.impl.bookmarkPersistenceImpl
 * @see bookmarkUtil
 * @generated
 */
@ProviderType
public interface bookmarkPersistence extends BasePersistence<bookmark> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link bookmarkUtil} to access the bookmark persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the bookmarks where bookmark_id = &#63;.
	*
	* @param bookmark_id the bookmark_id
	* @return the matching bookmarks
	*/
	public java.util.List<bookmark> findBybookmarkId(java.lang.Long bookmark_id);

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
	public java.util.List<bookmark> findBybookmarkId(
		java.lang.Long bookmark_id, int start, int end);

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
	public java.util.List<bookmark> findBybookmarkId(
		java.lang.Long bookmark_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<bookmark> orderByComparator);

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
	public java.util.List<bookmark> findBybookmarkId(
		java.lang.Long bookmark_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<bookmark> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first bookmark in the ordered set where bookmark_id = &#63;.
	*
	* @param bookmark_id the bookmark_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookmark
	* @throws NoSuchbookmarkException if a matching bookmark could not be found
	*/
	public bookmark findBybookmarkId_First(java.lang.Long bookmark_id,
		com.liferay.portal.kernel.util.OrderByComparator<bookmark> orderByComparator)
		throws NoSuchbookmarkException;

	/**
	* Returns the first bookmark in the ordered set where bookmark_id = &#63;.
	*
	* @param bookmark_id the bookmark_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookmark, or <code>null</code> if a matching bookmark could not be found
	*/
	public bookmark fetchBybookmarkId_First(java.lang.Long bookmark_id,
		com.liferay.portal.kernel.util.OrderByComparator<bookmark> orderByComparator);

	/**
	* Returns the last bookmark in the ordered set where bookmark_id = &#63;.
	*
	* @param bookmark_id the bookmark_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookmark
	* @throws NoSuchbookmarkException if a matching bookmark could not be found
	*/
	public bookmark findBybookmarkId_Last(java.lang.Long bookmark_id,
		com.liferay.portal.kernel.util.OrderByComparator<bookmark> orderByComparator)
		throws NoSuchbookmarkException;

	/**
	* Returns the last bookmark in the ordered set where bookmark_id = &#63;.
	*
	* @param bookmark_id the bookmark_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookmark, or <code>null</code> if a matching bookmark could not be found
	*/
	public bookmark fetchBybookmarkId_Last(java.lang.Long bookmark_id,
		com.liferay.portal.kernel.util.OrderByComparator<bookmark> orderByComparator);

	/**
	* Removes all the bookmarks where bookmark_id = &#63; from the database.
	*
	* @param bookmark_id the bookmark_id
	*/
	public void removeBybookmarkId(java.lang.Long bookmark_id);

	/**
	* Returns the number of bookmarks where bookmark_id = &#63;.
	*
	* @param bookmark_id the bookmark_id
	* @return the number of matching bookmarks
	*/
	public int countBybookmarkId(java.lang.Long bookmark_id);

	/**
	* Returns all the bookmarks where bookmark_url = &#63;.
	*
	* @param bookmark_url the bookmark_url
	* @return the matching bookmarks
	*/
	public java.util.List<bookmark> findBybookmarkUrl(
		java.lang.String bookmark_url);

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
	public java.util.List<bookmark> findBybookmarkUrl(
		java.lang.String bookmark_url, int start, int end);

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
	public java.util.List<bookmark> findBybookmarkUrl(
		java.lang.String bookmark_url, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<bookmark> orderByComparator);

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
	public java.util.List<bookmark> findBybookmarkUrl(
		java.lang.String bookmark_url, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<bookmark> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first bookmark in the ordered set where bookmark_url = &#63;.
	*
	* @param bookmark_url the bookmark_url
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookmark
	* @throws NoSuchbookmarkException if a matching bookmark could not be found
	*/
	public bookmark findBybookmarkUrl_First(java.lang.String bookmark_url,
		com.liferay.portal.kernel.util.OrderByComparator<bookmark> orderByComparator)
		throws NoSuchbookmarkException;

	/**
	* Returns the first bookmark in the ordered set where bookmark_url = &#63;.
	*
	* @param bookmark_url the bookmark_url
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookmark, or <code>null</code> if a matching bookmark could not be found
	*/
	public bookmark fetchBybookmarkUrl_First(java.lang.String bookmark_url,
		com.liferay.portal.kernel.util.OrderByComparator<bookmark> orderByComparator);

	/**
	* Returns the last bookmark in the ordered set where bookmark_url = &#63;.
	*
	* @param bookmark_url the bookmark_url
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookmark
	* @throws NoSuchbookmarkException if a matching bookmark could not be found
	*/
	public bookmark findBybookmarkUrl_Last(java.lang.String bookmark_url,
		com.liferay.portal.kernel.util.OrderByComparator<bookmark> orderByComparator)
		throws NoSuchbookmarkException;

	/**
	* Returns the last bookmark in the ordered set where bookmark_url = &#63;.
	*
	* @param bookmark_url the bookmark_url
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookmark, or <code>null</code> if a matching bookmark could not be found
	*/
	public bookmark fetchBybookmarkUrl_Last(java.lang.String bookmark_url,
		com.liferay.portal.kernel.util.OrderByComparator<bookmark> orderByComparator);

	/**
	* Returns the bookmarks before and after the current bookmark in the ordered set where bookmark_url = &#63;.
	*
	* @param bookmark_id the primary key of the current bookmark
	* @param bookmark_url the bookmark_url
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bookmark
	* @throws NoSuchbookmarkException if a bookmark with the primary key could not be found
	*/
	public bookmark[] findBybookmarkUrl_PrevAndNext(
		java.lang.Long bookmark_id, java.lang.String bookmark_url,
		com.liferay.portal.kernel.util.OrderByComparator<bookmark> orderByComparator)
		throws NoSuchbookmarkException;

	/**
	* Removes all the bookmarks where bookmark_url = &#63; from the database.
	*
	* @param bookmark_url the bookmark_url
	*/
	public void removeBybookmarkUrl(java.lang.String bookmark_url);

	/**
	* Returns the number of bookmarks where bookmark_url = &#63;.
	*
	* @param bookmark_url the bookmark_url
	* @return the number of matching bookmarks
	*/
	public int countBybookmarkUrl(java.lang.String bookmark_url);

	/**
	* Returns all the bookmarks where bookmark_title = &#63;.
	*
	* @param bookmark_title the bookmark_title
	* @return the matching bookmarks
	*/
	public java.util.List<bookmark> findBybookmarTitle(
		java.lang.String bookmark_title);

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
	public java.util.List<bookmark> findBybookmarTitle(
		java.lang.String bookmark_title, int start, int end);

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
	public java.util.List<bookmark> findBybookmarTitle(
		java.lang.String bookmark_title, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<bookmark> orderByComparator);

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
	public java.util.List<bookmark> findBybookmarTitle(
		java.lang.String bookmark_title, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<bookmark> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first bookmark in the ordered set where bookmark_title = &#63;.
	*
	* @param bookmark_title the bookmark_title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookmark
	* @throws NoSuchbookmarkException if a matching bookmark could not be found
	*/
	public bookmark findBybookmarTitle_First(java.lang.String bookmark_title,
		com.liferay.portal.kernel.util.OrderByComparator<bookmark> orderByComparator)
		throws NoSuchbookmarkException;

	/**
	* Returns the first bookmark in the ordered set where bookmark_title = &#63;.
	*
	* @param bookmark_title the bookmark_title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookmark, or <code>null</code> if a matching bookmark could not be found
	*/
	public bookmark fetchBybookmarTitle_First(java.lang.String bookmark_title,
		com.liferay.portal.kernel.util.OrderByComparator<bookmark> orderByComparator);

	/**
	* Returns the last bookmark in the ordered set where bookmark_title = &#63;.
	*
	* @param bookmark_title the bookmark_title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookmark
	* @throws NoSuchbookmarkException if a matching bookmark could not be found
	*/
	public bookmark findBybookmarTitle_Last(java.lang.String bookmark_title,
		com.liferay.portal.kernel.util.OrderByComparator<bookmark> orderByComparator)
		throws NoSuchbookmarkException;

	/**
	* Returns the last bookmark in the ordered set where bookmark_title = &#63;.
	*
	* @param bookmark_title the bookmark_title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookmark, or <code>null</code> if a matching bookmark could not be found
	*/
	public bookmark fetchBybookmarTitle_Last(java.lang.String bookmark_title,
		com.liferay.portal.kernel.util.OrderByComparator<bookmark> orderByComparator);

	/**
	* Returns the bookmarks before and after the current bookmark in the ordered set where bookmark_title = &#63;.
	*
	* @param bookmark_id the primary key of the current bookmark
	* @param bookmark_title the bookmark_title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bookmark
	* @throws NoSuchbookmarkException if a bookmark with the primary key could not be found
	*/
	public bookmark[] findBybookmarTitle_PrevAndNext(
		java.lang.Long bookmark_id, java.lang.String bookmark_title,
		com.liferay.portal.kernel.util.OrderByComparator<bookmark> orderByComparator)
		throws NoSuchbookmarkException;

	/**
	* Removes all the bookmarks where bookmark_title = &#63; from the database.
	*
	* @param bookmark_title the bookmark_title
	*/
	public void removeBybookmarTitle(java.lang.String bookmark_title);

	/**
	* Returns the number of bookmarks where bookmark_title = &#63;.
	*
	* @param bookmark_title the bookmark_title
	* @return the number of matching bookmarks
	*/
	public int countBybookmarTitle(java.lang.String bookmark_title);

	/**
	* Returns all the bookmarks where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching bookmarks
	*/
	public java.util.List<bookmark> findBybookmarUserId(java.lang.Long userId);

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
	public java.util.List<bookmark> findBybookmarUserId(java.lang.Long userId,
		int start, int end);

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
	public java.util.List<bookmark> findBybookmarUserId(java.lang.Long userId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<bookmark> orderByComparator);

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
	public java.util.List<bookmark> findBybookmarUserId(java.lang.Long userId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<bookmark> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first bookmark in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookmark
	* @throws NoSuchbookmarkException if a matching bookmark could not be found
	*/
	public bookmark findBybookmarUserId_First(java.lang.Long userId,
		com.liferay.portal.kernel.util.OrderByComparator<bookmark> orderByComparator)
		throws NoSuchbookmarkException;

	/**
	* Returns the first bookmark in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookmark, or <code>null</code> if a matching bookmark could not be found
	*/
	public bookmark fetchBybookmarUserId_First(java.lang.Long userId,
		com.liferay.portal.kernel.util.OrderByComparator<bookmark> orderByComparator);

	/**
	* Returns the last bookmark in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookmark
	* @throws NoSuchbookmarkException if a matching bookmark could not be found
	*/
	public bookmark findBybookmarUserId_Last(java.lang.Long userId,
		com.liferay.portal.kernel.util.OrderByComparator<bookmark> orderByComparator)
		throws NoSuchbookmarkException;

	/**
	* Returns the last bookmark in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookmark, or <code>null</code> if a matching bookmark could not be found
	*/
	public bookmark fetchBybookmarUserId_Last(java.lang.Long userId,
		com.liferay.portal.kernel.util.OrderByComparator<bookmark> orderByComparator);

	/**
	* Returns the bookmarks before and after the current bookmark in the ordered set where userId = &#63;.
	*
	* @param bookmark_id the primary key of the current bookmark
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bookmark
	* @throws NoSuchbookmarkException if a bookmark with the primary key could not be found
	*/
	public bookmark[] findBybookmarUserId_PrevAndNext(
		java.lang.Long bookmark_id, java.lang.Long userId,
		com.liferay.portal.kernel.util.OrderByComparator<bookmark> orderByComparator)
		throws NoSuchbookmarkException;

	/**
	* Removes all the bookmarks where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeBybookmarUserId(java.lang.Long userId);

	/**
	* Returns the number of bookmarks where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching bookmarks
	*/
	public int countBybookmarUserId(java.lang.Long userId);

	/**
	* Caches the bookmark in the entity cache if it is enabled.
	*
	* @param bookmark the bookmark
	*/
	public void cacheResult(bookmark bookmark);

	/**
	* Caches the bookmarks in the entity cache if it is enabled.
	*
	* @param bookmarks the bookmarks
	*/
	public void cacheResult(java.util.List<bookmark> bookmarks);

	/**
	* Creates a new bookmark with the primary key. Does not add the bookmark to the database.
	*
	* @param bookmark_id the primary key for the new bookmark
	* @return the new bookmark
	*/
	public bookmark create(java.lang.Long bookmark_id);

	/**
	* Removes the bookmark with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookmark_id the primary key of the bookmark
	* @return the bookmark that was removed
	* @throws NoSuchbookmarkException if a bookmark with the primary key could not be found
	*/
	public bookmark remove(java.lang.Long bookmark_id)
		throws NoSuchbookmarkException;

	public bookmark updateImpl(bookmark bookmark);

	/**
	* Returns the bookmark with the primary key or throws a {@link NoSuchbookmarkException} if it could not be found.
	*
	* @param bookmark_id the primary key of the bookmark
	* @return the bookmark
	* @throws NoSuchbookmarkException if a bookmark with the primary key could not be found
	*/
	public bookmark findByPrimaryKey(java.lang.Long bookmark_id)
		throws NoSuchbookmarkException;

	/**
	* Returns the bookmark with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param bookmark_id the primary key of the bookmark
	* @return the bookmark, or <code>null</code> if a bookmark with the primary key could not be found
	*/
	public bookmark fetchByPrimaryKey(java.lang.Long bookmark_id);

	@Override
	public java.util.Map<java.io.Serializable, bookmark> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the bookmarks.
	*
	* @return the bookmarks
	*/
	public java.util.List<bookmark> findAll();

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
	public java.util.List<bookmark> findAll(int start, int end);

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
	public java.util.List<bookmark> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<bookmark> orderByComparator);

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
	public java.util.List<bookmark> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<bookmark> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the bookmarks from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of bookmarks.
	*
	* @return the number of bookmarks
	*/
	public int countAll();
}