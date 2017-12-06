package com.aspose.cells;

class zfl
  extends zfh
{
  zaie d;
  int e;
  int f;
  private boolean g = true;
  private boolean h = true;
  
  zfl(zaca paramzaca, zaai paramzaai, zaie paramzaie, int paramInt1, int paramInt2)
  {
    super(paramzaai, paramzaai.a().a());
    if (!paramzaca.p.o) {
      paramzaie.a(true);
    }
    this.d = paramzaie;
    this.e = paramInt1;
    this.f = paramInt2;
  }
  
  void a(zaca paramzaca)
  {
    if (this.g) {
      this.d = this.d.m();
    } else {
      this.g = true;
    }
    this.d.a(paramzaca, this.e, this.f, false);
    this.e = paramzaca.d;
    this.f = paramzaca.e;
  }
  
  void a()
  {
    this.g = false;
    this.d.n();
  }
  
  void a(zaai paramzaai, zaca paramzaca)
  {
    if ((this.g) && (this.h) && ((this.e != paramzaai.e) || (this.f != paramzaai.f)))
    {
      zhp localzhp = new zhp(new zaca(paramzaca), this);
      this.h = false;
      int i = paramzaca.p.O;
      paramzaca.p.O = paramzaca.p.E;
      int j = paramzaca.p.F;
      try
      {
        CellArea localCellArea;
        if (this.e < paramzaai.e)
        {
          if (this.f == paramzaai.f)
          {
            localCellArea = CellArea.d(this.b);
            localCellArea.StartColumn = this.f;
            localCellArea.EndColumn = this.f;
            paramzaca.g.a(localCellArea, this.b.EndRow, this.f, localzhp, true, true);
          }
          else
          {
            paramzaca.g.a(this.b, this.b.EndRow, this.b.EndColumn, localzhp, true, true);
          }
        }
        else if (this.e == paramzaai.e)
        {
          localCellArea = CellArea.d(this.b);
          localCellArea.StartRow = this.e;
          localCellArea.EndRow = this.e;
          if (this.f < paramzaai.f) {
            paramzaca.g.a(localCellArea, this.e, this.b.EndColumn, localzhp, true, true);
          } else {
            paramzaca.g.a(localCellArea, this.e, this.b.StartColumn, localzhp, false, true);
          }
        }
        else if (this.f == paramzaai.f)
        {
          localCellArea = CellArea.d(this.b);
          localCellArea.StartColumn = this.f;
          localCellArea.EndColumn = this.f;
          paramzaca.g.a(localCellArea, this.b.StartRow, this.f, localzhp, false, true);
        }
        else
        {
          paramzaca.g.a(this.b, this.b.StartRow, this.b.StartColumn, localzhp, false, true);
        }
        this.h = true;
      }
      catch (Exception localException)
      {
        paramzaca.p.a(paramzaca.p.O, j);
      }
      finally
      {
        a();
        paramzaca.p.O = i;
      }
    }
    if (paramzaai.c() == 0)
    {
      paramzaca.l = this.b;
      a(paramzaca);
      try
      {
        paramzaai.a(this.d, paramzaca);
      }
      finally
      {
        a();
      }
      this.c -= 1;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zfl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */