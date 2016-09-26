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

import active.portal.exception.NoSuchcompany_bookmarkException;

import active.portal.model.company_bookmark;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the company_bookmark service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see active.portal.service.persistence.impl.company_bookmarkPersistenceImpl
 * @see company_bookmarkUtil
 * @generated
 */
@ProviderType
public interface company_bookmarkPersistence extends BasePersistence<company_bookmark> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link company_bookmarkUtil} to access the company_bookmark persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the company_bookmarks where bookmark_id = &#63;.
	*
	* @param bookmark_id the bookmark_id
	* @return the matching company_bookmarks
	*/
	public java.util.List<company_bookmark> findBybookmarkId(
		java.lang.String bookmark_id);

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
	public java.util.List<company_bookmark> findBybookmarkId(
		java.lang.String bookmark_id, int start, int end);

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
	public java.util.List<company_bookmark> findBybookmarkId(
		java.lang.String bookmark_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<company_bookmark> orderByComparator);

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
	public java.util.List<company_bookmark> findBybookmarkId(
		java.lang.String bookmark_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<company_bookmark> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first company_bookmark in the ordered set where bookmark_id = &#63;.
	*
	* @param bookmark_id the bookmark_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching company_bookmark
	* @throws NoSuchcompany_bookmarkException if a matching company_bookmark could not be found
	*/
	public company_bookmark findBybookmarkId_First(
		java.lang.String bookmark_id,
		com.liferay.portal.kernel.util.OrderByComparator<company_bookmark> orderByComparator)
		throws NoSuchcompany_bookmarkException;

	/**
	* Returns the first company_bookmark in the ordered set where bookmark_id = &#63;.
	*
	* @param bookmark_id the bookmark_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching company_bookmark, or <code>null</code> if a matching company_bookmark could not be found
	*/
	public company_bookmark fetchBybookmarkId_First(
		java.lang.String bookmark_id,
		com.liferay.portal.kernel.util.OrderByComparator<company_bookmark> orderByComparator);

	/**
	* Returns the last company_bookmark in the ordered set where bookmark_id = &#63;.
	*
	* @param bookmark_id the bookmark_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching company_bookmark
	* @throws NoSuchcompany_bookmarkException if a matching company_bookmark could not be found
	*/
	public company_bookmark findBybookmarkId_Last(
		java.lang.String bookmark_id,
		com.liferay.portal.kernel.util.OrderByComparator<company_bookmark> orderByComparator)
		throws NoSuchcompany_bookmarkException;

	/**
	* Returns the last company_bookmark in the ordered set where bookmark_id = &#63;.
	*
	* @param bookmark_id the bookmark_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching company_bookmark, or <code>null</code> if a matching company_bookmark could not be found
	*/
	public company_bookmark fetchBybookmarkId_Last(
		java.lang.String bookmark_id,
		com.liferay.portal.kernel.util.OrderByComparator<company_bookmark> orderByComparator);

	/**
	* Removes all the company_bookmarks where bookmark_id = &#63; from the database.
	*
	* @param bookmark_id the bookmark_id
	*/
	public void removeBybookmarkId(java.lang.String bookmark_id);

	/**
	* Returns the number of company_bookmarks where bookmark_id = &#63;.
	*
	* @param bookmark_id the bookmark_id
	* @return the number of matching company_bookmarks
	*/
	public int countBybookmarkId(java.lang.String bookmark_id);

	/**
	* Returns all the company_bookmarks where bookmark_url = &#63;.
	*
	* @param bookmark_url the bookmark_url
	* @return the matching company_bookmarks
	*/
	public java.util.List<company_bookmark> findBybookmarkUrl(
		java.lang.String bookmark_url);

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
	public java.util.List<company_bookmark> findBybookmarkUrl(
		java.lang.String bookmark_url, int start, int end);

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
	public java.util.List<company_bookmark> findBybookmarkUrl(
		java.lang.String bookmark_url, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<company_bookmark> orderByComparator);

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
	public java.util.List<company_bookmark> findBybookmarkUrl(
		java.lang.String bookmark_url, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<company_bookmark> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first company_bookmark in the ordered set where bookmark_url = &#63;.
	*
	* @param bookmark_url the bookmark_url
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching company_bookmark
	* @throws NoSuchcompany_bookmarkException if a matching company_bookmark could not be found
	*/
	public company_bookmark findBybookmarkUrl_First(
		java.lang.String bookmark_url,
		com.liferay.portal.kernel.util.OrderByComparator<company_bookmark> orderByComparator)
		throws NoSuchcompany_bookmarkException;

	/**
	* Returns the first company_bookmark in the ordered set where bookmark_url = &#63;.
	*
	* @param bookmark_url the bookmark_url
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching company_bookmark, or <code>null</code> if a matching company_bookmark could not be found
	*/
	public company_bookmark fetchBybookmarkUrl_First(
		java.lang.String bookmark_url,
		com.liferay.portal.kernel.util.OrderByComparator<company_bookmark> orderByComparator);

	/**
	* Returns the last company_bookmark in the ordered set where bookmark_url = &#63;.
	*
	* @param bookmark_url the bookmark_url
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching company_bookmark
	* @throws NoSuchcompany_bookmarkException if a matching company_bookmark could not be found
	*/
	public company_bookmark findBybookmarkUrl_Last(
		java.lang.String bookmark_url,
		com.liferay.portal.kernel.util.OrderByComparator<company_bookmark> orderByComparator)
		throws NoSuchcompany_bookmarkException;

	/**
	* Returns the last company_bookmark in the ordered set where bookmark_url = &#63;.
	*
	* @param bookmark_url the bookmark_url
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching company_bookmark, or <code>null</code> if a matching company_bookmark could not be found
	*/
	public company_bookmark fetchBybookmarkUrl_Last(
		java.lang.String bookmark_url,
		com.liferay.portal.kernel.util.OrderByComparator<company_bookmark> orderByComparator);

	/**
	* Returns the company_bookmarks before and after the current company_bookmark in the ordered set where bookmark_url = &#63;.
	*
	* @param bookmark_id the primary key of the current company_bookmark
	* @param bookmark_url the bookmark_url
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next company_bookmark
	* @throws NoSuchcompany_bookmarkException if a company_bookmark with the primary key could not be found
	*/
	public company_bookmark[] findBybookmarkUrl_PrevAndNext(
		java.lang.String bookmark_id, java.lang.String bookmark_url,
		com.liferay.portal.kernel.util.OrderByComparator<company_bookmark> orderByComparator)
		throws NoSuchcompany_bookmarkException;

	/**
	* Removes all the company_bookmarks where bookmark_url = &#63; from the database.
	*
	* @param bookmark_url the bookmark_url
	*/
	public void removeBybookmarkUrl(java.lang.String bookmark_url);

	/**
	* Returns the number of company_bookmarks where bookmark_url = &#63;.
	*
	* @param bookmark_url the bookmark_url
	* @return the number of matching company_bookmarks
	*/
	public int countBybookmarkUrl(java.lang.String bookmark_url);

	/**
	* Returns all the company_bookmarks where bookmark_title = &#63;.
	*
	* @param bookmark_title the bookmark_title
	* @return the matching company_bookmarks
	*/
	public java.util.List<company_bookmark> findBybookmarTitle(
		java.lang.String bookmark_title);

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
	public java.util.List<company_bookmark> findBybookmarTitle(
		java.lang.String bookmark_title, int start, int end);

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
	public java.util.List<company_bookmark> findBybookmarTitle(
		java.lang.String bookmark_title, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<company_bookmark> orderByComparator);

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
	public java.util.List<company_bookmark> findBybookmarTitle(
		java.lang.String bookmark_title, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<company_bookmark> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first company_bookmark in the ordered set where bookmark_title = &#63;.
	*
	* @param bookmark_title the bookmark_title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching company_bookmark
	* @throws NoSuchcompany_bookmarkException if a matching company_bookmark could not be found
	*/
	public company_bookmark findBybookmarTitle_First(
		java.lang.String bookmark_title,
		com.liferay.portal.kernel.util.OrderByComparator<company_bookmark> orderByComparator)
		throws NoSuchcompany_bookmarkException;

	/**
	* Returns the first company_bookmark in the ordered set where bookmark_title = &#63;.
	*
	* @param bookmark_title the bookmark_title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching company_bookmark, or <code>null</code> if a matching company_bookmark could not be found
	*/
	public company_bookmark fetchBybookmarTitle_First(
		java.lang.String bookmark_title,
		com.liferay.portal.kernel.util.OrderByComparator<company_bookmark> orderByComparator);

	/**
	* Returns the last company_bookmark in the ordered set where bookmark_title = &#63;.
	*
	* @param bookmark_title the bookmark_title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching company_bookmark
	* @throws NoSuchcompany_bookmarkException if a matching company_bookmark could not be found
	*/
	public company_bookmark findBybookmarTitle_Last(
		java.lang.String bookmark_title,
		com.liferay.portal.kernel.util.OrderByComparator<company_bookmark> orderByComparator)
		throws NoSuchcompany_bookmarkException;

	/**
	* Returns the last company_bookmark in the ordered set where bookmark_title = &#63;.
	*
	* @param bookmark_title the bookmark_title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching company_bookmark, or <code>null</code> if a matching company_bookmark could not be found
	*/
	public company_bookmark fetchBybookmarTitle_Last(
		java.lang.String bookmark_title,
		com.liferay.portal.kernel.util.OrderByComparator<company_bookmark> orderByComparator);

	/**
	* Returns the company_bookmarks before and after the current company_bookmark in the ordered set where bookmark_title = &#63;.
	*
	* @param bookmark_id the primary key of the current company_bookmark
	* @param bookmark_title the bookmark_title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next company_bookmark
	* @throws NoSuchcompany_bookmarkException if a company_bookmark with the primary key could not be found
	*/
	public company_bookmark[] findBybookmarTitle_PrevAndNext(
		java.lang.String bookmark_id, java.lang.String bookmark_title,
		com.liferay.portal.kernel.util.OrderByComparator<company_bookmark> orderByComparator)
		throws NoSuchcompany_bookmarkException;

	/**
	* Removes all the company_bookmarks where bookmark_title = &#63; from the database.
	*
	* @param bookmark_title the bookmark_title
	*/
	public void removeBybookmarTitle(java.lang.String bookmark_title);

	/**
	* Returns the number of company_bookmarks where bookmark_title = &#63;.
	*
	* @param bookmark_title the bookmark_title
	* @return the number of matching company_bookmarks
	*/
	public int countBybookmarTitle(java.lang.String bookmark_title);

	/**
	* Returns all the company_bookmarks where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching company_bookmarks
	*/
	public java.util.List<company_bookmark> findBybookmarUserId(
		java.lang.Long userId);

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
	public java.util.List<company_bookmark> findBybookmarUserId(
		java.lang.Long userId, int start, int end);

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
	public java.util.List<company_bookmark> findBybookmarUserId(
		java.lang.Long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<company_bookmark> orderByComparator);

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
	public java.util.List<company_bookmark> findBybookmarUserId(
		java.lang.Long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<company_bookmark> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first company_bookmark in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching company_bookmark
	* @throws NoSuchcompany_bookmarkException if a matching company_bookmark could not be found
	*/
	public company_bookmark findBybookmarUserId_First(java.lang.Long userId,
		com.liferay.portal.kernel.util.OrderByComparator<company_bookmark> orderByComparator)
		throws NoSuchcompany_bookmarkException;

	/**
	* Returns the first company_bookmark in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching company_bookmark, or <code>null</code> if a matching company_bookmark could not be found
	*/
	public company_bookmark fetchBybookmarUserId_First(java.lang.Long userId,
		com.liferay.portal.kernel.util.OrderByComparator<company_bookmark> orderByComparator);

	/**
	* Returns the last company_bookmark in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching company_bookmark
	* @throws NoSuchcompany_bookmarkException if a matching company_bookmark could not be found
	*/
	public company_bookmark findBybookmarUserId_Last(java.lang.Long userId,
		com.liferay.portal.kernel.util.OrderByComparator<company_bookmark> orderByComparator)
		throws NoSuchcompany_bookmarkException;

	/**
	* Returns the last company_bookmark in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching company_bookmark, or <code>null</code> if a matching company_bookmark could not be found
	*/
	public company_bookmark fetchBybookmarUserId_Last(java.lang.Long userId,
		com.liferay.portal.kernel.util.OrderByComparator<company_bookmark> orderByComparator);

	/**
	* Returns the company_bookmarks before and after the current company_bookmark in the ordered set where userId = &#63;.
	*
	* @param bookmark_id the primary key of the current company_bookmark
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next company_bookmark
	* @throws NoSuchcompany_bookmarkException if a company_bookmark with the primary key could not be found
	*/
	public company_bookmark[] findBybookmarUserId_PrevAndNext(
		java.lang.String bookmark_id, java.lang.Long userId,
		com.liferay.portal.kernel.util.OrderByComparator<company_bookmark> orderByComparator)
		throws NoSuchcompany_bookmarkException;

	/**
	* Removes all the company_bookmarks where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeBybookmarUserId(java.lang.Long userId);

	/**
	* Returns the number of company_bookmarks where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching company_bookmarks
	*/
	public int countBybookmarUserId(java.lang.Long userId);

	/**
	* Caches the company_bookmark in the entity cache if it is enabled.
	*
	* @param company_bookmark the company_bookmark
	*/
	public void cacheResult(company_bookmark company_bookmark);

	/**
	* Caches the company_bookmarks in the entity cache if it is enabled.
	*
	* @param company_bookmarks the company_bookmarks
	*/
	public void cacheResult(java.util.List<company_bookmark> company_bookmarks);

	/**
	* Creates a new company_bookmark with the primary key. Does not add the company_bookmark to the database.
	*
	* @param bookmark_id the primary key for the new company_bookmark
	* @return the new company_bookmark
	*/
	public company_bookmark create(java.lang.String bookmark_id);

	/**
	* Removes the company_bookmark with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookmark_id the primary key of the company_bookmark
	* @return the company_bookmark that was removed
	* @throws NoSuchcompany_bookmarkException if a company_bookmark with the primary key could not be found
	*/
	public company_bookmark remove(java.lang.String bookmark_id)
		throws NoSuchcompany_bookmarkException;

	public company_bookmark updateImpl(company_bookmark company_bookmark);

	/**
	* Returns the company_bookmark with the primary key or throws a {@link NoSuchcompany_bookmarkException} if it could not be found.
	*
	* @param bookmark_id the primary key of the company_bookmark
	* @return the company_bookmark
	* @throws NoSuchcompany_bookmarkException if a company_bookmark with the primary key could not be found
	*/
	public company_bookmark findByPrimaryKey(java.lang.String bookmark_id)
		throws NoSuchcompany_bookmarkException;

	/**
	* Returns the company_bookmark with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param bookmark_id the primary key of the company_bookmark
	* @return the company_bookmark, or <code>null</code> if a company_bookmark with the primary key could not be found
	*/
	public company_bookmark fetchByPrimaryKey(java.lang.String bookmark_id);

	@Override
	public java.util.Map<java.io.Serializable, company_bookmark> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the company_bookmarks.
	*
	* @return the company_bookmarks
	*/
	public java.util.List<company_bookmark> findAll();

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
	public java.util.List<company_bookmark> findAll(int start, int end);

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
	public java.util.List<company_bookmark> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<company_bookmark> orderByComparator);

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
	public java.util.List<company_bookmark> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<company_bookmark> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the company_bookmarks from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of company_bookmarks.
	*
	* @return the number of company_bookmarks
	*/
	public int countAll();
}