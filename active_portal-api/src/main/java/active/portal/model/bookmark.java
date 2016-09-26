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

package active.portal.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the bookmark service. Represents a row in the &quot;active_bookmark&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see bookmarkModel
 * @see active.portal.model.impl.bookmarkImpl
 * @see active.portal.model.impl.bookmarkModelImpl
 * @generated
 */
@ImplementationClassName("active.portal.model.impl.bookmarkImpl")
@ProviderType
public interface bookmark extends bookmarkModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link active.portal.model.impl.bookmarkImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<bookmark, Long> BOOKMARK_ID_ACCESSOR = new Accessor<bookmark, Long>() {
			@Override
			public Long get(bookmark bookmark) {
				return bookmark.getBookmark_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<bookmark> getTypeClass() {
				return bookmark.class;
			}
		};
}