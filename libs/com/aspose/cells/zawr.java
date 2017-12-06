package com.aspose.cells;

abstract class zawr
{
  abstract void a();
  
  abstract void b();
  
  abstract void a(zawr paramzawr, CopyOptions paramCopyOptions);
  
  abstract void a(int paramInt1, int paramInt2, Worksheet paramWorksheet);
  
  abstract void b(int paramInt1, int paramInt2, Worksheet paramWorksheet);
  
  abstract String[] d();
  
  abstract void a(String[] paramArrayOfString, Worksheet paramWorksheet);
  
  abstract byte c();
  
  boolean e()
  {
    return (c() != 1) && (c() != 4);
  }
  
  static zawr a(zawp paramzawp, byte paramByte)
  {
    switch (paramByte)
    {
    case 4: 
      return new zno(paramzawp);
    case 1: 
      return new zboy(paramzawp);
    }
    return new zbxs(paramByte);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zawr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */