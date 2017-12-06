package com.aspose.cells;

import com.aspose.cells.b.a.zs;
import java.util.ArrayList;

class zuy
  extends ztp
{
  private zbti b = null;
  private zpt c = null;
  
  zuy(zpt paramzpt, zbti paramzbti)
  {
    this.c = paramzpt;
    this.b = paramzbti;
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b(true);
    paramzcjz.b("externalLink");
    paramzcjz.a("xmlns", zaty.a);
    if (this.b.a() == 0) {
      b(paramzcjz);
    } else if (this.b.a() == 3) {
      f(paramzcjz);
    } else if (this.b.a() == 4) {
      h(paramzcjz);
    } else {
      throw new CellsException(6, "Invalid SupBook Type " + this.b.a());
    }
    paramzcjz.b();
    paramzcjz.d();
    paramzcjz.e();
  }
  
  private void b(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("externalBook");
    paramzcjz.a("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
    paramzcjz.a("r:id", "rId1");
    d(paramzcjz);
    e(paramzcjz);
    c(paramzcjz);
    paramzcjz.b();
  }
  
  private void c(zcjz paramzcjz)
    throws Exception
  {
    String[] arrayOfString1 = this.b.c();
    if ((arrayOfString1 == null) || (arrayOfString1.length == 0)) {
      return;
    }
    int i = arrayOfString1.length;
    int j = 0;
    zwr localzwr;
    for (int k = 0; k < i; k++)
    {
      localzwr = this.b.a(arrayOfString1[k], false);
      if (localzwr != null)
      {
        j = 1;
        break;
      }
    }
    if (j == 0) {
      return;
    }
    paramzcjz.b("sheetDataSet");
    for (k = 0; k < i; k++)
    {
      localzwr = this.b.a(arrayOfString1[k], false);
      if (localzwr != null)
      {
        paramzcjz.b("sheetData");
        paramzcjz.a("sheetId", zauj.z(k));
        Object localObject1;
        if (localzwr.b != null)
        {
          localObject1 = localzwr.b.a(3);
          if (localObject1 != null) {
            paramzcjz.a("refreshError", (String)localObject1);
          }
        }
        if (localzwr.c())
        {
          localObject1 = localzwr.a;
          int m = ((ArrayList)localObject1).size();
          for (int n = 0; n < m; n++)
          {
            zwn localzwn = (zwn)((ArrayList)localObject1).get(n);
            paramzcjz.b("row");
            paramzcjz.a("r", zauj.z(localzwn.a() + 1));
            if (localzwn.d())
            {
              ArrayList localArrayList = localzwn.f();
              int i1 = localArrayList.size();
              for (int i2 = 0; i2 < i1; i2++)
              {
                zwj localzwj = (zwj)localArrayList.get(i2);
                if (localzwj.a() != 3)
                {
                  paramzcjz.b("cell");
                  paramzcjz.a("r", CellsHelper.cellIndexToName(localzwn.a(), localzwj.a));
                  Object localObject2 = null;
                  String str = null;
                  String[] arrayOfString2 = { localObject2 };
                  String[] arrayOfString3 = { str };
                  a(localzwj, arrayOfString2, arrayOfString3);
                  localObject2 = arrayOfString2[0];
                  str = arrayOfString3[0];
                  if (!"n".equals(localObject2)) {
                    paramzcjz.a("t", (String)localObject2);
                  }
                  paramzcjz.b("v", str);
                  paramzcjz.b();
                }
              }
            }
            paramzcjz.b();
          }
        }
        paramzcjz.b();
      }
    }
    paramzcjz.b();
  }
  
  private void a(zwj paramzwj, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    Object localObject = paramzwj.b;
    switch (paramzwj.a())
    {
    case 1: 
    case 4: 
      paramArrayOfString1[0] = "n";
      paramArrayOfString2[0] = zauj.b(((Double)localObject).doubleValue());
      break;
    case 5: 
      paramArrayOfString1[0] = "str";
      paramArrayOfString2[0] = ((String)localObject);
      break;
    case 0: 
      paramArrayOfString1[0] = "b";
      paramArrayOfString2[0] = (((Boolean)localObject).booleanValue() ? "1" : "0");
      break;
    case 2: 
      paramArrayOfString1[0] = "e";
      paramArrayOfString2[0] = ztr.a((zuf)localObject);
      break;
    case 3: 
    default: 
      paramArrayOfString1[0] = "str";
      paramArrayOfString2[0] = zs.a(localObject);
    }
  }
  
  private void d(zcjz paramzcjz)
    throws Exception
  {
    String[] arrayOfString = this.b.c();
    if ((arrayOfString == null) || (arrayOfString.length == 0)) {
      return;
    }
    paramzcjz.b("sheetNames");
    for (int i = 0; i < arrayOfString.length; i++)
    {
      String str = arrayOfString[i];
      paramzcjz.b("sheetName");
      paramzcjz.a("val", str);
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void e(zcjz paramzcjz)
    throws Exception
  {
    ArrayList localArrayList = this.b.b();
    if (localArrayList.size() == 0) {
      return;
    }
    paramzcjz.b("definedNames");
    for (int i = 0; i < localArrayList.size(); i++)
    {
      zwh localzwh = (zwh)localArrayList.get(i);
      paramzcjz.b("definedName");
      paramzcjz.a("name", localzwh.e());
      if ((localzwh.d() < 65535) && (localzwh.d() > 0)) {
        paramzcjz.a("sheetId", zauj.z(localzwh.d() - 1));
      }
      String str = localzwh.a(this.c.a.getWorksheets());
      if ((str != null) && (!"".equals(str))) {
        paramzcjz.a("refersTo", str);
      }
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void f(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("ddeLink");
    String str1 = null;
    String str2 = null;
    String[] arrayOfString1 = { str1 };
    String[] arrayOfString2 = { str2 };
    this.b.a(arrayOfString1, arrayOfString2);
    str1 = arrayOfString1[0];
    str2 = arrayOfString2[0];
    paramzcjz.a("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
    paramzcjz.a("ddeService", str1);
    paramzcjz.a("ddeTopic", str2);
    g(paramzcjz);
    paramzcjz.b();
  }
  
  private void g(zcjz paramzcjz)
    throws Exception
  {
    ArrayList localArrayList = this.b.b();
    if (localArrayList.size() == 0) {
      return;
    }
    paramzcjz.b("ddeItems");
    for (int i = 0; i < localArrayList.size(); i++)
    {
      zwh localzwh = (zwh)localArrayList.get(i);
      paramzcjz.b("ddeItem");
      paramzcjz.a("name", localzwh.e());
      if (localzwh.j()) {
        paramzcjz.a("ole", "1");
      }
      if (localzwh.k()) {
        paramzcjz.a("advise", "1");
      }
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void h(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("oleLink");
    String str = null;
    Object localObject = null;
    String[] arrayOfString1 = { str };
    String[] arrayOfString2 = { localObject };
    this.b.a(arrayOfString1, arrayOfString2);
    str = arrayOfString1[0];
    localObject = arrayOfString2[0];
    paramzcjz.a("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
    paramzcjz.a("r:id", "rId1");
    paramzcjz.a("progId", str);
    i(paramzcjz);
    paramzcjz.b();
  }
  
  private void i(zcjz paramzcjz)
    throws Exception
  {
    ArrayList localArrayList = this.b.b();
    if (localArrayList.size() == 0) {
      return;
    }
    paramzcjz.b("oleItems");
    for (int i = 0; i < localArrayList.size(); i++)
    {
      zwh localzwh = (zwh)localArrayList.get(i);
      paramzcjz.b("oleItem");
      paramzcjz.a("name", localzwh.e());
      if (localzwh.k()) {
        paramzcjz.a("advise", "1");
      }
      if (localzwh.l()) {
        paramzcjz.a("preferPic", "1");
      }
      paramzcjz.b();
    }
    paramzcjz.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zuy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */