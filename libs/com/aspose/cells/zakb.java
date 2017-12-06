package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.c.a.za;
import java.util.Iterator;

class zakb
{
  private zcjm a = null;
  private zji b;
  private static final za c = new za(new String[] { "cycle", "withinLinear", "acrossLinear", "withinLinearReversed" });
  
  zakb(Chart paramChart)
  {
    this.b = paramChart.P();
  }
  
  void a(zcjm paramzcjm, boolean paramBoolean)
    throws Exception
  {
    this.a = paramzcjm;
    a();
    if (paramBoolean) {
      this.b.a = paramzcjm.c();
    }
  }
  
  private void a()
  {
    if (this.a.f() == null) {
      return;
    }
    zcjn localzcjn1 = this.a.f();
    zcjg localzcjg = localzcjn1.e().a("meth");
    if (localzcjg != null) {
      switch (c.a(localzcjg.h))
      {
      case 0: 
        this.b.a(0);
        break;
      case 1: 
        this.b.a(1);
        break;
      case 2: 
        this.b.a(2);
        break;
      case 3: 
        this.b.a(3);
        break;
      default: 
        this.b.a(0);
      }
    }
    zcju localzcju = localzcjn1.l();
    Iterator localIterator = localzcju.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      if ((localObject instanceof zcjn))
      {
        zcjn localzcjn2 = (zcjn)localObject;
        String str1 = localzcjn2.g;
        if ("schemeClr".equals(str1))
        {
          String str2 = localzcjn2.a("val");
          zf.a(this.b.a(), str2);
        }
        else if ("variation".equals(str1))
        {
          a(localzcjn2);
        }
      }
    }
  }
  
  private void a(zcjn paramzcjn)
  {
    int[] arrayOfInt = { 0, 0 };
    if (!paramzcjn.j())
    {
      zf.a(this.b.b(), arrayOfInt);
      return;
    }
    zcju localzcju = paramzcjn.l();
    Iterator localIterator = localzcju.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      if ((localObject instanceof zcjn))
      {
        zcjn localzcjn = (zcjn)localObject;
        String str1 = localzcjn.g;
        String str2;
        if ("lumMod".equals(str1))
        {
          str2 = localzcjn.a("val");
          arrayOfInt[0] = zp.a(str2);
        }
        else if ("lumOff".equals(str1))
        {
          str2 = localzcjn.a("val");
          arrayOfInt[1] = zp.a(str2);
        }
      }
    }
    zf.a(this.b.b(), arrayOfInt);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zakb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */