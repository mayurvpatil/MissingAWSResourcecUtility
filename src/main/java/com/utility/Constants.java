package com.utility;

public interface Constants {
	public static final String CONTENT_TYPE_TEXT_HTML = "text/html";
	
	//Default mail subject
	public static final String DEFAULT_MAIL_SUBJECT = "Environment information";
	
	//Packages start
	public static final String COMMON_PACKAGE_CHEF_CONFIGURATION="chef_configuration";
	public static final String COMMON_PACKAGE_EXECUTE_SCRIPT = "execute-script";
	public static final String COMMON_PACKAGE_FILE = "file";
	public static final String COMMON_PACKAGE_LOCAL_EXEC = "local-exec";
	public static final String AWSPEC = "awspec";
	//Packages end
	
	//Resources start
	public static final String RESOURCE_AWS_INSTANCE = "aws_instance";
	
	
	public static final String RESOURCE_ATTR_INSTANCE_TYPE = "instance_type";
	//Resources end
	
	
	public static final String ANSIBLE_PACKAGES_DIR = "ansible-packages";
	public static final String ANSIBLE_PACKAGE_FILE_NAME = "packages.json";
	
	public static final String VALIDATION_PACKAGES_DIR = "validation-packages";
	
	// Constants used for rbac
	
	public static final String OPERATION_OBJECT_DELIM = "_";
	
	public static final String COPY_PARENT_NAME_PREFIX = "CopyOf";
	
	public static final String TAG_ATTR_NAME = "Name";
	public static final String TAG_ATTR_REFID = "refId";
	public static final String TAG_ATTR_OWNER = "Owner";
	public static final String TAG_ATTR_CREATEDBY = "CreatedBy";
	public static final String DEPLOYNOW = "REAN Deploy";
	public static final String DEFAULT_TAG_NAME = "<Username>";
	public static final String DEFAULT_TAG_OWNER = "<Deployment Owner>";
	public static final String TERRAFORM_VERSION = "v0.7.13";
	public static final String REAN_HELP_SITE_URL= "https://reandeploy-help.reancloud.com";
	public static final String PACKAGE_VERSION_LATEST="Latest";
	
	public static final String DEFAULT_ROLE_VERSION="r1.0";
	public static final String DEFAULT_DEPRECATED_MSG="This attribute is DEPRECATED";
	
}
