package com.aspose.cells;

public abstract class ActiveXControlBase
{
  Shape b;
  byte[] c;
  int d;
  zag e;
  
  ActiveXControlBase(Shape shape)
  {
    this.b = shape;
  }
  
  static ActiveXControl a(int paramInt, UnknownControl paramUnknownControl, Shape paramShape)
  {
    Object localObject = null;
    switch (paramInt)
    {
    case 2: 
      localObject = new CheckBoxActiveXControl(paramShape);
      break;
    case 1: 
      localObject = new ComboBoxActiveXControl(paramShape);
      break;
    case 3: 
      localObject = new ListBoxActiveXControl(paramShape);
      break;
    case 6: 
      localObject = new RadioButtonActiveXControl(paramShape);
      break;
    case 4: 
      localObject = new TextBoxActiveXControl(paramShape);
      break;
    case 9: 
      localObject = new ToggleButtonActiveXControl(paramShape);
      break;
    case 8: 
      localObject = new ImageActiveXControl(paramShape);
      break;
    case 7: 
      localObject = new LabelActiveXControl(paramShape);
      break;
    case 0: 
      localObject = new CommandButtonActiveXControl(paramShape);
      break;
    case 5: 
      localObject = new SpinButtonActiveXControl(paramShape);
      break;
    case 10: 
      localObject = new ScrollBarActiveXControl(paramShape);
      break;
    case 11: 
    default: 
      if (paramUnknownControl != null) {
        return paramUnknownControl;
      }
      localObject = new UnknownControl(paramShape);
    }
    return (ActiveXControl)localObject;
  }
  
  void b() {}
  
  public Workbook getWorkbook()
  {
    if (this.b == null) {
      return null;
    }
    return this.b.P().p();
  }
  
  public abstract int getType();
  
  abstract int a(int paramInt);
  
  void b(int paramInt)
  {
    int i = a(paramInt);
    this.d |= i;
  }
  
  void a(int paramInt, boolean paramBoolean)
  {
    int i = a(paramInt);
    if (paramBoolean) {
      this.d |= i;
    } else {
      this.d &= (i ^ 0xFFFFFFFF);
    }
  }
  
  boolean c(int paramInt)
  {
    int i = a(paramInt);
    return (this.d & i) != 0;
  }
  
  public double getWidth()
  {
    return zbxp.b(this.e.h);
  }
  
  public void setWidth(double value)
  {
    this.e.h = zbxp.e(value);
    b(8);
  }
  
  public double getHeight()
  {
    return zbxp.b(this.e.i);
  }
  
  public void setHeight(double value)
  {
    this.e.i = zbxp.e(value);
    b(8);
  }
  
  public byte[] getMouseIcon()
  {
    return this.e.k;
  }
  
  public void setMouseIcon(byte[] value)
  {
    this.e.k = value;
    setMousePointer(99);
    b(15);
  }
  
  public int getMousePointer()
  {
    return this.e.g & 0xFF;
  }
  
  public void setMousePointer(int value)
  {
    this.e.g = ((byte)value);
    b(5);
  }
  
  public int getForeOleColor()
  {
    return this.e.b;
  }
  
  public void setForeOleColor(int value)
  {
    this.e.b = value;
    b(3);
  }
  
  public int getBackOleColor()
  {
    return this.e.c;
  }
  
  public void setBackOleColor(int value)
  {
    this.e.c = value;
    b(4);
  }
  
  public boolean isVisible()
  {
    if (this.b != null) {
      return !this.b.isHidden();
    }
    return true;
  }
  
  public void setVisible(boolean value)
  {
    if (this.b != null) {
      this.b.setHidden(!value);
    }
  }
  
  public boolean getShadow()
  {
    if (this.b != null) {
      return this.b.B;
    }
    return true;
  }
  
  public void setShadow(boolean value)
  {
    if (this.b != null) {
      this.b.B = value;
    }
  }
  
  public String getLinkedCell()
  {
    if (this.b != null) {
      return this.b.getLinkedCell();
    }
    return null;
  }
  
  public void setLinkedCell(String value)
  {
    if (this.b != null) {
      this.b.setLinkedCell(value);
    }
  }
  
  public String getListFillRange()
  {
    if (this.b != null) {
      return this.b.getInputRange();
    }
    return null;
  }
  
  public void setListFillRange(String value)
  {
    if (this.b != null) {
      this.b.setInputRange(value);
    }
  }
  
  public byte[] getData()
    throws Exception
  {
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ActiveXControlBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */