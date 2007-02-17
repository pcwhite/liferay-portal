/**
 * Copyright (c) 2000-2007 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portal.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="PluginSettingSoap.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public class PluginSettingSoap implements Serializable {
	public static PluginSettingSoap toSoapModel(PluginSetting model) {
		PluginSettingSoap soapModel = new PluginSettingSoap();
		soapModel.setPluginSettingId(model.getPluginSettingId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setPluginId(model.getPluginId());
		soapModel.setPluginType(model.getPluginType());
		soapModel.setRoles(model.getRoles());
		soapModel.setActive(model.getActive());

		return soapModel;
	}

	public static PluginSettingSoap[] toSoapModels(List models) {
		List soapModels = new ArrayList(models.size());

		for (int i = 0; i < models.size(); i++) {
			PluginSetting model = (PluginSetting)models.get(i);
			soapModels.add(toSoapModel(model));
		}

		return (PluginSettingSoap[])soapModels.toArray(new PluginSettingSoap[0]);
	}

	public PluginSettingSoap() {
	}

	public long getPrimaryKey() {
		return _pluginSettingId;
	}

	public void setPrimaryKey(long pk) {
		setPluginSettingId(pk);
	}

	public long getPluginSettingId() {
		return _pluginSettingId;
	}

	public void setPluginSettingId(long pluginSettingId) {
		_pluginSettingId = pluginSettingId;
	}

	public String getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(String companyId) {
		_companyId = companyId;
	}

	public String getPluginId() {
		return _pluginId;
	}

	public void setPluginId(String pluginId) {
		_pluginId = pluginId;
	}

	public String getPluginType() {
		return _pluginType;
	}

	public void setPluginType(String pluginType) {
		_pluginType = pluginType;
	}

	public String getRoles() {
		return _roles;
	}

	public void setRoles(String roles) {
		_roles = roles;
	}

	public boolean getActive() {
		return _active;
	}

	public boolean isActive() {
		return _active;
	}

	public void setActive(boolean active) {
		_active = active;
	}

	private long _pluginSettingId;
	private String _companyId;
	private String _pluginId;
	private String _pluginType;
	private String _roles;
	private boolean _active;
}