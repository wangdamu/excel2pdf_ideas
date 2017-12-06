package com.aspose.cells;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

class zapi
{
  static zapi a = new zapi();
  private String b;
  private String c;
  private int d = 4096;
  private String e = "bed7bfad33014aa0nad6";
  private String f = "71ba3b3dfaaahcz191db";
  private String g = "https://billing.dynabic.com/v1.1";
  private String h = "Aspose";
  private long i = -1L;
  private int j = 0;
  private Object k = new Object();
  private final long l = 86400000L;
  private final int m = 10;
  
  static zapi a()
  {
    return a;
  }
  
  public zapi()
  {
    if (zapj.a)
    {
      this.e = "5eb599fc6ab6450c9c6d";
      this.f = "c674d11b10ac49e5aca2";
      this.g = "https://stage-billing-api.dynabic.com/billing1.1";
    }
    else
    {
      this.e = "bed7bfad33014aa0nad6";
      this.f = "71ba3b3dfaaahcz191db";
      this.g = "https://billing.dynabic.com/v1.1";
    }
    if (zapj.b) {
      this.h = "GroupDocs";
    }
  }
  
  boolean a(String paramString1, String paramString2)
  {
    try
    {
      if ((paramString1 == null) || (paramString2 == null) || (paramString1.length() == 0) || (paramString2.length() == 0)) {
        return false;
      }
      List localList = b(paramString1, paramString2);
      if ((localList != null) && (localList.size() == 0)) {}
      boolean bool = a(localList);
      if (bool)
      {
        this.b = paramString1;
        this.c = paramString2;
        this.d = 256;
        a = this;
      }
      return bool;
    }
    catch (Exception localException) {}
    return false;
  }
  
  private boolean a(List<Subscription> paramList)
  {
    boolean bool = false;
    if ((paramList != null) && (paramList.size() > 0))
    {
      String str = ((Subscription)paramList.get(0)).getStatus();
      if (str != null)
      {
        str = str.toLowerCase();
        if ((str.indexOf("active") != -1) || (str.indexOf("trialing") != -1) || (str.indexOf("billnotpaidontimeretrying") != -1)) {
          bool = true;
        }
      }
    }
    return bool;
  }
  
  private List<Subscription> b(String paramString1, String paramString2)
    throws Exception
  {
    zapm localzapm = new zapm(this.e, this.f);
    zapg localzapg = zapg.a(localzapm, this.g, false);
    String str1 = "/subscriptions/site-{siteSubdomain}?status={status}&pageNumber={pageNumber}&pageSize={pageSize}&publicApiKey={publicApiKey}&privateApiKey={privateApiKey}";
    str1 = str1.replace("{format}", "xml").replaceAll("\\*", "");
    String str2 = "GET";
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    str1 = str1.replace("{siteSubdomain}", zapg.b(this.h));
    str1 = str1.replace("{publicApiKey}", zapg.b(paramString1));
    str1 = str1.replace("{privateApiKey}", zapg.b(paramString2));
    str1 = str1.replaceAll("\\{\\w*\\}", "");
    String str3 = localzapg.a(str1, str2, localHashMap1, null, localHashMap2);
    if ((str3 == null) || (str3.length() == 0)) {
      return null;
    }
    try
    {
      StringReader localStringReader = new StringReader(str3);
      localObject = new InputSource(localStringReader);
      DocumentBuilderFactory localDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder localDocumentBuilder = localDocumentBuilderFactory.newDocumentBuilder();
      Document localDocument = localDocumentBuilder.parse((InputSource)localObject);
      Element localElement = localDocument.getDocumentElement();
      ArrayList localArrayList = new ArrayList();
      if (localElement != null)
      {
        NodeList localNodeList = localElement.getChildNodes();
        for (int n = 0; n < localNodeList.getLength(); n++)
        {
          Node localNode = localNodeList.item(n);
          localArrayList.add(a(localNode));
        }
      }
      return localArrayList;
    }
    catch (Exception localException)
    {
      Object localObject = { str3 };
      throw new zapf(1006, (String[])localObject, "Error in converting response json value to java object : " + localException.getMessage(), localException);
    }
  }
  
  static int b()
  {
    int n = (a == null) || (a.d != 256) ? 1 : 0;
    return n != 0 ? 0 : 1;
  }
  
  double c()
    throws Exception
  {
    if ((this.b == null) || (this.c == null)) {
      throw new Exception("You should set metered key firstly.");
    }
    double d1 = 0.0D;
    try
    {
      List localList1 = b(this.b, this.c);
      if ((localList1 != null) && (localList1.size() > 0))
      {
        Subscription localSubscription = (Subscription)localList1.get(0);
        List localList2 = a(localSubscription.getId());
        if ((localList2 != null) && (localList2.size() > 0)) {
          d1 = ((SubscriptionItem)localList2.get(0)).getQuantity().doubleValue();
        }
      }
      else
      {
        throw new Exception("There is no subscription.");
      }
    }
    catch (Exception localException)
    {
      throw localException;
    }
    return d1;
  }
  
  private List<SubscriptionItem> a(Long paramLong)
    throws zapf
  {
    zapm localzapm = new zapm(this.e, this.f);
    zapg localzapg = zapg.a(localzapm, this.g, false);
    String str1 = "/subscriptions/{id}/items";
    str1 = str1.replace("{format}", "xml").replaceAll("\\*", "");
    String str2 = "GET";
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    if (paramLong != null) {
      str1 = str1.replace("{id}", zapg.a(paramLong));
    }
    str1 = str1.replaceAll("\\{\\w*\\}", "");
    String str3 = localzapg.a(str1, str2, localHashMap1, null, localHashMap2);
    if ((str3 == null) || (str3.length() == 0)) {
      return null;
    }
    try
    {
      StringReader localStringReader = new StringReader(str3);
      localObject1 = new InputSource(localStringReader);
      DocumentBuilderFactory localDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder localDocumentBuilder = localDocumentBuilderFactory.newDocumentBuilder();
      Document localDocument = localDocumentBuilder.parse((InputSource)localObject1);
      Element localElement = localDocument.getDocumentElement();
      Object localObject2 = null;
      if (localElement != null) {
        localObject2 = b(localElement);
      } else {
        localObject2 = new ArrayList();
      }
      return (List<SubscriptionItem>)localObject2;
    }
    catch (Exception localException)
    {
      Object localObject1 = { str3 };
      throw new zapf(1006, (String[])localObject1, "Error in converting response json value to java object : " + localException.getMessage(), localException);
    }
  }
  
  void d()
  {
    if ((this.b == null) || (this.c == null)) {
      return;
    }
    int n = 0;
    try
    {
      List localList = b(this.b, this.c);
      if (!a(localList))
      {
        a = new zapi();
        return;
      }
      if ((localList != null) && (localList.size() > 0) && (((Subscription)localList.get(0)).getProduct() != null) && (((Subscription)localList.get(0)).getProduct().getPricing_plans() != null) && (((Subscription)localList.get(0)).getProduct().getPricing_plans().size() > 0) && (((PricingPlan)((Subscription)localList.get(0)).getProduct().getPricing_plans().get(0)).getProduct_items() != null))
      {
        ArrayList localArrayList1 = new ArrayList();
        Iterator localIterator1 = ((PricingPlan)((Subscription)localList.get(0)).getProduct().getPricing_plans().get(0)).getProduct_items().iterator();
        while (localIterator1.hasNext())
        {
          ProductItem localProductItem1 = (ProductItem)localIterator1.next();
          if (localProductItem1.getName().equals("Processed Quantity")) {
            localArrayList1.add(localProductItem1);
          }
        }
        if ((localArrayList1 != null) && (localArrayList1.size() > 0))
        {
          double d1 = zapk.a().b();
          if (d1 > 0.0D)
          {
            ArrayList localArrayList2 = new ArrayList();
            Iterator localIterator2 = localArrayList1.iterator();
            while (localIterator2.hasNext())
            {
              ProductItem localProductItem2 = (ProductItem)localIterator2.next();
              SubscriptionItem localSubscriptionItem = new SubscriptionItem();
              localSubscriptionItem.setProduct_item_id(localProductItem2.getId());
              localSubscriptionItem.setQuantity(Double.valueOf(d1));
              localSubscriptionItem.setSubscription_id(((Subscription)localList.get(0)).getId());
              localSubscriptionItem.setIs_quantity_accumulated(Boolean.valueOf(true));
              localSubscriptionItem.setUnit_name("MB");
              localArrayList2.add(localSubscriptionItem);
            }
            try
            {
              a(((Subscription)localList.get(0)).getId(), localArrayList2);
            }
            catch (Exception localException2)
            {
              zapk.a().a(d1, false);
              n = 1;
            }
          }
        }
      }
    }
    catch (Exception localException1)
    {
      n = 1;
    }
    if (n != 0) {
      synchronized (this.k)
      {
        if (this.i == -1L) {
          this.i = System.currentTimeMillis();
        }
        this.j += 1;
        if ((System.currentTimeMillis() - this.i > 86400000L) && (this.j > 10)) {
          a = new zapi();
        }
      }
    } else {
      synchronized (this.k)
      {
        this.i = -1L;
        this.j = 0;
      }
    }
  }
  
