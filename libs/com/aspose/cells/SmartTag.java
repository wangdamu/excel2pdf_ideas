package com.aspose.cells;

public class SmartTag
{
  private SmartTagCollection a;
  private boolean b;
  private boolean c;
  private zbqf d;
  private SmartTagPropertyCollection e;
  
  SmartTag(SmartTagCollection parent)
  {
    this.a = parent;
    this.e = new SmartTagPropertyCollection();
  }
  
  public boolean getDeleted()
  {
    return this.b;
  }
  
  public void setDeleted(boolean value)
  {
    this.b = value;
  }
  
  boolean a()
  {
    return this.c;
  }
  
  void a(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  zbqf b()
  {
    return this.d;
  }
  
  void a(zbqf paramzbqf)
  {
    this.d = paramzbqf;
  }
  
  public SmartTagPropertyCollection getProperties()
  {
    return this.e;
  }
  
  public void setProperties(SmartTagPropertyCollection value)
  {
    this.e = value;
  }
  
  public String getUri()
  {
    return this.d.a();
  }
  
  public String getName()
  {
    return this.d.b();
  }
  
  public void setLink(String uri, String name)
  {
    WorksheetCollection localWorksheetCollection = this.a.a().a().c();
    int i = localWorksheetCollection.aa().a(uri, name);
    this.d = localWorksheetCollection.aa().a(i);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/SmartTag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */