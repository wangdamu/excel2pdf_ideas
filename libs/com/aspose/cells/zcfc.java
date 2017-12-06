package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zcfc
  extends zche
{
  zcfc()
  {
    this.d = 637;
  }
  
  void a(FontSettingCollection paramFontSettingCollection, Workbook paramWorkbook)
    throws Exception
  {
    int i = 0;
    ArrayList localArrayList = paramFontSettingCollection.a(false, false);
    if (localArrayList != null) {
      i = localArrayList.size();
    } else {
      i = 1;
    }
    if (paramFontSettingCollection.getText() != null) {
      this.c = new byte[5 + paramFontSettingCollection.getText().length() * 2 + 4 + i * 4];
    }
    this.c[0] = 1;
    int j = 1;
    j = zcgj.a(this.c, j, paramFontSettingCollection.getText());
    System.arraycopy(zc.a(i), 0, this.c, j, 4);
    j += 4;
    int k;
    int n;
    if (i == 1)
    {
      k = 0;
      int m = paramFontSettingCollection.f();
      System.arraycopy(zc.a(k), 0, this.c, j, 2);
      j += 2;
      n = a(m, paramWorkbook.getWorksheets());
      System.arraycopy(zc.a(n), 0, this.c, j, 2);
      j += 2;
    }
    else
    {
      for (k = 0; k < i; k++)
      {
        FontSetting localFontSetting = (FontSetting)localArrayList.get(k);
        n = localFontSetting.getStartIndex();
        int i1 = localFontSetting.getFont().m();
        int i2 = a(i1, paramWorkbook.getWorksheets());
        System.arraycopy(zc.a(n), 0, this.c, j, 2);
        j += 2;
        System.arraycopy(zc.a(i2), 0, this.c, j, 2);
        j += 2;
      }
    }
  }
  
  private int a(int paramInt, WorksheetCollection paramWorksheetCollection)
  {
    for (int i = 0; i < paramWorksheetCollection.A().size(); i++)
    {
      Font localFont = (Font)paramWorksheetCollection.A().get(i);
      if (paramInt == localFont.m()) {
        return i;
      }
    }
    return -1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcfc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */