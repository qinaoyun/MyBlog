package cn.qinaoyun.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.qinaoyun.dao.LinkDao;
import cn.qinaoyun.dao.MessageDao;
import cn.qinaoyun.entity.Link;
import cn.qinaoyun.entity.Message;
import cn.qinaoyun.service.LinkService;
import cn.qinaoyun.service.MessageService;

/**
 * 留言墙Service实现类
 * @author 秦奥运
 *
 */
@Service("MessageService")
public class MessageServiceImpl implements MessageService{

	@Resource
	private MessageDao messageDao;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return messageDao.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Message record) {
		// TODO Auto-generated method stub
		return messageDao.insert(record);
	}

	@Override
	public int insertSelective(Message record) {
		// TODO Auto-generated method stub
		return messageDao.insertSelective(record);
	}

	@Override
	public Message selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return messageDao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Message record) {
		// TODO Auto-generated method stub
		return messageDao.updateByPrimaryKey(record);
	}

	@Override
	public int updateByPrimaryKey(Message record) {
		// TODO Auto-generated method stub
		return messageDao.updateByPrimaryKeySelective(record);
	}



}
