/*
 * Copyright 2005 The JA-SIG Collaborative. All rights reserved. See license
 * distributed with this file and available online at
 * http://www.uportal.org/license.html
 */
package org.jasig.cas.authentication.principal;

import java.io.Serializable;

/**
 * Generic concept of an authenticated thing. Examples include a person or a
 * service.
 * <p>
 * Created by a CredentialsToPrincipalResolver. Wrapped in an Authentication
 * object that becomes part of the TGT. Must be Serializable so the TGT cache
 * can be persisted.
 * </p>
 * <p>
 * The implementation SimplePrincipal just contains the Id property. More
 * complex Principal objects may contain additional information that are
 * meaningful to the View layer but are generally transparent to the rest of
 * CAS.
 * </p>
 * 
 * @author Scott Battaglia
 * @version $Revision$ $Date$
 * @since 3.0
 */
public interface Principal extends Serializable {

    String getId();
}
