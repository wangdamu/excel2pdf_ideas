package com.aspose.cells;

class zho
  implements zaha
{
  private zabw a;
  private zajl b;
  private byte[] c;
  private zgs d = new zgs();
  
  public zho(Cells paramCells, byte[] paramArrayOfByte)
  {
    this.a = paramCells.a;
    this.b = paramCells.p().g;
    this.c = paramArrayOfByte;
    if (this.c != null) {
      this.d.c = 5;
    }
  }
  
  public boolean a(zt paramzt, int paramInt)
  {
    if (paramzt.h(paramInt) == 5)
    {
      int i = paramzt.j(paramInt);
      zaai localzaai1 = this.a.b[i];
      if (this.c != null)
      {
        byte[] arrayOfByte = new byte[this.c.length];
        System.arraycopy(this.c, 0, arrayOfByte, 0, this.c.length);
        zaai localzaai2 = new zaai(localzaai1.e, localzaai1.f, arrayOfByte);
        localzaai2.b(false);
        this.a.a(i, localzaai2);
        if (paramzt.e())
        {
          this.d.d = localzaai2;
          paramzt.b(paramInt, this.d);
        }
      }
      else
      {
        this.a.b(i);
        this.d.c = localzaai1.c;
        if (localzaai1.c == 4) {
          this.d.d = this.b.a((String)localzaai1.d);
        } else {
          this.d.d = localzaai1.d;
        }
        paramzt.b(paramInt, this.d);
      }
      return true;
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zho.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */