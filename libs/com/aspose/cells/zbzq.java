package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.g.zd;
import com.aspose.cells.b.a.ze;

class zbzq
{
  protected DigitalSignatureCollection a;
  private zbzl d;
  protected DigitalSignature b;
  protected int c = 1;
  
  public zbzq(DigitalSignatureCollection paramDigitalSignatureCollection)
    throws Exception
  {
    if (paramDigitalSignatureCollection == null) {
      throw new Exception("Signatures can not be null");
    }
    this.a = paramDigitalSignatureCollection;
    this.d = new zbzl("DigestMethod");
    zf.a(this.d.a, new zamo("Algorithm", "http://www.w3.org/2000/09/xmldsig#sha1"));
  }
  
  protected zbzm a(DigitalSignature paramDigitalSignature)
    throws Exception
  {
    zbzm localzbzm1 = new zbzm("KeyInfo", "");
    String str1 = paramDigitalSignature.a().a();
    zbzm localzbzm2 = new zbzm("KeyValue", str1);
    localzbzm1.a(localzbzm2);
    String str2 = ze.a(paramDigitalSignature.a().b());
    zbzm localzbzm3 = new zbzm("X509Data", "<X509Certificate>" + str2 + "</X509Certificate>");
    localzbzm1.a(localzbzm3);
    return localzbzm1;
  }
  
  protected zbzm a()
  {
    DateTime localDateTime = this.b.getSignTime();
    String str1 = localDateTime.b("yyyy-MM-dd") + "T" + localDateTime.b("HH:mm:ss") + "Z";
    String str2 = "<SignatureProperty Id=\"idSignatureTime\" Target=\"#idPackageSignature\"><mdssi:SignatureTime><mdssi:Format>YYYY-MM-DDThh:mm:ssTZD</mdssi:Format><mdssi:Value>" + str1 + "</mdssi:Value></mdssi:SignatureTime></SignatureProperty>";
    zbzm localzbzm = new zbzm("SignatureProperties", str2);
    return localzbzm;
  }
  
  protected zbzm b(DigitalSignature paramDigitalSignature)
  {
    String str = "<SignatureProperties><SignatureProperty Id=\"idOfficeV1Details\" Target=\"#idPackageSignature\"><SignatureInfoV1 xmlns=\"http://schemas.microsoft.com/office/2006/digsig\"><SetupID></SetupID><SignatureText></SignatureText><SignatureImage></SignatureImage><SignatureComments>" + paramDigitalSignature.getComments() + "</SignatureComments><WindowsVersion>5.1</WindowsVersion><OfficeVersion>12.0</OfficeVersion><ApplicationVersion>12.0</ApplicationVersion><Monitors>1</Monitors><HorizontalResolution>1280</HorizontalResolution><VerticalResolution>800</VerticalResolution><ColorDepth>32</ColorDepth><SignatureProviderId>{00000000-0000-0000-0000-000000000000}</SignatureProviderId><SignatureProviderUrl></SignatureProviderUrl><SignatureProviderDetails>9</SignatureProviderDetails><ManifestHashAlgorithm>http://www.w3.org/2000/09/xmldsig#sha1</ManifestHashAlgorithm><SignatureType>1</SignatureType></SignatureInfoV1></SignatureProperty></SignatureProperties>";
    zbzm localzbzm = new zbzm("Object", str);
    zf.a(localzbzm.b, new zamo("Id", "idOfficeObject"));
    return localzbzm;
  }
  
  protected String a(byte[] paramArrayOfByte)
  {
    String str1 = ze.a(paramArrayOfByte);
    String str2 = "";
    for (;;)
    {
      String str3 = str1.substring(0, 0 + Math.min(72, str1.length()));
      str2 = str2 + "\r\n    " + str3;
      if (str3.length() < 72) {
        return str2;
      }
      str1 = str1.substring(72);
    }
  }
  
  protected zbzm a(DigitalSignature paramDigitalSignature, zbzm paramzbzm)
    throws Exception
  {
    String str1 = "";
    String str2 = "";
    String[] arrayOfString = { str2 };
    paramzbzm.a(arrayOfString);
    str2 = arrayOfString[0];
    synchronized (zbzo.a)
    {
      zbzo.a();
      localObject1 = new String[] { str1 };
      zbzo.a(str2, (String[])localObject1);
      str1 = localObject1[0];
    }
    ??? = paramDigitalSignature.a().a(zd.getUTF8().a(str1), this.c);
    Object localObject1 = new zbzm("SignatureValue", a((byte[])???));
    return (zbzm)localObject1;
  }
  
  protected zbzm a(zbzm paramzbzm1, zbzm paramzbzm2)
    throws Exception
  {
    String str1 = "";
    String str2 = "";
    String[] arrayOfString1 = { str2 };
    paramzbzm1.a(arrayOfString1);
    str2 = arrayOfString1[0];
    synchronized (zbzo.a)
    {
      zbzo.a();
      String[] arrayOfString2 = { str1 };
      zbzo.a(str2, arrayOfString2);
      str1 = arrayOfString2[0];
    }
    ??? = b(str1);
    str2 = "";
    str1 = "";
    arrayOfString1[0] = str2;
    paramzbzm2.a(arrayOfString1);
    str2 = arrayOfString1[0];
    synchronized (zbzo.a)
    {
      zbzo.a();
      localObject2 = new String[] { str1 };
      zbzo.a(str2, (String[])localObject2);
      str1 = localObject2[0];
    }
    ??? = b(str1);
    Object localObject2 = "<CanonicalizationMethod Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"/><SignatureMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#rsa-sha1\"/><Reference URI=\"#idPackageObject\" Type=\"http://www.w3.org/2000/09/xmldsig#Object\"><DigestMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#sha1\"/><DigestValue>" + ze.a((byte[])???) + "</DigestValue></Reference><Reference URI=\"#idOfficeObject\" Type=\"http://www.w3.org/2000/09/xmldsig#Object\"><DigestMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#sha1\"/><DigestValue>" + ze.a((byte[])???) + "</DigestValue></Reference>";
    zbzm localzbzm = new zbzm("SignedInfo", (String)localObject2);
    return localzbzm;
  }
  
  protected zbzm a(zm paramzm, String paramString)
  {
    byte[] arrayOfByte = zhu.a(paramzm, this.c);
    zbzm localzbzm1 = new zbzm("Reference", "");
    zf.a(localzbzm1.b, new zamo("URI", paramString));
    localzbzm1.a(this.d);
    zbzm localzbzm2 = new zbzm("DigestValue", ze.a(arrayOfByte));
    localzbzm1.a(localzbzm2);
    return localzbzm1;
  }
  
  protected byte[] a(String paramString)
  {
    return zhu.b(zd.getUTF8().a(paramString), this.c);
  }
  
  protected byte[] b(String paramString)
  {
    return zhu.b(Encoding.getASCII().a(paramString), this.c);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbzq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */