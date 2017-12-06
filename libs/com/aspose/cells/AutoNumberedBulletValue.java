package com.aspose.cells;

public class AutoNumberedBulletValue
  extends BulletValue
{
  private int a = 1;
  private int b = 0;
  
  public int getType()
  {
    return 3;
  }
  
  public int getStartAt()
  {
    return this.a;
  }
  
  public void setStartAt(int value)
  {
    this.a = value;
  }
  
  public int getAutonumberScheme()
  {
    return this.b;
  }
  
  public void setAutonumberScheme(int value)
  {
    this.b = value;
  }
  
  void a(BulletValue paramBulletValue)
  {
    this.a = ((AutoNumberedBulletValue)paramBulletValue).a;
    this.b = ((AutoNumberedBulletValue)paramBulletValue).b;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/AutoNumberedBulletValue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */