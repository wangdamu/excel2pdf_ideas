package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zqa
  extends zcd
{
  zqa()
  {
    c(4102);
    b(8);
    this.b = new byte[8];
  }
  
  void a(int paramInt1, int paramInt2)
  {
    this.b[0] = -1;
    this.b[1] = -1;
    System.arraycopy(zc.a(paramInt1), 0, this.b, 2, 2);
    System.arraycopy(zc.a(paramInt2), 0, this.b, 4, 2);
  }
  
  void a(int paramInt)
  {
    this.b[0] = -1;
    this.b[1] = -1;
    System.arraycopy(zc.a(paramInt), 0, this.b, 2, 2);
    this.b[4] = 1;
  }
  
  void d(int paramInt)
    throws Exception
  {
    switch (paramInt)
    {
    case 0: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 14: 
    case 15: 
    case 16: 
    case 17: 
    case 18: 
    case 19: 
    case 20: 
    case 69: 
    case 70: 
    case 71: 
    case 72: 
      throw new Exception("Invalid chart type.");
    }
    this.b[4] = -3;
    this.b[5] = -1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zqa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */