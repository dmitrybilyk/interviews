package com.learn.velocity.test;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class TestVelocity {

  public static void main(String[] args) throws Exception {
  Velocity.init();
//  Template template = Velocity.getTemplate("./src/main/resources/velocity/test/email-orderConfirmationBody.vm");
  Template template = Velocity.getTemplate("./src/main/resources/velocity/test/email-orderEmailFulfillmentBody.vm");

  VelocityContext context = new VelocityContext();
      Bonus bonus = new Bonus();
      bonus.setName("bonus 1");

      Bonus bonus2 = new Bonus();
      bonus2.setName("bonus 2");

      List<Bonus> bonusList = new ArrayList<Bonus>();
      bonusList.add(bonus);
      bonusList.add(bonus2);


  Context infoContext = new Context();
      infoContext.setBonusList(bonusList);
      infoContext.setMiles("  ");

      AddressModel invoiceAddress = new AddressModel();
      invoiceAddress.set_town("town");
      invoiceAddress.set_title2("title");
      invoiceAddress.set_postalcode("postalCode");
      invoiceAddress.setFirstname("firstNaaame");
      invoiceAddress.setLastname("lastNaaame");
      invoiceAddress.set_line1("line1");
      invoiceAddress.set_line2("line2");
      invoiceAddress.setTitle(TitleEnum.MR);

      infoContext.setInvoiceAddress(invoiceAddress);

      AddressModel deliveryAddress = new AddressModel();
      deliveryAddress.set_town("town");
      deliveryAddress.set_title2("title");
      deliveryAddress.set_postalcode("postalCode");
      deliveryAddress.setFirstname("deliveryfirstNaaame");
      deliveryAddress.setLastname("lastNaaame");
      deliveryAddress.set_line1("line1");
      deliveryAddress.set_line2("line2");
      deliveryAddress.setTitle(TitleEnum.MR);

      infoContext.setInvoiceAddress(invoiceAddress);

  infoContext.setHasToBeDeliveredProducts(true);
//  infoContext.setHasToBeDeliveredProducts(false);
  context.put("ctx", infoContext);

  Writer writer = new StringWriter();
  template.merge(context, writer);

  System.out.println(writer);
  }
}