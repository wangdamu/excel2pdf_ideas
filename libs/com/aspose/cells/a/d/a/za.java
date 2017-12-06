package com.aspose.cells.a.d.a;

import java.io.IOException;
import java.io.OutputStream;

public class za
  extends zb
{
  private boolean c;
  private za d = null;
  
  public za(OutputStream paramOutputStream, boolean paramBoolean)
  {
    super(paramOutputStream, paramBoolean);
  }
  
  public void a(boolean paramBoolean)
  {
    this.c = paramBoolean;
    if (this.d == null) {
      this.d = new za();
    }
  }
  
  public void write(int b)
    throws IOException
  {
    if (!this.c) {
      super.write(b);
    } else {
      this.d.a((byte)b);
    }
  }
  
  public void a()
    throws IOException
  {
    if (this.d != null)
    {
      super.write(this.d.b(), 0, this.d.a());
      this.d = new za();
    }
  }
  
  public int b()
  {
    if (this.d != null) {
      return this.d.a();
    }
    return -1;
  }
  
  static class za
  {
    byte[] a = new byte['Ā'];
    int b = 0;
    
    void a(byte paramByte)
    {
      if (this.b + 1 > this.a.length)
      {
        byte[] arrayOfByte = new byte[this.a.length << 1];
        System.arraycopy(this.a, 0, arrayOfByte, 0, this.b);
        this.a = arrayOfByte;
      }
      this.a[this.b] = paramByte;
      this.b += 1;
    }
    
    int a()
    {
      return this.b;
    }
    
    byte[] b()
    {
      return this.a;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/a/za.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */