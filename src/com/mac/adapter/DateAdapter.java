package com.mac.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Used by jaxb to customized date format
 * 
 * @author Froilan
 *
 */
public class DateAdapter extends XmlAdapter<String, Date> {
	
	private SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	
	@Override
	public String marshal(Date date) throws Exception {
		return sdf.format(date);
	}
	@Override
	public Date unmarshal(String dateString) throws Exception {
		return sdf.parse(dateString);
	}
}