  private void a(Long paramLong, List<SubscriptionItem> paramList)
    throws zapf
  {
    zapm localzapm = new zapm(this.e, this.f);
    zapg localzapg = zapg.a(localzapm, this.g, false);
    String str1 = "/subscriptions/{id}/items";
    str1 = str1.replace("{format}", "json").replaceAll("\\*", "");
    String str2 = "PUT";
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    str1 = str1.replace("{id}", zapg.a(paramLong));
    str1 = str1.replaceAll("\\{\\w*\\}", "");
    String str3 = b(paramList);
    String str4 = localzapg.a(str1, str2, localHashMap1, str3, localHashMap2);
  }
  
  private Subscription a(Node paramNode)
  {
    Subscription localSubscription = new Subscription();
    NodeList localNodeList1 = paramNode.getChildNodes();
    for (int n = 0; n < localNodeList1.getLength(); n++)
    {
      Node localNode1 = localNodeList1.item(n);
      if (localNode1.getNodeName().equals("product_id"))
      {
        localSubscription.setProduct_id(Long.valueOf(Long.parseLong(localNode1.getTextContent())));
      }
      else if (localNode1.getNodeName().equals("pricing_plan_id"))
      {
        localSubscription.setPricing_plan_id(Long.valueOf(Long.parseLong(localNode1.getTextContent())));
      }
      else if (localNode1.getNodeName().equals("product"))
      {
        Product localProduct = new Product();
        localSubscription.setProduct(localProduct);
        NodeList localNodeList2 = localNode1.getChildNodes();
        for (int i1 = 0; i1 < localNodeList2.getLength(); i1++)
        {
          Node localNode2 = localNodeList2.item(i1);
          if (localNode2.getNodeName().equals("id"))
          {
            localProduct.setId(Long.valueOf(Long.parseLong(localNode2.getTextContent())));
          }
          else if (localNode2.getNodeName().equals("name"))
          {
            localProduct.setName(localNode2.getTextContent());
          }
          else if (localNode2.getNodeName().equals("pricing_plans"))
          {
            NodeList localNodeList3 = localNode2.getChildNodes();
            for (int i2 = 0; i2 < localNodeList3.getLength(); i2++)
            {
              Node localNode3 = localNodeList3.item(i2);
              PricingPlan localPricingPlan = new PricingPlan();
              localProduct.getPricing_plans().add(localPricingPlan);
              NodeList localNodeList4 = localNode3.getChildNodes();
              for (int i3 = 0; i3 < localNodeList4.getLength(); i3++)
              {
                Node localNode4 = localNodeList4.item(i3);
                if (localNode4.getNodeName().equals("id"))
                {
                  localPricingPlan.setId(Long.valueOf(Long.parseLong(localNode4.getTextContent())));
                }
                else if (localNode4.getNodeName().equals("name"))
                {
                  localPricingPlan.setName(localNode4.getTextContent());
                }
                else if (localNode4.getNodeName().equals("product_items"))
                {
                  NodeList localNodeList5 = localNode4.getChildNodes();
                  for (int i4 = 0; i4 < localNodeList5.getLength(); i4++)
                  {
                    Node localNode5 = localNodeList5.item(i4);
                    ProductItem localProductItem = new ProductItem();
                    localPricingPlan.getProduct_items().add(localProductItem);
                    NodeList localNodeList6 = localNode5.getChildNodes();
                    for (int i5 = 0; i5 < localNodeList6.getLength(); i5++)
                    {
                      Node localNode6 = localNodeList6.item(i5);
                      if (localNode6.getNodeName().equals("id")) {
                        localProductItem.setId(Long.valueOf(Long.parseLong(localNode6.getTextContent())));
                      } else if (localNode6.getNodeName().equals("name")) {
                        localProductItem.setName(localNode6.getTextContent());
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      else if (localNode1.getNodeName().equals("subscription_items"))
      {
        localSubscription.setSubscription_items(b(localNode1));
      }
      else if (localNode1.getNodeName().equals("id"))
      {
        localSubscription.setId(Long.valueOf(Long.parseLong(localNode1.getTextContent())));
      }
      else if (localNode1.getNodeName().equals("status"))
      {
        localSubscription.setStatus(localNode1.getTextContent());
      }
    }
    return localSubscription;
  }
  
  private List<SubscriptionItem> b(Node paramNode)
  {
    ArrayList localArrayList = new ArrayList();
    NodeList localNodeList1 = paramNode.getChildNodes();
    for (int n = 0; n < localNodeList1.getLength(); n++)
    {
      Node localNode1 = localNodeList1.item(n);
      SubscriptionItem localSubscriptionItem = new SubscriptionItem();
      localArrayList.add(localSubscriptionItem);
      NodeList localNodeList2 = localNode1.getChildNodes();
      for (int i1 = 0; i1 < localNodeList2.getLength(); i1++)
      {
        Node localNode2 = localNodeList2.item(i1);
        if (localNode2.getNodeName().equals("subscription_id")) {
          localSubscriptionItem.setSubscription_id(Long.valueOf(Long.parseLong(localNode2.getTextContent())));
        } else if (localNode2.getNodeName().equals("product_item_id")) {
          localSubscriptionItem.setProduct_item_id(Long.valueOf(Long.parseLong(localNode2.getTextContent())));
        } else if (localNode2.getNodeName().equals("quantity")) {
          localSubscriptionItem.setQuantity(Double.valueOf(Double.parseDouble(localNode2.getTextContent())));
        } else if (localNode2.getNodeName().equals("description")) {
          localSubscriptionItem.setDescription(localNode2.getTextContent());
        } else if (localNode2.getNodeName().equals("name")) {
          localSubscriptionItem.setName(localNode2.getTextContent());
        } else if (localNode2.getNodeName().equals("unit_name")) {
          localSubscriptionItem.setUnit_name(localNode2.getTextContent());
        } else if (localNode2.getNodeName().equals("is_quantity_accumulated")) {
          localSubscriptionItem.setIs_quantity_accumulated(Boolean.valueOf(Boolean.parseBoolean(localNode2.getTextContent())));
        }
      }
    }
    return localArrayList;
  }
  
  private String b(List<SubscriptionItem> paramList)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<subscription_items_list xmlns:i=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"v1.1\">");
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      SubscriptionItem localSubscriptionItem = (SubscriptionItem)localIterator.next();
      localStringBuilder.append("<subscription_item>");
      if (localSubscriptionItem.getDescription() != null) {
        localStringBuilder.append("<description>" + localSubscriptionItem.getDescription() + "</description>");
      } else {
        localStringBuilder.append("<description i:nil=\"true\" />");
      }
      localStringBuilder.append("<is_quantity_accumulated>" + String.valueOf(localSubscriptionItem.getIs_quantity_accumulated()) + "</is_quantity_accumulated>");
      if (localSubscriptionItem.getName() != null) {
        localStringBuilder.append("<name>" + localSubscriptionItem.getName() + "</name>");
      } else {
        localStringBuilder.append("<name i:nil=\"true\" />");
      }
      localStringBuilder.append("<product_item_id>" + String.valueOf(localSubscriptionItem.getProduct_item_id()) + "</product_item_id>");
      localStringBuilder.append("<quantity>" + String.valueOf(localSubscriptionItem.getQuantity()) + "</quantity>");
      localStringBuilder.append("<subscription_id>" + String.valueOf(localSubscriptionItem.getSubscription_id()) + "</subscription_id>");
      if (localSubscriptionItem.getUnit_name() != null) {
        localStringBuilder.append("<unit_name>" + localSubscriptionItem.getUnit_name() + "</unit_name>");
      } else {
        localStringBuilder.append("<unit_name i:nil=\"true\" />");
      }
      localStringBuilder.append("<update_history />");
      localStringBuilder.append("</subscription_item>");
    }
    localStringBuilder.append("</subscription_items_list>");
    return localStringBuilder.toString();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zapi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */