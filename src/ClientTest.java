import client.HelloWSImpl;
import client.HelloWSImplService;

public class ClientTest {

    public static void main(String[] args) {
        HelloWSImplService factory = new HelloWSImplService();
        HelloWSImpl helloWSImpl = factory.getHelloWSImplPort();
        System.out.println(helloWSImpl.getClass());

        String resulr = helloWSImpl.sayHello("Zard");
        System.out.println(resulr);

    }
}
