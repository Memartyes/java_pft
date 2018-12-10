package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class GroupCreationTest extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    gotoGroupCreation();
    initGroupCreation();
    fillGroupForm(new GroupData("Test", "test-header", "test-footer"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
