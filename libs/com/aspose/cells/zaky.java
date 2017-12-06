package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.ze;
import com.aspose.cells.b.c.a.za;

class zaky
{
  private zawp a;
  private int b = 0;
  private static final za c = new za(new String[] { "x", "s", "n", "d", "b", "m" });
  
  zaky(zawp paramzawp)
  {
    this.a = paramzawp;
  }
  
  void a(zcjy paramzcjy, int paramInt)
    throws Exception
  {
    this.a.e.a.p().i();
    this.b = this.a.c();
    if (this.a.h != null) {
      this.a.h.a(paramInt, this.b);
    }
    try
    {
      b(paramzcjy);
      if (paramzcjy.o()) {
        return;
      }
      paramzcjy.d();
      while (paramzcjy.s() != 4)
      {
        paramzcjy.k();
        if (("r".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
          a(paramzcjy);
        } else {
          paramzcjy.a();
        }
      }
    }
    catch (Exception localException) {}
  }
  
  private void a(zcjy paramzcjy)
    throws Exception
  {
    Object[] arrayOfObject = new Object[this.b];
    zf.a(this.a.h.a, arrayOfObject);
    int i = 0;
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy))
    {
      if (i < arrayOfObject.length)
      {
        String str = paramzcjy.a("v", null);
        switch (c.a(paramzcjy.q()))
        {
        case 0: 
          arrayOfObject[i] = Integer.valueOf(zauj.F(str));
          break;
        case 1: 
          arrayOfObject[i] = str;
          break;
        case 2: 
          if (zarb.b(str))
          {
            double d = zauj.C(str);
            if ((Math.abs(d) < 2.147483647E9D) && (d == (int)d)) {
              arrayOfObject[i] = Integer.valueOf((int)d);
            } else {
              arrayOfObject[i] = Double.valueOf(d);
            }
          }
          else
          {
            arrayOfObject[i] = znq.g;
          }
          break;
        case 3: 
          arrayOfObject[i] = ze.h(str);
          break;
        case 4: 
          arrayOfObject[i] = Boolean.valueOf(zauj.aB(str));
          break;
        case 5: 
          arrayOfObject[i] = null;
          break;
        }
      }
      i++;
      paramzcjy.a();
    }
  }
  
  private void b(zcjy paramzcjy)
    throws Exception
  {
    paramzcjy.k();
    if ((paramzcjy.s() != 1) || (!"pivotCacheRecords".equals(paramzcjy.q()))) {
      throw new IllegalStateException("pivotCacheRecords root element eror");
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaky.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */