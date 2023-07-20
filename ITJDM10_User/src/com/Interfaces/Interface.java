package com.Interfaces;

import com.Bean.DeleteBean;
import com.Bean.MsgBean;
import com.Bean.UserBean;

public interface Interface {
	public int register(UserBean bean);

	public int login(UserBean bean);
	
	public int msg(MsgBean bean);
	
	public int delete(DeleteBean bean);

	public int review(MsgBean bean);

}
