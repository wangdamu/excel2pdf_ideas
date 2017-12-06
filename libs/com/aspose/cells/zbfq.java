package com.aspose.cells;

import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;

class zbfq
  extends zcp
{
  zbfq(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  ze a(zq paramzq)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    int i = 0;
    int j = 0;
    int k = 0;
    if (this.e.A().i() != 0)
    {
      i = this.e.A().i();
      j = 1;
    }
    if (this.e.A().l() != 0)
    {
      i = this.e.A().l();
      k = 1;
    }
    ze localze = new ze();
    if (!this.e.A().a())
    {
      zo localzo1 = new zo();
      zo localzo2 = new zo();
      if (this.e.s() <= this.e.A().h())
      {
        switch (i)
        {
        case 3: 
          if (this.e.A().h() <= 1.0F)
          {
            if ((j != 0) && (k != 0))
            {
              localzo1 = new zo(this.e.u() + f1 + paramzq.h() / 2.0F, this.e.v() + f2 + this.e.A().h() * 5.0F);
              localzo2 = new zo(this.e.u() + f1 + paramzq.h() / 2.0F, this.e.v() + f2 + this.e.t() + this.e.A().h() * 5.0F);
            }
            else if ((j != 0) && (k == 0))
            {
              localzo1 = new zo(this.e.u() + f1 + paramzq.h() / 2.0F, this.e.v() + f2 + this.e.A().h() * 5.0F);
              localzo2 = new zo(this.e.u() + f1 + paramzq.h() / 2.0F, this.e.v() + f2 + this.e.t() + this.e.A().h() * 5.0F);
            }
            else
            {
              localzo1 = new zo(this.e.u() + f1 + paramzq.h() / 2.0F, this.e.v() + f2);
              localzo2 = new zo(this.e.u() + f1 + paramzq.h() / 2.0F, this.e.v() + f2 + this.e.t());
            }
          }
          else if ((j != 0) && (k != 0))
          {
            localzo1 = new zo(this.e.u() + f1 + paramzq.h() / 2.0F, this.e.v() + f2 + 1.5F * this.e.A().h() + 1.0F);
            localzo2 = new zo(this.e.u() + f1 + paramzq.h() / 2.0F, this.e.v() + f2 + this.e.t() + 1.5F * this.e.A().h() + 1.0F);
          }
          else if ((j != 0) && (k == 0))
          {
            localzo1 = new zo(this.e.u() + f1 + paramzq.h() / 2.0F, this.e.v() + f2 + 1.5F * this.e.A().h() + 1.0F);
            localzo2 = new zo(this.e.u() + f1 + paramzq.h() / 2.0F, this.e.v() + f2 + this.e.t() + 1.5F * this.e.A().h() + 1.0F);
          }
          else
          {
            localzo1 = new zo(this.e.u() + f1 + paramzq.h() / 2.0F, this.e.v() + f2);
            localzo2 = new zo(this.e.u() + f1 + paramzq.h() / 2.0F, this.e.v() + f2 + this.e.t());
          }
          break;
        case 4: 
          if (this.e.A().h() <= 1.0F)
          {
            if ((j != 0) && (k != 0))
            {
              localzo1 = new zo(this.e.u() + f1 + paramzq.h() / 2.0F, this.e.v() + f2 + this.e.A().h() * 5.0F);
              localzo2 = new zo(this.e.u() + f1 + paramzq.h() / 2.0F, this.e.v() + f2 + this.e.t() + this.e.A().h() * 5.0F);
            }
            else if ((j != 0) && (k == 0))
            {
              localzo1 = new zo(this.e.u() + f1 + paramzq.h() / 2.0F, this.e.v() + f2 + this.e.A().h() * 5.0F);
              localzo2 = new zo(this.e.u() + f1 + paramzq.h() / 2.0F, this.e.v() + f2 + this.e.t() + this.e.A().h() * 5.0F);
            }
            else
            {
              localzo1 = new zo(this.e.u() + f1 + paramzq.h() / 2.0F, this.e.v() + f2);
              localzo2 = new zo(this.e.u() + f1 + paramzq.h() / 2.0F, this.e.v() + f2 + this.e.t());
            }
          }
          else if ((j != 0) && (k != 0))
          {
            localzo1 = new zo(this.e.u() + f1 + paramzq.h() / 2.0F, this.e.v() + f2 + 1.5F * this.e.A().h() + 1.0F);
            localzo2 = new zo(this.e.u() + f1 + paramzq.h() / 2.0F, this.e.v() + f2 + this.e.t() + 1.5F * this.e.A().h() + 1.0F);
          }
          else if ((j != 0) && (k == 0))
          {
            localzo1 = new zo(this.e.u() + f1 + paramzq.h() / 2.0F, this.e.v() + f2 + 1.5F * this.e.A().h() + 1.0F);
            localzo2 = new zo(this.e.u() + f1 + paramzq.h() / 2.0F, this.e.v() + f2 + this.e.t() + 1.5F * this.e.A().h() + 1.0F);
          }
          else
          {
            localzo1 = new zo(this.e.u() + f1 + paramzq.h() / 2.0F, this.e.v() + f2);
            localzo2 = new zo(this.e.u() + f1 + paramzq.h() / 2.0F, this.e.v() + f2 + this.e.t());
          }
          break;
        case 5: 
          if (this.e.A().h() <= 1.0F)
          {
            localzo1 = new zo(this.e.u() + f1 + paramzq.h() / 2.0F, this.e.v() + f2);
            localzo2 = new zo(this.e.u() + f1 + paramzq.h() / 2.0F, this.e.v() + f2 + this.e.t());
          }
          else
          {
            localzo1 = new zo(this.e.u() + f1 + paramzq.h() / 2.0F, this.e.v() + f2 + this.e.A().h() / 2.0F);
            localzo2 = new zo(this.e.u() + f1 + paramzq.h() / 2.0F, this.e.v() + f2 + this.e.t() + this.e.A().h() / 2.0F);
          }
          break;
        default: 
          localzo1 = new zo(this.e.u() + f1 + paramzq.h() / 2.0F, this.e.v() + f2);
          localzo2 = new zo(this.e.u() + f1 + paramzq.h() / 2.0F, this.e.v() + f2 + this.e.t());
        }
        if ((this.e.c == 1) || (this.e.c == 4)) {
          localze.a(localzo1, localzo2);
        } else {
          localze.a(localzo2, localzo1);
        }
      }
      else if (this.e.t() <= this.e.A().h())
      {
        switch (i)
        {
        case 3: 
          if (this.e.A().h() <= 1.0F)
          {
            if ((j != 0) && (k != 0))
            {
              localzo1 = new zo(this.e.u() + f1 + this.e.A().h() * 5.0F, this.e.v() + f2 + paramzq.i() / 2.0F);
              localzo2 = new zo(this.e.u() + f1 + paramzq.h() - this.e.A().h() * 5.0F, this.e.v() + f2 + paramzq.i() / 2.0F);
            }
            else if ((j != 0) && (k == 0))
            {
              localzo1 = new zo(this.e.u() + f1 + this.e.A().h() * 5.0F, this.e.v() + f2 + paramzq.i() / 2.0F);
              localzo2 = new zo(this.e.u() + f1 + paramzq.h() + this.e.A().h() * 5.0F, this.e.v() + f2 + paramzq.i() / 2.0F);
            }
            else
            {
              localzo1 = new zo(this.e.u() + f1, this.e.v() + f2 + paramzq.i() / 2.0F);
              localzo2 = new zo(this.e.u() + f1 + paramzq.h() - 5.0F * this.e.A().h(), this.e.v() + f2 + paramzq.i() / 2.0F);
            }
          }
          else if ((j != 0) && (k != 0))
          {
            localzo1 = new zo(this.e.u() + f1 + 1.5F * this.e.A().h() + 1.0F, this.e.v() + f2 + paramzq.i() / 2.0F);
            localzo2 = new zo(this.e.u() + f1 + paramzq.h() - (1.5F * this.e.A().h() + 1.0F), this.e.v() + f2 + paramzq.i() / 2.0F);
          }
          else if ((j != 0) && (k == 0))
          {
            localzo1 = new zo(this.e.u() + f1 + 1.5F * this.e.A().h() + 1.0F, this.e.v() + f2 + paramzq.i() / 2.0F);
            localzo2 = new zo(this.e.u() + f1 + paramzq.h() + 1.5F * this.e.A().h() + 1.0F, this.e.v() + f2 + paramzq.i() / 2.0F);
          }
          else
          {
            localzo1 = new zo(this.e.u() + f1, this.e.v() + f2 + paramzq.i() / 2.0F);
            localzo2 = new zo(this.e.u() + f1 + paramzq.h(), this.e.v() + f2 + paramzq.i() / 2.0F);
          }
          break;
        case 4: 
          if (this.e.A().h() <= 1.0F)
          {
            if ((j != 0) && (k != 0))
            {
              localzo1 = new zo(this.e.u() + f1 + this.e.A().h() * 5.0F, this.e.v() + f2 + paramzq.i() / 2.0F);
              localzo2 = new zo(this.e.u() + f1 + paramzq.h() - this.e.A().h() * 5.0F, this.e.v() + f2 + paramzq.i() / 2.0F);
            }
            else if ((j != 0) && (k == 0))
            {
              localzo1 = new zo(this.e.u() + f1 + this.e.A().h() * 5.0F, this.e.v() + f2 + paramzq.i() / 2.0F);
              localzo2 = new zo(this.e.u() + f1 + paramzq.h() + this.e.A().h() * 5.0F, this.e.v() + f2 + paramzq.i() / 2.0F);
            }
            else
            {
              localzo1 = new zo(this.e.u() + f1, this.e.v() + f2 + paramzq.i() / 2.0F);
              localzo2 = new zo(this.e.u() + f1 + paramzq.h() - 5.0F * this.e.A().h(), this.e.v() + f2 + paramzq.i() / 2.0F);
            }
          }
          else if ((j != 0) && (k != 0))
          {
            localzo1 = new zo(this.e.u() + f1 + this.e.A().h() * 1.5F + 1.0F, this.e.v() + f2 + paramzq.i() / 2.0F);
            localzo2 = new zo(this.e.u() + f1 + paramzq.h() - (this.e.A().h() * 1.5F + 1.0F), this.e.v() + f2 + paramzq.i() / 2.0F);
          }
          else if ((j != 0) && (k == 0))
          {
            localzo1 = new zo(this.e.u() + f1 + this.e.A().h() * 1.5F + 1.0F, this.e.v() + f2 + paramzq.i() / 2.0F);
            localzo2 = new zo(this.e.u() + f1 + paramzq.h() + this.e.A().h() * 1.5F + 1.0F, this.e.v() + f2 + paramzq.i() / 2.0F);
          }
          else
          {
            localzo1 = new zo(this.e.u() + f1, this.e.v() + f2 + paramzq.i() / 2.0F);
            localzo2 = new zo(this.e.u() + f1 + paramzq.h() - (this.e.A().h() * 1.5F + 1.0F), this.e.v() + f2 + paramzq.i() / 2.0F);
          }
          break;
        case 5: 
          if (this.e.A().h() <= 1.0F)
          {
            localzo1 = new zo(this.e.u() + f1, this.e.v() + f2 + paramzq.i() / 2.0F);
            localzo2 = new zo(this.e.u() + f1 + paramzq.h(), this.e.v() + f2 + paramzq.i() / 2.0F);
          }
          else
          {
            localzo1 = new zo(this.e.u() + f1, this.e.v() + f2 + paramzq.i() / 2.0F);
            localzo2 = new zo(this.e.u() + f1 + paramzq.h() - this.e.A().h() / 2.0F, this.e.v() + f2 + paramzq.i() / 2.0F);
          }
          break;
        default: 
          localzo1 = new zo(this.e.u() + f1, this.e.v() + f2 + paramzq.i() / 2.0F);
          localzo2 = new zo(this.e.u() + f1 + paramzq.h(), this.e.v() + f2 + paramzq.i() / 2.0F);
        }
        if ((this.e.c == 1) || (this.e.c == 2)) {
          localze.a(localzo1, localzo2);
        } else {
          localze.a(localzo2, localzo1);
        }
      }
      else
      {
        zo[] arrayOfzo1 = new zo[4];
        zo[] arrayOfzo2 = new zo[4];
        zo[] arrayOfzo3 = new zo[4];
        zo[] arrayOfzo4 = new zo[4];
        zo[] arrayOfzo5 = new zo[4];
        switch (i)
        {
        case 1: 
          switch (this.e.c)
          {
          case 1: 
            if (this.e.A().h() > 1.0F)
            {
              if (this.e.s() > this.e.t())
              {
                arrayOfzo1[0] = new zo(this.e.u() + f1, this.e.v() + f2);
                arrayOfzo1[3] = new zo(this.e.u() + f1 + paramzq.h(), this.e.v() + f2 + paramzq.i());
              }
              else
              {
                arrayOfzo1[0] = new zo(this.e.u() + f1 + this.e.A().h() / 2.0F, this.e.v() + f2);
                arrayOfzo1[3] = new zo(this.e.u() + f1 + paramzq.h(), this.e.v() + f2 + paramzq.i() - this.e.A().h());
              }
            }
            else if (this.e.s() > this.e.t())
            {
              if ((j != 0) && (k != 0))
              {
                arrayOfzo1[0] = new zo(this.e.u() + f1, this.e.v() + f2 + this.e.A().h() * 4.0F);
                arrayOfzo1[3] = new zo(this.e.u() + f1 + paramzq.h(), this.e.v() + f2 + paramzq.i() - 4.0F * this.e.A().h());
              }
              else if ((j != 0) && (k == 0))
              {
                arrayOfzo1[0] = new zo(this.e.u() + f1, this.e.v() + f2 + this.e.A().h() * 4.0F);
                arrayOfzo1[3] = new zo(this.e.u() + f1 + paramzq.h(), this.e.v() + f2 + paramzq.i() - 1.0F * this.e.A().h());
              }
              else
              {
                arrayOfzo1[0] = new zo(this.e.u() + f1, this.e.v() + f2);
                arrayOfzo1[3] = new zo(this.e.u() + f1 + paramzq.h(), this.e.v() + f2 + paramzq.i() - 4.0F * this.e.A().h());
              }
            }
            else if ((j != 0) && (k != 0))
            {
              arrayOfzo1[0] = new zo(this.e.u() + f1 + 4.0F * this.e.A().h(), this.e.v() + f2);
              arrayOfzo1[3] = new zo(this.e.u() + f1 + paramzq.h() - 4.0F * this.e.A().h(), this.e.v() + f2 + paramzq.i());
            }
            else if ((j != 0) && (k == 0))
            {
              arrayOfzo1[0] = new zo(this.e.u() + f1 + 4.0F * this.e.A().h(), this.e.v() + f2);
              arrayOfzo1[3] = new zo(this.e.u() + f1 + paramzq.h() - 1.0F * this.e.A().h(), this.e.v() + f2 + paramzq.i());
            }
            else
            {
              arrayOfzo1[0] = new zo(this.e.u() + f1, this.e.v() + f2);
              arrayOfzo1[3] = new zo(this.e.u() + f1 + paramzq.h() - 4.0F * this.e.A().h(), this.e.v() + f2 + paramzq.i());
            }
            localze.a(arrayOfzo1[0], arrayOfzo1[3]);
            break;
          case 2: 
            if (this.e.A().h() > 1.0F)
            {
              if (this.e.s() > this.e.t())
              {
                arrayOfzo1[1] = new zo(this.e.u() + f1, paramzq.i() + f2 + this.e.v());
                arrayOfzo1[2] = new zo(paramzq.h() + this.e.u() + f1, this.e.v() + f2);
              }
              else
              {
                arrayOfzo1[1] = new zo(this.e.u() + f1, paramzq.i() + f2 + this.e.v());
                arrayOfzo1[2] = new zo(paramzq.h() + f1 + this.e.u(), this.e.v() + f2);
              }
            }
            else if (this.e.s() > this.e.t())
            {
              if ((j != 0) && (k != 0))
              {
                arrayOfzo1[1] = new zo(this.e.u() + f1, paramzq.i() + f2 + this.e.v() - 4.0F * this.e.A().h());
                arrayOfzo1[2] = new zo(paramzq.h() + f1 + this.e.u(), this.e.v() + f2 + 4.0F * this.e.A().h());
              }
              else if ((j != 0) && (k == 0))
              {
                arrayOfzo1[1] = new zo(this.e.u() + f1, paramzq.i() + f2 + this.e.v() - 4.0F * this.e.A().h());
                arrayOfzo1[2] = new zo(paramzq.h() + f1 + this.e.u(), this.e.v() + f2);
              }
              else
              {
                arrayOfzo1[1] = new zo(this.e.u() + f1 + 1.0F, paramzq.i() + f2 + this.e.v());
                arrayOfzo1[2] = new zo(paramzq.h() + f1 + this.e.u(), this.e.v() + f2 + 4.0F * this.e.A().h());
              }
            }
            else if ((j != 0) && (k != 0))
            {
              arrayOfzo1[1] = new zo(this.e.u() + f1 + 4.0F * this.e.A().h(), paramzq.i() + f2 + this.e.v());
              arrayOfzo1[2] = new zo(paramzq.h() + this.e.u() + f1 - 4.0F * this.e.A().h(), this.e.v() + f2);
            }
            else if ((j != 0) && (k == 0))
            {
              arrayOfzo1[1] = new zo(this.e.u() + f1 + 4.0F * this.e.A().h(), paramzq.i() + f2 + this.e.v());
              arrayOfzo1[2] = new zo(paramzq.h() + f1 + this.e.u(), this.e.v() + f2);
            }
            else
            {
              arrayOfzo1[1] = new zo(this.e.u() + 1.0F + f1, paramzq.i() + f2 + this.e.v());
              arrayOfzo1[2] = new zo(paramzq.h() + f1 + this.e.u() - 4.0F * this.e.A().h(), this.e.v() + f2);
            }
            localze.a(arrayOfzo1[1], arrayOfzo1[2]);
            break;
          case 3: 
            if (this.e.A().h() > 1.0F)
            {
              if (this.e.s() > this.e.t())
              {
                arrayOfzo1[0] = new zo(this.e.u() + f1 + this.e.A().h() / 2.0F, this.e.v() + f2);
                arrayOfzo1[3] = new zo(this.e.u() + f1 + paramzq.h(), this.e.v() + f2 + paramzq.i() - this.e.A().h());
              }
              else
              {
                arrayOfzo1[0] = new zo(this.e.u() + f1 + this.e.A().h() / 2.0F, this.e.v() + f2);
                arrayOfzo1[3] = new zo(this.e.u() + f1 + paramzq.h(), this.e.v() + f2 + paramzq.i() - this.e.A().h());
              }
            }
            else if (this.e.s() > this.e.t())
            {
              if ((j != 0) && (k != 0))
              {
                arrayOfzo1[0] = new zo(this.e.u() + f1, this.e.v() + f2 + 4.0F * this.e.A().h());
                arrayOfzo1[3] = new zo(this.e.u() + f1 + paramzq.h(), this.e.v() + f2 + paramzq.i() - 4.0F * this.e.A().h());
              }
              else if ((j != 0) && (k == 0))
              {
                arrayOfzo1[0] = new zo(this.e.u() + f1, this.e.v() + f2);
                arrayOfzo1[3] = new zo(this.e.u() + f1 + paramzq.h(), this.e.v() + f2 + paramzq.i() - 4.0F * this.e.A().h());
              }
              else
              {
                arrayOfzo1[0] = new zo(this.e.u() + f1, this.e.v() + f2 + 4.0F * this.e.A().h());
                arrayOfzo1[3] = new zo(this.e.u() + f1 + paramzq.h(), this.e.v() + f2 + paramzq.i() - 1.0F);
              }
            }
            else if ((j != 0) && (k != 0))
            {
              arrayOfzo1[0] = new zo(this.e.u() + f1 + this.e.A().h() * 4.0F, this.e.v() + f2);
              arrayOfzo1[3] = new zo(this.e.u() + f1 + paramzq.h() - this.e.A().h() * 4.0F, this.e.v() + f2 + paramzq.i());
            }
            else if ((j != 0) && (k == 0))
            {
              arrayOfzo1[0] = new zo(this.e.u() + f1 + this.e.A().h() * 1.0F, this.e.v() + f2);
              arrayOfzo1[3] = new zo(this.e.u() + f1 + paramzq.h() - this.e.A().h() * 4.0F, this.e.v() + f2 + paramzq.i());
            }
            else
            {
              arrayOfzo1[0] = new zo(this.e.u() + f1 + this.e.A().h() * 4.0F, this.e.v() + f2);
              arrayOfzo1[3] = new zo(this.e.u() + f1 + paramzq.h() - this.e.A().h() * 1.0F, this.e.v() + f2 + paramzq.i());
            }
            localze.a(arrayOfzo1[3], arrayOfzo1[0]);
            break;
          case 4: 
            if (this.e.A().h() > 1.0F)
            {
              if (this.e.s() > this.e.t())
              {
                arrayOfzo1[1] = new zo(this.e.u() + f1, paramzq.i() + f2 + this.e.v());
                arrayOfzo1[2] = new zo(paramzq.h() + f1 + this.e.u(), this.e.v() + f2);
              }
              else
              {
                arrayOfzo1[1] = new zo(this.e.u() + f1, paramzq.i() + f2 + this.e.v());
                arrayOfzo1[2] = new zo(paramzq.h() + f1 + this.e.u(), this.e.v() + f2);
              }
            }
            else if (this.e.s() > this.e.t())
            {
              if ((j != 0) && (k != 0))
              {
                arrayOfzo1[1] = new zo(this.e.u() + f1, paramzq.i() + f2 + this.e.v() - 4.0F * this.e.A().h());
                arrayOfzo1[2] = new zo(paramzq.h() + f1 + this.e.u(), this.e.v() + f2 + 4.0F * this.e.A().h());
              }
              else if ((j != 0) && (k == 0))
              {
                arrayOfzo1[1] = new zo(this.e.u() + f1, paramzq.i() + f2 + this.e.v());
                arrayOfzo1[2] = new zo(paramzq.h() + this.e.u() + f1, this.e.v() + f2 + 4.0F * this.e.A().h());
              }
              else
              {
                arrayOfzo1[1] = new zo(this.e.u() + f1, paramzq.i() + f2 + this.e.v() - 4.0F * this.e.A().h());
                arrayOfzo1[2] = new zo(paramzq.h() + f1 + this.e.u(), this.e.v() + f2);
              }
            }
            else if ((j != 0) && (k != 0))
            {
              arrayOfzo1[1] = new zo(this.e.u() + f1 + 4.0F * this.e.A().h(), paramzq.i() + f2 + this.e.v());
              arrayOfzo1[2] = new zo(paramzq.h() - 4.0F * this.e.A().h() + this.e.u() + f1, this.e.v() + f2);
            }
            else if ((j != 0) && (k == 0))
            {
              arrayOfzo1[1] = new zo(this.e.u() + f1, paramzq.i() + this.e.v() + f2);
              arrayOfzo1[2] = new zo(paramzq.h() - 4.0F * this.e.A().h() + this.e.u() + f1, this.e.v() + f2);
            }
            else
            {
              arrayOfzo1[1] = new zo(this.e.u() + 4.0F * this.e.A().h() + f1, paramzq.i() + this.e.v() + f2);
              arrayOfzo1[2] = new zo(paramzq.h() + this.e.u() + f1, this.e.v() + f2);
            }
            localze.a(arrayOfzo1[2], arrayOfzo1[1]);
          }
          break;
        case 3: 
          switch (this.e.c)
          {
          case 1: 
            if (this.e.A().h() > 1.0F)
            {
              if (this.e.s() > this.e.t())
              {
                arrayOfzo2[0] = new zo(this.e.u() + f1 + this.e.A().h() / 2.0F, this.e.v() + f2 + this.e.A().h() / 2.0F);
                arrayOfzo2[3] = new zo(this.e.u() + f1 + paramzq.h(), this.e.v() + this.e.t() + f2);
              }
              else
              {
                arrayOfzo2[0] = new zo(this.e.u() + f1 + this.e.A().h() / 2.0F, this.e.v() + f2 + this.e.A().h() / 2.0F);
                arrayOfzo2[3] = new zo(this.e.u() + f1 + paramzq.h(), this.e.v() + f2 + this.e.t());
              }
            }
            else if (this.e.s() > this.e.t())
            {
              arrayOfzo2[0] = new zo(this.e.u() + f1 + this.e.A().h() * 4.0F, this.e.v() + f2 + 4.0F * this.e.A().h());
              arrayOfzo2[3] = new zo(this.e.u() + f1 + paramzq.h() - 4.0F * this.e.A().h(), this.e.v() + f2 + this.e.t() + 4.0F * this.e.A().h());
            }
            else
            {
              arrayOfzo2[0] = new zo(this.e.u() + f1 + this.e.A().h() * 4.0F, this.e.v() + f2 + this.e.A().h() * 4.0F);
              arrayOfzo2[3] = new zo(this.e.u() + f1 + paramzq.h() - 4.0F * this.e.A().h(), this.e.v() + f2 + this.e.t() + 4.0F * this.e.A().h());
            }
            localze.a(arrayOfzo2[0], arrayOfzo2[3]);
            break;
          case 2: 
            if (this.e.A().h() > 1.0F)
            {
              if (this.e.s() > this.e.t())
              {
                arrayOfzo2[1] = new zo(this.e.u() + f1, paramzq.i() + this.e.v() + f2);
                arrayOfzo2[2] = new zo(paramzq.h() + f1 + this.e.u(), this.e.v() + f2);
              }
              else
              {
                arrayOfzo2[1] = new zo(this.e.u() + f1, paramzq.i() + f2 + this.e.v());
                arrayOfzo2[2] = new zo(paramzq.h() + this.e.u() + f1, this.e.v() + f2);
              }
            }
            else if (this.e.s() > this.e.t())
            {
              arrayOfzo2[1] = new zo(this.e.u() + f1 + 4.0F * this.e.A().h(), paramzq.i() + this.e.v() - 4.0F * this.e.A().h() + f2);
              arrayOfzo2[2] = new zo(paramzq.h() + this.e.u() - 4.0F * this.e.A().h() + f1, this.e.v() + 4.0F * this.e.A().h() + f2);
            }
            else
            {
              arrayOfzo2[1] = new zo(this.e.u() + f1 + 4.0F * this.e.A().h(), paramzq.i() + this.e.v() - 4.0F * this.e.A().h() + f2);
              arrayOfzo2[2] = new zo(paramzq.h() + this.e.u() - 4.0F * this.e.A().h() + f1, this.e.v() + 4.0F * this.e.A().h() + f2);
            }
            localze.a(arrayOfzo2[1], arrayOfzo2[2]);
            break;
          case 3: 
            if (this.e.A().h() > 1.0F)
            {
              if (this.e.s() > this.e.t())
              {
                arrayOfzo2[0] = new zo(this.e.u() + f1 + this.e.A().h() / 2.0F, this.e.v() + f2 + this.e.A().h() / 2.0F);
                arrayOfzo2[3] = new zo(this.e.u() + f1 + paramzq.h(), this.e.v() + f2 + this.e.t());
              }
              else
              {
                arrayOfzo2[0] = new zo(this.e.u() + f1 + this.e.A().h() / 2.0F, this.e.v() + f2 + this.e.A().h() / 2.0F);
                arrayOfzo2[3] = new zo(this.e.u() + f1 + paramzq.h(), this.e.v() + f2 + this.e.t());
              }
            }
            else if (this.e.s() > this.e.t())
            {
              arrayOfzo2[0] = new zo(this.e.u() + f1 + this.e.A().h() * 4.0F, this.e.v() + f2 + this.e.A().h() * 4.0F);
              arrayOfzo2[3] = new zo(this.e.u() + f1 + paramzq.h() - this.e.A().h() * 4.0F, this.e.v() + f2 + this.e.t() + 4.0F * this.e.A().h());
            }
            else
            {
              arrayOfzo2[0] = new zo(this.e.u() + f1 + this.e.A().h() * 4.0F, this.e.v() + f2 + this.e.A().h() * 4.0F);
              arrayOfzo2[3] = new zo(this.e.u() + f1 + paramzq.h() - this.e.A().h() * 4.0F, this.e.v() + f2 + this.e.t() + 4.0F * this.e.A().h());
            }
            localze.a(arrayOfzo2[3], arrayOfzo2[0]);
            break;
          case 4: 
            if (this.e.A().h() > 1.0F)
            {
              if (this.e.s() > this.e.t())
              {
                arrayOfzo2[1] = new zo(this.e.u() + f1, paramzq.i() + this.e.v() + f2);
                arrayOfzo2[2] = new zo(paramzq.h() + this.e.u() + f1, this.e.v() + f2);
              }
              else
              {
                arrayOfzo2[1] = new zo(this.e.u() + f1, paramzq.i() + this.e.v() + f2);
                arrayOfzo2[2] = new zo(paramzq.h() + this.e.u() + f1, this.e.v() + f2);
              }
            }
            else if (this.e.s() > this.e.t())
            {
              arrayOfzo2[1] = new zo(this.e.u() + f1 + 4.0F * this.e.A().h(), paramzq.i() + this.e.v() + f2 - 4.0F * this.e.A().h());
              arrayOfzo2[2] = new zo(paramzq.h() + this.e.u() + f1 - 4.0F * this.e.A().h(), this.e.v() + f2 + 4.0F * this.e.A().h());
            }
            else
            {
              arrayOfzo2[1] = new zo(this.e.u() + f1 + 4.0F * this.e.A().h(), paramzq.i() + this.e.v() + f2 - 4.0F * this.e.A().h());
              arrayOfzo2[2] = new zo(paramzq.h() + this.e.u() + f1 - 4.0F * this.e.A().h(), this.e.v() + f2 + 4.0F * this.e.A().h());
            }
            localze.a(arrayOfzo2[2], arrayOfzo2[1]);
          }
          break;
        case 5: 
          switch (this.e.c)
          {
          case 1: 
            if (this.e.A().h() > 1.0F)
            {
              if (this.e.s() > this.e.t())
              {
                arrayOfzo3[0] = new zo(this.e.u() + f1 + this.e.A().h() / 2.0F, this.e.v() + f2 + this.e.A().h() / 2.0F);
                arrayOfzo3[3] = new zo(this.e.u() + f1 + paramzq.h() - this.e.A().h() / 2.0F, this.e.v() + f2 + paramzq.i() - this.e.A().h() / 2.0F);
              }
              else
              {
                arrayOfzo3[0] = new zo(this.e.u() + f1 + this.e.A().h() / 2.0F, this.e.v() + f2 + this.e.A().h() / 2.0F);
                arrayOfzo3[3] = new zo(this.e.u() + f1 + paramzq.h() - this.e.A().h() / 2.0F, this.e.v() + f2 + paramzq.i() - this.e.A().h() / 2.0F);
              }
            }
            else if (this.e.s() > this.e.t())
            {
              arrayOfzo3[0] = new zo(this.e.u() + f1, this.e.v() + f2 + this.e.A().h() * 4.0F);
              arrayOfzo3[3] = new zo(this.e.u() + f1 + paramzq.h(), this.e.v() + f2 + paramzq.i() - this.e.A().h() * 4.0F);
            }
            else
            {
              arrayOfzo3[0] = new zo(this.e.u() + f1 + this.e.A().h() * 4.0F, this.e.v() + f2);
              arrayOfzo3[3] = new zo(this.e.u() + f1 + paramzq.h() - this.e.A().h() * 4.0F, this.e.v() + f2 + paramzq.i());
            }
            localze.a(arrayOfzo3[0], arrayOfzo3[3]);
            break;
          case 2: 
            if (this.e.A().h() > 1.0F)
            {
              if (this.e.s() > this.e.t())
              {
                arrayOfzo3[1] = new zo(this.e.u() + f1, paramzq.i() + this.e.v() + f2);
                arrayOfzo3[2] = new zo(paramzq.h() + this.e.u() + f1, this.e.v() + f2);
              }
              else
              {
                arrayOfzo3[1] = new zo(this.e.u() + f1, paramzq.i() + this.e.v() + f2);
                arrayOfzo3[2] = new zo(paramzq.h() + this.e.u() + f1, this.e.v() + f2);
              }
            }
            else if (this.e.s() > this.e.t())
            {
              arrayOfzo3[1] = new zo(this.e.u() + f1, paramzq.i() + this.e.v() + f2 - this.e.A().h() * 4.0F);
              arrayOfzo3[2] = new zo(paramzq.h() + this.e.u() + f1, this.e.v() + f2 + 4.0F * this.e.A().h());
            }
            else
            {
              arrayOfzo3[1] = new zo(this.e.u() + f1 + 4.0F * this.e.A().h(), paramzq.i() + this.e.v() + f2);
              arrayOfzo3[2] = new zo(paramzq.h() + this.e.u() + f1 - 4.0F * this.e.A().h(), this.e.v() + f2);
            }
            localze.a(arrayOfzo3[1], arrayOfzo3[2]);
            break;
          case 3: 
            if (this.e.A().h() > 1.0F)
            {
              if (this.e.s() > this.e.t())
              {
                arrayOfzo3[0] = new zo(this.e.u() + f1 + this.e.A().h() / 2.0F, this.e.v() + f2 + this.e.A().h() / 2.0F);
                arrayOfzo3[3] = new zo(this.e.u() + f1 + paramzq.h() - this.e.A().h() / 2.0F, this.e.v() + f2 + paramzq.i() - this.e.A().h() / 2.0F);
              }
              else
              {
                arrayOfzo3[0] = new zo(this.e.u() + f1 + this.e.A().h() / 2.0F, this.e.v() + f2 + this.e.A().h() / 2.0F);
                arrayOfzo3[3] = new zo(this.e.u() + f1 + paramzq.h() - this.e.A().h() / 2.0F, this.e.v() + f2 + paramzq.i() - this.e.A().h() / 2.0F);
              }
            }
            else if (this.e.s() > this.e.t())
            {
              arrayOfzo3[0] = new zo(this.e.u() + f1, this.e.v() + f2 + this.e.A().h() * 4.0F);
              arrayOfzo3[3] = new zo(this.e.u() + f1 + paramzq.h(), this.e.v() + f2 + paramzq.i() - this.e.A().h() * 4.0F);
            }
            else
            {
              arrayOfzo3[0] = new zo(this.e.u() + f1 + this.e.A().h() * 4.0F, this.e.v() + f2);
              arrayOfzo3[3] = new zo(this.e.u() + f1 + paramzq.h() - this.e.A().h() * 4.0F, this.e.v() + f2 + paramzq.i());
            }
            localze.a(arrayOfzo3[3], arrayOfzo3[0]);
            break;
          case 4: 
            if (this.e.A().h() > 1.0F)
            {
              if (this.e.s() > this.e.t())
              {
                arrayOfzo3[1] = new zo(this.e.u() + f1, paramzq.i() + this.e.v() + f2 - this.e.A().h() * 4.0F);
                arrayOfzo3[2] = new zo(paramzq.h() + this.e.u() + f1, this.e.v() + f2);
              }
              else
              {
                arrayOfzo3[1] = new zo(this.e.u() + f1, paramzq.i() + this.e.v() + f2);
                arrayOfzo3[2] = new zo(paramzq.h() + this.e.u() + f1, this.e.v() + f2);
              }
            }
            else if (this.e.s() > this.e.t())
            {
              arrayOfzo3[1] = new zo(this.e.u() + f1, paramzq.i() + this.e.v() + f2 - this.e.A().h() * 4.0F);
              arrayOfzo3[2] = new zo(paramzq.h() + this.e.u() + f1, this.e.v() + f2 + this.e.A().h() * 4.0F);
            }
            else
            {
              arrayOfzo3[1] = new zo(this.e.u() + f1 + this.e.A().h() * 4.0F, paramzq.i() + f2 + this.e.v());
              arrayOfzo3[2] = new zo(paramzq.h() + this.e.u() + f1 - this.e.A().h() * 4.0F, this.e.v() + f2);
            }
            localze.a(arrayOfzo3[2], arrayOfzo3[1]);
          }
          break;
        case 4: 
          switch (this.e.c)
          {
          case 1: 
            if (this.e.A().h() > 1.0F)
            {
              if (this.e.s() > this.e.t())
              {
                arrayOfzo4[0] = new zo(this.e.u() + f1 + this.e.A().h() / 2.0F, this.e.v() + f2 + this.e.A().h() / 2.0F);
                arrayOfzo4[3] = new zo(this.e.u() + f1 + paramzq.h() - 1.5F * this.e.A().h() - 1.0F, this.e.v() + f2 + paramzq.i() - 1.5F * this.e.A().h() - 1.0F);
              }
              else
              {
                arrayOfzo4[0] = new zo(this.e.u() + f1 + this.e.A().h() / 2.0F, this.e.v() + f2 + this.e.A().h() / 2.0F);
                arrayOfzo4[3] = new zo(this.e.u() + f1 + paramzq.h() - 1.5F * this.e.A().h() - 1.0F, this.e.v() + f2 + paramzq.i() - 1.5F * this.e.A().h() - 1.0F);
              }
            }
            else if (this.e.s() > this.e.t())
            {
              arrayOfzo4[0] = new zo(this.e.u() + f1 + 5.0F * this.e.A().h(), this.e.v() + f2 + 5.0F * this.e.A().h());
              arrayOfzo4[3] = new zo(this.e.u() + f1 + paramzq.h() - 5.0F * this.e.A().h(), this.e.v() + f2 + paramzq.i() - 5.0F * this.e.A().h());
            }
            else
            {
              arrayOfzo4[0] = new zo(this.e.u() + f1 + 5.0F * this.e.A().h(), this.e.v() + f2 + 5.0F * this.e.A().h());
              arrayOfzo4[3] = new zo(this.e.u() + f1 + paramzq.h() - 5.0F * this.e.A().h(), this.e.v() + f2 + paramzq.i() - 5.0F * this.e.A().h());
            }
            localze.a(arrayOfzo4[0], arrayOfzo4[3]);
            break;
          case 2: 
            if (this.e.A().h() > 1.0F)
            {
              if (this.e.s() > this.e.t())
              {
                arrayOfzo4[1] = new zo(this.e.u() + f1, paramzq.i() + this.e.v() + f2);
                arrayOfzo4[2] = new zo(paramzq.h() + f1 + this.e.u(), this.e.v() + f2);
              }
              else
              {
                arrayOfzo4[1] = new zo(this.e.u() + f1, paramzq.i() + f2 + this.e.v());
                arrayOfzo4[2] = new zo(paramzq.h() + f1 + this.e.u(), this.e.v() + f2);
              }
            }
            else if (this.e.s() > this.e.t())
            {
              arrayOfzo4[1] = new zo(this.e.u() + f1 + 5.0F * this.e.A().h(), paramzq.i() + this.e.v() + f2 - 5.0F * this.e.A().h());
              arrayOfzo4[2] = new zo(paramzq.h() + f1 + this.e.u() - 5.0F * this.e.A().h(), this.e.v() + f2 + 5.0F * this.e.A().h());
            }
            else
            {
              arrayOfzo4[1] = new zo(this.e.u() + f1 + 5.0F * this.e.A().h(), paramzq.i() + f2 + this.e.v() - 5.0F * this.e.A().h());
              arrayOfzo4[2] = new zo(paramzq.h() + f1 + this.e.u() - 5.0F * this.e.A().h(), this.e.v() + f2 + 5.0F * this.e.A().h());
            }
            localze.a(arrayOfzo4[1], arrayOfzo4[2]);
            break;
          case 3: 
            if (this.e.A().h() > 1.0F)
            {
              if (this.e.s() > this.e.t())
              {
                arrayOfzo4[0] = new zo(this.e.u() + f1 + this.e.A().h() / 2.0F, this.e.v() + f2 + this.e.A().h() / 2.0F);
                arrayOfzo4[3] = new zo(this.e.u() + f1 + paramzq.h() - 1.5F * this.e.A().h() - 1.0F, this.e.v() + f2 + paramzq.i() - 1.5F * this.e.A().h() - 1.0F);
              }
              else
              {
                arrayOfzo4[0] = new zo(this.e.u() + f1 + this.e.A().h() / 2.0F, this.e.v() + f2 + this.e.A().h() / 2.0F);
                arrayOfzo4[3] = new zo(this.e.u() + f1 + paramzq.h() - 1.5F * this.e.A().h() - 1.0F, this.e.v() + f2 + paramzq.i() - 1.5F * this.e.A().h() - 1.0F);
              }
            }
            else if (this.e.s() > this.e.t())
            {
              arrayOfzo4[0] = new zo(this.e.u() + f1 + this.e.A().h() * 5.0F, this.e.v() + f2 + this.e.A().h() * 5.0F);
              arrayOfzo4[3] = new zo(this.e.u() + f1 + paramzq.h() - this.e.A().h() * 5.0F, this.e.v() + f2 + paramzq.i() - this.e.A().h() * 5.0F);
            }
            else
            {
              arrayOfzo4[0] = new zo(this.e.u() + f1 + this.e.A().h() * 5.0F, this.e.v() + f2 + this.e.A().h() * 5.0F);
              arrayOfzo4[3] = new zo(this.e.u() + f1 + paramzq.h() - this.e.A().h() * 5.0F, this.e.v() + f2 + paramzq.i() - this.e.A().h() * 5.0F);
            }
            localze.a(arrayOfzo4[3], arrayOfzo4[0]);
            break;
          case 4: 
            if (this.e.A().h() > 1.0F)
            {
              if (this.e.s() > this.e.t())
              {
                arrayOfzo4[1] = new zo(this.e.u() + f1, paramzq.i() + f2 + this.e.v());
                arrayOfzo4[2] = new zo(paramzq.h() + f1 + this.e.u(), this.e.v() + f2);
              }
              else
              {
                arrayOfzo4[1] = new zo(this.e.u() + f1, paramzq.i() + f2 + this.e.v());
                arrayOfzo4[2] = new zo(paramzq.h() + f1 + this.e.u(), this.e.v() + f2);
              }
            }
            else if (this.e.s() > this.e.t())
            {
              arrayOfzo4[1] = new zo(this.e.u() + f1 + 5.0F * this.e.A().h(), paramzq.i() + f2 + this.e.v() - 5.0F * this.e.A().h());
              arrayOfzo4[2] = new zo(paramzq.h() + f1 + this.e.u() - 5.0F * this.e.A().h(), this.e.v() + f2 + 5.0F * this.e.A().h());
            }
            else
            {
              arrayOfzo4[1] = new zo(this.e.u() + f1 + 5.0F * this.e.A().h(), paramzq.i() + f2 + this.e.v() - 5.0F * this.e.A().h());
              arrayOfzo4[2] = new zo(paramzq.h() + f1 + this.e.u() - 5.0F * this.e.A().h(), this.e.v() + f2 + 5.0F * this.e.A().h());
            }
            localze.a(arrayOfzo4[2], arrayOfzo4[1]);
          }
          break;
        case 2: 
          switch (this.e.c)
          {
          case 1: 
            if (this.e.A().h() > 1.0F)
            {
              if (this.e.s() > this.e.t())
              {
                arrayOfzo5[0] = new zo(this.e.u() + f1 + this.e.A().h() / 2.0F, this.e.v() + f2 + this.e.A().h() / 2.0F);
                arrayOfzo5[3] = new zo(this.e.u() + f1 + paramzq.h(), this.e.v() + f2 + paramzq.i());
              }
              else
              {
                arrayOfzo5[0] = new zo(this.e.u() + f1 + this.e.A().h() / 2.0F, this.e.v() + f2 + this.e.A().h() / 2.0F);
                arrayOfzo5[3] = new zo(this.e.u() + f1 + paramzq.h(), this.e.v() + f2 + paramzq.i());
              }
            }
            else if (this.e.s() > this.e.t())
            {
              arrayOfzo5[0] = new zo(this.e.u() + f1, this.e.v() + f2 + this.e.A().h() * 4.0F);
              arrayOfzo5[3] = new zo(this.e.u() + f1 + paramzq.h(), this.e.v() + f2 + paramzq.i() - 4.0F * this.e.A().h());
            }
            else
            {
              arrayOfzo5[0] = new zo(this.e.u() + f1 + this.e.A().h() * 4.0F, this.e.v() + f2);
              arrayOfzo5[3] = new zo(this.e.u() + f1 + paramzq.h() - this.e.A().h() * 4.0F, this.e.v() + f2 + paramzq.i());
            }
            localze.a(arrayOfzo5[0], arrayOfzo5[3]);
            break;
          case 2: 
            if (this.e.A().h() > 1.0F)
            {
              if (this.e.s() > this.e.t())
              {
                arrayOfzo5[1] = new zo(this.e.u() + f1, paramzq.i() + f2 + this.e.v());
                arrayOfzo5[2] = new zo(paramzq.h() + f1 + this.e.u(), this.e.v() + f2);
              }
              else
              {
                arrayOfzo5[1] = new zo(this.e.u() + f1, paramzq.i() + f2 + this.e.v());
                arrayOfzo5[2] = new zo(paramzq.h() + f1 + this.e.u(), this.e.v() + f2);
              }
            }
            else if (this.e.s() > this.e.t())
            {
              arrayOfzo5[1] = new zo(this.e.u() + f1, paramzq.i() + this.e.v() + f2 - this.e.A().h() * 4.0F);
              arrayOfzo5[2] = new zo(paramzq.h() + this.e.u() + f1, this.e.v() + f2 + 4.0F * this.e.A().h());
            }
            else
            {
              arrayOfzo5[1] = new zo(this.e.u() + f1 + this.e.A().h() * 4.0F, paramzq.i() + f2 + this.e.v());
              arrayOfzo5[2] = new zo(paramzq.h() + this.e.u() + f1 - this.e.A().h() * 4.0F, this.e.v() + f2);
            }
            localze.a(arrayOfzo5[1], arrayOfzo5[2]);
            break;
          case 3: 
            if (this.e.A().h() > 1.0F)
            {
              if (this.e.s() > this.e.t())
              {
                arrayOfzo5[0] = new zo(this.e.u() + f1 + this.e.A().h() / 2.0F, this.e.v() + f2 + this.e.A().h() / 2.0F);
                arrayOfzo5[3] = new zo(this.e.u() + f1 + paramzq.h(), this.e.v() + f2 + paramzq.i());
              }
              else
              {
                arrayOfzo5[0] = new zo(this.e.u() + f1 + this.e.A().h() / 2.0F, this.e.v() + f2 + this.e.A().h() / 2.0F);
                arrayOfzo5[3] = new zo(this.e.u() + f1 + paramzq.h(), this.e.v() + f2 + paramzq.i());
              }
            }
            else if (this.e.s() > this.e.t())
            {
              arrayOfzo5[0] = new zo(this.e.u() + f1, this.e.v() + f2 + this.e.A().h() * 4.0F);
              arrayOfzo5[3] = new zo(this.e.u() + f1 + paramzq.h(), this.e.v() + f2 + paramzq.i() - this.e.A().h() * 4.0F);
            }
            else
            {
              arrayOfzo5[0] = new zo(this.e.u() + f1 + this.e.A().h() * 4.0F, this.e.v() + f2);
              arrayOfzo5[3] = new zo(this.e.u() + f1 + paramzq.h() - this.e.A().h() * 4.0F, this.e.v() + f2 + paramzq.i());
            }
            localze.a(arrayOfzo5[3], arrayOfzo5[0]);
            break;
          case 4: 
            if (this.e.A().h() > 1.0F)
            {
              if (this.e.s() > this.e.t())
              {
                arrayOfzo5[1] = new zo(this.e.u() + f1, paramzq.i() + f2 + this.e.v());
                arrayOfzo5[2] = new zo(paramzq.h() + this.e.u() + f1, this.e.v() + f2);
              }
              else
              {
                arrayOfzo5[1] = new zo(this.e.u() + f1, paramzq.i() + this.e.v() + f2);
                arrayOfzo5[2] = new zo(paramzq.h() + this.e.u() + f1, this.e.v() + f2);
              }
            }
            else if (this.e.s() > this.e.t())
            {
              arrayOfzo5[1] = new zo(this.e.u() + f1, paramzq.i() + this.e.v() + f2 - 4.0F * this.e.A().h());
              arrayOfzo5[2] = new zo(paramzq.h() + this.e.u() + f1, this.e.v() + f2 + 4.0F * this.e.A().h());
            }
            else
            {
              arrayOfzo5[1] = new zo(this.e.u() + f1 + 4.0F * this.e.A().h(), paramzq.i() + this.e.v() + f2);
              arrayOfzo5[2] = new zo(paramzq.h() + this.e.u() + f1 - 4.0F * this.e.A().h(), this.e.v() + f2);
            }
            localze.a(arrayOfzo5[2], arrayOfzo5[1]);
          }
          break;
        default: 
          switch (this.e.c)
          {
          case 1: 
            if (this.e.A().h() > 1.0F)
            {
              if (this.e.s() > this.e.t())
              {
                arrayOfzo1[0] = new zo(this.e.u() + f1, this.e.v() + f2);
                arrayOfzo1[3] = new zo(this.e.u() + f1 + paramzq.h(), this.e.v() + f2 + paramzq.i());
              }
              else
              {
                arrayOfzo1[0] = new zo(this.e.u() + f1 + this.e.A().h() / 2.0F, this.e.v() + f2);
                arrayOfzo1[3] = new zo(this.e.u() + f1 + paramzq.h(), this.e.v() + f2 + paramzq.i() - this.e.A().h());
              }
            }
            else if (this.e.s() > this.e.t())
            {
              if ((j != 0) && (k != 0))
              {
                arrayOfzo1[0] = new zo(this.e.u() + f1, this.e.v() + f2 + this.e.A().h() * 4.0F);
                arrayOfzo1[3] = new zo(this.e.u() + f1 + paramzq.h(), this.e.v() + f2 + paramzq.i() - 4.0F * this.e.A().h());
              }
              else if ((j != 0) && (k == 0))
              {
                arrayOfzo1[0] = new zo(this.e.u() + f1, this.e.v() + f2 + this.e.A().h() * 4.0F);
                arrayOfzo1[3] = new zo(this.e.u() + f1 + paramzq.h(), this.e.v() + f2 + paramzq.i() - 1.0F * this.e.A().h());
              }
              else
              {
                arrayOfzo1[0] = new zo(this.e.u() + f1, this.e.v() + f2);
                arrayOfzo1[3] = new zo(this.e.u() + f1 + paramzq.h(), this.e.v() + f2 + paramzq.i() - 4.0F * this.e.A().h());
              }
            }
            else if ((j != 0) && (k != 0))
            {
              arrayOfzo1[0] = new zo(this.e.u() + f1 + 4.0F * this.e.A().h(), this.e.v() + f2);
              arrayOfzo1[3] = new zo(this.e.u() + f1 + paramzq.h() - 4.0F * this.e.A().h(), this.e.v() + f2 + paramzq.i());
            }
            else if ((j != 0) && (k == 0))
            {
              arrayOfzo1[0] = new zo(this.e.u() + f1 + 4.0F * this.e.A().h(), this.e.v() + f2);
              arrayOfzo1[3] = new zo(this.e.u() + f1 + paramzq.h() - 1.0F * this.e.A().h(), this.e.v() + f2 + paramzq.i());
            }
            else
            {
              arrayOfzo1[0] = new zo(this.e.u() + f1, this.e.v() + f2);
              arrayOfzo1[3] = new zo(this.e.u() + f1 + paramzq.h() - 4.0F * this.e.A().h(), this.e.v() + f2 + paramzq.i());
            }
            localze.a(arrayOfzo1[0], arrayOfzo1[3]);
            break;
          case 2: 
            if (this.e.A().h() > 1.0F)
            {
              if (this.e.s() > this.e.t())
              {
                arrayOfzo1[1] = new zo(this.e.u() + f1, paramzq.i() + f2 + this.e.v());
                arrayOfzo1[2] = new zo(paramzq.h() + this.e.u() + f1, this.e.v() + f2);
              }
              else
              {
                arrayOfzo1[1] = new zo(this.e.u() + f1, paramzq.i() + f2 + this.e.v());
                arrayOfzo1[2] = new zo(paramzq.h() + f1 + this.e.u(), this.e.v() + f2);
              }
            }
            else if (this.e.s() > this.e.t())
            {
              if ((j != 0) && (k != 0))
              {
                arrayOfzo1[1] = new zo(this.e.u() + f1, paramzq.i() + f2 + this.e.v() - 4.0F * this.e.A().h());
                arrayOfzo1[2] = new zo(paramzq.h() + f1 + this.e.u(), this.e.v() + f2 + 4.0F * this.e.A().h());
              }
              else if ((j != 0) && (k == 0))
              {
                arrayOfzo1[1] = new zo(this.e.u() + f1, paramzq.i() + f2 + this.e.v() - 4.0F * this.e.A().h());
                arrayOfzo1[2] = new zo(paramzq.h() + f1 + this.e.u(), this.e.v() + f2);
              }
              else
              {
                arrayOfzo1[1] = new zo(this.e.u() + f1 + 1.0F, paramzq.i() + f2 + this.e.v());
                arrayOfzo1[2] = new zo(paramzq.h() + f1 + this.e.u(), this.e.v() + f2 + 4.0F * this.e.A().h());
              }
            }
            else if ((j != 0) && (k != 0))
            {
              arrayOfzo1[1] = new zo(this.e.u() + f1 + 4.0F * this.e.A().h(), paramzq.i() + f2 + this.e.v());
              arrayOfzo1[2] = new zo(paramzq.h() + this.e.u() + f1 - 4.0F * this.e.A().h(), this.e.v() + f2);
            }
            else if ((j != 0) && (k == 0))
            {
              arrayOfzo1[1] = new zo(this.e.u() + f1 + 4.0F * this.e.A().h(), paramzq.i() + f2 + this.e.v());
              arrayOfzo1[2] = new zo(paramzq.h() + f1 + this.e.u(), this.e.v() + f2);
            }
            else
            {
              arrayOfzo1[1] = new zo(this.e.u() + 1.0F + f1, paramzq.i() + f2 + this.e.v());
              arrayOfzo1[2] = new zo(paramzq.h() + f1 + this.e.u() - 4.0F * this.e.A().h(), this.e.v() + f2);
            }
            localze.a(arrayOfzo1[1], arrayOfzo1[2]);
            break;
          case 3: 
            if (this.e.A().h() > 1.0F)
            {
              if (this.e.s() > this.e.t())
              {
                arrayOfzo1[0] = new zo(this.e.u() + f1 + this.e.A().h() / 2.0F, this.e.v() + f2);
                arrayOfzo1[3] = new zo(this.e.u() + f1 + paramzq.h(), this.e.v() + f2 + paramzq.i() - this.e.A().h());
              }
              else
              {
                arrayOfzo1[0] = new zo(this.e.u() + f1 + this.e.A().h() / 2.0F, this.e.v() + f2);
                arrayOfzo1[3] = new zo(this.e.u() + f1 + paramzq.h(), this.e.v() + f2 + paramzq.i() - this.e.A().h());
              }
            }
            else if (this.e.s() > this.e.t())
            {
              if ((j != 0) && (k != 0))
              {
                arrayOfzo1[0] = new zo(this.e.u() + f1, this.e.v() + f2 + 4.0F * this.e.A().h());
                arrayOfzo1[3] = new zo(this.e.u() + f1 + paramzq.h(), this.e.v() + f2 + paramzq.i() - 4.0F * this.e.A().h());
              }
              else if ((j != 0) && (k == 0))
              {
                arrayOfzo1[0] = new zo(this.e.u() + f1, this.e.v() + f2);
                arrayOfzo1[3] = new zo(this.e.u() + f1 + paramzq.h(), this.e.v() + f2 + paramzq.i() - 4.0F * this.e.A().h());
              }
              else
              {
                arrayOfzo1[0] = new zo(this.e.u() + f1, this.e.v() + f2 + 4.0F * this.e.A().h());
                arrayOfzo1[3] = new zo(this.e.u() + f1 + paramzq.h(), this.e.v() + f2 + paramzq.i() - 1.0F);
              }
            }
            else if ((j != 0) && (k != 0))
            {
              arrayOfzo1[0] = new zo(this.e.u() + f1 + this.e.A().h() * 4.0F, this.e.v() + f2);
              arrayOfzo1[3] = new zo(this.e.u() + f1 + paramzq.h() - this.e.A().h() * 4.0F, this.e.v() + f2 + paramzq.i());
            }
            else if ((j != 0) && (k == 0))
            {
              arrayOfzo1[0] = new zo(this.e.u() + f1 + this.e.A().h() * 1.0F, this.e.v() + f2);
              arrayOfzo1[3] = new zo(this.e.u() + f1 + paramzq.h() - this.e.A().h() * 4.0F, this.e.v() + f2 + paramzq.i());
            }
            else
            {
              arrayOfzo1[0] = new zo(this.e.u() + f1 + this.e.A().h() * 4.0F, this.e.v() + f2);
              arrayOfzo1[3] = new zo(this.e.u() + f1 + paramzq.h() - this.e.A().h() * 1.0F, this.e.v() + f2 + paramzq.i());
            }
            localze.a(arrayOfzo1[3], arrayOfzo1[0]);
            break;
          case 4: 
            if (this.e.A().h() > 1.0F)
            {
              if (this.e.s() > this.e.t())
              {
                arrayOfzo1[1] = new zo(this.e.u() + f1, paramzq.i() + f2 + this.e.v());
                arrayOfzo1[2] = new zo(paramzq.h() + f1 + this.e.u(), this.e.v() + f2);
              }
              else
              {
                arrayOfzo1[1] = new zo(this.e.u() + f1, paramzq.i() + f2 + this.e.v());
                arrayOfzo1[2] = new zo(paramzq.h() + f1 + this.e.u(), this.e.v() + f2);
              }
            }
            else if (this.e.s() > this.e.t())
            {
              if ((j != 0) && (k != 0))
              {
                arrayOfzo1[1] = new zo(this.e.u() + f1, paramzq.i() + f2 + this.e.v() - 4.0F * this.e.A().h());
                arrayOfzo1[2] = new zo(paramzq.h() + f1 + this.e.u(), this.e.v() + f2 + 4.0F * this.e.A().h());
              }
              else if ((j != 0) && (k == 0))
              {
                arrayOfzo1[1] = new zo(this.e.u() + f1, paramzq.i() + f2 + this.e.v());
                arrayOfzo1[2] = new zo(paramzq.h() + this.e.u() + f1, this.e.v() + f2 + 4.0F * this.e.A().h());
              }
              else
              {
                arrayOfzo1[1] = new zo(this.e.u() + f1, paramzq.i() + f2 + this.e.v() - 4.0F * this.e.A().h());
                arrayOfzo1[2] = new zo(paramzq.h() + f1 + this.e.u(), this.e.v() + f2);
              }
            }
            else if ((j != 0) && (k != 0))
            {
              arrayOfzo1[1] = new zo(this.e.u() + f1 + 4.0F * this.e.A().h(), paramzq.i() + f2 + this.e.v());
              arrayOfzo1[2] = new zo(paramzq.h() - 4.0F * this.e.A().h() + this.e.u() + f1, this.e.v() + f2);
            }
            else if ((j != 0) && (k == 0))
            {
              arrayOfzo1[1] = new zo(this.e.u() + f1, paramzq.i() + this.e.v() + f2);
              arrayOfzo1[2] = new zo(paramzq.h() - 4.0F * this.e.A().h() + this.e.u() + f1, this.e.v() + f2);
            }
            else
            {
              arrayOfzo1[1] = new zo(this.e.u() + 4.0F * this.e.A().h() + f1, paramzq.i() + this.e.v() + f2);
              arrayOfzo1[2] = new zo(paramzq.h() + this.e.u() + f1, this.e.v() + f2);
            }
            localze.a(arrayOfzo1[2], arrayOfzo1[1]);
          }
          break;
        }
      }
    }
    return localze;
  }
  
  void b()
  {
    zf localzf = this.a.d();
    this.a.a(4, true);
    if (!this.e.A().a()) {
      a(this.a, this.c, this.d, this.e.W().h(), this.e.W().i());
    }
    this.a.a(localzf);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbfq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */