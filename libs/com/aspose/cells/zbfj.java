package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zbfj
  extends zcd
{
  zbfj()
  {
    c(4099);
    b(12);
    this.b = new byte[12];
    this.b[0] = 1;
    this.b[2] = 1;
    this.b[8] = 1;
  }
  
  void a(Trendline paramTrendline)
  {
    switch (paramTrendline.getType())
    {
    case 1: 
      this.b[4] = 2;
      this.b[6] = 2;
    }
  }
  
  void a(ErrorBar paramErrorBar)
  {
    if (paramErrorBar.getType() != 0) {
      return;
    }
    int i = 0;
    zjk localzjk = null;
    if (paramErrorBar.getDisplayType() == 3) {
      localzjk = paramErrorBar.b();
    } else {
      localzjk = paramErrorBar.c();
    }
    if (localzjk == null) {
      return;
    }
    i = localzjk.s();
    if (localzjk.a() == 3) {
      this.b[2] = 3;
    }
    System.arraycopy(zc.a(i), 0, this.b, 6, 2);
    System.arraycopy(zc.a(i), 0, this.b, 4, 2);
  }
  
  void a(Series paramSeries, int paramInt)
  {
    int i = 0;
    int j = 0;
    if (paramSeries.m() != null)
    {
      j = paramSeries.m().s();
      if (paramSeries.m().a() == 3) {
        this.b[2] = 3;
      }
      System.arraycopy(zc.a(j), 0, this.b, 6, 2);
    }
    i = 0;
    if (paramSeries.o() != null)
    {
      i = paramSeries.o().s();
      if (((i & 0xFFFF) > (j & 0xFFFF)) && (!ChartCollection.l(paramInt)) && (paramSeries.o().a() != 3) && (paramSeries.o().a() != 1) && (paramSeries.m() != null) && (paramSeries.m().k())) {
        i = j;
      }
      if (paramSeries.o().a() == 3)
      {
        this.b[0] = 3;
      }
      else if ((paramSeries.o().a() != 1) && (paramSeries.o().b != null))
      {
        ArrayList localArrayList = paramSeries.o().b;
        for (int k = 0; k < localArrayList.size(); k++) {
          if ((localArrayList.get(k) instanceof String))
          {
            this.b[0] = 3;
            break;
          }
        }
      }
    }
    if ((i & 0xFFFF) == 0) {
      i = j;
    }
    System.arraycopy(zc.a(i), 0, this.b, 4, 2);
    if (ChartCollection.q(paramInt))
    {
      i = 0;
      if (paramSeries.p() != null)
      {
        i = paramSeries.p().s();
        if (paramSeries.p().a() == 3) {
          this.b[8] = 3;
        }
      }
      if ((i & 0xFFFF) == 0) {
        i = j;
      }
      System.arraycopy(zc.a(i), 0, this.b, 10, 2);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbfj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */