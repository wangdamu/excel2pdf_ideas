package com.aspose.cells;

import com.aspose.cells.b.a.zh;

public class FileFormatInfo
{
  int a = 255;
  boolean b;
  boolean c;
  zh d;
  
  public boolean isProtectedByRMS()
  {
    return this.c;
  }
  
  public boolean isEncrypted()
  {
    return this.b;
  }
  
  public int getFileFormatType()
  {
    return this.a;
  }
  
  public int getLoadFormat()
  {
    return FileFormatUtil.b(this.a);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/FileFormatInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */