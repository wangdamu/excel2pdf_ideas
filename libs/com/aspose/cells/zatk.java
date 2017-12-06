package com.aspose.cells;

import com.aspose.cells.b.a.zw;
import java.util.ArrayList;

class zatk
{
  static void a(zcjz paramzcjz, FontSettingCollection paramFontSettingCollection, String paramString)
    throws Exception
  {
    if ((paramFontSettingCollection == null) || (paramFontSettingCollection.getText() == null) || ("".equals(paramFontSettingCollection.getText()))) {
      return;
    }
    String str1 = paramFontSettingCollection.getText();
    paramzcjz.b("text:p");
    if ((paramString != null) && (!"".equals(paramString))) {
      paramzcjz.a("text", "style-name", null, paramString);
    }
    ArrayList localArrayList = paramFontSettingCollection.a(false, false);
    if (localArrayList.size() == 0)
    {
      a(paramzcjz, str1, paramFontSettingCollection.f(), paramString);
    }
    else
    {
      int i = -1;
      String str2 = null;
      for (int j = 0; j < localArrayList.size(); j++)
      {
        FontSetting localFontSetting = (FontSetting)localArrayList.get(j);
        if (localFontSetting.getStartIndex() >= str1.length()) {
          break;
        }
        if (localFontSetting.getStartIndex() - i != 1)
        {
          str2 = str1.substring(i + 1, i + 1 + (localFontSetting.getStartIndex() - i - 1));
          a(paramzcjz, str2, paramFontSettingCollection.f(), paramString);
        }
        if (localFontSetting.getStartIndex() + localFontSetting.getLength() >= str1.length()) {
          str2 = str1.substring(localFontSetting.getStartIndex());
        } else {
          str2 = str1.substring(localFontSetting.getStartIndex(), localFontSetting.getStartIndex() + localFontSetting.getLength());
        }
        a(paramzcjz, str2, localFontSetting.h() == null ? 0 : localFontSetting.getFont().m(), paramString);
        i = localFontSetting.getStartIndex() + localFontSetting.getLength() - 1;
        if (i >= str1.length()) {
          break;
        }
      }
    }
    paramzcjz.b();
  }
  
  private static void a(zcjz paramzcjz, String paramString1, int paramInt, String paramString2)
    throws Exception
  {
    String[] arrayOfString = zw.d(paramString1, '\n');
    for (int i = 0; i < arrayOfString.length; i++)
    {
      if ((arrayOfString[i] != null) && (!"".equals(arrayOfString[i])))
      {
        paramzcjz.b("text:span");
        paramzcjz.a("text", "style-name", null, "T" + zasp.a(paramInt));
        paramzcjz.a(arrayOfString[i]);
        paramzcjz.b();
      }
      if (i != arrayOfString.length - 1)
      {
        paramzcjz.b();
        paramzcjz.b("text:p");
        paramzcjz.a("text", "style-name", null, paramString2);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zatk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */