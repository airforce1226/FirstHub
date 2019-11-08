package kr.ac.dcu.user.model.sql;

import kr.ac.dcu.user.model.vo.UserVO;

public interface UserDao {
	public UserVO loginRow(UserVO user) ; 
}
