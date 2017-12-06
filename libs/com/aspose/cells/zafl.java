package com.aspose.cells;

import java.util.ArrayList;
import java.util.HashMap;

class zafl
{
  int a = -1;
  int b = -1;
  boolean c = false;
  boolean d = false;
  int e = 1;
  int f = 1;
  Hyperlink g = null;
  Cell h = null;
  int i = -1;
  Style j = null;
  boolean k = false;
  HashMap l;
  ArrayList m = null;
  String n = null;
  zafo o = null;
  
  zafl(Cell paramCell, zafo paramzafo)
  {
    if (paramCell != null)
    {
      this.h = paramCell;
      this.b = paramCell.getRow();
      this.a = paramCell.getColumn();
      this.i = paramCell.r();
      this.j = paramCell.o();
      this.o = paramzafo;
      this.n = ((String)this.o.c.get(paramCell.getWorksheet().getName() + "#" + paramCell.getColumn() + "#" + paramCell.getRow()));
    }
  }
  
  zafl(int paramInt1, int paramInt2)
  {
    this.a = paramInt2;
    this.b = paramInt1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zafl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */