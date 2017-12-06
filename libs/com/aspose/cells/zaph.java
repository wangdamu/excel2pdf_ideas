package com.aspose.cells;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

final class zaph
  implements X509TrustManager
{
  public void checkClientTrusted(X509Certificate[] arg0, String arg1)
    throws CertificateException
  {}
  
  public void checkServerTrusted(X509Certificate[] arg0, String arg1)
    throws CertificateException
  {}
  
  public X509Certificate[] getAcceptedIssuers()
  {
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaph.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */