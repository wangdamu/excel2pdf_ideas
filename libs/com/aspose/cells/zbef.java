package com.aspose.cells;

import com.aspose.cells.a.c.zh;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;

class zbef
{
  private Worksheet a;
  private static final za b = new za(new String[] { "color", "font-style", "font-weight", "text-underline-style", "text-line-through", "border-top", "border-right", "border-bottom", "border-left", "border", "background", "mso-background-source", "mso-pattern" });
  
  zbef(Worksheet paramWorksheet)
  {
    this.a = paramWorksheet;
  }
  
  void a(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    int i = this.a.getConditionalFormattings().add();
    FormatConditionCollection localFormatConditionCollection = this.a.getConditionalFormattings().get(i);
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("Range".equals(paramzcjy.q()))
      {
        String str = paramzcjy.j();
        ArrayList localArrayList = new ArrayList();
        if ((str != null) && (str.length() > 0)) {
          zbek.a(str, localArrayList);
        }
        zf.a(localFormatConditionCollection.b, localArrayList);
      }
      else if ("Condition".equals(paramzcjy.q()))
      {
        a(paramzcjy, localFormatConditionCollection);
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  void a(zcjy paramzcjy, FormatConditionCollection paramFormatConditionCollection)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    int[] arrayOfInt = paramFormatConditionCollection.e();
    int i = arrayOfInt[0];
    int j = arrayOfInt[1];
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("Qualifier".equals(paramzcjy.q()))
      {
        str1 = paramzcjy.j();
      }
      else if ("Value1".equals(paramzcjy.q()))
      {
        str2 = paramzcjy.j();
        str2 = zauj.L(str2);
        str2 = zauw.b(str2, i, j);
      }
      else if ("Value2".equals(paramzcjy.q()))
      {
        str3 = paramzcjy.j();
        str3 = zauj.L(str3);
        str3 = zauw.b(str3, i, j);
      }
      else if ("Format".equals(paramzcjy.q()))
      {
        str4 = paramzcjy.a("Style");
        paramzcjy.a();
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
    int k = 6;
    int m = 0;
    if (str1 == null)
    {
      m = 1;
      if ((str2 != null) && (str2.length() > 0) && (str2.charAt(0) != '=')) {
        str2 = '=' + str2;
      }
      if ((str3 != null) && (str3.length() > 0) && (str3.charAt(0) != '=')) {
        str3 = '=' + str3;
      }
    }
    else
    {
      k = zbek.a(str1);
    }
    int n = paramFormatConditionCollection.addCondition(m, k, str2, str3);
    if (str4 != null) {
      a(str4, paramFormatConditionCollection.get(n));
    }
  }
  
  private void a(String paramString, FormatCondition paramFormatCondition)
  {
    Style localStyle = paramFormatCondition.getStyle();
    String[] arrayOfString1 = zw.d(paramString, ';');
    for (int i = 0; i < arrayOfString1.length; i++)
    {
      String str1 = arrayOfString1[i].trim();
      if (str1.length() != 0)
      {
        String[] arrayOfString2 = zw.d(str1, ':');
        if (arrayOfString2.length >= 1)
        {
          String str2 = arrayOfString2[0].trim();
          String str3 = arrayOfString2[1].trim();
          if ((str2.length() != 0) && (str3.length() != 0)) {
            a(localStyle, str2, str3);
          }
        }
      }
    }
  }
  
  private Color a(String paramString)
  {
    Color localColor = Color.getEmpty();
    try
    {
      if (paramString.startsWith("#"))
      {
        localColor = zbek.c(paramString.substring(1));
      }
      else
      {
        localColor = Color.a(paramString);
        if ((localColor.getA() == 0) && (localColor.getR() == 0) && (localColor.getG() == 0) && (localColor.getB() == 0) && (!"black".equals(paramString.toLowerCase()))) {
          localColor = Color.getEmpty();
        }
      }
    }
    catch (Exception localException) {}
    return localColor;
  }
  
  private void a(Style paramStyle, String paramString1, String paramString2)
  {
    switch (b.a(paramString1))
    {
    case 0: 
      if ("windowtext".equals(paramString2))
      {
        paramStyle.getFont().b(true);
        paramStyle.b(16);
      }
      else
      {
        Color localColor = a(paramString2);
        if (!zh.a(localColor)) {
          paramStyle.getFont().setColor(localColor);
        }
      }
      break;
    case 1: 
      if ("italic".equals(paramString2)) {
        paramStyle.getFont().setItalic(true);
      }
      break;
    case 2: 
      paramStyle.getFont().b(zp.a(paramString2));
      break;
    case 3: 
      paramStyle.getFont().setUnderline(zbek.b(paramString2));
      break;
    case 4: 
      if ("none".equals(paramString2)) {
        paramStyle.getFont().setStrikeout(false);
      } else {
        paramStyle.getFont().setStrikeout(true);
      }
      break;
    case 5: 
      a(paramStyle, 4, paramString2);
      break;
    case 6: 
      a(paramStyle, 2, paramString2);
      break;
    case 7: 
      a(paramStyle, 8, paramString2);
      break;
    case 8: 
      a(paramStyle, 1, paramString2);
      break;
    case 9: 
      a(paramStyle, 4, paramString2);
      a(paramStyle, 2, paramString2);
      a(paramStyle, 8, paramString2);
      a(paramStyle, 1, paramString2);
      break;
    case 10: 
      b(paramStyle, paramString2);
      break;
    case 11: 
      b(paramStyle, paramString2);
      break;
    case 12: 
      a(paramStyle, paramString2);
      break;
    }
  }
  
  private void a(Style paramStyle, String paramString)
  {
    Object localObject = null;
    String str = null;
    String[] arrayOfString = zw.d(paramString, ' ');
    if (arrayOfString.length == 2)
    {
      localObject = arrayOfString[0];
      str = arrayOfString[1];
    }
    else
    {
      localObject = arrayOfString[0];
      str = arrayOfString[0];
    }
    if ("auto".equals(localObject))
    {
      paramStyle.b.b(true);
      paramStyle.b(34);
    }
    else
    {
      Color localColor = a((String)localObject);
      if (!zh.a(localColor)) {
        paramStyle.setForegroundColor(localColor);
      }
    }
    int i = zbek.e(str);
    if (i != 0) {
      paramStyle.setPattern(i);
    }
  }
  
  private void b(Style paramStyle, String paramString)
  {
    if ("auto".equals(paramString))
    {
      paramStyle.a.b(true);
      paramStyle.b(35);
    }
    else
    {
      Color localColor = a(paramString);
      if (!zh.a(localColor)) {
        paramStyle.setBackgroundColor(localColor);
      }
    }
  }
  
  private void a(Style paramStyle, int paramInt, String paramString)
  {
    Border localBorder = paramStyle.getBorders().getByBorderType(paramInt);
    if ("none".equals(paramString))
    {
      localBorder.setLineStyle(0);
      return;
    }
    String[] arrayOfString = zw.d(paramString, ' ');
    if (arrayOfString.length != 3) {
      return;
    }
    try
    {
      localBorder.setLineStyle(zbek.d(arrayOfString[0] + " " + arrayOfString[1]));
    }
    catch (Exception localException) {}
    String str = arrayOfString[2];
    if ("windowtext".equals(str))
    {
      localBorder.a.b(true);
    }
    else
    {
      Color localColor = a(str);
      if (!zh.a(localColor)) {
        localBorder.setColor(localColor);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */