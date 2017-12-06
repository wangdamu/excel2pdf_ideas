package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;

/**
 * @deprecated
 */
public class StyleCollection
{
  private WorksheetCollection b;
  ArrayList a = new ArrayList();
  
  StyleCollection(WorksheetCollection sheets)
  {
    this.b = sheets;
  }
  
  public Style getThemeStyle(int themeColorType, double tint)
  {
    Style localStyle = new Style(this.b);
    localStyle.getFont().a(this.b.T().getName(), true, this.b.T().n());
    localStyle.getFont().setSize(this.b.T().getSize());
    localStyle.getFont().e(this.b.T());
    localStyle.b(16);
    localStyle.setPattern(1);
    localStyle.b(34);
    localStyle.b.a(4, themeColorType);
    localStyle.b.a(tint);
    return localStyle;
  }
  
  public Style createBuiltinStyle(int type)
  {
    return zbtc.a(type, this.b);
  }
  
  public int add()
  {
    int i = this.a.size();
    Style localStyle = new Style(this.b);
    localStyle.a(this.b, 15);
    zf.a(this.a, localStyle);
    i++;
    return i - 1;
  }
  
  int a(Style paramStyle)
  {
    zf.a(this.a, paramStyle);
    return this.a.size() - 1;
  }
  
  public Style get(int index)
  {
    return (Style)this.a.get(index);
  }
  
  public Style get(String name)
  {
    return this.b.C().a(name);
  }
  
  public int getCount()
  {
    return this.a.size();
  }
  
  void a(Style paramStyle, boolean paramBoolean)
  {
    if (paramBoolean) {
      zf.a(this.a, paramStyle);
    } else {
      for (int i = 0; i < getCount(); i++) {
        if (zw.b(get(i).getName(), paramStyle.getName()))
        {
          this.a.set(i, paramStyle);
          return;
        }
      }
    }
  }
  
  void a()
  {
    this.a.clear();
  }
  
  void a(StyleCollection paramStyleCollection)
  {
    for (int i = 0; i < paramStyleCollection.a.size(); i++)
    {
      Style localStyle1 = (Style)paramStyleCollection.a.get(i);
      Style localStyle2 = new Style(this.b);
      localStyle2.copy(localStyle1);
      if (localStyle1.getName() != null) {
        localStyle2.a(localStyle1.getName());
      }
      zf.a(this.a, localStyle2);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/StyleCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */