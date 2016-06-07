package cn.qinaoyun.dao;

import cn.qinaoyun.entity.Blogger;

/**
 * ����Dao�ӿ�
 * @author �ذ���
 *
 */
public interface BloggerDao {

	/**
	 * ��ѯ������Ϣ
	 * @return
	 */
	public Blogger find();
	
	/**
	 * ͨ���û�����ѯ�û�
	 * @param userName
	 * @return
	 */
	public Blogger getByUserName(String userName);
	
	/**
	 * ���²�����Ϣ
	 * @param blogger
	 * @return
	 */
	public Integer update(Blogger blogger);
}
