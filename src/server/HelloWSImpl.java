package server;
import javax.jws.WebService;

@WebService
public class HelloWSImpl implements HelloWS {
    @Override
    public String sayHello(String name) {
        System.out.println("server sayHello: " + name);
        return "Hello " + name;
    }
}
