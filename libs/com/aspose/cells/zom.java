package com.aspose.cells;

class zom
{
  private char[] a;
  private boolean b;
  
  public zom()
  {
    this.a = null;
    this.b = true;
  }
  
  public zom(zig paramzig, int paramInt)
  {
    if (paramInt == 2) {
      switch (paramzig.e())
      {
      case 4: 
      case 2052: 
        this.a = new char[] { 38646, '壹', 36144, '叁', 32902, '伍', 38470, '柒', '捌', '玖' };
        break;
      case 1028: 
      case 3076: 
      case 4100: 
      case 5124: 
      case 31748: 
        this.a = new char[] { 38646, '壹', 36019, '參', 32902, '伍', 38520, '柒', '捌', '玖' };
        break;
      case 17: 
      case 1041: 
        this.a = new char[] { '〇', '壱', '弐', '参', '四', '伍', '六', '七', '八', '九' };
        break;
      case 18: 
      case 1042: 
        this.a = new char[] { 38646, '壹', 36019, '參', '四', '伍', '六', '七', '八', '九' };
        break;
      default: 
        this.a = null;
        break;
      }
    } else if (paramInt == 1) {
      switch (paramzig.e())
      {
      case 4: 
      case 1028: 
      case 2052: 
      case 3076: 
      case 4100: 
      case 5124: 
      case 31748: 
        this.a = new char[] { '○', '一', '二', '三', '四', '五', '六', '七', '八', '九' };
        break;
      case 17: 
      case 1041: 
        this.a = new char[] { '〇', '一', '二', '三', '四', '五', '六', '七', '八', '九' };
        break;
      case 18: 
      case 1042: 
        this.a = new char[] { 65296, '一', '二', '三', '四', '五', '六', '七', '八', '九' };
        break;
      default: 
        this.a = null;
        break;
      }
    } else if (paramInt == 3) {
      switch (paramzig.e())
      {
      case 4: 
      case 17: 
      case 18: 
      case 1028: 
      case 1041: 
      case 1042: 
      case 2052: 
      case 3076: 
      case 4100: 
      case 5124: 
      case 31748: 
        this.a = new char[] { 65296, 65297, 65298, 65299, 65300, 65301, 65302, 65303, 65304, 65305 };
        break;
      default: 
        this.a = null;
        break;
      }
    } else {
      this.a = null;
    }
    this.b = (this.a == null);
  }
  
  public char a(char paramChar)
  {
    if (this.b) {
      return paramChar;
    }
    int i = paramChar - '0';
    if ((i > -1) && (i < this.a.length)) {
      return this.a[i];
    }
    return paramChar;
  }
  
  public String a(String paramString)
  {
    if (this.b) {
      return paramString;
    }
    char[] arrayOfChar = paramString.toCharArray();
    for (int i = 0; i < arrayOfChar.length; i++)
    {
      int j = arrayOfChar[i] - '0';
      if ((j > -1) && (j < this.a.length)) {
        arrayOfChar[i] = this.a[j];
      }
    }
    return new String(arrayOfChar);
  }
  
  public void a(char[] paramArrayOfChar, int paramInt1, int paramInt2, StringBuilder paramStringBuilder)
  {
    if (this.b)
    {
      paramStringBuilder.append(paramArrayOfChar, paramInt1, paramInt2 - paramInt1);
      return;
    }
    while (paramInt1 < paramInt2)
    {
      int i = paramArrayOfChar[paramInt1] - '0';
      if ((i > -1) && (i < this.a.length)) {
        paramStringBuilder.append(this.a[i]);
      } else {
        paramStringBuilder.append(paramArrayOfChar[paramInt1]);
      }
      paramInt1++;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zom.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */