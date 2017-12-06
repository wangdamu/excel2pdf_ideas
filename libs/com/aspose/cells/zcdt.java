package com.aspose.cells;

class zcdt
  extends zche
{
  private static zcdt a = null;
  private static Object b = new Object();
  
  static zcdt a()
  {
    if (null == a) {
      synchronized (b)
      {
        if (null == a) {
          a = new zcdt();
        }
      }
    }
    return a;
  }
  
  zche a(Object paramObject)
    throws Exception
  {
    Object localObject = null;
    if ((paramObject instanceof Double)) {
      localObject = new zep(paramObject);
    } else if ((paramObject instanceof Integer)) {
      localObject = new zen(paramObject);
    } else if ((paramObject instanceof String)) {
      localObject = new zeq(paramObject);
    } else if ((paramObject instanceof Boolean)) {
      localObject = new zek(paramObject);
    } else if ((paramObject instanceof DateTime)) {
      localObject = new zel(paramObject);
    } else if (paramObject == null) {
      localObject = new zeo(paramObject);
    } else {
      localObject = new zem(paramObject);
    }
    return (zche)localObject;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcdt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */