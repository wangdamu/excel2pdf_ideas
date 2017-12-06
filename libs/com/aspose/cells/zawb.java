package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zawb
  extends zbdd
{
  byte[] a;
  zawa b;
  
  zawa a()
  {
    if (this.b == null)
    {
      this.b = new zawa();
      this.b.a(this.a, this.c.length());
    }
    return this.b;
  }
  
  int b()
  {
    if (this.b != null) {
      return this.b.b;
    }
    return zc.b(this.a, 4);
  }
  
  byte c()
  {
    if (this.b != null) {
      return this.b.a;
    }
    return this.a[6];
  }
  
  byte[] d()
  {
    if (this.a == null)
    {
      if (this.b == null) {
        return null;
      }
      this.a = this.b.c(this.c.length());
    }
    return this.a;
  }
  
  zawb(String paramString, byte[] paramArrayOfByte, Object paramObject)
  {
    this.c = paramString;
    if ((paramObject instanceof byte[])) {
      this.a = ((byte[])paramObject);
    } else {
      this.b = ((zawa)paramObject);
    }
    this.f = paramArrayOfByte;
  }
  
  boolean e()
  {
    return false;
  }
  
  boolean f()
  {
    return (this.f != null) || ((i() != null) && (i().size() > 0));
  }
  
  boolean g()
  {
    return true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zawb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */