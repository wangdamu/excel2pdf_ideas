package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.za;
import com.aspose.cells.b.a.d.zb;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import java.util.ArrayList;

class zbes
{
  private ArrayList a = new ArrayList();
  
  zbes() {}
  
  zbes(zm paramzm)
    throws Exception
  {
    paramzm.b(0L);
    a(paramzm, (int)paramzm.h() / 4);
  }
  
  void a(zm paramzm, int paramInt)
    throws Exception
  {
    za localza = new za(paramzm, Encoding.getUnicode());
    for (int i = 0; i < paramInt; i++) {
      zf.a(this.a, Long.valueOf(localza.r()));
    }
  }
  
  zh c()
    throws Exception
  {
    zh localzh = new zh();
    zb localzb = new zb(localzh, Encoding.getUnicode());
    for (long l = 0L; (l & 0xFFFFFFFF) < this.a.size(); l += 1L) {
      localzb.a(b(l) & 0xFFFFFFFF);
    }
    return localzh;
  }
  
  void a(long paramLong)
  {
    zf.a(this.a, Long.valueOf(paramLong));
  }
  
  long b(long paramLong)
  {
    return ((Long)this.a.get((int)(paramLong & 0xFFFFFFFF))).longValue();
  }
  
  int d()
  {
    return this.a.size();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */