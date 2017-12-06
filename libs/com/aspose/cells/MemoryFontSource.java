package com.aspose.cells;

import com.aspose.cells.a.d.zcp;
import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

public class MemoryFontSource
  extends FontSourceBase
{
  private byte[] a;
  
  public MemoryFontSource(byte[] fontData)
  {
    this.a = fontData;
  }
  
  public byte[] getFontData()
  {
    return this.a;
  }
  
  public int getType()
  {
    return 2;
  }
  
  FontSourceBase a()
  {
    byte[] arrayOfByte = new byte[this.a.length];
    System.arraycopy(this.a, 0, arrayOfByte, 0, arrayOfByte.length);
    return new MemoryFontSource(arrayOfByte);
  }
  
  ArrayList b()
  {
    ArrayList localArrayList = new ArrayList();
    zf.a(localArrayList, new zcp(this.a));
    return localArrayList;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/MemoryFontSource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */