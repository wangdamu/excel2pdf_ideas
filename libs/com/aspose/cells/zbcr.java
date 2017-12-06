package com.aspose.cells;

class zbcr
  extends zbbu
{
  byte b;
  String c;
  byte d;
  CellArea e;
  int f;
  boolean g;
  boolean h;
  int i;
  int j;
  int k = -1;
  
  public int a()
  {
    return 9;
  }
  
  void a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, int paramInt)
  {
    byte b1 = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    switch (paramInt)
    {
    case 2: 
      i1 = 1;
      break;
    case 0: 
      m = 1;
      break;
    case 3: 
      break;
    case 1: 
      n = 1;
      m = 1;
      break;
    case 4: 
      n = 1;
      break;
    }
    if (i1 != 0) {
      this.b = 38;
    } else if (paramBoolean4) {
      b1 = (byte)(m != 0 ? 61 : 60);
    } else if (paramBoolean1) {
      b1 = (byte)(m != 0 ? 59 : 58);
    } else if (n != 0) {
      b1 = (byte)(m != 0 ? 43 : 42);
    } else {
      b1 = (byte)(m != 0 ? 37 : 36);
    }
    if (paramBoolean3) {
      b1 = (byte)(b1 | 0x40);
    }
    if (paramBoolean2) {
      b1 = (byte)(b1 | 0x60);
    }
    this.b = b1;
  }
  
  static int a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (paramBoolean3) {
      return 2;
    }
    if (paramBoolean2) {
      return paramBoolean1 ? 1 : 4;
    }
    return paramBoolean1 ? 0 : 3;
  }
  
  boolean[] b()
  {
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    if ((this.b & 0xFF & 0x60) == 96) {
      n = 1;
    } else if ((this.b & 0xFF & 0x40) == 64) {
      i1 = 1;
    }
    switch (this.b)
    {
    case 36: 
      break;
    case 37: 
      i3 = 1;
      break;
    case 38: 
      i5 = 1;
      i3 = 1;
      break;
    case 42: 
      i4 = 1;
      break;
    case 43: 
      i3 = 1;
      i4 = 1;
      break;
    case 58: 
      m = 1;
      break;
    case 59: 
      i3 = 1;
      m = 1;
      break;
    case 60: 
      i2 = 1;
      i4 = 1;
      break;
    case 61: 
      i3 = 1;
      i4 = 1;
      i2 = 1;
      break;
    }
    return new boolean[] { m, n, i1, i2, i3, i4, i5 };
  }
  
  String c()
  {
    return CellsHelper.cellIndexToName(this.i, this.j);
  }
  
  void a(String paramString)
  {
    int m = 0;
    int n = 0;
    int[] arrayOfInt1 = { m };
    int[] arrayOfInt2 = { n };
    CellsHelper.a(paramString, arrayOfInt1, arrayOfInt2);
    m = arrayOfInt1[0];
    n = arrayOfInt2[0];
    this.i = m;
    this.j = n;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbcr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */