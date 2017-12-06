package com.aspose.cells;

import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.HashMap;

class zarf
{
  HashMap a = new HashMap();
  Workbook b = null;
  private HashMap j = new HashMap();
  private HashMap k = new HashMap();
  private HashMap l = new HashMap();
  HashMap c = new HashMap();
  HashMap d = new HashMap();
  HashMap e = new HashMap();
  HashMap f = new HashMap();
  CopyOptions g = null;
  HashMap h = new HashMap();
  HashMap i = new HashMap();
  private static final za m = new za(new String[] { "pattern", "du", "d" });
  
  zarf(Workbook paramWorkbook)
  {
    this.b = paramWorkbook;
    this.g = new CopyOptions(0, paramWorkbook, paramWorkbook);
  }
  
  void a(String paramString, zarl paramzarl)
  {
    this.k.put(paramString, paramzarl);
  }
  
  Border a(String paramString)
  {
    Border localBorder = (Border)this.l.get(paramString);
    if (localBorder != null) {
      return localBorder;
    }
    zarl localzarl = (zarl)this.k.get(paramString);
    if ((localzarl == null) || (localzarl.a == null)) {
      return null;
    }
    zari localzari = localzarl.a;
    localBorder = new Border(null);
    this.l.put(paramString, localBorder);
    if ((localzari.f != null) && (localzari.f.b != null) && (!"none".equals(localzari.f.b)))
    {
      int n = 0;
      double d1 = localzari.c;
      switch (m.a(localzari.f.b))
      {
      case 0: 
        if ((localzari.f.c != null) && (localzari.f.c.size() > 0))
        {
          boolean bool = "round".equals(localzari.d);
          n = bool ? 4 : 3;
          if ((d1 > 1.0D) && (n == 3)) {
            n = 8;
          }
        }
        break;
      default: 
        if (d1 <= 1.0D) {
          n = 1;
        } else if (d1 <= 2.0D) {
          n = 2;
        } else {
          n = 5;
        }
        break;
      }
      localBorder.b(n);
    }
    if (localzari.a) {
      localBorder.a.a(2, localzari.a().toArgb());
    }
    return localBorder;
  }
  
  void a(String paramString, zarj paramzarj)
  {
    this.j.put(paramString, paramzarj);
  }
  
  Style a(String paramString1, String paramString2)
  {
    zarj localzarj = (zarj)this.j.get(paramString1);
    if (localzarj == null) {
      return null;
    }
    return localzarj.a;
  }
  
  int b(String paramString1, String paramString2)
  {
    zarj localzarj = (zarj)this.j.get(paramString1);
    if (localzarj == null) {
      return -1;
    }
    if (paramString2 != null) {
      switch (m.a(paramString2))
      {
      case 1: 
        if (localzarj.g != -1) {
          return localzarj.g;
        }
        localzarj.a.setCustom(localzarj.d == null ? "[h]\"h\" m\"m\" s\"s\"" : localzarj.d);
        localzarj.g = this.b.getWorksheets().a(localzarj.a);
        return localzarj.g;
      case 2: 
        if (localzarj.f != -1) {
          return localzarj.f;
        }
        localzarj.a.setCustom(localzarj.c);
        localzarj.f = this.b.getWorksheets().a(localzarj.a);
        return localzarj.f;
      }
    }
    if (localzarj.e != -1) {
      return localzarj.e;
    }
    localzarj.a.setCustom(localzarj.b);
    localzarj.e = this.b.getWorksheets().a(localzarj.a);
    return localzarj.e;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zarf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */