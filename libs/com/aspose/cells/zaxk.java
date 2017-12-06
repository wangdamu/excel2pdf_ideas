package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;

class zaxk
  extends CollectionBase
{
  WorksheetCollection a;
  
  zaxk(WorksheetCollection paramWorksheetCollection)
  {
    this.a = paramWorksheetCollection;
  }
  
  public Style a(int paramInt)
  {
    return (Style)this.InnerList.get(paramInt);
  }
  
  int a(Style paramStyle)
  {
    if (paramStyle.e() == this.a)
    {
      int i = this.InnerList.size();
      for (int j = 0; j < i; j++)
      {
        Style localStyle2 = (Style)this.InnerList.get(j);
        if ((paramStyle == localStyle2) || ((paramStyle.h() == localStyle2.h()) && (paramStyle.c(localStyle2)) && (a(paramStyle.getFont(), localStyle2.getFont())) && (a(paramStyle, localStyle2)))) {
          return j;
        }
      }
    }
    Style localStyle1 = new Style(this.a);
    localStyle1.copy(paramStyle);
    zf.a(this.InnerList, localStyle1);
    return this.InnerList.size() - 1;
  }
  
  private boolean a(Style paramStyle1, Style paramStyle2)
  {
    BorderCollection localBorderCollection1 = paramStyle1.getBorders();
    BorderCollection localBorderCollection2 = paramStyle2.getBorders();
    return (localBorderCollection1.getByBorderType(4).b(localBorderCollection2.getByBorderType(4))) && (localBorderCollection1.getByBorderType(8).b(localBorderCollection2.getByBorderType(8))) && (localBorderCollection1.getByBorderType(1).b(localBorderCollection2.getByBorderType(1))) && (localBorderCollection1.getByBorderType(2).b(localBorderCollection2.getByBorderType(2)));
  }
  
  private boolean a(Font paramFont1, Font paramFont2)
  {
    return (paramFont1.b().a(paramFont2.b())) && (paramFont1.j() == paramFont2.j()) && (zw.b(paramFont1.getName(), paramFont2.getName())) && (paramFont1.isBold() == paramFont2.isBold()) && (paramFont1.isItalic() == paramFont2.isItalic()) && (paramFont1.e() == paramFont2.e()) && (zw.b(paramFont1.a(), paramFont2.a())) && (paramFont1.g() == paramFont2.g()) && (paramFont1.f() == paramFont2.f()) && (paramFont1.h() == paramFont2.h());
  }
  
  int b(Style paramStyle)
  {
    zf.a(this.InnerList, paramStyle);
    return getCount() - 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaxk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */