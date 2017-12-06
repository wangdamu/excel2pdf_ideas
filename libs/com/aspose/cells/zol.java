package com.aspose.cells;

import java.util.ArrayList;

class zol
  extends zcd
{
  private ArrayList a;
  private long c;
  
  zol()
  {
    c(215);
  }
  
  void a(ArrayList paramArrayList)
  {
    this.a = paramArrayList;
  }
  
  void a(zrg paramzrg)
    throws Exception
  {
    this.c = paramzrg.b();
    if (this.a.size() > 0)
    {
      a((short)(2 * this.a.size()));
      paramzrg.a(f());
      paramzrg.a(d());
      int i = this.a.size();
      for (int j = 0; j < i; j++)
      {
        long l = ((Long)this.a.get(j)).longValue();
        if (j == 0) {
          paramzrg.a((this.c & 0xFFFFFFFF) - (l & 0xFFFFFFFF));
        } else if (j > 1) {
          paramzrg.b((int)((l & 0xFFFFFFFF) - (((Long)this.a.get(j - 1)).longValue() & 0xFFFFFFFF)));
        }
      }
    }
    else
    {
      paramzrg.a(f());
      paramzrg.c(4);
      paramzrg.a(0);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zol.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */