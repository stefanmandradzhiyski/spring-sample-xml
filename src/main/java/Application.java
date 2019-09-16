import com.snmi.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Entry point of program
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Application {

    /**
     * Constants
     */
    private static final String APPLICATION_CONTEXT = "applicationContext.xml";
    private static final String SERVICE = "customerService";

    public static void main(String[] args) {

        ApplicationContext appContext =
                new ClassPathXmlApplicationContext(APPLICATION_CONTEXT);
        CustomerService service = appContext.getBean(SERVICE, CustomerService.class);
        System.out.println(service.findAll().get(0).getFirstName());

    }

}
