package com.aspose.cells.a.d;

import com.aspose.cells.b.a.d.zm;

public class zgh
  extends zgg
{
  private byte[] c;
  
  public byte[] d()
  {
    return this.c;
  }
  
  protected boolean a()
    throws Exception
  {
    if ((this.b[4] == 109) && (this.b[5] == 115) && (this.b[6] == 79) && (this.b[7] == 71))
    {
      int i = b();
      this.c = new byte[i - 11];
      a(11L);
      int j = 0;
      while (j < this.c.length)
      {
        int k = this.a.a(this.c, j, this.c.length - j);
        if (k <= 0)
        {
          this.c = null;
          return false;
        }
        j += k;
      }
      return false;
    }
    c();
    return true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zgh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */