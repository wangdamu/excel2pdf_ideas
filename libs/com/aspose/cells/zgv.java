package com.aspose.cells;

import com.aspose.cells.a.c.zy;
import com.aspose.cells.b.a.zo;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class zgv
{
  private static final za a = new za(new String[] { "FONT-WEIGHT", "FONT-STYLE", "TEXT-DECORATION", "FONT-FAMILY", "COLOR", "BACKGROUND-COLOR", "FONT-SIZE", "UNDERLINE", "LINE-THROUGH", "X-SMALL", "XX-SMALL", "SMALL", "MEDIUM", "LARGE", "X-LARGE", "XX-LARGE", "PX", "PT", "IN", "CM", "SIZE", "FACE", "P", "OL", "UL", "LI", "TD", "FONT", "SPAN", "B", "STRONG", "I", "U", "S", "STRIKE", "SUP", "SUB", "BR" });
  
  private static String a(Style paramStyle, int paramInt, Font paramFont)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramFont.isBold()) {
      localStringBuilder.append("FONT-WEIGHT: bold;");
    }
    if (paramFont.isItalic()) {
      localStringBuilder.append("FONT-STYLE: italic;");
    }
    if ((paramFont.getUnderline() != 0) || (paramFont.isStrikeout()))
    {
      localStringBuilder.append("TEXT-DECORATION:");
      if (paramFont.getUnderline() != 0)
      {
        localStringBuilder.append(" underline");
        if (paramFont.isStrikeout()) {
          localStringBuilder.append(" line-through;");
        } else {
          localStringBuilder.append(";");
        }
      }
      else if (paramFont.isStrikeout())
      {
        localStringBuilder.append(" line-through;");
      }
    }
    localStringBuilder.append("FONT-FAMILY: " + paramFont.getName() + ";");
    localStringBuilder.append("FONT-SIZE: " + zo.b(paramFont.getDoubleSize()) + "pt;");
    localStringBuilder.append("COLOR: #" + com.aspose.cells.a.c.zp.b(com.aspose.cells.a.c.zh.b(paramFont.getColor()) & 0xFF) + com.aspose.cells.a.c.zp.b(com.aspose.cells.a.c.zh.c(paramFont.getColor()) & 0xFF) + com.aspose.cells.a.c.zp.b(com.aspose.cells.a.c.zh.d(paramFont.getColor()) & 0xFF) + ";");
    String str = null;
    switch (paramInt)
    {
    case 7: 
      str = "left;";
      break;
    case 8: 
      str = "right;";
      break;
    case 1: 
      str = "center;";
      break;
    }
    if (str != null) {
      localStringBuilder.append("TEXT-ALIGN: " + str);
    }
    if ((paramStyle != null) && (paramStyle.getPattern() == 1) && (!paramStyle.b.b()))
    {
      Color localColor = paramStyle.getForegroundColor();
      localStringBuilder.append("Background-Color: #" + com.aspose.cells.a.c.zp.b(com.aspose.cells.a.c.zh.b(localColor) & 0xFF) + com.aspose.cells.a.c.zp.b(com.aspose.cells.a.c.zh.c(localColor) & 0xFF) + com.aspose.cells.a.c.zp.b(com.aspose.cells.a.c.zh.d(localColor) & 0xFF) + ";");
    }
    return zs.a(localStringBuilder);
  }
  
  private static void a(zcjz paramzcjz, String paramString, int paramInt1, int paramInt2)
    throws Exception
  {
    char[] arrayOfChar = paramString.toCharArray();
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 1;
    for (int j = paramInt1; j <= paramInt2; j++) {
      if (arrayOfChar[j] != '\r') {
        if (arrayOfChar[j] == '\n')
        {
          i = 1;
          paramzcjz.a(zs.a(localStringBuilder));
          paramzcjz.d("<Br>");
          localStringBuilder.delete(0, 0 + localStringBuilder.length());
        }
        else if (arrayOfChar[j] == ' ')
        {
          if (i != 0) {
            paramzcjz.d("&nbsp;");
          } else {
            localStringBuilder.append(arrayOfChar[j]);
          }
        }
        else
        {
          i = 0;
          localStringBuilder.append(arrayOfChar[j]);
        }
      }
    }
    if (localStringBuilder.length() != 0) {
      paramzcjz.a(zs.a(localStringBuilder));
    }
  }
  
  static String a(Cell paramCell)
    throws Exception
  {
    Style localStyle = paramCell.p();
    com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh();
    zcjz localzcjz = new zcjz(localzh, Encoding.getUTF8());
    String str1;
    if (paramCell.H())
    {
      localObject1 = paramCell.getCharacters(true);
      str1 = ((zbdd)paramCell.c.d).c;
      for (int i = 0; i < localObject1.length; i++)
      {
        Object localObject2 = localObject1[i];
        localzcjz.b("Font");
        String str2 = a(localStyle, localStyle.getHorizontalAlignment(), ((FontSetting)localObject2).getFont());
        localzcjz.a("Style", str2);
        if (((FontSetting)localObject2).getFont().isSuperscript()) {
          localzcjz.b("Sup");
        }
        if (((FontSetting)localObject2).getFont().isSubscript()) {
          localzcjz.b("Sub");
        }
        a(localzcjz, str1, ((FontSetting)localObject2).getStartIndex(), ((FontSetting)localObject2).getStartIndex() + ((FontSetting)localObject2).getLength() - 1);
        if (((FontSetting)localObject2).getFont().isSuperscript()) {
          localzcjz.b();
        }
        if (((FontSetting)localObject2).getFont().isSubscript()) {
          localzcjz.b();
        }
        localzcjz.b();
      }
    }
    else
    {
      localzcjz.b("Font");
      localObject1 = a(localStyle, localStyle.getHorizontalAlignment(), localStyle.getFont());
      localzcjz.a("Style", (String)localObject1);
      if (localStyle.getFont().isSuperscript()) {
        localzcjz.b("Sup");
      }
      if (localStyle.getFont().isSubscript()) {
        localzcjz.b("Sub");
      }
      str1 = paramCell.k();
      a(localzcjz, str1, 0, str1.length() - 1);
      if (localStyle.getFont().isSuperscript()) {
        localzcjz.b();
      }
      if (localStyle.getFont().isSubscript()) {
        localzcjz.b();
      }
      localzcjz.b();
    }
    localzcjz.e();
    localzcjz.f();
    localzh.a();
    Object localObject1 = localzh.o();
    return Encoding.getUTF8().a((byte[])localObject1, 3, localObject1.length - 3);
  }
  
  private static void a(String paramString, int paramInt, FontSetting paramFontSetting, zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("Font");
    String str = a(null, paramInt, paramFontSetting.getFont());
    paramzcjz.a("Style", str);
    paramzcjz.a(paramString.substring(paramFontSetting.getStartIndex(), paramFontSetting.getStartIndex() + paramFontSetting.getLength()));
    paramzcjz.b();
  }
  
  static String a(FontSettingCollection paramFontSettingCollection)
    throws Exception
  {
    int i = paramFontSettingCollection.m();
    com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh();
    zcjz localzcjz = new zcjz(localzh, Encoding.getUTF8());
    ArrayList localArrayList = paramFontSettingCollection.a(false, false);
    String str = paramFontSettingCollection.getText();
    for (int j = 0; j < localArrayList.size(); j++)
    {
      FontSetting localFontSetting = (FontSetting)localArrayList.get(j);
      a(str, i, localFontSetting, localzcjz);
    }
    localzcjz.e();
    localzcjz.f();
    localzh.a();
    byte[] arrayOfByte = localzh.o();
    return Encoding.getUTF8().a(arrayOfByte, 3, arrayOfByte.length - 3);
  }
  
  static void a(WorksheetCollection paramWorksheetCollection, Font paramFont, HashMap paramHashMap1, HashMap paramHashMap2)
  {
    String str1 = (String)paramHashMap1.get("STYLE");
    Object localObject2;
    Object localObject3;
    int m;
    if (str1 != null)
    {
      localObject1 = zw.d(str1, ';');
      for (int i = 0; i < localObject1.length; i++)
      {
        localObject2 = zw.d(localObject1[i], ':');
        for (int j = 0; j < localObject2.length; j++) {
          localObject2[j] = localObject2[j].trim();
        }
        Object localObject4;
        switch (a.a(localObject2[0].toUpperCase()))
        {
        case 0: 
          paramFont.setBold(zy.a(localObject2[1], "BOLD"));
          break;
        case 1: 
          paramFont.setItalic(zy.a(localObject2[1], "ITALIC"));
          break;
        case 2: 
          localObject3 = zw.d(localObject2[1].toUpperCase(), ' ');
          for (int k = 0; k < localObject3.length; k++) {
            switch (a.a(localObject3[k].trim()))
            {
            case 7: 
              paramFont.setUnderline(1);
              break;
            case 8: 
              paramFont.setStrikeout(true);
            }
          }
          break;
        case 3: 
          paramFont.a(localObject2[1], false, 0);
          break;
        case 4: 
          if (localObject2[1].toUpperCase().startsWith("RGB("))
          {
            String str3 = localObject2[1].substring(4, 4 + (localObject2[1].length() - 5));
            localObject4 = zw.d(str3, ',');
            paramFont.setColor(Color.fromArgb(com.aspose.cells.b.a.zp.a(localObject4[0].trim()), com.aspose.cells.b.a.zp.a(localObject4[1].trim()), com.aspose.cells.b.a.zp.a(localObject4[2].trim())));
          }
          else
          {
            paramFont.setColor(com.aspose.cells.b.a.b.zf.a(localObject2[1]));
          }
          break;
        case 5: 
          paramHashMap2.put("BACKGROUND-COLOR", com.aspose.cells.b.a.b.zf.a(localObject2[1]));
          break;
        case 6: 
          m = -1;
          localObject4 = localObject2[1].toUpperCase();
          switch (a.a((String)localObject4))
          {
          case 9: 
            paramFont.setSize(8);
            break;
          case 10: 
            paramFont.setSize(10);
            break;
          case 11: 
            paramFont.setSize(12);
            break;
          case 12: 
            paramFont.setSize(14);
            break;
          case 13: 
            paramFont.setSize(18);
            break;
          case 14: 
            paramFont.setSize(24);
            break;
          case 15: 
            paramFont.setSize(36);
            break;
          default: 
            char[] arrayOfChar = ((String)localObject4).toCharArray();
            for (int n = 0; n < arrayOfChar.length; n++) {
              if ((!Character.isDigit(arrayOfChar[n])) && (arrayOfChar[n] != '.') && (arrayOfChar[n] != '+') && (arrayOfChar[n] != '-'))
              {
                m = n;
                break;
              }
            }
            String str4 = "PX";
            double d1 = 0.0D;
            if (m == -1)
            {
              d1 = zagc.b(localObject2[1]);
              str4 = "PT";
            }
            else
            {
              d1 = zo.a(localObject2[1].substring(0, 0 + m).trim());
              str4 = localObject2[1].substring(m).trim();
            }
            double d2 = 0.0D;
            switch (a.a(str4.toUpperCase()))
            {
            case 16: 
              d2 = d1 * 72.0D / zbxp.a();
              break;
            case 17: 
              d2 = d1;
              break;
            case 18: 
              d2 = d1 * 72.0D;
              break;
            case 19: 
              d2 = d1 * 72.0D / 2.54D;
              break;
            default: 
              d2 = d1;
            }
            paramFont.setDoubleSize(d2);
          }
          break;
        }
      }
      return;
    }
    Object localObject1 = paramHashMap1.keySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      String str2 = (String)((Iterator)localObject1).next();
      localObject2 = paramHashMap1.get(str2);
      switch (a.a(str2.toUpperCase()))
      {
      case 20: 
        paramFont.setDoubleSize(zagc.b((String)localObject2));
        break;
      case 4: 
        paramFont.setColor(com.aspose.cells.b.a.b.zf.a((String)localObject2));
        break;
      case 21: 
        localObject3 = (String)localObject2;
        m = ((String)localObject3).indexOf(',');
        if (m == -1) {
          paramFont.a((String)localObject3, false, 0);
        } else {
          paramFont.a(((String)localObject3).substring(0, 0 + m).trim(), false, 0);
        }
        break;
      }
    }
  }
  
  static void a(StringBuilder paramStringBuilder, HashMap paramHashMap)
  {
    String str = zs.a(paramStringBuilder);
    if ("".equals(str)) {
      return;
    }
    paramStringBuilder.delete(0, 0 + paramStringBuilder.length());
    if (str.indexOf('=') != -1)
    {
      String[] arrayOfString = zw.d(str, '=');
      for (int i = 0; i < arrayOfString.length; i++)
      {
        arrayOfString[i] = arrayOfString[i].trim();
        if (arrayOfString[i].charAt(0) == '\'') {
          arrayOfString[i] = arrayOfString[i].substring(1, 1 + (arrayOfString.length - 2));
        }
        if (arrayOfString[i].charAt(0) == '"') {
          arrayOfString[i] = arrayOfString[i].substring(1, 1 + (arrayOfString.length - 2));
        }
      }
      paramHashMap.put(arrayOfString[0].toUpperCase(), arrayOfString[1]);
    }
    else
    {
      paramHashMap.put(str.toUpperCase(), Boolean.valueOf(true));
    }
  }
  
  static Font a(WorksheetCollection paramWorksheetCollection, Font paramFont, HashMap paramHashMap)
  {
    ArrayList localArrayList = (ArrayList)paramHashMap.get("FONTS");
    Font localFont = new Font(paramWorksheetCollection, null, false);
    if (paramFont != null) {
      zbtc.a(paramFont, localFont);
    }
    com.aspose.cells.b.a.a.zf.a(localArrayList, paramFont);
    return localFont;
  }
  
  static Font b(WorksheetCollection paramWorksheetCollection, Font paramFont, HashMap paramHashMap)
  {
    ArrayList localArrayList = (ArrayList)paramHashMap.get("FONTS");
    if (localArrayList.size() == 0) {
      return paramFont;
    }
    Font localFont = (Font)localArrayList.get(localArrayList.size() - 1);
    localArrayList.remove(localArrayList.size() - 1);
    return localFont;
  }
  
  static String a(WorksheetCollection paramWorksheetCollection, Font paramFont, char[] paramArrayOfChar, ArrayList paramArrayList, HashMap paramHashMap)
  {
    if (!a(paramArrayOfChar)) {
      return null;
    }
    StringBuilder localStringBuilder1 = new StringBuilder();
    ArrayList localArrayList1 = new ArrayList();
    paramHashMap.put("FONTS", localArrayList1);
    Font localFont = a(paramWorksheetCollection, paramFont, paramHashMap);
    int i = 0;
    int j = 0;
    int k = 0;
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    for (int m = 0; m < paramArrayOfChar.length; m++)
    {
      if ((paramArrayOfChar[m] == '<') && (m + 1 < paramArrayOfChar.length))
      {
        if (paramArrayOfChar[(m + 1)] == ' ')
        {
          localStringBuilder1.append(paramArrayOfChar[m]);
          continue;
        }
        if ((paramArrayOfChar[(m + 1)] == '!') && (paramArrayOfChar[(m + 2)] == '-') && (paramArrayOfChar[(m + 3)] == '-')) {
          m += 4;
        }
      }
      while (m < paramArrayOfChar.length) {
        if ((paramArrayOfChar[m] == '-') && (paramArrayOfChar[(m + 1)] == '-') && (paramArrayOfChar[(m + 2)] == '>'))
        {
          m += 2;
        }
        else
        {
          m++;
          continue;
          if (paramArrayOfChar[(m + 1)] == '?')
          {
            m += 2;
            while (m < paramArrayOfChar.length)
            {
              if ((paramArrayOfChar[m] == '/') && (paramArrayOfChar[(m + 1)] == '>'))
              {
                m++;
                break;
              }
              m++;
            }
          }
          int n = paramArrayOfChar[(m + 1)] == '/' ? 1 : 0;
          if (n != 0) {
            m++;
          }
          StringBuilder localStringBuilder2 = new StringBuilder();
          HashMap localHashMap = new HashMap();
          String str = null;
          m++;
          Object localObject2;
          while ((m < paramArrayOfChar.length) && (paramArrayOfChar[m] != '>'))
          {
            if (paramArrayOfChar[m] == '=')
            {
              int i2 = 0;
              localObject2 = zs.a(localStringBuilder2).trim().toUpperCase();
              localStringBuilder2.delete(0, 0 + localStringBuilder2.length());
              m++;
              while (m < paramArrayOfChar.length)
              {
                if (paramArrayOfChar[m] == '>')
                {
                  m--;
                  break;
                }
                if (paramArrayOfChar[m] == ' ')
                {
                  if (i2 == 0) {
                    break;
                  }
                }
                else if (paramArrayOfChar[m] == '\'')
                {
                  m++;
                  while ((m < paramArrayOfChar.length) && (paramArrayOfChar[m] != '\''))
                  {
                    localStringBuilder2.append(paramArrayOfChar[m]);
                    m++;
                  }
                  i2 = 0;
                }
                else if (paramArrayOfChar[m] == '"')
                {
                  m++;
                  while ((m < paramArrayOfChar.length) && (paramArrayOfChar[m] != '"'))
                  {
                    localStringBuilder2.append(paramArrayOfChar[m]);
                    m++;
                  }
                  i2 = 0;
                }
                else
                {
                  localStringBuilder2.append(paramArrayOfChar[m]);
                  i2 = 0;
                }
                m++;
              }
              localHashMap.put(localObject2, zs.a(localStringBuilder2).trim());
              localStringBuilder2.delete(0, 0 + localStringBuilder2.length());
            }
            else if (paramArrayOfChar[m] == ' ')
            {
              if (localStringBuilder2.length() > 0) {
                if (str == null)
                {
                  str = zs.a(localStringBuilder2).trim().toUpperCase();
                  localStringBuilder2.delete(0, 0 + localStringBuilder2.length());
                }
                else
                {
                  a(localStringBuilder2, localHashMap);
                }
              }
            }
            else
            {
              localStringBuilder2.append(paramArrayOfChar[m]);
            }
            m++;
          }
          if (localStringBuilder2.length() > 0) {
            if (str == null)
            {
              str = zs.a(localStringBuilder2).trim().toUpperCase();
              localStringBuilder2.delete(0, 0 + localStringBuilder2.length());
            }
            else
            {
              a(localStringBuilder2, localHashMap);
            }
          }
          Object localObject1;
          int i4;
          if (n != 0)
          {
            localObject1 = new ArrayList();
            com.aspose.cells.b.a.a.zf.a((ArrayList)localObject1, str);
            m++;
            while (m < paramArrayOfChar.length)
            {
              if ((paramArrayOfChar[m] == '<') && (paramArrayOfChar[(m + 1)] == '/'))
              {
                m += 2;
                while ((m < paramArrayOfChar.length) && (paramArrayOfChar[m] != '>'))
                {
                  localStringBuilder2.append(paramArrayOfChar[m]);
                  m++;
                }
                com.aspose.cells.b.a.a.zf.a((ArrayList)localObject1, zs.a(localStringBuilder2).toUpperCase());
                localStringBuilder2.delete(0, 0 + localStringBuilder2.length());
              }
              else
              {
                m--;
                break;
              }
              m++;
            }
            if (i != localStringBuilder1.length())
            {
              localObject2 = new FontSetting(i, localStringBuilder1.length() - i, paramWorksheetCollection);
              ((FontSetting)localObject2).getFont().a(localFont, null);
              com.aspose.cells.b.a.a.zf.a(paramArrayList, localObject2);
              i = localStringBuilder1.length();
            }
            for (i4 = 0; i4 < ((ArrayList)localObject1).size(); i4++) {
              switch (a.a((String)((ArrayList)localObject1).get(i4)))
              {
              case 22: 
                localStringBuilder1.append('\n');
                break;
              case 23: 
              case 24: 
                localArrayList2.remove(localArrayList2.size() - 1);
                if (localArrayList3.size() > localArrayList2.size()) {
                  com.aspose.cells.b.a.a.zf.a(localArrayList3, localArrayList2.size(), localArrayList3.size() - localArrayList2.size());
                }
                break;
              case 25: 
                localStringBuilder1.append('\n');
                break;
              case 26: 
              case 27: 
              case 28: 
                localFont = b(paramWorksheetCollection, paramFont, paramHashMap);
                break;
              case 29: 
              case 30: 
                localFont.setBold(false);
                break;
              case 31: 
                localFont.setItalic(false);
                break;
              case 32: 
                localFont.setUnderline(0);
                break;
              case 33: 
              case 34: 
                localFont.setStrikeout(false);
                break;
              case 35: 
                localFont.setSuperscript(false);
                break;
              case 36: 
                localFont.setSubscript(false);
              }
            }
          }
          else
          {
            if ((str == null) || ("".equals(str))) {
              break;
            }
            if (str.endsWith("/"))
            {
              if (str.startsWith("BR")) {
                localStringBuilder1.append('\n');
              }
            }
            else
            {
              switch (a.a(str))
              {
              case 26: 
              case 27: 
              case 28: 
                j = 1;
                break;
              case 29: 
              case 30: 
              case 31: 
              case 32: 
              case 33: 
              case 34: 
              case 35: 
              case 36: 
                j = 1;
                break;
              case 37: 
                localStringBuilder1.append('\n');
                break;
              case 23: 
              case 24: 
                com.aspose.cells.b.a.a.zf.a(localArrayList2, str);
                if (localHashMap != null)
                {
                  localObject1 = (String)localHashMap.get("START");
                  if ((localObject1 != null) && (zarb.c((String)localObject1)))
                  {
                    i4 = com.aspose.cells.a.c.zp.b((String)localObject1);
                    com.aspose.cells.b.a.a.zf.a(localArrayList3, Integer.valueOf(i4 - 1));
                  }
                }
                break;
              case 25: 
                int i3 = 1;
                if (localArrayList2.size() > localArrayList3.size())
                {
                  com.aspose.cells.b.a.a.zf.a(localArrayList3, Integer.valueOf(i3));
                }
                else if (localArrayList3.size() > 0)
                {
                  i3 = ((Integer)localArrayList3.get(localArrayList3.size() - 1)).intValue();
                  i3++;
                  localArrayList3.set(localArrayList3.size() - 1, Integer.valueOf(i3));
                }
                for (i4 = 0; i4 < localArrayList3.size(); i4++) {
                  localStringBuilder1.append("    ");
                }
                if ((localArrayList2.size() > 0) && ("OL".equals((String)localArrayList2.get(localArrayList2.size() - 1))))
                {
                  localStringBuilder1.append(i3 + ".");
                  localStringBuilder1.append(" ");
                }
                break;
              }
              if ((k == 0) && (i != localStringBuilder1.length()))
              {
                FontSetting localFontSetting2 = new FontSetting(i, localStringBuilder1.length() - i, paramWorksheetCollection);
                localFontSetting2.getFont().a(localFont, null);
                com.aspose.cells.b.a.a.zf.a(paramArrayList, localFontSetting2);
                i = localStringBuilder1.length();
              }
              switch (a.a(str))
              {
              case 27: 
                localFont = a(paramWorksheetCollection, null, paramHashMap);
                a(paramWorksheetCollection, localFont, localHashMap, paramHashMap);
                break;
              case 26: 
              case 28: 
                localFont = a(paramWorksheetCollection, localFont, paramHashMap);
                a(paramWorksheetCollection, localFont, localHashMap, paramHashMap);
                break;
              case 29: 
              case 30: 
                localFont.setBold(true);
                break;
              case 31: 
                localFont.setItalic(true);
                break;
              case 32: 
                localFont.setUnderline(1);
                break;
              case 33: 
              case 34: 
                localFont.setStrikeout(true);
                break;
              case 35: 
                localFont.setSuperscript(true);
                break;
              case 36: 
                localFont.setSubscript(true);
                break;
              }
              k = j;
            }
          }
          break;
          if (paramArrayOfChar[m] == '&')
          {
            k = 0;
            n = m;
            localStringBuilder2 = new StringBuilder();
            int i1 = 0;
            while (m < paramArrayOfChar.length)
            {
              localStringBuilder2.append(paramArrayOfChar[m]);
              if (paramArrayOfChar[m] == ';')
              {
                i1 = 1;
                break;
              }
              m++;
            }
            if (i1 != 0)
            {
              zafa.a(localStringBuilder1, localStringBuilder2);
            }
            else
            {
              m = n;
              localStringBuilder1.append(paramArrayOfChar[m]);
            }
          }
          else if (paramArrayOfChar[m] == '\r')
          {
            k = 0;
            if ((m + 1 < paramArrayOfChar.length) && (paramArrayOfChar[(m + 1)] == '\n'))
            {
              localStringBuilder1.append('\n');
              m++;
            }
            else
            {
              localStringBuilder1.append('\n');
            }
          }
          else
          {
            k = 0;
            localStringBuilder1.append(paramArrayOfChar[m]);
          }
        }
      }
    }
    FontSetting localFontSetting1;
    if (i != localStringBuilder1.length())
    {
      localFontSetting1 = new FontSetting(i, localStringBuilder1.length() - i, paramWorksheetCollection);
      localFontSetting1.getFont().a(localFont, null);
      com.aspose.cells.b.a.a.zf.a(paramArrayList, localFontSetting1);
      i = localStringBuilder1.length();
    }
    if ((localStringBuilder1.length() > 0) && (localStringBuilder1.charAt(localStringBuilder1.length() - 1) == '\n'))
    {
      localStringBuilder1.delete(localStringBuilder1.length() - 1, localStringBuilder1.length() - 1 + 1);
      if (paramArrayList.size() > 0)
      {
        localFontSetting1 = (FontSetting)paramArrayList.get(paramArrayList.size() - 1);
        if (localFontSetting1.getStartIndex() + localFontSetting1.getLength() > localStringBuilder1.length())
        {
          localFontSetting1.p = (localStringBuilder1.length() - localFontSetting1.getStartIndex());
          if (localFontSetting1.getLength() < 0) {
            paramArrayList.remove(paramArrayList.size() - 1);
          }
        }
      }
    }
    return zs.a(localStringBuilder1);
  }
  
  static boolean a(char[] paramArrayOfChar)
  {
    int i = 0;
    for (int j = 0; j < paramArrayOfChar.length; j++)
    {
      switch (paramArrayOfChar[j])
      {
      case '<': 
        i++;
        break;
      case '>': 
        i--;
        break;
      case '/': 
        if (((j > 0) && (paramArrayOfChar[(j - 1)] == '<')) || (j + 1 <= paramArrayOfChar.length) || (paramArrayOfChar[(j + 1)] != '>')) {
          break;
        }
      }
      if (i > 1) {
        return false;
      }
    }
    return i == 0;
  }
  
  static void a(Cell paramCell, String paramString)
  {
    Style localStyle = paramCell.getStyle();
    Font localFont = localStyle.getFont();
    localFont.e(0);
    WorksheetCollection localWorksheetCollection = paramCell.d.p();
    ArrayList localArrayList = new ArrayList();
    HashMap localHashMap = new HashMap();
    String str = a(localWorksheetCollection, localFont, paramString.toCharArray(), localArrayList, localHashMap);
    if (str == null)
    {
      paramCell.putValue(paramString);
      return;
    }
    if (localArrayList.size() == 2)
    {
      FontSetting localFontSetting = (FontSetting)localArrayList.get(1);
      if (localFontSetting.getStartIndex() == str.length()) {
        localArrayList.remove(1);
      }
    }
    paramCell.a(str, localArrayList);
    if (((localStyle.getPattern() == 0) || (localStyle.getPattern() == 1)) && (localHashMap.get("BACKGROUND-COLOR") != null))
    {
      localStyle = paramCell.getStyle();
      localStyle.setPattern(1);
      localStyle.setForegroundColor((Color)localHashMap.get("BACKGROUND-COLOR"));
      paramCell.setStyle(localStyle);
    }
  }
  
  static void a(Shape paramShape, FontSettingCollection paramFontSettingCollection, String paramString)
  {
    Font localFont = paramFontSettingCollection.c();
    paramFontSettingCollection.clear();
    WorksheetCollection localWorksheetCollection = paramShape.P();
    ArrayList localArrayList = new ArrayList();
    HashMap localHashMap = new HashMap();
    String str = a(localWorksheetCollection, localFont, paramString.toCharArray(), localArrayList, localHashMap);
    if (str == null) {
      str = paramString;
    }
    if (localArrayList.size() == 0)
    {
      paramFontSettingCollection.setText(str);
    }
    else
    {
      paramFontSettingCollection.clear();
      paramFontSettingCollection.c = str;
      if (localArrayList.size() == 1) {
        paramFontSettingCollection.h().q = ((FontSetting)localArrayList.get(0)).q;
      }
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        FontSetting localFontSetting = (FontSetting)localIterator.next();
        paramFontSettingCollection.a(localFontSetting);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zgv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */