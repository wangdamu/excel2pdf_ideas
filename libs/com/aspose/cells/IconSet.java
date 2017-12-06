package com.aspose.cells;

public class IconSet
{
  int a = 6;
  private boolean d = true;
  boolean b = false;
  private boolean e = true;
  ConditionalFormattingIconCollection c = null;
  private ConditionalFormattingValueCollection f;
  private FormatCondition g = null;
  
  public ConditionalFormattingIconCollection getCfIcons()
  {
    if (this.c == null)
    {
      int i = this.f.getCount();
      this.c = new ConditionalFormattingIconCollection();
      for (int j = 0; j < i; j++)
      {
        ConditionalFormattingIcon localConditionalFormattingIcon = new ConditionalFormattingIcon(this.a, j);
        this.c.add(localConditionalFormattingIcon);
      }
    }
    return this.c;
  }
  
  IconSet(FormatCondition formatCond)
  {
    this.g = formatCond;
    this.f = new ConditionalFormattingValueCollection(formatCond);
    this.f.b = true;
  }
  
  void a(IconSet paramIconSet, CopyOptions paramCopyOptions, int paramInt1, int paramInt2)
  {
    this.d = paramIconSet.d;
    this.e = paramIconSet.e;
    this.b = paramIconSet.b;
    this.a = paramIconSet.a;
    this.f.a(paramIconSet.f, paramCopyOptions, paramInt1, paramInt2);
    if ((paramIconSet.c != null) && (paramIconSet.c.getCount() > 0))
    {
      this.c = new ConditionalFormattingIconCollection();
      this.c.a(paramIconSet.c);
    }
  }
  
  static IconSet a(FormatCondition paramFormatCondition)
  {
    IconSet localIconSet = new IconSet(paramFormatCondition);
    localIconSet.setType(6);
    return localIconSet;
  }
  
  private void b(int paramInt)
  {
    if (paramInt == 3)
    {
      this.f.a(new ConditionalFormattingValue(this.g, 4, Integer.valueOf(0)));
      this.f.a(new ConditionalFormattingValue(this.g, 4, Integer.valueOf(33)));
      this.f.a(new ConditionalFormattingValue(this.g, 4, Integer.valueOf(67)));
    }
    else if (paramInt == 4)
    {
      this.f.a(new ConditionalFormattingValue(this.g, 4, Integer.valueOf(0)));
      this.f.a(new ConditionalFormattingValue(this.g, 4, Integer.valueOf(25)));
      this.f.a(new ConditionalFormattingValue(this.g, 4, Integer.valueOf(50)));
      this.f.a(new ConditionalFormattingValue(this.g, 4, Integer.valueOf(75)));
    }
    else if (paramInt == 5)
    {
      this.f.a(new ConditionalFormattingValue(this.g, 4, Integer.valueOf(0)));
      this.f.a(new ConditionalFormattingValue(this.g, 4, Integer.valueOf(20)));
      this.f.a(new ConditionalFormattingValue(this.g, 4, Integer.valueOf(40)));
      this.f.a(new ConditionalFormattingValue(this.g, 4, Integer.valueOf(60)));
      this.f.a(new ConditionalFormattingValue(this.g, 4, Integer.valueOf(80)));
    }
  }
  
  public ConditionalFormattingValueCollection getCfvos()
  {
    return this.f;
  }
  
  public int getType()
  {
    if (isCustom()) {
      return 21;
    }
    return this.a;
  }
  
  public void setType(int value)
  {
    this.a = value;
    this.c = null;
    int i = zauj.Y(this.a);
    int j = this.f.getCount();
    try
    {
      if (j != i)
      {
        this.f.clear();
        b(i);
      }
    }
    catch (Exception localException) {}
  }
  
  public boolean isCustom()
  {
    return (this.c != null) && (this.c.getCount() != 0);
  }
  
  void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public boolean getShowValue()
  {
    return this.d;
  }
  
  public void setShowValue(boolean value)
  {
    this.d = value;
  }
  
  public boolean getReverse()
  {
    return this.b;
  }
  
  public void setReverse(boolean value)
  {
    this.b = value;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/IconSet.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */