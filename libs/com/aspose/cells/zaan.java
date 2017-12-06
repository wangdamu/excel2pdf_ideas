package com.aspose.cells;

import com.aspose.cells.a.c.zl;

class zaan
{
  public boolean a = zl.a();
  public StringBuilder b = new StringBuilder();
  public zagx c = zgj.a;
  public Workbook d = null;
  private byte h = 0;
  int e = -1;
  int f = -1;
  int g = -1;
  
  boolean a()
  {
    return (this.h & 0xFF & 0x32) == 18;
  }
  
  boolean b()
  {
    return (this.h & 0xFF & 0x34) == 20;
  }
  
  void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.h = ((byte)(this.h | 0x10));
    } else {
      this.h = ((byte)(this.h & 0xFF & 0xFFFFFFEF));
    }
  }
  
  boolean c()
  {
    return (this.h & 0xFF & 0x20) != 0;
  }
  
  void b(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.h = ((byte)(this.h | 0x20));
    } else {
      this.h = ((byte)(this.h & 0xFF & 0xFFFFFFDF));
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaan.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */