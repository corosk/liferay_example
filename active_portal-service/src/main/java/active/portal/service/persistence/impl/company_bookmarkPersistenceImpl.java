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

import active.portal.exception.NoSuchcompany_bookmarkException;

import active.portal.model.company_bookmark;
import active.portal.model.impl.company_bookmarkImpl;
import active.portal.model.impl.company_bookmarkModelImpl;

import active.portal.service.persistence.company_bookmarkPersistence;

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
 * The persistence implementation for the company_bookmark service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see company_bookmarkPersistence
 * @see active.portal.service.persistence.company_bookmarkUtil
 * @generated
 */
@ProviderType
public class company_bookmarkPersistenceImpl extends BasePersistenceImpl<company_bookmark>
	implements company_bookmarkPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link company_bookmarkUtil} to access the company_bookmark persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = company_bookmarkImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(company_bookmarkModelImpl.ENTITY_CACHE_ENABLED,
			company_bookmarkModelImpl.FINDER_CACHE_ENABLED,
			company_bookmarkImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(company_bookmarkModelImpl.ENTITY_CACHE_ENABLED,
			company_bookmarkModelImpl.FINDER_CACHE_ENABLED,
			company_bookmarkImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(company_bookmarkModelImpl.ENTITY_CACHE_ENABLED,
			company_bookmarkModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BOOKMARKID =
		new FinderPath(company_bookmarkModelImpl.ENTITY_CACHE_ENABLED,
			company_bookmarkModelImpl.FINDER_CACHE_ENABLED,
			company_bookmarkImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBybookmarkId",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKMARKID =
		new FinderPath(company_bookmarkModelImpl.ENTITY_CACHE_ENABLED,
			company_bookmarkModelImpl.FINDER_CACHE_ENABLED,
			company_bookmarkImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBybookmarkId",
			new String[] { String.class.getName() },
			company_bookmarkModelImpl.BOOKMARK_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_BOOKMARKID = new FinderPath(company_bookmarkModelImpl.ENTITY_CACHE_ENABLED,
			company_bookmarkModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBybookmarkId",
			new String[] { String.class.getName() });

	/**
	 * Returns all the company_bookmarks where bookmark_id = &#63;.
	 *
	 * @param bookmark_id the bookmark_id
	 * @return the matching company_bookmarks
	 */
	@Override
	public List<company_bookmark> findBybookmarkId(String bookmark_id) {
		return findBybookmarkId(bookmark_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<company_bookmark> findBybookmarkId(String bookmark_id,
		int start, int end) {
		return findBybookmarkId(bookmark_id, start, end, null);
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
	@Override
	public List<company_bookmark> findBybookmarkId(String bookmark_id,
		int start, int end,
		OrderByComparator<company_bookmark> orderByComparator) {
		return findBybookmarkId(bookmark_id, start, end, orderByComparator, true);
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
	@Override
	public List<company_bookmark> findBybookmarkId(String bookmark_id,
		int start, int end,
		OrderByComparator<company_bookmark> orderByComparator,
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

		List<company_bookmark> list = null;

		if (retrieveFromCache) {
			list = (List<company_bookmark>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (company_bookmark company_bookmark : list) {
					if (!Objects.equals(bookmark_id,
								company_bookmark.getBookmark_id())) {
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

			query.append(_SQL_SELECT_COMPANY_BOOKMARK_WHERE);

			boolean bindBookmark_id = false;

			if (bookmark_id == null) {
				query.append(_FINDER_COLUMN_BOOKMARKID_BOOKMARK_ID_1);
			}
			else if (bookmark_id.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_BOOKMARKID_BOOKMARK_ID_3);
			}
			else {
				bindBookmark_id = true;

				query.append(_FINDER_COLUMN_BOOKMARKID_BOOKMARK_ID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(company_bookmarkModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindBookmark_id) {
					qPos.add(bookmark_id);
				}

				if (!pagination) {
					list = (List<company_bookmark>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<company_bookmark>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first company_bookmark in the ordered set where bookmark_id = &#63;.
	 *
	 * @param bookmark_id the bookmark_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching company_bookmark
	 * @throws NoSuchcompany_bookmarkException if a matching company_bookmark could not be found
	 */
	@Override
	public company_bookmark findBybookmarkId_First(String bookmark_id,
		OrderByComparator<company_bookmark> orderByComparator)
		throws NoSuchcompany_bookmarkException {
		company_bookmark company_bookmark = fetchBybookmarkId_First(bookmark_id,
				orderByComparator);

		if (company_bookmark != null) {
			return company_bookmark;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("bookmark_id=");
		msg.append(bookmark_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchcompany_bookmarkException(msg.toString());
	}

	/**
	 * Returns the first company_bookmark in the ordered set where bookmark_id = &#63;.
	 *
	 * @param bookmark_id the bookmark_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching company_bookmark, or <code>null</code> if a matching company_bookmark could not be found
	 */
	@Override
	public company_bookmark fetchBybookmarkId_First(String bookmark_id,
		OrderByComparator<company_bookmark> orderByComparator) {
		List<company_bookmark> list = findBybookmarkId(bookmark_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last company_bookmark in the ordered set where bookmark_id = &#63;.
	 *
	 * @param bookmark_id the bookmark_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching company_bookmark
	 * @throws NoSuchcompany_bookmarkException if a matching company_bookmark could not be found
	 */
	@Override
	public company_bookmark findBybookmarkId_Last(String bookmark_id,
		OrderByComparator<company_bookmark> orderByComparator)
		throws NoSuchcompany_bookmarkException {
		company_bookmark company_bookmark = fetchBybookmarkId_Last(bookmark_id,
				orderByComparator);

		if (company_bookmark != null) {
			return company_bookmark;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("bookmark_id=");
		msg.append(bookmark_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchcompany_bookmarkException(msg.toString());
	}

	/**
	 * Returns the last company_bookmark in the ordered set where bookmark_id = &#63;.
	 *
	 * @param bookmark_id the bookmark_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching company_bookmark, or <code>null</code> if a matching company_bookmark could not be found
	 */
	@Override
	public company_bookmark fetchBybookmarkId_Last(String bookmark_id,
		OrderByComparator<company_bookmark> orderByComparator) {
		int count = countBybookmarkId(bookmark_id);

		if (count == 0) {
			return null;
		}

		List<company_bookmark> list = findBybookmarkId(bookmark_id, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the company_bookmarks where bookmark_id = &#63; from the database.
	 *
	 * @param bookmark_id the bookmark_id
	 */
	@Override
	public void removeBybookmarkId(String bookmark_id) {
		for (company_bookmark company_bookmark : findBybookmarkId(bookmark_id,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(company_bookmark);
		}
	}

	/**
	 * Returns the number of company_bookmarks where bookmark_id = &#63;.
	 *
	 * @param bookmark_id the bookmark_id
	 * @return the number of matching company_bookmarks
	 */
	@Override
	public int countBybookmarkId(String bookmark_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_BOOKMARKID;

		Object[] finderArgs = new Object[] { bookmark_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_COMPANY_BOOKMARK_WHERE);

			boolean bindBookmark_id = false;

			if (bookmark_id == null) {
				query.append(_FINDER_COLUMN_BOOKMARKID_BOOKMARK_ID_1);
			}
			else if (bookmark_id.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_BOOKMARKID_BOOKMARK_ID_3);
			}
			else {
				bindBookmark_id = true;

				query.append(_FINDER_COLUMN_BOOKMARKID_BOOKMARK_ID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindBookmark_id) {
					qPos.add(bookmark_id);
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

	private static final String _FINDER_COLUMN_BOOKMARKID_BOOKMARK_ID_1 = "company_bookmark.bookmark_id IS NULL";
	private static final String _FINDER_COLUMN_BOOKMARKID_BOOKMARK_ID_2 = "company_bookmark.bookmark_id = ?";
	private static final String _FINDER_COLUMN_BOOKMARKID_BOOKMARK_ID_3 = "(company_bookmark.bookmark_id IS NULL OR company_bookmark.bookmark_id = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BOOKMARKURL =
		new FinderPath(company_bookmarkModelImpl.ENTITY_CACHE_ENABLED,
			company_bookmarkModelImpl.FINDER_CACHE_ENABLED,
			company_bookmarkImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBybookmarkUrl",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKMARKURL =
		new FinderPath(company_bookmarkModelImpl.ENTITY_CACHE_ENABLED,
			company_bookmarkModelImpl.FINDER_CACHE_ENABLED,
			company_bookmarkImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBybookmarkUrl",
			new String[] { String.class.getName() },
			company_bookmarkModelImpl.BOOKMARK_URL_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_BOOKMARKURL = new FinderPath(company_bookmarkModelImpl.ENTITY_CACHE_ENABLED,
			company_bookmarkModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBybookmarkUrl",
			new String[] { String.class.getName() });

	/**
	 * Returns all the company_bookmarks where bookmark_url = &#63;.
	 *
	 * @param bookmark_url the bookmark_url
	 * @return the matching company_bookmarks
	 */
	@Override
	public List<company_bookmark> findBybookmarkUrl(String bookmark_url) {
		return findBybookmarkUrl(bookmark_url, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<company_bookmark> findBybookmarkUrl(String bookmark_url,
		int start, int end) {
		return findBybookmarkUrl(bookmark_url, start, end, null);
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
	@Override
	public List<company_bookmark> findBybookmarkUrl(String bookmark_url,
		int start, int end,
		OrderByComparator<company_bookmark> orderByComparator) {
		return findBybookmarkUrl(bookmark_url, start, end, orderByComparator,
			true);
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
	@Override
	public List<company_bookmark> findBybookmarkUrl(String bookmark_url,
		int start, int end,
		OrderByComparator<company_bookmark> orderByComparator,
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

		List<company_bookmark> list = null;

		if (retrieveFromCache) {
			list = (List<company_bookmark>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (company_bookmark company_bookmark : list) {
					if (!Objects.equals(bookmark_url,
								company_bookmark.getBookmark_url())) {
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

			query.append(_SQL_SELECT_COMPANY_BOOKMARK_WHERE);

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
				query.append(company_bookmarkModelImpl.ORDER_BY_JPQL);
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
					list = (List<company_bookmark>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<company_bookmark>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first company_bookmark in the ordered set where bookmark_url = &#63;.
	 *
	 * @param bookmark_url the bookmark_url
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching company_bookmark
	 * @throws NoSuchcompany_bookmarkException if a matching company_bookmark could not be found
	 */
	@Override
	public company_bookmark findBybookmarkUrl_First(String bookmark_url,
		OrderByComparator<company_bookmark> orderByComparator)
		throws NoSuchcompany_bookmarkException {
		company_bookmark company_bookmark = fetchBybookmarkUrl_First(bookmark_url,
				orderByComparator);

		if (company_bookmark != null) {
			return company_bookmark;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("bookmark_url=");
		msg.append(bookmark_url);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchcompany_bookmarkException(msg.toString());
	}

	/**
	 * Returns the first company_bookmark in the ordered set where bookmark_url = &#63;.
	 *
	 * @param bookmark_url the bookmark_url
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching company_bookmark, or <code>null</code> if a matching company_bookmark could not be found
	 */
	@Override
	public company_bookmark fetchBybookmarkUrl_First(String bookmark_url,
		OrderByComparator<company_bookmark> orderByComparator) {
		List<company_bookmark> list = findBybookmarkUrl(bookmark_url, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last company_bookmark in the ordered set where bookmark_url = &#63;.
	 *
	 * @param bookmark_url the bookmark_url
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching company_bookmark
	 * @throws NoSuchcompany_bookmarkException if a matching company_bookmark could not be found
	 */
	@Override
	public company_bookmark findBybookmarkUrl_Last(String bookmark_url,
		OrderByComparator<company_bookmark> orderByComparator)
		throws NoSuchcompany_bookmarkException {
		company_bookmark company_bookmark = fetchBybookmarkUrl_Last(bookmark_url,
				orderByComparator);

		if (company_bookmark != null) {
			return company_bookmark;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("bookmark_url=");
		msg.append(bookmark_url);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchcompany_bookmarkException(msg.toString());
	}

	/**
	 * Returns the last company_bookmark in the ordered set where bookmark_url = &#63;.
	 *
	 * @param bookmark_url the bookmark_url
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching company_bookmark, or <code>null</code> if a matching company_bookmark could not be found
	 */
	@Override
	public company_bookmark fetchBybookmarkUrl_Last(String bookmark_url,
		OrderByComparator<company_bookmark> orderByComparator) {
		int count = countBybookmarkUrl(bookmark_url);

		if (count == 0) {
			return null;
		}

		List<company_bookmark> list = findBybookmarkUrl(bookmark_url,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public company_bookmark[] findBybookmarkUrl_PrevAndNext(
		String bookmark_id, String bookmark_url,
		OrderByComparator<company_bookmark> orderByComparator)
		throws NoSuchcompany_bookmarkException {
		company_bookmark company_bookmark = findByPrimaryKey(bookmark_id);

		Session session = null;

		try {
			session = openSession();

			company_bookmark[] array = new company_bookmarkImpl[3];

			array[0] = getBybookmarkUrl_PrevAndNext(session, company_bookmark,
					bookmark_url, orderByComparator, true);

			array[1] = company_bookmark;

			array[2] = getBybookmarkUrl_PrevAndNext(session, company_bookmark,
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

	protected company_bookmark getBybookmarkUrl_PrevAndNext(Session session,
		company_bookmark company_bookmark, String bookmark_url,
		OrderByComparator<company_bookmark> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_COMPANY_BOOKMARK_WHERE);

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
			query.append(company_bookmarkModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(company_bookmark);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<company_bookmark> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the company_bookmarks where bookmark_url = &#63; from the database.
	 *
	 * @param bookmark_url the bookmark_url
	 */
	@Override
	public void removeBybookmarkUrl(String bookmark_url) {
		for (company_bookmark company_bookmark : findBybookmarkUrl(
				bookmark_url, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(company_bookmark);
		}
	}

	/**
	 * Returns the number of company_bookmarks where bookmark_url = &#63;.
	 *
	 * @param bookmark_url the bookmark_url
	 * @return the number of matching company_bookmarks
	 */
	@Override
	public int countBybookmarkUrl(String bookmark_url) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_BOOKMARKURL;

		Object[] finderArgs = new Object[] { bookmark_url };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_COMPANY_BOOKMARK_WHERE);

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

	private static final String _FINDER_COLUMN_BOOKMARKURL_BOOKMARK_URL_1 = "company_bookmark.bookmark_url IS NULL";
	private static final String _FINDER_COLUMN_BOOKMARKURL_BOOKMARK_URL_2 = "company_bookmark.bookmark_url = ?";
	private static final String _FINDER_COLUMN_BOOKMARKURL_BOOKMARK_URL_3 = "(company_bookmark.bookmark_url IS NULL OR company_bookmark.bookmark_url = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BOOKMARTITLE =
		new FinderPath(company_bookmarkModelImpl.ENTITY_CACHE_ENABLED,
			company_bookmarkModelImpl.FINDER_CACHE_ENABLED,
			company_bookmarkImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBybookmarTitle",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKMARTITLE =
		new FinderPath(company_bookmarkModelImpl.ENTITY_CACHE_ENABLED,
			company_bookmarkModelImpl.FINDER_CACHE_ENABLED,
			company_bookmarkImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBybookmarTitle",
			new String[] { String.class.getName() },
			company_bookmarkModelImpl.BOOKMARK_TITLE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_BOOKMARTITLE = new FinderPath(company_bookmarkModelImpl.ENTITY_CACHE_ENABLED,
			company_bookmarkModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBybookmarTitle",
			new String[] { String.class.getName() });

	/**
	 * Returns all the company_bookmarks where bookmark_title = &#63;.
	 *
	 * @param bookmark_title the bookmark_title
	 * @return the matching company_bookmarks
	 */
	@Override
	public List<company_bookmark> findBybookmarTitle(String bookmark_title) {
		return findBybookmarTitle(bookmark_title, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<company_bookmark> findBybookmarTitle(String bookmark_title,
		int start, int end) {
		return findBybookmarTitle(bookmark_title, start, end, null);
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
	@Override
	public List<company_bookmark> findBybookmarTitle(String bookmark_title,
		int start, int end,
		OrderByComparator<company_bookmark> orderByComparator) {
		return findBybookmarTitle(bookmark_title, start, end,
			orderByComparator, true);
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
	@Override
	public List<company_bookmark> findBybookmarTitle(String bookmark_title,
		int start, int end,
		OrderByComparator<company_bookmark> orderByComparator,
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

		List<company_bookmark> list = null;

		if (retrieveFromCache) {
			list = (List<company_bookmark>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (company_bookmark company_bookmark : list) {
					if (!Objects.equals(bookmark_title,
								company_bookmark.getBookmark_title())) {
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

			query.append(_SQL_SELECT_COMPANY_BOOKMARK_WHERE);

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
				query.append(company_bookmarkModelImpl.ORDER_BY_JPQL);
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
					list = (List<company_bookmark>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<company_bookmark>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first company_bookmark in the ordered set where bookmark_title = &#63;.
	 *
	 * @param bookmark_title the bookmark_title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching company_bookmark
	 * @throws NoSuchcompany_bookmarkException if a matching company_bookmark could not be found
	 */
	@Override
	public company_bookmark findBybookmarTitle_First(String bookmark_title,
		OrderByComparator<company_bookmark> orderByComparator)
		throws NoSuchcompany_bookmarkException {
		company_bookmark company_bookmark = fetchBybookmarTitle_First(bookmark_title,
				orderByComparator);

		if (company_bookmark != null) {
			return company_bookmark;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("bookmark_title=");
		msg.append(bookmark_title);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchcompany_bookmarkException(msg.toString());
	}

	/**
	 * Returns the first company_bookmark in the ordered set where bookmark_title = &#63;.
	 *
	 * @param bookmark_title the bookmark_title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching company_bookmark, or <code>null</code> if a matching company_bookmark could not be found
	 */
	@Override
	public company_bookmark fetchBybookmarTitle_First(String bookmark_title,
		OrderByComparator<company_bookmark> orderByComparator) {
		List<company_bookmark> list = findBybookmarTitle(bookmark_title, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last company_bookmark in the ordered set where bookmark_title = &#63;.
	 *
	 * @param bookmark_title the bookmark_title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching company_bookmark
	 * @throws NoSuchcompany_bookmarkException if a matching company_bookmark could not be found
	 */
	@Override
	public company_bookmark findBybookmarTitle_Last(String bookmark_title,
		OrderByComparator<company_bookmark> orderByComparator)
		throws NoSuchcompany_bookmarkException {
		company_bookmark company_bookmark = fetchBybookmarTitle_Last(bookmark_title,
				orderByComparator);

		if (company_bookmark != null) {
			return company_bookmark;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("bookmark_title=");
		msg.append(bookmark_title);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchcompany_bookmarkException(msg.toString());
	}

	/**
	 * Returns the last company_bookmark in the ordered set where bookmark_title = &#63;.
	 *
	 * @param bookmark_title the bookmark_title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching company_bookmark, or <code>null</code> if a matching company_bookmark could not be found
	 */
	@Override
	public company_bookmark fetchBybookmarTitle_Last(String bookmark_title,
		OrderByComparator<company_bookmark> orderByComparator) {
		int count = countBybookmarTitle(bookmark_title);

		if (count == 0) {
			return null;
		}

		List<company_bookmark> list = findBybookmarTitle(bookmark_title,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public company_bookmark[] findBybookmarTitle_PrevAndNext(
		String bookmark_id, String bookmark_title,
		OrderByComparator<company_bookmark> orderByComparator)
		throws NoSuchcompany_bookmarkException {
		company_bookmark company_bookmark = findByPrimaryKey(bookmark_id);

		Session session = null;

		try {
			session = openSession();

			company_bookmark[] array = new company_bookmarkImpl[3];

			array[0] = getBybookmarTitle_PrevAndNext(session, company_bookmark,
					bookmark_title, orderByComparator, true);

			array[1] = company_bookmark;

			array[2] = getBybookmarTitle_PrevAndNext(session, company_bookmark,
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

	protected company_bookmark getBybookmarTitle_PrevAndNext(Session session,
		company_bookmark company_bookmark, String bookmark_title,
		OrderByComparator<company_bookmark> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_COMPANY_BOOKMARK_WHERE);

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
			query.append(company_bookmarkModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(company_bookmark);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<company_bookmark> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the company_bookmarks where bookmark_title = &#63; from the database.
	 *
	 * @param bookmark_title the bookmark_title
	 */
	@Override
	public void removeBybookmarTitle(String bookmark_title) {
		for (company_bookmark company_bookmark : findBybookmarTitle(
				bookmark_title, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(company_bookmark);
		}
	}

	/**
	 * Returns the number of company_bookmarks where bookmark_title = &#63;.
	 *
	 * @param bookmark_title the bookmark_title
	 * @return the number of matching company_bookmarks
	 */
	@Override
	public int countBybookmarTitle(String bookmark_title) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_BOOKMARTITLE;

		Object[] finderArgs = new Object[] { bookmark_title };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_COMPANY_BOOKMARK_WHERE);

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

	private static final String _FINDER_COLUMN_BOOKMARTITLE_BOOKMARK_TITLE_1 = "company_bookmark.bookmark_title IS NULL";
	private static final String _FINDER_COLUMN_BOOKMARTITLE_BOOKMARK_TITLE_2 = "company_bookmark.bookmark_title = ?";
	private static final String _FINDER_COLUMN_BOOKMARTITLE_BOOKMARK_TITLE_3 = "(company_bookmark.bookmark_title IS NULL OR company_bookmark.bookmark_title = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BOOKMARUSERID =
		new FinderPath(company_bookmarkModelImpl.ENTITY_CACHE_ENABLED,
			company_bookmarkModelImpl.FINDER_CACHE_ENABLED,
			company_bookmarkImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBybookmarUserId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKMARUSERID =
		new FinderPath(company_bookmarkModelImpl.ENTITY_CACHE_ENABLED,
			company_bookmarkModelImpl.FINDER_CACHE_ENABLED,
			company_bookmarkImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBybookmarUserId",
			new String[] { Long.class.getName() },
			company_bookmarkModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_BOOKMARUSERID = new FinderPath(company_bookmarkModelImpl.ENTITY_CACHE_ENABLED,
			company_bookmarkModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBybookmarUserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the company_bookmarks where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching company_bookmarks
	 */
	@Override
	public List<company_bookmark> findBybookmarUserId(Long userId) {
		return findBybookmarUserId(userId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<company_bookmark> findBybookmarUserId(Long userId, int start,
		int end) {
		return findBybookmarUserId(userId, start, end, null);
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
	@Override
	public List<company_bookmark> findBybookmarUserId(Long userId, int start,
		int end, OrderByComparator<company_bookmark> orderByComparator) {
		return findBybookmarUserId(userId, start, end, orderByComparator, true);
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
	@Override
	public List<company_bookmark> findBybookmarUserId(Long userId, int start,
		int end, OrderByComparator<company_bookmark> orderByComparator,
		boolean retrieveFromCache) {
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

		List<company_bookmark> list = null;

		if (retrieveFromCache) {
			list = (List<company_bookmark>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (company_bookmark company_bookmark : list) {
					if (!Objects.equals(userId, company_bookmark.getUserId())) {
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

			query.append(_SQL_SELECT_COMPANY_BOOKMARK_WHERE);

			query.append(_FINDER_COLUMN_BOOKMARUSERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(company_bookmarkModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId.longValue());

				if (!pagination) {
					list = (List<company_bookmark>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<company_bookmark>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first company_bookmark in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching company_bookmark
	 * @throws NoSuchcompany_bookmarkException if a matching company_bookmark could not be found
	 */
	@Override
	public company_bookmark findBybookmarUserId_First(Long userId,
		OrderByComparator<company_bookmark> orderByComparator)
		throws NoSuchcompany_bookmarkException {
		company_bookmark company_bookmark = fetchBybookmarUserId_First(userId,
				orderByComparator);

		if (company_bookmark != null) {
			return company_bookmark;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchcompany_bookmarkException(msg.toString());
	}

	/**
	 * Returns the first company_bookmark in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching company_bookmark, or <code>null</code> if a matching company_bookmark could not be found
	 */
	@Override
	public company_bookmark fetchBybookmarUserId_First(Long userId,
		OrderByComparator<company_bookmark> orderByComparator) {
		List<company_bookmark> list = findBybookmarUserId(userId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last company_bookmark in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching company_bookmark
	 * @throws NoSuchcompany_bookmarkException if a matching company_bookmark could not be found
	 */
	@Override
	public company_bookmark findBybookmarUserId_Last(Long userId,
		OrderByComparator<company_bookmark> orderByComparator)
		throws NoSuchcompany_bookmarkException {
		company_bookmark company_bookmark = fetchBybookmarUserId_Last(userId,
				orderByComparator);

		if (company_bookmark != null) {
			return company_bookmark;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchcompany_bookmarkException(msg.toString());
	}

	/**
	 * Returns the last company_bookmark in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching company_bookmark, or <code>null</code> if a matching company_bookmark could not be found
	 */
	@Override
	public company_bookmark fetchBybookmarUserId_Last(Long userId,
		OrderByComparator<company_bookmark> orderByComparator) {
		int count = countBybookmarUserId(userId);

		if (count == 0) {
			return null;
		}

		List<company_bookmark> list = findBybookmarUserId(userId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public company_bookmark[] findBybookmarUserId_PrevAndNext(
		String bookmark_id, Long userId,
		OrderByComparator<company_bookmark> orderByComparator)
		throws NoSuchcompany_bookmarkException {
		company_bookmark company_bookmark = findByPrimaryKey(bookmark_id);

		Session session = null;

		try {
			session = openSession();

			company_bookmark[] array = new company_bookmarkImpl[3];

			array[0] = getBybookmarUserId_PrevAndNext(session,
					company_bookmark, userId, orderByComparator, true);

			array[1] = company_bookmark;

			array[2] = getBybookmarUserId_PrevAndNext(session,
					company_bookmark, userId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected company_bookmark getBybookmarUserId_PrevAndNext(Session session,
		company_bookmark company_bookmark, Long userId,
		OrderByComparator<company_bookmark> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_COMPANY_BOOKMARK_WHERE);

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
			query.append(company_bookmarkModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId.longValue());

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(company_bookmark);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<company_bookmark> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the company_bookmarks where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	@Override
	public void removeBybookmarUserId(Long userId) {
		for (company_bookmark company_bookmark : findBybookmarUserId(userId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(company_bookmark);
		}
	}

	/**
	 * Returns the number of company_bookmarks where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching company_bookmarks
	 */
	@Override
	public int countBybookmarUserId(Long userId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_BOOKMARUSERID;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_COMPANY_BOOKMARK_WHERE);

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

	private static final String _FINDER_COLUMN_BOOKMARUSERID_USERID_2 = "company_bookmark.userId = ?";

	public company_bookmarkPersistenceImpl() {
		setModelClass(company_bookmark.class);
	}

	/**
	 * Caches the company_bookmark in the entity cache if it is enabled.
	 *
	 * @param company_bookmark the company_bookmark
	 */
	@Override
	public void cacheResult(company_bookmark company_bookmark) {
		entityCache.putResult(company_bookmarkModelImpl.ENTITY_CACHE_ENABLED,
			company_bookmarkImpl.class, company_bookmark.getPrimaryKey(),
			company_bookmark);

		company_bookmark.resetOriginalValues();
	}

	/**
	 * Caches the company_bookmarks in the entity cache if it is enabled.
	 *
	 * @param company_bookmarks the company_bookmarks
	 */
	@Override
	public void cacheResult(List<company_bookmark> company_bookmarks) {
		for (company_bookmark company_bookmark : company_bookmarks) {
			if (entityCache.getResult(
						company_bookmarkModelImpl.ENTITY_CACHE_ENABLED,
						company_bookmarkImpl.class,
						company_bookmark.getPrimaryKey()) == null) {
				cacheResult(company_bookmark);
			}
			else {
				company_bookmark.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all company_bookmarks.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(company_bookmarkImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the company_bookmark.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(company_bookmark company_bookmark) {
		entityCache.removeResult(company_bookmarkModelImpl.ENTITY_CACHE_ENABLED,
			company_bookmarkImpl.class, company_bookmark.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<company_bookmark> company_bookmarks) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (company_bookmark company_bookmark : company_bookmarks) {
			entityCache.removeResult(company_bookmarkModelImpl.ENTITY_CACHE_ENABLED,
				company_bookmarkImpl.class, company_bookmark.getPrimaryKey());
		}
	}

	/**
	 * Creates a new company_bookmark with the primary key. Does not add the company_bookmark to the database.
	 *
	 * @param bookmark_id the primary key for the new company_bookmark
	 * @return the new company_bookmark
	 */
	@Override
	public company_bookmark create(String bookmark_id) {
		company_bookmark company_bookmark = new company_bookmarkImpl();

		company_bookmark.setNew(true);
		company_bookmark.setPrimaryKey(bookmark_id);

		company_bookmark.setCompanyId(companyProvider.getCompanyId());

		return company_bookmark;
	}

	/**
	 * Removes the company_bookmark with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bookmark_id the primary key of the company_bookmark
	 * @return the company_bookmark that was removed
	 * @throws NoSuchcompany_bookmarkException if a company_bookmark with the primary key could not be found
	 */
	@Override
	public company_bookmark remove(String bookmark_id)
		throws NoSuchcompany_bookmarkException {
		return remove((Serializable)bookmark_id);
	}

	/**
	 * Removes the company_bookmark with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the company_bookmark
	 * @return the company_bookmark that was removed
	 * @throws NoSuchcompany_bookmarkException if a company_bookmark with the primary key could not be found
	 */
	@Override
	public company_bookmark remove(Serializable primaryKey)
		throws NoSuchcompany_bookmarkException {
		Session session = null;

		try {
			session = openSession();

			company_bookmark company_bookmark = (company_bookmark)session.get(company_bookmarkImpl.class,
					primaryKey);

			if (company_bookmark == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchcompany_bookmarkException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(company_bookmark);
		}
		catch (NoSuchcompany_bookmarkException nsee) {
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
	protected company_bookmark removeImpl(company_bookmark company_bookmark) {
		company_bookmark = toUnwrappedModel(company_bookmark);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(company_bookmark)) {
				company_bookmark = (company_bookmark)session.get(company_bookmarkImpl.class,
						company_bookmark.getPrimaryKeyObj());
			}

			if (company_bookmark != null) {
				session.delete(company_bookmark);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (company_bookmark != null) {
			clearCache(company_bookmark);
		}

		return company_bookmark;
	}

	@Override
	public company_bookmark updateImpl(company_bookmark company_bookmark) {
		company_bookmark = toUnwrappedModel(company_bookmark);

		boolean isNew = company_bookmark.isNew();

		company_bookmarkModelImpl company_bookmarkModelImpl = (company_bookmarkModelImpl)company_bookmark;

		Session session = null;

		try {
			session = openSession();

			if (company_bookmark.isNew()) {
				session.save(company_bookmark);

				company_bookmark.setNew(false);
			}
			else {
				company_bookmark = (company_bookmark)session.merge(company_bookmark);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !company_bookmarkModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((company_bookmarkModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKMARKID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						company_bookmarkModelImpl.getOriginalBookmark_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_BOOKMARKID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKMARKID,
					args);

				args = new Object[] { company_bookmarkModelImpl.getBookmark_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_BOOKMARKID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKMARKID,
					args);
			}

			if ((company_bookmarkModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKMARKURL.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						company_bookmarkModelImpl.getOriginalBookmark_url()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_BOOKMARKURL, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKMARKURL,
					args);

				args = new Object[] { company_bookmarkModelImpl.getBookmark_url() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_BOOKMARKURL, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKMARKURL,
					args);
			}

			if ((company_bookmarkModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKMARTITLE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						company_bookmarkModelImpl.getOriginalBookmark_title()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_BOOKMARTITLE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKMARTITLE,
					args);

				args = new Object[] {
						company_bookmarkModelImpl.getBookmark_title()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_BOOKMARTITLE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKMARTITLE,
					args);
			}

			if ((company_bookmarkModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKMARUSERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						company_bookmarkModelImpl.getOriginalUserId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_BOOKMARUSERID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKMARUSERID,
					args);

				args = new Object[] { company_bookmarkModelImpl.getUserId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_BOOKMARUSERID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKMARUSERID,
					args);
			}
		}

		entityCache.putResult(company_bookmarkModelImpl.ENTITY_CACHE_ENABLED,
			company_bookmarkImpl.class, company_bookmark.getPrimaryKey(),
			company_bookmark, false);

		company_bookmark.resetOriginalValues();

		return company_bookmark;
	}

	protected company_bookmark toUnwrappedModel(
		company_bookmark company_bookmark) {
		if (company_bookmark instanceof company_bookmarkImpl) {
			return company_bookmark;
		}

		company_bookmarkImpl company_bookmarkImpl = new company_bookmarkImpl();

		company_bookmarkImpl.setNew(company_bookmark.isNew());
		company_bookmarkImpl.setPrimaryKey(company_bookmark.getPrimaryKey());

		company_bookmarkImpl.setCompanyId(company_bookmark.getCompanyId());
		company_bookmarkImpl.setGroupId(company_bookmark.getGroupId());
		company_bookmarkImpl.setBookmark_id(company_bookmark.getBookmark_id());
		company_bookmarkImpl.setBookmark_url(company_bookmark.getBookmark_url());
		company_bookmarkImpl.setBookmark_title(company_bookmark.getBookmark_title());
		company_bookmarkImpl.setUserId(company_bookmark.getUserId());
		company_bookmarkImpl.setContent(company_bookmark.getContent());
		company_bookmarkImpl.setCreate_date(company_bookmark.getCreate_date());
		company_bookmarkImpl.setUpdate_date(company_bookmark.getUpdate_date());
		company_bookmarkImpl.setIs_delete(company_bookmark.getIs_delete());

		return company_bookmarkImpl;
	}

	/**
	 * Returns the company_bookmark with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the company_bookmark
	 * @return the company_bookmark
	 * @throws NoSuchcompany_bookmarkException if a company_bookmark with the primary key could not be found
	 */
	@Override
	public company_bookmark findByPrimaryKey(Serializable primaryKey)
		throws NoSuchcompany_bookmarkException {
		company_bookmark company_bookmark = fetchByPrimaryKey(primaryKey);

		if (company_bookmark == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchcompany_bookmarkException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return company_bookmark;
	}

	/**
	 * Returns the company_bookmark with the primary key or throws a {@link NoSuchcompany_bookmarkException} if it could not be found.
	 *
	 * @param bookmark_id the primary key of the company_bookmark
	 * @return the company_bookmark
	 * @throws NoSuchcompany_bookmarkException if a company_bookmark with the primary key could not be found
	 */
	@Override
	public company_bookmark findByPrimaryKey(String bookmark_id)
		throws NoSuchcompany_bookmarkException {
		return findByPrimaryKey((Serializable)bookmark_id);
	}

	/**
	 * Returns the company_bookmark with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the company_bookmark
	 * @return the company_bookmark, or <code>null</code> if a company_bookmark with the primary key could not be found
	 */
	@Override
	public company_bookmark fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(company_bookmarkModelImpl.ENTITY_CACHE_ENABLED,
				company_bookmarkImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		company_bookmark company_bookmark = (company_bookmark)serializable;

		if (company_bookmark == null) {
			Session session = null;

			try {
				session = openSession();

				company_bookmark = (company_bookmark)session.get(company_bookmarkImpl.class,
						primaryKey);

				if (company_bookmark != null) {
					cacheResult(company_bookmark);
				}
				else {
					entityCache.putResult(company_bookmarkModelImpl.ENTITY_CACHE_ENABLED,
						company_bookmarkImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(company_bookmarkModelImpl.ENTITY_CACHE_ENABLED,
					company_bookmarkImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return company_bookmark;
	}

	/**
	 * Returns the company_bookmark with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bookmark_id the primary key of the company_bookmark
	 * @return the company_bookmark, or <code>null</code> if a company_bookmark with the primary key could not be found
	 */
	@Override
	public company_bookmark fetchByPrimaryKey(String bookmark_id) {
		return fetchByPrimaryKey((Serializable)bookmark_id);
	}

	@Override
	public Map<Serializable, company_bookmark> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, company_bookmark> map = new HashMap<Serializable, company_bookmark>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			company_bookmark company_bookmark = fetchByPrimaryKey(primaryKey);

			if (company_bookmark != null) {
				map.put(primaryKey, company_bookmark);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(company_bookmarkModelImpl.ENTITY_CACHE_ENABLED,
					company_bookmarkImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (company_bookmark)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 4) +
				1);

		query.append(_SQL_SELECT_COMPANY_BOOKMARK_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(StringPool.APOSTROPHE);
			query.append((String)primaryKey);
			query.append(StringPool.APOSTROPHE);

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (company_bookmark company_bookmark : (List<company_bookmark>)q.list()) {
				map.put(company_bookmark.getPrimaryKeyObj(), company_bookmark);

				cacheResult(company_bookmark);

				uncachedPrimaryKeys.remove(company_bookmark.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(company_bookmarkModelImpl.ENTITY_CACHE_ENABLED,
					company_bookmarkImpl.class, primaryKey, nullModel);
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
	 * Returns all the company_bookmarks.
	 *
	 * @return the company_bookmarks
	 */
	@Override
	public List<company_bookmark> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<company_bookmark> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<company_bookmark> findAll(int start, int end,
		OrderByComparator<company_bookmark> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<company_bookmark> findAll(int start, int end,
		OrderByComparator<company_bookmark> orderByComparator,
		boolean retrieveFromCache) {
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

		List<company_bookmark> list = null;

		if (retrieveFromCache) {
			list = (List<company_bookmark>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_COMPANY_BOOKMARK);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_COMPANY_BOOKMARK;

				if (pagination) {
					sql = sql.concat(company_bookmarkModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<company_bookmark>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<company_bookmark>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the company_bookmarks from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (company_bookmark company_bookmark : findAll()) {
			remove(company_bookmark);
		}
	}

	/**
	 * Returns the number of company_bookmarks.
	 *
	 * @return the number of company_bookmarks
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_COMPANY_BOOKMARK);

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
		return company_bookmarkModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the company_bookmark persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(company_bookmarkImpl.class.getName());
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
	private static final String _SQL_SELECT_COMPANY_BOOKMARK = "SELECT company_bookmark FROM company_bookmark company_bookmark";
	private static final String _SQL_SELECT_COMPANY_BOOKMARK_WHERE_PKS_IN = "SELECT company_bookmark FROM company_bookmark company_bookmark WHERE bookmark_id IN (";
	private static final String _SQL_SELECT_COMPANY_BOOKMARK_WHERE = "SELECT company_bookmark FROM company_bookmark company_bookmark WHERE ";
	private static final String _SQL_COUNT_COMPANY_BOOKMARK = "SELECT COUNT(company_bookmark) FROM company_bookmark company_bookmark";
	private static final String _SQL_COUNT_COMPANY_BOOKMARK_WHERE = "SELECT COUNT(company_bookmark) FROM company_bookmark company_bookmark WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "company_bookmark.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No company_bookmark exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No company_bookmark exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(company_bookmarkPersistenceImpl.class);
}