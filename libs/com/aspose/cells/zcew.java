package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcew
{
  private Workbook a;
  private zchd b;
  private zcbw c;
  private Worksheet d;
  private zqi e;
  private zqh f;
  private int g;
  private byte[] h;
  private int i;
  private Cells j;
  
  zcew(zchd paramzchd)
  {
    this.b = paramzchd;
    this.a = paramzchd.a;
    this.f = paramzchd.b;
  }
  
  void a(zqi paramzqi, zcbw paramzcbw)
    throws Exception
  {
    this.e = paramzqi;
    this.d = paramzqi.d;
    this.j = this.d.getCells();
    this.d.setType(2);
    this.d.getCharts().a(new Chart(this.d));
    this.c = paramzcbw;
    for (;;)
    {
      this.g = this.c.a();
      switch (this.g)
      {
      case 130: 
        this.c.a(1L);
        return;
      case 651: 
        a();
        break;
      case 139: 
        b();
        break;
      case 669: 
        c();
        break;
      case 476: 
        d();
        break;
      case 652: 
        e();
        break;
      case 479: 
        f();
        break;
      case 550: 
        this.h = this.b.a(this.c);
        paramzqi.h = zcgj.d(this.h, 0);
        break;
      case 551: 
        this.h = this.b.a(this.c);
        paramzqi.f = zcgj.d(this.h, 0);
        break;
      case 552: 
        this.h = this.b.a(this.c);
        paramzqi.g = zcgj.d(this.h, 0);
        break;
      case 562: 
        this.h = this.b.a(this.c);
        paramzqi.i = zcgj.d(this.h, 0);
        break;
      default: 
        this.i = this.c.b();
        this.c.a(this.i);
      }
    }
  }
  
  private void a()
    throws Exception
  {
    this.h = this.b.a(this.c);
    int k = 0;
    boolean[] arrayOfBoolean = { k };
    zaml localzaml = zchu.a(this.h, 2, arrayOfBoolean);
    k = arrayOfBoolean[0];
    if ((k == 0) && (!localzaml.b())) {
      this.d.setTabColor(localzaml.b(this.a));
    }
    this.d.c(zcgj.d(this.h, 10));
  }
  
  private void b()
  {
    this.c.a(1L);
    zbew localzbew = new zbew(this.d);
    this.d.a(localzbew);
    for (;;)
    {
      this.g = this.c.a();
      switch (this.g)
      {
      case 142: 
        this.c.a(1L);
        return;
      case 141: 
        this.h = this.b.a(this.c);
        this.d.setSelected((this.h[0] & 0xFF & 0x1) != 0);
        this.d.setZoom(zc.a(this.h, 2));
        break;
      default: 
        this.i = this.c.b();
        this.c.a(this.i);
      }
    }
  }
  
  private void c()
  {
    this.h = this.b.a(this.c);
    Protection localProtection = this.d.getProtection();
    localProtection.a(zc.e(this.h, 0));
    localProtection.setAllowEditingContent(this.h[2] == 0);
    localProtection.setAllowEditingObject(this.h[6] == 0);
  }
  
  private void d()
  {
    this.h = this.b.a(this.c);
    PageSetup localPageSetup = this.d.getPageSetup();
    localPageSetup.setLeftMarginInch(zc.f(this.h, 0));
    localPageSetup.setRightMarginInch(zc.f(this.h, 8));
    localPageSetup.setTopMarginInch(zc.f(this.h, 16));
    localPageSetup.setBottomMarginInch(zc.f(this.h, 24));
    localPageSetup.setHeaderMarginInch(zc.f(this.h, 32));
    localPageSetup.setFooterMarginInch(zc.f(this.h, 40));
  }
  
  private void e()
  {
    this.h = this.b.a(this.c);
    PageSetup localPageSetup = this.d.getPageSetup();
    if ((this.h[18] & 0xFF & 0x2) == 0)
    {
      localPageSetup.setPaperSize(zc.a(this.h, 0));
      localPageSetup.d(zc.a(this.h, 4));
      localPageSetup.e(zc.a(this.h, 8));
      if ((this.h[18] & 0xFF & 0x8) == 0) {
        localPageSetup.setOrientation((this.h[18] & 0xFF & 0x1) != 0 ? 0 : 1);
      }
    }
    if ((this.h[18] & 0xFF & 0x10) != 0)
    {
      localPageSetup.setFirstPageNumber(zc.b(this.h, 16));
      localPageSetup.setAutoFirstPageNumber(false);
    }
    localPageSetup.setBlackAndWhite((this.h[18] & 0xFF & 0x4) != 0);
    localPageSetup.setPrintDraft((this.h[18] & 0xFF & 0x20) != 0);
  }
  
  private void f()
    throws Exception
  {
    this.h = this.b.a(this.c);
    PageSetup localPageSetup = this.d.getPageSetup();
    localPageSetup.a(this.h[0]);
    int k = 2;
    int[] arrayOfInt = { k };
    String str = zcgj.a(this.h, arrayOfInt);
    k = arrayOfInt[0];
    String[] arrayOfString;
    int m;
    if ((str != null) && (!"".equals(str)))
    {
      arrayOfString = zauw.a(str);
      for (m = 0; m < arrayOfString.length; m++) {
        if (arrayOfString[m] != null) {
          localPageSetup.setHeader(m, arrayOfString[m]);
        }
      }
    }
    arrayOfInt[0] = k;
    str = zcgj.a(this.h, arrayOfInt);
    k = arrayOfInt[0];
    if ((str != null) && (!"".equals(str)))
    {
      arrayOfString = zauw.a(str);
      for (m = 0; m < arrayOfString.length; m++) {
        if (arrayOfString[m] != null) {
          localPageSetup.setFooter(m, arrayOfString[m]);
        }
      }
    }
    arrayOfInt[0] = k;
    str = zcgj.a(this.h, arrayOfInt);
    k = arrayOfInt[0];
    if ((str != null) && (!"".equals(str)))
    {
      arrayOfString = zauw.a(str);
      for (m = 0; m < arrayOfString.length; m++) {
        if (arrayOfString[m] != null) {
          localPageSetup.setEvenHeader(m, arrayOfString[m]);
        }
      }
    }
    arrayOfInt[0] = k;
    str = zcgj.a(this.h, arrayOfInt);
    k = arrayOfInt[0];
    if ((str != null) && (!"".equals(str)))
    {
      arrayOfString = zauw.a(str);
      for (m = 0; m < arrayOfString.length; m++) {
        if (arrayOfString[m] != null) {
          localPageSetup.setEvenFooter(m, arrayOfString[m]);
        }
      }
    }
    arrayOfInt[0] = k;
    str = zcgj.a(this.h, arrayOfInt);
    k = arrayOfInt[0];
    if ((str != null) && (!"".equals(str)))
    {
      arrayOfString = zauw.a(str);
      for (m = 0; m < arrayOfString.length; m++) {
        if (arrayOfString[m] != null) {
          localPageSetup.setFirstPageHeader(m, arrayOfString[m]);
        }
      }
    }
    arrayOfInt[0] = k;
    str = zcgj.a(this.h, arrayOfInt);
    k = arrayOfInt[0];
    if ((str != null) && (!"".equals(str)))
    {
      arrayOfString = zauw.a(str);
      for (m = 0; m < arrayOfString.length; m++) {
        if (arrayOfString[m] != null) {
          localPageSetup.setFirstPageFooter(m, arrayOfString[m]);
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcew.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */