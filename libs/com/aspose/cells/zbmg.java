package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbmg
  extends zco
{
  zbmg(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    zo[] arrayOfzo = new zo[32];
    switch (this.e.l.a.size())
    {
    case 4: 
      f2 = paramzq.i() * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
      f1 = paramzq.h() * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
      f4 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
      f3 = paramzq.h() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
      f6 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(2)).a())) / 21600.0F;
      f5 = paramzq.h() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(2)).a())) / 21600.0F;
      f8 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(3)).a())) / 21600.0F;
      f7 = paramzq.h() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(3)).a())) / 21600.0F;
      break;
    case 3: 
      if ((((zar)this.e.l.a.get(0)).b() == 327) && (((zar)this.e.l.a.get(1)).b() == 328) && (((zar)this.e.l.a.get(2)).b() == 329))
      {
        f2 = paramzq.i() * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
        f1 = paramzq.h() * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
        f4 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
        f3 = paramzq.h() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
        f6 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(2)).a())) / 21600.0F;
        f5 = paramzq.h() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(2)).a())) / 21600.0F;
        f8 = paramzq.i() * 9468.0F / 21600.0F;
        f7 = paramzq.h() * 9468.0F / 21600.0F;
      }
      else if ((((zar)this.e.l.a.get(0)).b() == 327) && (((zar)this.e.l.a.get(1)).b() == 329) && (((zar)this.e.l.a.get(2)).b() == 330))
      {
        f2 = paramzq.i() * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
        f1 = paramzq.h() * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
        f4 = paramzq.i() * 8048.0F / 21600.0F;
        f3 = paramzq.h() * 8048.0F / 21600.0F;
        f6 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
        f5 = paramzq.h() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
        f8 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(2)).a())) / 21600.0F;
        f7 = paramzq.h() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(2)).a())) / 21600.0F;
      }
      else if ((((zar)this.e.l.a.get(0)).b() == 328) && (((zar)this.e.l.a.get(1)).b() == 329) && (((zar)this.e.l.a.get(2)).b() == 330))
      {
        f2 = paramzq.i() * 0.24851851F;
        f1 = paramzq.h() * 5368.0F / 21600.0F;
        f4 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
        f3 = paramzq.h() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
        f6 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
        f5 = paramzq.h() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
        f8 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(2)).a())) / 21600.0F;
        f7 = paramzq.h() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(2)).a())) / 21600.0F;
      }
      else if ((((zar)this.e.l.a.get(0)).b() == 327) && (((zar)this.e.l.a.get(1)).b() == 328) && (((zar)this.e.l.a.get(2)).b() == 330))
      {
        f2 = paramzq.i() * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
        f1 = paramzq.h() * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
        f4 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
        f3 = paramzq.h() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
        f6 = paramzq.i() * 2716.0F / 21600.0F;
        f5 = paramzq.h() * 2716.0F / 21600.0F;
        f8 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(2)).a())) / 21600.0F;
        f7 = paramzq.h() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(2)).a())) / 21600.0F;
      }
      break;
    case 2: 
      if ((((zar)this.e.l.a.get(0)).b() == 327) && (((zar)this.e.l.a.get(1)).b() == 328))
      {
        f2 = paramzq.i() * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
        f1 = paramzq.h() * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
        f4 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
        f3 = paramzq.h() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
        f6 = paramzq.i() * 2716.0F / 21600.0F;
        f5 = paramzq.h() * 2716.0F / 21600.0F;
        f8 = paramzq.i() * 9468.0F / 21600.0F;
        f7 = paramzq.h() * 9468.0F / 21600.0F;
      }
      else if ((((zar)this.e.l.a.get(0)).b() == 327) && (((zar)this.e.l.a.get(1)).b() == 329))
      {
        f2 = paramzq.i() * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
        f1 = paramzq.h() * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
        f4 = paramzq.i() * 8048.0F / 21600.0F;
        f3 = paramzq.h() * 8048.0F / 21600.0F;
        f6 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
        f5 = paramzq.h() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
        f8 = paramzq.i() * 9468.0F / 21600.0F;
        f7 = paramzq.h() * 9468.0F / 21600.0F;
      }
      else if ((((zar)this.e.l.a.get(0)).b() == 327) && (((zar)this.e.l.a.get(1)).b() == 330))
      {
        f2 = paramzq.i() * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
        f1 = paramzq.h() * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
        f4 = paramzq.i() * 8048.0F / 21600.0F;
        f3 = paramzq.h() * 8048.0F / 21600.0F;
        f6 = paramzq.i() * 2716.0F / 21600.0F;
        f5 = paramzq.h() * 2716.0F / 21600.0F;
        f8 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
        f7 = paramzq.h() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
      }
      else if ((((zar)this.e.l.a.get(0)).b() == 328) && (((zar)this.e.l.a.get(1)).b() == 329))
      {
        f2 = paramzq.i() * 0.24851851F;
        f1 = paramzq.h() * 5368.0F / 21600.0F;
        f4 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
        f3 = paramzq.h() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
        f6 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
        f5 = paramzq.h() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
        f8 = paramzq.i() * 9468.0F / 21600.0F;
        f7 = paramzq.h() * 9468.0F / 21600.0F;
      }
      else if ((((zar)this.e.l.a.get(0)).b() == 328) && (((zar)this.e.l.a.get(1)).b() == 330))
      {
        f2 = paramzq.i() * 0.24851851F;
        f1 = paramzq.h() * 5368.0F / 21600.0F;
        f4 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
        f3 = paramzq.h() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
        f6 = paramzq.i() * 2716.0F / 21600.0F;
        f5 = paramzq.h() * 2716.0F / 21600.0F;
        f8 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
        f7 = paramzq.h() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
      }
      else if ((((zar)this.e.l.a.get(0)).b() == 329) && (((zar)this.e.l.a.get(1)).b() == 330))
      {
        f2 = paramzq.i() * 0.24851851F;
        f1 = paramzq.h() * 5368.0F / 21600.0F;
        f4 = paramzq.i() * 8048.0F / 21600.0F;
        f3 = paramzq.h() * 8048.0F / 21600.0F;
        f6 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
        f5 = paramzq.h() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
        f8 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
        f7 = paramzq.h() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
      }
      break;
    case 1: 
      if (((zar)this.e.l.a.get(0)).b() == 327)
      {
        f2 = paramzq.i() * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
        f1 = paramzq.h() * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
        f4 = paramzq.i() * 8048.0F / 21600.0F;
        f3 = paramzq.h() * 8048.0F / 21600.0F;
        f6 = paramzq.i() * 2716.0F / 21600.0F;
        f5 = paramzq.h() * 2716.0F / 21600.0F;
        f8 = paramzq.i() * 9468.0F / 21600.0F;
        f7 = paramzq.h() * 9468.0F / 21600.0F;
      }
      else if (((zar)this.e.l.a.get(0)).b() == 328)
      {
        f2 = paramzq.i() * 0.24851851F;
        f1 = paramzq.h() * 5368.0F / 21600.0F;
        f4 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
        f3 = paramzq.h() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
        f6 = paramzq.i() * 2716.0F / 21600.0F;
        f5 = paramzq.h() * 2716.0F / 21600.0F;
        f8 = paramzq.i() * 9468.0F / 21600.0F;
        f7 = paramzq.h() * 9468.0F / 21600.0F;
      }
      else if (((zar)this.e.l.a.get(0)).b() == 329)
      {
        f2 = paramzq.i() * 0.24851851F;
        f1 = paramzq.h() * 5368.0F / 21600.0F;
        f4 = paramzq.i() * 8048.0F / 21600.0F;
        f3 = paramzq.h() * 8048.0F / 21600.0F;
        f6 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
        f5 = paramzq.h() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
        f8 = paramzq.i() * 9468.0F / 21600.0F;
        f7 = paramzq.h() * 9468.0F / 21600.0F;
      }
      else
      {
        f2 = paramzq.i() * 0.24851851F;
        f1 = paramzq.h() * 5368.0F / 21600.0F;
        f4 = paramzq.i() * 8048.0F / 21600.0F;
        f3 = paramzq.h() * 8048.0F / 21600.0F;
        f6 = paramzq.i() * 2716.0F / 21600.0F;
        f5 = paramzq.h() * 2716.0F / 21600.0F;
        f8 = paramzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
        f7 = paramzq.h() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
      }
      break;
    default: 
      f2 = paramzq.i() * 0.24851851F;
      f1 = paramzq.h() * 5368.0F / 21600.0F;
      f4 = paramzq.i() * 8048.0F / 21600.0F;
      f3 = paramzq.h() * 8048.0F / 21600.0F;
      f6 = paramzq.i() * 2716.0F / 21600.0F;
      f5 = paramzq.h() * 2716.0F / 21600.0F;
      f8 = paramzq.i() * 9468.0F / 21600.0F;
      f7 = paramzq.h() * 9468.0F / 21600.0F;
    }
    arrayOfzo[0] = new zo(paramzq.f(), paramzq.g() + paramzq.i() / 2.0F);
    arrayOfzo[1] = new zo(paramzq.f() + f5, paramzq.g() + f4);
    arrayOfzo[2] = new zo(paramzq.f() + f5, paramzq.g() + f8);
    arrayOfzo[3] = new zo(paramzq.f() + (paramzq.h() - f1 * 2.0F) / 2.0F, paramzq.g() + f8);
    arrayOfzo[4] = new zo(paramzq.f() + (paramzq.h() - f1 * 2.0F) / 2.0F, paramzq.g() + (paramzq.i() - f2 * 2.0F) / 2.0F);
    arrayOfzo[5] = new zo(paramzq.f() + f7, paramzq.g() + (paramzq.i() - f2 * 2.0F) / 2.0F);
    arrayOfzo[6] = new zo(paramzq.f() + f7, paramzq.g() + f6);
    arrayOfzo[7] = new zo(paramzq.f() + f3, paramzq.g() + f6);
    arrayOfzo[8] = new zo(paramzq.f() + paramzq.h() / 2.0F, paramzq.g());
    arrayOfzo[9] = new zo(paramzq.f() + paramzq.h() - f3, paramzq.g() + f6);
    arrayOfzo[10] = new zo(paramzq.f() + paramzq.h() - f7, paramzq.g() + f6);
    arrayOfzo[11] = new zo(paramzq.f() + paramzq.h() - f7, paramzq.g() + (paramzq.i() - f2 * 2.0F) / 2.0F);
    arrayOfzo[12] = new zo(paramzq.f() + (paramzq.h() - (paramzq.h() - f1 * 2.0F) / 2.0F), paramzq.g() + (paramzq.i() - f2 * 2.0F) / 2.0F);
    arrayOfzo[13] = new zo(paramzq.f() + (paramzq.h() - (paramzq.h() - f1 * 2.0F) / 2.0F), paramzq.g() + f8);
    arrayOfzo[14] = new zo(paramzq.f() + paramzq.h() - f5, paramzq.g() + f8);
    arrayOfzo[15] = new zo(paramzq.f() + paramzq.h() - f5, paramzq.g() + f4);
    arrayOfzo[16] = new zo(paramzq.f() + paramzq.h(), paramzq.g() + paramzq.i() / 2.0F);
    arrayOfzo[17] = new zo(paramzq.f() + paramzq.h() - f5, paramzq.g() + paramzq.i() - f4);
    arrayOfzo[18] = new zo(paramzq.f() + paramzq.h() - f5, paramzq.g() + paramzq.i() - f8);
    arrayOfzo[19] = new zo(paramzq.f() + paramzq.h() - (paramzq.h() - f1 * 2.0F) / 2.0F, paramzq.g() + paramzq.i() - f8);
    arrayOfzo[20] = new zo(paramzq.f() + (paramzq.h() - (paramzq.h() - f1 * 2.0F) / 2.0F), paramzq.g() + paramzq.i() - (paramzq.i() - f2 * 2.0F) / 2.0F);
    arrayOfzo[21] = new zo(paramzq.f() + (paramzq.h() - f7), paramzq.g() + paramzq.i() - (paramzq.i() - f2 * 2.0F) / 2.0F);
    arrayOfzo[22] = new zo(paramzq.f() + paramzq.h() - f7, paramzq.g() + paramzq.i() - f6);
    arrayOfzo[23] = new zo(paramzq.f() + paramzq.h() - f3, paramzq.g() + paramzq.i() - f6);
    arrayOfzo[24] = new zo(paramzq.f() + paramzq.h() / 2.0F, paramzq.g() + paramzq.i());
    arrayOfzo[25] = new zo(paramzq.f() + f3, paramzq.g() + paramzq.i() - f6);
    arrayOfzo[26] = new zo(paramzq.f() + f7, paramzq.g() + paramzq.i() - f6);
    arrayOfzo[27] = new zo(paramzq.f() + f7, paramzq.g() + paramzq.i() - (paramzq.i() - f2 * 2.0F) / 2.0F);
    arrayOfzo[28] = new zo(paramzq.f() + (paramzq.h() - f1 * 2.0F) / 2.0F, paramzq.i() - (paramzq.i() - f2 * 2.0F) / 2.0F);
    arrayOfzo[29] = new zo(paramzq.f() + (paramzq.h() - f1 * 2.0F) / 2.0F, paramzq.g() + paramzq.i() - f8);
    arrayOfzo[30] = new zo(paramzq.f() + f5, paramzq.g() + paramzq.i() - f8);
    arrayOfzo[31] = new zo(paramzq.f() + f5, paramzq.g() + paramzq.i() - f4);
    localze.b(arrayOfzo);
    return localze;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbmg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */