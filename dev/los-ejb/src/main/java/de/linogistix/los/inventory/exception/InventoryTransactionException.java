/*
 * Copyright (c) 2006 - 2010 LinogistiX GmbH
 * 
 *  www.linogistix.com
 *  
 *  Project myWMS-LOS
 */
 package de.linogistix.los.inventory.exception;

import java.util.Arrays;

import javax.ejb.ApplicationException;

import org.mywms.facade.FacadeException;

import de.linogistix.los.inventory.res.InventoryBundleResolver;

@ApplicationException(rollback = false)
public class InventoryTransactionException extends FacadeException {

	private static final long serialVersionUID = 1L;

	private static final String resourceBundle = "de.linogistix.los.inventory.res.Bundle";
	
	private InventoryExceptionKey invKey;
	
	public InventoryTransactionException(InventoryExceptionKey key){
		this(key, new Object[]{});
	}

	public InventoryTransactionException(InventoryExceptionKey key, Object[] parameters){
		
		super(key.name() + ": " + Arrays.toString(parameters), key.name(), parameters, resourceBundle);
        invKey = key;
        setBundleResolver(InventoryBundleResolver.class);
	}
    
    public InventoryTransactionException(InventoryExceptionKey key, String param1){
		
		super(key.name() + ":" +param1, key.name(), new Object[]{param1}, resourceBundle);
        invKey = key;
        setBundleResolver(InventoryBundleResolver.class);
	}

	public InventoryExceptionKey getInventoryExceptionKey() {
		return invKey;
	}
    
}
