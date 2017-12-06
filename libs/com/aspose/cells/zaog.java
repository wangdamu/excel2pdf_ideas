package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zc;
import com.aspose.cells.b.a.d.ze;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zk;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.d.zn;
import com.aspose.cells.b.a.d.zo;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.HashMap;

class zaog
{
  private zago a;
  private ArrayList b = new ArrayList();
  private static final za c = new za(new String[] { "7bit", "8bit", "binary", "quoted-printable", "base64", "x-encodingname" });
  
  public zaog(zm paramzm, Encoding paramEncoding)
    throws Exception
  {
    this.a = new zago(paramzm, paramEncoding);
  }
  
  public zago a(String paramString)
    throws Exception
  {
    this.a.a("MIME-Version: 1.0");
    this.a.b("X-Document-Type: Workbook");
    this.a.b("Content-Type: multipart/related; boundary=\"" + paramString + "\"");
    this.a.g();
    this.a.b("This document is a Single File Web Page, also known as a Web Archive file.  If you are seeing this message, your browser or editor doesn't support Web Archive files.  Please download a browser that supports Web Archive, such as Windows Internet Explorer.");
    this.a.g();
    this.a.h();
    return this.a;
  }
  
  /* Error */
  public zago a(String paramString, boolean paramBoolean)
    throws Exception
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 39	com/aspose/cells/zaog:a	Lcom/aspose/cells/zago;
    //   4: invokevirtual 68	com/aspose/cells/zago:g	()V
    //   7: aload_0
    //   8: getfield 39	com/aspose/cells/zaog:a	Lcom/aspose/cells/zago;
    //   11: new 35	java/lang/StringBuilder
    //   14: dup
    //   15: invokespecial 82	java/lang/StringBuilder:<init>	()V
    //   18: aload_1
    //   19: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   22: ldc 2
    //   24: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   30: invokevirtual 66	com/aspose/cells/zago:b	(Ljava/lang/String;)V
    //   33: aload_0
    //   34: getfield 39	com/aspose/cells/zaog:a	Lcom/aspose/cells/zago;
    //   37: invokevirtual 69	com/aspose/cells/zago:h	()V
    //   40: aload_0
    //   41: getfield 39	com/aspose/cells/zaog:a	Lcom/aspose/cells/zago;
    //   44: ifnull +38 -> 82
    //   47: iload_2
    //   48: ifeq +34 -> 82
    //   51: aload_0
    //   52: getfield 39	com/aspose/cells/zaog:a	Lcom/aspose/cells/zago;
    //   55: invokevirtual 67	com/aspose/cells/zago:f	()V
    //   58: goto +24 -> 82
    //   61: astore_3
    //   62: aload_0
    //   63: getfield 39	com/aspose/cells/zaog:a	Lcom/aspose/cells/zago;
    //   66: ifnull +14 -> 80
    //   69: iload_2
    //   70: ifeq +10 -> 80
    //   73: aload_0
    //   74: getfield 39	com/aspose/cells/zaog:a	Lcom/aspose/cells/zago;
    //   77: invokevirtual 67	com/aspose/cells/zago:f	()V
    //   80: aload_3
    //   81: athrow
    //   82: aload_0
    //   83: getfield 39	com/aspose/cells/zaog:a	Lcom/aspose/cells/zago;
    //   86: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	87	0	this	zaog
    //   0	87	1	paramString	String
    //   0	87	2	paramBoolean	boolean
    //   61	20	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   0	40	61	finally
  }
  
  public void a(zm paramzm1, zm paramzm2, Encoding paramEncoding, String paramString)
    throws Exception
  {
    zo localzo = null;
    String str1 = "Content-Location";
    String str2 = "Content-Transfer-Encoding";
    String str3 = "Content-Type";
    try
    {
      ArrayList localArrayList = a(paramzm2, paramEncoding);
      localzo = new zo(paramzm1, paramEncoding);
      localzo.c("MIME-Version: 1.0");
      localzo.c("X-Document-Type: Workbook");
      localzo.c("Content-Type: multipart/related; boundary=\"" + paramString.substring(2) + "\"");
      localzo.f();
      localzo.c("This document is a Single File Web Page, also known as a Web Archive file.  If you are seeing this message, your browser or editor doesn't support Web Archive files.  Please download a browser that supports Web Archive, such as Windows Internet Explorer.");
      localzo.f();
      localzo.c();
      zh localzh = null;
      for (int i = 0; i < localArrayList.size(); i++)
      {
        HashMap localHashMap = (HashMap)localArrayList.get(i);
        localzo.c(paramString);
        localzo.c(str1 + ":" + localHashMap.get(str1));
        localzo.c(str2 + ":" + localHashMap.get(str2));
        localzo.c(str3 + ":" + localHashMap.get(str3));
        localzo.f();
        localzo.c();
        i++;
        localzh = (zh)localArrayList.get(i);
        localzo.d().b(localzh.m(), 0, (int)localzh.h());
        localzo.c();
        localzh.a();
      }
      localzo.c(paramString + "--");
      localzo.c();
      paramzm1.b(0L);
    }
    catch (Exception localException) {}
  }
  
  public void a(String paramString1, zm paramzm, Encoding paramEncoding, String paramString2)
    throws Exception
  {
    zo localzo = null;
    String str1 = "Content-Location";
    String str2 = "Content-Transfer-Encoding";
    String str3 = "Content-Type";
    try
    {
      ArrayList localArrayList = a(paramzm, paramEncoding);
      zc.b(zk.e(paramString1));
      ze localze = new ze(paramString1, 2);
      localzo = new zo(localze, paramEncoding);
      localzo.c("MIME-Version: 1.0");
      localzo.c("X-Document-Type: Workbook");
      localzo.c("Content-Type: multipart/related; boundary=\"" + paramString2.substring(2) + "\"");
      localzo.f();
      localzo.c("This document is a Single File Web Page, also known as a Web Archive file.  If you are seeing this message, your browser or editor doesn't support Web Archive files.  Please download a browser that supports Web Archive, such as Windows Internet Explorer.");
      localzo.f();
      localzo.c();
      zh localzh = null;
      for (int i = 0; i < localArrayList.size(); i++)
      {
        HashMap localHashMap = (HashMap)localArrayList.get(i);
        localzo.c(paramString2);
        localzo.c(str1 + ":" + localHashMap.get(str1));
        localzo.c(str2 + ":" + localHashMap.get(str2));
        localzo.c(str3 + ":" + localHashMap.get(str3));
        localzo.f();
        localzo.c();
        i++;
        localzh = (zh)localArrayList.get(i);
        localzo.d().b(localzh.m(), 0, (int)localzh.h());
        localzo.c();
        localzh.a();
      }
      localzo.c(paramString2 + "--");
      localzo.c();
    }
    finally
    {
      if (localzo != null) {
        localzo.b();
      }
    }
  }
  
  private ArrayList a(zm paramzm, Encoding paramEncoding)
    throws Exception
  {
    zn localzn = new zn(paramzm, paramEncoding);
    String str2 = "Content-Location";
    String str3 = "Content-Transfer-Encoding";
    String str4 = "Content-Type";
    String str5 = "boundary=";
    int i = 0;
    String str6 = null;
    int j = 0;
    zh localzh = null;
    zo localzo = null;
    int k = 0;
    String str7 = null;
    String str8 = null;
    String str9 = null;
    HashMap localHashMap = null;
    try
    {
      for (;;)
      {
        String str1 = localzn.f();
        if (str1 == null) {
          break;
        }
        if (i == 2) {
          if (str1.indexOf(str5) > -1)
          {
            str6 = str1.substring(str1.indexOf(str5) + str5.length());
            if ((str6.startsWith("\"")) && (str6.startsWith("\""))) {
              str6 = str6.substring(1, 1 + (str6.length() - 2));
            }
          }
          else
          {
            k = j = 1;
          }
        }
        if (zaoh.a(str1, str6)) {
          j = 1;
        }
        if (j != 0)
        {
          int m = 0;
          String str10 = str1;
          localzh = new zh();
          localzo = new zo(localzh);
          str7 = null;
          str8 = null;
          str9 = null;
          localHashMap = new HashMap();
          while (str10 != null)
          {
            if (str10.startsWith(str2))
            {
              str7 = zaoh.a(str10);
              localHashMap.put(str2, str7);
            }
            if (str10.startsWith(str3))
            {
              str8 = zaoh.a(str10);
              localHashMap.put(str3, str8);
            }
            if (str10.startsWith(str4))
            {
              str9 = zaoh.a(str10);
              localHashMap.put(str4, str9);
            }
            if (m > 3)
            {
              if (zaoh.a(str10, str6))
              {
                localzo.c();
                localzh.b(0L);
                a(localzh, localHashMap, str8, paramEncoding);
                if (!"quoted-printable".equals(str8)) {
                  break;
                }
                localzo.b();
                break;
              }
              localzo.c(str10);
            }
            m++;
            str10 = localzn.f();
          }
        }
        i++;
        if (k != 0)
        {
          localzo.c();
          localzh.b(0L);
          a(localzh, localHashMap, str8, paramEncoding);
          localzo.b();
        }
      }
    }
    catch (Exception localException) {}finally
    {
      if (localzn != null) {
        localzn.a();
      }
    }
    return this.b;
  }
  
  private void a(zm paramzm, HashMap paramHashMap, String paramString, Encoding paramEncoding)
    throws Exception
  {
    switch (c.a(paramString))
    {
    case 0: 
      break;
    case 1: 
      break;
    case 2: 
      break;
    case 3: 
      zm localzm = zayg.a(paramzm, paramEncoding);
      zf.a(this.b, paramHashMap);
      zf.a(this.b, localzm);
      break;
    case 4: 
      zf.a(this.b, paramHashMap);
      zf.a(this.b, paramzm);
      break;
    case 5: 
      break;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */