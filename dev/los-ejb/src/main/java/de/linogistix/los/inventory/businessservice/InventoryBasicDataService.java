/*
 * Copyright (c) 2012 LinogistiX GmbH
 * 
 *  www.linogistix.com
 *  
 *  Project myWMS-LOS
 */
package de.linogistix.los.inventory.businessservice;

import java.util.Locale;

import javax.ejb.Local;

import org.mywms.facade.FacadeException;

/**
 * Generation of basic data to use the application
 * 
 * @author krane
 *
 */
@Local
public interface InventoryBasicDataService {
	public void createBasicData(Locale locale) throws FacadeException;
}
