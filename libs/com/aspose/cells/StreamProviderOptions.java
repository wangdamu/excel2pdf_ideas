package com.aspose.cells;

import com.aspose.cells.b.a.d.zj;
import com.aspose.cells.b.a.d.zm;
import java.io.OutputStream;

public class StreamProviderOptions
{
  String a;
  String b;
  zm c;
  private int d = 2;
  
  public int getResourceLoadingType()
  {
    return this.d;
  }
  
  public void setResourceLoadingType(int value)
  {
    this.d = value;
  }
  
  public String getDefaultPath()
  {
    return this.a;
  }
  
  public void setCustomPath(String value)
  {
    this.b = value;
  }
  
  public OutputStream getStream()
  {
    try
    {
      return ((zj)this.c).j();
    }
    catch (Exception localException)
    {
      throw new CellsException(6, localException.getMessage());
    }
  }
  
  public void setStream(OutputStream value)
  {
    this.c = new zj(value);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/StreamProviderOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */