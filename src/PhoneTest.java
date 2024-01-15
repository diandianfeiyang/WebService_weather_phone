import client2.MobileCodeWS;
import client2.MobileCodeWSSoap;

public class PhoneTest {
    public static void main(String[] args) {
        MobileCodeWS mobileCodeWS = new MobileCodeWS();
        MobileCodeWSSoap soap = mobileCodeWS.getMobileCodeWSSoap();
        String mobileCodeInfo = soap.getMobileCodeInfo("19858872449", null);
        System.out.println(mobileCodeInfo);
    }
}
