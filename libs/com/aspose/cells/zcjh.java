package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;

public class zcjh
  extends CollectionBase
{
  private zcjs a = null;
  
  public zcjh(zcjs paramzcjs, int paramInt)
  {
    this.a = paramzcjs;
  }
  
  public void a(String paramString1, String paramString2)
  {
    zcjg localzcjg = new zcjg(this.a);
    localzcjg.g = paramString1;
    localzcjg.h = paramString2;
    zf.a(this.InnerList, localzcjg);
  }
  
  public zcjg a(int paramInt)
  {
    return (zcjg)this.InnerList.get(paramInt);
  }
  
  public zcjg a(String paramString)
  {
    for (int i = 0; i < getCount(); i++)
    {
      zcjg localzcjg = a(i);
      if (zw.b(localzcjg.k(), paramString)) {
        return localzcjg;
      }
    }
    return null;
  }
  
  public zcjg b(String paramString1, String paramString2)
  {
    for (int i = 0; i < getCount(); i++)
    {
      zcjg localzcjg = a(i);
      if (zw.b(localzcjg.g, paramString1)) {
        return localzcjg;
      }
    }
    return null;
  }
  
  public zcjg a(zcjg paramzcjg)
  {
    zf.a(this.InnerList, paramzcjg);
    paramzcjg.b = this.a;
    return paramzcjg;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcjh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */