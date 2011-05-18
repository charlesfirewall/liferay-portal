/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

package com.liferay.portlet.dynamicdatalists.service;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the d d l record remote service. This utility wraps {@link com.liferay.portlet.dynamicdatalists.service.impl.DDLRecordServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DDLRecordService
 * @see com.liferay.portlet.dynamicdatalists.service.base.DDLRecordServiceBaseImpl
 * @see com.liferay.portlet.dynamicdatalists.service.impl.DDLRecordServiceImpl
 * @generated
 */
public class DDLRecordServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.portlet.dynamicdatalists.service.impl.DDLRecordServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portlet.dynamicdatalists.model.DDLRecord addRecord(
		long groupId, long recordSetId,
		com.liferay.portlet.dynamicdatamapping.storage.Fields fields,
		int displayIndex,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addRecord(groupId, recordSetId, fields, displayIndex,
			serviceContext);
	}

	public static com.liferay.portlet.dynamicdatalists.model.DDLRecord addRecord(
		long groupId, long recordSetId,
		java.util.Map<java.lang.String, java.io.Serializable> fieldsMap,
		int displayIndex,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addRecord(groupId, recordSetId, fieldsMap, displayIndex,
			serviceContext);
	}

	public static com.liferay.portlet.dynamicdatalists.model.DDLRecord updateRecord(
		long recordId,
		com.liferay.portlet.dynamicdatamapping.storage.Fields fields,
		int displayIndex, boolean merge,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateRecord(recordId, fields, displayIndex, merge,
			serviceContext);
	}

	public static com.liferay.portlet.dynamicdatalists.model.DDLRecord updateRecord(
		long recordId,
		java.util.Map<java.lang.String, java.io.Serializable> fieldsMap,
		int displayIndex, boolean merge,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateRecord(recordId, fieldsMap, displayIndex, merge,
			serviceContext);
	}

	public static DDLRecordService getService() {
		if (_service == null) {
			_service = (DDLRecordService)PortalBeanLocatorUtil.locate(DDLRecordService.class.getName());

			ReferenceRegistry.registerReference(DDLRecordServiceUtil.class,
				"_service");
			MethodCache.remove(DDLRecordService.class);
		}

		return _service;
	}

	public void setService(DDLRecordService service) {
		MethodCache.remove(DDLRecordService.class);

		_service = service;

		ReferenceRegistry.registerReference(DDLRecordServiceUtil.class,
			"_service");
		MethodCache.remove(DDLRecordService.class);
	}

	private static DDLRecordService _service;
}