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

package active.portal.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import active.portal.exception.NoSuchbookmarkException;

import active.portal.model.bookmark;
import active.portal.model.impl.bookmarkImpl;
import active.portal.model.impl.bookmarkModelImpl;

import active.portal.service.persistence.bookmarkPersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the bookmark service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see bookmarkPersistence
 * @see active.portal.service.persistence.bookmarkUtil
 * @generated
 */
@ProviderType
public class bookmarkPersistenceImpl extends BasePersistenceImpl<bookmark>
	implements bookmarkPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link bookmarkUtil} to access the bookmark persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = bookmarkImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(bookmarkModelImpl.ENTITY_CACHE_ENABLED,
			bookmarkModelImpl.FINDER_CACHE_ENABLED, bookmarkImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(bookmarkModelImpl.ENTITY_CACHE_ENABLED,
			bookmarkModelImpl.FINDER_CACHE_ENABLED, bookmarkImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(bookmarkModelImpl.ENTITY_CACHE_ENABLED,
			bookmarkModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BOOKMARKID =
		new FinderPath(bookmarkModelImpl.ENTITY_CACHE_ENABLED,
			bookmarkModelImpl.FINDER_CACHE_ENABLED, bookmarkImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBybookmarkId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKMARKID =
		new FinderPath(bookmarkModelImpl.ENTITY_CACHE_ENABLED,
			bookmarkModelImpl.FINDER_CACHE_ENABLED, bookmarkImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBybookmarkId",
			new String[] { Long.class.getName() },
			bookmarkModelImpl.BOOKMARK_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_BOOKMARKID = new FinderPath(bookmarkModelImpl.ENTITY_CACHE_ENABLED,
			bookmarkModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBybookmarkId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the bookmarks where bookmark_id = &#63;.
	 *
	 * @param bookmark_id the bookmark_id
	 * @return the matching bookmarks
	 */
	@Override
	public List<bookmark> findBybookmarkId(Long bookmark_id) {
		return findBybookmarkId(bookmark_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<bookmark> findBybookmarkId(Long bookmark_id, int start, int end) {
		return findBybookmarkId(bookmark_id, start, end, null);
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
	@Override
	public List<bookmark> findBybookmarkId(Long bookmark_id, int start,
		int end, OrderByComparator<bookmark> orderByComparator) {
		return findBybookmarkId(bookmark_id, start, end, orderByComparator, true);
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
	@Override
	public List<bookmark> findBybookmarkId(Long bookmark_id, int start,
		int end, OrderByComparator<bookmark> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKMARKID;
			finderArgs = new Object[] { bookmark_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_BOOKMARKID;
			finderArgs = new Object[] { bookmark_id, start, end, orderByComparator };
		}

		List<bookmark> list = null;

		if (retrieveFromCache) {
			list = (List<bookmark>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (bookmark bookmark : list) {
					if (!Objects.equals(bookmark_id, bookmark.getBookmark_id())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_BOOKMARK_WHERE);

			query.append(_FINDER_COLUMN_BOOKMARKID_BOOKMARK_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(bookmarkModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(bookmark_id.longValue());

				if (!pagination) {
					list = (List<bookmark>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<bookmark>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first bookmark in the ordered set where bookmark_id = &#63;.
	 *
	 * @param bookmark_id the bookmark_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookmark
	 * @throws NoSuchbookmarkException if a matching bookmark could not be found
	 */
	@Override
	public bookmark findBybookmarkId_First(Long bookmark_id,
		OrderByComparator<bookmark> orderByComparator)
		throws NoSuchbookmarkException {
		bookmark bookmark = fetchBybookmarkId_First(bookmark_id,
				orderByComparator);

		if (bookmark != null) {
			return bookmark;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("bookmark_id=");
		msg.append(bookmark_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbookmarkException(msg.toString());
	}

	/**
	 * Returns the first bookmark in the ordered set where bookmark_id = &#63;.
	 *
	 * @param bookmark_id the bookmark_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookmark, or <code>null</code> if a matching bookmark could not be found
	 */
	@Override
	public bookmark fetchBybookmarkId_First(Long bookmark_id,
		OrderByComparator<bookmark> orderByComparator) {
		List<bookmark> list = findBybookmarkId(bookmark_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last bookmark in the ordered set where bookmark_id = &#63;.
	 *
	 * @param bookmark_id the bookmark_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookmark
	 * @throws NoSuchbookmarkException if a matching bookmark could not be found
	 */
	@Override
	public bookmark findBybookmarkId_Last(Long bookmark_id,
		OrderByComparator<bookmark> orderByComparator)
		throws NoSuchbookmarkException {
		bookmark bookmark = fetchBybookmarkId_Last(bookmark_id,
				orderByComparator);

		if (bookmark != null) {
			return bookmark;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("bookmark_id=");
		msg.append(bookmark_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbookmarkException(msg.toString());
	}

	/**
	 * Returns the last bookmark in the ordered set where bookmark_id = &#63;.
	 *
	 * @param bookmark_id the bookmark_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookmark, or <code>null</code> if a matching bookmark could not be found
	 */
	@Override
	public bookmark fetchBybookmarkId_Last(Long bookmark_id,
		OrderByComparator<bookmark> orderByComparator) {
		int count = countBybookmarkId(bookmark_id);

		if (count == 0) {
			return null;
		}

		List<bookmark> list = findBybookmarkId(bookmark_id, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the bookmarks where bookmark_id = &#63; from the database.
	 *
	 * @param bookmark_id the bookmark_id
	 */
	@Override
	public void removeBybookmarkId(Long bookmark_id) {
		for (bookmark bookmark : findBybookmarkId(bookmark_id,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(bookmark);
		}
	}

	/**
	 * Returns the number of bookmarks where bookmark_id = &#63;.
	 *
	 * @param bookmark_id the bookmark_id
	 * @return the number of matching bookmarks
	 */
	@Override
	public int countBybookmarkId(Long bookmark_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_BOOKMARKID;

		Object[] finderArgs = new Object[] { bookmark_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BOOKMARK_WHERE);

			query.append(_FINDER_COLUMN_BOOKMARKID_BOOKMARK_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(bookmark_id.longValue());

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_BOOKMARKID_BOOKMARK_ID_2 = "bookmark.bookmark_id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BOOKMARKURL =
		new FinderPath(bookmarkModelImpl.ENTITY_CACHE_ENABLED,
			bookmarkModelImpl.FINDER_CACHE_ENABLED, bookmarkImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBybookmarkUrl",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKMARKURL =
		new FinderPath(bookmarkModelImpl.ENTITY_CACHE_ENABLED,
			bookmarkModelImpl.FINDER_CACHE_ENABLED, bookmarkImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBybookmarkUrl",
			new String[] { String.class.getName() },
			bookmarkModelImpl.BOOKMARK_URL_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_BOOKMARKURL = new FinderPath(bookmarkModelImpl.ENTITY_CACHE_ENABLED,
			bookmarkModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBybookmarkUrl",
			new String[] { String.class.getName() });

	/**
	 * Returns all the bookmarks where bookmark_url = &#63;.
	 *
	 * @param bookmark_url the bookmark_url
	 * @return the matching bookmarks
	 */
	@Override
	public List<bookmark> findBybookmarkUrl(String bookmark_url) {
		return findBybookmarkUrl(bookmark_url, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<bookmark> findBybookmarkUrl(String bookmark_url, int start,
		int end) {
		return findBybookmarkUrl(bookmark_url, start, end, null);
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
	@Override
	public List<bookmark> findBybookmarkUrl(String bookmark_url, int start,
		int end, OrderByComparator<bookmark> orderByComparator) {
		return findBybookmarkUrl(bookmark_url, start, end, orderByComparator,
			true);
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
	@Override
	public List<bookmark> findBybookmarkUrl(String bookmark_url, int start,
		int end, OrderByComparator<bookmark> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKMARKURL;
			finderArgs = new Object[] { bookmark_url };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_BOOKMARKURL;
			finderArgs = new Object[] {
					bookmark_url,
					
					start, end, orderByComparator
				};
		}

		List<bookmark> list = null;

		if (retrieveFromCache) {
			list = (List<bookmark>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (bookmark bookmark : list) {
					if (!Objects.equals(bookmark_url, bookmark.getBookmark_url())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_BOOKMARK_WHERE);

			boolean bindBookmark_url = false;

			if (bookmark_url == null) {
				query.append(_FINDER_COLUMN_BOOKMARKURL_BOOKMARK_URL_1);
			}
			else if (bookmark_url.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_BOOKMARKURL_BOOKMARK_URL_3);
			}
			else {
				bindBookmark_url = true;

				query.append(_FINDER_COLUMN_BOOKMARKURL_BOOKMARK_URL_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(bookmarkModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindBookmark_url) {
					qPos.add(bookmark_url);
				}

				if (!pagination) {
					list = (List<bookmark>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<bookmark>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first bookmark in the ordered set where bookmark_url = &#63;.
	 *
	 * @param bookmark_url the bookmark_url
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookmark
	 * @throws NoSuchbookmarkException if a matching bookmark could not be found
	 */
	@Override
	public bookmark findBybookmarkUrl_First(String bookmark_url,
		OrderByComparator<bookmark> orderByComparator)
		throws NoSuchbookmarkException {
		bookmark bookmark = fetchBybookmarkUrl_First(bookmark_url,
				orderByComparator);

		if (bookmark != null) {
			return bookmark;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("bookmark_url=");
		msg.append(bookmark_url);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbookmarkException(msg.toString());
	}

	/**
	 * Returns the first bookmark in the ordered set where bookmark_url = &#63;.
	 *
	 * @param bookmark_url the bookmark_url
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookmark, or <code>null</code> if a matching bookmark could not be found
	 */
	@Override
	public bookmark fetchBybookmarkUrl_First(String bookmark_url,
		OrderByComparator<bookmark> orderByComparator) {
		List<bookmark> list = findBybookmarkUrl(bookmark_url, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last bookmark in the ordered set where bookmark_url = &#63;.
	 *
	 * @param bookmark_url the bookmark_url
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookmark
	 * @throws NoSuchbookmarkException if a matching bookmark could not be found
	 */
	@Override
	public bookmark findBybookmarkUrl_Last(String bookmark_url,
		OrderByComparator<bookmark> orderByComparator)
		throws NoSuchbookmarkException {
		bookmark bookmark = fetchBybookmarkUrl_Last(bookmark_url,
				orderByComparator);

		if (bookmark != null) {
			return bookmark;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("bookmark_url=");
		msg.append(bookmark_url);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbookmarkException(msg.toString());
	}

	/**
	 * Returns the last bookmark in the ordered set where bookmark_url = &#63;.
	 *
	 * @param bookmark_url the bookmark_url
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookmark, or <code>null</code> if a matching bookmark could not be found
	 */
	@Override
	public bookmark fetchBybookmarkUrl_Last(String bookmark_url,
		OrderByComparator<bookmark> orderByComparator) {
		int count = countBybookmarkUrl(bookmark_url);

		if (count == 0) {
			return null;
		}

		List<bookmark> list = findBybookmarkUrl(bookmark_url, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public bookmark[] findBybookmarkUrl_PrevAndNext(Long bookmark_id,
		String bookmark_url, OrderByComparator<bookmark> orderByComparator)
		throws NoSuchbookmarkException {
		bookmark bookmark = findByPrimaryKey(bookmark_id);

		Session session = null;

		try {
			session = openSession();

			bookmark[] array = new bookmarkImpl[3];

			array[0] = getBybookmarkUrl_PrevAndNext(session, bookmark,
					bookmark_url, orderByComparator, true);

			array[1] = bookmark;

			array[2] = getBybookmarkUrl_PrevAndNext(session, bookmark,
					bookmark_url, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected bookmark getBybookmarkUrl_PrevAndNext(Session session,
		bookmark bookmark, String bookmark_url,
		OrderByComparator<bookmark> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BOOKMARK_WHERE);

		boolean bindBookmark_url = false;

		if (bookmark_url == null) {
			query.append(_FINDER_COLUMN_BOOKMARKURL_BOOKMARK_URL_1);
		}
		else if (bookmark_url.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_BOOKMARKURL_BOOKMARK_URL_3);
		}
		else {
			bindBookmark_url = true;

			query.append(_FINDER_COLUMN_BOOKMARKURL_BOOKMARK_URL_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(bookmarkModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindBookmark_url) {
			qPos.add(bookmark_url);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(bookmark);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<bookmark> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the bookmarks where bookmark_url = &#63; from the database.
	 *
	 * @param bookmark_url the bookmark_url
	 */
	@Override
	public void removeBybookmarkUrl(String bookmark_url) {
		for (bookmark bookmark : findBybookmarkUrl(bookmark_url,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(bookmark);
		}
	}

	/**
	 * Returns the number of bookmarks where bookmark_url = &#63;.
	 *
	 * @param bookmark_url the bookmark_url
	 * @return the number of matching bookmarks
	 */
	@Override
	public int countBybookmarkUrl(String bookmark_url) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_BOOKMARKURL;

		Object[] finderArgs = new Object[] { bookmark_url };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BOOKMARK_WHERE);

			boolean bindBookmark_url = false;

			if (bookmark_url == null) {
				query.append(_FINDER_COLUMN_BOOKMARKURL_BOOKMARK_URL_1);
			}
			else if (bookmark_url.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_BOOKMARKURL_BOOKMARK_URL_3);
			}
			else {
				bindBookmark_url = true;

				query.append(_FINDER_COLUMN_BOOKMARKURL_BOOKMARK_URL_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindBookmark_url) {
					qPos.add(bookmark_url);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_BOOKMARKURL_BOOKMARK_URL_1 = "bookmark.bookmark_url IS NULL";
	private static final String _FINDER_COLUMN_BOOKMARKURL_BOOKMARK_URL_2 = "bookmark.bookmark_url = ?";
	private static final String _FINDER_COLUMN_BOOKMARKURL_BOOKMARK_URL_3 = "(bookmark.bookmark_url IS NULL OR bookmark.bookmark_url = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BOOKMARTITLE =
		new FinderPath(bookmarkModelImpl.ENTITY_CACHE_ENABLED,
			bookmarkModelImpl.FINDER_CACHE_ENABLED, bookmarkImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBybookmarTitle",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKMARTITLE =
		new FinderPath(bookmarkModelImpl.ENTITY_CACHE_ENABLED,
			bookmarkModelImpl.FINDER_CACHE_ENABLED, bookmarkImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBybookmarTitle",
			new String[] { String.class.getName() },
			bookmarkModelImpl.BOOKMARK_TITLE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_BOOKMARTITLE = new FinderPath(bookmarkModelImpl.ENTITY_CACHE_ENABLED,
			bookmarkModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBybookmarTitle",
			new String[] { String.class.getName() });

	/**
	 * Returns all the bookmarks where bookmark_title = &#63;.
	 *
	 * @param bookmark_title the bookmark_title
	 * @return the matching bookmarks
	 */
	@Override
	public List<bookmark> findBybookmarTitle(String bookmark_title) {
		return findBybookmarTitle(bookmark_title, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<bookmark> findBybookmarTitle(String bookmark_title, int start,
		int end) {
		return findBybookmarTitle(bookmark_title, start, end, null);
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
	@Override
	public List<bookmark> findBybookmarTitle(String bookmark_title, int start,
		int end, OrderByComparator<bookmark> orderByComparator) {
		return findBybookmarTitle(bookmark_title, start, end,
			orderByComparator, true);
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
	@Override
	public List<bookmark> findBybookmarTitle(String bookmark_title, int start,
		int end, OrderByComparator<bookmark> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKMARTITLE;
			finderArgs = new Object[] { bookmark_title };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_BOOKMARTITLE;
			finderArgs = new Object[] {
					bookmark_title,
					
					start, end, orderByComparator
				};
		}

		List<bookmark> list = null;

		if (retrieveFromCache) {
			list = (List<bookmark>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (bookmark bookmark : list) {
					if (!Objects.equals(bookmark_title,
								bookmark.getBookmark_title())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_BOOKMARK_WHERE);

			boolean bindBookmark_title = false;

			if (bookmark_title == null) {
				query.append(_FINDER_COLUMN_BOOKMARTITLE_BOOKMARK_TITLE_1);
			}
			else if (bookmark_title.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_BOOKMARTITLE_BOOKMARK_TITLE_3);
			}
			else {
				bindBookmark_title = true;

				query.append(_FINDER_COLUMN_BOOKMARTITLE_BOOKMARK_TITLE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(bookmarkModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindBookmark_title) {
					qPos.add(bookmark_title);
				}

				if (!pagination) {
					list = (List<bookmark>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<bookmark>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first bookmark in the ordered set where bookmark_title = &#63;.
	 *
	 * @param bookmark_title the bookmark_title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookmark
	 * @throws NoSuchbookmarkException if a matching bookmark could not be found
	 */
	@Override
	public bookmark findBybookmarTitle_First(String bookmark_title,
		OrderByComparator<bookmark> orderByComparator)
		throws NoSuchbookmarkException {
		bookmark bookmark = fetchBybookmarTitle_First(bookmark_title,
				orderByComparator);

		if (bookmark != null) {
			return bookmark;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("bookmark_title=");
		msg.append(bookmark_title);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbookmarkException(msg.toString());
	}

	/**
	 * Returns the first bookmark in the ordered set where bookmark_title = &#63;.
	 *
	 * @param bookmark_title the bookmark_title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookmark, or <code>null</code> if a matching bookmark could not be found
	 */
	@Override
	public bookmark fetchBybookmarTitle_First(String bookmark_title,
		OrderByComparator<bookmark> orderByComparator) {
		List<bookmark> list = findBybookmarTitle(bookmark_title, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last bookmark in the ordered set where bookmark_title = &#63;.
	 *
	 * @param bookmark_title the bookmark_title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookmark
	 * @throws NoSuchbookmarkException if a matching bookmark could not be found
	 */
	@Override
	public bookmark findBybookmarTitle_Last(String bookmark_title,
		OrderByComparator<bookmark> orderByComparator)
		throws NoSuchbookmarkException {
		bookmark bookmark = fetchBybookmarTitle_Last(bookmark_title,
				orderByComparator);

		if (bookmark != null) {
			return bookmark;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("bookmark_title=");
		msg.append(bookmark_title);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbookmarkException(msg.toString());
	}

	/**
	 * Returns the last bookmark in the ordered set where bookmark_title = &#63;.
	 *
	 * @param bookmark_title the bookmark_title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookmark, or <code>null</code> if a matching bookmark could not be found
	 */
	@Override
	public bookmark fetchBybookmarTitle_Last(String bookmark_title,
		OrderByComparator<bookmark> orderByComparator) {
		int count = countBybookmarTitle(bookmark_title);

		if (count == 0) {
			return null;
		}

		List<bookmark> list = findBybookmarTitle(bookmark_title, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public bookmark[] findBybookmarTitle_PrevAndNext(Long bookmark_id,
		String bookmark_title, OrderByComparator<bookmark> orderByComparator)
		throws NoSuchbookmarkException {
		bookmark bookmark = findByPrimaryKey(bookmark_id);

		Session session = null;

		try {
			session = openSession();

			bookmark[] array = new bookmarkImpl[3];

			array[0] = getBybookmarTitle_PrevAndNext(session, bookmark,
					bookmark_title, orderByComparator, true);

			array[1] = bookmark;

			array[2] = getBybookmarTitle_PrevAndNext(session, bookmark,
					bookmark_title, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected bookmark getBybookmarTitle_PrevAndNext(Session session,
		bookmark bookmark, String bookmark_title,
		OrderByComparator<bookmark> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BOOKMARK_WHERE);

		boolean bindBookmark_title = false;

		if (bookmark_title == null) {
			query.append(_FINDER_COLUMN_BOOKMARTITLE_BOOKMARK_TITLE_1);
		}
		else if (bookmark_title.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_BOOKMARTITLE_BOOKMARK_TITLE_3);
		}
		else {
			bindBookmark_title = true;

			query.append(_FINDER_COLUMN_BOOKMARTITLE_BOOKMARK_TITLE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(bookmarkModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindBookmark_title) {
			qPos.add(bookmark_title);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(bookmark);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<bookmark> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the bookmarks where bookmark_title = &#63; from the database.
	 *
	 * @param bookmark_title the bookmark_title
	 */
	@Override
	public void removeBybookmarTitle(String bookmark_title) {
		for (bookmark bookmark : findBybookmarTitle(bookmark_title,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(bookmark);
		}
	}

	/**
	 * Returns the number of bookmarks where bookmark_title = &#63;.
	 *
	 * @param bookmark_title the bookmark_title
	 * @return the number of matching bookmarks
	 */
	@Override
	public int countBybookmarTitle(String bookmark_title) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_BOOKMARTITLE;

		Object[] finderArgs = new Object[] { bookmark_title };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BOOKMARK_WHERE);

			boolean bindBookmark_title = false;

			if (bookmark_title == null) {
				query.append(_FINDER_COLUMN_BOOKMARTITLE_BOOKMARK_TITLE_1);
			}
			else if (bookmark_title.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_BOOKMARTITLE_BOOKMARK_TITLE_3);
			}
			else {
				bindBookmark_title = true;

				query.append(_FINDER_COLUMN_BOOKMARTITLE_BOOKMARK_TITLE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindBookmark_title) {
					qPos.add(bookmark_title);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_BOOKMARTITLE_BOOKMARK_TITLE_1 = "bookmark.bookmark_title IS NULL";
	private static final String _FINDER_COLUMN_BOOKMARTITLE_BOOKMARK_TITLE_2 = "bookmark.bookmark_title = ?";
	private static final String _FINDER_COLUMN_BOOKMARTITLE_BOOKMARK_TITLE_3 = "(bookmark.bookmark_title IS NULL OR bookmark.bookmark_title = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BOOKMARUSERID =
		new FinderPath(bookmarkModelImpl.ENTITY_CACHE_ENABLED,
			bookmarkModelImpl.FINDER_CACHE_ENABLED, bookmarkImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBybookmarUserId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKMARUSERID =
		new FinderPath(bookmarkModelImpl.ENTITY_CACHE_ENABLED,
			bookmarkModelImpl.FINDER_CACHE_ENABLED, bookmarkImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBybookmarUserId",
			new String[] { Long.class.getName() },
			bookmarkModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_BOOKMARUSERID = new FinderPath(bookmarkModelImpl.ENTITY_CACHE_ENABLED,
			bookmarkModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBybookmarUserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the bookmarks where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching bookmarks
	 */
	@Override
	public List<bookmark> findBybookmarUserId(Long userId) {
		return findBybookmarUserId(userId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<bookmark> findBybookmarUserId(Long userId, int start, int end) {
		return findBybookmarUserId(userId, start, end, null);
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
	@Override
	public List<bookmark> findBybookmarUserId(Long userId, int start, int end,
		OrderByComparator<bookmark> orderByComparator) {
		return findBybookmarUserId(userId, start, end, orderByComparator, true);
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
	@Override
	public List<bookmark> findBybookmarUserId(Long userId, int start, int end,
		OrderByComparator<bookmark> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKMARUSERID;
			finderArgs = new Object[] { userId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_BOOKMARUSERID;
			finderArgs = new Object[] { userId, start, end, orderByComparator };
		}

		List<bookmark> list = null;

		if (retrieveFromCache) {
			list = (List<bookmark>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (bookmark bookmark : list) {
					if (!Objects.equals(userId, bookmark.getUserId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_BOOKMARK_WHERE);

			query.append(_FINDER_COLUMN_BOOKMARUSERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(bookmarkModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId.longValue());

				if (!pagination) {
					list = (List<bookmark>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<bookmark>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first bookmark in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookmark
	 * @throws NoSuchbookmarkException if a matching bookmark could not be found
	 */
	@Override
	public bookmark findBybookmarUserId_First(Long userId,
		OrderByComparator<bookmark> orderByComparator)
		throws NoSuchbookmarkException {
		bookmark bookmark = fetchBybookmarUserId_First(userId, orderByComparator);

		if (bookmark != null) {
			return bookmark;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbookmarkException(msg.toString());
	}

	/**
	 * Returns the first bookmark in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookmark, or <code>null</code> if a matching bookmark could not be found
	 */
	@Override
	public bookmark fetchBybookmarUserId_First(Long userId,
		OrderByComparator<bookmark> orderByComparator) {
		List<bookmark> list = findBybookmarUserId(userId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last bookmark in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookmark
	 * @throws NoSuchbookmarkException if a matching bookmark could not be found
	 */
	@Override
	public bookmark findBybookmarUserId_Last(Long userId,
		OrderByComparator<bookmark> orderByComparator)
		throws NoSuchbookmarkException {
		bookmark bookmark = fetchBybookmarUserId_Last(userId, orderByComparator);

		if (bookmark != null) {
			return bookmark;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbookmarkException(msg.toString());
	}

	/**
	 * Returns the last bookmark in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookmark, or <code>null</code> if a matching bookmark could not be found
	 */
	@Override
	public bookmark fetchBybookmarUserId_Last(Long userId,
		OrderByComparator<bookmark> orderByComparator) {
		int count = countBybookmarUserId(userId);

		if (count == 0) {
			return null;
		}

		List<bookmark> list = findBybookmarUserId(userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public bookmark[] findBybookmarUserId_PrevAndNext(Long bookmark_id,
		Long userId, OrderByComparator<bookmark> orderByComparator)
		throws NoSuchbookmarkException {
		bookmark bookmark = findByPrimaryKey(bookmark_id);

		Session session = null;

		try {
			session = openSession();

			bookmark[] array = new bookmarkImpl[3];

			array[0] = getBybookmarUserId_PrevAndNext(session, bookmark,
					userId, orderByComparator, true);

			array[1] = bookmark;

			array[2] = getBybookmarUserId_PrevAndNext(session, bookmark,
					userId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected bookmark getBybookmarUserId_PrevAndNext(Session session,
		bookmark bookmark, Long userId,
		OrderByComparator<bookmark> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BOOKMARK_WHERE);

		query.append(_FINDER_COLUMN_BOOKMARUSERID_USERID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(bookmarkModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId.longValue());

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(bookmark);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<bookmark> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the bookmarks where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	@Override
	public void removeBybookmarUserId(Long userId) {
		for (bookmark bookmark : findBybookmarUserId(userId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(bookmark);
		}
	}

	/**
	 * Returns the number of bookmarks where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching bookmarks
	 */
	@Override
	public int countBybookmarUserId(Long userId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_BOOKMARUSERID;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BOOKMARK_WHERE);

			query.append(_FINDER_COLUMN_BOOKMARUSERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId.longValue());

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_BOOKMARUSERID_USERID_2 = "bookmark.userId = ?";

	public bookmarkPersistenceImpl() {
		setModelClass(bookmark.class);
	}

	/**
	 * Caches the bookmark in the entity cache if it is enabled.
	 *
	 * @param bookmark the bookmark
	 */
	@Override
	public void cacheResult(bookmark bookmark) {
		entityCache.putResult(bookmarkModelImpl.ENTITY_CACHE_ENABLED,
			bookmarkImpl.class, bookmark.getPrimaryKey(), bookmark);

		bookmark.resetOriginalValues();
	}

	/**
	 * Caches the bookmarks in the entity cache if it is enabled.
	 *
	 * @param bookmarks the bookmarks
	 */
	@Override
	public void cacheResult(List<bookmark> bookmarks) {
		for (bookmark bookmark : bookmarks) {
			if (entityCache.getResult(bookmarkModelImpl.ENTITY_CACHE_ENABLED,
						bookmarkImpl.class, bookmark.getPrimaryKey()) == null) {
				cacheResult(bookmark);
			}
			else {
				bookmark.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all bookmarks.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(bookmarkImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the bookmark.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(bookmark bookmark) {
		entityCache.removeResult(bookmarkModelImpl.ENTITY_CACHE_ENABLED,
			bookmarkImpl.class, bookmark.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<bookmark> bookmarks) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (bookmark bookmark : bookmarks) {
			entityCache.removeResult(bookmarkModelImpl.ENTITY_CACHE_ENABLED,
				bookmarkImpl.class, bookmark.getPrimaryKey());
		}
	}

	/**
	 * Creates a new bookmark with the primary key. Does not add the bookmark to the database.
	 *
	 * @param bookmark_id the primary key for the new bookmark
	 * @return the new bookmark
	 */
	@Override
	public bookmark create(Long bookmark_id) {
		bookmark bookmark = new bookmarkImpl();

		bookmark.setNew(true);
		bookmark.setPrimaryKey(bookmark_id);

		bookmark.setCompanyId(companyProvider.getCompanyId());

		return bookmark;
	}

	/**
	 * Removes the bookmark with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bookmark_id the primary key of the bookmark
	 * @return the bookmark that was removed
	 * @throws NoSuchbookmarkException if a bookmark with the primary key could not be found
	 */
	@Override
	public bookmark remove(Long bookmark_id) throws NoSuchbookmarkException {
		return remove((Serializable)bookmark_id);
	}

	/**
	 * Removes the bookmark with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the bookmark
	 * @return the bookmark that was removed
	 * @throws NoSuchbookmarkException if a bookmark with the primary key could not be found
	 */
	@Override
	public bookmark remove(Serializable primaryKey)
		throws NoSuchbookmarkException {
		Session session = null;

		try {
			session = openSession();

			bookmark bookmark = (bookmark)session.get(bookmarkImpl.class,
					primaryKey);

			if (bookmark == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchbookmarkException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(bookmark);
		}
		catch (NoSuchbookmarkException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected bookmark removeImpl(bookmark bookmark) {
		bookmark = toUnwrappedModel(bookmark);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(bookmark)) {
				bookmark = (bookmark)session.get(bookmarkImpl.class,
						bookmark.getPrimaryKeyObj());
			}

			if (bookmark != null) {
				session.delete(bookmark);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (bookmark != null) {
			clearCache(bookmark);
		}

		return bookmark;
	}

	@Override
	public bookmark updateImpl(bookmark bookmark) {
		bookmark = toUnwrappedModel(bookmark);

		boolean isNew = bookmark.isNew();

		bookmarkModelImpl bookmarkModelImpl = (bookmarkModelImpl)bookmark;

		Session session = null;

		try {
			session = openSession();

			if (bookmark.isNew()) {
				session.save(bookmark);

				bookmark.setNew(false);
			}
			else {
				bookmark = (bookmark)session.merge(bookmark);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !bookmarkModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((bookmarkModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKMARKID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						bookmarkModelImpl.getOriginalBookmark_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_BOOKMARKID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKMARKID,
					args);

				args = new Object[] { bookmarkModelImpl.getBookmark_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_BOOKMARKID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKMARKID,
					args);
			}

			if ((bookmarkModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKMARKURL.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						bookmarkModelImpl.getOriginalBookmark_url()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_BOOKMARKURL, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKMARKURL,
					args);

				args = new Object[] { bookmarkModelImpl.getBookmark_url() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_BOOKMARKURL, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKMARKURL,
					args);
			}

			if ((bookmarkModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKMARTITLE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						bookmarkModelImpl.getOriginalBookmark_title()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_BOOKMARTITLE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKMARTITLE,
					args);

				args = new Object[] { bookmarkModelImpl.getBookmark_title() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_BOOKMARTITLE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKMARTITLE,
					args);
			}

			if ((bookmarkModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKMARUSERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						bookmarkModelImpl.getOriginalUserId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_BOOKMARUSERID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKMARUSERID,
					args);

				args = new Object[] { bookmarkModelImpl.getUserId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_BOOKMARUSERID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKMARUSERID,
					args);
			}
		}

		entityCache.putResult(bookmarkModelImpl.ENTITY_CACHE_ENABLED,
			bookmarkImpl.class, bookmark.getPrimaryKey(), bookmark, false);

		bookmark.resetOriginalValues();

		return bookmark;
	}

	protected bookmark toUnwrappedModel(bookmark bookmark) {
		if (bookmark instanceof bookmarkImpl) {
			return bookmark;
		}

		bookmarkImpl bookmarkImpl = new bookmarkImpl();

		bookmarkImpl.setNew(bookmark.isNew());
		bookmarkImpl.setPrimaryKey(bookmark.getPrimaryKey());

		bookmarkImpl.setCompanyId(bookmark.getCompanyId());
		bookmarkImpl.setGroupId(bookmark.getGroupId());
		bookmarkImpl.setBookmark_id(bookmark.getBookmark_id());
		bookmarkImpl.setBookmark_url(bookmark.getBookmark_url());
		bookmarkImpl.setBookmark_title(bookmark.getBookmark_title());
		bookmarkImpl.setUserId(bookmark.getUserId());
		bookmarkImpl.setContent(bookmark.getContent());
		bookmarkImpl.setCreate_date(bookmark.getCreate_date());
		bookmarkImpl.setUpdate_date(bookmark.getUpdate_date());
		bookmarkImpl.setIs_delete(bookmark.getIs_delete());

		return bookmarkImpl;
	}

	/**
	 * Returns the bookmark with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the bookmark
	 * @return the bookmark
	 * @throws NoSuchbookmarkException if a bookmark with the primary key could not be found
	 */
	@Override
	public bookmark findByPrimaryKey(Serializable primaryKey)
		throws NoSuchbookmarkException {
		bookmark bookmark = fetchByPrimaryKey(primaryKey);

		if (bookmark == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchbookmarkException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return bookmark;
	}

	/**
	 * Returns the bookmark with the primary key or throws a {@link NoSuchbookmarkException} if it could not be found.
	 *
	 * @param bookmark_id the primary key of the bookmark
	 * @return the bookmark
	 * @throws NoSuchbookmarkException if a bookmark with the primary key could not be found
	 */
	@Override
	public bookmark findByPrimaryKey(Long bookmark_id)
		throws NoSuchbookmarkException {
		return findByPrimaryKey((Serializable)bookmark_id);
	}

	/**
	 * Returns the bookmark with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the bookmark
	 * @return the bookmark, or <code>null</code> if a bookmark with the primary key could not be found
	 */
	@Override
	public bookmark fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(bookmarkModelImpl.ENTITY_CACHE_ENABLED,
				bookmarkImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		bookmark bookmark = (bookmark)serializable;

		if (bookmark == null) {
			Session session = null;

			try {
				session = openSession();

				bookmark = (bookmark)session.get(bookmarkImpl.class, primaryKey);

				if (bookmark != null) {
					cacheResult(bookmark);
				}
				else {
					entityCache.putResult(bookmarkModelImpl.ENTITY_CACHE_ENABLED,
						bookmarkImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(bookmarkModelImpl.ENTITY_CACHE_ENABLED,
					bookmarkImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return bookmark;
	}

	/**
	 * Returns the bookmark with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bookmark_id the primary key of the bookmark
	 * @return the bookmark, or <code>null</code> if a bookmark with the primary key could not be found
	 */
	@Override
	public bookmark fetchByPrimaryKey(Long bookmark_id) {
		return fetchByPrimaryKey((Serializable)bookmark_id);
	}

	@Override
	public Map<Serializable, bookmark> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, bookmark> map = new HashMap<Serializable, bookmark>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			bookmark bookmark = fetchByPrimaryKey(primaryKey);

			if (bookmark != null) {
				map.put(primaryKey, bookmark);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(bookmarkModelImpl.ENTITY_CACHE_ENABLED,
					bookmarkImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (bookmark)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_BOOKMARK_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (bookmark bookmark : (List<bookmark>)q.list()) {
				map.put(bookmark.getPrimaryKeyObj(), bookmark);

				cacheResult(bookmark);

				uncachedPrimaryKeys.remove(bookmark.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(bookmarkModelImpl.ENTITY_CACHE_ENABLED,
					bookmarkImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the bookmarks.
	 *
	 * @return the bookmarks
	 */
	@Override
	public List<bookmark> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<bookmark> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<bookmark> findAll(int start, int end,
		OrderByComparator<bookmark> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<bookmark> findAll(int start, int end,
		OrderByComparator<bookmark> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<bookmark> list = null;

		if (retrieveFromCache) {
			list = (List<bookmark>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_BOOKMARK);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BOOKMARK;

				if (pagination) {
					sql = sql.concat(bookmarkModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<bookmark>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<bookmark>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the bookmarks from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (bookmark bookmark : findAll()) {
			remove(bookmark);
		}
	}

	/**
	 * Returns the number of bookmarks.
	 *
	 * @return the number of bookmarks
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_BOOKMARK);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return bookmarkModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the bookmark persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(bookmarkImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_BOOKMARK = "SELECT bookmark FROM bookmark bookmark";
	private static final String _SQL_SELECT_BOOKMARK_WHERE_PKS_IN = "SELECT bookmark FROM bookmark bookmark WHERE bookmark_id IN (";
	private static final String _SQL_SELECT_BOOKMARK_WHERE = "SELECT bookmark FROM bookmark bookmark WHERE ";
	private static final String _SQL_COUNT_BOOKMARK = "SELECT COUNT(bookmark) FROM bookmark bookmark";
	private static final String _SQL_COUNT_BOOKMARK_WHERE = "SELECT COUNT(bookmark) FROM bookmark bookmark WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "bookmark.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No bookmark exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No bookmark exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(bookmarkPersistenceImpl.class);
}