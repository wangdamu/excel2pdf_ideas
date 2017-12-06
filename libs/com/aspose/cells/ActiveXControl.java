package com.aspose.cells;

public abstract class ActiveXControl
  extends ActiveXControlBase
{
  Font a;
  
  ActiveXControl(Shape shape)
  {
    super(shape);
  }
  
  public boolean isEnabled()
  {
    return this.e.a(1);
  }
  
  public void setEnabled(boolean value)
  {
    this.e.a(1, value);
    b(14);
  }
  
  public boolean isLocked()
  {
    if (this.b != null) {
      return this.b.isLocked();
    }
    return this.e.a(2);
  }
  
  public void setLocked(boolean value)
  {
    if (this.b != null)
    {
      this.b.setLocked(value);
      return;
    }
    this.e.a(2, value);
    b(14);
  }
  
  public boolean isTransparent()
  {
    return !this.e.a(3);
  }
  
  public void setTransparent(boolean value)
  {
    this.e.a(3, !value);
    b(14);
  }
  
  public boolean isAutoSize()
  {
    return this.e.a(28);
  }
  
  public void setAutoSize(boolean value)
  {
    this.e.a(28, value);
    b(14);
  }
  
  public int getIMEMode()
  {
    int i = 15;
    return this.e.a >> i & 0xF;
  }
  
  public void setIMEMode(int value)
  {
    int i = 15;
    this.e.a &= (15 << i ^ 0xFFFFFFFF);
    this.e.a |= value << i;
  }
  
  public Font getFont()
  {
    if (this.a == null) {
      a();
    }
    return this.a;
  }
  
  void a()
  {
    WorksheetCollection localWorksheetCollection = this.b == null ? null : this.b.P();
    this.a = new Font(localWorksheetCollection, this.b, false);
    this.a.f = "MS Sans Serif";
    this.a.e = 1;
    this.a.a = 1;
  }
  
  public int getTextAlign()
  {
    switch (this.e.q)
    {
    case 1: 
      return 7;
    case 2: 
      return 8;
    case 3: 
      return 1;
    }
    return 7;
  }
  
  public void setTextAlign(int value)
  {
    int i = 0;
    switch (value)
    {
    case 7: 
      i = 1;
      break;
    case 8: 
      i = 2;
      break;
    case 1: 
      i = 3;
      break;
    }
    this.e.q = ((byte)i);
  }
  
  public byte[] getData()
    throws Exception
  {
    zai localzai = new zai(this);
    return localzai.a();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ActiveXControl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */