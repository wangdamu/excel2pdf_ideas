package com.aspose.cells;

import com.aspose.cells.a.c.zu;
import com.aspose.cells.a.f.zh;
import com.aspose.cells.a.f.zi;
import com.aspose.cells.b.a.a.zd;
import com.aspose.cells.b.a.d.zk;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

abstract class ze
  implements zj
{
  Workbook a;
  zqh b;
  zi c = null;
  
  ze(Workbook paramWorkbook, LoadOptions paramLoadOptions)
  {
    this.a = paramWorkbook;
    this.b = new zqh(paramWorkbook, paramLoadOptions);
    this.c = (paramWorkbook.a == null ? null : paramWorkbook.a.a.b);
  }
  
  void a()
    throws Exception
  {
    zrl localzrl = zalb.a(this.b.b(), "http://schemas.microsoft.com/office/2006/relationships/vbaProject", true);
    if (localzrl != null)
    {
      String str1 = zk.b(localzrl.d);
      String str2 = "xl/" + str1;
      VbaProject localVbaProject = null;
      if (this.c.a(str2, true) != -1)
      {
        localVbaProject = new VbaProject(this.a, null, str2);
        this.a.getWorksheets().a(localVbaProject);
      }
      String str3 = "xl/_rels/" + str1 + ".rels";
      zcjy localzcjy = zauy.a(this.c, str3, true);
      if (localzcjy != null)
      {
        HashMap localHashMap = zalb.b(localzcjy);
        localzrl = zalb.a(localHashMap, "http://schemas.microsoft.com/office/2006/relationships/vbaProjectSignature", true);
        String str4;
        if (localzrl != null)
        {
          str4 = "xl/" + zk.b(localzrl.d);
          localVbaProject.a(a(this.c, str4));
        }
        localzrl = zalb.a(localHashMap, "http://schemas.microsoft.com/office/2014/relationships/vbaProjectSignatureAgile", true);
        if (localzrl != null)
        {
          str4 = "xl/" + zk.b(localzrl.d);
          localVbaProject.b = a(this.c, str4);
        }
        if (localHashMap.size() > 0) {
          localVbaProject.a = localHashMap;
        }
      }
    }
  }
  
  void b()
    throws Exception
  {
    HashMap localHashMap = this.b.b();
    Iterator localIterator1 = localHashMap.values().iterator();
    zd localzd = new zd();
    Object localObject1;
    Object localObject2;
    Object localObject3;
    while (localIterator1.hasNext())
    {
      localObject1 = (zrl)localIterator1.next();
      if ((((zrl)localObject1).c != null) && (((zrl)localObject1).c.equals("http://schemas.openxmlformats.org/officeDocument/2006/relationships/customXml")))
      {
        localObject2 = ((zrl)localObject1).d;
        if (((String)localObject2).startsWith("../")) {
          localObject2 = ((String)localObject2).substring(3);
        } else if (((String)localObject2).startsWith("/")) {
          localObject2 = ((String)localObject2).substring(1);
        }
        localObject3 = zu.b((String)localObject2);
        if (!localzd.b(localObject3)) {
          localzd.a(localObject3, localObject2);
        }
      }
    }
    localIterator1 = localzd.f().iterator();
    while (localIterator1.hasNext())
    {
      localObject1 = (String)localIterator1.next();
      localObject2 = a(this.c, (String)localObject1);
      localObject3 = null;
      String str1 = zu.b((String)localObject1);
      String str2 = ((String)localObject1).substring(0, 0 + (((String)localObject1).length() - str1.length()));
      String str3 = str2 + "_rels/" + str1 + ".rels";
      zcjy localzcjy = zauy.a(this.c, str3, true);
      if (localzcjy != null)
      {
        ArrayList localArrayList = zalb.a(localzcjy);
        Iterator localIterator2 = localArrayList.iterator();
        while (localIterator2.hasNext())
        {
          zrl localzrl = (zrl)localIterator2.next();
          if (localzrl.c.equals("http://schemas.openxmlformats.org/officeDocument/2006/relationships/customXmlProps"))
          {
            localObject3 = a(this.c, str2 + localzrl.d);
            break;
          }
        }
      }
      if ((localObject2 != null) || (localObject3 != null)) {
        this.a.getCustomXmlParts().add((byte[])localObject2, (byte[])localObject3);
      }
    }
  }
  
  static byte[] a(zi paramzi, String paramString)
    throws Exception
  {
    zh localzh = paramzi.a(paramString);
    if (localzh == null) {
      return null;
    }
    zm localzm = paramzi.a(localzh);
    byte[] arrayOfByte = new byte[(int)localzh.a()];
    localzm.a(arrayOfByte, 0, (int)localzh.a());
    localzm.a();
    return arrayOfByte;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */