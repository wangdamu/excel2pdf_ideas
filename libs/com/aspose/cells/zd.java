package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class zd
  extends zcd
{
  zd()
  {
    c(4176);
  }
  
  int a(int paramInt1, int paramInt2, ArrayList paramArrayList)
  {
    Collections.sort(paramArrayList, new ziw());
    ArrayList localArrayList = new ArrayList();
    Collections.sort(paramArrayList, new ziw());
    int i = 0;
    Iterator localIterator1 = paramArrayList.iterator();
    while (localIterator1.hasNext())
    {
      FontSetting localFontSetting = (FontSetting)localIterator1.next();
      if (localFontSetting.getStartIndex() < i)
      {
        if (localFontSetting.getStartIndex() + localFontSetting.getLength() <= i) {
          continue;
        }
        localzbwh1 = new zbwh();
        localzbwh1.a = i;
        localzbwh1.b = paramInt2;
        zf.a(localArrayList, localzbwh1);
      }
      else
      {
        if (localFontSetting.getStartIndex() > i)
        {
          localzbwh1 = new zbwh();
          localzbwh1.a = i;
          localzbwh1.b = paramInt2;
          zf.a(localArrayList, localzbwh1);
        }
        localzbwh1 = new zbwh();
        localzbwh1.a = localFontSetting.getStartIndex();
        if (localFontSetting.h() == null) {
          localzbwh1.b = paramInt2;
        } else {
          localzbwh1.b = localFontSetting.getFont().m();
        }
        zf.a(localArrayList, localzbwh1);
      }
      i = localFontSetting.getStartIndex() + localFontSetting.getLength();
    }
    if (i < paramInt1)
    {
      localzbwh1 = new zbwh();
      localzbwh1.a = i;
      localzbwh1.b = paramInt2;
      zf.a(localArrayList, localzbwh1);
    }
    zbwh localzbwh1 = new zbwh();
    localzbwh1.a = paramInt1;
    localzbwh1.b = paramInt2;
    zf.a(localArrayList, localzbwh1);
    int j = localArrayList.size();
    if (j == 2) {
      return ((zbwh)localArrayList.get(0)).b;
    }
    a((short)(2 + 4 * j));
    this.b = new byte[d()];
    System.arraycopy(zc.a((short)j), 0, this.b, 0, 2);
    int k = 2;
    Iterator localIterator2 = localArrayList.iterator();
    while (localIterator2.hasNext())
    {
      zbwh localzbwh2 = (zbwh)localIterator2.next();
      System.arraycopy(zc.a((short)localzbwh2.a), 0, this.b, k, 2);
      System.arraycopy(zc.a((short)localzbwh2.b), 0, this.b, k + 2, 2);
      k += 4;
    }
    return -1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */