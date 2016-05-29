/*
 * EventDao Interface Class contains the interface for method
 * 
 * View Events based on month
 * 
 * @author Adarsh
 * 
 * */
package org.crce.interns.dao;

import java.sql.Date;
import java.util.List;

import org.crce.interns.model.Event_details;

public interface EventDao {

	List<Event_details> viewEvents(Integer month);

}

