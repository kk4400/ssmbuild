import com.say.pojo.Bbooks;
import com.say.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public  void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) context.getBean("BookServiceImpl");
        for (Bbooks bbooks : bookService.queryAllBook()) {
            System.out.println(bbooks);
        }
    }
}
