package cn.qinaoyun.service;

import cn.qinaoyun.entity.Message;

/**
 * ����ǽmessage�ӿ�
 * @author Administrator
 *
 */
public interface MessageService {
	 int deleteByPrimaryKey(Integer id);

	    int insert(Message record);

	    int insertSelective(Message record);

	    Message selectByPrimaryKey(Integer id);

	    int updateByPrimaryKeySelective(Message record);

	    int updateByPrimaryKey(Message record);
}
