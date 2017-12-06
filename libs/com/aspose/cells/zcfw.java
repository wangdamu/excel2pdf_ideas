package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import java.util.HashMap;

class zcfw
{
  private zbti a;
  private zcbw b;
  private zchd c;
  private int d;
  private int e;
  private byte[] f;
  private HashMap g;
  
  zcfw(zchd paramzchd, zbti paramzbti)
  {
    this.c = paramzchd;
    this.a = paramzbti;
  }
  
  void a(zcbw paramzcbw, HashMap paramHashMap)
    throws Exception
  {
    this.b = paramzcbw;
    this.g = paramHashMap;
    for (;;)
    {
      this.d = this.b.a();
      switch (this.d)
      {
      case 588: 
        return;
      case 360: 
        d();
        break;
      case 359: 
        c();
        break;
      case 577: 
        a();
        break;
      case 363: 
        b();
        break;
      default: 
        this.e = this.b.b();
        this.b.a(this.e);
      }
    }
  }
  
  private void a()
    throws Exception
  {
    this.f = this.c.a(this.b);
    zwh localzwh = new zwh(this.a);
    localzwh.a(zcgj.d(this.f, 0));
    zf.a(this.a.b(), localzwh);
    for (;;)
    {
      this.d = this.b.a();
      switch (this.d)
      {
      case 587: 
        this.b.a(1L);
        return;
      case 585: 
        this.f = this.c.a(this.b);
        if (this.f.length > 4)
        {
          int i = this.f.length;
          localzwh.b(new byte[i]);
          int j = 0;
          System.arraycopy(this.f, j, localzwh.h(), 0, i);
        }
        break;
      case 586: 
        this.f = this.c.a(this.b);
        localzwh.d(zc.e(this.f, 0));
        localzwh.a(zc.a(this.f, 2));
        break;
      default: 
        this.e = this.b.b();
        this.b.a(this.e);
      }
    }
  }
  
  private void b()
    throws Exception
  {
    this.f = this.c.a(this.b);
    int i = zc.a(this.f, 0);
    int j = (this.f[4] & 0xFF & 0x1) == 0 ? 0 : 1;
    zwr localzwr = this.a.b(i);
    if (j != 0) {
      localzwr.a().a(3, "true");
    }
    zwn localzwn = null;
    for (;;)
    {
      this.d = this.b.a();
      switch (this.d)
      {
      case 364: 
        this.b.a(1L);
        return;
      case 366: 
        this.f = this.c.a(this.b);
        int k = zc.a(this.f, 0);
        localzwn = localzwr.e(k);
        break;
      case 367: 
        a(localzwn);
        break;
      case 368: 
        b(localzwn);
        break;
      case 369: 
        c(localzwn);
        break;
      case 370: 
        d(localzwn);
        break;
      case 371: 
        e(localzwn);
        break;
      case 365: 
      default: 
        this.e = this.b.b();
        this.b.a(this.e);
      }
    }
  }
  
  private void a(zwn paramzwn)
  {
    this.f = this.c.a(this.b);
    int i = zc.a(this.f, 0);
    paramzwn.a(i, null);
  }
  
  private void b(zwn paramzwn)
  {
    this.f = this.c.a(this.b);
    int i = zc.a(this.f, 0);
    double d1 = zc.f(this.f, 4);
    paramzwn.a(i, Double.valueOf(d1));
  }
  
  private void c(zwn paramzwn)
  {
    this.f = this.c.a(this.b);
    int i = zc.a(this.f, 0);
    boolean bool = this.f[4] == 1;
    paramzwn.a(i, Boolean.valueOf(bool));
  }
  
  private void d(zwn paramzwn)
  {
    this.f = this.c.a(this.b);
    int i = zc.a(this.f, 0);
    byte b1 = this.f[4];
    zuf localzuf = a(b1);
    paramzwn.a(i, localzuf);
  }
  
  static zuf a(byte paramByte)
  {
    switch (paramByte)
    {
    case 0: 
      return zuf.e;
    case 7: 
      return zuf.a;
    case 15: 
      return zuf.i;
    case 23: 
      return zuf.g;
    case 29: 
      return zuf.d;
    case 36: 
      return zuf.f;
    case 42: 
      return zuf.c;
    }
    return zuf.c;
  }
  
  private void e(zwn paramzwn)
    throws Exception
  {
    this.f = this.c.a(this.b);
    int i = zc.a(this.f, 0);
    String str = zcgj.d(this.f, 4);
    paramzwn.a(i, str);
  }
  
  private void c()
    throws Exception
  {
    this.f = this.c.a(this.b);
    int i = zc.a(this.f, 0);
    int j = 4;
    String[] arrayOfString = new String[i];
    for (int k = 0; k < i; k++)
    {
      int[] arrayOfInt = { j };
      arrayOfString[k] = zcgj.a(this.f, arrayOfInt);
      j = arrayOfInt[0];
    }
    this.a.a(arrayOfString);
  }
  
  private void d()
    throws Exception
  {
    this.f = this.c.a(this.b);
    int i = 2;
    int[] arrayOfInt = { i };
    String str1 = zcgj.a(this.f, arrayOfInt);
    i = arrayOfInt[0];
    arrayOfInt[0] = i;
    String str2 = zcgj.a(this.f, arrayOfInt);
    i = arrayOfInt[0];
    switch (this.f[0])
    {
    case 0: 
      this.a.a(0);
      str1 = ((zrl)this.g.get(str1)).d;
      str1 = zbxt.e(str1);
      this.a.d(zbti.a(str1, 0));
      break;
    case 1: 
      this.a.a(3);
      this.a.b(str2, str1);
      break;
    case 2: 
      this.a.a(4);
      str1 = ((zrl)this.g.get(str1)).d;
      this.a.b(str2, str1);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcfw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */