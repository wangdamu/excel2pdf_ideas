package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;

public class HeaderFooterCommand
{
  private int b;
  Font a;
  private String c;
  
  public int getType()
  {
    return this.b;
  }
  
  public Font getFont()
  {
    return this.a;
  }
  
  public String getText()
  {
    return this.c;
  }
  
  HeaderFooterCommand(int type, Font font, String text)
  {
    this.b = type;
    this.a = font;
    this.c = text;
  }
  
  static ArrayList a(Workbook paramWorkbook, String paramString)
  {
    if (zw.b(paramString)) {
      return null;
    }
    return a(paramWorkbook, paramString.toCharArray(), 0);
  }
  
  static ArrayList a(Workbook paramWorkbook, char[] paramArrayOfChar, int paramInt)
  {
    Font localFont = null;
    int i = 0;
    int j = 0;
    int k = 0;
    ArrayList localArrayList = new ArrayList();
    int m = paramInt;
    for (int n = paramInt; n < paramArrayOfChar.length; n++)
    {
      i = 0;
      if (paramArrayOfChar[n] != '&')
      {
        k = 0;
      }
      else if (n + 1 < paramArrayOfChar.length)
      {
        switch (paramArrayOfChar[(n + 1)])
        {
        case '&': 
        case 'A': 
        case 'D': 
        case 'F': 
        case 'G': 
        case 'N': 
        case 'P': 
        case 'T': 
        case 'Z': 
          n++;
          i = 1;
          j = 0;
          k = 0;
          break;
        case '"': 
        case '1': 
        case '2': 
        case '3': 
        case '4': 
        case '5': 
        case '6': 
        case '7': 
        case '8': 
        case '9': 
        case 'B': 
        case 'E': 
        case 'I': 
        case 'K': 
        case 'S': 
        case 'U': 
        case 'X': 
        case 'Y': 
          j = 1;
          n++;
          i = 1;
          break;
        case '#': 
        case '$': 
        case '%': 
        case '\'': 
        case '(': 
        case ')': 
        case '*': 
        case '+': 
        case ',': 
        case '-': 
        case '.': 
        case '/': 
        case '0': 
        case ':': 
        case ';': 
        case '<': 
        case '=': 
        case '>': 
        case '?': 
        case '@': 
        case 'C': 
        case 'H': 
        case 'J': 
        case 'L': 
        case 'M': 
        case 'O': 
        case 'Q': 
        case 'R': 
        case 'V': 
        case 'W': 
        default: 
          n++;
          i = 0;
          j = 0;
          k = 0;
        }
        if (i == 0)
        {
          if (n - 1 > m)
          {
            zf.a(localArrayList, new HeaderFooterCommand(0, localFont, new String(paramArrayOfChar, m, n - 1 - m)));
            n++;
            m = n;
          }
        }
        else
        {
          if (n - 1 > m) {
            zf.a(localArrayList, new HeaderFooterCommand(0, localFont, new String(paramArrayOfChar, m, n - 1 - m)));
          }
          if (j != 0)
          {
            if (localFont == null)
            {
              localFont = new Font(paramWorkbook.getWorksheets(), null, false);
              localFont.a(paramWorkbook.getWorksheets().T(), null);
            }
            else if (k == 0)
            {
              localFont = new Font(paramWorkbook.getWorksheets(), null, false);
              localFont.a(paramWorkbook.getWorksheets().T(), null);
            }
            k = 1;
          }
          switch (paramArrayOfChar[n])
          {
          case 'G': 
            zf.a(localArrayList, new HeaderFooterCommand(8, localFont, null));
            break;
          case 'P': 
            zf.a(localArrayList, new HeaderFooterCommand(1, localFont, null));
            break;
          case 'N': 
            zf.a(localArrayList, new HeaderFooterCommand(2, localFont, null));
            break;
          case 'D': 
            zf.a(localArrayList, new HeaderFooterCommand(3, localFont, null));
            break;
          case 'T': 
            zf.a(localArrayList, new HeaderFooterCommand(4, localFont, null));
            break;
          case 'A': 
            zf.a(localArrayList, new HeaderFooterCommand(5, localFont, null));
            break;
          case 'F': 
            zf.a(localArrayList, new HeaderFooterCommand(6, localFont, null));
            break;
          case 'Z': 
            zf.a(localArrayList, new HeaderFooterCommand(7, localFont, null));
            break;
          case 'B': 
            localFont.setBold(true);
            break;
          case 'I': 
            localFont.setItalic(true);
            break;
          case 'U': 
            localFont.setUnderline(1);
            break;
          case 'E': 
            localFont.setUnderline(2);
            break;
          case 'S': 
            localFont.setStrikeout(true);
            break;
          case 'X': 
            localFont.setSuperscript(true);
            break;
          case 'Y': 
            localFont.setSubscript(true);
            break;
          case 'K': 
            if (n + 6 >= paramArrayOfChar.length) {
              throw new CellsException(6, "Invalid font color of the page header/footer");
            }
            try
            {
              int i1 = zp.a(new String(paramArrayOfChar, n + 1, 2), 515);
              int i2 = zp.a(new String(paramArrayOfChar, n + 3, 2), 515);
              int i3 = zp.a(new String(paramArrayOfChar, n + 5, 2), 515);
              localFont.setColor(Color.fromArgb(i1, i2, i3));
            }
            catch (Exception localException) {}
            n += 6;
            break;
          case '"': 
            n++;
            m = n;
            while ((n < paramArrayOfChar.length) && (paramArrayOfChar[n] != '"')) {
              n++;
            }
            if (n - m >= 0)
            {
              String str = new String(paramArrayOfChar, m, n - m);
              a(localFont, str);
            }
            break;
          case '&': 
            break;
          case '#': 
          case '$': 
          case '%': 
          case '\'': 
          case '(': 
          case ')': 
          case '*': 
          case '+': 
          case ',': 
          case '-': 
          case '.': 
          case '/': 
          case '0': 
          case '1': 
          case '2': 
          case '3': 
          case '4': 
          case '5': 
          case '6': 
          case '7': 
          case '8': 
          case '9': 
          case ':': 
          case ';': 
          case '<': 
          case '=': 
          case '>': 
          case '?': 
          case '@': 
          case 'C': 
          case 'H': 
          case 'J': 
          case 'L': 
          case 'M': 
          case 'O': 
          case 'Q': 
          case 'R': 
          case 'V': 
          case 'W': 
          default: 
            m = n;
            n++;
            while ((n < paramArrayOfChar.length) && (Character.isDigit(paramArrayOfChar[n]))) {
              n++;
            }
            localFont.setSize(zp.a(new String(paramArrayOfChar, m, n - m)));
            n--;
          }
          if (paramArrayOfChar[n] != '&') {
            m = n + 1;
          } else {
            m = n;
          }
        }
      }
    }
    if ((n > m) && (m < paramArrayOfChar.length)) {
      zf.a(localArrayList, new HeaderFooterCommand(0, localFont, new String(paramArrayOfChar, m, n - m)));
    }
    return localArrayList;
  }
  
  private static void a(Font paramFont, String paramString)
  {
    int i = paramString.indexOf(',');
    if (i == -1)
    {
      paramFont.a(paramString, false, 0);
      return;
    }
    paramFont.a(paramString.substring(0, 0 + i), false, 0);
    paramString = paramString.substring(i + 1);
    String[] arrayOfString = zw.d(paramString, ' ');
    for (int j = 0; j < arrayOfString.length; j++) {
      zzp.a(paramFont, arrayOfString[j]);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/HeaderFooterCommand.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */