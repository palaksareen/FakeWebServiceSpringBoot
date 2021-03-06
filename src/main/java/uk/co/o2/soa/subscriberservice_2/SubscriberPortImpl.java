
package uk.co.o2.soa.subscriberservice_2;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import uk.co.o2.soa.coredata_1.PaymentCategoryType;
import uk.co.o2.soa.coredata_1.SegmentType;
import uk.co.o2.soa.subscriberdata_2.BillingProfileType;
import uk.co.o2.soa.subscriberdata_2.GetBillProfile;
import uk.co.o2.soa.subscriberdata_2.GetBillProfileResponse;
import uk.co.o2.soa.subscriberdata_2.ProductListType;
import uk.co.o2.soa.subscriberdata_2.ServiceProviderDetailsType;
import uk.co.o2.soa.subscriberdata_2.SubscriberProfileType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@javax.jws.WebService(
        serviceName = "SubscriberService",
        portName = "SubscriberPort",
        targetNamespace = "http://soa.o2.co.uk/subscriberservice_2",
        wsdlLocation = "subscriberservice_2_0.wsdl",
        endpointInterface = "uk.co.o2.soa.subscriberservice_2.SubscriberPort")
public class SubscriberPortImpl implements SubscriberPort{

	@Override
	public SubscriberProfileType getSubscriberProfile(String subscriberID) throws GetSubscriberProfileFault {
		
        try {
            uk.co.o2.soa.subscriberdata_2.SubscriberProfileType _return = new SubscriberProfileType();
            
            _return.setChannel("Online");
            _return.setOperator("O2");
            _return.setPaymentCategory(PaymentCategoryType.POSTPAY);
            _return.setServiceProviderID((long) 283);
            _return.setSegment(SegmentType.CONSUMER);
            _return.setPuk("1234");
            _return.setStatus("A");
            
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
	}

	@Override
	public SegmentType getSubscriberSegment(String subscriberID) throws GetSubscriberSegmentFault {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaymentCategoryType getSubscriberPaymentCategory(String subscriberID)
			throws GetSubscriberPaymentCategoryFault {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSubscriberOperator(String subscriberID) throws GetSubscriberOperatorFault {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSubscriberChannel(String subscriberID) throws GetSubscriberChannelFault {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BillingProfileType getBillingSystem(String msisdn) throws GetBillingSystemFault {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getSubscriberAndBillingSystem(String msisdn,
			Holder<uk.co.o2.soa.coredata_1.SubscriberProfileType> subscriberProfile,
			Holder<BillingProfileType> billingProfile) throws GetSubscriberAndBillingSystemFault {
		// TODO Auto-generated method stub
		
	}

	@Override
	public GetBillProfileResponse getBillProfile(GetBillProfile getBillProfile) throws GetBillProfileFault {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getChargingCategory(String msisdn, ProductListType productList)
			throws GetChargingCategoryFault {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServiceProviderDetailsType getSPIDDetails1(String serviceProviderId) throws GetSPIDDetails1Fault {
		// TODO Auto-generated method stub
		return null;
	}



}
