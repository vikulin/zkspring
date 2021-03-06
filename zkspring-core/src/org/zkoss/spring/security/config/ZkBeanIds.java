/* ZkBeanIds.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		Oct 6, 2008 12:39:15 PM, Created by henrichen
}}IS_NOTE

Copyright (C) 2008 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under GPL Version 2.0 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/
package org.zkoss.spring.security.config;

/**
 * Contains all the default Bean IDs created by the namespace support in ZK Spring Security 2.
 * <p>
 * These are mainly intended for internal use.
 * @author henrichen
 * @since 1.0
 */
public abstract class ZkBeanIds {
	//security
	public static final String ZK_DISABLE_SESSION_INVALIDATE_FILTER = "zkDisableSessionInvalidateFilter";
	public static final String ZK_ENABLE_SESSION_INVALIDATE_FILTER = "zkEnableSessionInvalidateFilter";
	public static final String ZK_LOGIN_OK_FILTER = "zkLoginOKFilter";
	public static final String ZK_ERROR_403_FILTER = "zkError403Filter";
	public static final String ZK_EXCEPTION_TRANSLATION_FILTER = "zkExceptionTranslationFilter";
	public static final String ZK_AUTHENTICATION_ENTRY_POINT = "zkAuthenticationEntryPoint";
	public static final String ZK_ACCESS_DENIED_HANDLER = "zkAccessDeniedHandler";
	public static final String ZK_EVENT_PROCESS_INTERCEPTOR = "zkEventProcessInterceptor";
	public static final String ZK_DESKTOP_REUSE_FILTER = "zkDesktopReuseFilter";
	
	//webflow
	public static final String ZK_CONVERSION_SERVICE = "zkConversionService";
	public static final String ZK_EXPRESSION_PARSER = "zkExpressionParser";
	public static final String ZK_FLOW_VIEW_FACTORY_CREATOR = "zkFlowViewFactoryCreator";
	public static final String ZK_FLOW_RESOURCE_VIEW_RESOLVER = "zkFlowResourceViewResolver";
	public static final String ZK_FLOW_HANDLER_ADAPTER = "zkFlowHandlerAdapter";
	public static final String ZK_FLOW_URL_HANDLER = "zkFlowUrlHandler";
	public static final String ZK_AJAX_HANDLER = "zkAjaxHandler";
	
	//zk-config
	public static final String ZK_SCOPE_CONFIG = "zkScopeConfig";
	public static final String ZK_TYPE_PROPERTY_EDITOR = "zkTypePropertyEditor";
	public static final String ZK_BINDING_COMPOSER = "zkBindingComposer";
}
