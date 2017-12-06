package com.aspose.cells;

import com.aspose.cells.b.a.d.zh;

public class ConditionalFormattingIcon
{
  private int a;
  private int b;
  
  ConditionalFormattingIcon(int type, int index)
  {
    this.a = type;
    this.b = index;
  }
  
  ConditionalFormattingIcon() {}
  
  void a(ConditionalFormattingIcon paramConditionalFormattingIcon)
  {
    this.a = paramConditionalFormattingIcon.a;
    this.b = paramConditionalFormattingIcon.b;
  }
  
  public static byte[] getIconImageData(int type, int index)
    throws Exception
  {
    if (type == 20) {
      return null;
    }
    zh localzh = zajx.a(type, index);
    byte[] arrayOfByte = localzh.o();
    localzh.a();
    return arrayOfByte;
  }
  
  public byte[] getImageData()
    throws Exception
  {
    return getIconImageData(this.a, this.b);
  }
  
  public int getType()
  {
    return this.a;
  }
  
  public void setType(int value)
  {
    this.a = value;
  }
  
  public int getIndex()
  {
    return this.b;
  }
  
  public void setIndex(int value)
  {
    this.b = value;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ConditionalFormattingIcon.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */