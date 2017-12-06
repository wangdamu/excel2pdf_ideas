package com.aspose.cells;

class zaaj
  extends zaai
{
  private zbf g;
  
  zaaj(int paramInt1, int paramInt2, zbf paramzbf)
  {
    super(paramInt1, paramInt2);
    this.g = paramzbf;
  }
  
  zbf a()
  {
    return this.g;
  }
  
  boolean k()
  {
    return this.g.b();
  }
  
  boolean l()
  {
    return !this.g.b();
  }
  
  boolean b(Cells paramCells)
  {
    return !this.g.b();
  }
  
  boolean a(Cells paramCells)
  {
    return false;
  }
  
  zaai a(int paramInt1, int paramInt2, WorksheetCollection paramWorksheetCollection1, WorksheetCollection paramWorksheetCollection2, CopyOptions paramCopyOptions)
  {
    zaaj localzaaj = new zaaj(paramInt1, paramInt2, new zbf());
    localzaaj.a(this);
    localzaaj.b = zaam.a(this.b, -1, 0, 0, paramCopyOptions);
    localzaaj.g.a(this.g, this.e, this.f, paramInt1, paramInt2, paramCopyOptions);
    return localzaaj;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaaj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */