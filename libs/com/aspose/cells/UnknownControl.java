package com.aspose.cells;

import java.util.HashMap;

public class UnknownControl
  extends ActiveXControl
{
  byte[] f;
  int g = 3;
  HashMap h;
  
  UnknownControl(Shape shape)
  {
    super(shape);
  }
  
  UnknownControl(Shape shape, byte[] data, int persistenceType)
  {
    super(shape);
    this.f = data;
    this.g = persistenceType;
  }
  
  public int getPersistenceType()
  {
    return this.g;
  }
  
  public byte[] getRelationshipData(String relId)
  {
    if (this.h == null) {
      return null;
    }
    return (byte[])this.h.get(relId);
  }
  
  public byte[] getData()
    throws Exception
  {
    return this.f;
  }
  
  public int getType()
  {
    return 11;
  }
  
  int a(int paramInt)
  {
    return 0;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/UnknownControl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */