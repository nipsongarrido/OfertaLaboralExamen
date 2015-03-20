package webservice;

import java.io.IOException;
import java.net.Proxy;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.SoapFault;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpResponseException;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

import android.util.Log;
import domain.OfertaVO;

public class Servicios {
	private static final String URL = "http://172.23.64.92:8888/WebServiceOfertaLaboral/services/ServicioOferta?wsdl";
	private static final String SOAP_ACTION = "http://webservice/crearOferta";
	private static final String NAMESPACE = "http://webservice";

	public String crearOferta(String detalle, String mail, String fechaVigencia,
			String fechaPublicacion) {
		String data = null;
		String methodname = "crearOferta";
		SoapObject request = new SoapObject(NAMESPACE, methodname);
		OfertaVO oferta = new OfertaVO(detalle, mail, fechaVigencia,
				fechaPublicacion);

		PropertyInfo pi = new PropertyInfo();
		pi.setName("ofertaVO");
		pi.setValue(oferta);
		pi.setType(oferta.getClass());

		request.addProperty(pi);

		SoapSerializationEnvelope envelope = getSoapSerializationEnvelope(request);
		HttpTransportSE androidHttpTransport = getHttpTransportSE();
		try {
			androidHttpTransport.call(SOAP_ACTION, envelope);
		} catch (HttpResponseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XmlPullParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			SoapPrimitive resultado = (SoapPrimitive) envelope.getResponse();
//			SoapObject response = (SoapObject) envelope.getResponse();
			String mensaje;
			Log.i("nipson", resultado.toString());
			data = resultado.toString();

		} catch (SoapFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return data;
	}

	private final SoapSerializationEnvelope getSoapSerializationEnvelope(
			SoapObject request) {
		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
				SoapEnvelope.VER11);
		envelope.dotNet = true;
		envelope.implicitTypes = true;
		envelope.setAddAdornments(false);
		envelope.addMapping(NAMESPACE, "OfertaVO", new OfertaVO().getClass());
		envelope.setOutputSoapObject(request);

		return envelope;
	}

	private final HttpTransportSE getHttpTransportSE() {
		HttpTransportSE ht = new HttpTransportSE(Proxy.NO_PROXY, URL, 60000);
		ht.debug = true;
		ht.setXmlVersionTag("<!--?xml version=\"1.0\" encoding= \"UTF-8\" ?-->");
		return ht;
	}
}