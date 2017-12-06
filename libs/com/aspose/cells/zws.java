package com.aspose.cells;

import java.util.ArrayList;

class zws
  extends zcd
{
  ArrayList a;
  
  zws()
  {
    c(23);
    b(2);
    this.a = new ArrayList();
  }
  
  void a(zrg paramzrg)
    throws Exception
  {
    a((short)(2 + this.a.size() * 2));
    int i;
    if (this.a.size() < 4107)
    {
      paramzrg.a(f());
      paramzrg.a(d());
      paramzrg.b(this.a.size() / 3);
      for (i = 0; i < this.a.size(); i++) {
        paramzrg.b(((Integer)this.a.get(i)).intValue());
      }
    }
    else
    {
      paramzrg.a(f());
      paramzrg.a((short)8210);
      paramzrg.b(this.a.size() / 3);
      for (i = 0; i < 4104; i++) {
        paramzrg.b(((Integer)this.a.get(i)).intValue());
      }
      i = 4104;
      for (int j = this.a.size() - i;; j = this.a.size() - i)
      {
        paramzrg.c(60);
        if (j <= 4110) {
          break;
        }
        paramzrg.a((short)8220);
        for (k = 0; k < 4110; k++) {
          paramzrg.b(((Integer)this.a.get(i + k)).intValue());
        }
        i += 4110;
      }
      paramzrg.a((short)(j * 2));
      for (int k = 0; k < j; k++) {
        paramzrg.b(((Integer)this.a.get(i + k)).intValue());
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zws.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */