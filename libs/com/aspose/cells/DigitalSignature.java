package com.aspose.cells;

import com.aspose.cells.a.c.zl;
import java.security.KeyStore;
import java.security.cert.X509Certificate;

public class DigitalSignature
{
  private KeyStore a;
  private String b;
  private DateTime c;
  private boolean d = true;
  private zhu e;
  
  public DigitalSignature(KeyStore Certificate, String privateKeyPassword, String Comments, DateTime SignTime)
  {
    this.a = Certificate;
    this.b = Comments;
    this.c = SignTime;
    try
    {
      this.e = new zhu(Certificate, privateKeyPassword);
    }
    catch (Exception localException)
    {
      zl.b(localException);
    }
  }
  
  DigitalSignature(X509Certificate cert, String comments, DateTime signtime, boolean result)
  {
    this.b = comments;
    this.c = signtime;
    this.d = result;
  }
  
  public KeyStore getCertificate()
  {
    return this.a;
  }
  
  zhu a()
  {
    return this.e;
  }
  
  public void setCertificate(KeyStore value)
  {
    this.a = value;
  }
  
  public String getComments()
  {
    return this.b;
  }
  
  public void setComments(String value)
  {
    this.b = value;
  }
  
  public DateTime getSignTime()
  {
    return this.c;
  }
  
  public void setSignTime(DateTime value)
  {
    this.c = value;
  }
  
  public boolean isValid()
  {
    return this.d;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/DigitalSignature.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */