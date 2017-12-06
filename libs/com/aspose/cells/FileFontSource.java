package com.aspose.cells;

import com.aspose.cells.a.d.zau;
import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

public class FileFontSource
  extends FontSourceBase
{
  private String a;
  
  public FileFontSource(String filePath)
  {
    this.a = filePath;
  }
  
  public String getFilePath()
  {
    return this.a;
  }
  
  public int getType()
  {
    return 0;
  }
  
  FontSourceBase a()
  {
    return new FileFontSource(this.a);
  }
  
  ArrayList b()
  {
    ArrayList localArrayList = new ArrayList();
    zf.a(localArrayList, new zau(this.a));
    return localArrayList;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/FileFontSource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */