package com.utility;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.JsonNode;

@JsonIgnoreProperties(ignoreUnknown=true)
public class DNResource {
	private String name;
	private String resolvedName;
	private DNResourceType resourceType = DNResourceType.RESOURCE;
	private String provider;
	private String displayName;
	private boolean acceptPackages;
	private String idAttribute;
	private List<DNResourceAttr> attributes;
	private String shortName;
	private boolean tagsSupport = true;
	private boolean countSupport = true;
	private boolean importSupport = false;
	private boolean lifecycleSupport = true;
	private boolean dependsOnSupport = true;
	private String image;
	private JsonNode style;
	private Map<String, DNResourceAttr> attrMap = new HashMap<String, DNResourceAttr>();
	private String docUrl;
	private boolean deprecated;

	public String getDocUrl() {
		return docUrl;
	}

	public void setDocUrl(String docUrl) {
		this.docUrl = docUrl;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getResolvedName() {
		return resolvedName;
	}
	
	public void setResolvedName(String resolvedName) {
		this.resolvedName = resolvedName;
	}
	

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public List<DNResourceAttr> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<DNResourceAttr> attributes) {
		this.attributes = attributes;
		if (attributes != null) {
			for (DNResourceAttr dnResourceAttr : attributes) {
				attrMap.put(dnResourceAttr.getName(), dnResourceAttr);
			}
		}
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public boolean isAcceptPackages() {
		return acceptPackages;
	}

	public void setAcceptPackages(boolean acceptPackages) {
		this.acceptPackages = acceptPackages;
	}

	public boolean isDependsOnSupport() {
		return dependsOnSupport;
	}

	public void setDependsOnSupport(boolean dependsOnSupport) {
		this.dependsOnSupport = dependsOnSupport;
	}

	public DNResourceAttr getAttribute(String name) {
		return attrMap.get(name);
	}

	public boolean isTagsSupport() {
		return tagsSupport;
	}

	public void setTagsSupport(boolean tagsSupport) {
		this.tagsSupport = tagsSupport;
	}

	public boolean isCountSupport() {
		return countSupport;
	}

	public void setCountSupport(boolean countSupport) {
		this.countSupport = countSupport;
	}

	public boolean isImportSupport() {
		return importSupport;
	}

	public void setImportSupport(boolean importSupport) {
		this.importSupport = importSupport;
	}

	public boolean isLifecycleSupport() {
		return lifecycleSupport;
	}

	public void setLifecycleSupport(boolean lifecycleSupport) {
		this.lifecycleSupport = lifecycleSupport;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public JsonNode getStyle() {
		return style;
	}

	public void setStyle(JsonNode style) {
		this.style = style;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getIdAttribute() {
		return idAttribute;
	}

	public void setIdAttribute(String idAttribute) {
		this.idAttribute = idAttribute;
	}

	public DNResourceType getResourceType() {
		return resourceType;
	}

	public void setResourceType(DNResourceType resourceType) {
		this.resourceType = resourceType;
	}

	public boolean isDeprecated() {
		return deprecated;
	}

	public void setDeprecated(boolean deprecated) {
		this.deprecated = deprecated;
	}

	
	
	/**
	 * Checks if the given package is compatible with this resource. The awspec
	 * package is compatible with ALL aws resources, by default.
	 *
	 * @param pkg
	 * @return true, if the package can be accepted by this resource.
	 */
	
	/*
	public boolean canAcceptPackage(DNowPackage pkg) {
		return isAcceptPackages() || "local-exec".equals(pkg.getPackageName())
				|| ("aws".equals(getProvider()) && Constants.AWSPEC.equals(pkg.getPackageName()) && idAttribute != null);
	}
	*/
}