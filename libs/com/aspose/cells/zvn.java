package com.aspose.cells;

import java.util.ArrayList;
import java.util.HashMap;

class zvn
  extends ztp
{
  private Workbook b;
  private zpt c;
  private zvq d;
  
  zvn(zpt paramzpt, zvq paramzvq)
  {
    this.b = paramzpt.a;
    this.c = paramzpt;
    this.d = paramzvq;
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b(true);
    paramzcjz.b("sst");
    if (zauj.a) {
      paramzcjz.a("xmlns", zaty.a);
    } else {
      paramzcjz.a("xmlns", zaty.b);
    }
    zajl localzajl = this.b.getWorksheets().g;
    paramzcjz.a("count", zauj.a(localzajl.b() & 0xFFFFFFFF));
    int i = localzajl.c();
    paramzcjz.a("uniqueCount", zauj.z(i));
    for (int j = 0; j < i; j++)
    {
      zbbj localzbbj = localzajl.a(j);
      paramzcjz.b("si");
      if (localzbbj == null)
      {
        a(paramzcjz, "r");
      }
      else
      {
        if (localzbbj.f()) {
          a(paramzcjz, (zbdd)localzbbj, this.b);
        } else {
          a(paramzcjz, localzbbj);
        }
        if (localzbbj.g())
        {
          zawa localzawa = ((zawb)localzbbj).a();
          if ((localzawa != null) && (localzawa.c.getCount() > 0)) {
            a(paramzcjz, localzawa, this.d);
          }
        }
      }
      paramzcjz.b();
    }
    paramzcjz.b();
    paramzcjz.d();
    paramzcjz.e();
  }
  
  static void a(zcjz paramzcjz, zawa paramzawa, zvq paramzvq)
    throws Exception
  {
    for (int i = 0; i < paramzawa.c.getCount(); i++)
    {
      zavy localzavy = paramzawa.c.a(i);
      paramzcjz.b("rPh");
      paramzcjz.a("sb", null, zauj.z(localzavy.a));
      paramzcjz.a("eb", null, zauj.z(localzavy.a + localzavy.b - 1));
      a(paramzcjz, localzavy.c);
      paramzcjz.b();
    }
    paramzcjz.b("phoneticPr");
    if (paramzvq.b.b.containsKey(Integer.valueOf(paramzawa.b)))
    {
      i = ((Integer)paramzvq.b.b.get(Integer.valueOf(paramzawa.b))).intValue();
      paramzcjz.a("fontId", null, zauj.z(i));
    }
    String str;
    if (paramzawa.a() != 2)
    {
      str = "left";
      switch (paramzawa.a())
      {
      case 0: 
        str = "center";
        break;
      case 1: 
        str = "Distributed";
        break;
      case 3: 
        str = "noControl";
      }
      paramzcjz.a("alignment", null, str);
    }
    if (paramzawa.b() != 0)
    {
      str = "fullwidthKatakana";
      switch (paramzawa.b())
      {
      case 1: 
        str = "halfwidthKatakana";
        break;
      case 2: 
        str = "Hiragana";
        break;
      case 3: 
        str = "noConversion";
      }
      paramzcjz.a("type", null, str);
    }
    paramzcjz.b();
  }
  
  static void a(zcjz paramzcjz, zbbj paramzbbj)
    throws Exception
  {
    String str = paramzbbj.c;
    if (str.length() > 32767) {
      str = str.substring(0, 32767);
    }
    a(paramzcjz, str);
  }
  
  static void a(zcjz paramzcjz, String paramString)
    throws Exception
  {
    paramzcjz.b("t");
    if ((paramString != null) && (!"".equals(paramString)))
    {
      if (zauj.ap(paramString)) {
        paramzcjz.a("xml:space", null, "preserve");
      }
      paramzcjz.a(paramString);
    }
    paramzcjz.b();
  }
  
  static void a(zcjz paramzcjz, zbdd paramzbdd, Workbook paramWorkbook)
    throws Exception
  {
    if (paramzbdd.h().length == 0)
    {
      a(paramzcjz, paramzbdd.c);
    }
    else
    {
      ArrayList localArrayList = zqb.a(paramzbdd, null, paramWorkbook);
      for (int i = 0; i < localArrayList.size(); i++)
      {
        zqb localzqb = (zqb)localArrayList.get(i);
        paramzcjz.b("r");
        if (localzqb.b != null)
        {
          paramzcjz.b("rPr");
          zvq.a(localzqb.b, paramzcjz, "rFont");
          paramzcjz.b();
        }
        a(paramzcjz, localzqb.a);
        paramzcjz.b();
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zvn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */