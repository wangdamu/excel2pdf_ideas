package com.aspose.cells;

import com.aspose.cells.b.c.a.za;

class zjm
{
  int a;
  private zjl[] b = new zjl[3];
  private static final za c = new za(new String[] { "cat", "x", "y", "val", "size" });
  
  zjl a(int paramInt)
  {
    return this.b[paramInt];
  }
  
  void a(zjl paramzjl)
  {
    switch (c.a(paramzjl.a))
    {
    case 0: 
    case 1: 
      this.b[0] = paramzjl;
      break;
    case 2: 
    case 3: 
      this.b[1] = paramzjl;
      break;
    case 4: 
      if (this.b[1] == null) {
        this.b[1] = paramzjl;
      } else {
        this.b[2] = paramzjl;
      }
      break;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zjm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */