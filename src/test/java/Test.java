import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yzt.model.User;
import com.yzt.service.UserService;


public class Test {
	String[] conf={"spring-mvc.xml","applicationContext.xml"};
	@org.junit.Test
   public void test(){
		System.out.println("23");
		 ApplicationContext a=new ClassPathXmlApplicationContext(conf);
		 UserService ds= a.getBean("userService",UserService.class);
		 User byUsername = ds.getByUsername("1");
		 System.out.println(byUsername);
		 System.out.println(ds);
		 SqlSessionFactory f=a.getBean("sqlSessionFactory",SqlSessionFactory.class);
		 System.out.println(f);
	}
}
