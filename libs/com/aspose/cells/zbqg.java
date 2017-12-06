package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;

class zbqg
  extends CollectionBase
{
  public zbqf a(int paramInt)
  {
    return (zbqf)this.InnerList.get(paramInt);
  }
  
  int a(String paramString1, String paramString2)
  {
    for (int i = 0; i < getCount(); i++)
    {
      zbqf localzbqf2 = (zbqf)this.InnerList.get(i);
      if ((zw.a(paramString1, localzbqf2.a(), true) == 0) && (zw.a(paramString2, localzbqf2.b(), true) == 0)) {
        return i;
      }
    }
    zbqf localzbqf1 = new zbqf(paramString1, paramString2);
    zf.a(this.InnerList, localzbqf1);
    return getCount() - 1;
  }
  
  int a(String paramString1, String paramString2, String paramString3)
  {
    for (int i = 0; i < getCount(); i++)
    {
      zbqf localzbqf2 = (zbqf)this.InnerList.get(i);
      if ((zw.a(paramString1, localzbqf2.a(), true) == 0) && (zw.a(paramString2, localzbqf2.b(), true) == 0)) {
        return i;
      }
    }
    zbqf localzbqf1 = new zbqf(paramString1, paramString2);
    localzbqf1.a = paramString3;
    zf.a(this.InnerList, localzbqf1);
    return getCount() - 1;
  }
  
  int a(zbqf paramzbqf)
  {
    return this.InnerList.indexOf(paramzbqf);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbqg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */