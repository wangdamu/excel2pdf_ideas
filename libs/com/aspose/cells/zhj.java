package com.aspose.cells;

import com.aspose.cells.b.a.zw;

class zhj
  implements zaha
{
  private Cells a;
  private RowCollection b;
  private String c;
  private boolean d;
  private zgs e;
  private zgs f;
  
  zhj(Cells paramCells, String paramString, boolean paramBoolean)
  {
    this.a = paramCells;
    this.b = paramCells.getRows();
    this.c = paramString;
    this.d = paramBoolean;
    this.e = new zgs();
    this.f = this.e;
  }
  
  public boolean a(zt paramzt, int paramInt)
  {
    if (paramzt.h(paramInt) != 5) {
      return false;
    }
    this.f = paramzt.a(paramInt, this.e, 7);
    zaai localzaai = (zaai)paramzt.i(paramInt);
    String str = localzaai.j();
    if (str == null)
    {
      this.f = paramzt.a(paramInt, this.e, 3);
      if (this.f == this.e)
      {
        this.f.c = 5;
        this.f.d = localzaai;
      }
      Cell localCell = new Cell(new Row(this.a, this.b, paramzt, false), paramInt, this.f, this.f == this.e);
      str = localCell.t();
    }
    if (this.d)
    {
      if ((str == null) || (str.toUpperCase().indexOf(this.c) < 0)) {
        return false;
      }
    }
    else if (!zw.b(str, this.c)) {
      return false;
    }
    return true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zhj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */