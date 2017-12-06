package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.HashMap;

class zaks
{
  private zqh a = null;
  private HashMap b = null;
  private static final za c = new za(new String[] { "Fallback", "oleItem" });
  
  zaks(zqh paramzqh, HashMap paramHashMap)
  {
    this.a = paramzqh;
    this.b = paramHashMap;
  }
  
  void a(zcjy paramzcjy)
    throws Exception
  {
    g(paramzcjy);
    if (paramzcjy.o()) {
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else if ("externalBook".equals(paramzcjy.q())) {
        e(paramzcjy);
      } else if ("oleLink".equals(paramzcjy.q())) {
        c(paramzcjy);
      } else if ("ddeLink".equals(paramzcjy.q())) {
        d(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
  }
  
  private void c(zcjy paramzcjy)
    throws Exception
  {
    String str1 = paramzcjy.a("progId");
    String str2 = null;
    String str3 = paramzcjy.a("r:id");
    if ((str3 != null) && (this.b != null))
    {
      localObject = zalb.a(this.b, str3);
      str2 = zbxt.e(((zrl)localObject).d);
    }
    Object localObject = new zbti(4);
    if (!paramzcjy.o())
    {
      paramzcjy.d();
      while (zauz.a(paramzcjy)) {
        if (("oleItems".equals(paramzcjy.q())) && (!paramzcjy.o())) {
          a(paramzcjy, (zbti)localObject);
        } else {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.a();
    if ((str1 != null) && (str2 != null)) {
      ((zbti)localObject).b(str1, str2);
    }
    int i = this.a.a.getWorksheets().w().a((zbti)localObject);
    this.a.a.getWorksheets().r().b(i & 0xFFFF, 65534, 65534);
  }
  
  private ArrayList a(zcjy paramzcjy, zbti paramzbti)
    throws Exception
  {
    ArrayList localArrayList = paramzbti.b();
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else
      {
        zwh localzwh;
        if ("oleItem".equals(paramzcjy.q()))
        {
          localzwh = c(paramzcjy, paramzbti);
          if (localzwh != null) {
            zf.a(localArrayList, localzwh);
          }
        }
        else if ("AlternateContent".equals(paramzcjy.q()))
        {
          paramzcjy.d();
          while (zauz.a(paramzcjy))
          {
            switch (c.a(paramzcjy.q()))
            {
            case 0: 
              paramzcjy.d();
              while (zauz.a(paramzcjy)) {
                switch (c.a(paramzcjy.q()))
                {
                case 1: 
                  localzwh = c(paramzcjy, paramzbti);
                  if (localzwh != null) {
                    zf.a(localArrayList, localzwh);
                  }
                  break;
                default: 
                  paramzcjy.a();
                }
              }
            }
            paramzcjy.a();
          }
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
    return localArrayList;
  }
  
  private void d(zcjy paramzcjy)
    throws Exception
  {
    String str1 = paramzcjy.a("ddeService");
    String str2 = paramzcjy.a("ddeTopic");
    zbti localzbti = new zbti(3);
    if (!paramzcjy.o())
    {
      paramzcjy.d();
      while (zauz.a(paramzcjy)) {
        if (("ddeItems".equals(paramzcjy.q())) && (!paramzcjy.o())) {
          b(paramzcjy, localzbti);
        } else {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.a();
    if ((str1 != null) && (str2 != null)) {
      localzbti.a(str1, str2);
    }
    int i = this.a.a.getWorksheets().w().a(localzbti);
    this.a.a.getWorksheets().r().b(i & 0xFFFF, 65534, 65534);
  }
  
  private void b(zcjy paramzcjy, zbti paramzbti)
    throws Exception
  {
    ArrayList localArrayList = paramzbti.b();
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("ddeItem".equals(paramzcjy.q()))
      {
        zwh localzwh = c(paramzcjy, paramzbti);
        if (localzwh != null) {
          zf.a(localArrayList, localzwh);
        }
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private zwh c(zcjy paramzcjy, zbti paramzbti)
    throws Exception
  {
    zwh localzwh = null;
    if (paramzcjy.n())
    {
      localzwh = new zwh(paramzbti);
      localzwh.d(localzwh.g() | 0x10);
      while (paramzcjy.m()) {
        if ("name".equals(paramzcjy.q())) {
          localzwh.a(paramzcjy.t());
        } else if ("ole".equals(paramzcjy.q())) {
          localzwh.a(zauj.aB(paramzcjy.t()));
        } else if ("advise".equals(paramzcjy.q())) {
          localzwh.b(zauj.aB(paramzcjy.t()));
        } else if ("preferPic".equals(paramzcjy.q())) {
          localzwh.c(zauj.aB(paramzcjy.t()));
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
    return localzwh;
  }
  
  private void e(zcjy paramzcjy)
    throws Exception
  {
    String str1 = null;
    ArrayList localArrayList = null;
    String str2 = paramzcjy.a("r:id");
    if ((str2 != null) && (this.b != null))
    {
      localObject = zalb.a(this.b, str2);
      str1 = zbxt.e(((zrl)localObject).d);
    }
    Object localObject = new zbti(0);
    int i = this.a.a.getWorksheets().w().a((zbti)localObject);
    if (!paramzcjy.o())
    {
      paramzcjy.d();
      while (zauz.a(paramzcjy)) {
        if (("sheetNames".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          localArrayList = f(paramzcjy);
          String[] arrayOfString = new String[localArrayList.size()];
          for (int j = 0; j < localArrayList.size(); j++)
          {
            arrayOfString[j] = ((String)localArrayList.get(j));
            this.a.a.getWorksheets().r().b(i & 0xFFFF, j & 0xFFFF, j & 0xFFFF);
          }
          ((zbti)localObject).a(arrayOfString);
        }
        else if (("definedNames".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          f(paramzcjy, (zbti)localObject);
        }
        else if (("sheetDataSet".equals(paramzcjy.q())) && (!paramzcjy.o()))
        {
          d(paramzcjy, (zbti)localObject);
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.a();
    ((zbti)localObject).d(str1);
  }
  
  private void d(zcjy paramzcjy, zbti paramzbti)
    throws Exception
  {
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else if ("sheetData".equals(paramzcjy.q())) {
        e(paramzcjy, paramzbti);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void e(zcjy paramzcjy, zbti paramzbti)
    throws Exception
  {
    String str1 = paramzcjy.a("sheetId");
    zwr localzwr = paramzbti.b(zauj.F(str1));
    String str2 = paramzcjy.a("refreshError");
    if (str2 != null) {
      localzwr.a().a(3, str2);
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else if (("row".equals(paramzcjy.q())) && (!paramzcjy.o())) {
        a(paramzcjy, localzwr);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void a(zcjy paramzcjy, zwr paramzwr)
    throws Exception
  {
    String str = paramzcjy.a("r");
    zwn localzwn = paramzwr.e(zauj.F(str) - 1);
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else if (("cell".equals(paramzcjy.q())) && (!paramzcjy.o())) {
        a(paramzcjy, localzwn);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void a(zcjy paramzcjy, zwn paramzwn)
    throws Exception
  {
    String str1 = paramzcjy.a("r");
    String str2 = paramzcjy.a("t");
    String str3 = null;
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("v".equals(paramzcjy.q()))
      {
        paramzcjy.c(b(paramzcjy));
        str3 = paramzcjy.j();
        paramzcjy.c(false);
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
    int i = -1;
    int j = -1;
    Object localObject = null;
    if ((str3 != null) && (str1 != null))
    {
      int[] arrayOfInt1 = { j };
      int[] arrayOfInt2 = { i };
      CellsHelper.a(str1, arrayOfInt1, arrayOfInt2);
      j = arrayOfInt1[0];
      i = arrayOfInt2[0];
      if (("n".equals(str2)) || (str2 == null))
      {
        localObject = Double.valueOf(zauj.C(str3));
      }
      else if ("str".equals(str2))
      {
        localObject = str3;
      }
      else if ("b".equals(str2))
      {
        localObject = Boolean.valueOf(zauj.aB(str3));
      }
      else if ("e".equals(str2))
      {
        int k = 1;
        boolean[] arrayOfBoolean = { k };
        localObject = ztr.a(str3, arrayOfBoolean);
        k = arrayOfBoolean[0];
        if (k == 0) {
          localObject = str3;
        }
      }
      else
      {
        localObject = str3;
      }
    }
    if (i != -1) {
      paramzwn.a(i, localObject);
    }
  }
  
  static boolean b(zcjy paramzcjy)
  {
    String str = paramzcjy.a("space", null);
    return str != null;
  }
  
  private ArrayList f(zcjy paramzcjy)
    throws Exception
  {
    ArrayList localArrayList = new ArrayList();
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("sheetName".equals(paramzcjy.q()))
      {
        String str = paramzcjy.a("val");
        paramzcjy.a();
        zf.a(localArrayList, str);
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
    return localArrayList;
  }
  
  private void f(zcjy paramzcjy, zbti paramzbti)
    throws Exception
  {
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("definedName".equals(paramzcjy.q()))
      {
        zwh localzwh = new zwh(paramzbti);
        localzwh.a(paramzcjy.a("name"));
        String str1 = paramzcjy.a("refersTo");
        String str2 = paramzcjy.a("sheetId");
        paramzcjy.a();
        if (str2 != null) {
          localzwh.c(zauj.F(str2) + 1);
        }
        if ((str1 != null) && (!"".equals(str1))) {
          localzwh.a(this.a.a.getWorksheets(), str1);
        }
        zf.a(paramzbti.b(), localzwh);
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void g(zcjy paramzcjy)
    throws Exception
  {
    paramzcjy.k();
    if ((paramzcjy.s() != 1) || (!"externalLink".equals(paramzcjy.q()))) {
      throw new CellsException(6, "externalLink root element eror");
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaks.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */