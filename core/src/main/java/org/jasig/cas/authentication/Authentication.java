/*
 * Copyright 2005 The JA-SIG Collaborative. All rights reserved. See license
 * distributed with this file and available online at
 * http://www.uportal.org/license.html
 */
package org.jasig.cas.authentication;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import org.jasig.cas.authentication.principal.Principal;

/**
 * The AuthenticationManager returns an Authentication object after successful
 * logon. The Authentication is an argument to TGT construction and remains
 * referenced by the TGT. All implemenations must be Serializable to permit
 * persistence and clustering.
 * <p>
 * This simple Authentication only supports processing where there is one
 * Credential presented to the AuthenticationManager and only one Principal is
 * generated. It must be extended to handle multiple-credential processing to
 * allow combinations of success and failure.
 * </p>
 * 
 * @author Dmitriy Kopylenko
 * @author Scott Battaglia
 * @version $Revision$ $Date$
 * @since 3.0
 * 
 * @see org.jasig.cas.authentication.ImmutableAuthentication
 */
public interface Authentication extends Serializable {

    /**
     * The Principal object returned by the CredentialsToPrincipalResolver.
     * 
     * @return a Principal implementation (examp: SimplePrincipal)
     */
    Principal getPrincipal();

    /**
     * Timestamp, useful for old Authentication in TGT.
     * 
     * @return the date/time the authentication occurred.
     */
    Date getAuthenticatedDate();

    /**
     * Attributes of the authentication (not the Principal) set by an
     * AuthenticationAttributesPopulator.
     * 
     * @return Map generated by
     */
    Map getAttributes();
}
