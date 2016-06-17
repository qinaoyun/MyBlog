package cn.qinaoyun.service;

import java.util.List;
import java.util.Map;

import cn.qinaoyun.entity.Message;

/**
 * ����ǽmessage�ӿ�
 * @author �ذ���
 *
 */
public interface MessageService {
	 int deleteByPrimaryKey(Integer id);

	    int insert(Message record);

	    int insertSelective(Message record);

	    Message selectByPrimaryKey(Integer id);
	    
	    List<Message> selectAll();

	    int updateByPrimaryKeySelective(Message record);

	    int updateByPrimaryKey(Message record);
	    
	    /**
		 * �����û�������Ϣ
		 * @param map
		 * @return
		 */
		public List<Message> list(Map<String,Object> map);
		
		/**
		 * ��ȡ�ܼ�¼��
		 * @param map
		 * @return
		 */
		public Long getTotal();
}
