package com.aspose.cells;

import com.aspose.cells.b.a.zw;

class zbsr
  implements zajj
{
  private String a;
  private boolean b;
  private boolean c;
  
  zbsr(String paramString, boolean paramBoolean)
  {
    this(paramString, b(paramString), paramBoolean);
  }
  
  zbsr(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.b = paramBoolean1;
    this.c = paramBoolean2;
    if (paramBoolean2) {
      this.a = paramString.toUpperCase();
    } else {
      this.a = paramString;
    }
  }
  
  public boolean a(String paramString)
  {
    if (this.b) {
      return zbsn.a(this.a, paramString, this.c) == 0;
    }
    if (this.c) {
      return zw.b(paramString.toUpperCase(), this.a);
    }
    return zw.b(paramString, this.a);
  }
  
  private static boolean b(String paramString)
  {
    return zw.a(paramString, new char[] { '?', '*' }) != -1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbsr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */