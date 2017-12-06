package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zb;
import com.aspose.cells.b.a.d.zh;
import java.util.ArrayList;

class zso
{
  private ArrayList a = new ArrayList();
  
  zsn a(long paramLong)
  {
    return (zsn)this.a.get((int)(paramLong & 0xFFFFFFFF));
  }
  
  int a()
  {
    return this.a.size();
  }
  
  void a(zsn paramzsn)
  {
    zf.a(this.a, paramzsn);
  }
  
  zsn a(zsn paramzsn, long paramLong)
  {
    if ((paramLong != 4294967295L) && ((paramLong & 0xFFFFFFFF) >= 0L) && ((paramLong & 0xFFFFFFFF) < this.a.size()) && (paramzsn != a(paramLong))) {
      return a(paramLong);
    }
    return null;
  }
  
  zh b()
    throws Exception
  {
    zh localzh = new zh();
    zb localzb = new zb(localzh, Encoding.getUnicode());
    for (long l = 0L; (l & 0xFFFFFFFF) < this.a.size(); l += 1L) {
      a(l).a(localzb);
    }
    zsn localzsn = new zsn();
    while (localzh.h() % 512L != 0L) {
      localzsn.a(localzb);
    }
    return localzh;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zso.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */