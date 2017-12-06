package com.aspose.cells;

class zavo
  extends zavp
{
  private int b;
  public int a;
  
  public int a()
  {
    return this.a;
  }
  
  public int b()
  {
    if ((this.b & 0x87) != 0)
    {
      if ((this.b & 0x38) != 0) {
        return 22;
      }
      return 14;
    }
    if ((this.b & 0x40) != 0) {
      return 18;
    }
    return 20;
  }
  
  public void c()
  {
    super.c();
    this.b = 0;
  }
  
  public void a(int paramInt)
  {
    this.b |= paramInt;
  }
  
  public boolean b(int paramInt)
  {
    return (this.b & paramInt) != 0;
  }
  
  public boolean a(zzx paramzzx)
  {
    if (this.a == 4) {
      return !paramzzx.c();
    }
    if (!b(1)) {
      return true;
    }
    int i = ((DateTime)d()).getYear();
    return (i >= 1904) || ((!paramzzx.c()) && (i >= 1900));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zavo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */