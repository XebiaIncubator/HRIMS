package com.xebia.hrims.dao.leave.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.xebia.hrims.dao.crud.impl.DAOImpl;
import com.xebia.hrims.dao.leave.IStatusDao;
import com.xebia.hrims.model.leave.status;

@Repository("leaveStatusDao")
public class StatusDaoImpl extends DAOImpl<status> implements IStatusDao{

	  public StatusDaoImpl() {
		super(status.class);
	  }

	@Override
	public List<status> getAllLeavesStatus() {
		try{
			List<status> leaveStatus = findAll();
			return leaveStatus;
		} catch (Exception e) {
			System.out.println("Error while getting leave "+e.getMessage());
			return new ArrayList<status>();
		}
	}
}
