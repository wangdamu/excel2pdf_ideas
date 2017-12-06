package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;
import java.util.Iterator;

class zaxn
  extends zcd
{
  zaxn(zka paramzka)
  {
    c(4199);
    Object localObject = null;
    Iterator localIterator = paramzka.a().a().getNSeries().iterator();
    while (localIterator.hasNext())
    {
      Series localSeries = (Series)localIterator.next();
      if (localSeries.u() == paramzka)
      {
        localObject = localSeries;
        break;
      }
    }
    int i = ((Series)localObject).getPoints().getCount();
    int j = (int)Math.ceil(i / 8.0D);
    a((short)(6 + j));
    this.b = new byte[d()];
    System.arraycopy(zc.a(i), 0, this.b, 0, 2);
    int k = 8;
    int m = paramzka.F().length - 1;
    for (int n = 2 + j - 1; n > 1; n--)
    {
      ArrayList localArrayList = new ArrayList();
      while (m >= 0)
      {
        i1 = paramzka.F()[m];
        i2 = i - i1 - 1;
        if (i2 >= k) {
          break;
        }
        int i3 = (int)Math.pow(2.0D, i2 % 8);
        zf.a(localArrayList, Integer.valueOf(i3));
        m--;
      }
      int i1 = 0;
      for (int i2 = 0; i2 < localArrayList.size(); i2++) {
        i1 |= ((Integer)localArrayList.get(i2)).intValue();
      }
      System.arraycopy(zc.a(i1), 0, this.b, n, 1);
      k += 8;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaxn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */