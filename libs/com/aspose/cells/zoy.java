package com.aspose.cells;

import com.aspose.cells.b.a.zw;

class zoy
{
  double a;
  double b;
  double c;
  double d;
  String e;
  int f;
  double[] g;
  zaml[] h;
  
  static boolean a(zoy paramzoy1, zoy paramzoy2)
  {
    if ((paramzoy1 == null) && (paramzoy2 == null)) {
      return true;
    }
    if ((paramzoy1 != null) && (paramzoy2 != null))
    {
      if (paramzoy1.a != paramzoy2.a) {
        return false;
      }
      if (paramzoy1.b != paramzoy2.b) {
        return false;
      }
      if (paramzoy1.c != paramzoy2.c) {
        return false;
      }
      if (paramzoy1.d != paramzoy2.d) {
        return false;
      }
      if (!zw.b(paramzoy1.e, paramzoy2.e)) {
        return false;
      }
      if (paramzoy1.f != paramzoy2.f) {
        return false;
      }
      if (paramzoy1.a != paramzoy2.a) {
        return false;
      }
      int i;
      int j;
      if ((paramzoy1.g != null) || (paramzoy2.g != null)) {
        if ((paramzoy1.g != null) && (paramzoy2.g != null))
        {
          if (paramzoy1.g.length != paramzoy2.g.length) {
            return false;
          }
          i = paramzoy1.g.length;
          for (j = 0; j < i; j++) {
            if (paramzoy1.g[j] != paramzoy2.g[j]) {
              return false;
            }
          }
        }
        else
        {
          return false;
        }
      }
      if ((paramzoy1.h != null) || (paramzoy2.h != null)) {
        if ((paramzoy1.h != null) && (paramzoy2.h != null))
        {
          if (paramzoy1.h.length != paramzoy2.h.length) {
            return false;
          }
          i = paramzoy1.h.length;
          for (j = 0; j < i; j++) {
            if (!paramzoy1.h[j].equals(Double.valueOf(paramzoy2.g[j]))) {
              return false;
            }
          }
        }
        else
        {
          return false;
        }
      }
      return true;
    }
    return false;
  }
  
  static void a(zoy paramzoy, Style paramStyle)
  {
    int i = 4;
    int j = 0;
    if (paramzoy.h.length == 0) {
      return;
    }
    zaml localzaml1 = paramzoy.h[0];
    zaml localzaml2 = paramzoy.h[1];
    if ((paramzoy.e != null) && ("path".equals(paramzoy.e)))
    {
      if (paramzoy.c == 0.5D)
      {
        i = 2;
      }
      else
      {
        i = 3;
        if (paramzoy.c == 1.0D)
        {
          if (paramzoy.a == 1.0D) {
            j = 4;
          } else {
            j = 3;
          }
        }
        else if (paramzoy.c == 0.0D) {
          if (paramzoy.a == 0.0D) {
            j = 1;
          } else {
            j = 2;
          }
        }
      }
    }
    else {
      switch (paramzoy.f)
      {
      case 0: 
        i = 5;
        j = paramzoy.h.length == 3 ? 3 : 1;
        break;
      case 180: 
        i = 5;
        j = 2;
        break;
      case 90: 
        i = 4;
        j = paramzoy.h.length == 3 ? 3 : 1;
        break;
      case 270: 
        i = 4;
        j = 2;
        break;
      case 45: 
        i = 1;
        j = paramzoy.h.length == 3 ? 3 : 1;
        break;
      case 225: 
        i = 1;
        j = 2;
        break;
      case 135: 
        i = 0;
        j = paramzoy.h.length == 3 ? 3 : 1;
        break;
      case 315: 
        i = 0;
        j = 2;
      }
    }
    paramStyle.a(localzaml1, localzaml2, i, j);
    paramStyle.setGradient(true);
  }
  
  static zoy a(Style paramStyle)
  {
    if (!paramStyle.isGradient()) {
      return null;
    }
    zaml localzaml1 = paramStyle.b;
    zaml localzaml2 = paramStyle.a;
    int i = paramStyle.y();
    int j = paramStyle.z();
    zoy localzoy = new zoy();
    switch (i)
    {
    case 0: 
    case 1: 
    case 4: 
    case 5: 
      switch (j)
      {
      case 1: 
      case 2: 
        localzoy.g = new double[] { 0.0D, 1.0D };
        localzoy.h = new zaml[] { localzaml1, localzaml2 };
        break;
      case 3: 
        localzoy.g = new double[] { 0.0D, 0.5D, 1.0D };
        localzoy.h = new zaml[] { localzaml1, localzaml2, localzaml1 };
      }
      break;
    case 2: 
    case 3: 
      localzoy.e = "path";
      localzoy.g = new double[] { 0.0D, 1.0D };
      localzoy.h = new zaml[] { localzaml1, localzaml2 };
    }
    switch (i)
    {
    case 4: 
      switch (j)
      {
      case 1: 
        localzoy.f = 90;
        break;
      case 2: 
        localzoy.f = 270;
        break;
      case 3: 
        localzoy.f = 90;
      }
      break;
    case 5: 
      switch (j)
      {
      case 1: 
        localzoy.f = 0;
        break;
      case 2: 
        localzoy.f = 180;
        break;
      case 3: 
        localzoy.f = 0;
      }
      break;
    case 1: 
      switch (j)
      {
      case 1: 
        localzoy.f = 45;
        break;
      case 2: 
        localzoy.f = 225;
        break;
      case 3: 
        localzoy.f = 45;
      }
      break;
    case 0: 
      switch (j)
      {
      case 1: 
        localzoy.f = 135;
        break;
      case 2: 
        localzoy.f = 315;
        break;
      case 3: 
        localzoy.f = 135;
      }
      break;
    case 3: 
      switch (j)
      {
      case 2: 
        localzoy.a = 1.0D;
        localzoy.b = 1.0D;
        break;
      case 3: 
        localzoy.c = 1.0D;
        localzoy.d = 1.0D;
        break;
      case 4: 
        localzoy.c = (localzoy.b = localzoy.a = localzoy.d = 1.0D);
      }
      break;
    case 2: 
      localzoy.c = (localzoy.b = localzoy.a = localzoy.d = 0.5D);
    }
    return localzoy;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zoy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */