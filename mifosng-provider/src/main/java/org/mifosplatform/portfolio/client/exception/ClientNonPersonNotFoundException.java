/**
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mifosplatform.portfolio.client.exception;

import org.mifosplatform.infrastructure.core.exception.AbstractPlatformResourceNotFoundException;

/**
 * A {@link RuntimeException} thrown when clientNonPerson resources are not found.
 */
public class ClientNonPersonNotFoundException extends AbstractPlatformResourceNotFoundException {
	
	public ClientNonPersonNotFoundException(final Long id) {
        super("error.msg.clientnonperson.id.invalid", "ClientNonPerson with identifier " + id + " does not exist", id);
    }
	
}
