package com.aspose.cells;

import com.aspose.cells.b.a.zs;
import java.util.ArrayList;

class zbed
{
  private zcjz a;
  private Worksheet b;
  private Workbook c;
  
  zbed(zcjz paramzcjz, Worksheet paramWorksheet, Workbook paramWorkbook)
  {
    this.a = paramzcjz;
    this.b = paramWorksheet;
    this.c = paramWorkbook;
  }
  
  void a()
    throws Exception
  {
    if (this.b.getConditionalFormattings() == null) {
      return;
    }
    zcjz localzcjz = this.a;
    for (int i = 0; i < this.b.getConditionalFormattings().getCount(); i++)
    {
      FormatConditionCollection localFormatConditionCollection = this.b.getConditionalFormattings().get(i);
      localzcjz.b("x:ConditionalFormatting");
      if ((localFormatConditionCollection.b != null) || (localFormatConditionCollection.getCount() != 0))
      {
        String str = zauj.a(localFormatConditionCollection.b, 0, localFormatConditionCollection.b.size());
        localzcjz.b("x:Range", str);
        int[] arrayOfInt = localFormatConditionCollection.e();
        int j = arrayOfInt[0];
        int k = arrayOfInt[1];
        for (int m = 0; m < localFormatConditionCollection.getCount(); m++)
        {
          FormatCondition localFormatCondition = localFormatConditionCollection.get(m);
          a(localzcjz, localFormatCondition, j, k);
        }
        localzcjz.b();
      }
    }
  }
  
  void a(zcjz paramzcjz, FormatCondition paramFormatCondition, int paramInt1, int paramInt2)
    throws Exception
  {
    paramzcjz.b("x:Condition");
    if ((paramFormatCondition.getType() == 0) && (paramFormatCondition.b != 6))
    {
      localObject = zbek.a(paramFormatCondition.b);
      paramzcjz.b("x:Qualifier", (String)localObject);
    }
    paramzcjz.b("x:Value1");
    Object localObject = zauw.a(paramFormatCondition);
    String str1 = localObject[0];
    paramzcjz.a(zauj.L(str1));
    paramzcjz.b();
    if ((paramFormatCondition.b == 0) || (paramFormatCondition.b == 7))
    {
      paramzcjz.b("x:Value2");
      str1 = localObject[1];
      paramzcjz.a(zauj.L(str1));
      paramzcjz.b();
    }
    String str2 = a(paramFormatCondition);
    paramzcjz.b("x:Format");
    paramzcjz.a("Style", str2);
    paramzcjz.b();
    paramzcjz.b();
  }
  
  String a(FormatCondition paramFormatCondition)
  {
    Style localStyle = paramFormatCondition.getStyle();
    String str1 = a(localStyle);
    String str2 = b(localStyle);
    String str3 = c(localStyle);
    String str4 = str1 + str2 + str3;
    if (str4.endsWith(";")) {
      str4 = str4.substring(0, 0 + (str4.length() - 1));
    }
    return str4;
  }
  
  String a(Style paramStyle)
  {
    if (!paramStyle.isModified(11)) {
      return "";
    }
    Font localFont = paramStyle.getFont();
    StringBuilder localStringBuilder = new StringBuilder(100);
    if (paramStyle.isModified(16)) {
      if (localFont.k()) {
        localStringBuilder.append("color:windowtext;");
      } else {
        localStringBuilder.append("color:#" + zauj.a(localFont.getColor()) + ";");
      }
    }
    if (localFont.isItalic()) {
      localStringBuilder.append("font-style:italic;");
    }
    if (paramStyle.isModified(17)) {
      if (localFont.isBold()) {
        localStringBuilder.append("font-weight:700;");
      } else {
        localStringBuilder.append("font-weight:400;");
      }
    }
    if (paramStyle.isModified(19))
    {
      String str = zbek.b(localFont.getUnderline());
      localStringBuilder.append("text-underline-style:" + str + ";");
    }
    if (paramStyle.isModified(20)) {
      if (localFont.isStrikeout()) {
        localStringBuilder.append("text-line-through:single;");
      } else {
        localStringBuilder.append("text-line-through:none;");
      }
    }
    return zs.a(localStringBuilder);
  }
  
  String b(Style paramStyle)
  {
    if (!paramStyle.isModified(1)) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder(100);
    if (paramStyle.f())
    {
      localStringBuilder.append("border-top:" + zbek.a(paramStyle, 4) + ";");
      localStringBuilder.append("border-right:" + zbek.a(paramStyle, 2) + ";");
      localStringBuilder.append("border-bottom:" + zbek.a(paramStyle, 8) + ";");
      localStringBuilder.append("border-left:" + zbek.a(paramStyle, 1) + ";");
    }
    else
    {
      localStringBuilder.append("border:none;");
    }
    return zs.a(localStringBuilder);
  }
  
  String c(Style paramStyle)
  {
    if ((paramStyle.isModified(33)) || (paramStyle.isModified(35)) || (paramStyle.isModified(34))) {
      return zbek.a(paramStyle);
    }
    return "";
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbed.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */