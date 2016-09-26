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
 * The extended model interface for the company_bookmark service. Represents a row in the &quot;active_company_bookmark&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see company_bookmarkModel
 * @see active.portal.model.impl.company_bookmarkImpl
 * @see active.portal.model.impl.company_bookmarkModelImpl
 * @generated
 */
@ImplementationClassName("active.portal.model.impl.company_bookmarkImpl")
@ProviderType
public interface company_bookmark extends company_bookmarkModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link active.portal.model.impl.company_bookmarkImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<company_bookmark, String> BOOKMARK_ID_ACCESSOR = new Accessor<company_bookmark, String>() {
			@Override
			public String get(company_bookmark company_bookmark) {
				return company_bookmark.getBookmark_id();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<company_bookmark> getTypeClass() {
				return company_bookmark.class;
			}
		};
}