package com.aspose.cells;

import com.aspose.cells.a.c.zh;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zaln
{
  private Workbook a = null;
  private zrs b = null;
  private zcjm c = null;
  private Chart d;
  private static final za e = new za(new String[] { "lnStyleLst", "fillStyleLst" });
  
  zaln(Workbook paramWorkbook)
  {
    this.a = paramWorkbook;
    this.b = this.a.d();
  }
  
  zaln(zrs paramzrs)
  {
    this.b = paramzrs;
  }
  
  zaln(Chart paramChart)
  {
    this.d = paramChart;
    this.a = paramChart.getWorksheet().d();
    this.b = paramChart.O();
  }
  
  void a(zcjm paramzcjm, boolean paramBoolean)
    throws Exception
  {
    this.b.a();
    this.c = paramzcjm;
    a();
    if (paramBoolean) {
      this.b.b = paramzcjm.c();
    }
  }
  
  private void a()
    throws Exception
  {
    if ((this.c.d_() != null) && ("http://schemas.openxmlformats.org/drawingml/2006/3/main".equals(this.c.d_().a("xmlns"))) && (this.a != null) && (this.a.a != null)) {
      this.a.a.d = true;
    }
    zcju localzcju;
    if (this.d != null)
    {
      localzcju = this.c.d_().l();
    }
    else
    {
      localObject1 = zauj.b(this.c.d_(), "themeElements");
      if (localObject1 == null) {
        return;
      }
      localzcju = ((zcjn)localObject1).l();
    }
    Object localObject1 = localzcju.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = ((Iterator)localObject1).next();
      if ((localObject2 instanceof zcjn))
      {
        zcjn localzcjn = (zcjn)localObject2;
        String str = localzcjn.g;
        if ("clrScheme".equals(str)) {
          d(localzcjn);
        } else if ("fontScheme".equals(str)) {
          b(localzcjn);
        } else if ("fmtScheme".equals(str)) {
          a(localzcjn);
        }
      }
    }
  }
  
  private void a(zcjn paramzcjn)
    throws Exception
  {
    try
    {
      HashMap localHashMap = new HashMap();
      zcjy localzcjy = new zcjy(paramzcjn.b(), false);
      localzcjy.k();
      while (zauz.a(localzcjy)) {
        switch (e.a(localzcjy.q()))
        {
        case 0: 
          a(localzcjy);
          break;
        case 1: 
          a(localzcjy, localHashMap);
          break;
        default: 
          localzcjy.a();
        }
      }
    }
    catch (Exception localException) {}
  }
  
  private void a(zcjy paramzcjy, HashMap paramHashMap)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy))
    {
      FillFormat localFillFormat = null;
      if ("noFill".equals(paramzcjy.q()))
      {
        localFillFormat = new FillFormat(null);
        zalf.a(paramzcjy, localFillFormat);
      }
      else if ("solidFill".equals(paramzcjy.q()))
      {
        localFillFormat = new FillFormat(null);
        zalf.b(paramzcjy, localFillFormat);
      }
      else if ("pattFill".equals(paramzcjy.q()))
      {
        localFillFormat = new FillFormat(null);
        zalf.c(paramzcjy, localFillFormat);
      }
      else if ("gradFill".equals(paramzcjy.q()))
      {
        localFillFormat = new FillFormat(null);
        zalf.d(paramzcjy, localFillFormat);
      }
      else if ("blipFill".equals(paramzcjy.q()))
      {
        localFillFormat = new FillFormat(null);
        zalf.a(paramzcjy, localFillFormat, paramHashMap);
      }
      else
      {
        paramzcjy.a();
      }
      if (localFillFormat != null) {
        this.b.d().add(localFillFormat);
      }
    }
  }
  
  private void a(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("ln".equals(paramzcjy.q()))
      {
        LineFormat localLineFormat = new LineFormat(null);
        this.b.c().add(localLineFormat);
        zalf.a(paramzcjy, localLineFormat);
      }
      else
      {
        paramzcjy.a();
      }
    }
  }
  
  private void b(zcjn paramzcjn)
  {
    zcjn localzcjn1 = zauj.b(paramzcjn, "majorFont");
    if (localzcjn1 != null) {
      this.b.f.b = c(localzcjn1);
    }
    zcjn localzcjn2 = zauj.b(paramzcjn, "minorFont");
    if (localzcjn2 != null) {
      this.b.f.c = c(localzcjn2);
    }
  }
  
  private zpx c(zcjn paramzcjn)
  {
    zpx localzpx = new zpx();
    Iterator localIterator = paramzcjn.l().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      if ((localObject instanceof zcjn))
      {
        zcjn localzcjn = (zcjn)localObject;
        String str1 = localzcjn.g;
        String str2;
        if ("latin".equals(str1))
        {
          str2 = zauj.a(localzcjn, "typeface");
          if ((str2 != null) && (!"".equals(str2))) {
            localzpx.a = str2;
          }
        }
        else if ("ea".equals(str1))
        {
          str2 = zauj.a(localzcjn, "typeface");
          if ((str2 != null) && (!"".equals(str2))) {
            localzpx.b = str2;
          }
        }
        else if ("cs".equals(str1))
        {
          str2 = zauj.a(localzcjn, "typeface");
          if ((str2 != null) && (!"".equals(str2))) {
            localzpx.c = str2;
          }
        }
        else if ("font".equals(str1))
        {
          str2 = zauj.a(localzcjn, "script");
          String str3 = zauj.a(localzcjn, "typeface");
          if ((str2 != null) && (str3 != null))
          {
            int i = this.b.f.a(str2);
            if (i != -1) {
              localzpx.d.put(Integer.valueOf(i), str3);
            }
          }
        }
      }
    }
    return localzpx;
  }
  
  private void d(zcjn paramzcjn)
  {
    this.b.a = zauj.a(paramzcjn, "name");
    zcju localzcju = paramzcjn.l();
    for (int i = 0; i < localzcju.a(); i++)
    {
      zcjs localzcjs = localzcju.a(i);
      if ((localzcjs instanceof zcjn))
      {
        zpa localzpa = e((zcjn)localzcjs);
        if (localzpa != null)
        {
          int j = zauj.al(localzpa.b);
          this.b.e[j] = localzpa;
        }
      }
    }
  }
  
  private zpa e(zcjn paramzcjn)
  {
    zpa localzpa = new zpa();
    localzpa.a(Color.getEmpty());
    zcju localzcju = paramzcjn.l();
    for (int i = 0; i < localzcju.a(); i++) {
      if ((localzcju.a(i) instanceof zcjn))
      {
        zcjn localzcjn = (zcjn)localzcju.a(i);
        String str = null;
        zcjg localzcjg1;
        Object localObject;
        if ("sysClr".equals(localzcjn.g))
        {
          localzcjg1 = zauz.a(localzcjn, "lastClr");
          if (localzcjg1 != null) {
            str = localzcjg1.h;
          }
          localObject = zauz.a(localzcjn, "val");
          if (localObject != null)
          {
            localzpa.c = ((zcjg)localObject).h;
            if (str == null) {
              if ("window".equals(((zcjg)localObject).h)) {
                str = "ffffff";
              } else {
                str = "000000";
              }
            }
          }
          localzpa.a(true);
        }
        if ("srgbClr".equals(localzcjn.g))
        {
          localzcjg1 = zauz.a(localzcjn, "val");
          if (localzcjg1 != null) {
            str = localzcjg1.h;
          }
          localObject = new ArrayList();
          Iterator localIterator = localzcjn.e().iterator();
          while (localIterator.hasNext())
          {
            zcjg localzcjg2 = (zcjg)localIterator.next();
            if (!"val".equals(localzcjg2.k())) {
              zf.a((ArrayList)localObject, new zou(localzcjg2.k(), localzcjg2.h));
            }
          }
          if (((ArrayList)localObject).size() > 0) {
            localzpa.d.a(4, localObject);
          }
        }
        if (str == null) {
          break;
        }
        localzpa.a = zauj.s(str);
        break;
      }
    }
    localzpa.b = paramzcjn.g;
    if (zh.a(localzpa.a())) {
      return null;
    }
    return localzpa;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaln.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */