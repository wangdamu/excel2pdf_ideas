package com.aspose.cells;

import com.aspose.cells.a.c.zg;
import com.aspose.cells.b.a.a.zd;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zdc
  extends zbzq
{
  private static HashMap d = null;
  private static HashMap e = null;
  private static Object f = new Object();
  
  public zdc(DigitalSignatureCollection paramDigitalSignatureCollection)
    throws Exception
  {
    super(paramDigitalSignatureCollection);
    b();
  }
  
  private static void b()
  {
    if ((d == null) || (e == null)) {
      synchronized (f)
      {
        if (d == null)
        {
          d = zg.a();
          d.put("\005Bagaaqy23kudbhchAaq5u2chNd", null);
          d.put("\006DataSpaces", null);
          d.put("_xmlsignatures", null);
          d.put("MsoDataStore", null);
        }
        if (e == null)
        {
          e = zg.a();
          e.put("\tDRMContent", null);
          e.put("_signatures", null);
          e.put("\005SummaryInformation", null);
          e.put("\005DocumentSummaryInformation", null);
        }
      }
    }
  }
  
  public void a(zxf paramzxf)
    throws Exception
  {
    d(paramzxf);
  }
  
  private void a(zbzm paramzbzm, zaoz paramzaoz, String paramString)
    throws Exception
  {
    Iterator localIterator = paramzaoz.c().iterator();
    while (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      Object localObject = paramzaoz.d(str1);
      String str2;
      if ((localObject instanceof zh))
      {
        if (!e.containsKey(str1))
        {
          str2 = a(str1, paramString, false);
          zh localzh1 = (zh)localObject;
          localzh1.b(0L);
          if (zbpd.a(str1))
          {
            zh localzh2 = zbpd.a(localzh1);
            paramzbzm.a(a(localzh2, str2));
            localzh2.a();
          }
          else
          {
            paramzbzm.a(a(localzh1, str2));
          }
        }
      }
      else if ((localObject instanceof zaoz)) {
        if (!d.containsKey(str1))
        {
          str2 = a(str1, paramString, true);
          a(paramzbzm, (zaoz)localObject, str2);
        }
      }
    }
  }
  
  private String a(String paramString1, String paramString2, boolean paramBoolean)
  {
    String str = paramString2 + "/";
    if ((paramString1 == null) || (paramString1.length() == 0)) {
      return str;
    }
    int i = paramString1.charAt(0);
    if (i <= 15) {
      str = str + "&amp;#" + i + ";" + paramString1.substring(1, 1 + (paramString1.length() - 1));
    } else {
      str = str + paramString1;
    }
    if (!paramBoolean) {
      str = str + "?ContentType=application/octet-stream";
    }
    return str;
  }
  
  private void a(zbzm paramzbzm)
  {
    zd localzd = new zd();
    Iterator localIterator = paramzbzm.d.iterator();
    Object localObject;
    while (localIterator.hasNext())
    {
      localObject = (zbzm)localIterator.next();
      zamo localzamo = (zamo)((zbzm)localObject).b.get(0);
      String str = localzamo.b;
      str = zbpd.b(str);
      localzd.a(str, localObject);
    }
    paramzbzm.d.clear();
    localIterator = localzd.c().iterator();
    while (localIterator.hasNext())
    {
      localObject = localIterator.next();
      paramzbzm.a((zbzm)localzd.d(localObject));
    }
  }
  
  private zbzm b(zxf paramzxf)
    throws Exception
  {
    zbzm localzbzm1 = new zbzm("Object", "");
    zf.a(localzbzm1.b, new zamo("Id", "idPackageObject"));
    zf.a(localzbzm1.b, new zamo("xmlns:mdssi", "http://schemas.openxmlformats.org/package/2006/digital-signature"));
    zbzm localzbzm2 = new zbzm("Manifest", "");
    zbzm localzbzm3 = a();
    localzbzm1.a(localzbzm2);
    localzbzm1.a(localzbzm3);
    a(localzbzm2, paramzxf.a(), "");
    a(localzbzm2);
    return localzbzm1;
  }
  
  private zda a(zxf paramzxf, DigitalSignature paramDigitalSignature)
    throws Exception
  {
    this.b = paramDigitalSignature;
    zda localzda = new zda();
    zbzm localzbzm1 = new zbzm("Signature", "");
    zf.a(localzbzm1.b, new zamo("Id", "idPackageSignature"));
    zf.a(localzbzm1.b, new zamo("xmlns", "http://www.w3.org/2000/09/xmldsig#"));
    zbzm localzbzm2 = b(paramzxf);
    zbzm localzbzm3 = b(paramDigitalSignature);
    zbzm localzbzm4 = a(localzbzm2, localzbzm3);
    localzbzm1.a(localzbzm4);
    localzbzm1.a(a(paramDigitalSignature, localzbzm4));
    localzbzm1.a(a(paramDigitalSignature));
    localzbzm1.a(localzbzm2);
    localzbzm1.a(localzbzm3);
    localzda.a(localzbzm1);
    return localzda;
  }
  
  private ArrayList c(zxf paramzxf)
    throws Exception
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      DigitalSignature localDigitalSignature = (DigitalSignature)localIterator.next();
      zf.a(localArrayList, a(paramzxf, localDigitalSignature));
    }
    return localArrayList;
  }
  
  private void d(zxf paramzxf)
    throws Exception
  {
    ArrayList localArrayList = c(paramzxf);
    if ((localArrayList != null) && (localArrayList.size() > 0))
    {
      zaoz localzaoz1 = paramzxf.a();
      String str = "_xmlsignatures";
      zaoz localzaoz2 = localzaoz1.b(str);
      if (localzaoz2 == null)
      {
        localzaoz1.a(str, new zaoz());
        localzaoz2 = localzaoz1.b(str);
      }
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        zda localzda = (zda)localIterator.next();
        zh localzh = new zh();
        zbzs localzbzs = new zbzs(localzh);
        localzda.a(localzbzs);
        localzh.b();
        localzh.b(0L);
        int i = zt.a(zit.b(), 1000, 9999);
        localzaoz2.a(zp.a(i), localzh);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zdc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */