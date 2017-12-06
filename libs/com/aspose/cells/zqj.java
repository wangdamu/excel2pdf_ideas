package com.aspose.cells;

import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.zc;

class zqj
{
  zh a;
  private boolean b = false;
  
  boolean a()
  {
    return this.b;
  }
  
  zqj(zh paramzh)
  {
    this.a = paramzh;
  }
  
  int a(byte[] paramArrayOfByte)
    throws Exception
  {
    if (this.b) {
      throw new Exception("End of stream reached.");
    }
    int i = this.a.a(paramArrayOfByte, 0, paramArrayOfByte.length);
    if (i < paramArrayOfByte.length) {
      this.b = true;
    }
    return i;
  }
  
  int b(byte[] paramArrayOfByte)
    throws Exception
  {
    if (this.b) {
      throw new Exception("End of stream reached.");
    }
    int i = this.a.a(paramArrayOfByte, 0, 2);
    if (i < 2) {
      this.b = true;
    }
    return zc.e(paramArrayOfByte, 0);
  }
  
  void a(int paramInt)
    throws Exception
  {
    this.a.a(paramInt, 1);
  }
  
  long b()
    throws Exception
  {
    return this.a.i();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zqj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */