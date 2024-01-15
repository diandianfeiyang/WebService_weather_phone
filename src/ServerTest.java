import server.HelloWSImpl;

import javax.xml.ws.Endpoint;

public class ServerTest {

    public static void main(String[] args) {
        String address = "http://localhost:8989/wsDemo/hellows";
        Endpoint.publish(address, new HelloWSImpl());
        System.out.println("发布成功");
    }
}
