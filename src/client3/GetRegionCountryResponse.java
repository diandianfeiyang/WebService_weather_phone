
package client3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getRegionCountryResult"
})
@XmlRootElement(name = "getRegionCountryResponse")
public class GetRegionCountryResponse {

    protected ArrayOfString getRegionCountryResult;

    public ArrayOfString getGetRegionCountryResult() {
        return getRegionCountryResult;
    }

    public void setGetRegionCountryResult(ArrayOfString value) {
        this.getRegionCountryResult = value;
    }

}
