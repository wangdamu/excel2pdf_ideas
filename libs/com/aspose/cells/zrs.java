package com.aspose.cells;

import com.aspose.cells.b.a.d.zh;
import java.util.ArrayList;
import java.util.HashMap;

class zrs
{
  String a = "Office";
  String b = null;
  int c = -1;
  HashMap d = null;
  zpa[] e = new zpa[12];
  zrt f = new zrt();
  ArrayList g;
  ArrayList h;
  
  void a()
  {
    this.b = null;
    this.d = null;
    this.e = new zpa[12];
    this.f = new zrt();
    this.g = null;
    this.h = null;
  }
  
  void a(String paramString, Color[] paramArrayOfColor)
  {
    this.a = paramString;
    this.e = new zpa[12];
    for (int i = 0; i < paramArrayOfColor.length; i++)
    {
      zpa localzpa = new zpa();
      localzpa.a(paramArrayOfColor[i]);
      this.e[i] = localzpa;
      localzpa.b = zauj.ag(i);
    }
  }
  
  void a(zrs paramzrs)
  {
    this.a = paramzrs.a;
    this.e = new zpa[12];
    for (int i = 0; i < paramzrs.e.length; i++)
    {
      zpa localzpa = new zpa();
      localzpa.a(paramzrs.e[i]);
      this.e[i] = localzpa;
    }
    this.b = paramzrs.b;
    this.d = paramzrs.d;
  }
  
  boolean b()
  {
    return (com.aspose.cells.b.a.zw.a(this.a, "Office", true) != 0) || (this.b != null);
  }
  
  ArrayList c()
  {
    if (this.g == null) {
      this.g = new ArrayList();
    }
    return this.g;
  }
  
  ArrayList d()
  {
    if (this.h == null) {
      this.h = new ArrayList();
    }
    return this.h;
  }
  
  LineFormat e()
  {
    if (this.g == null) {
      return null;
    }
    if (this.g.size() > 0) {
      return (LineFormat)this.g.get(0);
    }
    return null;
  }
  
  zrs(boolean paramBoolean)
  {
    if (paramBoolean) {
      f();
    }
    for (int i = 0; i < 12; i++)
    {
      zpa localzpa = this.e[i];
      if (localzpa == null) {
        this.e[i] = b(i);
      }
    }
  }
  
  Color a(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > this.e.length - 1)) {
      return Color.getEmpty();
    }
    return this.e[paramInt].a();
  }
  
  Color a(String paramString)
  {
    if (paramString == null) {
      return Color.getEmpty();
    }
    int i = zauj.al(paramString);
    return a(i);
  }
  
  boolean b(zrs paramzrs)
  {
    for (int i = 0; i < paramzrs.e.length; i++) {
      if (this.e[i].a().toArgb() != paramzrs.e[i].a().toArgb()) {
        return false;
      }
    }
    return true;
  }
  
  void f()
  {
    try
    {
      zcjm localzcjm = zauz.a(new zh(com.aspose.cells.a.c.zw.c()));
      zaln localzaln = new zaln(this);
      localzaln.a(localzcjm, false);
    }
    catch (Exception localException) {}
  }
  
  private zpa b(int paramInt)
  {
    zpa localzpa;
    switch (paramInt)
    {
    case 0: 
      localzpa = new zpa();
      localzpa.b = "lt1";
      localzpa.a(zauj.s("ffffff"));
      localzpa.a(true);
      localzpa.c = "window";
      return localzpa;
    case 1: 
      localzpa = new zpa();
      localzpa.b = "dk1";
      localzpa.a(zauj.s("000000"));
      localzpa.a(true);
      localzpa.c = "windowText";
      return localzpa;
    case 2: 
      return a("lt2", "EEECE1");
    case 3: 
      return a("dk2", "1F497D");
    case 4: 
      return a("accent1", "4F81BD");
    case 5: 
      return a("accent2", "C0504D");
    case 6: 
      return a("accent3", "9BBB59");
    case 7: 
      return a("accent4", "8064A2");
    case 8: 
      return a("accent5", "4BACC6");
    case 9: 
      return a("accent6", "F79646");
    case 10: 
      return a("hlink", "0000FF");
    case 11: 
      return a("folHlink", "800080");
    }
    return a("lt1", "000000");
  }
  
  private zpa a(String paramString1, String paramString2)
  {
    zpa localzpa = new zpa();
    localzpa.b = paramString1;
    localzpa.a(zauj.s(paramString2));
    return localzpa;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zrs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */