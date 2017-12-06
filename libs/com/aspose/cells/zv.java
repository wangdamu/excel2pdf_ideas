package com.aspose.cells;

abstract class zv
  extends zi
{
  public abstract void j(int paramInt1, int paramInt2);
  
  public abstract int a(int paramInt1, zbdx paramzbdx, int paramInt2);
  
  public abstract zt f(int paramInt);
  
  public abstract zt a(Object paramObject);
  
  public abstract void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public abstract zbdx b(int paramInt1, zbdx paramzbdx, int paramInt2);
  
  public abstract void c(int paramInt1, zbdx paramzbdx, int paramInt2);
  
  public abstract byte k(int paramInt1, int paramInt2);
  
  public abstract void a(int paramInt1, int paramInt2, byte paramByte);
  
  public abstract int g(int paramInt);
  
  public void a(boolean paramBoolean) {}
  
  public zt[] l(int paramInt1, int paramInt2)
  {
    int i = b(paramInt1);
    if (paramInt1 == paramInt2)
    {
      if (i < 0) {
        return null;
      }
      return new zt[] { f(i) };
    }
    int j;
    if (i < 0)
    {
      i = -i - 1;
      j = a(paramInt2, i, -1);
      if (j < 0)
      {
        j = a(-j - 1, true);
        if (j < i) {
          return null;
        }
      }
    }
    else
    {
      j = a(i, false);
      if (j < 0) {
        return new zt[] { f(i) };
      }
      j = a(paramInt2, j, -1);
      if (j < 0) {
        j = a(-j - 1, true);
      }
    }
    zt[] arrayOfzt = new zt[e(i, j)];
    for (int k = 0; k < arrayOfzt.length; k++)
    {
      arrayOfzt[k] = f(i);
      i = a(i, false);
    }
    return arrayOfzt;
  }
  
  public int a(int paramInt, zt paramzt, boolean paramBoolean)
  {
    zbdx localzbdx = paramzt.a(new zbdx(), 15);
    paramInt = a(paramInt, localzbdx, paramzt.a());
    zt localzt = f(paramInt);
    if (paramzt.a() > 0) {
      localzt.a(-1, paramzt, -1, paramzt.a(), paramBoolean);
    }
    return paramInt;
  }
  
  public abstract int a(int paramInt1, zv paramzv, int paramInt2, int paramInt3, boolean paramBoolean);
  
  public zahb a(Cells paramCells, RowCollection paramRowCollection, int paramInt)
  {
    return new zhs(paramCells, paramRowCollection);
  }
  
  public boolean d()
  {
    return true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */