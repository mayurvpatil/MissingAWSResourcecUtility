package com.utility;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.utility.Constants;

public class DNResourceAttr {
	private String name;
	private String type;
	private boolean required;
	private boolean deprecated;
	private String deprecatedMessage;
	private String defaultValue;
	private JsonNode defaultJson;
	private List<Object> possibleValues;
	private boolean secure;
	private Object sampleValue;
	private String displayCondition;

	public JsonNode getDefaultJson() {
		return defaultJson;
	}

	public void setDefaultJson(JsonNode defaultJson) {
		this.defaultJson = defaultJson;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	public boolean isDeprecated() {
		return deprecated;
	}

	public void setDeprecated(boolean deprecated) {
		this.deprecated = deprecated;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public List<Object> getPossibleValues() {
		return possibleValues;
	}

	public void setPossibleValues(List<Object> possibleValues) {
		this.possibleValues = possibleValues;
	}

	public boolean isSecure() {
		return secure;
	}

	public void setSecure(boolean secure) {
		this.secure = secure;
	}

	public Object getSampleValue() {
		return sampleValue;
	}

	public void setSampleValue(Object sampleValue) {
		this.sampleValue = sampleValue;
	}

	public String getDisplayCondition() {
		return displayCondition;
	}

	public void setDisplayCondition(String displayCondition) {
		this.displayCondition = displayCondition;
	}

	public String getDeprecatedMessage() {
		if(isDeprecated() && deprecatedMessage == null)
			return Constants.DEFAULT_DEPRECATED_MSG;
		return deprecatedMessage;
	}

	public void setDeprecatedMessage(String deprecatedMessage) {
		this.deprecatedMessage = deprecatedMessage;
	}
}
