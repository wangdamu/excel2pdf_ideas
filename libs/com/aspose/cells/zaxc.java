package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

class zaxc
{
  static boolean a(ArrayList paramArrayList, Cell paramCell, int[] paramArrayOfInt)
  {
    switch (paramCell.getType())
    {
    case 1: 
    case 4: 
      zf.a(paramArrayList, Double.valueOf(paramCell.getDoubleValue()));
      paramArrayOfInt[0] += 1;
      break;
    case 0: 
      zf.a(paramArrayList, Double.valueOf(paramCell.getBoolValue() ? 1.0D : 0.0D));
      paramArrayOfInt[0] += 1;
      break;
    case 5: 
      paramArrayOfInt[0] += 1;
      break;
    case 3: 
      break;
    case 2: 
      return false;
    }
    return true;
  }
  
  static ArrayList a(ArrayList paramArrayList, boolean paramBoolean, PivotField paramPivotField, boolean[] paramArrayOfBoolean1, int paramInt1, zawp paramzawp, int paramInt2, zbug paramzbug, int[] paramArrayOfInt, boolean[] paramArrayOfBoolean2)
  {
    paramArrayOfInt[0] = 0;
    paramArrayOfBoolean2[0] = false;
    int i = paramPivotField.getBaseIndex();
    ArrayList localArrayList = new ArrayList();
    if ((i < 0) || (i >= paramArrayOfBoolean1.length)) {
      return localArrayList;
    }
    Object localObject1;
    if (paramArrayOfBoolean1[i] != 0)
    {
      zbtv localzbtv = (zbtv)paramzawp.i.get(i);
      localObject1 = localzbtv.c;
      if ((localObject1 == null) || (((ArrayList)localObject1).size() == 0))
      {
        paramArrayOfInt[0] = 0;
        return localArrayList;
      }
      for (int k = 0; k < paramArrayList.size(); k++)
      {
        zfa localzfa = (zfa)paramArrayList.get(k);
        if (((!paramBoolean) || (!localzfa.b)) && (localzfa.a[i] != null))
        {
          int m = ((Integer)localzfa.a[i]).intValue();
          if (m < ((ArrayList)localObject1).size())
          {
            Object localObject3 = ((zbos)((ArrayList)localObject1).get(m)).a;
            if (localObject3 != null) {
              switch (paramInt1)
              {
              case 1: 
                paramArrayOfInt[0] += 1;
                break;
              case 6: 
                if (((localObject3 instanceof Integer)) || ((localObject3 instanceof Double))) {
                  paramArrayOfInt[0] += 1;
                }
                break;
              default: 
                if ((localObject3 instanceof Integer))
                {
                  zf.a(localArrayList, Double.valueOf(((Integer)localObject3).intValue()));
                  paramArrayOfInt[0] += 1;
                }
                else if ((localObject3 instanceof Long))
                {
                  zf.a(localArrayList, Double.valueOf(((Long)localObject3).longValue()));
                  paramArrayOfInt[0] += 1;
                }
                else if ((localObject3 instanceof Double))
                {
                  zf.a(localArrayList, localObject3);
                  paramArrayOfInt[0] += 1;
                }
                else if ((localObject3 instanceof DateTime))
                {
                  zf.a(localArrayList, Double.valueOf(CellsHelper.getDoubleFromDateTime((DateTime)localObject3, false)));
                  paramArrayOfInt[0] += 1;
                }
                else
                {
                  paramArrayOfBoolean2[0] = true;
                }
                break;
              }
            }
          }
        }
      }
    }
    else
    {
      for (int j = 0; j < paramArrayList.size(); j++)
      {
        localObject1 = (zfa)paramArrayList.get(j);
        Object localObject2 = localObject1.a[i];
        if (localObject2 != null) {
          switch (paramInt1)
          {
          case 1: 
            paramArrayOfInt[0] += 1;
            break;
          case 6: 
            if (((localObject2 instanceof Integer)) || ((localObject2 instanceof Double))) {
              paramArrayOfInt[0] += 1;
            }
            break;
          default: 
            if ((localObject2 instanceof Integer))
            {
              zf.a(localArrayList, Double.valueOf(((Integer)localObject2).intValue()));
              paramArrayOfInt[0] += 1;
            }
            else if ((localObject2 instanceof Long))
            {
              zf.a(localArrayList, Double.valueOf(((Long)localObject2).longValue()));
              paramArrayOfInt[0] += 1;
            }
            else if ((localObject2 instanceof Double))
            {
              zf.a(localArrayList, localObject2);
              paramArrayOfInt[0] += 1;
            }
            else if ((localObject2 instanceof DateTime))
            {
              zf.a(localArrayList, Double.valueOf(CellsHelper.getDoubleFromDateTime((DateTime)localObject2, false)));
              paramArrayOfInt[0] += 1;
            }
            else
            {
              paramArrayOfBoolean2[0] = true;
            }
            break;
          }
        }
      }
    }
    return localArrayList;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaxc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */