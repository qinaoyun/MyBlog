package cn.qinaoyun.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.qinaoyun.dao.BloggerDao;
import cn.qinaoyun.entity.Blogger;
import cn.qinaoyun.service.BloggerService;

/**
 * 博主Service实现类
 * @author Administrator
 *
 */
@Service("bloggerService")
public class BloggerServiceImpl implements BloggerService{

	@Resource
	private BloggerDao bloggerDao;

	public Blogger find() {
		return bloggerDao.find();
	}

	public Blogger getByUserName(String userName) {
		return bloggerDao.getByUserName(userName);
	}

	public Integer update(Blogger blogger) {
		return bloggerDao.update(blogger);
	}
	
	
}
