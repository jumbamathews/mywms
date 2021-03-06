/*
 * Copyright (c) 2006 - 2010 LinogistiX GmbH
 * 
 *  www.linogistix.com
 *  
 *  Project myWMS-LOS
 */
package de.linogistix.los.location.exception;

import javax.ejb.ApplicationException;

@ApplicationException(rollback=false)
public class LOSLocationAlreadyFullException extends LOSLocationException {

	public LOSLocationAlreadyFullException(String slName) {
		super(LOSLocationExceptionKey.STORAGELOCATION_ALLREADY_FULL, new String[]{slName});
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LOSLocationException createRollbackException() {
		return new LOSLocationException(getLocationExceptionKey(), getParameters());
	}

}
