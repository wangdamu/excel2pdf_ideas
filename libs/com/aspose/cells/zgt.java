package com.aspose.cells;

import java.util.HashMap;

class zgt
{
  Style a;
  int b;
  boolean c;
  HashMap d;
  Cell e;
  
  public zgt()
  {
    this.b = -1;
    this.c = true;
  }
  
  public zgt(int paramInt, Cells paramCells)
  {
    a(paramInt, paramCells);
  }
  
  public void a(int paramInt, Cells paramCells)
  {
    this.c = true;
    zajm localzajm = paramCells.p().C();
    if ((paramInt < 0) || (paramInt >= localzajm.b())) {
      this.b = 15;
    } else {
      this.b = paramInt;
    }
    this.a = localzajm.a(this.b);
    this.d = null;
    this.e = null;
  }
  
  public void a()
  {
    if (this.c)
    {
      this.c = false;
      Style localStyle = new Style(this.a.e());
      localStyle.copy(this.a);
      this.a = localStyle;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zgt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */