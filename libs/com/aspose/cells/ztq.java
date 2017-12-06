package com.aspose.cells;

import java.util.HashMap;

class ztq
{
  private int b = 0;
  String[] a;
  private HashMap c;
  
  public ztq(String[] paramArrayOfString)
  {
    this(0, paramArrayOfString);
  }
  
  public ztq(int paramInt, String[] paramArrayOfString)
  {
    this.b = paramInt;
    this.a = paramArrayOfString;
    this.c = new HashMap(paramArrayOfString.length);
    for (int i = 0; i < paramArrayOfString.length; i++) {
      this.c.put(paramArrayOfString[i], Integer.valueOf(i + paramInt));
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ztq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */