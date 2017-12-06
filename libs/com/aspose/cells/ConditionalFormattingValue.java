package com.aspose.cells;

import com.aspose.cells.b.a.zs;

public class ConditionalFormattingValue
{
  private byte[] c;
  double a = -1.7976931348623157E308D;
  double b = Double.MAX_VALUE;
  private Object d = null;
  private int e;
  private boolean f = true;
  private FormatCondition g;
  
  void a(ConditionalFormattingValue paramConditionalFormattingValue, WorksheetCollection paramWorksheetCollection1, WorksheetCollection paramWorksheetCollection2, CopyOptions paramCopyOptions, int paramInt1, int paramInt2)
  {
    this.d = paramConditionalFormattingValue.d;
    this.f = paramConditionalFormattingValue.f;
    this.e = paramConditionalFormattingValue.e;
    if (paramConditionalFormattingValue.c != null) {
      this.c = zaam.a(paramConditionalFormattingValue.c, -1, paramInt1, paramInt2, paramCopyOptions);
    }
  }
  
  ConditionalFormattingValue(FormatCondition fc)
  {
    this.g = fc;
  }
  
  ConditionalFormattingValue(FormatCondition formatCondition, int type, Object value)
  {
    this.g = formatCondition;
    setValue(value);
    this.e = type;
  }
  
  public Object getValue()
  {
    if (this.d != null) {
      return this.d;
    }
    b();
    return this.d;
  }
  
  public void setValue(Object value)
  {
    this.d = value;
    this.c = null;
  }
  
  void a(double paramDouble)
  {
    this.d = Double.valueOf(paramDouble);
  }
  
  void a()
  {
    if (this.d == null) {
      return;
    }
    if (((this.d instanceof String)) && (((String)this.d).startsWith("=")))
    {
      String str = (String)this.d;
      int[] arrayOfInt = this.g.a.e();
      if (arrayOfInt != null)
      {
        int i = arrayOfInt[0];
        int j = arrayOfInt[1];
        this.c = this.g.e().y().a(-1, str, i, j, 0, 64, true, true, false);
      }
    }
    else
    {
      this.c = zaaq.a(this.g.e(), this.d);
    }
  }
  
  void b()
  {
    if (this.c == null) {
      return;
    }
    if (this.g.e().p().h())
    {
      if (this.c.length != 4) {}
    }
    else if (this.c.length == 2) {
      return;
    }
    this.d = zaaq.a(this.g.e(), this.c, -1);
    if (this.d == null)
    {
      int[] arrayOfInt = this.g.a.e();
      if (arrayOfInt == null) {
        return;
      }
      int i = arrayOfInt[0];
      int j = arrayOfInt[1];
      this.d = this.g.e().d().a(-1, this.c, i, j, true);
    }
  }
  
  String c()
  {
    if (this.c == null)
    {
      if (this.d == null) {
        return null;
      }
      if ((this.d instanceof String))
      {
        String str1 = (String)this.d;
        if (str1.startsWith("=")) {
          return str1.substring(1);
        }
        return str1;
      }
      return zs.a(this.d);
    }
    int[] arrayOfInt = this.g.a.e();
    if (arrayOfInt == null) {
      arrayOfInt = new int[2];
    }
    int i = arrayOfInt[0];
    int j = arrayOfInt[1];
    String str2 = this.g.e().d().a(-1, this.c, i, j, true);
    return str2.substring(1);
  }
  
  void a(String paramString)
  {
    String str = "=" + paramString;
    int[] arrayOfInt = this.g.a.e();
    if (arrayOfInt == null) {
      arrayOfInt = new int[2];
    }
    int i = arrayOfInt[0];
    int j = arrayOfInt[1];
    a(this.g.e().y().a(-1, str, i, j, 0, 64, true, true, false));
  }
  
  double d()
  {
    if (this.d == null) {
      return 0.0D;
    }
    if ((this.d instanceof Integer)) {
      return ((Integer)this.d).intValue();
    }
    if ((this.d instanceof Double)) {
      return ((Double)this.d).doubleValue();
    }
    if ((this.d instanceof DateTime)) {
      return CellsHelper.getDoubleFromDateTime((DateTime)this.d, this.g.e().p().getSettings().getDate1904());
    }
    return 0.0D;
  }
  
  boolean e()
  {
    if (this.c != null)
    {
      Object localObject = zaaq.a(this.g.e(), this.c, -1);
      return (localObject == null) || (!(localObject instanceof Double));
    }
    return (this.d != null) && ((this.d instanceof String)) && (((String)this.d).startsWith("="));
  }
  
  byte[] f()
  {
    if (this.c == null) {
      a();
    }
    return this.c;
  }
  
  void a(byte[] paramArrayOfByte)
  {
    this.c = paramArrayOfByte;
    this.d = zaaq.a(this.g.e(), paramArrayOfByte, -1);
  }
  
  void a(boolean paramBoolean, int paramInt1, int paramInt2, zbcq paramzbcq)
  {
    if (this.c != null) {
      this.c = zcx.a(this.g.e(), paramBoolean, this.c, -1, paramInt1, paramInt2, true, paramzbcq);
    }
  }
  
  public int getType()
  {
    return this.e;
  }
  
  public void setType(int value)
  {
    this.e = value;
    if ((value == 1) || (value == 2)) {
      this.d = null;
    }
  }
  
  public boolean isGTE()
  {
    return this.f;
  }
  
  public void setGTE(boolean value)
  {
    this.f = value;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ConditionalFormattingValue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */