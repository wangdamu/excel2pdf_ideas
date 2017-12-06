package com.aspose.cells;

class zgj
  implements zagx
{
  static zgj a = new zgj();
  
  public boolean a(int paramInt1, Object paramObject1, int paramInt2, Object paramObject2)
  {
    switch (paramInt1)
    {
    case 1: 
      switch (paramInt2)
      {
      case 1: 
        return a(((Double)paramObject1).doubleValue(), ((Double)paramObject2).doubleValue());
      case 6: 
        return a(((Double)paramObject1).doubleValue(), zayi.a(((Integer)paramObject2).intValue()));
      case 0: 
        return a(((Double)paramObject1).doubleValue());
      }
      return true;
    case 6: 
      switch (paramInt2)
      {
      case 1: 
        return a(zayi.a(((Integer)paramObject1).intValue()), ((Double)paramObject2).doubleValue());
      case 6: 
        return (Integer)paramObject1 != (Integer)paramObject2;
      case 0: 
        return a(zayi.a(((Integer)paramObject1).intValue()));
      }
      return true;
    case 0: 
      switch (paramInt2)
      {
      case 1: 
        return a(((Double)paramObject2).doubleValue());
      case 6: 
        return a(zayi.a(((Integer)paramObject2).intValue()));
      case 4: 
        return ((String)paramObject2).length() > 0;
      case 0: 
        return false;
      }
      return true;
    case 4: 
      if (paramInt2 == 4) {
        return !((String)paramObject1).equals((String)paramObject2);
      }
      return true;
    }
    return (paramInt1 != paramInt2) || (!paramObject1.equals(paramObject2));
  }
  
  protected boolean a(double paramDouble1, double paramDouble2)
  {
    return zga.b(paramDouble1) != zga.b(paramDouble2);
  }
  
  protected boolean a(double paramDouble)
  {
    return zga.b(paramDouble) != 0.0D;
  }
  
  static void a(int paramInt, Object paramObject, StringBuilder paramStringBuilder)
  {
    switch (paramInt)
    {
    case 0: 
      paramStringBuilder.append("Null");
      return;
    case 6: 
      paramStringBuilder.append("Double-");
      paramStringBuilder.append(zayi.a(((Integer)paramObject).intValue()));
      return;
    case 3: 
      paramStringBuilder.append(zabc.a(((Byte)paramObject).byteValue()).q());
      return;
    case 2: 
      paramStringBuilder.append("Boolean-");
      break;
    case 1: 
      paramStringBuilder.append("Double-");
      break;
    case 4: 
      paramStringBuilder.append("String-");
      break;
    case 5: 
    default: 
      paramStringBuilder.append("Unknown-");
    }
    paramStringBuilder.append(paramObject);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zgj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */