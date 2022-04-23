import com.manal.service.SpeakerService;
import com.manal.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

  public static void main(String[] args) {
    //loads the xml configuration file applicationContext.xml
    ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

//    SpeakerService service = new SpeakerServiceImpl();
    SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);
    System.out.println(service.findAll().get(0).getFirstName());
  }
}
