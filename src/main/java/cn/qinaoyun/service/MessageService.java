package cn.qinaoyun.service;

import java.util.List;
import java.util.Map;

import cn.qinaoyun.entity.Message;

/**
 * 留言墙message接口
 * @author 秦奥运
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
		 * 查找用户留言信息
		 * @param map
		 * @return
		 */
		public List<Message> list(Map<String,Object> map);
		
		/**
		 * 获取总记录数
		 * @param map
		 * @return
		 */
		public Long getTotal();
}
