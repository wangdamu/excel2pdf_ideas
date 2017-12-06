package com.aspose.cells;

public class Scenario
{
  String a;
  String b;
  String c;
  boolean d;
  boolean e;
  ScenarioInputCellCollection f = new ScenarioInputCellCollection();
  
  public String getComment()
  {
    return this.a;
  }
  
  public void setComment(String value)
  {
    this.a = value;
  }
  
  public String getName()
  {
    return this.b;
  }
  
  public void setName(String value)
  {
    this.b = value;
  }
  
  public String getUser()
  {
    return this.c;
  }
  
  public boolean isHidden()
  {
    return this.d;
  }
  
  public void setHidden(boolean value)
  {
    this.d = value;
  }
  
  public boolean isLocked()
  {
    return this.e;
  }
  
  public void setLocked(boolean value)
  {
    this.e = value;
  }
  
  public ScenarioInputCellCollection getInputCells()
  {
    return this.f;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Scenario.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */