package com.aspose.cells;

import com.aspose.cells.b.a.ze;
import java.util.Iterator;

abstract class zbzp
{
  protected int a = 1;
  private DigitalSignatureCollection b = new DigitalSignatureCollection();
  
  public DigitalSignatureCollection b()
  {
    return this.b;
  }
  
  private void a(zcjs paramzcjs, String[] paramArrayOfString)
  {
    Iterator localIterator1 = paramzcjs.l().iterator();
    while (localIterator1.hasNext())
    {
      zcjs localzcjs1 = (zcjs)localIterator1.next();
      zcjs localzcjs2 = paramzcjs.m();
      Iterator localIterator2 = localzcjs1.m().l().iterator();
      while (localIterator2.hasNext())
      {
        zcjs localzcjs3 = (zcjs)localIterator2.next();
        if ("SignatureComments".equals(localzcjs3.k()))
        {
          paramArrayOfString[0] = localzcjs3.d();
          return;
        }
      }
    }
    paramArrayOfString[0] = "";
  }
  
  private void a(zcjs paramzcjs, DateTime[] paramArrayOfDateTime)
  {
    paramArrayOfDateTime[0] = DateTime.a;
    String str1 = "";
    String str2 = "";
    Iterator localIterator1 = paramzcjs.l().iterator();
    while (localIterator1.hasNext())
    {
      zcjs localzcjs1 = (zcjs)localIterator1.next();
      if ("idSignatureTime".equals(zbzo.a(localzcjs1, "Id")))
      {
        zcjs localzcjs2 = localzcjs1.m();
        Iterator localIterator2 = localzcjs2.l().iterator();
        while (localIterator2.hasNext())
        {
          zcjs localzcjs3 = (zcjs)localIterator2.next();
          if ("mdssi:Format".equals(localzcjs3.k())) {
            str1 = localzcjs3.d();
          }
          if ("mdssi:Value".equals(localzcjs3.k())) {
            str2 = localzcjs3.d();
          }
        }
        try
        {
          paramArrayOfDateTime[0] = DateTime.a(str2).toUniversalTime();
        }
        catch (Exception localException) {}
      }
    }
  }
  
  protected boolean a(String paramString, String[] paramArrayOfString, DateTime[] paramArrayOfDateTime)
    throws Exception
  {
    zcjm localzcjm = new zcjm();
    localzcjm.a(paramString, false, false);
    zcjn localzcjn1 = localzcjm.f();
    zcjn localzcjn2 = (zcjn)localzcjn1.e("SignedInfo");
    if (localzcjn2 == null) {
      throw new Exception("Cannot find Signature element");
    }
    paramArrayOfString[0] = null;
    paramArrayOfDateTime[0] = DateTime.a;
    zcju localzcju1 = localzcjn1.c("Object");
    zcju localzcju2 = localzcjn2.c("Reference");
    Iterator localIterator1 = localzcju2.iterator();
    while (localIterator1.hasNext())
    {
      zcjn localzcjn3 = (zcjn)localIterator1.next();
      Iterator localIterator2 = localzcju1.iterator();
      while (localIterator2.hasNext())
      {
        zcjn localzcjn4 = (zcjn)localIterator2.next();
        if (localzcjn3.a("URI").substring(1).equals(localzcjn4.a("Id")))
        {
          String str = "";
          synchronized (zbzo.a)
          {
            zbzo.a();
            localObject1 = new String[] { str };
            zbzo.a(localzcjn4.c(), (String[])localObject1);
            str = localObject1[0];
          }
          ??? = zhu.b(Encoding.getASCII().a(str), this.a);
          Object localObject1 = ze.b(localzcjn3.e("DigestValue").d());
          if (!a((byte[])???, (byte[])localObject1)) {
            return false;
          }
          Iterator localIterator3 = localzcjn4.l().iterator();
          while (localIterator3.hasNext())
          {
            zcjs localzcjs = (zcjs)localIterator3.next();
            if ("SignatureProperties".equals(localzcjs.k()))
            {
              if (zbzo.a(localzcjs.e("SignatureProperty"), "Id").startsWith("idOfficeV1Details")) {
                a(localzcjs, paramArrayOfString);
              }
              if (zbzo.a(localzcjs.e("SignatureProperty"), "Id").startsWith("idSignatureTime")) {
                a(localzcjs, paramArrayOfDateTime);
              }
            }
            else if (("Manifest".equals(localzcjs.k())) && (localzcjs.j()) && (!a(localzcjs)))
            {
              return false;
            }
          }
        }
      }
    }
    return true;
  }
  
  protected abstract boolean a(zcjs paramzcjs)
    throws Exception;
  
  protected boolean a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1.length != paramArrayOfByte2.length) {
      return false;
    }
    for (int i = 0; i < paramArrayOfByte1.length; i++) {
      if (paramArrayOfByte1[i] != paramArrayOfByte2[i]) {
        return false;
      }
    }
    return true;
  }
  
  protected boolean a(String paramString, zhu[] paramArrayOfzhu)
    throws Exception
  {
    paramArrayOfzhu[0] = null;
    try
    {
      zcjm localzcjm = new zcjm();
      localzcjm.a(paramString, false, false);
      zcjn localzcjn1 = localzcjm.f();
      zcjn localzcjn2 = (zcjn)localzcjn1.e("KeyInfo");
      zcjn localzcjn3 = (zcjn)localzcjn2.e("X509Data");
      zcjn localzcjn4 = (zcjn)localzcjn3.e("X509Certificate");
      byte[] arrayOfByte1 = ze.b(localzcjn4.d());
      paramArrayOfzhu[0] = new zhu(arrayOfByte1);
      zcjn localzcjn5 = (zcjn)localzcjn1.e("SignedInfo");
      int[] arrayOfInt = { this.a };
      String str = zbzo.a(localzcjn5, arrayOfInt);
      this.a = arrayOfInt[0];
      byte[] arrayOfByte2 = Encoding.getASCII().a(str);
      boolean bool = paramArrayOfzhu[0].a(arrayOfByte2, ze.b(localzcjn1.e("SignatureValue").d()), this.a);
      return bool;
    }
    catch (Exception localException) {}
    return false;
  }
  
  protected abstract boolean a()
    throws Exception;
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbzp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */