package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zcgv
{
  private zchd a;
  private Workbook b;
  private zqh c;
  private zawp d;
  private int e;
  private byte[] f;
  private int g;
  private int h;
  private zcbw i;
  
  zcgv(zchd paramzchd, zqh paramzqh, zawp paramzawp)
  {
    this.a = paramzchd;
    this.c = paramzqh;
    this.d = paramzawp;
    this.b = paramzqh.a;
    this.h = this.d.c();
  }
  
  void a(zcbw paramzcbw, int paramInt)
    throws Exception
  {
    if (paramzcbw == null) {
      return;
    }
    this.b.i();
    int j = 0;
    this.i = paramzcbw;
    Object[] arrayOfObject = null;
    for (;;)
    {
      this.e = this.i.a();
      int k;
      int[] arrayOfInt;
      switch (this.e)
      {
      case 194: 
        this.i.a(1L);
        return;
      case 193: 
        this.f = this.a.a(this.i);
        zawu localzawu = new zawu(this.d);
        this.d.h = localzawu;
        localzawu.a(paramInt, this.h);
        break;
      case 33: 
        a();
        break;
      case 34: 
        this.f = this.a.a(this.i);
        j = 0;
        arrayOfObject = new Object[this.h];
        zf.a(this.d.h.a, arrayOfObject);
        break;
      case 20: 
        this.f = this.a.a(this.i);
        if (j < arrayOfObject.length)
        {
          arrayOfObject[j] = null;
          j++;
        }
        break;
      case 21: 
        this.f = this.a.a(this.i);
        if (j < arrayOfObject.length)
        {
          arrayOfObject[j] = Double.valueOf(zc.f(this.f, 0));
          j++;
        }
        break;
      case 22: 
        this.f = this.a.a(this.i);
        if (j < arrayOfObject.length)
        {
          arrayOfObject[j] = Boolean.valueOf(this.f[0] != 0 ? 1 : false);
          j++;
        }
        break;
      case 23: 
        this.f = this.a.a(this.i);
        if (j < arrayOfObject.length)
        {
          switch (this.f[0])
          {
          case 0: 
            arrayOfObject[j] = "#NULL!";
            break;
          case 7: 
            arrayOfObject[j] = "#DIV/0!";
            break;
          case 15: 
            arrayOfObject[j] = "#VALUE!";
            break;
          case 23: 
            arrayOfObject[j] = "#REF!";
            break;
          case 29: 
            arrayOfObject[j] = "#NAME?";
            break;
          case 36: 
            arrayOfObject[j] = "#NUM!";
            break;
          case 42: 
            arrayOfObject[j] = "#N/A";
          }
          j++;
        }
        break;
      case 24: 
        this.f = this.a.a(this.i);
        if (j < arrayOfObject.length)
        {
          k = 0;
          arrayOfInt = new int[] { k };
          arrayOfObject[j] = zcgj.a(this.f, arrayOfInt);
          k = arrayOfInt[0];
          j++;
        }
        break;
      case 25: 
        this.f = this.a.a(this.i);
        if (j < arrayOfObject.length)
        {
          arrayOfObject[j] = zcgj.c(this.f, 0);
          j++;
        }
        break;
      case 26: 
        this.f = this.a.a(this.i);
        if (j < arrayOfObject.length)
        {
          arrayOfObject[j] = Integer.valueOf(zc.a(this.f, 0));
          j++;
        }
        break;
      case 31: 
        this.f = this.a.a(this.i);
        if (j < arrayOfObject.length)
        {
          k = 0;
          arrayOfInt = new int[] { k };
          arrayOfObject[j] = zcgj.a(this.f, arrayOfInt);
          k = arrayOfInt[0];
          j++;
        }
        break;
      default: 
        this.g = this.i.b();
        this.i.a(this.g);
      }
    }
  }
  
  private void a()
    throws Exception
  {
    Object[] arrayOfObject = new Object[this.h];
    zf.a(this.d.h.a, arrayOfObject);
    this.f = this.a.a(this.i);
    boolean[] arrayOfBoolean = this.d.h.b;
    int j = 0;
    int k = 0;
    while (j < this.h)
    {
      if (arrayOfBoolean[j] != 0)
      {
        int m = zc.a(this.f, k);
        if (j < arrayOfObject.length) {
          arrayOfObject[j] = Integer.valueOf(m);
        }
        k += 4;
      }
      else if (j < this.d.i.size())
      {
        zbtv localzbtv = (zbtv)this.d.i.get(j);
        if (j < arrayOfObject.length) {
          if (localzbtv.f())
          {
            arrayOfObject[j] = Double.valueOf(zc.f(this.f, k));
            k += 8;
          }
          else if (localzbtv.j())
          {
            arrayOfObject[j] = zcgj.c(this.f, k);
            k += 8;
          }
          else
          {
            int[] arrayOfInt = { k };
            arrayOfObject[j] = zcgj.a(this.f, arrayOfInt);
            k = arrayOfInt[0];
          }
        }
      }
      j++;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcgv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */