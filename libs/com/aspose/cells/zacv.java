package com.aspose.cells;

class zacv
  implements zaig
{
  private int a;
  private int[] b;
  private int[] c;
  
  public zacv(int paramInt, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    this.a = paramInt;
    this.b = paramArrayOfInt1;
    this.c = paramArrayOfInt2;
  }
  
  public int a()
  {
    return this.a;
  }
  
  public int a(int paramInt)
  {
    if (paramInt < this.b.length) {
      return this.b[paramInt];
    }
    return this.b[(this.b.length - 1)];
  }
  
  public int b(int paramInt)
  {
    if (paramInt < this.c.length) {
      return this.c[paramInt];
    }
    return this.c[(this.c.length - 1)];
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zacv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */