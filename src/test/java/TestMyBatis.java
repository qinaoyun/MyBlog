import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.qinaoyun.entity.*;
import cn.qinaoyun.service.MessageService;;

@RunWith(SpringJUnit4ClassRunner.class)
// ��ʾ�̳���SpringJUnit4ClassRunner��
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	// private ApplicationContext ac = null;
	@Resource
	private MessageService messageService = null;

	// @Before
	// public void before() {
	// ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	// userService = (IUserService) ac.getBean("userService");
	// }

	@Test
	public void test1() {
		//���Բ�ѯ��������
/*		List<Message> list= messageService.selectAll();
		for(int a=0;a<list.size();a++){
			 Message mmsg=(Message)list.get(a);
		 System.out.println(mmsg.getMcontent()+"-----------------����ǽ����ר��"+list.size());
		}*/
		//���Բ�ѯ���Ե�����
	/*	Long length = messageService.getTotal();
		System.out.println(length+"-----------------����ǽ����ר��");
	}*/
		//����map��ѯ���м�¼
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("start", 2);
		map.put("size", 4);
		List<Message> list= messageService.list(null);
		for(int a=0;a<list.size();a++){
			 Message mmsg=(Message)list.get(a);
		 System.out.println(mmsg.getMcontent()+"-----------------����ǽ����"+list.size());
		}
		
		
}
}


