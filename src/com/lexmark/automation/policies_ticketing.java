package com.lexmark.automation;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.lexmark.automation.login;
@Test
public class policies_ticketing{
	WebElement policy;
	WebElement clickOnAllGroup;
	WebDriverWait allgroups_wait;
    
  public void checkAllServicePolicies() throws Exception {
  
  login l=new login();
  l.authenticateLogin();    
  Actions builder_cover_open=new Actions(l.driver);
  builder_cover_open.sendKeys(Keys.ENTER);
  //Action submit_cover_open=builder_cover_open.build();
  WebDriverWait wait_policy_tab_occurence= new WebDriverWait(l.driver, 30);
  wait_policy_tab_occurence.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("/html/body/div[3]/div[2]/div/div/div/div[2]/div/div[5]/em/button")));
  policy=l.driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div[2]/div/div[5]/em/button"));
  policy.click();
  allgroups_wait=new WebDriverWait(l.driver,30);
  allgroups_wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("All Groups")));
  clickOnAllGroup=l.driver.findElement(By.linkText("All Groups"));
  clickOnAllGroup.click();
  Thread.sleep(2000);
  //  COVER OPEN //
  
  WebDriverWait cover_open_wait_elem=new WebDriverWait(l.driver,30);
  cover_open_wait_elem.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Cover Open")));
  WebElement cover_open =l.driver.findElement(By.linkText("Cover Open"));
  Thread.sleep(2000);
  cover_open.click();
  boolean b1=l.driver.findElement(By.id("editPolicyForm_notes-inputEl")).isEnabled();
  WebElement cover_open_ticket_creation=l.driver.findElement(By.id("editPolicyForm_generateTicket-inputEl"));
  if(b1==false)
  {
	  Thread.sleep(2000);
  cover_open_ticket_creation.click();
  }
  //WebElement cover_open_notes=l.driver.findElement(By.id("editPolicyForm_notes-inputEl"));
  //cover_open_notes.sendKeys(Keys.TAB);
  //submit_cover_open.perform();
  Thread.sleep(2000);
 WebElement e1=l.driver.findElement(By.xpath("//span[text()='Ok']/../../.."));
 e1.click();
 Thread.sleep(2000); 
 // DOOR OPEN //
  
  WebDriverWait door_open_wait_elem=new WebDriverWait(l.driver,30);
  door_open_wait_elem.until(ExpectedConditions.elementToBeClickable(By.linkText("Door Open")));
  System.out.println("sourav");
  WebElement door_open =l.driver.findElement(By.linkText("Door Open"));
  Thread.sleep(2000);
  door_open.click();
  boolean b2=l.driver.findElement(By.id("editPolicyForm_notes-inputEl")).isEnabled();
  WebElement door_open_ticket_creation=l.driver.findElement(By.id("editPolicyForm_generateTicket-inputEl"));
  if(b2==false)
  {
  Thread.sleep(2000);
  door_open_ticket_creation.click();
  }
 // WebElement door_open_notes=l.driver.findElement(By.id("editPolicyForm_notes-inputEl"));
  //door_open_notes.sendKeys(Keys.TAB);
  //submit_cover_open.perform();
  Thread.sleep(2000);
  WebElement e2=l.driver.findElement(By.xpath("//span[text()='Ok']/../../.."));
  e2.click();
  Thread.sleep(2000);
  // DEVICE DOWN //
  
  WebDriverWait device_down_wait=new WebDriverWait(l.driver,30);
  device_down_wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Device Down")));
  WebElement device_down=l.driver.findElement(By.linkText("Device Down"));
  Thread.sleep(2000);
  device_down.click();
  boolean b3=l.driver.findElement(By.id("editPolicyForm_notes-inputEl")).isEnabled();
  WebElement device_down_ticket_creation=l.driver.findElement(By.id("editPolicyForm_generateTicket-inputEl"));
  if(b3==false)
  {
  Thread.sleep(2000);	  
  device_down_ticket_creation.click();
  }
  //WebElement device_down_notes=l.driver.findElement(By.id("editPolicyForm_notes-inputEl"));
  //device_down_notes.sendKeys(Keys.TAB);
  //submit_cover_open.perform();
  Thread.sleep(2000);
  WebElement e3=l.driver.findElement(By.xpath("//span[text()='Ok']/../../.."));
  e3.click();
  Thread.sleep(2000);
  // INPUT TRAY EMPTY //
   
  WebDriverWait input_tray_empty_wait=new WebDriverWait(l.driver,30);
  input_tray_empty_wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Input Tray Empty")));
  WebElement input_tray_empty=l.driver.findElement(By.linkText("Input Tray Empty"));
  Thread.sleep(2000);
  input_tray_empty.click();
  boolean b4=l.driver.findElement(By.id("editPolicyForm_notes-inputEl")).isEnabled();
  WebElement input_tray_empty_ticket_creation=l.driver.findElement(By.id("editPolicyForm_generateTicket-inputEl"));
  if(b4==false)
  {
	  Thread.sleep(2000);
   input_tray_empty_ticket_creation.click();
  }
 /* WebElement input_tray_empty_notes=l.driver.findElement(By.id("editPolicyForm_notes-inputEl"));
  input_tray_empty_notes.sendKeys(Keys.TAB);
  submit_cover_open.perform();*/
  Thread.sleep(2000);
  WebElement e4=l.driver.findElement(By.xpath("//span[text()='Ok']/../../.."));
  e4.click();
  Thread.sleep(2000);

  // Input Tray Missing //
  
  WebDriverWait input_tray_missing_wait=new WebDriverWait(l.driver,30);
  input_tray_missing_wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Input Tray Missing")));
  WebElement input_tray_missing=l.driver.findElement(By.linkText("Input Tray Missing"));
  Thread.sleep(2000);
  input_tray_missing.click();
  boolean b5=l.driver.findElement(By.id("editPolicyForm_notes-inputEl")).isEnabled();
  WebElement input_tray_missing_ticket_creation=l.driver.findElement(By.id("editPolicyForm_generateTicket-inputEl"));
  if(b5==false)
  {
	  Thread.sleep(2000);
  input_tray_missing_ticket_creation.click();
  }
  //WebElement input_tray_missing_notes=l.driver.findElement(By.id("editPolicyForm_notes-inputEl"));
  //input_tray_missing_notes.sendKeys(Keys.TAB);
  //submit_cover_open.perform(); 
  Thread.sleep(2000);
  WebElement e5=l.driver.findElement(By.xpath("//span[text()='Ok']/../../.."));
  e5.click();
  Thread.sleep(2000);
  //Device Jammed //
  
  WebDriverWait Device_jammed_wait=new WebDriverWait(l.driver,30);
  Device_jammed_wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Device Jammed")));
  WebElement device_jammed=l.driver.findElement(By.linkText("Device Jammed"));
  Thread.sleep(2000);
  device_jammed.click();
  boolean b6=l.driver.findElement(By.id("editPolicyForm_notes-inputEl")).isEnabled();
  WebElement device_jammed_ticket_creation=l.driver.findElement(By.id("editPolicyForm_generateTicket-inputEl"));
  if(b6==false)
  {
	  Thread.sleep(2000);
  device_jammed_ticket_creation.click();
  }
 // WebElement device_jammed_notes=l.driver.findElement(By.id("editPolicyForm_notes-inputEl"));
 // device_jammed_notes.sendKeys(Keys.TAB);
  //submit_cover_open.perform();
  Thread.sleep(2000);
  WebElement e6=l.driver.findElement(By.xpath("//span[text()='Ok']/../../.."));
  e6.click();
  Thread.sleep(2000);
  //Marker Supply Missing//
  
  WebDriverWait marker_supply_missing_wait=new WebDriverWait(l.driver,30);
  marker_supply_missing_wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Marker Supply Missing")));
  WebElement marker_supply_missing=l.driver.findElement(By.linkText("Marker Supply Missing"));
  Thread.sleep(2000);
  marker_supply_missing.click();
  boolean b7=l.driver.findElement(By.id("editPolicyForm_notes-inputEl")).isEnabled();
  WebElement marker_supply_missing_ticket_creation=l.driver.findElement(By.id("editPolicyForm_generateTicket-inputEl"));
  if(b7==false)
  {
  Thread.sleep(2000);
  marker_supply_missing_ticket_creation.click();
  }
  //WebElement marker_supply_missing_notes=l.driver.findElement(By.id("editPolicyForm_notes-inputEl"));
  //marker_supply_missing_notes.sendKeys(Keys.TAB);
  //submit_cover_open.perform(); 
  Thread.sleep(2000);
  WebElement e7=l.driver.findElement(By.xpath("//span[text()='Ok']/../../.."));
  e7.click();
  Thread.sleep(2000);
  // Device Offline//
  
  WebDriverWait device_offline_wait=new WebDriverWait(l.driver,30);
  device_offline_wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Device Offline")));
  WebElement device_offline=l.driver.findElement(By.linkText("Device Offline"));
  Thread.sleep(2000);
  device_offline.click();
  boolean b8=l.driver.findElement(By.id("editPolicyForm_notes-inputEl")).isEnabled();
  WebElement device_offline_ticket_creation=l.driver.findElement(By.id("editPolicyForm_generateTicket-inputEl"));
  if(b8==false)
  {
	  Thread.sleep(2000);
  device_offline_ticket_creation.click();
  }
  //WebElement device_offline_notes=l.driver.findElement(By.id("editPolicyForm_notes-inputEl"));
  //device_offline_notes.sendKeys(Keys.TAB);
  //submit_cover_open.perform();
 
  Thread.sleep(2000);
  WebElement e8=l.driver.findElement(By.xpath("//span[text()='Ok']/../../.."));
  e8.click();
  Thread.sleep(2000);
  // Output full// 

  /*WebDriverWait output_full_wait=new WebDriverWait(l.driver,30);
   output_full_wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("0utput Full")));
   WebElement output_full=l.driver.findElement(By.linkText("0utput Full"));
   Thread.sleep(2000);
   output_full.click();
   boolean b9=l.driver.findElement(By.id("editPolicyForm_notes-inputEl")).isEnabled();
   WebElement output_full_ticket_creation=l.driver.findElement(By.id("editPolicyForm_generateTicket-inputEl"));
   if(b9==false)
   {
  Thread.sleep(2000);
  output_full_ticket_creation.click();
   }
   //WebElement output_full_notes=l.driver.findElement(By.id("editPolicyForm_notes-inputEl"));
   //output_full_notes.sendKeys(Keys.TAB);
 // submit_cover_open.perform();

   Thread.sleep(2000);
   WebElement e9=l.driver.findElement(By.xpath("//span[text()='Ok']/../../.."));
   e9.click();
   Thread.sleep(2000);*/

  // Output Near Full//
    
    //l.driver.manage().deleteAllCookies();
    WebDriverWait output_near_full_wait=new WebDriverWait(l.driver,30);
    output_near_full_wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Output Near Full")));
    WebElement output_near_full= l.driver.findElement(By.linkText("Output Near Full"));
    Thread.sleep(2000);
    output_near_full.click();
    boolean b10=l.driver.findElement(By.id("editPolicyForm_notes-inputEl")).isEnabled();
    WebElement output_near_full_ticket_creation=l.driver.findElement(By.id("editPolicyForm_generateTicket-inputEl"));
    if(b10==false)
    {
    Thread.sleep(2000);
    output_near_full_ticket_creation.click();
    }
  //  WebElement output_near_full_notes=l.driver.findElement(By.id("editPolicyForm_notes-inputEl"));
  //  output_near_full_notes.sendKeys(Keys.TAB);
  //  submit_cover_open.perform();
    
    Thread.sleep(2000);
    WebElement e10=l.driver.findElement(By.xpath("//span[text()='Ok']/../../.."));
    e10.click();
    Thread.sleep(2000);
    //Output Tray Missing//
    
    WebDriverWait output_tray_missing_wait=new WebDriverWait(l.driver,30);
    output_tray_missing_wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Output Tray Missing")));
    WebElement output_tray_missing=l.driver.findElement(By.linkText("Output Tray Missing"));
   Thread.sleep(2000);
    output_tray_missing.click();
    boolean b11=l.driver.findElement(By.id("editPolicyForm_notes-inputEl")).isEnabled();
    WebElement output_tray_missing_ticket_creation=l.driver.findElement(By.id("editPolicyForm_generateTicket-inputEl"));
    if(b11==false)
    {
    	Thread.sleep(2000);
    output_tray_missing_ticket_creation.click();
    }
   // WebElement output_tray_missing_notes=l.driver.findElement(By.id("editPolicyForm_notes-inputEl"));
   // output_tray_missing_notes.sendKeys(Keys.TAB);
 //   submit_cover_open.perform();
    Thread.sleep(2000);
    WebElement e11=l.driver.findElement(By.xpath("//span[text()='Ok']/../../.."));
    e11.click();
    Thread.sleep(2000);
    // Overdue Maintenance//
    
    WebDriverWait overdue_maintenance_wait=new WebDriverWait(l.driver,30);
    overdue_maintenance_wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Overdue Maintenance")));
    WebElement overdue_maintenance=l.driver.findElement(By.linkText("Overdue Maintenance"));
   Thread.sleep(2000);
    overdue_maintenance.click();
    boolean b12=l.driver.findElement(By.id("editPolicyForm_notes-inputEl")).isEnabled();
    WebElement overdue_maintenance_ticket_creation=l.driver.findElement(By.id("editPolicyForm_generateTicket-inputEl"));
    if(b12==false)
    {
    	Thread.sleep(2000);
     overdue_maintenance_ticket_creation.click();
    }
    // WebElement overdue_maintenance_notes=l.driver.findElement(By.id("editPolicyForm_notes-inputEl"));
    //overdue_maintenance_notes.sendKeys(Keys.TAB);
  //  submit_cover_open.perform();
    Thread.sleep(2000);
    WebElement e12=l.driver.findElement(By.xpath("//span[text()='Ok']/../../.."));
    e12.click();
    Thread.sleep(2000);
    // Service Requested//
    
    WebDriverWait service_requested_wait=new WebDriverWait(l.driver,30);
    service_requested_wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Service Requested")));
    WebElement service_requested=l.driver.findElement(By.linkText("Service Requested"));
    Thread.sleep(2000);
    service_requested.click();
    boolean b13=l.driver.findElement(By.id("editPolicyForm_notes-inputEl")).isEnabled();
    WebElement service_requested_ticket_creation=l.driver.findElement(By.id("editPolicyForm_generateTicket-inputEl"));
    if(b13==false)
    {
    	Thread.sleep(2000);
    service_requested_ticket_creation.click();
    }
   // WebElement service_requested_notes=l.driver.findElement(By.id("editPolicyForm_notes-inputEl"));
   // service_requested_notes.sendKeys(Keys.TAB);
   // submit_cover_open.perform();
    Thread.sleep(2000);
    WebElement e13=l.driver.findElement(By.xpath("//span[text()='Ok']/../../.."));
    e13.click();
    Thread.sleep(2000);
    
  //Maintenance tickets //
    
    WebElement maintenance=l.driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div[2]/div/div[2]/em"));
    maintenance.click();
    Thread.sleep(2000);
    //Clean Device//
    WebDriverWait clean_dev_wait=new WebDriverWait(l.driver, 30);
    clean_dev_wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Clean Device")));
    WebElement clean_dev=l.driver.findElement(By.linkText("Clean Device"));
    Thread.sleep(2000);
    clean_dev.click();
    boolean m1=l.driver.findElement(By.id("editPolicyForm_scheduleEventByDate-inputEl")).isEnabled();
    WebElement clean_dev_schedule_initial_event=l.driver.findElement(By.id("editPolicyForm_scheduleEvent-inputEl"));
    if(m1==false)
    {
    	
    Thread.sleep(2000);
    clean_dev_schedule_initial_event.click();
    }
    l.driver.findElement(By.xpath("/html/body/div[10]/div[2]/div/div/div/div[2]/div/div[2]/em")).click();
    boolean m2= l.driver.findElement(By.id("editPolicyForm_notes-inputEl")).isEnabled();
    WebElement clean_dev_ticket_creation=l.driver.findElement(By.id("editPolicyForm_generateTicket-inputEl"));
    if(m2==false)
    {
    	Thread.sleep(2000);
    
    clean_dev_ticket_creation.click();
    }
    //WebElement clean_dev_notes=l.driver.findElement(By.id("editPolicyForm_notes-inputEl"));
    //clean_dev_notes.sendKeys(Keys.TAB);
    //submit_cover_open.perform();
  	
    Thread.sleep(2000);
    WebElement e20=l.driver.findElement(By.xpath("//span[text()='Ok']/../../.."));
    e20.click();
    Thread.sleep(2000);
    // Replace Fuser//
    
    WebDriverWait replace_fuser_wait=new WebDriverWait(l.driver,30);
    replace_fuser_wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Replace Fuser")));
    WebElement replace_fuser=l.driver.findElement(By.linkText("Replace Fuser"));
   Thread.sleep(2000);
    replace_fuser.click();
    boolean m3=l.driver.findElement(By.id("editPolicyForm_scheduleEventByDate-inputEl")).isEnabled();
    WebElement replace_fuser_schedule_initial_event=l.driver.findElement(By.id("editPolicyForm_scheduleEvent-inputEl"));
    if(m3==false)
    {
    	Thread.sleep(2000);
    replace_fuser_schedule_initial_event.click();
    }
    l.driver.findElement(By.xpath("/html/body/div[10]/div[2]/div/div/div/div[2]/div/div[2]/em")).click();
    boolean m4= l.driver.findElement(By.id("editPolicyForm_notes-inputEl")).isEnabled();
    WebElement replace_fuser_ticket_creation=l.driver.findElement(By.id("editPolicyForm_generateTicket-inputEl"));
    if(m4==false)
    {
    	Thread.sleep(2000);
    
    replace_fuser_ticket_creation.click();
  }
    //WebElement replace_fuser_notes=l.driver.findElement(By.id("editPolicyForm_notes-inputEl"));
    //replace_fuser_notes.sendKeys(Keys.TAB);
    //submit_cover_open.perform();
    Thread.sleep(2000);
    WebElement e21=l.driver.findElement(By.xpath("//span[text()='Ok']/../../.."));
    e21.click();
    Thread.sleep(2000);
    
    //Replace Maintenance Kit//
    
    WebDriverWait replace_maintanance =new WebDriverWait(l.driver,30);
    replace_maintanance.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Replace Maintenance Kit")));
    WebElement replace_kit=l.driver.findElement(By.linkText("Replace Maintenance Kit"));
    Thread.sleep(2000);
    replace_kit.click();
    boolean m5=l.driver.findElement(By.id("editPolicyForm_scheduleEventByDate-inputEl")).isEnabled();
    WebElement replace_kit_schedule_initial_event=l.driver.findElement(By.id("editPolicyForm_scheduleEvent-inputEl"));
    if(m5==false)
    {
    	Thread.sleep(2000);
    replace_kit_schedule_initial_event.click();
    }
    l.driver.findElement(By.xpath("/html/body/div[10]/div[2]/div/div/div/div[2]/div/div[2]/em")).click();
    boolean m6=l.driver.findElement(By.id("editPolicyForm_notes-inputEl")).isEnabled();
    WebElement replace_kit_ticket_creation=l.driver.findElement(By.id("editPolicyForm_generateTicket-inputEl"));
    if(m6==false)
    {
    	Thread.sleep(2000);
    replace_kit_ticket_creation.click();
    }
    //WebElement replace_kit_notes=l.driver.findElement(By.id("editPolicyForm_notes-inputEl"));
    //replace_kit_notes.sendKeys(Keys.TAB);
    //submit_cover_open.perform();
    
    Thread.sleep(2000);
    WebElement e22=l.driver.findElement(By.xpath("//span[text()='Ok']/../../.."));
    e22.click();
    Thread.sleep(2000);
    //Replace Device//
    
    WebDriverWait replace_dev =new WebDriverWait(l.driver,30);
    replace_dev.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Replace Device")));
    WebElement replace_device=l.driver.findElement(By.linkText("Replace Device"));
    Thread.sleep(2000);
    replace_device.click();
    boolean m7=l.driver.findElement(By.id("editPolicyForm_scheduleEventByDate-inputEl")).isEnabled();
    WebElement replace_dev_schedule_initial_event=l.driver.findElement(By.id("editPolicyForm_scheduleEvent-inputEl"));
    if(m7==false)
    {
    	Thread.sleep(2000);
    replace_dev_schedule_initial_event.click();
    }
    l.driver.findElement(By.xpath("/html/body/div[10]/div[2]/div/div/div/div[2]/div/div[2]/em")).click();
    boolean m8=l.driver.findElement(By.id("editPolicyForm_notes-inputEl")).isEnabled();
    WebElement replace_dev_ticket_creation=l.driver.findElement(By.id("editPolicyForm_generateTicket-inputEl"));
    if(m8==false)
    {
    	Thread.sleep(2000);
    replace_dev_ticket_creation.click();
    }
    //WebElement replace_dev_notes=l.driver.findElement(By.id("editPolicyForm_notes-inputEl"));
    //replace_dev_notes.sendKeys(Keys.TAB);
    //submit_cover_open.perform();
    
    Thread.sleep(2000);
    WebElement e23=l.driver.findElement(By.xpath("//span[text()='Ok']/../../.."));
    e23.click();
    Thread.sleep(2000);
    //Replace Toner//
    
    WebDriverWait replace_toner =new WebDriverWait(l.driver,30);
    replace_toner.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Replace Toner")));
    WebElement replace_toner_dup=l.driver.findElement(By.linkText("Replace Toner"));
    Thread.sleep(2000);
    replace_toner_dup.click();
    boolean m9=l.driver.findElement(By.id("editPolicyForm_scheduleEventByDate-inputEl")).isEnabled();
    WebElement replace_toner_schedule_initial_event=l.driver.findElement(By.id("editPolicyForm_scheduleEvent-inputEl"));
    if(m9==false)
    {
    	Thread.sleep(2000);
    
    replace_toner_schedule_initial_event.click();
    }
    l.driver.findElement(By.xpath("/html/body/div[10]/div[2]/div/div/div/div[2]/div/div[2]/em")).click();
    boolean m10=l.driver.findElement(By.id("editPolicyForm_notes-inputEl")).isEnabled();
    WebElement replace_toner_ticket_creation=l.driver.findElement(By.id("editPolicyForm_generateTicket-inputEl"));
    if(m10==false)
    {
    	Thread.sleep(2000);
    
    replace_toner_ticket_creation.click();
    
    }
    //WebElement replace_toner_notes=l.driver.findElement(By.id("editPolicyForm_notes-inputEl"));
    //replace_toner_notes.sendKeys(Keys.TAB);
    //submit_cover_open.perform();
    Thread.sleep(2000);
    WebElement e24=l.driver.findElement(By.xpath("//span[text()='Ok']/../../.."));
    e24.click();
    Thread.sleep(2000);
    //Supplies tickets //
   
    WebElement supplies=l.driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div[2]/div/div[3]/em"));
    supplies.click();
    Thread.sleep(2000);
   //Paper Low//
   WebDriverWait paper_low_wait=new WebDriverWait(l.driver,30);
   paper_low_wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Paper Low")));
   WebElement paper_low=l.driver.findElement(By.linkText("Paper Low"));
   Thread.sleep(2000);
   paper_low.click();
	   boolean s1=l.driver.findElement(By.id("editPolicyForm_notes-inputEl")).isEnabled();
   WebElement paper_low_ticket_creation=l.driver.findElement(By.id("editPolicyForm_generateTicket-inputEl"));
   if(s1==false)
   {
   Thread.sleep(20000);   
   paper_low_ticket_creation.click();
   }
  // WebElement paper_low_notes=l.driver.findElement(By.id("editPolicyForm_notes-inputEl"));
  // paper_low_notes.sendKeys(Keys.TAB);
   //submit_cover_open.perform();
   Thread.sleep(2000);
   WebElement e30=l.driver.findElement(By.xpath("//span[text()='Ok']/../../.."));
   e30.click();
   Thread.sleep(2000);
   // Paper Out//
   
   WebDriverWait paper_out_wait=new WebDriverWait(l.driver, 30);
   paper_out_wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Paper Out")));
   WebElement paper_out=l.driver.findElement(By.linkText("Paper Out"));
   Thread.sleep(2000);
   paper_out.click();
   boolean s2=l.driver.findElement(By.id("editPolicyForm_notes-inputEl")).isEnabled();
   WebElement paper_out_ticket_creation=l.driver.findElement(By.id("editPolicyForm_generateTicket-inputEl"));
   if(s2==false)
   {
	   Thread.sleep(2000);
   paper_out_ticket_creation.click();
   }
  // WebElement paper_out_notes=l.driver.findElement(By.id("editPolicyForm_notes-inputEl"));
  // paper_out_notes.sendKeys(Keys.TAB);
  // submit_cover_open.perform();
   Thread.sleep(2000);
   WebElement e31=l.driver.findElement(By.xpath("//span[text()='Ok']/../../.."));
   e31.click();
   Thread.sleep(2000);  
   //Photo Conductor Level Alert//
   
   WebDriverWait photo_conductor_wait=new WebDriverWait(l.driver,30);
   photo_conductor_wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Photo Conductor Level Alert")));
   WebElement photo_conductor= l.driver.findElement(By.linkText("Photo Conductor Level Alert"));
  Thread.sleep(2000);
   photo_conductor.click();
   boolean s3=l.driver.findElement(By.id("editPolicyForm_notes-inputEl")).isEnabled();
   WebElement photo_conductor_ticket_creation=l.driver.findElement(By.id("editPolicyForm_generateTicket-inputEl"));
   if(s3==false)
   {
	   Thread.sleep(2000);
   photo_conductor_ticket_creation.click();	
   }
  // WebElement photo_conductor_notes=l.driver.findElement(By.id("editPolicyForm_notes-inputEl"));
  // photo_conductor_notes.sendKeys(Keys.TAB);
  // submit_cover_open.perform();
   
   Thread.sleep(2000);
   WebElement e32=l.driver.findElement(By.xpath("//span[text()='Ok']/../../.."));
   e32.click();
   Thread.sleep(2000);
   //Toner Level Alert//
   
   WebDriverWait toner_level_alert_wait=new WebDriverWait(l.driver, 30);
   toner_level_alert_wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Toner Level Alert")));
   WebElement toner_level_alert=l.driver.findElement(By.linkText("Toner Level Alert"));
   Thread.sleep(2000);
   toner_level_alert.click();
   boolean s4=l.driver.findElement(By.id("editPolicyForm_notes-inputEl")).isEnabled();
   WebElement toner_level_ticket_creation=l.driver.findElement(By.id("editPolicyForm_generateTicket-inputEl"));
   if(s4==false)
   {
	   Thread.sleep(2000);
   toner_level_ticket_creation.click();
   }
  // WebElement toner_level_notes=l.driver.findElement(By.id("editPolicyForm_notes-inputEl"));
  // toner_level_notes.sendKeys(Keys.TAB);
  // submit_cover_open.perform();
   Thread.sleep(2000);
   WebElement e33=l.driver.findElement(By.xpath("//span[text()='Ok']/../../.."));
   e33.click();
   Thread.sleep(2000);
  //Toner Low//
   
   WebDriverWait toner_low_wait=new WebDriverWait(l.driver,30);
   toner_low_wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Toner Low")));
   WebElement toner_low=l.driver.findElement(By.linkText("Toner Low"));
   Thread.sleep(2000);
   toner_low.click();
   boolean s5=l.driver.findElement(By.id("editPolicyForm_notes-inputEl")).isEnabled();
   WebElement toner_low_ticket_creation=l.driver.findElement(By.id("editPolicyForm_generateTicket-inputEl"));
   if(s5==false)
   {
   Thread.sleep(2000);
   toner_low_ticket_creation.click();
   }
   //WebElement toner_low_notes=l.driver.findElement(By.id("editPolicyForm_notes-inputEl"));
   //toner_low_notes.sendKeys(Keys.TAB);
   //submit_cover_open.perform();
   Thread.sleep(2000);
   WebElement e34=l.driver.findElement(By.xpath("//span[text()='Ok']/../../.."));
   e34.click();
   Thread.sleep(2000);
   //Toner Out//
   
   WebDriverWait toner_out_wait=new WebDriverWait(l.driver,30);
   toner_out_wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Toner Out")));
   WebElement toner_out=l.driver.findElement(By.linkText("Toner Out"));
   Thread.sleep(2000);
   toner_out.click();
   boolean s6=l.driver.findElement(By.id("editPolicyForm_notes-inputEl")).isEnabled();
   WebElement toner_out_ticket_creation=l.driver.findElement(By.id("editPolicyForm_generateTicket-inputEl"));
   if(s6==false)
   {
	   Thread.sleep(2000);
  	 toner_out_ticket_creation.click();
   }
   //WebElement toner_out_notes=l.driver.findElement(By.id("editPolicyForm_notes-inputEl"));
   //toner_out_notes.sendKeys(Keys.TAB);
   //submit_cover_open.perform();
   
   Thread.sleep(2000);
   WebElement e35=l.driver.findElement(By.xpath("//span[text()='Ok']/../../.."));
   e35.click();
   Thread.sleep(2000);
   
   //Waste Toner Box Level Alert//
   
   WebDriverWait waste_wait=new WebDriverWait(l.driver,30);
   waste_wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Waste Toner Box Level Alert")));
   WebElement waste_toner=l.driver.findElement(By.linkText("Waste Toner Box Level Alert"));
   Thread.sleep(2000);
   waste_toner.click();
   boolean s7=l.driver.findElement(By.id("editPolicyForm_notes-inputEl")).isEnabled();
   WebElement waste_toner_ticket_creation=l.driver.findElement(By.id("editPolicyForm_generateTicket-inputEl"));
   if(s7==false)
   {
   Thread.sleep(2000);
   waste_toner_ticket_creation.click();
   }
  // WebElement waste_toner_notes=l.driver.findElement(By.id("editPolicyForm_notes-inputEl"));
  // waste_toner_notes.sendKeys(Keys.TAB);
  // submit_cover_open.perform();
   Thread.sleep(2000);
   WebElement e36=l.driver.findElement(By.xpath("//span[text()='Ok']/../../.."));
   e36.click();
   Thread.sleep(2000);	 
 
  }
}
