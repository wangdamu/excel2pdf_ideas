package com.aspose.cells;

import com.aspose.cells.a.c.zp;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zh;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;

public class FormatCondition
{
  FormatConditionCollection a;
  int b;
  int c;
  String d;
  String e;
  Style f;
  private byte[] g;
  private byte[] h;
  private zh i = zh.b();
  private boolean j;
  private int k;
  private int l = -1;
  private IconSet m = null;
  private DataBar n = null;
  private ColorScale o = null;
  private Top10 p = null;
  private AboveAverage q = null;
  private int r = 0;
  
  byte[] a()
  {
    return this.g;
  }
  
  void a(byte[] paramArrayOfByte)
  {
    this.g = paramArrayOfByte;
    this.d = null;
  }
  
  zh b()
  {
    return this.i;
  }
  
  void a(zh paramzh)
  {
    this.i = paramzh;
  }
  
  byte[] c()
  {
    return this.h;
  }
  
  void b(byte[] paramArrayOfByte)
  {
    this.h = paramArrayOfByte;
    this.e = null;
  }
  
  FormatCondition(FormatConditionCollection formatConditions)
  {
    this.a = formatConditions;
    this.c = 0;
    this.b = 0;
  }
  
  void a(FormatCondition paramFormatCondition, CopyOptions paramCopyOptions)
  {
    WorksheetCollection localWorksheetCollection1 = paramFormatCondition.a.a.a.c();
    WorksheetCollection localWorksheetCollection2 = this.a.a.a.c();
    int i1 = (localWorksheetCollection1 == localWorksheetCollection2) || (paramCopyOptions == null) || (paramCopyOptions.a()) ? 1 : 0;
    int[] arrayOfInt = paramFormatCondition.a.e();
    int i2;
    int i3;
    if (arrayOfInt == null)
    {
      i2 = 0;
      i3 = 0;
    }
    else
    {
      i2 = arrayOfInt[0];
      i3 = arrayOfInt[1];
    }
    byte[] arrayOfByte;
    if (paramFormatCondition.g != null)
    {
      arrayOfByte = (byte[])paramFormatCondition.g;
      if (i1 != 0) {
        this.g = zaam.a(arrayOfByte, -1, i2, i3, paramCopyOptions);
      } else {
        setFormula1(paramFormatCondition.getFormula1());
      }
    }
    else if (paramFormatCondition.d != null)
    {
      this.d = paramFormatCondition.d;
    }
    if (paramFormatCondition.h != null)
    {
      if (i1 != 0)
      {
        arrayOfByte = paramFormatCondition.h;
        this.h = zaam.a(arrayOfByte, -1, i2, i3, paramCopyOptions);
      }
      else
      {
        setFormula2(paramFormatCondition.getFormula2());
      }
    }
    else if (paramFormatCondition.e != null) {
      this.e = paramFormatCondition.e;
    }
    if (paramFormatCondition.f != null)
    {
      this.f = new Style(this.a.a.a.c());
      this.f.a(paramFormatCondition.getStyle(), paramCopyOptions);
    }
    this.c = paramFormatCondition.c;
    this.b = paramFormatCondition.b;
    this.k = paramFormatCondition.k;
    this.j = paramFormatCondition.j;
    if (paramFormatCondition.q != null)
    {
      this.q = new AboveAverage();
      this.q.a(paramFormatCondition.q);
    }
    if (paramFormatCondition.o != null)
    {
      this.o = new ColorScale(this.a.a.a.c().p(), this);
      this.o.a(paramFormatCondition.o, paramCopyOptions, i2, i3);
    }
    if (paramFormatCondition.n != null)
    {
      this.n = new DataBar(this.a.a.a.c().p(), this);
      this.n.a(paramFormatCondition.n, paramCopyOptions, i2, i3);
    }
    if (paramFormatCondition.m != null)
    {
      this.m = new IconSet(this);
      this.m.a(paramFormatCondition.m, paramCopyOptions, i2, i3);
    }
    this.r = paramFormatCondition.r;
    if (paramFormatCondition.p != null)
    {
      this.p = new Top10();
      this.p.a(paramFormatCondition.p);
    }
  }
  
  public String getFormula1()
  {
    if ((this.d == null) && (this.g != null))
    {
      int[] arrayOfInt = this.a.e();
      if (arrayOfInt != null) {
        this.d = a((byte[])this.g, -1, arrayOfInt[0], arrayOfInt[1]);
      }
    }
    return this.d;
  }
  
  public void setFormula1(String value)
  {
    if ((value == null) || ("".equals(value)) || ("=".equals(value)))
    {
      this.d = null;
      this.g = null;
      return;
    }
    this.d = value;
    this.g = null;
    if (this.a.b.size() != 0)
    {
      this.g = b(value);
      if (zaaq.a(this.a.e.c(), this.g, -1, false)) {
        this.d = null;
      }
    }
  }
  
  public String getFormula1(int row, int column)
  {
    int i1 = 0;
    for (int i2 = 0; i2 < this.a.b.size(); i2++)
    {
      CellArea localCellArea = (CellArea)this.a.b.get(i2);
      if ((row >= localCellArea.StartRow) && (row <= localCellArea.EndRow) && (column >= localCellArea.StartColumn) && (column <= localCellArea.EndColumn))
      {
        i1 = 1;
        break;
      }
    }
    if (i1 == 0) {
      return null;
    }
    return a((byte[])this.g, -1, row, column);
  }
  
  public String getFormula2()
  {
    if ((this.e == null) && (this.h != null))
    {
      int[] arrayOfInt = this.a.e();
      if (arrayOfInt != null) {
        this.e = a((byte[])this.h, -1, arrayOfInt[0], arrayOfInt[1]);
      }
    }
    return this.e;
  }
  
  public void setFormula2(String value)
  {
    if ((value == null) || ("".equals(value)) || ("=".equals(value)))
    {
      this.e = null;
      this.h = null;
      return;
    }
    this.e = value;
    this.h = null;
    if (this.a.b.size() != 0)
    {
      this.h = b(value);
      if (zaaq.a(this.a.e.c(), this.h, -1, false)) {
        this.e = null;
      }
    }
  }
  
  public String getFormula2(int row, int column)
  {
    int i1 = 0;
    for (int i2 = 0; i2 < this.a.b.size(); i2++)
    {
      CellArea localCellArea = (CellArea)this.a.b.get(i2);
      if ((row >= localCellArea.StartRow) && (row <= localCellArea.EndRow) && (column >= localCellArea.StartColumn) && (column <= localCellArea.EndColumn))
      {
        i1 = 1;
        break;
      }
    }
    if (i1 == 0) {
      return null;
    }
    return a((byte[])this.h, -1, row, column);
  }
  
  public int getOperator()
  {
    return this.b;
  }
  
  public void setOperator(int value)
  {
    this.b = value;
  }
  
  public boolean getStopIfTrue()
  {
    return this.j;
  }
  
  public void setStopIfTrue(boolean value)
  {
    this.j = value;
  }
  
  public int getPriority()
  {
    return this.k;
  }
  
  public void setPriority(int value)
  {
    this.k = value;
  }
  
  int d()
  {
    return this.l;
  }
  
  void a(int paramInt)
  {
    this.l = paramInt;
  }
  
  WorksheetCollection e()
  {
    return this.a.e.c();
  }
  
  public Style getStyle()
  {
    if (this.f == null)
    {
      this.f = new Style(e());
      this.f.a((byte)0);
    }
    return this.f;
  }
  
  public void setStyle(Style value)
  {
    this.f = value;
  }
  
  public int getType()
  {
    return this.c;
  }
  
  public void setType(int value)
  {
    this.c = value;
  }
  
  void a(byte[] paramArrayOfByte, int paramInt)
    throws Exception
  {
    switch (paramArrayOfByte[0])
    {
    case 1: 
      setType(0);
      break;
    case 2: 
      setType(1);
    }
    switch (paramArrayOfByte[1])
    {
    case 0: 
      this.b = 6;
      break;
    case 1: 
      this.b = 0;
      break;
    case 2: 
      this.b = 7;
      break;
    case 3: 
      this.b = 1;
      break;
    case 4: 
      this.b = 8;
      break;
    case 5: 
      this.b = 2;
      break;
    case 6: 
      this.b = 4;
      break;
    case 7: 
      this.b = 3;
      break;
    case 8: 
      this.b = 5;
    }
    int i1 = zc.b(paramArrayOfByte, 2);
    int i2 = zcal.a(paramArrayOfByte, 6, getStyle());
    byte[] arrayOfByte = new byte[i1 + 2];
    System.arraycopy(zc.a(i1), 0, arrayOfByte, 0, 2);
    System.arraycopy(paramArrayOfByte, i2, arrayOfByte, 2, i1);
    this.g = arrayOfByte;
    if ((this.b == 0) || (this.b == 7))
    {
      i2 += i1;
      i1 = zc.b(paramArrayOfByte, 4);
      arrayOfByte = new byte[i1 + 2];
      System.arraycopy(zc.a(i1), 0, arrayOfByte, 0, 2);
      System.arraycopy(paramArrayOfByte, i2, arrayOfByte, 2, i1);
      this.h = arrayOfByte;
    }
  }
  
  private byte[] a(String paramString)
  {
    byte[] arrayOfByte4;
    if (e().p().g())
    {
      if (zarb.b(paramString))
      {
        double d1 = zp.a(paramString);
        arrayOfByte4 = null;
        if ((d1 == (int)d1) && (d1 >= 0.0D) && (d1 <= 65535.0D))
        {
          arrayOfByte4 = new byte[3];
          arrayOfByte4[0] = 30;
          System.arraycopy(zc.a((int)d1), 0, arrayOfByte4, 1, 2);
          return arrayOfByte4;
        }
        arrayOfByte4 = new byte[9];
        arrayOfByte4[0] = 31;
        System.arraycopy(zc.a(d1), 0, arrayOfByte4, 1, 8);
        return arrayOfByte4;
      }
      paramString = zw.a(paramString, "\"\"", "\"");
      byte[] arrayOfByte1 = Encoding.getUnicode().a(paramString);
      arrayOfByte3 = new byte[arrayOfByte1.length + 3];
      arrayOfByte3[0] = 23;
      System.arraycopy(zc.a(paramString.length()), 0, arrayOfByte3, 1, 2);
      System.arraycopy(arrayOfByte1, 0, arrayOfByte3, 3, arrayOfByte1.length);
      return arrayOfByte3;
    }
    if (zarb.b(paramString))
    {
      double d2 = zp.a(paramString);
      arrayOfByte4 = null;
      if ((d2 == (int)d2) && (d2 >= 0.0D) && (d2 <= 65535.0D))
      {
        arrayOfByte4 = new byte[3];
        arrayOfByte4[0] = 30;
        System.arraycopy(zc.a((int)d2), 0, arrayOfByte4, 1, 2);
        return arrayOfByte4;
      }
      arrayOfByte4 = new byte[9];
      arrayOfByte4[0] = 31;
      System.arraycopy(zc.a(d2), 0, arrayOfByte4, 1, 8);
      return arrayOfByte4;
    }
    paramString = zw.a(paramString, "\"\"", "\"");
    byte[] arrayOfByte2 = zct.c(paramString);
    byte[] arrayOfByte3 = new byte[arrayOfByte2.length + 3];
    arrayOfByte3[0] = 23;
    arrayOfByte3[1] = ((byte)paramString.length());
    arrayOfByte3[2] = ((byte)(arrayOfByte2.length == paramString.length() ? 0 : 1));
    System.arraycopy(arrayOfByte2, 0, arrayOfByte3, 3, arrayOfByte2.length);
    return arrayOfByte3;
  }
  
  private byte[] b(String paramString)
  {
    if ((paramString == null) || (paramString.equals(""))) {
      throw new CellsException(3, "Formula can not be null.");
    }
    int i1 = paramString.charAt(0) != '=' ? 1 : 0;
    if (i1 != 0)
    {
      byte[] arrayOfByte1 = a(paramString);
      byte[] arrayOfByte2 = null;
      if (e().p().g())
      {
        arrayOfByte2 = new byte[arrayOfByte1.length + 8];
        System.arraycopy(zc.a(arrayOfByte1.length), 0, arrayOfByte2, 0, 4);
        System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 4, arrayOfByte1.length);
      }
      else
      {
        arrayOfByte2 = new byte[arrayOfByte1.length + 2];
        System.arraycopy(zc.a(arrayOfByte1.length), 0, arrayOfByte2, 0, 2);
        System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 2, arrayOfByte1.length);
      }
      return arrayOfByte2;
    }
    int i2 = this.a.getRangeCount();
    if ((i2 < 1) && (!this.a.d)) {
      throw new CellsException(3, "Cell range address list with all affected ranges can'n be null.");
    }
    this.a.c = true;
    int i3 = 0;
    int i4 = 0;
    int[] arrayOfInt = this.a.e();
    if (arrayOfInt != null)
    {
      i3 = arrayOfInt[0];
      i4 = arrayOfInt[1];
    }
    return e().y().a(this.a.e.getIndex(), paramString, i3, i4, 0, 64, true, true, false);
  }
  
  private String a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    boolean bool = zaaq.a(e(), paramArrayOfByte, paramInt1, true);
    String str = e().d().a(paramInt1, paramArrayOfByte, paramInt2, paramInt3, true);
    if (bool)
    {
      str = str.substring(1);
      if ((str.length() > 0) && (str.charAt(0) == '"')) {
        str = str.substring(1, 1 + (str.length() - 2));
      }
    }
    return str;
  }
  
  void f()
  {
    if ((this.d != null) && (this.g == null)) {
      this.g = b(this.d);
    }
    if ((this.e != null) && (this.h == null)) {
      this.h = b(this.e);
    }
  }
  
  private String i()
  {
    String str = getText();
    if (str == null) {
      return "";
    }
    if ((str.length() > 0) && (str.charAt(0) == '=')) {
      return str.substring(1);
    }
    return "\"" + c(str) + "\"";
  }
  
  String g()
  {
    int[] arrayOfInt = this.a.e();
    if (arrayOfInt == null) {
      return null;
    }
    int i1 = arrayOfInt[0];
    int i2 = arrayOfInt[1];
    String str1 = CellsHelper.cellIndexToName(i1, i2);
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject;
    switch (this.c)
    {
    case 8: 
      localObject = i();
      if ((localObject != null) && (!"".equals(localObject)))
      {
        localStringBuilder.append("=NOT(ISERROR(SEARCH(");
        localStringBuilder.append((String)localObject);
        localStringBuilder.append(",");
        localStringBuilder.append(str1);
        localStringBuilder.append(")))");
      }
      break;
    case 9: 
      localObject = i();
      if ((localObject != null) && (!"".equals(localObject)))
      {
        localStringBuilder.append("=ISERROR(SEARCH(");
        localStringBuilder.append((String)localObject);
        localStringBuilder.append(",");
        localStringBuilder.append(str1);
        localStringBuilder.append("))");
      }
      break;
    case 10: 
      localObject = i();
      if ((localObject != null) && (!"".equals(localObject)))
      {
        localStringBuilder.append("=LEFT(");
        localStringBuilder.append(str1);
        localStringBuilder.append(",LEN(");
        localStringBuilder.append((String)localObject);
        localStringBuilder.append("))=");
        localStringBuilder.append((String)localObject);
      }
      break;
    case 11: 
      localObject = i();
      if ((localObject != null) && (!"".equals(localObject)))
      {
        localStringBuilder.append("=RIGHT(");
        localStringBuilder.append(str1);
        localStringBuilder.append(",LEN(");
        localStringBuilder.append((String)localObject);
        localStringBuilder.append("))=");
        localStringBuilder.append((String)localObject);
      }
      break;
    case 14: 
      localStringBuilder.append("=ISERROR(");
      localStringBuilder.append(str1);
      localStringBuilder.append(")");
      break;
    case 15: 
      localStringBuilder.append("=NOT(ISERROR(");
      localStringBuilder.append(str1);
      localStringBuilder.append("))");
      break;
    case 12: 
      localStringBuilder.append("=LEN(TRIM(");
      localStringBuilder.append(str1);
      localStringBuilder.append("))=0");
      break;
    case 13: 
      localStringBuilder.append("=LEN(TRIM(");
      localStringBuilder.append(str1);
      localStringBuilder.append("))>0");
      break;
    case 16: 
      switch (getTimePeriod())
      {
      case 1: 
        localStringBuilder.append("=FLOOR(");
        localStringBuilder.append(str1);
        localStringBuilder.append(",1)=TODAY()-1");
        break;
      case 0: 
        localStringBuilder.append("=FLOOR(");
        localStringBuilder.append(str1);
        localStringBuilder.append(",1)=TODAY()");
        break;
      case 2: 
        localStringBuilder.append("=FLOOR(");
        localStringBuilder.append(str1);
        localStringBuilder.append(",1)=TODAY()+1");
        break;
      case 3: 
        localStringBuilder.append("=AND(TODAY()-FLOOR(");
        localStringBuilder.append(str1);
        localStringBuilder.append(",1)<=6,FLOOR(");
        localStringBuilder.append(str1);
        localStringBuilder.append(",1)<=TODAY())");
        break;
      case 8: 
        localStringBuilder.append("=AND(TODAY()-ROUNDDOWN(");
        localStringBuilder.append(str1);
        localStringBuilder.append(",0)>=(WEEKDAY(TODAY())),TODAY()-ROUNDDOWN(");
        localStringBuilder.append(str1);
        localStringBuilder.append(",0)<(WEEKDAY(TODAY())+7))");
        break;
      case 7: 
        localStringBuilder.append("=AND(TODAY()-ROUNDDOWN(");
        localStringBuilder.append(str1);
        localStringBuilder.append(",0)<=WEEKDAY(TODAY())-1,ROUNDDOWN(");
        localStringBuilder.append(str1);
        localStringBuilder.append(",0)-TODAY()<=7-WEEKDAY(TODAY()))");
        break;
      case 9: 
        localStringBuilder.append("=AND(ROUNDDOWN(");
        localStringBuilder.append(str1);
        localStringBuilder.append(",0)-TODAY()>(7-WEEKDAY(TODAY())),ROUNDDOWN(");
        localStringBuilder.append(str1);
        localStringBuilder.append(",0)-TODAY()<(15-WEEKDAY(TODAY())))");
        break;
      case 5: 
        localStringBuilder.append("=OR(AND(MONTH(");
        localStringBuilder.append(str1);
        localStringBuilder.append(")=MONTH(TODAY())-1,YEAR(");
        localStringBuilder.append(str1);
        localStringBuilder.append(")=YEAR(TODAY())),AND(MONTH(TODAY())=1,MONTH(");
        localStringBuilder.append(str1);
        localStringBuilder.append(")=12,YEAR(");
        localStringBuilder.append(str1);
        localStringBuilder.append(")=YEAR(TODAY())-1))");
        break;
      case 4: 
        localStringBuilder.append("=AND(MONTH(");
        localStringBuilder.append(str1);
        localStringBuilder.append(")=MONTH(TODAY()),YEAR(");
        localStringBuilder.append(str1);
        localStringBuilder.append(")=YEAR(TODAY()))");
        break;
      case 6: 
        localStringBuilder.append("=AND(MONTH(");
        localStringBuilder.append(str1);
        localStringBuilder.append(")=MONTH(TODAY())+1,OR(YEAR(");
        localStringBuilder.append(str1);
        localStringBuilder.append(")=YEAR(TODAY()),AND(MONTH(");
        localStringBuilder.append(str1);
        localStringBuilder.append(")=12,YEAR(");
        localStringBuilder.append(str1);
        localStringBuilder.append(")=YEAR(TODAY())+1)))");
      }
      break;
    case 5: 
      localObject = h();
      if (localObject != null)
      {
        String str2 = a(this.a.b);
        if (((Top10)localObject).isPercent())
        {
          localStringBuilder.append("=IF(INT(COUNT(");
          localStringBuilder.append(str2);
          localStringBuilder.append(')');
          localStringBuilder.append('*');
          localStringBuilder.append(((Top10)localObject).getRank());
          localStringBuilder.append("%)>0,");
          localStringBuilder.append(((Top10)localObject).isBottom() ? "SMALL(" : "LARGE(");
          localStringBuilder.append(str2);
          localStringBuilder.append(',');
          localStringBuilder.append("INT(COUNT(");
          localStringBuilder.append(str2);
          localStringBuilder.append(')');
          localStringBuilder.append('*');
          localStringBuilder.append(((Top10)localObject).getRank());
          localStringBuilder.append("%)),");
          localStringBuilder.append(((Top10)localObject).isBottom() ? "MIN(" : "MAX(");
          localStringBuilder.append(str2);
          localStringBuilder.append("))");
          localStringBuilder.append(((Top10)localObject).isBottom() ? ">=" : "<=");
          localStringBuilder.append(str1);
        }
        else
        {
          localStringBuilder.append("=");
          localStringBuilder.append(((Top10)localObject).isBottom() ? "SMALL((" : "LARGE((");
          localStringBuilder.append(str2);
          localStringBuilder.append("),MIN(");
          localStringBuilder.append(((Top10)localObject).getRank());
          localStringBuilder.append(",COUNT(");
          localStringBuilder.append(str2);
          localStringBuilder.append(")))");
          localStringBuilder.append(((Top10)localObject).isBottom() ? ">=" : "<=");
          localStringBuilder.append(str1);
        }
      }
      break;
    case 7: 
      return a('>', str1);
    case 6: 
      return a('=', str1);
    case 17: 
      localObject = a(this.a.b);
      localStringBuilder.append("=");
      if (getAboveAverage().getStdDev() == 0)
      {
        localStringBuilder.append(str1);
        if (getAboveAverage().isAboveAverage()) {
          localStringBuilder.append(">");
        } else {
          localStringBuilder.append("<");
        }
        if (getAboveAverage().isEqualAverage()) {
          localStringBuilder.append("=");
        }
        localStringBuilder.append("AVERAGE(IF(ISERROR(");
        localStringBuilder.append((String)localObject);
        localStringBuilder.append("),\"\",IF(ISBLANK(");
        localStringBuilder.append((String)localObject);
        localStringBuilder.append("),\"\",");
        localStringBuilder.append((String)localObject);
        localStringBuilder.append(")))");
      }
      else
      {
        localStringBuilder.append("(");
        localStringBuilder.append(str1);
        localStringBuilder.append("-AVERAGE(");
        localStringBuilder.append((String)localObject);
        localStringBuilder.append("))");
        if (getAboveAverage().isAboveAverage()) {
          localStringBuilder.append(">=");
        } else {
          localStringBuilder.append("<=");
        }
        localStringBuilder.append("STDEVP(");
        localStringBuilder.append((String)localObject);
        localStringBuilder.append(")*(");
        if (!getAboveAverage().isAboveAverage()) {
          localStringBuilder.append("-");
        }
        localStringBuilder.append(getAboveAverage().getStdDev());
        localStringBuilder.append(")");
      }
      return zs.a(localStringBuilder);
    }
    if (localStringBuilder.length() == 0) {
      return null;
    }
    return zs.a(localStringBuilder);
  }
  
  private String c(String paramString)
  {
    return zw.a(paramString, "\"", "\"\"");
  }
  
  private String a(char paramChar, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("=AND(");
    for (int i1 = 0; i1 < this.a.b.size(); i1++)
    {
      CellArea localCellArea = (CellArea)this.a.b.get(i1);
      localStringBuilder.append("COUNTIF(");
      a(localCellArea, localStringBuilder);
      localStringBuilder.append(",");
      localStringBuilder.append(paramString);
      localStringBuilder.append(')');
      if (i1 != this.a.b.size() - 1) {
        localStringBuilder.append('+');
      }
    }
    localStringBuilder.append(paramChar);
    localStringBuilder.append("1,NOT(ISBLANK(");
    localStringBuilder.append(paramString);
    localStringBuilder.append(")))");
    return zs.a(localStringBuilder);
  }
  
  private String a(ArrayList paramArrayList)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramArrayList.size() > 1) {
      localStringBuilder.append('(');
    }
    for (int i1 = 0; i1 < paramArrayList.size(); i1++)
    {
      CellArea localCellArea = (CellArea)paramArrayList.get(i1);
      a(localCellArea, localStringBuilder);
      if (i1 != paramArrayList.size() - 1) {
        localStringBuilder.append(',');
      }
    }
    if (paramArrayList.size() > 1) {
      localStringBuilder.append(')');
    }
    return zs.a(localStringBuilder);
  }
  
  private void a(CellArea paramCellArea, StringBuilder paramStringBuilder)
  {
    paramStringBuilder.append('$');
    CellsHelper.a(paramStringBuilder, paramCellArea.StartColumn);
    paramStringBuilder.append('$');
    paramStringBuilder.append(paramCellArea.StartRow + 1);
    paramStringBuilder.append(':');
    paramStringBuilder.append('$');
    CellsHelper.a(paramStringBuilder, paramCellArea.EndColumn);
    paramStringBuilder.append('$');
    paramStringBuilder.append(paramCellArea.EndRow + 1);
  }
  
  public IconSet getIconSet()
  {
    if (this.m == null) {
      this.m = IconSet.a(this);
    }
    return this.m;
  }
  
  void a(IconSet paramIconSet)
  {
    this.m = paramIconSet;
  }
  
  public DataBar getDataBar()
  {
    if (this.n == null) {
      this.n = DataBar.a(e().p(), this);
    }
    return this.n;
  }
  
  void a(DataBar paramDataBar)
  {
    this.n = paramDataBar;
  }
  
  public ColorScale getColorScale()
  {
    if (this.o == null) {
      this.o = ColorScale.a(e().p(), this);
    }
    return this.o;
  }
  
  void a(ColorScale paramColorScale)
  {
    this.o = paramColorScale;
  }
  
  public Top10 getTop10()
  {
    if (this.p == null) {
      this.p = new Top10();
    }
    return this.p;
  }
  
  void a(Top10 paramTop10)
  {
    this.p = paramTop10;
  }
  
  Top10 h()
  {
    return this.p;
  }
  
  public AboveAverage getAboveAverage()
  {
    if (this.q == null) {
      this.q = new AboveAverage();
    }
    return this.q;
  }
  
  public String getText()
  {
    String str = getFormula2();
    if ((str != null) && (!"".equals(str)) && (str.length() > 2) && (str.charAt(0) == '=') && (str.charAt(1) == '"')) {
      str = str.substring(2, 2 + (str.length() - 3));
    }
    return str;
  }
  
  public void setText(String value)
  {
    setFormula2(value);
  }
  
  public int getTimePeriod()
  {
    return this.r;
  }
  
  public void setTimePeriod(int value)
  {
    this.r = value;
  }
  
  boolean a(boolean paramBoolean)
  {
    switch (getType())
    {
    case 4: 
      switch (getIconSet().getType())
      {
      case 17: 
      case 18: 
      case 19: 
        return true;
      }
      if (getIconSet().isCustom()) {
        return true;
      }
      break;
    case 3: 
      if (paramBoolean) {
        return true;
      }
      break;
    case 8: 
    case 9: 
    case 10: 
    case 11: 
      String str = getText();
      if ((str != null) && (str.length() > 1) && (str.charAt(0) == '=')) {
        return true;
      }
      break;
    }
    return false;
  }
  
  void a(boolean paramBoolean, int paramInt1, int paramInt2, zbcq paramzbcq)
  {
    FormatCondition localFormatCondition = this;
    localFormatCondition.f();
    if (localFormatCondition.a() != null) {
      localFormatCondition.a(zcx.a(localFormatCondition.e(), paramBoolean, localFormatCondition.a(), -1, paramInt1, paramInt2, true, paramzbcq));
    }
    if (localFormatCondition.c() != null) {
      localFormatCondition.b(zcx.a(localFormatCondition.e(), paramBoolean, localFormatCondition.c(), -1, paramInt1, paramInt2, true, paramzbcq));
    }
    switch (localFormatCondition.c)
    {
    case 3: 
      if (localFormatCondition.getDataBar().b != null) {
        localFormatCondition.getDataBar().b.a(paramBoolean, paramInt1, paramInt2, paramzbcq);
      }
      if (localFormatCondition.getDataBar().a != null) {
        localFormatCondition.getDataBar().a.a(paramBoolean, paramInt1, paramInt2, paramzbcq);
      }
      break;
    case 4: 
      for (int i1 = 0; i1 < localFormatCondition.getIconSet().getCfvos().getCount(); i1++)
      {
        ConditionalFormattingValue localConditionalFormattingValue = localFormatCondition.getIconSet().getCfvos().get(i1);
        localConditionalFormattingValue.a(paramBoolean, paramInt1, paramInt2, paramzbcq);
      }
      break;
    case 2: 
      if (localFormatCondition.getColorScale().c != null) {
        localFormatCondition.getColorScale().c.a(paramBoolean, paramInt1, paramInt2, paramzbcq);
      }
      if (localFormatCondition.getColorScale().b != null) {
        localFormatCondition.getColorScale().b.a(paramBoolean, paramInt1, paramInt2, paramzbcq);
      }
      if (localFormatCondition.getColorScale().a != null) {
        localFormatCondition.getColorScale().a.a(paramBoolean, paramInt1, paramInt2, paramzbcq);
      }
      break;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/FormatCondition.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */