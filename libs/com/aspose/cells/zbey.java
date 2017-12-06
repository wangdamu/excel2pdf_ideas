package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zbey
  extends zcd
{
  public zbey()
  {
    c(4187);
    b(14);
    this.b = new byte[14];
  }
  
  void a(ErrorBar paramErrorBar)
  {
    if (paramErrorBar.a())
    {
      if (paramErrorBar.getDisplayType() == 3) {
        this.b[0] = 3;
      } else {
        this.b[0] = 4;
      }
    }
    else if (paramErrorBar.getDisplayType() == 3) {
      this.b[0] = 1;
    } else {
      this.b[0] = 2;
    }
    switch (paramErrorBar.getType())
    {
    case 2: 
      this.b[1] = 1;
      break;
    case 1: 
      this.b[1] = 2;
      break;
    case 4: 
      this.b[1] = 5;
      break;
    case 3: 
      this.b[1] = 3;
      break;
    case 0: 
      this.b[1] = 4;
    }
    if (paramErrorBar.getShowMarkerTTop()) {
      this.b[2] = 1;
    }
    this.b[3] = 1;
    System.arraycopy(zc.a(paramErrorBar.getAmount()), 0, this.b, 4, 8);
    if (paramErrorBar.getType() == 0)
    {
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
      System.arraycopy(zc.a(i), 0, this.b, 12, 2);
    }
    else
    {
      this.b[12] = 1;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */