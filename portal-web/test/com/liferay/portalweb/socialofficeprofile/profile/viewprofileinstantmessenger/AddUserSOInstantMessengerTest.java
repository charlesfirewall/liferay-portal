/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package com.liferay.portalweb.socialofficeprofile.profile.viewprofileinstantmessenger;

import com.liferay.portalweb.portal.BaseTestCase;
import com.liferay.portalweb.portal.util.RuntimeVariables;

/**
 * @author Brian Wing Shun Chan
 */
public class AddUserSOInstantMessengerTest extends BaseTestCase {
	public void testAddUserSOInstantMessenger() throws Exception {
		selenium.selectWindow("null");
		selenium.selectFrame("relative=top");
		selenium.open("/web/guest/home/");
		selenium.waitForElementPresent("link=Control Panel");
		selenium.clickAt("link=Control Panel",
			RuntimeVariables.replace("Control Panel"));
		selenium.waitForPageToLoad("30000");
		selenium.clickAt("link=Users and Organizations",
			RuntimeVariables.replace("Users and Organizations"));
		selenium.waitForPageToLoad("30000");
		selenium.clickAt("link=Search All Users",
			RuntimeVariables.replace("Search All Users"));
		selenium.waitForPageToLoad("30000");
		selenium.type("//input[@id='_125_toggle_id_users_admin_user_searchkeywords']",
			RuntimeVariables.replace("socialoffice01"));
		selenium.clickAt("//input[@value='Search']",
			RuntimeVariables.replace("Search"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace("Social01"),
			selenium.getText("//a[contains(.,'Social01')]"));
		selenium.clickAt("//a[contains(.,'Social01')]",
			RuntimeVariables.replace("Social01"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace("Social01 Office01 User01"),
			selenium.getText("//div[2]/h1/span"));
		selenium.waitForVisible("//a[@id='_125_instantMessengerLink']");
		assertTrue(selenium.isPartialText(
				"//a[@id='_125_instantMessengerLink']", "Instant Messenger"));
		selenium.clickAt("//a[@id='_125_instantMessengerLink']",
			RuntimeVariables.replace("Instant Messenger"));
		selenium.waitForVisible("//input[@id='_125_aimSn']");
		selenium.type("//input[@id='_125_aimSn']",
			RuntimeVariables.replace("socialofficesn"));
		selenium.type("//input[@id='_125_icqSn']",
			RuntimeVariables.replace("socialofficesn"));
		selenium.type("//input[@id='_125_jabberSn']",
			RuntimeVariables.replace("socialofficesn"));
		selenium.type("//input[@id='_125_msnSn']",
			RuntimeVariables.replace("socialofficesn"));
		selenium.type("//input[@id='_125_skypeSn']",
			RuntimeVariables.replace("socialofficesn"));
		selenium.type("//input[@id='_125_ymSn']",
			RuntimeVariables.replace("socialofficesn"));
		selenium.clickAt("//input[@value='Save']",
			RuntimeVariables.replace("Save"));
		selenium.waitForPageToLoad("30000");
		selenium.waitForVisible("//div[@class='portlet-msg-success']");
		assertEquals(RuntimeVariables.replace(
				"Your request completed successfully."),
			selenium.getText("//div[@class='portlet-msg-success']"));
		assertEquals("socialofficesn",
			selenium.getValue("//input[@id='_125_aimSn']"));
		assertEquals("socialofficesn",
			selenium.getValue("//input[@id='_125_icqSn']"));
		assertEquals("socialofficesn",
			selenium.getValue("//input[@id='_125_jabberSn']"));
		assertEquals("socialofficesn",
			selenium.getValue("//input[@id='_125_msnSn']"));
		assertEquals("socialofficesn",
			selenium.getValue("//input[@id='_125_skypeSn']"));
		assertEquals("socialofficesn",
			selenium.getValue("//input[@id='_125_ymSn']"));
	}
}