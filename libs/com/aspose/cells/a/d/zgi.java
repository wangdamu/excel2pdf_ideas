package com.aspose.cells.a.d;

import com.aspose.cells.a.e.zh;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.c.a.za;

public class zgi
  extends zgg
{
  private byte[] c;
  private zm d;
  private int e = 0;
  private static final za f = new za(new String[] { "gIFx", "gIFg" });
  
  public zgi(byte[] paramArrayOfByte, zm paramzm)
  {
    this.c = paramArrayOfByte;
    this.d = paramzm;
  }
  
  public void a(zm paramzm)
    throws Exception
  {
    this.b[0] = -119;
    this.b[1] = 80;
    this.b[2] = 78;
    this.b[3] = 71;
    this.b[4] = 13;
    this.b[5] = 10;
    this.b[6] = 26;
    this.b[7] = 10;
    this.d.b(this.b, 0, this.b.length);
    super.a(paramzm);
    switch (this.e)
    {
    case 0: 
      a("gIFx");
      this.e += 1;
      a("gIFg");
      this.e += 1;
      e();
      this.e += 1;
      break;
    case 1: 
      a("gIFg");
      this.e += 1;
      e();
      this.e += 1;
      break;
    case 2: 
      e();
      this.e += 1;
    }
  }
  
  protected boolean a()
    throws Exception
  {
    if (this.e > 2)
    {
      d();
      return true;
    }
    if ((this.b[4] == 73) && (this.b[5] == 72) && (this.b[6] == 68) && (this.b[7] == 82))
    {
      d();
      a("gIFx");
      this.e += 1;
    }
    else if ((this.b[4] == 98) && (this.b[5] == 75) && (this.b[6] == 71) && (this.b[7] == 68))
    {
      d();
      switch (this.e)
      {
      case 0: 
        a("gIFx");
        this.e += 1;
        a("gIFg");
        this.e += 1;
        break;
      case 1: 
        a("gIFg");
        this.e += 1;
      }
    }
    else if ((this.b[4] == 99) && (this.b[5] == 77) && (this.b[6] == 80) && (this.b[7] == 80))
    {
      switch (this.e)
      {
      case 0: 
        a("gIFx");
        this.e += 1;
        a("gIFg");
        this.e += 1;
        break;
      case 1: 
        a("gIFg");
        this.e += 1;
      }
      d();
    }
    else if ((this.b[4] == 73) && (this.b[5] == 68) && (this.b[6] == 65) && (this.b[7] == 84))
    {
      switch (this.e)
      {
      case 0: 
        a("gIFx");
        this.e += 1;
        a("gIFg");
        this.e += 1;
        d();
        e();
        this.e += 1;
        break;
      case 1: 
        a("gIFg");
        this.e += 1;
        d();
        e();
        this.e += 1;
        break;
      case 2: 
        d();
        e();
        this.e += 1;
      }
    }
    else
    {
      d();
    }
    return true;
  }
  
  private void d()
    throws Exception
  {
    this.d.b(this.b, 0, this.b.length);
    int i = b() + 4;
    byte[] arrayOfByte = new byte[i];
    while (i > 0)
    {
      int j = this.a.a(arrayOfByte, arrayOfByte.length - i, i);
      if (j <= 0) {
        return;
      }
      i -= j;
    }
    this.d.b(arrayOfByte, 0, arrayOfByte.length);
  }
  
  private void a(String paramString)
    throws Exception
  {
    byte[] arrayOfByte;
    switch (f.a(paramString))
    {
    case 0: 
      arrayOfByte = new byte[] { 0, 0, 0, 14, 103, 73, 70, 120, 78, 69, 84, 83, 67, 65, 80, 69, 50, 46, 48, 1, 0, 0, 36, 78, -104, 80 };
      break;
    case 1: 
      arrayOfByte = new byte[] { 0, 0, 0, 4, 103, 73, 70, 103, 2, 0, 0, 14, -47, 61, -31, -63 };
      break;
    default: 
      return;
    }
    this.d.b(arrayOfByte, 0, arrayOfByte.length);
  }
  
  private void e()
    throws Exception
  {
    zh localzh = new zh();
    a(this.c.length + 11, this.d);
    byte[] arrayOfByte = { 109, 115, 79, 71, 77, 83, 79, 70, 70, 73, 67, 69, 57, 46, 48 };
    this.d.b(arrayOfByte, 0, arrayOfByte.length);
    localzh.a(arrayOfByte);
    this.d.b(this.c, 0, this.c.length);
    localzh.a(this.c);
    a((int)(localzh.a() & 0xFFFFFFFF), this.d);
  }
  
  private void a(int paramInt, zm paramzm)
    throws Exception
  {
    byte[] arrayOfByte = zc.a(paramInt);
    for (int i = 3; i > -1; i--) {
      paramzm.a(arrayOfByte[i]);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zgi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */