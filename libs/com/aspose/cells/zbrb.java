package com.aspose.cells;

class zbrb
  extends zy
{
  private zbpg e;
  
  public zbrb(zig paramzig, String paramString1, String paramString2)
  {
    super(paramzig, paramString1, paramString2);
    this.e = new zbpg(paramzig, "MMM", false, 2);
  }
  
  protected void a(zzu paramzzu, DateTime paramDateTime, double paramDouble, StringBuilder paramStringBuilder)
  {
    zzz localzzz = this.e.a(paramzzu, paramDateTime, paramDouble, false);
    char[] arrayOfChar = localzzz.g();
    if (arrayOfChar.length > 0)
    {
      paramStringBuilder.append(arrayOfChar[0]);
      return;
    }
    switch (paramDateTime.getMonth())
    {
    case 1: 
    case 6: 
    case 7: 
      paramStringBuilder.append('J');
      return;
    case 2: 
      paramStringBuilder.append('F');
      return;
    case 3: 
    case 5: 
      paramStringBuilder.append('M');
      return;
    case 4: 
    case 8: 
      paramStringBuilder.append('A');
      return;
    case 9: 
      paramStringBuilder.append('S');
      return;
    case 10: 
      paramStringBuilder.append('O');
      return;
    case 11: 
      paramStringBuilder.append('N');
      return;
    case 12: 
      paramStringBuilder.append('D');
      return;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbrb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */