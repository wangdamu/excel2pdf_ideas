package com.aspose.cells;

import com.aspose.cells.a.c.zl;
import com.aspose.cells.a.c.zx;
import com.aspose.cells.a.c.zy;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.d.zn;
import com.aspose.cells.b.a.d.zo;
import com.aspose.cells.b.a.ze;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;

class zapp
{
  private ArrayList a = new ArrayList();
  private zn b = null;
  private Encoding c = null;
  private String d = "boundary=";
  private String e = "X-Document-Type";
  private static final za f = new za(new String[] { "7bit", "quoted-printable", "base64", "x-encodingname" });
  
  public ArrayList a(zm paramzm, Encoding paramEncoding)
    throws Exception
  {
    this.c = paramEncoding;
    this.b = new zn(paramzm, paramEncoding);
    a();
    return this.a;
  }
  
  private void a()
    throws Exception
  {
    Object localObject = null;
    while (this.b.c() != -1)
    {
      String str1 = this.b.f();
      int i = str1.indexOf(this.e);
      if (i != -1)
      {
        String str2 = str1.substring(this.e.length() + 1);
        if (zy.a(str2, "WORKSHEET"))
        {
          b(null);
          return;
        }
      }
      else
      {
        int j = str1.indexOf(this.d);
        if (j > -1)
        {
          int k = str1.indexOf(';', j);
          int m = j + this.d.length();
          if (k < j) {
            k = str1.length();
          }
          String str3 = str1.substring(m, m + (k - m));
          if ((str3.startsWith("\"")) && (str3.endsWith("\""))) {
            str3 = str3.substring(1, 1 + (str3.length() - 2));
          }
          str3 = "--" + str3;
          localObject = str3;
          a((String)localObject);
        }
      }
    }
  }
  
  private void a(String paramString)
    throws Exception
  {
    while (this.b.c() != -1) {
      for (String str = this.b.f(); (str != null) && (str.startsWith(paramString)); str = b(paramString)) {
        if (str.endsWith("--")) {
          return;
        }
      }
    }
  }
  
  private String b(String paramString)
    throws Exception
  {
    zo localzo = null;
    zh localzh = null;
    localzh = new zh();
    localzo = new zo(localzh);
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    String str6 = null;
    String str7 = null;
    int i = 0;
    int j = 0;
    while (this.b.c() != -1)
    {
      str5 = this.b.f();
      str6 = str5.trim();
      if (j != 0)
      {
        if ((str6 == null) || ("".equals(str6)))
        {
          localzo.f();
        }
        else
        {
          if ((paramString != null) && (str6.startsWith(paramString))) {
            break;
          }
          localzo.c(str5);
        }
      }
      else
      {
        i++;
        if ((str6 != null) && (!"".equals(str6)))
        {
          localObject1 = str6.toLowerCase();
          int k = str6.indexOf(this.d);
          Object localObject2;
          if (k > -1)
          {
            localObject2 = str6.substring(str6.indexOf(this.d) + this.d.length());
            if ((((String)localObject2).startsWith("\"")) && (((String)localObject2).endsWith("\""))) {
              localObject2 = ((String)localObject2).substring(1, 1 + (((String)localObject2).length() - 2));
            }
            localObject2 = "--" + (String)localObject2;
            paramString = (String)localObject2;
            a(paramString);
            return null;
          }
          if ((paramString != null) && (str6.startsWith(paramString))) {
            break;
          }
          if (((String)localObject1).startsWith("content-location"))
          {
            str1 = zaoh.a(str6);
          }
          else if (((String)localObject1).startsWith("content-id"))
          {
            str2 = zaoh.a(str6);
            if ((str7 != null) && (str7.indexOf("base64") > -1))
            {
              if (str2.startsWith("<")) {
                str2 = str2.substring(1);
              }
              if (str2.endsWith(">")) {
                str2 = str2.substring(0, 0 + (str2.length() - 1));
              }
            }
          }
          else if (((String)localObject1).startsWith("content-type"))
          {
            localObject2 = zw.d(str6, ';');
            str3 = zaoh.a(localObject2[0]);
            if ((localObject2.length > 1) && (localObject2[1].indexOf("charset=") != -1)) {
              str4 = localObject2[1].substring("charset=".length()).trim();
            }
          }
          else if (((String)localObject1).startsWith("content-transfer-encoding"))
          {
            str7 = zaoh.a(str6);
          }
          else if (i > 3)
          {
            if ((str7 == null) || (str7.indexOf("base64") <= -1) || ((str5.indexOf(":") == -1) && (str5.indexOf(".") == -1)))
            {
              localzo.c(str5);
              j = 1;
            }
          }
        }
      }
    }
    localzo.c();
    localzh.b(0L);
    Object localObject1 = a(localzh, str7, this.c);
    if (localObject1 != null)
    {
      zapo localzapo = new zapo();
      localzapo.c = str3;
      localzapo.a = (str1 == null ? "cid:" + str2 : str1);
      localzapo.d = str4;
      localzapo.b = ((zm)localObject1);
      zf.a(this.a, localzapo);
    }
    return str6;
  }
  
  private zm a(zm paramzm, String paramString, Encoding paramEncoding)
    throws Exception
  {
    Object localObject1 = null;
    Object localObject2;
    if (paramString != null)
    {
      localObject2 = paramString.toLowerCase();
      switch (f.a((String)localObject2))
      {
      case 0: 
        break;
      case 1: 
        localObject1 = zayg.b(paramzm, paramEncoding);
        break;
      case 2: 
        zn localzn = new zn(paramzm, paramEncoding);
        String str = localzn.e();
        if (!zw.b(str)) {
          try
          {
            byte[] arrayOfByte = ze.b(str);
            localObject1 = new zh(arrayOfByte);
          }
          catch (Exception localException)
          {
            zl.b(localException);
          }
        }
        break;
      case 3: 
        break;
      }
    }
    if (localObject1 == null)
    {
      localObject2 = zx.a(paramzm, false);
      localObject1 = new zh((byte[])localObject2);
    }
    return (zm)localObject1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zapp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */