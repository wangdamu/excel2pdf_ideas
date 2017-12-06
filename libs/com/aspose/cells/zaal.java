package com.aspose.cells;

class zaal
  extends zaai
{
  private zacb g;
  
  zaal(int paramInt1, int paramInt2, zacb paramzacb)
  {
    super(paramInt1, paramInt2);
    this.g = paramzacb;
  }
  
  zaal(int paramInt1, int paramInt2, zacb paramzacb, byte[] paramArrayOfByte)
  {
    super(paramInt1, paramInt2, paramArrayOfByte);
    this.g = paramzacb;
  }
  
  zacb b()
  {
    return this.g;
  }
  
  boolean k()
  {
    return false;
  }
  
  boolean l()
  {
    return false;
  }
  
  boolean b(Cells paramCells)
  {
    return false;
  }
  
  boolean a(Cells paramCells)
  {
    return true;
  }
  
  zaai a(int paramInt1, int paramInt2, WorksheetCollection paramWorksheetCollection1, WorksheetCollection paramWorksheetCollection2, CopyOptions paramCopyOptions)
  {
    zaal localzaal = new zaal(paramInt1, paramInt2, new zacb());
    localzaal.a(this);
    localzaal.b = zaam.a(this.b, -1, 0, 0, paramCopyOptions);
    localzaal.g.a(this.g, paramInt1, paramInt2);
    return localzaal;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */