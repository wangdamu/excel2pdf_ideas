package com.aspose.cells;

public class ErrorBar
  extends Line
{
  private Series d;
  private int e = 1;
  private int f = 2;
  private double g;
  private boolean h = true;
  boolean a = true;
  private boolean i = true;
  private zjk j;
  private zjk k;
  private ShapePropertyCollection l;
  
  ErrorBar(Series parent, boolean isYDirection)
  {
    super(parent.i().e(), parent);
    this.d = parent;
    this.h = isYDirection;
  }
  
  void a(ErrorBar paramErrorBar, CopyOptions paramCopyOptions)
  {
    super.a(paramErrorBar);
    this.e = paramErrorBar.e;
    this.g = paramErrorBar.g;
    this.f = paramErrorBar.f;
    this.k = paramErrorBar.k;
    this.j = paramErrorBar.j;
    this.i = paramErrorBar.i;
    this.h = paramErrorBar.h;
    if (paramErrorBar.l != null)
    {
      this.l = new ShapePropertyCollection(this.d.u().a().a(), this, 7);
      this.l.a(paramErrorBar.l, paramCopyOptions);
    }
  }
  
  public int getType()
  {
    return this.e;
  }
  
  public void setType(int value)
  {
    this.e = value;
  }
  
  public int getDisplayType()
  {
    return this.f;
  }
  
  public void setDisplayType(int value)
  {
    this.f = value;
  }
  
  void a(int paramInt)
  {
    this.f = paramInt;
  }
  
  public double getAmount()
  {
    return this.g;
  }
  
  public void setAmount(double value)
  {
    if (value < 0.0D) {
      throw new IllegalArgumentException("Invalid amount value of error bar: it must be greater than and equal to zero.");
    }
    this.g = value;
  }
  
  void a(double paramDouble)
  {
    this.g = paramDouble;
  }
  
  boolean a()
  {
    return this.h;
  }
  
  void a(boolean paramBoolean)
  {
    this.h = paramBoolean;
    this.a = false;
  }
  
  public boolean getShowMarkerTTop()
  {
    return this.i;
  }
  
  public void setShowMarkerTTop(boolean value)
  {
    this.i = value;
  }
  
  public String getPlusValue()
  {
    if (this.j != null) {
      return this.j.q();
    }
    return null;
  }
  
  public void setPlusValue(String value)
  {
    String str = a(value);
    if ((str == null) || ("".equals(str)))
    {
      this.j = null;
      return;
    }
    this.j = new zjk(this.d.i().e(), str, null);
  }
  
  private String a(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    paramString = paramString.trim();
    if ((paramString == null) || ("".equals(paramString))) {
      return null;
    }
    if (paramString.charAt(0) == '=') {
      paramString = paramString.substring(1);
    }
    if ((paramString == null) || ("".equals(paramString))) {
      return null;
    }
    return paramString;
  }
  
  zjk b()
  {
    return this.j;
  }
  
  void a(zjk paramzjk)
  {
    this.j = paramzjk;
  }
  
  public String getMinusValue()
  {
    if (this.k == null) {
      return null;
    }
    return this.k.q();
  }
  
  public void setMinusValue(String value)
  {
    String str = a(value);
    if ((str == null) || ("".equals(str)))
    {
      this.k = null;
      return;
    }
    this.k = new zjk(this.d.i().e(), str, null);
  }
  
  zjk c()
  {
    return this.k;
  }
  
  void b(zjk paramzjk)
  {
    this.k = paramzjk;
  }
  
  Series d()
  {
    return this.d;
  }
  
  ShapePropertyCollection e()
  {
    if (this.l == null) {
      this.l = new ShapePropertyCollection(this.d.u().a().a(), this, 7);
    }
    return this.l;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ErrorBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */